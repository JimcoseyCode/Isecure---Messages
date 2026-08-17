package expo.modules.asset;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import j7.AbstractC2793j;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getMD5HashOfFileContent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "file", "Ljava/io/File;", "expo-asset_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FileUtilsKt {
    public static final String getMD5HashOfFileContent(File file) {
        MessageDigest messageDigest;
        byte[] bArr;
        FileInputStream fileInputStream;
        AbstractC2855l.g(file, "file");
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            bArr = new byte[8192];
            fileInputStream = new FileInputStream(file);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(fileInputStream, null);
                    byte[] bArrDigest = messageDigest.digest();
                    AbstractC2855l.f(bArrDigest, "digest(...)");
                    return AbstractC2793j.Y(bArrDigest, PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, new Function1() { // from class: expo.modules.asset.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FileUtilsKt.getMD5HashOfFileContent$lambda$1(((Byte) obj).byteValue());
                        }
                    }, 30, null);
                }
                messageDigest.update(bArr, 0, i10);
            } finally {
            }
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getMD5HashOfFileContent$lambda$1(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }
}
