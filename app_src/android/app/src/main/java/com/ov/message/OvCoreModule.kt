package com.ov.message

import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.WritableArray
import com.facebook.react.bridge.WritableMap
import uniffi.ov_core.*

/**
 * JS bridge over the Rust `ov-core` crypto. Every call runs the audited
 * RustCrypto primitives (AES-256-GCM, X25519+ML-KEM-768, Argon2id) — no
 * JavaScript crypto, no homemade algorithms. All heavy work is offloaded off
 * the JS thread by React Native's module executor.
 */
class OvCoreModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName() = "OvCore"

  // Debug-only: surface the derived pairing contactKey to logcat so the message
  // codec can be validated against a real (contactKey, plaintext, ciphertext) triple.
  // No-op in release builds.
  private fun logContactKey(where: String, contactKeyHex: String, sas: String) {
    if (BuildConfig.DEBUG) {
      android.util.Log.i("OVKEY", "$where sas=$sas contactKey=$contactKeyHex")
    }
  }

  private fun bytes(arr: ReadableArray): ByteArray =
    ByteArray(arr.size()) { arr.getInt(it).toByte() }

  private fun bytesToArray(b: ByteArray): WritableArray {
    val out = Arguments.createArray()
    for (v in b) out.pushInt(v.toInt() and 0xFF)
    return out
  }

  @ReactMethod
  fun deriveFromPassword(password: String, saltHex: String?, promise: Promise) {
    try {
      val dk = deriveFromPassword(password, saltHex)
      val m = Arguments.createMap()
      m.putString("keyHex", dk.keyHex)
      m.putString("saltHex", dk.saltHex)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun deriveKeyPool(masterHex: String, count: Double, promise: Promise) {
    try {
      val pool = deriveKeyPool(masterHex, count.toUInt())
      val arr = Arguments.createArray()
      pool.forEach { arr.pushString(it) }
      promise.resolve(arr)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun deriveSas(sharedHex: String, promise: Promise) {
    try { promise.resolve(deriveSas(sharedHex)) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun randomKeyHex(promise: Promise) {
    try { promise.resolve(randomKeyHex()) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun sealMessage(poolKeyHex: String, keyIndex: Double, plaintext: String, promise: Promise) {
    try { promise.resolve(sealMessage(poolKeyHex, keyIndex.toUInt(), plaintext)) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun openMessage(poolKeyHex: String, payload: String, promise: Promise) {
    try { promise.resolve(openMessage(poolKeyHex, payload)) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun peekKeyIndex(payload: String, promise: Promise) {
    try { promise.resolve(peekKeyIndex(payload).toDouble()) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun splitIntoChunks(payload: String, msgId: String, maxLen: Double, promise: Promise) {
    try {
      val arr = Arguments.createArray()
      splitIntoChunks(payload, msgId, maxLen.toUInt()).forEach { arr.pushString(it) }
      promise.resolve(arr)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun parseChunk(sms: String, promise: Promise) {
    try {
      val c = parseChunk(sms)
      if (c == null) { promise.resolve(null); return }
      val m = Arguments.createMap()
      m.putString("msgId", c.msgId)
      m.putInt("seq", c.seq.toInt())
      m.putInt("total", c.total.toInt())
      m.putString("data", c.data)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun encryptFile(keyHex: String, content: ReadableArray, filename: String, promise: Promise) {
    try { promise.resolve(bytesToArray(encryptFile(keyHex, bytes(content), filename))) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun decryptFile(keyHex: String, ovBytes: ReadableArray, promise: Promise) {
    try {
      val d = decryptFile(keyHex, bytes(ovBytes))
      val m = Arguments.createMap()
      m.putArray("content", bytesToArray(d.content))
      m.putString("originalFilename", d.originalFilename)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  private fun pairingResult(r: PairingResult): WritableMap {
    val m = Arguments.createMap()
    m.putString("sharedKeyHex", r.sharedKeyHex)
    m.putString("sas", r.sas)
    if (r.sms != null) m.putString("sms", r.sms) else m.putNull("sms")
    return m
  }

  @ReactMethod
  fun startPairingA(promise: Promise) {
    try {
      val init = startPairingA()
      val m = Arguments.createMap()
      m.putString("keypairHex", init.keypairHex)
      m.putString("sms", init.sms)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun respondPairingB(aSms: String, promise: Promise) {
    try { promise.resolve(pairingResult(respondPairingB(aSms))) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun completePairingA(keypairHex: String, bSms: String, promise: Promise) {
    try { promise.resolve(pairingResult(completePairingA(keypairHex, bSms))) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  // ==== OV Message interop (ovcompat) ====================================

  @ReactMethod
  fun ovDeriveContactKey(sharedSecretHex: String, promise: Promise) {
    try {
      val r = ovDeriveContactKey(sharedSecretHex)
      val m = Arguments.createMap()
      m.putString("contactKeyHex", r.contactKeyHex)
      m.putString("sas", r.sas)
      logContactKey("ovDeriveContactKey", r.contactKeyHex, r.sas)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovDeriveCharset(base: String, seedA: String, seedB: String, promise: Promise) {
    try { promise.resolve(ovDeriveCharset(base, seedA, seedB)) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovParseOvpk(msg: String, promise: Promise) {
    try {
      val p = ovParseOvpk(msg)
      val m = Arguments.createMap()
      m.putString("session", p.session)
      m.putString("role", p.role)
      m.putString("mlkemPkHex", p.mlkemPkHex)
      m.putString("x25519PkHex", p.x25519PkHex)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovBuildOvpk(session: String, role: String, mlkemPkHex: String, x25519PkHex: String, promise: Promise) {
    try { promise.resolve(ovBuildOvpk(session, role, mlkemPkHex, x25519PkHex)) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovEncodeOv36(keyIndex: Double, payload: String, indexCharset: String, specialCharset: String, promise: Promise) {
    try { promise.resolve(ovEncodeOv36(keyIndex.toUInt(), payload, indexCharset, specialCharset)) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovHybridRespond(ovpkSms: String, promise: Promise) {
    try {
      val o = ovHybridRespond(ovpkSms)
      val m = Arguments.createMap()
      m.putString("replySms", o.replySms)
      m.putString("contactKeyHex", o.contactKeyHex)
      m.putString("sas", o.sas)
      m.putString("ssEcHex", o.ssEcHex)
      m.putString("ssPqHex", o.ssPqHex)
      m.putString("cipherTextHex", o.cipherTextHex)
      logContactKey("ovHybridRespond", o.contactKeyHex, o.sas)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovPairingAnnounce(ovpkMsg: String, promise: Promise) {
    try {
      val a = ovPairingAnnounce(ovpkMsg)
      val m = Arguments.createMap()
      m.putString("ovbA", a.ovbA)
      m.putString("stateHex", a.stateHex)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovPairingFinish(stateHex: String, ovbBMsg: String, promise: Promise) {
    try {
      val r = ovPairingFinish(stateHex, ovbBMsg)
      val m = Arguments.createMap()
      m.putString("contactKeyHex", r.contactKeyHex)
      m.putString("sas", r.sas)
      logContactKey("ovPairingFinish", r.contactKeyHex, r.sas)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovRespondPairing(mlkemEkHex: String, x25519PubHex: String, promise: Promise) {
    try {
      val o = ovRespondPairing(mlkemEkHex, x25519PubHex)
      val m = Arguments.createMap()
      m.putString("contactKeyHex", o.contactKeyHex)
      m.putString("sas", o.sas)
      m.putString("myX25519PubHex", o.myX25519PubHex)
      m.putString("mlkemCtHex", o.mlkemCtHex)
      logContactKey("ovRespondPairing", o.contactKeyHex, o.sas)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  @ReactMethod
  fun ovDecodeOv36(msg: String, indexCharset: String, specialCharset: String, promise: Promise) {
    try {
      val d = ovDecodeOv36(msg, indexCharset, specialCharset)
      val m = Arguments.createMap()
      m.putDouble("keyIndex", d.keyIndex.toDouble())
      m.putString("payload", d.payload)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  // ==== Real OV36 codec (byte-exact) — full interop with OV Message ==========

  // Decode a real OV Message OV36 frame to plaintext using only the pairing contactKey.
  @ReactMethod
  fun ov36Decode(msg: String, contactKeyHex: String, promise: Promise) {
    try {
      val d = ov36Decode(msg, contactKeyHex)
      val m = Arguments.createMap()
      m.putString("secureIndex", d.secureIndex)
      m.putString("plaintext", d.plaintext)
      promise.resolve(m)
    } catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }

  // Encode plaintext into an OV36 frame the OV Message app can decode.
  @ReactMethod
  fun ov36Encode(plaintext: String, contactKeyHex: String, promise: Promise) {
    try { promise.resolve(ov36Encode(plaintext, contactKeyHex)) }
    catch (e: Throwable) { promise.reject("ov_core", e.message, e) }
  }
}
