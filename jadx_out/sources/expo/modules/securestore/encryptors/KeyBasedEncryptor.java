package expo.modules.securestore.encryptors;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.securestore.AuthenticationHelper;
import expo.modules.securestore.SecureStoreOptions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStore.Entry;
import kotlin.Metadata;
import n7.f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;", "Ljava/security/KeyStore$Entry;", "E", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/securestore/SecureStoreOptions;", "options", PointerEventHelper.POINTER_TYPE_UNKNOWN, AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExtendedKeyStoreAlias", "(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;", "getKeyStoreAlias", "(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;", "Ljava/security/KeyStore;", "keyStore", "initializeKeyStoreEntry", "(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$Entry;", "plaintextValue", "keyStoreEntry", "authenticationPrompt", "Lexpo/modules/securestore/AuthenticationHelper;", "authenticationHelper", "Lorg/json/JSONObject;", "createEncryptedItem", "(Ljava/lang/String;Ljava/security/KeyStore$Entry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;", "key", "encryptedItem", "decryptItem", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$Entry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface KeyBasedEncryptor<E extends KeyStore.Entry> {
    Object createEncryptedItem(String str, E e10, boolean z10, String str2, AuthenticationHelper authenticationHelper, f fVar) throws JSONException, GeneralSecurityException;

    Object decryptItem(String str, JSONObject jSONObject, E e10, SecureStoreOptions secureStoreOptions, AuthenticationHelper authenticationHelper, f fVar) throws JSONException, GeneralSecurityException;

    String getExtendedKeyStoreAlias(SecureStoreOptions options, boolean requireAuthentication);

    String getKeyStoreAlias(SecureStoreOptions options);

    E initializeKeyStoreEntry(KeyStore keyStore, SecureStoreOptions options) throws GeneralSecurityException;
}
