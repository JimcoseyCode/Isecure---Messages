package com.ov.message

import android.app.Activity
import android.app.role.RoleManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.provider.Telephony
import android.telephony.SmsManager
import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.modules.core.DeviceEventManagerModule

/**
 * Native SMS transport. Sends via [SmsManager] (auto-splitting long bodies into
 * multipart) and surfaces incoming SMS to JS through the `onSmsReceived` event.
 *
 * ponytail: uses a dynamic SMS_RECEIVED receiver — delivers while the app is
 * alive, which is what an active chat needs. Full background receipt (and
 * suppressing the stock messaging app) requires becoming the *default SMS app*:
 * the 4-component SMS_DELIVER/WAP_PUSH/SENDTO/RESPOND contract plus writing to
 * the SMS provider. [requestSmsRole] opens that request; wire the remaining
 * components when background delivery is actually needed.
 */
class SmsModule(private val reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  private var receiver: BroadcastReceiver? = null

  override fun getName() = "SmsModule"

  override fun initialize() {
    super.initialize()
    registerReceiver()
  }

  override fun invalidate() {
    receiver?.let { runCatching { reactContext.unregisterReceiver(it) } }
    receiver = null
    super.invalidate()
  }

  private fun registerReceiver() {
    if (receiver != null) return
    val r = object : BroadcastReceiver() {
      override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action != Telephony.Sms.Intents.SMS_RECEIVED_ACTION) return
        // A multipart SMS arrives as several PDUs; concatenate parts by sender.
        val parts = Telephony.Sms.Intents.getMessagesFromIntent(intent) ?: return
        if (parts.isEmpty()) return
        val address = parts[0].originatingAddress ?: ""
        val body = parts.joinToString("") { it.messageBody ?: "" }
        val ts = parts[0].timestampMillis

        val map = Arguments.createMap()
        map.putString("address", address)
        map.putString("body", body)
        map.putDouble("date", ts.toDouble())
        map.putInt("type", 1) // received
        reactContext
          .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter::class.java)
          .emit("onSmsReceived", map)
      }
    }
    val filter = IntentFilter(Telephony.Sms.Intents.SMS_RECEIVED_ACTION)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
      reactContext.registerReceiver(r, filter, Context.RECEIVER_EXPORTED)
    } else {
      @Suppress("UnspecifiedRegisterReceiverFlag")
      reactContext.registerReceiver(r, filter)
    }
    receiver = r
  }

  /**
   * Read the active SIM subscriptions (dual-SIM aware) so onboarding can
   * pre-fill the user's number. `number` is best-effort — modern Android often
   * withholds it for privacy, so the UI must allow manual entry too.
   * Returns a JSON array string: [{slot, number, carrier, displayName}].
   */
  @ReactMethod
  fun getSimNumbers(promise: Promise) {
    try {
      val arr = Arguments.createArray()
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
        val sm = reactContext.getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE)
          as? android.telephony.SubscriptionManager
        val subs = try { sm?.activeSubscriptionInfoList } catch (_: SecurityException) { null }
        subs?.forEach { info ->
          val m = Arguments.createMap()
          m.putInt("slot", info.simSlotIndex)
          m.putString("number", (info.number ?: "").toString())
          m.putString("carrier", (info.carrierName ?: "").toString())
          m.putString("displayName", (info.displayName ?: "").toString())
          arr.pushMap(m)
        }
      }
      promise.resolve(arr)
    } catch (e: Throwable) {
      promise.reject("sim", e.message, e)
    }
  }

  private fun smsManager(): SmsManager =
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S)
      reactContext.getSystemService(SmsManager::class.java)
    else
      @Suppress("DEPRECATION") SmsManager.getDefault()

  @ReactMethod
  fun sendSms(phoneNumber: String, body: String, promise: Promise) {
    try {
      val sms = smsManager()
      val parts = sms.divideMessage(body) // handles GSM7/UCS2 length limits
      if (parts.size > 1) {
        sms.sendMultipartTextMessage(phoneNumber, null, parts, null, null)
      } else {
        sms.sendTextMessage(phoneNumber, null, body, null, null)
      }
      promise.resolve(true)
    } catch (e: Throwable) {
      promise.reject("sms_send", e.message, e)
    }
  }

  /**
   * Anti-screenshot: set/clear FLAG_SECURE on the activity window. Blocks
   * screenshots and hides the app in the recents/multitask preview.
   */
  @ReactMethod
  fun setScreenSecure(enabled: Boolean, promise: Promise) {
    val activity: Activity? = reactContext.currentActivity
    if (activity == null) { promise.reject("secure", "no activity"); return }
    activity.runOnUiThread {
      if (enabled) {
        activity.window.setFlags(
          android.view.WindowManager.LayoutParams.FLAG_SECURE,
          android.view.WindowManager.LayoutParams.FLAG_SECURE,
        )
      } else {
        activity.window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_SECURE)
      }
    }
    promise.resolve(true)
  }

  /** Whether this app currently holds the default-SMS role. */
  @ReactMethod
  fun isDefaultSmsApp(promise: Promise) {
    try {
      val held = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val rm = reactContext.getSystemService(RoleManager::class.java)
        rm?.isRoleHeld(RoleManager.ROLE_SMS) == true
      } else {
        Telephony.Sms.getDefaultSmsPackage(reactContext) == reactContext.packageName
      }
      promise.resolve(held)
    } catch (e: Throwable) { promise.reject("sms_role", e.message, e) }
  }

  /** Prompt the user to make this app the default SMS handler. */
  @ReactMethod
  fun requestSmsRole(promise: Promise) {
    try {
      val activity: Activity? = reactContext.currentActivity
      if (activity == null) { promise.reject("sms_role", "no activity"); return }
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val rm = reactContext.getSystemService(RoleManager::class.java)
        val intent = rm.createRequestRoleIntent(RoleManager.ROLE_SMS)
        activity.startActivityForResult(intent, 0)
      } else {
        val intent = Intent(Telephony.Sms.Intents.ACTION_CHANGE_DEFAULT)
        intent.putExtra(Telephony.Sms.Intents.EXTRA_PACKAGE_NAME, reactContext.packageName)
        activity.startActivity(intent)
      }
      promise.resolve(true)
    } catch (e: Throwable) { promise.reject("sms_role", e.message, e) }
  }

  /** Read the latest pairing SMS (OVPK: or OVB:) from the native SMS inbox */
  @ReactMethod
  fun readLatestPairingSms(promise: Promise) {
    try {
      reactContext.contentResolver.query(
        Telephony.Sms.CONTENT_URI,
        arrayOf("body"),
        "body LIKE 'OVPK:%' OR body LIKE 'OVB:%'",
        null,
        "date DESC LIMIT 1"
      ).use { c ->
        if (c != null && c.moveToFirst()) {
          promise.resolve(c.getString(0))
        } else {
          promise.resolve(null)
        }
      }
    } catch (e: Throwable) {
      promise.reject("read_sms", e.message, e)
    }
  }
}

