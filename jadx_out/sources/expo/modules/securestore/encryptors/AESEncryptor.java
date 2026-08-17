package expo.modules.securestore.encryptors;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.crypto.aes.AesConfig;
import expo.modules.securestore.AuthenticationException;
import expo.modules.securestore.AuthenticationHelper;
import expo.modules.securestore.DecryptException;
import expo.modules.securestore.SecureStoreModule;
import expo.modules.securestore.SecureStoreOptions;
import i7.AbstractC2753p;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.UnrecoverableEntryException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lexpo/modules/securestore/encryptors/AESEncryptor;", "Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;", "Ljava/security/KeyStore$SecretKeyEntry;", "<init>", "()V", "Lexpo/modules/securestore/SecureStoreOptions;", "options", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getKeyStoreAlias", "(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY, "getExtendedKeyStoreAlias", "(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;", "Ljava/security/KeyStore;", "keyStore", "initializeKeyStoreEntry", "(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$SecretKeyEntry;", "plaintextValue", "keyStoreEntry", "authenticationPrompt", "Lexpo/modules/securestore/AuthenticationHelper;", "authenticationHelper", "Lorg/json/JSONObject;", "createEncryptedItem", "(Ljava/lang/String;Ljava/security/KeyStore$SecretKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;", "Ljavax/crypto/Cipher;", "cipher", "Ljavax/crypto/spec/GCMParameterSpec;", "gcmSpec", "createEncryptedItemWithCipher$expo_secure_store_release", "(Ljava/lang/String;Ljavax/crypto/Cipher;Ljavax/crypto/spec/GCMParameterSpec;)Lorg/json/JSONObject;", "createEncryptedItemWithCipher", "key", "encryptedItem", "decryptItem", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$SecretKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;", "Companion", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AESEncryptor implements KeyBasedEncryptor<KeyStore.SecretKeyEntry> {
    public static final String AES_CIPHER = "AES/GCM/NoPadding";
    public static final int AES_KEY_SIZE_BITS = 256;
    private static final String CIPHERTEXT_PROPERTY = "ct";
    private static final String GCM_AUTHENTICATION_TAG_LENGTH_PROPERTY = "tlen";
    public static final String IV_PROPERTY = "iv";
    private static final int MIN_GCM_AUTHENTICATION_TAG_LENGTH = 96;
    public static final String NAME = "aes";

    /* JADX INFO: renamed from: expo.modules.securestore.encryptors.AESEncryptor$createEncryptedItem$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.securestore.encryptors.AESEncryptor", f = "AESEncryptor.kt", l = {88}, m = "createEncryptedItem")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return AESEncryptor.this.createEncryptedItem((String) null, (KeyStore.SecretKeyEntry) null, false, (String) null, (AuthenticationHelper) null, (n7.f) this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.securestore.encryptors.AESEncryptor$decryptItem$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.securestore.encryptors.AESEncryptor", f = "AESEncryptor.kt", l = {131}, m = "decryptItem")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25661 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C25661(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return AESEncryptor.this.decryptItem((String) null, (JSONObject) null, (KeyStore.SecretKeyEntry) null, (SecureStoreOptions) null, (AuthenticationHelper) null, (n7.f) this);
        }
    }

    public final JSONObject createEncryptedItemWithCipher$expo_secure_store_release(String plaintextValue, Cipher cipher, GCMParameterSpec gcmSpec) throws JSONException {
        AbstractC2855l.g(plaintextValue, "plaintextValue");
        AbstractC2855l.g(cipher, "cipher");
        AbstractC2855l.g(gcmSpec, "gcmSpec");
        Charset UTF_8 = StandardCharsets.UTF_8;
        AbstractC2855l.f(UTF_8, "UTF_8");
        byte[] bytes = plaintextValue.getBytes(UTF_8);
        AbstractC2855l.f(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
        String strEncodeToString2 = Base64.encodeToString(gcmSpec.getIV(), 2);
        JSONObject jSONObjectPut = new JSONObject().put(CIPHERTEXT_PROPERTY, strEncodeToString).put(IV_PROPERTY, strEncodeToString2).put(GCM_AUTHENTICATION_TAG_LENGTH_PROPERTY, gcmSpec.getTLen());
        AbstractC2855l.f(jSONObjectPut, "put(...)");
        return jSONObjectPut;
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
        return "AES/GCM/NoPadding:" + options.getKeychainService();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createEncryptedItem(String str, KeyStore.SecretKeyEntry secretKeyEntry, boolean z10, String str2, AuthenticationHelper authenticationHelper, n7.f fVar) throws GeneralSecurityException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
        GCMParameterSpec gCMParameterSpec;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objAuthenticateCipher = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objAuthenticateCipher);
            Key secretKey = secretKeyEntry.getSecretKey();
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            gCMParameterSpec = (GCMParameterSpec) cipher.getParameters().getParameterSpec(GCMParameterSpec.class);
            AbstractC2855l.d(cipher);
            anonymousClass1.L$0 = str;
            anonymousClass1.L$1 = gCMParameterSpec;
            anonymousClass1.label = 1;
            objAuthenticateCipher = authenticationHelper.authenticateCipher(cipher, z10, str2, anonymousClass1);
            if (objAuthenticateCipher == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GCMParameterSpec gCMParameterSpec2 = (GCMParameterSpec) anonymousClass1.L$1;
            String str3 = (String) anonymousClass1.L$0;
            AbstractC2753p.b(objAuthenticateCipher);
            gCMParameterSpec = gCMParameterSpec2;
            str = str3;
        }
        AbstractC2855l.d(gCMParameterSpec);
        return createEncryptedItemWithCipher$expo_secure_store_release(str, (Cipher) objAuthenticateCipher, gCMParameterSpec);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decryptItem(String str, JSONObject jSONObject, KeyStore.SecretKeyEntry secretKeyEntry, SecureStoreOptions secureStoreOptions, AuthenticationHelper authenticationHelper, n7.f fVar) throws JSONException, GeneralSecurityException, AuthenticationException, DecryptException {
        C25661 c25661;
        byte[] bArr;
        if (fVar instanceof C25661) {
            c25661 = (C25661) fVar;
            int i10 = c25661.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c25661.label = i10 - a.INVALID_ID;
            } else {
                c25661 = new C25661(fVar);
            }
        }
        Object obj = c25661.result;
        Object objE = AbstractC3016b.e();
        int i11 = c25661.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            String string = jSONObject.getString(CIPHERTEXT_PROPERTY);
            String string2 = jSONObject.getString(IV_PROPERTY);
            int i12 = jSONObject.getInt(GCM_AUTHENTICATION_TAG_LENGTH_PROPERTY);
            byte[] bArrDecode = Base64.decode(string, 0);
            AlgorithmParameterSpec gCMParameterSpec = new GCMParameterSpec(i12, Base64.decode(string2, 0));
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            boolean zOptBoolean = jSONObject.optBoolean(AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY);
            if (i12 < MIN_GCM_AUTHENTICATION_TAG_LENGTH) {
                throw new DecryptException("Authentication tag length must be at least 96 bits long", str, secureStoreOptions.getKeychainService(), null, 8, null);
            }
            cipher.init(2, secretKeyEntry.getSecretKey(), gCMParameterSpec);
            AbstractC2855l.d(cipher);
            String authenticationPrompt = secureStoreOptions.getAuthenticationPrompt();
            c25661.L$0 = bArrDecode;
            c25661.label = 1;
            Object objAuthenticateCipher = authenticationHelper.authenticateCipher(cipher, zOptBoolean, authenticationPrompt, c25661);
            if (objAuthenticateCipher == objE) {
                return objE;
            }
            obj = objAuthenticateCipher;
            bArr = bArrDecode;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) c25661.L$0;
            AbstractC2753p.b(obj);
        }
        byte[] bArrDoFinal = ((Cipher) obj).doFinal(bArr);
        AbstractC2855l.f(bArrDoFinal, "doFinal(...)");
        Charset UTF_8 = StandardCharsets.UTF_8;
        AbstractC2855l.f(UTF_8, "UTF_8");
        return new String(bArrDoFinal, UTF_8);
    }

    @Override // expo.modules.securestore.encryptors.KeyBasedEncryptor
    @TargetApi(TextAttributeProps.TA_KEY_LAYOUT_DIRECTION)
    public KeyStore.SecretKeyEntry initializeKeyStoreEntry(KeyStore keyStore, SecureStoreOptions options) throws GeneralSecurityException {
        AbstractC2855l.g(keyStore, "keyStore");
        AbstractC2855l.g(options, "options");
        String extendedKeyStoreAlias = getExtendedKeyStoreAlias(options, options.getRequireAuthentication());
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(extendedKeyStoreAlias, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(options.getRequireAuthentication()).build();
        AbstractC2855l.f(keyGenParameterSpecBuild, "build(...)");
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AesConfig.CRYPTO_KEY_ALGORITHM, keyStore.getProvider());
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
        KeyStore.Entry entry = keyStore.getEntry(extendedKeyStoreAlias, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            return secretKeyEntry;
        }
        throw new UnrecoverableEntryException("Could not retrieve the newly generated secret key entry");
    }
}
