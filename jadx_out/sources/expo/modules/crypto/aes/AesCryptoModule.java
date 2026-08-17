package expo.modules.crypto.aes;

import C7.d;
import C7.o;
import C7.q;
import P8.AbstractC1387f;
import P8.C1388g;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.crypto.aes.AesCryptoModule;
import expo.modules.crypto.aes.enums.DataFormat;
import expo.modules.crypto.aes.enums.KeyEncoding;
import expo.modules.crypto.aes.enums.KeySize;
import expo.modules.crypto.aes.extensions.ByteArrayExtensionsKt;
import expo.modules.crypto.aes.extensions.CipherExtensionsKt;
import expo.modules.crypto.aes.objects.EncryptionKey;
import expo.modules.crypto.aes.objects.SealedData;
import expo.modules.crypto.aes.records.CiphertextOptions;
import expo.modules.crypto.aes.records.DecryptOptions;
import expo.modules.crypto.aes.records.EncryptOptions;
import expo.modules.crypto.aes.records.SealedDataConfig;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
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
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.securestore.encryptors.AESEncryptor;
import i7.AbstractC2746i;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2793j;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J2\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u001aH\u0002JN\u0010\u001b\u001a\u00020\r2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00122\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00122\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000fH\u0002J\u001c\u0010 \u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, d2 = {"Lexpo/modules/crypto/aes/AesCryptoModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "rng", "Ljava/security/SecureRandom;", "getRng", "()Ljava/security/SecureRandom;", "rng$delegate", "Lkotlin/Lazy;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "encrypt", "Lexpo/modules/crypto/aes/objects/SealedData;", "plaintext", "Lexpo/modules/kotlin/types/Either;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/crypto/aes/BinaryInput;", "key", "Lexpo/modules/crypto/aes/objects/EncryptionKey;", "options", "Lexpo/modules/crypto/aes/records/EncryptOptions;", "decrypt", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sealedData", "Lexpo/modules/crypto/aes/records/DecryptOptions;", "sealedDataFromParts", AESEncryptor.IV_PROPERTY, "ciphertext", "tag", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toBytes", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AesCryptoModule extends Module {

    /* JADX INFO: renamed from: rng$delegate, reason: from kotlin metadata */
    private final Lazy rng = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.crypto.aes.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return AesCryptoModule.rng_delegate$lambda$0();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyEncoding.values().length];
            try {
                iArr[KeyEncoding.BASE64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyEncoding.HEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object decrypt(SealedData sealedData, EncryptionKey key, DecryptOptions options) throws DecryptionFailed {
        Either<byte[], String> additionalData;
        SecretKey cryptoKey = key.getCryptoKey();
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, cryptoKey, new GCMParameterSpec(sealedData.getTagSize() * 8, sealedData.getIvBytes()));
            if (options != null && (additionalData = options.getAdditionalData()) != null) {
                cipher.updateAAD(toBytes(additionalData));
            }
            AbstractC2855l.d(cipher);
            byte[] bArrArray = CipherExtensionsKt.decrypt(cipher, sealedData).array();
            AbstractC2855l.f(bArrArray, "array(...)");
            return ByteArrayExtensionsKt.formatted(bArrArray, options != null ? options.getOutput() : null);
        } catch (Throwable th) {
            throw new DecryptionFailed(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SealedData encrypt(Either<byte[], String> plaintext, EncryptionKey key, EncryptOptions options) throws EncryptionFailed {
        Either<byte[], String> additionalData;
        SecretKey cryptoKey = key.getCryptoKey();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(toBytes(plaintext));
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, cryptoKey, options != null ? options.gcmParameterSpec$expo_crypto_release(getRng()) : null);
            if (options != null && (additionalData = options.getAdditionalData()) != null) {
                cipher.updateAAD(toBytes(additionalData));
            }
            AbstractC2855l.d(cipher);
            AbstractC2855l.d(byteBufferWrap);
            return CipherExtensionsKt.encrypt(cipher, byteBufferWrap);
        } catch (Throwable th) {
            throw new EncryptionFailed(th);
        }
    }

    private final SecureRandom getRng() {
        return (SecureRandom) this.rng.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureRandom rng_delegate$lambda$0() {
        return new SecureRandom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SealedData sealedDataFromParts(Either<byte[], String> iv, Either<byte[], String> ciphertext, Either<byte[], Integer> tag) {
        byte[] bytes = toBytes(iv);
        byte[] bytes2 = toBytes(ciphertext);
        if (tag != null) {
            Class cls = Integer.TYPE;
            if (tag.isSecondType(D.b(cls))) {
                return new SealedData(bytes, bytes2, tag.getSecondType(D.b(cls)).intValue());
            }
        }
        if (tag == null || !tag.isFirstType(D.b(byte[].class))) {
            return new SealedData(bytes, bytes2, 16);
        }
        byte[] firstType = tag.getFirstType(D.b(byte[].class));
        return new SealedData(bytes, AbstractC2793j.s(bytes2, firstType), firstType.length);
    }

    private final byte[] toBytes(Either<byte[], String> either) {
        if (either.isFirstType(D.b(byte[].class))) {
            return either.getFirstType(D.b(byte[].class));
        }
        byte[] bArrDecode = Base64.decode(either.getSecondType(D.b(String.class)), 2);
        AbstractC2855l.f(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0871 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0898 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08b9 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08bf A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0916 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x093d A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x095e A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0964 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x09bb A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x09e4 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0a07 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0a0d A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0a79 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0adc A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0b3d A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0b89 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024f A[Catch: all -> 0x0095, TRY_ENTER, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x004d, B:5:0x007c, B:9:0x009e, B:11:0x00b3, B:13:0x00ca, B:15:0x00e1, B:17:0x00fc, B:20:0x0115, B:34:0x0150, B:36:0x0172, B:38:0x0191, B:40:0x01a6, B:42:0x01bd, B:44:0x01d2, B:46:0x01e9, B:48:0x01f8, B:63:0x0238, B:66:0x024f, B:68:0x026b, B:70:0x0281, B:72:0x02a1, B:74:0x02ba, B:76:0x02d1, B:98:0x0376, B:100:0x0398, B:101:0x03aa, B:103:0x03bf, B:105:0x03d6, B:107:0x03e5, B:121:0x0420, B:124:0x0433, B:145:0x04b9, B:147:0x04db, B:148:0x04ed, B:150:0x0502, B:151:0x0514, B:153:0x0523, B:167:0x055e, B:169:0x0595, B:170:0x05a9, B:172:0x05e1, B:174:0x05fa, B:176:0x0611, B:178:0x062f, B:179:0x0643, B:181:0x066b, B:183:0x0682, B:185:0x0697, B:187:0x06ae, B:189:0x06c5, B:191:0x06e0, B:193:0x06f4, B:194:0x0708, B:196:0x0736, B:197:0x0748, B:199:0x075f, B:200:0x0773, B:202:0x0787, B:203:0x079b, B:205:0x07c5, B:206:0x07d7, B:208:0x07ec, B:209:0x07fe, B:211:0x080f, B:226:0x084f, B:228:0x0871, B:229:0x0883, B:231:0x0898, B:232:0x08aa, B:234:0x08b9, B:248:0x08f4, B:250:0x0916, B:251:0x0928, B:253:0x093d, B:254:0x094f, B:256:0x095e, B:270:0x0999, B:272:0x09bb, B:273:0x09cd, B:275:0x09e4, B:276:0x09f8, B:278:0x0a07, B:292:0x0a42, B:294:0x0a79, B:295:0x0a8d, B:297:0x0adc, B:298:0x0af0, B:300:0x0b3d, B:301:0x0b51, B:279:0x0a0d, B:281:0x0a13, B:282:0x0a19, B:284:0x0a1f, B:285:0x0a25, B:287:0x0a2b, B:288:0x0a31, B:290:0x0a37, B:291:0x0a3d, B:257:0x0964, B:259:0x096a, B:260:0x0970, B:262:0x0976, B:263:0x097c, B:265:0x0982, B:266:0x0988, B:268:0x098e, B:269:0x0994, B:235:0x08bf, B:237:0x08c5, B:238:0x08cb, B:240:0x08d1, B:241:0x08d7, B:243:0x08dd, B:244:0x08e3, B:246:0x08e9, B:247:0x08ef, B:213:0x0818, B:215:0x081e, B:216:0x0824, B:218:0x082a, B:219:0x0830, B:221:0x0836, B:222:0x083c, B:224:0x0844, B:225:0x084a, B:304:0x0b81, B:305:0x0b88, B:154:0x0529, B:156:0x052f, B:157:0x0535, B:159:0x053b, B:160:0x0541, B:162:0x0547, B:163:0x054d, B:165:0x0553, B:166:0x0559, B:125:0x0442, B:127:0x045b, B:128:0x046d, B:130:0x047c, B:132:0x0483, B:134:0x0489, B:135:0x048f, B:137:0x0495, B:138:0x049b, B:140:0x04a1, B:141:0x04a7, B:143:0x04ad, B:144:0x04b3, B:108:0x03eb, B:110:0x03f1, B:111:0x03f7, B:113:0x03fd, B:114:0x0403, B:116:0x0409, B:117:0x040f, B:119:0x0415, B:120:0x041b, B:77:0x02ec, B:79:0x0309, B:81:0x0328, B:83:0x0339, B:85:0x0340, B:87:0x0346, B:88:0x034c, B:90:0x0352, B:91:0x0358, B:93:0x035e, B:94:0x0364, B:96:0x036a, B:97:0x0370, B:306:0x0b89, B:307:0x0b8f, B:50:0x0201, B:52:0x0207, B:53:0x020d, B:55:0x0213, B:56:0x0219, B:58:0x021f, B:59:0x0225, B:61:0x022d, B:62:0x0233, B:21:0x011b, B:23:0x0121, B:24:0x0127, B:26:0x012d, B:27:0x0133, B:29:0x0139, B:30:0x013f, B:32:0x0145, B:33:0x014b), top: B:310:0x004d }] */
    @Override // expo.modules.kotlin.modules.Module
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        String str;
        Class cls4;
        Class cls5;
        Class cls6;
        Object obj;
        Boolean bool;
        Boolean bool2;
        Object obj2;
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent floatAsyncFunctionComponent;
        Module module;
        ReturnTypeProvider returnTypeProvider;
        ClassComponentBuilder classComponentBuilder;
        Boolean bool3;
        String str2;
        Class cls7;
        Class cls8;
        Class cls9;
        AsyncFunctionComponent intAsyncFunctionComponent;
        Boolean bool4;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        ClassComponentBuilder classComponentBuilder2;
        Class cls10;
        Object obj3;
        String str3;
        Object obj4;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent floatAsyncFunctionComponent2;
        AnyType anyType;
        AnyType anyType2;
        AnyType anyType3;
        AnyType anyType4;
        AnyType anyType5;
        AnyType anyType6;
        ReturnType returnType;
        ReturnType returnType2;
        ReturnType returnType3;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoCryptoAES");
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(Either.class);
            Boolean bool5 = Boolean.FALSE;
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool5));
            if (anyType7 == null) {
                cls = DataFormat.class;
                cls2 = Integer.class;
                cls3 = Either.class;
                anyType7 = new AnyType(new LazyKType(D.b(Either.class), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.q(Either.class, aVar.d(D.o(byte[].class)), aVar.d(D.o(String.class)));
                    }
                }), converters);
            } else {
                cls = DataFormat.class;
                cls2 = Integer.class;
                cls3 = Either.class;
            }
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(EncryptionKey.class), bool5));
            if (anyType8 == null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                anyType8 = new AnyType(new LazyKType(D.b(EncryptionKey.class), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(EncryptionKey.class);
                    }
                }), converters);
            } else {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
            }
            d dVarB2 = D.b(EncryptOptions.class);
            Boolean bool6 = Boolean.TRUE;
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool6));
            if (anyType9 == null) {
                str = "get";
                cls4 = EncryptionKey.class;
                anyType9 = new AnyType(new LazyKType(D.b(EncryptOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(EncryptOptions.class);
                    }
                }), converters);
            } else {
                str = "get";
                cls4 = EncryptionKey.class;
            }
            AnyType[] anyTypeArr = {anyType7, anyType8, anyType9};
            Function1 function1 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$4
                @Override // kotlin.jvm.functions.Function1
                public final SealedData invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj5 = objArr[0];
                    Object obj6 = objArr[1];
                    EncryptOptions encryptOptions = (EncryptOptions) objArr[2];
                    Either either = (Either) obj5;
                    return this.$receiver$inlined.encrypt(either, (EncryptionKey) obj6, encryptOptions);
                }
            };
            Class cls11 = Integer.TYPE;
            boolean zB = AbstractC2855l.b(SealedData.class, cls11);
            Class cls12 = Float.TYPE;
            Class cls13 = Double.TYPE;
            Class cls14 = Boolean.TYPE;
            moduleDefinitionBuilder.getAsyncFunctions().put("encryptAsync", zB ? new IntAsyncFunctionComponent("encryptAsync", anyTypeArr, function1) : AbstractC2855l.b(SealedData.class, cls14) ? new BoolAsyncFunctionComponent("encryptAsync", anyTypeArr, function1) : AbstractC2855l.b(SealedData.class, cls13) ? new DoubleAsyncFunctionComponent("encryptAsync", anyTypeArr, function1) : AbstractC2855l.b(SealedData.class, cls12) ? new FloatAsyncFunctionComponent("encryptAsync", anyTypeArr, function1) : AbstractC2855l.b(SealedData.class, String.class) ? new StringAsyncFunctionComponent("encryptAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("encryptAsync", anyTypeArr, function1));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(SealedData.class), bool5));
            if (anyType10 == null) {
                cls6 = SealedData.class;
                cls5 = KeySize.class;
                obj = String.class;
                anyType10 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SealedData.class);
                    }
                }), converters2);
            } else {
                cls5 = KeySize.class;
                cls6 = SealedData.class;
                obj = String.class;
            }
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool5));
            if (anyType11 == null) {
                bool = bool5;
                anyType11 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(EncryptionKey.class);
                    }
                }), converters2);
            } else {
                bool = bool5;
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(DecryptOptions.class), bool6));
            if (anyType12 == null) {
                bool2 = bool6;
                anyType12 = new AnyType(new LazyKType(D.b(DecryptOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(DecryptOptions.class);
                    }
                }), converters2);
            } else {
                bool2 = bool6;
            }
            AnyType[] anyTypeArr2 = {anyType10, anyType11, anyType12};
            Function1 function12 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj5 = objArr[0];
                    Object obj6 = objArr[1];
                    DecryptOptions decryptOptions = (DecryptOptions) objArr[2];
                    SealedData sealedData = (SealedData) obj5;
                    return this.$receiver$inlined.decrypt(sealedData, (EncryptionKey) obj6, decryptOptions);
                }
            };
            if (AbstractC2855l.b(Object.class, cls11)) {
                floatAsyncFunctionComponent = new IntAsyncFunctionComponent("decryptAsync", anyTypeArr2, function12);
            } else if (AbstractC2855l.b(Object.class, cls14)) {
                floatAsyncFunctionComponent = new BoolAsyncFunctionComponent("decryptAsync", anyTypeArr2, function12);
            } else if (AbstractC2855l.b(Object.class, cls13)) {
                floatAsyncFunctionComponent = new DoubleAsyncFunctionComponent("decryptAsync", anyTypeArr2, function12);
            } else {
                if (!AbstractC2855l.b(Object.class, cls12)) {
                    obj2 = obj;
                    stringAsyncFunctionComponent = AbstractC2855l.b(Object.class, obj2) ? new StringAsyncFunctionComponent("decryptAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("decryptAsync", anyTypeArr2, function12);
                    moduleDefinitionBuilder.getAsyncFunctions().put("decryptAsync", stringAsyncFunctionComponent);
                    d dVarB3 = D.b(cls4);
                    module = moduleDefinitionBuilder.getModule();
                    if (module != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    AppContext appContext = module.getAppContext();
                    Boolean bool7 = bool;
                    AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool7));
                    ClassComponentBuilder classComponentBuilder3 = new ClassComponentBuilder(appContext, "EncryptionKey", dVarB3, anyType13 == null ? new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$Class$1
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(EncryptionKey.class);
                        }
                    }), null) : anyType13, moduleDefinitionBuilder.getConverters());
                    AnyType[] anyTypeArr3 = new AnyType[0];
                    ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
                    ReturnType returnType4 = returnTypeProvider2.getTypes().get(D.b(Object.class));
                    if (returnType4 == null) {
                        returnType4 = new ReturnType(D.b(Object.class));
                        returnTypeProvider = returnTypeProvider2;
                        returnTypeProvider2.getTypes().put(D.b(Object.class), returnType4);
                    } else {
                        returnTypeProvider = returnTypeProvider2;
                    }
                    classComponentBuilder3.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr3, returnType4, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$Constructor$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] it) throws Exceptions.IllegalArgument {
                            AbstractC2855l.g(it, "it");
                            throw new Exceptions.IllegalArgument("EncryptionKey constructor cannot be used directly", null, 2, null);
                        }
                    }));
                    Class cls15 = cls5;
                    if (AbstractC2855l.b(cls15, Promise.class)) {
                        intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("generate", new AnyType[0], new Function2() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$1
                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(Object[] objArr, Promise promise) {
                                AbstractC2855l.g(objArr, "<unused var>");
                                AbstractC2855l.g(promise, "promise");
                                new EncryptionKey((KeySize) promise);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6) {
                                invoke((Object[]) obj5, (Promise) obj6);
                                return C2735B.f28704a;
                            }
                        });
                        classComponentBuilder = classComponentBuilder3;
                        cls7 = Object.class;
                        cls8 = cls15;
                        bool3 = bool2;
                        cls9 = cls4;
                        str2 = "Required value was null.";
                    } else {
                        TypeConverterProvider converters3 = classComponentBuilder3.getConverters();
                        classComponentBuilder = classComponentBuilder3;
                        bool3 = bool2;
                        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls15), bool3));
                        if (anyType14 == null) {
                            cls8 = cls15;
                            str2 = "Required value was null.";
                            cls7 = Object.class;
                            anyType14 = new AnyType(new LazyKType(D.b(cls8), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$2
                                @Override // w7.InterfaceC3487a
                                public final o invoke() {
                                    return D.f(KeySize.class);
                                }
                            }), converters3);
                        } else {
                            str2 = "Required value was null.";
                            cls7 = Object.class;
                            cls8 = cls15;
                        }
                        AnyType[] anyTypeArr4 = {anyType14};
                        Function1 function13 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$3
                            @Override // kotlin.jvm.functions.Function1
                            public final EncryptionKey invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                KeySize keySize = (KeySize) objArr[0];
                                if (keySize == null) {
                                    keySize = KeySize.AES256;
                                }
                                return new EncryptionKey(keySize);
                            }
                        };
                        cls9 = cls4;
                        intAsyncFunctionComponent = AbstractC2855l.b(cls9, cls11) ? new IntAsyncFunctionComponent("generate", anyTypeArr4, function13) : AbstractC2855l.b(cls9, cls14) ? new BoolAsyncFunctionComponent("generate", anyTypeArr4, function13) : AbstractC2855l.b(cls9, cls13) ? new DoubleAsyncFunctionComponent("generate", anyTypeArr4, function13) : AbstractC2855l.b(cls9, cls12) ? new FloatAsyncFunctionComponent("generate", anyTypeArr4, function13) : AbstractC2855l.b(cls9, obj2) ? new StringAsyncFunctionComponent("generate", anyTypeArr4, function13) : new UntypedAsyncFunctionComponent("generate", anyTypeArr4, function13);
                    }
                    classComponentBuilder.getStaticAsyncFunctions().put("generate", intAsyncFunctionComponent);
                    TypeConverterProvider converters4 = classComponentBuilder.getConverters();
                    AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool7));
                    if (anyType15 == null) {
                        anyType15 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$4
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                q.a aVar = q.f518c;
                                return D.q(Either.class, aVar.d(D.o(byte[].class)), aVar.d(D.o(String.class)));
                            }
                        }), converters4);
                    }
                    AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(D.b(KeyEncoding.class), bool3));
                    if (anyType16 == null) {
                        bool4 = bool3;
                        anyType16 = new AnyType(new LazyKType(D.b(KeyEncoding.class), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$5
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                return D.f(KeyEncoding.class);
                            }
                        }), converters4);
                    } else {
                        bool4 = bool3;
                    }
                    AnyType[] anyTypeArr5 = {anyType15, anyType16};
                    Function1 function14 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$6
                        @Override // kotlin.jvm.functions.Function1
                        public final EncryptionKey invoke(Object[] objArr) throws MissingStringEncodingException {
                            byte[] bArrDecode;
                            AbstractC2855l.g(objArr, "<destruct>");
                            Object obj5 = objArr[0];
                            KeyEncoding keyEncoding = (KeyEncoding) objArr[1];
                            Either either = (Either) obj5;
                            if (either.isFirstType(D.b(byte[].class))) {
                                bArrDecode = (byte[]) either.getFirstType(D.b(byte[].class));
                            } else {
                                String str4 = (String) either.getSecondType(D.b(String.class));
                                int i10 = keyEncoding == null ? -1 : AesCryptoModule.WhenMappings.$EnumSwitchMapping$0[keyEncoding.ordinal()];
                                if (i10 == -1) {
                                    throw new MissingStringEncodingException();
                                }
                                if (i10 == 1) {
                                    bArrDecode = Base64.decode(str4, 2);
                                } else {
                                    if (i10 != 2) {
                                        throw new C2750m();
                                    }
                                    String lowerCase = str4.toLowerCase(Locale.ROOT);
                                    AbstractC2855l.f(lowerCase, "toLowerCase(...)");
                                    bArrDecode = AbstractC1387f.i(P8.q.P0(lowerCase, "0x", null, 2, null), C1388g.f8880d.a());
                                }
                            }
                            AbstractC2855l.d(bArrDecode);
                            return new EncryptionKey(bArrDecode);
                        }
                    };
                    classComponentBuilder.getStaticAsyncFunctions().put("import", AbstractC2855l.b(cls9, cls11) ? new IntAsyncFunctionComponent("import", anyTypeArr5, function14) : AbstractC2855l.b(cls9, cls14) ? new BoolAsyncFunctionComponent("import", anyTypeArr5, function14) : AbstractC2855l.b(cls9, cls13) ? new DoubleAsyncFunctionComponent("import", anyTypeArr5, function14) : AbstractC2855l.b(cls9, cls12) ? new FloatAsyncFunctionComponent("import", anyTypeArr5, function14) : AbstractC2855l.b(cls9, obj2) ? new StringAsyncFunctionComponent("import", anyTypeArr5, function14) : new UntypedAsyncFunctionComponent("import", anyTypeArr5, function14));
                    if (AbstractC2855l.b(cls9, Promise.class)) {
                        intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("bytes", new AnyType[0], new Function2() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$1
                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(Object[] objArr, Promise promise) {
                                AbstractC2855l.g(objArr, "<unused var>");
                                AbstractC2855l.g(promise, "promise");
                                ((EncryptionKey) promise).getBytes();
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6) {
                                invoke((Object[]) obj5, (Promise) obj6);
                                return C2735B.f28704a;
                            }
                        });
                    } else {
                        TypeConverterProvider converters5 = classComponentBuilder.getConverters();
                        AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool7));
                        if (anyType17 == null) {
                            anyType17 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$2
                                @Override // w7.InterfaceC3487a
                                public final o invoke() {
                                    return D.o(EncryptionKey.class);
                                }
                            }), converters5);
                        }
                        AnyType[] anyTypeArr6 = {anyType17};
                        Function1 function15 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$3
                            @Override // kotlin.jvm.functions.Function1
                            public final byte[] invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                return ((EncryptionKey) objArr[0]).getBytes();
                            }
                        };
                        intAsyncFunctionComponent2 = AbstractC2855l.b(byte[].class, cls11) ? new IntAsyncFunctionComponent("bytes", anyTypeArr6, function15) : AbstractC2855l.b(byte[].class, cls14) ? new BoolAsyncFunctionComponent("bytes", anyTypeArr6, function15) : AbstractC2855l.b(byte[].class, cls13) ? new DoubleAsyncFunctionComponent("bytes", anyTypeArr6, function15) : AbstractC2855l.b(byte[].class, cls12) ? new FloatAsyncFunctionComponent("bytes", anyTypeArr6, function15) : AbstractC2855l.b(byte[].class, obj2) ? new StringAsyncFunctionComponent("bytes", anyTypeArr6, function15) : new UntypedAsyncFunctionComponent("bytes", anyTypeArr6, function15);
                    }
                    classComponentBuilder.getAsyncFunctions().put("bytes", intAsyncFunctionComponent2);
                    TypeConverterProvider converters6 = classComponentBuilder.getConverters();
                    AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool7));
                    if (anyType18 == null) {
                        anyType18 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$4
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                return D.o(EncryptionKey.class);
                            }
                        }), converters6);
                    }
                    AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(D.b(KeyEncoding.class), bool7));
                    if (anyType19 == null) {
                        anyType19 = new AnyType(new LazyKType(D.b(KeyEncoding.class), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$5
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                return D.o(KeyEncoding.class);
                            }
                        }), converters6);
                    }
                    AnyType[] anyTypeArr7 = {anyType18, anyType19};
                    Function1 function16 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$6
                        @Override // kotlin.jvm.functions.Function1
                        public final String invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            Object obj5 = objArr[0];
                            return ByteArrayExtensionsKt.encoded(((EncryptionKey) obj5).getBytes(), (KeyEncoding) objArr[1]);
                        }
                    };
                    classComponentBuilder.getAsyncFunctions().put("encoded", AbstractC2855l.b(obj2, cls11) ? new IntAsyncFunctionComponent("encoded", anyTypeArr7, function16) : AbstractC2855l.b(obj2, cls14) ? new BoolAsyncFunctionComponent("encoded", anyTypeArr7, function16) : AbstractC2855l.b(obj2, cls13) ? new DoubleAsyncFunctionComponent("encoded", anyTypeArr7, function16) : AbstractC2855l.b(obj2, cls12) ? new FloatAsyncFunctionComponent("encoded", anyTypeArr7, function16) : AbstractC2855l.b(obj2, obj2) ? new StringAsyncFunctionComponent("encoded", anyTypeArr7, function16) : new UntypedAsyncFunctionComponent("encoded", anyTypeArr7, function16));
                    PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "size");
                    AnyType[] anyTypeArr8 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
                    ReturnType returnType5 = returnTypeProvider.getTypes().get(D.b(cls8));
                    if (returnType5 == null) {
                        returnType5 = new ReturnType(D.b(cls8));
                        returnTypeProvider.getTypes().put(D.b(cls8), returnType5);
                    }
                    String str4 = str;
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(str4, anyTypeArr8, returnType5, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$8$$inlined$Property$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] it) {
                            AbstractC2855l.g(it, "it");
                            return ((EncryptionKey) it[0]).getKeySize();
                        }
                    });
                    syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
                    syncFunctionComponent.setCanTakeOwner(true);
                    propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
                    classComponentBuilder.getProperties().put("size", propertyComponentBuilderWithThis);
                    moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
                    d dVarB4 = D.b(cls6);
                    Module module2 = moduleDefinitionBuilder.getModule();
                    if (module2 == null) {
                        throw new IllegalArgumentException(str2);
                    }
                    AppContext appContext2 = module2.getAppContext();
                    AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool7));
                    ClassComponentBuilder classComponentBuilder4 = new ClassComponentBuilder(appContext2, "SealedData", dVarB4, anyType20 == null ? new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$$inlined$Class$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(SealedData.class);
                        }
                    }), null) : anyType20, moduleDefinitionBuilder.getConverters());
                    AnyType[] anyTypeArr9 = new AnyType[0];
                    ReturnType returnType6 = returnTypeProvider.getTypes().get(D.b(cls7));
                    if (returnType6 == null) {
                        returnType6 = new ReturnType(D.b(cls7));
                        returnTypeProvider.getTypes().put(D.b(cls7), returnType6);
                    }
                    classComponentBuilder4.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr9, returnType6, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Constructor$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] it) throws Exceptions.IllegalArgument {
                            AbstractC2855l.g(it, "it");
                            throw new Exceptions.IllegalArgument("SealedData constructor cannot be used directly", null, 2, null);
                        }
                    }));
                    TypeConverterProvider converters7 = classComponentBuilder4.getConverters();
                    AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool7));
                    if (anyType21 == null) {
                        classComponentBuilder2 = classComponentBuilder4;
                        anyType21 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$1
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                q.a aVar = q.f518c;
                                return D.q(Either.class, aVar.d(D.o(byte[].class)), aVar.d(D.o(String.class)));
                            }
                        }), converters7);
                    } else {
                        classComponentBuilder2 = classComponentBuilder4;
                    }
                    AnyType anyType22 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool7));
                    if (anyType22 == null) {
                        cls10 = byte[].class;
                        anyType22 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$2
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                q.a aVar = q.f518c;
                                return D.q(Either.class, aVar.d(D.o(byte[].class)), aVar.d(D.o(String.class)));
                            }
                        }), converters7);
                    } else {
                        cls10 = byte[].class;
                    }
                    Boolean bool8 = bool4;
                    AnyType anyType23 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool8));
                    if (anyType23 == null) {
                        AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$3 aesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$3 = new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$3
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                q.a aVar = q.f518c;
                                return D.h(Either.class, aVar.d(D.o(byte[].class)), aVar.d(D.o(Integer.TYPE)));
                            }
                        };
                        str3 = str4;
                        d dVarB5 = D.b(cls3);
                        obj3 = obj2;
                        anyType23 = new AnyType(new LazyKType(dVarB5, true, aesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$3), converters7);
                    } else {
                        obj3 = obj2;
                        str3 = str4;
                    }
                    AnyType[] anyTypeArr10 = {anyType21, anyType22, anyType23};
                    ReturnType returnType7 = returnTypeProvider.getTypes().get(D.b(cls6));
                    if (returnType7 == null) {
                        returnType7 = new ReturnType(D.b(cls6));
                        returnTypeProvider.getTypes().put(D.b(cls6), returnType7);
                    }
                    classComponentBuilder2.getStaticSyncFunctions().put("fromParts", new SyncFunctionComponent("fromParts", anyTypeArr10, returnType7, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            Object obj5 = objArr[0];
                            Object obj6 = objArr[1];
                            Either either = (Either) objArr[2];
                            Either either2 = (Either) obj5;
                            return this.$receiver$inlined.sealedDataFromParts(either2, (Either) obj6, either);
                        }
                    }));
                    TypeConverterProvider converters8 = classComponentBuilder2.getConverters();
                    AnyType anyType24 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls10), bool7));
                    if (anyType24 == null) {
                        anyType24 = new AnyType(new LazyKType(D.b(cls10), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$5
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                return D.o(byte[].class);
                            }
                        }), converters8);
                    }
                    AnyType anyType25 = anyTypeProvider.getTypesMap().get(new Pair(D.b(SealedDataConfig.class), bool8));
                    if (anyType25 == null) {
                        anyType25 = new AnyType(new LazyKType(D.b(SealedDataConfig.class), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$6
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                return D.f(SealedDataConfig.class);
                            }
                        }), converters8);
                    }
                    AnyType[] anyTypeArr11 = {anyType24, anyType25};
                    ReturnType returnType8 = returnTypeProvider.getTypes().get(D.b(cls6));
                    if (returnType8 == null) {
                        returnType8 = new ReturnType(D.b(cls6));
                        returnTypeProvider.getTypes().put(D.b(cls6), returnType8);
                    }
                    classComponentBuilder2.getStaticSyncFunctions().put("fromCombined", new SyncFunctionComponent("fromCombined", anyTypeArr11, returnType8, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            Object obj5 = objArr[0];
                            SealedDataConfig sealedDataConfig = (SealedDataConfig) objArr[1];
                            byte[] bArr = (byte[]) obj5;
                            if (sealedDataConfig == null) {
                                sealedDataConfig = new SealedDataConfig(0, 0, 3, null);
                            }
                            return new SealedData(sealedDataConfig, bArr);
                        }
                    }));
                    TypeConverterProvider converters9 = classComponentBuilder2.getConverters();
                    AnyType anyType26 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool7));
                    if (anyType26 == null) {
                        anyType26 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$1
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                return D.o(SealedData.class);
                            }
                        }), converters9);
                    }
                    AnyType anyType27 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool8));
                    if (anyType27 == null) {
                        anyType27 = new AnyType(new LazyKType(D.b(cls), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$2
                            @Override // w7.InterfaceC3487a
                            public final o invoke() {
                                return D.f(DataFormat.class);
                            }
                        }), converters9);
                    }
                    AnyType[] anyTypeArr12 = {anyType26, anyType27};
                    Function1 function17 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            Object obj5 = objArr[0];
                            return ByteArrayExtensionsKt.formatted(((SealedData) obj5).getIvBytes(), (DataFormat) objArr[1]);
                        }
                    };
                    Class cls16 = cls7;
                    if (AbstractC2855l.b(cls16, cls11)) {
                        floatAsyncFunctionComponent2 = new IntAsyncFunctionComponent(AESEncryptor.IV_PROPERTY, anyTypeArr12, function17);
                    } else if (AbstractC2855l.b(cls16, cls14)) {
                        floatAsyncFunctionComponent2 = new BoolAsyncFunctionComponent(AESEncryptor.IV_PROPERTY, anyTypeArr12, function17);
                    } else if (AbstractC2855l.b(cls16, cls13)) {
                        floatAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent(AESEncryptor.IV_PROPERTY, anyTypeArr12, function17);
                    } else {
                        if (!AbstractC2855l.b(cls16, cls12)) {
                            obj4 = obj3;
                            stringAsyncFunctionComponent2 = AbstractC2855l.b(cls16, obj4) ? new StringAsyncFunctionComponent(AESEncryptor.IV_PROPERTY, anyTypeArr12, function17) : new UntypedAsyncFunctionComponent(AESEncryptor.IV_PROPERTY, anyTypeArr12, function17);
                            classComponentBuilder2.getAsyncFunctions().put(AESEncryptor.IV_PROPERTY, stringAsyncFunctionComponent2);
                            TypeConverterProvider converters10 = classComponentBuilder2.getConverters();
                            anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool7));
                            if (anyType == null) {
                                anyType = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$4
                                    @Override // w7.InterfaceC3487a
                                    public final o invoke() {
                                        return D.o(SealedData.class);
                                    }
                                }), converters10);
                            }
                            anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool8));
                            if (anyType2 == null) {
                                anyType2 = new AnyType(new LazyKType(D.b(cls), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$5
                                    @Override // w7.InterfaceC3487a
                                    public final o invoke() {
                                        return D.f(DataFormat.class);
                                    }
                                }), converters10);
                            }
                            AnyType[] anyTypeArr13 = {anyType, anyType2};
                            Function1 function18 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] objArr) {
                                    AbstractC2855l.g(objArr, "<destruct>");
                                    Object obj5 = objArr[0];
                                    return ByteArrayExtensionsKt.formatted(((SealedData) obj5).getTagBytes(), (DataFormat) objArr[1]);
                                }
                            };
                            classComponentBuilder2.getAsyncFunctions().put("tag", !AbstractC2855l.b(cls16, cls11) ? new IntAsyncFunctionComponent("tag", anyTypeArr13, function18) : AbstractC2855l.b(cls16, cls14) ? new BoolAsyncFunctionComponent("tag", anyTypeArr13, function18) : AbstractC2855l.b(cls16, cls13) ? new DoubleAsyncFunctionComponent("tag", anyTypeArr13, function18) : AbstractC2855l.b(cls16, cls12) ? new FloatAsyncFunctionComponent("tag", anyTypeArr13, function18) : AbstractC2855l.b(cls16, obj4) ? new StringAsyncFunctionComponent("tag", anyTypeArr13, function18) : new UntypedAsyncFunctionComponent("tag", anyTypeArr13, function18));
                            TypeConverterProvider converters11 = classComponentBuilder2.getConverters();
                            anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool7));
                            if (anyType3 == null) {
                                anyType3 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$7
                                    @Override // w7.InterfaceC3487a
                                    public final o invoke() {
                                        return D.o(SealedData.class);
                                    }
                                }), converters11);
                            }
                            anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool8));
                            if (anyType4 == null) {
                                anyType4 = new AnyType(new LazyKType(D.b(cls), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$8
                                    @Override // w7.InterfaceC3487a
                                    public final o invoke() {
                                        return D.f(DataFormat.class);
                                    }
                                }), converters11);
                            }
                            AnyType[] anyTypeArr14 = {anyType3, anyType4};
                            Function1 function19 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] objArr) {
                                    AbstractC2855l.g(objArr, "<destruct>");
                                    Object obj5 = objArr[0];
                                    return ByteArrayExtensionsKt.formatted(((SealedData) obj5).getCombinedArray(), (DataFormat) objArr[1]);
                                }
                            };
                            classComponentBuilder2.getAsyncFunctions().put("combined", !AbstractC2855l.b(cls16, cls11) ? new IntAsyncFunctionComponent("combined", anyTypeArr14, function19) : AbstractC2855l.b(cls16, cls14) ? new BoolAsyncFunctionComponent("combined", anyTypeArr14, function19) : AbstractC2855l.b(cls16, cls13) ? new DoubleAsyncFunctionComponent("combined", anyTypeArr14, function19) : AbstractC2855l.b(cls16, cls12) ? new FloatAsyncFunctionComponent("combined", anyTypeArr14, function19) : AbstractC2855l.b(cls16, obj4) ? new StringAsyncFunctionComponent("combined", anyTypeArr14, function19) : new UntypedAsyncFunctionComponent("combined", anyTypeArr14, function19));
                            TypeConverterProvider converters12 = classComponentBuilder2.getConverters();
                            anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool7));
                            if (anyType5 == null) {
                                anyType5 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$10
                                    @Override // w7.InterfaceC3487a
                                    public final o invoke() {
                                        return D.o(SealedData.class);
                                    }
                                }), converters12);
                            }
                            anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CiphertextOptions.class), bool8));
                            if (anyType6 == null) {
                                anyType6 = new AnyType(new LazyKType(D.b(CiphertextOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$11
                                    @Override // w7.InterfaceC3487a
                                    public final o invoke() {
                                        return D.f(CiphertextOptions.class);
                                    }
                                }), converters12);
                            }
                            AnyType[] anyTypeArr15 = {anyType5, anyType6};
                            Function1 function110 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$12
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] objArr) {
                                    AbstractC2855l.g(objArr, "<destruct>");
                                    Object obj5 = objArr[0];
                                    CiphertextOptions ciphertextOptions = (CiphertextOptions) objArr[1];
                                    SealedData sealedData = (SealedData) obj5;
                                    if (ciphertextOptions == null) {
                                        ciphertextOptions = new CiphertextOptions(false, null, 3, null);
                                    }
                                    boolean includeTag = ciphertextOptions.getIncludeTag();
                                    return ByteArrayExtensionsKt.formatted(sealedData.ciphertextBytes(includeTag), ciphertextOptions.getOutputFormat());
                                }
                            };
                            classComponentBuilder2.getAsyncFunctions().put("ciphertext", !AbstractC2855l.b(cls16, cls11) ? new IntAsyncFunctionComponent("ciphertext", anyTypeArr15, function110) : AbstractC2855l.b(cls16, cls14) ? new BoolAsyncFunctionComponent("ciphertext", anyTypeArr15, function110) : AbstractC2855l.b(cls16, cls13) ? new DoubleAsyncFunctionComponent("ciphertext", anyTypeArr15, function110) : AbstractC2855l.b(cls16, cls12) ? new FloatAsyncFunctionComponent("ciphertext", anyTypeArr15, function110) : AbstractC2855l.b(cls16, obj4) ? new StringAsyncFunctionComponent("ciphertext", anyTypeArr15, function110) : new UntypedAsyncFunctionComponent("ciphertext", anyTypeArr15, function110));
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "combinedSize");
                            AnyType[] anyTypeArr16 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
                            returnType = returnTypeProvider.getTypes().get(D.b(cls2));
                            if (returnType == null) {
                                returnType = new ReturnType(D.b(cls2));
                                returnTypeProvider.getTypes().put(D.b(cls2), returnType);
                            }
                            String str5 = str3;
                            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(str5, anyTypeArr16, returnType, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    AbstractC2855l.g(it, "it");
                                    return Integer.valueOf(((SealedData) it[0]).getCombinedSize());
                                }
                            });
                            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
                            syncFunctionComponent2.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
                            classComponentBuilder2.getProperties().put("combinedSize", propertyComponentBuilderWithThis2);
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis3 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "ivSize");
                            AnyType[] anyTypeArr17 = {new AnyType(propertyComponentBuilderWithThis3.getThisType(), null, 2, null)};
                            returnType2 = returnTypeProvider.getTypes().get(D.b(cls2));
                            if (returnType2 == null) {
                                returnType2 = new ReturnType(D.b(cls2));
                                returnTypeProvider.getTypes().put(D.b(cls2), returnType2);
                            }
                            SyncFunctionComponent syncFunctionComponent3 = new SyncFunctionComponent(str5, anyTypeArr17, returnType2, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    AbstractC2855l.g(it, "it");
                                    return Integer.valueOf(((SealedData) it[0]).getIvSize());
                                }
                            });
                            syncFunctionComponent3.setOwnerType(propertyComponentBuilderWithThis3.getThisType());
                            syncFunctionComponent3.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis3.setGetter(syncFunctionComponent3);
                            classComponentBuilder2.getProperties().put("ivSize", propertyComponentBuilderWithThis3);
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis4 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "tagSize");
                            AnyType[] anyTypeArr18 = {new AnyType(propertyComponentBuilderWithThis4.getThisType(), null, 2, null)};
                            returnType3 = returnTypeProvider.getTypes().get(D.b(cls2));
                            if (returnType3 == null) {
                                returnType3 = new ReturnType(D.b(cls2));
                                returnTypeProvider.getTypes().put(D.b(cls2), returnType3);
                            }
                            SyncFunctionComponent syncFunctionComponent4 = new SyncFunctionComponent(str5, anyTypeArr18, returnType3, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    AbstractC2855l.g(it, "it");
                                    return Integer.valueOf(((SealedData) it[0]).getTagSize());
                                }
                            });
                            syncFunctionComponent4.setOwnerType(propertyComponentBuilderWithThis4.getThisType());
                            syncFunctionComponent4.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis4.setGetter(syncFunctionComponent4);
                            classComponentBuilder2.getProperties().put("tagSize", propertyComponentBuilderWithThis4);
                            moduleDefinitionBuilder.getClassData().add(classComponentBuilder2.buildClass());
                            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
                            AbstractC2861a.f();
                            return moduleDefinitionDataBuildModule;
                        }
                        floatAsyncFunctionComponent2 = new FloatAsyncFunctionComponent(AESEncryptor.IV_PROPERTY, anyTypeArr12, function17);
                    }
                    stringAsyncFunctionComponent2 = floatAsyncFunctionComponent2;
                    obj4 = obj3;
                    classComponentBuilder2.getAsyncFunctions().put(AESEncryptor.IV_PROPERTY, stringAsyncFunctionComponent2);
                    TypeConverterProvider converters102 = classComponentBuilder2.getConverters();
                    anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool7));
                    if (anyType == null) {
                    }
                    anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool8));
                    if (anyType2 == null) {
                    }
                    AnyType[] anyTypeArr132 = {anyType, anyType2};
                    Function1 function182 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            Object obj5 = objArr[0];
                            return ByteArrayExtensionsKt.formatted(((SealedData) obj5).getTagBytes(), (DataFormat) objArr[1]);
                        }
                    };
                    classComponentBuilder2.getAsyncFunctions().put("tag", !AbstractC2855l.b(cls16, cls11) ? new IntAsyncFunctionComponent("tag", anyTypeArr132, function182) : AbstractC2855l.b(cls16, cls14) ? new BoolAsyncFunctionComponent("tag", anyTypeArr132, function182) : AbstractC2855l.b(cls16, cls13) ? new DoubleAsyncFunctionComponent("tag", anyTypeArr132, function182) : AbstractC2855l.b(cls16, cls12) ? new FloatAsyncFunctionComponent("tag", anyTypeArr132, function182) : AbstractC2855l.b(cls16, obj4) ? new StringAsyncFunctionComponent("tag", anyTypeArr132, function182) : new UntypedAsyncFunctionComponent("tag", anyTypeArr132, function182));
                    TypeConverterProvider converters112 = classComponentBuilder2.getConverters();
                    anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool7));
                    if (anyType3 == null) {
                    }
                    anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool8));
                    if (anyType4 == null) {
                    }
                    AnyType[] anyTypeArr142 = {anyType3, anyType4};
                    Function1 function192 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            Object obj5 = objArr[0];
                            return ByteArrayExtensionsKt.formatted(((SealedData) obj5).getCombinedArray(), (DataFormat) objArr[1]);
                        }
                    };
                    classComponentBuilder2.getAsyncFunctions().put("combined", !AbstractC2855l.b(cls16, cls11) ? new IntAsyncFunctionComponent("combined", anyTypeArr142, function192) : AbstractC2855l.b(cls16, cls14) ? new BoolAsyncFunctionComponent("combined", anyTypeArr142, function192) : AbstractC2855l.b(cls16, cls13) ? new DoubleAsyncFunctionComponent("combined", anyTypeArr142, function192) : AbstractC2855l.b(cls16, cls12) ? new FloatAsyncFunctionComponent("combined", anyTypeArr142, function192) : AbstractC2855l.b(cls16, obj4) ? new StringAsyncFunctionComponent("combined", anyTypeArr142, function192) : new UntypedAsyncFunctionComponent("combined", anyTypeArr142, function192));
                    TypeConverterProvider converters122 = classComponentBuilder2.getConverters();
                    anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool7));
                    if (anyType5 == null) {
                    }
                    anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CiphertextOptions.class), bool8));
                    if (anyType6 == null) {
                    }
                    AnyType[] anyTypeArr152 = {anyType5, anyType6};
                    Function1 function1102 = new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            Object obj5 = objArr[0];
                            CiphertextOptions ciphertextOptions = (CiphertextOptions) objArr[1];
                            SealedData sealedData = (SealedData) obj5;
                            if (ciphertextOptions == null) {
                                ciphertextOptions = new CiphertextOptions(false, null, 3, null);
                            }
                            boolean includeTag = ciphertextOptions.getIncludeTag();
                            return ByteArrayExtensionsKt.formatted(sealedData.ciphertextBytes(includeTag), ciphertextOptions.getOutputFormat());
                        }
                    };
                    classComponentBuilder2.getAsyncFunctions().put("ciphertext", !AbstractC2855l.b(cls16, cls11) ? new IntAsyncFunctionComponent("ciphertext", anyTypeArr152, function1102) : AbstractC2855l.b(cls16, cls14) ? new BoolAsyncFunctionComponent("ciphertext", anyTypeArr152, function1102) : AbstractC2855l.b(cls16, cls13) ? new DoubleAsyncFunctionComponent("ciphertext", anyTypeArr152, function1102) : AbstractC2855l.b(cls16, cls12) ? new FloatAsyncFunctionComponent("ciphertext", anyTypeArr152, function1102) : AbstractC2855l.b(cls16, obj4) ? new StringAsyncFunctionComponent("ciphertext", anyTypeArr152, function1102) : new UntypedAsyncFunctionComponent("ciphertext", anyTypeArr152, function1102));
                    PropertyComponentBuilderWithThis propertyComponentBuilderWithThis22 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "combinedSize");
                    AnyType[] anyTypeArr162 = {new AnyType(propertyComponentBuilderWithThis22.getThisType(), null, 2, null)};
                    returnType = returnTypeProvider.getTypes().get(D.b(cls2));
                    if (returnType == null) {
                    }
                    String str52 = str3;
                    SyncFunctionComponent syncFunctionComponent22 = new SyncFunctionComponent(str52, anyTypeArr162, returnType, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] it) {
                            AbstractC2855l.g(it, "it");
                            return Integer.valueOf(((SealedData) it[0]).getCombinedSize());
                        }
                    });
                    syncFunctionComponent22.setOwnerType(propertyComponentBuilderWithThis22.getThisType());
                    syncFunctionComponent22.setCanTakeOwner(true);
                    propertyComponentBuilderWithThis22.setGetter(syncFunctionComponent22);
                    classComponentBuilder2.getProperties().put("combinedSize", propertyComponentBuilderWithThis22);
                    PropertyComponentBuilderWithThis propertyComponentBuilderWithThis32 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "ivSize");
                    AnyType[] anyTypeArr172 = {new AnyType(propertyComponentBuilderWithThis32.getThisType(), null, 2, null)};
                    returnType2 = returnTypeProvider.getTypes().get(D.b(cls2));
                    if (returnType2 == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent32 = new SyncFunctionComponent(str52, anyTypeArr172, returnType2, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] it) {
                            AbstractC2855l.g(it, "it");
                            return Integer.valueOf(((SealedData) it[0]).getIvSize());
                        }
                    });
                    syncFunctionComponent32.setOwnerType(propertyComponentBuilderWithThis32.getThisType());
                    syncFunctionComponent32.setCanTakeOwner(true);
                    propertyComponentBuilderWithThis32.setGetter(syncFunctionComponent32);
                    classComponentBuilder2.getProperties().put("ivSize", propertyComponentBuilderWithThis32);
                    PropertyComponentBuilderWithThis propertyComponentBuilderWithThis42 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "tagSize");
                    AnyType[] anyTypeArr182 = {new AnyType(propertyComponentBuilderWithThis42.getThisType(), null, 2, null)};
                    returnType3 = returnTypeProvider.getTypes().get(D.b(cls2));
                    if (returnType3 == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent42 = new SyncFunctionComponent(str52, anyTypeArr182, returnType3, new Function1() { // from class: expo.modules.crypto.aes.AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] it) {
                            AbstractC2855l.g(it, "it");
                            return Integer.valueOf(((SealedData) it[0]).getTagSize());
                        }
                    });
                    syncFunctionComponent42.setOwnerType(propertyComponentBuilderWithThis42.getThisType());
                    syncFunctionComponent42.setCanTakeOwner(true);
                    propertyComponentBuilderWithThis42.setGetter(syncFunctionComponent42);
                    classComponentBuilder2.getProperties().put("tagSize", propertyComponentBuilderWithThis42);
                    moduleDefinitionBuilder.getClassData().add(classComponentBuilder2.buildClass());
                    ModuleDefinitionData moduleDefinitionDataBuildModule2 = moduleDefinitionBuilder.buildModule();
                    AbstractC2861a.f();
                    return moduleDefinitionDataBuildModule2;
                }
                floatAsyncFunctionComponent = new FloatAsyncFunctionComponent("decryptAsync", anyTypeArr2, function12);
            }
            stringAsyncFunctionComponent = floatAsyncFunctionComponent;
            obj2 = obj;
            moduleDefinitionBuilder.getAsyncFunctions().put("decryptAsync", stringAsyncFunctionComponent);
            d dVarB32 = D.b(cls4);
            module = moduleDefinitionBuilder.getModule();
            if (module != null) {
            }
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
