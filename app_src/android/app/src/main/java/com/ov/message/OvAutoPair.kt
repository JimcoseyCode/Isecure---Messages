package com.ov.message

import android.content.Context
import android.provider.Telephony
import android.telephony.SmsManager
import android.util.Log
import uniffi.ov_core.ovHybridRespond
import uniffi.ov_core.ovParseOvpk

/**
 * Native (no-Metro) OV pairing auto-responder used for calibration + real interop.
 * On launch it reads the newest incoming initiator pairing SMS (OVPK:<sess>:I:...),
 * runs the Rust ovHybridRespond (ML-KEM-768 + X25519 encapsulate + noble combine +
 * OV HKDF), logs every input under tag OVCAL, and sends the OVPK:<sess>:R:... reply.
 */
object OvAutoPair {
  private const val SELF = "+33634467686"

  fun run(ctx: Context) {
    try {
      val ovpk = readLatestOvpkI(ctx)
      if (ovpk == null) { Log.i("OVCAL", "no OVPK:I in SMS"); return }
      val pk = ovParseOvpk(ovpk)
      val o = ovHybridRespond(ovpk)
      Log.i("OVCAL", "PKPQ=" + pk.mlkemPkHex)
      Log.i("OVCAL", "PKEC=" + pk.x25519PkHex)
      Log.i("OVCAL", "SSPQ=" + o.ssPqHex)
      Log.i("OVCAL", "SSEC=" + o.ssEcHex)
      Log.i("OVCAL", "CT=" + o.cipherTextHex)
      Log.i("OVCAL", "ISECURE_SAS=" + o.sas)
      Log.i("OVCAL", "CONTACTKEY=" + o.contactKeyHex)
      val sm = ctx.getSystemService(SmsManager::class.java)
      val parts = sm.divideMessage(o.replySms)
      sm.sendMultipartTextMessage(SELF, null, parts, null, null)
      Log.i("OVCAL", "reply sent parts=" + parts.size + " session=" + pk.session)
    } catch (e: Throwable) {
      Log.e("OVCAL", "FAIL " + e.message, e)
    }
  }

  private fun readLatestOvpkI(ctx: Context): String? {
    return try {
      ctx.contentResolver.query(
        Telephony.Sms.CONTENT_URI,
        arrayOf("body"),
        "body LIKE 'OVPK:%:I:%'",
        null,
        "date DESC"
      ).use { c ->
        if (c != null && c.moveToFirst()) c.getString(0) else null
      }
    } catch (e: Throwable) { Log.e("OVCAL", "read sms fail " + e.message); null }
  }
}
