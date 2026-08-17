package expo.modules.securestore.encryptors;

import android.content.Context;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.crypto.aes.AesConfig;
import expo.modules.securestore.AuthenticationHelper;
import expo.modules.securestore.EncryptException;
import expo.modules.securestore.KeyStoreException;
import expo.modules.securestore.SecureStoreModule;
import expo.modules.securestore.SecureStoreOptions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import n7.f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lexpo/modules/securestore/encryptors/HybridAESEncryptor;", "Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;", "Ljava/security/KeyStore$PrivateKeyEntry;", "Landroid/content/Context;", "mContext", "Lexpo/modules/securestore/encryptors/AESEncryptor;", "mAESEncryptor", "<init>", "(Landroid/content/Context;Lexpo/modules/securestore/encryptors/AESEncryptor;)V", "Lexpo/modules/securestore/SecureStoreOptions;", "options", PointerEventHelper.POINTER_TYPE_UNKNOWN, AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExtendedKeyStoreAlias", "(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;", "getKeyStoreAlias", "(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;", "Ljava/security/KeyStore;", "keyStore", "initializeKeyStoreEntry", "(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$PrivateKeyEntry;", "plaintextValue", "keyStoreEntry", "authenticationPrompt", "Lexpo/modules/securestore/AuthenticationHelper;", "authenticationHelper", "Lorg/json/JSONObject;", "createEncryptedItem", "(Ljava/lang/String;Ljava/security/KeyStore$PrivateKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;", "key", "encryptedItem", "decryptItem", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$PrivateKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;", "Landroid/content/Context;", "Lexpo/modules/securestore/encryptors/AESEncryptor;", "Ljava/security/SecureRandom;", "mSecureRandom", "Ljava/security/SecureRandom;", "Ljavax/crypto/Cipher;", "getRSACipher", "()Ljavax/crypto/Cipher;", "rSACipher", "Companion", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridAESEncryptor implements KeyBasedEncryptor<KeyStore.PrivateKeyEntry> {
    private static final String ENCRYPTED_SECRET_KEY_PROPERTY = "esk";
    public static final String NAME = "hybrid";
    private static final String RSA_CIPHER = "RSA/None/PKCS1Padding";
    private final AESEncryptor mAESEncryptor;
    private Context mContext;
    private final SecureRandom mSecureRandom;

    public HybridAESEncryptor(Context mContext, AESEncryptor mAESEncryptor) {
        AbstractC2855l.g(mContext, "mContext");
        AbstractC2855l.g(mAESEncryptor, "mAESEncryptor");
        this.mContext = mContext;
        this.mAESEncryptor = mAESEncryptor;
        this.mSecureRandom = new SecureRandom();
    }

    private final Cipher getRSACipher() throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException {
        Cipher cipher = Cipher.getInstance(RSA_CIPHER);
        AbstractC2855l.f(cipher, "getInstance(...)");
        return cipher;
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public String getExtendedKeyStoreAlias(SecureStoreOptions options, boolean requireAuthentication) {
        AbstractC2855l.g(options, "options");
        String str = requireAuthentication ? SecureStoreModule.AUTHENTICATED_KEYSTORE_SUFFIX : SecureStoreModule.UNAUTHENTICATED_KEYSTORE_SUFFIX;
        return getKeyStoreAlias(options) + ":" + str;
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public String getKeyStoreAlias(SecureStoreOptions options) {
        AbstractC2855l.g(options, "options");
        return "RSA/None/PKCS1Padding:" + options.getKeychainService();
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public Object createEncryptedItem(String str, KeyStore.PrivateKeyEntry privateKeyEntry, boolean z10, String str2, AuthenticationHelper authenticationHelper, f fVar) throws JSONException, GeneralSecurityException, EncryptException {
        throw new EncryptException("HybridAESEncryption should not be used on Android SDK >= 23. This shouldn't happen. If you see this message report an issue at https://github.com/expo/expo.", "unknown", "unknown", null, 8, null);
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public Object decryptItem(String str, JSONObject jSONObject, KeyStore.PrivateKeyEntry privateKeyEntry, SecureStoreOptions secureStoreOptions, AuthenticationHelper authenticationHelper, f fVar) throws JSONException, GeneralSecurityException {
        byte[] bArrDecode = Base64.decode(jSONObject.getString(ENCRYPTED_SECRET_KEY_PROPERTY), 0);
        Cipher rSACipher = getRSACipher();
        rSACipher.init(2, privateKeyEntry.getPrivateKey());
        return this.mAESEncryptor.decryptItem(str, jSONObject, new KeyStore.SecretKeyEntry(new SecretKeySpec(rSACipher.doFinal(bArrDecode), AesConfig.CRYPTO_KEY_ALGORITHM)), secureStoreOptions, authenticationHelper, fVar);
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    public KeyStore.PrivateKeyEntry initializeKeyStoreEntry(KeyStore keyStore, SecureStoreOptions options) throws KeyStoreException, GeneralSecurityException {
        AbstractC2855l.g(keyStore, "keyStore");
        AbstractC2855l.g(options, "options");
        throw new KeyStoreException("Tried to initialize HybridAESEncryptor key store entry on Android SDK >= 23. This shouldn't happen. If you see this message report an issue at https://github.com/expo/expo.");
    }
}
