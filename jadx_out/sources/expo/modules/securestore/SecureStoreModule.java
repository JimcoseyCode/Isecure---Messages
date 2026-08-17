package expo.modules.securestore;

import C7.o;
import R8.AbstractC1415j;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import androidx.customview.widget.a;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.securestore.encryptors.AESEncryptor;
import expo.modules.securestore.encryptors.HybridAESEncryptor;
import expo.modules.securestore.encryptors.KeyBasedEncryptor;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Map;
import javax.crypto.BadPaddingException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import o7.AbstractC3016b;
import org.json.JSONException;
import org.json.JSONObject;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010'\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(JG\u0010)\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*JE\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010*JO\u0010-\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\n¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lexpo/modules/securestore/SecureStoreModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", "Lexpo/modules/securestore/SecureStoreOptions;", "options", "getItemImpl", "(Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;Ln7/f;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "prefs", "readJSONEncodedItem", "(Ljava/lang/String;Landroid/content/SharedPreferences;Lexpo/modules/securestore/SecureStoreOptions;Ln7/f;)Ljava/lang/Object;", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "keyIsInvalidated", "Li7/B;", "setItemImpl", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;ZLn7/f;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "encryptedItem", AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY, "keychainService", "saveEncryptedItem", "(Lorg/json/JSONObject;Landroid/content/SharedPreferences;Ljava/lang/String;ZLjava/lang/String;)Z", "deleteItemImpl", "(Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;)V", "keyStoreAlias", "removeKeyFromKeystore", "(Ljava/lang/String;Ljava/lang/String;)V", "removeAllEntriesUnderKeychainService", "(Ljava/lang/String;)V", "Ljava/security/KeyStore$Entry;", "E", "Ljava/lang/Class;", "keyStoreEntryClass", "Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;", "encryptor", "getLegacyKeyEntry", "(Ljava/lang/Class;Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$Entry;", "getKeyEntry", "(Ljava/lang/Class;Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/security/KeyStore$Entry;", "getOrCreateKeyEntry", SecureStoreModule.USES_KEYSTORE_SUFFIX_PROPERTY, "getKeyEntryCompat", "(Ljava/lang/Class;Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;Lexpo/modules/securestore/SecureStoreOptions;ZZ)Ljava/security/KeyStore$Entry;", "createKeychainAwareKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "Lexpo/modules/securestore/encryptors/AESEncryptor;", "mAESEncryptor", "Lexpo/modules/securestore/encryptors/AESEncryptor;", "Ljava/security/KeyStore;", "keyStore", "Ljava/security/KeyStore;", "Lexpo/modules/securestore/encryptors/HybridAESEncryptor;", "hybridAESEncryptor", "Lexpo/modules/securestore/encryptors/HybridAESEncryptor;", "Lexpo/modules/securestore/AuthenticationHelper;", "authenticationHelper", "Lexpo/modules/securestore/AuthenticationHelper;", "Landroid/content/Context;", "getReactContext", "()Landroid/content/Context;", "reactContext", "Companion", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SecureStoreModule extends Module {
    public static final String AUTHENTICATED_KEYSTORE_SUFFIX = "keystoreAuthenticated";
    public static final String DEFAULT_KEYSTORE_ALIAS = "key_v1";
    private static final String KEYSTORE_ALIAS_PROPERTY = "keystoreAlias";
    private static final String KEYSTORE_PROVIDER = "AndroidKeyStore";
    private static final String SCHEME_PROPERTY = "scheme";
    private static final String SHARED_PREFERENCES_NAME = "SecureStore";
    public static final String TAG = "ExpoSecureStore";
    public static final String UNAUTHENTICATED_KEYSTORE_SUFFIX = "keystoreUnauthenticated";
    public static final String USES_KEYSTORE_SUFFIX_PROPERTY = "usesKeystoreSuffix";
    private AuthenticationHelper authenticationHelper;
    private HybridAESEncryptor hybridAESEncryptor;
    private KeyStore keyStore;
    private final AESEncryptor mAESEncryptor = new AESEncryptor();

    /* JADX INFO: renamed from: expo.modules.securestore.SecureStoreModule$readJSONEncodedItem$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.securestore.SecureStoreModule", f = "SecureStoreModule.kt", l = {145, 150}, m = "readJSONEncodedItem")
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
            return SecureStoreModule.this.readJSONEncodedItem(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.securestore.SecureStoreModule$setItemImpl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.securestore.SecureStoreModule", f = "SecureStoreModule.kt", l = {204, JfifUtil.MARKER_RST7}, m = "setItemImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C25651 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C25651(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return SecureStoreModule.this.setItemImpl(null, null, null, false, this);
        }
    }

    private final String createKeychainAwareKey(String key, String keychainService) {
        return keychainService + "-" + key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteItemImpl(String key, SecureStoreOptions options) throws DeleteException {
        SharedPreferences sharedPreferences = getSharedPreferences();
        String strCreateKeychainAwareKey = createKeychainAwareKey(key, options.getKeychainService());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getReactContext());
        boolean zCommit = sharedPreferences.contains(strCreateKeychainAwareKey) ? sharedPreferences.edit().remove(strCreateKeychainAwareKey).commit() : true;
        if (sharedPreferences.contains(key)) {
            zCommit = sharedPreferences.edit().remove(key).commit() && zCommit;
        }
        if (defaultSharedPreferences.contains(key)) {
            zCommit = defaultSharedPreferences.edit().remove(key).commit() && zCommit;
        }
        if (!zCommit) {
            throw new DeleteException("Could not delete the item from SecureStore", key, options.getKeychainService(), null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getItemImpl(String str, SecureStoreOptions secureStoreOptions, n7.f fVar) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences.contains(createKeychainAwareKey(str, secureStoreOptions.getKeychainService()))) {
            return readJSONEncodedItem(str, sharedPreferences, secureStoreOptions, fVar);
        }
        if (sharedPreferences.contains(str)) {
            return readJSONEncodedItem(str, sharedPreferences, secureStoreOptions, fVar);
        }
        return null;
    }

    private final <E extends KeyStore.Entry> E getKeyEntry(Class<E> keyStoreEntryClass, KeyBasedEncryptor<E> encryptor, SecureStoreOptions options, boolean requireAuthentication) throws KeyStoreException, NoSuchAlgorithmException, java.security.KeyStoreException, UnrecoverableEntryException {
        String extendedKeyStoreAlias = encryptor.getExtendedKeyStoreAlias(options, requireAuthentication);
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            AbstractC2855l.y("keyStore");
            keyStore = null;
        }
        if (!keyStore.containsAlias(extendedKeyStoreAlias)) {
            return null;
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            AbstractC2855l.y("keyStore");
            keyStore2 = null;
        }
        KeyStore.Entry entry = keyStore2.getEntry(extendedKeyStoreAlias, null);
        if (!keyStoreEntryClass.isInstance(entry)) {
            throw new KeyStoreException("The entry for the keystore alias \"" + extendedKeyStoreAlias + "\" is not a " + keyStoreEntryClass.getSimpleName());
        }
        E eCast = keyStoreEntryClass.cast(entry);
        if (eCast != null) {
            return eCast;
        }
        throw new KeyStoreException("The entry for the keystore alias \"" + extendedKeyStoreAlias + "\" couldn't be cast to correct class");
    }

    private final <E extends KeyStore.Entry> E getKeyEntryCompat(Class<E> keyStoreEntryClass, KeyBasedEncryptor<E> encryptor, SecureStoreOptions options, boolean requireAuthentication, boolean usesKeystoreSuffix) {
        return usesKeystoreSuffix ? (E) getKeyEntry(keyStoreEntryClass, encryptor, options, requireAuthentication) : (E) getLegacyKeyEntry(keyStoreEntryClass, encryptor, options);
    }

    private final <E extends KeyStore.Entry> E getLegacyKeyEntry(Class<E> keyStoreEntryClass, KeyBasedEncryptor<E> encryptor, SecureStoreOptions options) throws NoSuchAlgorithmException, java.security.KeyStoreException, UnrecoverableEntryException {
        String keyStoreAlias = encryptor.getKeyStoreAlias(options);
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            AbstractC2855l.y("keyStore");
            keyStore = null;
        }
        if (!keyStore.containsAlias(encryptor.getKeyStoreAlias(options))) {
            return null;
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            AbstractC2855l.y("keyStore");
            keyStore2 = null;
        }
        KeyStore.Entry entry = keyStore2.getEntry(keyStoreAlias, null);
        if (keyStoreEntryClass.isInstance(entry)) {
            return keyStoreEntryClass.cast(entry);
        }
        return null;
    }

    private final <E extends KeyStore.Entry> E getOrCreateKeyEntry(Class<E> keyStoreEntryClass, KeyBasedEncryptor<E> encryptor, SecureStoreOptions options, boolean requireAuthentication) throws AuthenticationException {
        E e10 = (E) getKeyEntry(keyStoreEntryClass, encryptor, options, requireAuthentication);
        if (e10 != null) {
            return e10;
        }
        KeyStore keyStore = null;
        if (requireAuthentication) {
            AuthenticationHelper authenticationHelper = this.authenticationHelper;
            if (authenticationHelper == null) {
                AbstractC2855l.y("authenticationHelper");
                authenticationHelper = null;
            }
            authenticationHelper.assertBiometricsSupport();
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            AbstractC2855l.y("keyStore");
        } else {
            keyStore = keyStore2;
        }
        return (E) encryptor.initializeKeyStoreEntry(keyStore, options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v23, types: [expo.modules.securestore.encryptors.AESEncryptor] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v18, types: [expo.modules.securestore.SecureStoreModule] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readJSONEncodedItem(String str, SharedPreferences sharedPreferences, SecureStoreOptions secureStoreOptions, n7.f fVar) throws CodedException {
        AnonymousClass1 anonymousClass1;
        SecureStoreOptions secureStoreOptions2;
        SecureStoreModule secureStoreModule;
        ?? r12;
        ?? r13;
        ?? B9;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r142;
        AuthenticationHelper authenticationHelper;
        HybridAESEncryptor hybridAESEncryptor;
        AuthenticationHelper authenticationHelper2;
        SecureStoreModule secureStoreModule2 = this;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = secureStoreModule2.new AnonymousClass1(fVar);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj = anonymousClass12.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass12.label;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                String strCreateKeychainAwareKey = secureStoreModule2.createKeychainAwareKey(str, secureStoreOptions.getKeychainService());
                String string = sharedPreferences.getString(str, null);
                String string2 = sharedPreferences.getString(strCreateKeychainAwareKey, null);
                if (string2 != null) {
                    string = string2;
                }
                if (string == null) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String strOptString = jSONObject.optString(SCHEME_PROPERTY);
                    AbstractC2855l.d(strOptString);
                    if (strOptString.length() <= 0) {
                        strOptString = null;
                    }
                    if (strOptString == null) {
                        throw new DecryptException("Could not find the encryption scheme used for key: " + str, str, secureStoreOptions.getKeychainService(), null, 8, null);
                    }
                    secureStoreOptions2 = null;
                    boolean zOptBoolean = jSONObject.optBoolean(AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY, false);
                    boolean zOptBoolean2 = jSONObject.optBoolean(USES_KEYSTORE_SUFFIX_PROPERTY, false);
                    try {
                    } catch (BadPaddingException unused) {
                        secureStoreModule = secureStoreModule2;
                    } catch (GeneralSecurityException e10) {
                        e = e10;
                    } catch (Exception e11) {
                        e = e11;
                    }
                    try {
                        try {
                            try {
                            } catch (BadPaddingException unused2) {
                            } catch (GeneralSecurityException e12) {
                                e = e12;
                                r15 = str;
                                throw new DecryptException(e.getMessage(), r15, secureStoreOptions2.getKeychainService(), e);
                            } catch (Exception e13) {
                                e = e13;
                                r14 = str;
                                throw new DecryptException(e.getMessage(), r14, secureStoreOptions2.getKeychainService(), e);
                            }
                        } catch (BadPaddingException unused3) {
                            secureStoreOptions2 = secureStoreOptions;
                        } catch (GeneralSecurityException e14) {
                            e = e14;
                        } catch (Exception e15) {
                            e = e15;
                        }
                        if (AbstractC2855l.b(strOptString, AESEncryptor.NAME)) {
                            try {
                                secureStoreModule = secureStoreModule2;
                                KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) secureStoreModule2.getKeyEntryCompat(KeyStore.SecretKeyEntry.class, secureStoreModule2.mAESEncryptor, secureStoreOptions, zOptBoolean, zOptBoolean2);
                                if (secretKeyEntry == null) {
                                    secureStoreOptions.getKeychainService();
                                    secureStoreModule.deleteItemImpl(str, secureStoreOptions);
                                    return null;
                                }
                                ?? r02 = secureStoreModule.mAESEncryptor;
                                AuthenticationHelper authenticationHelper3 = secureStoreModule.authenticationHelper;
                                if (authenticationHelper3 == null) {
                                    AbstractC2855l.y("authenticationHelper");
                                    authenticationHelper = null;
                                } else {
                                    authenticationHelper = authenticationHelper3;
                                }
                                anonymousClass12.L$0 = str;
                                anonymousClass12.L$1 = secureStoreOptions;
                                anonymousClass12.label = 1;
                                B9 = str;
                                try {
                                    Object objDecryptItem = r02.decryptItem(B9, jSONObject, secretKeyEntry, secureStoreOptions, authenticationHelper, anonymousClass12);
                                    return objDecryptItem == objE ? objE : objDecryptItem;
                                } catch (BadPaddingException unused4) {
                                } catch (GeneralSecurityException e16) {
                                    e = e16;
                                    r13 = B9;
                                    secureStoreOptions2 = secureStoreOptions;
                                    r15 = r13;
                                    throw new DecryptException(e.getMessage(), r15, secureStoreOptions2.getKeychainService(), e);
                                } catch (Exception e17) {
                                    e = e17;
                                    r12 = B9;
                                    secureStoreOptions2 = secureStoreOptions;
                                    r14 = r12;
                                    throw new DecryptException(e.getMessage(), r14, secureStoreOptions2.getKeychainService(), e);
                                }
                            } catch (BadPaddingException unused5) {
                                secureStoreOptions2 = secureStoreOptions;
                                r142 = secureStoreModule2;
                                r16 = str;
                                secureStoreOptions2.getKeychainService();
                                r142.deleteItemImpl(r16, secureStoreOptions2);
                                return null;
                            } catch (GeneralSecurityException e18) {
                                e = e18;
                                secureStoreOptions2 = secureStoreOptions;
                                r15 = str;
                                throw new DecryptException(e.getMessage(), r15, secureStoreOptions2.getKeychainService(), e);
                            } catch (Exception e19) {
                                e = e19;
                                secureStoreOptions2 = secureStoreOptions;
                                r14 = str;
                                throw new DecryptException(e.getMessage(), r14, secureStoreOptions2.getKeychainService(), e);
                            }
                        } else {
                            secureStoreModule = secureStoreModule2;
                            try {
                                B9 = AbstractC2855l.b(strOptString, HybridAESEncryptor.NAME);
                                try {
                                    if (B9 != 0) {
                                        HybridAESEncryptor hybridAESEncryptor2 = secureStoreModule.hybridAESEncryptor;
                                        if (hybridAESEncryptor2 == null) {
                                            AbstractC2855l.y("hybridAESEncryptor");
                                            hybridAESEncryptor = null;
                                        } else {
                                            hybridAESEncryptor = hybridAESEncryptor2;
                                        }
                                        secureStoreModule2 = secureStoreModule;
                                        secureStoreModule = secureStoreModule2;
                                        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) secureStoreModule2.getKeyEntryCompat(KeyStore.PrivateKeyEntry.class, hybridAESEncryptor, secureStoreOptions, zOptBoolean, zOptBoolean2);
                                        if (privateKeyEntry == null) {
                                            return null;
                                        }
                                        HybridAESEncryptor hybridAESEncryptor3 = secureStoreModule.hybridAESEncryptor;
                                        if (hybridAESEncryptor3 == null) {
                                            AbstractC2855l.y("hybridAESEncryptor");
                                            hybridAESEncryptor3 = null;
                                        }
                                        AuthenticationHelper authenticationHelper4 = secureStoreModule.authenticationHelper;
                                        if (authenticationHelper4 == null) {
                                            AbstractC2855l.y("authenticationHelper");
                                            authenticationHelper2 = null;
                                        } else {
                                            authenticationHelper2 = authenticationHelper4;
                                        }
                                        anonymousClass12.L$0 = str;
                                        anonymousClass12.L$1 = secureStoreOptions;
                                        anonymousClass12.label = 2;
                                        Object objDecryptItem2 = hybridAESEncryptor3.decryptItem(str, jSONObject, privateKeyEntry, secureStoreOptions, authenticationHelper2, (n7.f) anonymousClass12);
                                        if (objDecryptItem2 != objE) {
                                            return objDecryptItem2;
                                        }
                                    } else {
                                        try {
                                            throw new DecryptException("The item for key " + str + " in SecureStore has an unknown encoding scheme " + strOptString + ")", str, secureStoreOptions.getKeychainService(), null, 8, null);
                                        } catch (BadPaddingException unused6) {
                                            B9 = str;
                                        } catch (GeneralSecurityException e20) {
                                            e = e20;
                                            r13 = str;
                                            secureStoreOptions2 = secureStoreOptions;
                                            r15 = r13;
                                            throw new DecryptException(e.getMessage(), r15, secureStoreOptions2.getKeychainService(), e);
                                        } catch (Exception e21) {
                                            e = e21;
                                            r12 = str;
                                            secureStoreOptions2 = secureStoreOptions;
                                            r14 = r12;
                                            throw new DecryptException(e.getMessage(), r14, secureStoreOptions2.getKeychainService(), e);
                                        }
                                    }
                                } catch (BadPaddingException unused7) {
                                } catch (GeneralSecurityException e22) {
                                    e = e22;
                                    r13 = B9;
                                } catch (Exception e23) {
                                    e = e23;
                                    r12 = B9;
                                }
                            } catch (BadPaddingException unused8) {
                                B9 = str;
                            } catch (GeneralSecurityException e24) {
                                e = e24;
                                r13 = str;
                                secureStoreOptions2 = secureStoreOptions;
                                r15 = r13;
                                throw new DecryptException(e.getMessage(), r15, secureStoreOptions2.getKeychainService(), e);
                            } catch (Exception e25) {
                                e = e25;
                                r12 = str;
                                secureStoreOptions2 = secureStoreOptions;
                                r14 = r12;
                                throw new DecryptException(e.getMessage(), r14, secureStoreOptions2.getKeychainService(), e);
                            }
                            secureStoreOptions2 = secureStoreOptions;
                            r16 = B9;
                            r142 = secureStoreModule;
                            secureStoreOptions2.getKeychainService();
                            r142.deleteItemImpl(r16, secureStoreOptions2);
                        }
                    } catch (KeyPermanentlyInvalidatedException unused9) {
                    } catch (CodedException e26) {
                        throw e26;
                    }
                } catch (JSONException e27) {
                    throw new DecryptException("Could not parse the encrypted JSON item in SecureStore: " + e27.getMessage(), str, secureStoreOptions.getKeychainService(), e27);
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SecureStoreOptions secureStoreOptions3 = (SecureStoreOptions) anonymousClass12.L$1;
                String str2 = (String) anonymousClass12.L$0;
                try {
                    AbstractC2753p.b(obj);
                    return obj;
                } catch (BadPaddingException unused10) {
                    r142 = secureStoreModule2;
                    r16 = str2;
                    secureStoreOptions2 = secureStoreOptions3;
                } catch (GeneralSecurityException e28) {
                    e = e28;
                    r15 = str2;
                    secureStoreOptions2 = secureStoreOptions3;
                    throw new DecryptException(e.getMessage(), r15, secureStoreOptions2.getKeychainService(), e);
                } catch (Exception e29) {
                    e = e29;
                    r14 = str2;
                    secureStoreOptions2 = secureStoreOptions3;
                    throw new DecryptException(e.getMessage(), r14, secureStoreOptions2.getKeychainService(), e);
                }
            }
        } catch (KeyPermanentlyInvalidatedException unused11) {
        } catch (CodedException e30) {
            throw e30;
        }
        return null;
    }

    private final void removeAllEntriesUnderKeychainService(String keychainService) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        Map<String, ?> all = sharedPreferences.getAll();
        AbstractC2855l.f(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str = value instanceof String ? (String) value : null;
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString(KEYSTORE_ALIAS_PROPERTY);
                    if (strOptString != null && jSONObject.optBoolean(AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY, false) && AbstractC2855l.b(keychainService, strOptString)) {
                        sharedPreferences.edit().remove(key).apply();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    private final void removeKeyFromKeystore(String keyStoreAlias, String keychainService) throws java.security.KeyStoreException {
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            AbstractC2855l.y("keyStore");
            keyStore = null;
        }
        keyStore.deleteEntry(keyStoreAlias);
        removeAllEntriesUnderKeychainService(keychainService);
    }

    private final boolean saveEncryptedItem(JSONObject encryptedItem, SharedPreferences prefs, String key, boolean requireAuthentication, String keychainService) throws JSONException, WriteException {
        encryptedItem.put(USES_KEYSTORE_SUFFIX_PROPERTY, true);
        encryptedItem.put(KEYSTORE_ALIAS_PROPERTY, keychainService);
        encryptedItem.put(AuthenticationHelper.REQUIRE_AUTHENTICATION_PROPERTY, requireAuthentication);
        String string = encryptedItem.toString();
        AbstractC2855l.f(string, "toString(...)");
        if (string.length() != 0) {
            return prefs.edit().putString(key, string).commit();
        }
        throw new WriteException("Could not JSON-encode the encrypted item for SecureStore - the string " + string + " is null or empty", key, keychainService, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        if (setItemImpl(r2, r3, r4, true, r8) == r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setItemImpl(String str, String str2, SecureStoreOptions secureStoreOptions, boolean z10, n7.f fVar) throws CodedException {
        C25651 c25651;
        String str3;
        C25651 c256512;
        String str4;
        String str5;
        SharedPreferences sharedPreferences;
        SecureStoreOptions secureStoreOptions2;
        String str6;
        Exception e10;
        GeneralSecurityException e11;
        String str7 = str2;
        SecureStoreOptions secureStoreOptions3 = secureStoreOptions;
        boolean z11 = z10;
        if (fVar instanceof C25651) {
            c25651 = (C25651) fVar;
            int i10 = c25651.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c25651.label = i10 - a.INVALID_ID;
            } else {
                c25651 = new C25651(fVar);
            }
        }
        C25651 c256513 = c25651;
        Object obj = c256513.result;
        Object objE = AbstractC3016b.e();
        int i11 = c256513.label;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                String strCreateKeychainAwareKey = createKeychainAwareKey(str, secureStoreOptions3.getKeychainService());
                SharedPreferences sharedPreferences2 = getSharedPreferences();
                if (str7 == null) {
                    if (sharedPreferences2.edit().putString(strCreateKeychainAwareKey, null).commit()) {
                        return C2735B.f28704a;
                    }
                    throw new WriteException("Could not write a null value to SecureStore", str, secureStoreOptions3.getKeychainService(), null, 8, null);
                }
                str3 = str;
                if (z11) {
                    try {
                        try {
                            removeKeyFromKeystore(this.mAESEncryptor.getExtendedKeyStoreAlias(secureStoreOptions3, secureStoreOptions3.getRequireAuthentication()), secureStoreOptions3.getKeychainService());
                        } catch (KeyPermanentlyInvalidatedException e12) {
                            e = e12;
                            c256512 = c256513;
                            secureStoreOptions2 = secureStoreOptions3;
                            str6 = str3;
                            if (!z11) {
                            }
                        }
                    } catch (GeneralSecurityException e13) {
                        e11 = e13;
                        throw new EncryptException(e11.getMessage(), str3, secureStoreOptions3.getKeychainService(), e11);
                    } catch (Exception e14) {
                        e10 = e14;
                        throw new WriteException(e10.getMessage(), str3, secureStoreOptions3.getKeychainService(), e10);
                    }
                }
                try {
                    KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) getOrCreateKeyEntry(KeyStore.SecretKeyEntry.class, this.mAESEncryptor, secureStoreOptions3, secureStoreOptions3.getRequireAuthentication());
                    AESEncryptor aESEncryptor = this.mAESEncryptor;
                    boolean requireAuthentication = secureStoreOptions3.getRequireAuthentication();
                    String authenticationPrompt = secureStoreOptions3.getAuthenticationPrompt();
                    AuthenticationHelper authenticationHelper = this.authenticationHelper;
                    if (authenticationHelper == null) {
                        AbstractC2855l.y("authenticationHelper");
                        authenticationHelper = null;
                    }
                    c256513.L$0 = str3;
                    c256513.L$1 = str7;
                    c256513.L$2 = secureStoreOptions3;
                    c256513.L$3 = strCreateKeychainAwareKey;
                    c256513.L$4 = sharedPreferences2;
                    c256513.Z$0 = z11;
                    c256513.label = 1;
                    c256512 = c256513;
                    try {
                        Object objCreateEncryptedItem = aESEncryptor.createEncryptedItem(str7, secretKeyEntry, requireAuthentication, authenticationPrompt, authenticationHelper, (n7.f) c256512);
                        if (objCreateEncryptedItem != objE) {
                            str4 = str2;
                            str5 = strCreateKeychainAwareKey;
                            obj = objCreateEncryptedItem;
                            sharedPreferences = sharedPreferences2;
                        }
                    } catch (KeyPermanentlyInvalidatedException e15) {
                        e = e15;
                        str7 = str2;
                        secureStoreOptions2 = secureStoreOptions3;
                        str6 = str3;
                        if (!z11) {
                            throw new EncryptException("Encryption Failed. The key " + str6 + " has been permanently invalidated and cannot be reinitialized", str6, secureStoreOptions2.getKeychainService(), e);
                        }
                        c256512.L$0 = null;
                        c256512.L$1 = null;
                        c256512.L$2 = null;
                        c256512.L$3 = null;
                        c256512.L$4 = null;
                        c256512.label = 2;
                    }
                } catch (KeyPermanentlyInvalidatedException e16) {
                    e = e16;
                    c256512 = c256513;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return C2735B.f28704a;
            }
            boolean z12 = c256513.Z$0;
            sharedPreferences = (SharedPreferences) c256513.L$4;
            str5 = (String) c256513.L$3;
            SecureStoreOptions secureStoreOptions4 = (SecureStoreOptions) c256513.L$2;
            str4 = (String) c256513.L$1;
            String str8 = (String) c256513.L$0;
            try {
                AbstractC2753p.b(obj);
                z11 = z12;
                secureStoreOptions3 = secureStoreOptions4;
                str3 = str8;
                c256512 = c256513;
            } catch (KeyPermanentlyInvalidatedException e17) {
                e = e17;
                z11 = z12;
                secureStoreOptions2 = secureStoreOptions4;
                str7 = str4;
                str6 = str8;
                c256512 = c256513;
                if (!z11) {
                }
            } catch (GeneralSecurityException e18) {
                e11 = e18;
                secureStoreOptions3 = secureStoreOptions4;
                str3 = str8;
                throw new EncryptException(e11.getMessage(), str3, secureStoreOptions3.getKeychainService(), e11);
            } catch (Exception e19) {
                e10 = e19;
                secureStoreOptions3 = secureStoreOptions4;
                str3 = str8;
                throw new WriteException(e10.getMessage(), str3, secureStoreOptions3.getKeychainService(), e10);
            }
            try {
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.put(SCHEME_PROPERTY, AESEncryptor.NAME);
                saveEncryptedItem(jSONObject, sharedPreferences, str5, secureStoreOptions3.getRequireAuthentication(), secureStoreOptions3.getKeychainService());
                if (sharedPreferences.contains(str3)) {
                    sharedPreferences.edit().remove(str3).apply();
                }
                return C2735B.f28704a;
            } catch (KeyPermanentlyInvalidatedException e20) {
                e = e20;
                str7 = str4;
                secureStoreOptions2 = secureStoreOptions3;
                str6 = str3;
                if (!z11) {
                }
            }
        } catch (CodedException e21) {
            throw e21;
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        AnyTypeProvider anyTypeProvider;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name(TAG);
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder.AsyncFunction("setValueWithKeyAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(String.class);
            Boolean bool = Boolean.TRUE;
            AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                cls = Object.class;
                anyType = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters);
            } else {
                cls = Object.class;
            }
            AnyType anyType2 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType2 == null) {
                cls2 = SecureStoreOptions.class;
                anyType2 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Coroutine$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters);
            } else {
                cls2 = SecureStoreOptions.class;
            }
            C7.d dVarB2 = D.b(cls2);
            Boolean bool2 = Boolean.FALSE;
            AnyType anyType3 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB2, bool2));
            if (anyType3 == null) {
                anyTypeProvider = anyTypeProvider2;
                cls3 = String.class;
                anyType3 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Coroutine$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SecureStoreOptions.class);
                    }
                }), converters);
            } else {
                cls3 = String.class;
                anyTypeProvider = anyTypeProvider2;
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new SecureStoreModule$definition$lambda$7$$inlined$Coroutine$4(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = moduleDefinitionBuilder.AsyncFunction("getValueWithKeyAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters2 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool2));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Coroutine$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Coroutine$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SecureStoreOptions.class);
                    }
                }), converters2);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType4, anyType5}, new SecureStoreModule$definition$lambda$7$$inlined$Coroutine$7(null, this)));
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(cls3), true, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters3);
            }
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(cls3), true, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Function$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters3);
            }
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Function$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SecureStoreOptions.class);
                    }
                }), converters3);
            }
            AnyType[] anyTypeArr = {anyType6, anyType7, anyType8};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("setValueWithKeySync", new SyncFunctionComponent("setValueWithKeySync", anyTypeArr, returnType, new Function1() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Function$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws NullKeyException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[2];
                    String str = (String) obj2;
                    String str2 = (String) obj;
                    if (str == null) {
                        throw new NullKeyException();
                    }
                    AbstractC1415j.b(null, new SecureStoreModule$definition$1$3$1(this.this$0, str, str2, secureStoreOptions, null), 1, null);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool2));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Function$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters4);
            }
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Function$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SecureStoreOptions.class);
                    }
                }), converters4);
            }
            AnyType[] anyTypeArr2 = {anyType9, anyType10};
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType2);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getValueWithKeySync", new SyncFunctionComponent("getValueWithKeySync", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Function$7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
                    return (String) AbstractC1415j.b(null, new SecureStoreModule$definition$1$4$1(this.this$0, (String) obj, secureStoreOptions, null), 1, null);
                }
            }));
            TypeConverterProvider converters5 = moduleDefinitionBuilder.getConverters();
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool2));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$AsyncFunction$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters5);
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$AsyncFunction$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SecureStoreOptions.class);
                    }
                }), converters5);
            }
            AnyType[] anyTypeArr3 = {anyType11, anyType12};
            Function1 function1 = new Function1() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) throws CodedException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
                    String str = (String) obj;
                    try {
                        this.this$0.deleteItemImpl(str, secureStoreOptions);
                        return C2735B.f28704a;
                    } catch (CodedException e10) {
                        throw e10;
                    } catch (Exception e11) {
                        throw new DeleteException(e11.getMessage(), str, secureStoreOptions.getKeychainService(), e11);
                    }
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteValueWithKeyAsync", AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("deleteValueWithKeyAsync", anyTypeArr3, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("deleteValueWithKeyAsync", anyTypeArr3, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("deleteValueWithKeyAsync", anyTypeArr3, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("deleteValueWithKeyAsync", anyTypeArr3, function1) : AbstractC2855l.b(C2735B.class, cls3) ? new StringAsyncFunctionComponent("deleteValueWithKeyAsync", anyTypeArr3, function1) : new UntypedAsyncFunctionComponent("deleteValueWithKeyAsync", anyTypeArr3, function1));
            AnyType[] anyTypeArr4 = new AnyType[0];
            ReturnType returnType3 = returnTypeProvider.getTypes().get(D.b(cls));
            if (returnType3 == null) {
                returnType3 = new ReturnType(D.b(cls));
                returnTypeProvider.getTypes().put(D.b(cls), returnType3);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("canUseBiometricAuthentication", new SyncFunctionComponent("canUseBiometricAuthentication", anyTypeArr4, returnType3, new Function1() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    boolean z10;
                    AbstractC2855l.g(it, "it");
                    try {
                        AuthenticationHelper authenticationHelper = this.this$0.authenticationHelper;
                        if (authenticationHelper == null) {
                            AbstractC2855l.y("authenticationHelper");
                            authenticationHelper = null;
                        }
                        authenticationHelper.assertBiometricsSupport();
                        z10 = true;
                    } catch (AuthenticationException unused) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            }));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$OnCreate$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() throws NoSuchAlgorithmException, IOException, java.security.KeyStoreException, CertificateException {
                    m348invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m348invoke() throws NoSuchAlgorithmException, IOException, java.security.KeyStoreException, CertificateException {
                    this.this$0.authenticationHelper = new AuthenticationHelper(this.this$0.getReactContext(), this.this$0.getAppContext().getLegacyModuleRegistry());
                    this.this$0.hybridAESEncryptor = new HybridAESEncryptor(this.this$0.getReactContext(), this.this$0.mAESEncryptor);
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    this.this$0.keyStore = keyStore;
                }
            }));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public Context getReactContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = getReactContext().getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        AbstractC2855l.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
