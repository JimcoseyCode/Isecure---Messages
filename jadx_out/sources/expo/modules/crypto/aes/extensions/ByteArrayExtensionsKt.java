package expo.modules.crypto.aes.extensions;

import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.crypto.aes.enums.DataFormat;
import expo.modules.crypto.aes.enums.KeyEncoding;
import expo.modules.crypto.aes.extensions.ByteArrayExtensionsKt;
import i7.C2750m;
import j7.AbstractC2793j;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0001¢\u0006\u0004\b\f\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\t*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Ljava/nio/ByteBuffer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "copiedArray", "(Ljava/nio/ByteBuffer;)[B", "Lkotlin/Function1;", "Li7/B;", "block", "init", "([BLkotlin/jvm/functions/Function1;)[B", PointerEventHelper.POINTER_TYPE_UNKNOWN, "base64Encoded", "([B)Ljava/lang/String;", "hexEncoded", "Lexpo/modules/crypto/aes/enums/KeyEncoding;", "encoding", "encoded", "([BLexpo/modules/crypto/aes/enums/KeyEncoding;)Ljava/lang/String;", "Lexpo/modules/crypto/aes/enums/DataFormat;", "format", PointerEventHelper.POINTER_TYPE_UNKNOWN, "formatted", "([BLexpo/modules/crypto/aes/enums/DataFormat;)Ljava/lang/Object;", "expo-crypto_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ByteArrayExtensionsKt {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[KeyEncoding.values().length];
            try {
                iArr[KeyEncoding.HEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyEncoding.BASE64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DataFormat.values().length];
            try {
                iArr2[DataFormat.BYTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DataFormat.BASE64.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String base64Encoded(byte[] bArr) {
        AbstractC2855l.g(bArr, "<this>");
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        AbstractC2855l.f(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final byte[] copiedArray(ByteBuffer byteBuffer) {
        AbstractC2855l.g(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final String encoded(byte[] bArr, KeyEncoding encoding) {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2855l.g(encoding, "encoding");
        int i10 = WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i10 == 1) {
            return hexEncoded(bArr);
        }
        if (i10 == 2) {
            return base64Encoded(bArr);
        }
        throw new C2750m();
    }

    public static final Object formatted(byte[] bArr, DataFormat dataFormat) {
        AbstractC2855l.g(bArr, "<this>");
        int i10 = dataFormat == null ? -1 : WhenMappings.$EnumSwitchMapping$1[dataFormat.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return bArr;
        }
        if (i10 == 2) {
            return base64Encoded(bArr);
        }
        throw new C2750m();
    }

    public static final String hexEncoded(byte[] bArr) {
        AbstractC2855l.g(bArr, "<this>");
        return AbstractC2793j.Y(bArr, PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, new Function1() { // from class: a7.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ByteArrayExtensionsKt.hexEncoded$lambda$3(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hexEncoded$lambda$3(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }

    public static final byte[] init(byte[] bArr, Function1 block) {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2855l.g(block, "block");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        AbstractC2855l.d(byteBufferWrap);
        block.invoke(byteBufferWrap);
        return bArr;
    }
}
