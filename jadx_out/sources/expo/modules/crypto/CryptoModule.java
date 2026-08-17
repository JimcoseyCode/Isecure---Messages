package expo.modules.crypto;

import C7.d;
import C7.o;
import P8.AbstractC1382a;
import P8.C1385d;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.crypto.DigestOptions;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.AbstractC2746i;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2793j;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lexpo/modules/crypto/CryptoModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/crypto/DigestAlgorithm;", "algorithm", PointerEventHelper.POINTER_TYPE_UNKNOWN, "data", "Lexpo/modules/crypto/DigestOptions;", "options", "digestString", "(Lexpo/modules/crypto/DigestAlgorithm;Ljava/lang/String;Lexpo/modules/crypto/DigestOptions;)Ljava/lang/String;", "Lexpo/modules/kotlin/typedarray/TypedArray;", "output", "Li7/B;", "digest", "(Lexpo/modules/crypto/DigestAlgorithm;Lexpo/modules/kotlin/typedarray/TypedArray;Lexpo/modules/kotlin/typedarray/TypedArray;)V", "typedArray", "getRandomValues", "(Lexpo/modules/kotlin/typedarray/TypedArray;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Ljava/security/SecureRandom;", "secureRandom$delegate", "Lkotlin/Lazy;", "getSecureRandom", "()Ljava/security/SecureRandom;", "secureRandom", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CryptoModule extends Module {

    /* JADX INFO: renamed from: secureRandom$delegate, reason: from kotlin metadata */
    private final Lazy secureRandom = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.crypto.b
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return CryptoModule.secureRandom_delegate$lambda$0();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DigestOptions.Encoding.values().length];
            try {
                iArr[DigestOptions.Encoding.BASE64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DigestOptions.Encoding.HEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void digest(DigestAlgorithm algorithm, TypedArray output, TypedArray data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        messageDigest.update(data.toDirectBuffer());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC2855l.f(bArrDigest, "digest(...)");
        output.write(bArrDigest, 0, Math.min(bArrDigest.length, output.getByteLength()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String digestString(DigestAlgorithm algorithm, String data, DigestOptions options) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        byte[] bytes = data.getBytes(C1385d.f8858b);
        AbstractC2855l.f(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        AbstractC2855l.f(bArrDigest, "digest(...)");
        int i10 = WhenMappings.$EnumSwitchMapping$0[options.getEncoding().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return AbstractC2793j.Y(bArrDigest, PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, new Function1() { // from class: expo.modules.crypto.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoModule.digestString$lambda$7(((Byte) obj).byteValue());
                    }
                }, 30, null);
            }
            throw new C2750m();
        }
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        AbstractC2855l.d(strEncodeToString);
        return strEncodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence digestString$lambda$7(byte b10) {
        String string = Integer.toString((b10 & 255) + 256, AbstractC1382a.a(16));
        AbstractC2855l.f(string, "toString(...)");
        String strSubstring = string.substring(1);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getRandomValues(TypedArray typedArray) {
        byte[] bArr = new byte[typedArray.getByteLength()];
        getSecureRandom().nextBytes(bArr);
        typedArray.write(bArr, 0, typedArray.getByteLength());
    }

    private final SecureRandom getSecureRandom() {
        return (SecureRandom) this.secureRandom.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureRandom secureRandom_delegate$lambda$0() {
        return new SecureRandom();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoCrypto");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(DigestAlgorithm.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                cls = Object.class;
                cls2 = DigestOptions.class;
                anyType = new AnyType(new LazyKType(D.b(DigestAlgorithm.class), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DigestAlgorithm.class);
                    }
                }), converters);
            } else {
                cls = Object.class;
                cls2 = DigestOptions.class;
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType2 == null) {
                cls3 = C2735B.class;
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            } else {
                cls3 = C2735B.class;
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType3 == null) {
                cls4 = TypedArray.class;
                anyType3 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DigestOptions.class);
                    }
                }), converters);
            } else {
                cls4 = TypedArray.class;
            }
            AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("digestString", new SyncFunctionComponent("digestString", anyTypeArr, returnType, new Function1() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    DigestOptions digestOptions = (DigestOptions) objArr[2];
                    DigestAlgorithm digestAlgorithm = (DigestAlgorithm) obj;
                    return this.$receiver$inlined.digestString(digestAlgorithm, (String) obj2, digestOptions);
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(DigestAlgorithm.class), bool));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(DigestAlgorithm.class), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$AsyncFunction$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DigestAlgorithm.class);
                    }
                }), converters2);
            }
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$AsyncFunction$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$AsyncFunction$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DigestOptions.class);
                    }
                }), converters2);
            }
            AnyType[] anyTypeArr2 = {anyType4, anyType5, anyType6};
            Function1 function1 = new Function1() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$AsyncFunction$4
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    DigestOptions digestOptions = (DigestOptions) objArr[2];
                    DigestAlgorithm digestAlgorithm = (DigestAlgorithm) obj;
                    return this.$receiver$inlined.digestString(digestAlgorithm, (String) obj2, digestOptions);
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("digestStringAsync", AbstractC2855l.b(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("digestStringAsync", anyTypeArr2, function1) : AbstractC2855l.b(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("digestStringAsync", anyTypeArr2, function1) : AbstractC2855l.b(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("digestStringAsync", anyTypeArr2, function1) : AbstractC2855l.b(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("digestStringAsync", anyTypeArr2, function1) : AbstractC2855l.b(String.class, String.class) ? new StringAsyncFunctionComponent("digestStringAsync", anyTypeArr2, function1) : new UntypedAsyncFunctionComponent("digestStringAsync", anyTypeArr2, function1));
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(TypedArray.class);
                    }
                }), converters3);
            }
            AnyType[] anyTypeArr3 = {anyType7};
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType2);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getRandomValues", new SyncFunctionComponent("getRandomValues", anyTypeArr3, returnType2, new Function1() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    this.$receiver$inlined.getRandomValues((TypedArray) objArr[0]);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(DigestAlgorithm.class), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(D.b(DigestAlgorithm.class), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DigestAlgorithm.class);
                    }
                }), converters4);
            }
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(TypedArray.class);
                    }
                }), converters4);
            }
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$9
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(TypedArray.class);
                    }
                }), converters4);
            }
            AnyType[] anyTypeArr4 = {anyType8, anyType9, anyType10};
            ReturnType returnType3 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType3 == null) {
                returnType3 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType3);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("digest", new SyncFunctionComponent("digest", anyTypeArr4, returnType3, new Function1() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$Function$10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws NoSuchAlgorithmException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    TypedArray typedArray = (TypedArray) objArr[2];
                    CryptoModule cryptoModule = this.$receiver$inlined;
                    cryptoModule.digest((DigestAlgorithm) obj, (TypedArray) obj2, typedArray);
                    return C2735B.f28704a;
                }
            }));
            AnyType[] anyTypeArr5 = new AnyType[0];
            ReturnType returnType4 = returnTypeProvider.getTypes().get(D.b(cls));
            if (returnType4 == null) {
                returnType4 = new ReturnType(D.b(cls));
                returnTypeProvider.getTypes().put(D.b(cls), returnType4);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("randomUUID", new SyncFunctionComponent("randomUUID", anyTypeArr5, returnType4, new Function1() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$5$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return UUID.randomUUID().toString();
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
}
