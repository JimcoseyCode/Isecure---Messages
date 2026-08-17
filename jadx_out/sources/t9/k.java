package t9;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import j7.AbstractC2793j;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class k implements Serializable, Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f32603j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f32604k = new k(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f32605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int f32606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient String f32607i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k j(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC3388e.c();
            }
            return aVar.i(bArr, i10, i11);
        }

        public final k a(String string) {
            AbstractC2855l.g(string, "string");
            return d(string);
        }

        public final k b(String string) {
            AbstractC2855l.g(string, "string");
            return g(string);
        }

        public final k c(ByteBuffer buffer) {
            AbstractC2855l.g(buffer, "buffer");
            return h(buffer);
        }

        public final k d(String str) {
            AbstractC2855l.g(str, "<this>");
            byte[] bArrA = AbstractC3384a.a(str);
            if (bArrA != null) {
                return new k(bArrA);
            }
            return null;
        }

        public final k e(String str) {
            AbstractC2855l.g(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((u9.b.e(str.charAt(i11)) << 4) + u9.b.e(str.charAt(i11 + 1)));
            }
            return new k(bArr);
        }

        public final k f(String str, Charset charset) {
            AbstractC2855l.g(str, "<this>");
            AbstractC2855l.g(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            AbstractC2855l.f(bytes, "this as java.lang.String).getBytes(charset)");
            return new k(bytes);
        }

        public final k g(String str) {
            AbstractC2855l.g(str, "<this>");
            k kVar = new k(I.a(str));
            kVar.B(str);
            return kVar;
        }

        public final k h(ByteBuffer byteBuffer) {
            AbstractC2855l.g(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new k(bArr);
        }

        public final k i(byte[] bArr, int i10, int i11) {
            AbstractC2855l.g(bArr, "<this>");
            int iF = AbstractC3388e.f(bArr, i11);
            AbstractC3388e.b(bArr.length, i10, iF);
            return new k(AbstractC2793j.m(bArr, i10, iF + i10));
        }

        public final k k(InputStream inputStream, int i10) throws IOException {
            AbstractC2855l.g(inputStream, "<this>");
            if (i10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new k(bArr);
        }

        private a() {
        }
    }

    public k(byte[] data) {
        AbstractC2855l.g(data, "data");
        this.f32605g = data;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        k kVarK = f32603j.k(objectInputStream, objectInputStream.readInt());
        Field declaredField = k.class.getDeclaredField("g");
        declaredField.setAccessible(true);
        declaredField.set(this, kVarK.f32605g);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f32605g.length);
        objectOutputStream.write(this.f32605g);
    }

    public final void A(int i10) {
        this.f32606h = i10;
    }

    public final void B(String str) {
        this.f32607i = str;
    }

    public final k C() {
        return m("SHA-1");
    }

    public final k D() {
        return m("SHA-256");
    }

    public final int E() {
        return s();
    }

    public final boolean F(k prefix) {
        AbstractC2855l.g(prefix, "prefix");
        return y(0, prefix, 0, prefix.E());
    }

    public k G() {
        for (int i10 = 0; i10 < q().length; i10++) {
            byte b10 = q()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrQ = q();
                byte[] bArrCopyOf = Arrays.copyOf(bArrQ, bArrQ.length);
                AbstractC2855l.f(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new k(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] H() {
        byte[] bArrQ = q();
        byte[] bArrCopyOf = Arrays.copyOf(bArrQ, bArrQ.length);
        AbstractC2855l.f(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public String I() {
        String strT = t();
        if (strT != null) {
            return strT;
        }
        String strB = I.b(v());
        B(strB);
        return strB;
    }

    public void J(C3391h buffer, int i10, int i11) {
        AbstractC2855l.g(buffer, "buffer");
        u9.b.d(this, buffer, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.E() == q().length && kVar.z(0, q(), 0, q().length)) {
                return true;
            }
        }
        return false;
    }

    public final int h() {
        return E();
    }

    public int hashCode() {
        int iR = r();
        if (iR != 0) {
            return iR;
        }
        int iHashCode = Arrays.hashCode(q());
        A(iHashCode);
        return iHashCode;
    }

    public String j() {
        return AbstractC3384a.c(q(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        AbstractC2855l.g(other, "other");
        int iE = E();
        int iE2 = other.E();
        int iMin = Math.min(iE, iE2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iP = p(i10) & 255;
            int iP2 = other.p(i10) & 255;
            if (iP != iP2) {
                return iP < iP2 ? -1 : 1;
            }
        }
        if (iE == iE2) {
            return 0;
        }
        return iE < iE2 ? -1 : 1;
    }

    public k m(String algorithm) throws NoSuchAlgorithmException {
        AbstractC2855l.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f32605g, 0, E());
        byte[] digestBytes = messageDigest.digest();
        AbstractC2855l.f(digestBytes, "digestBytes");
        return new k(digestBytes);
    }

    public final byte p(int i10) {
        return w(i10);
    }

    public final byte[] q() {
        return this.f32605g;
    }

    public final int r() {
        return this.f32606h;
    }

    public int s() {
        return q().length;
    }

    public final String t() {
        return this.f32607i;
    }

    public String toString() {
        if (q().length == 0) {
            return "[size=0]";
        }
        int iC = u9.b.c(q(), 64);
        if (iC != -1) {
            String strI = I();
            String strSubstring = strI.substring(0, iC);
            AbstractC2855l.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strE = P8.q.E(P8.q.E(P8.q.E(strSubstring, "\\", "\\\\", false, 4, null), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strI.length()) {
                return "[text=" + strE + ']';
            }
            return "[size=" + q().length + " text=" + strE + "…]";
        }
        if (q().length <= 64) {
            return "[hex=" + u() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(q().length);
        sb.append(" hex=");
        int iE = AbstractC3388e.e(this, 64);
        if (iE <= q().length) {
            if (iE < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb.append((iE == q().length ? this : new k(AbstractC2793j.m(q(), 0, iE))).u());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + q().length + ')').toString());
    }

    public String u() {
        char[] cArr = new char[q().length * 2];
        int i10 = 0;
        for (byte b10 : q()) {
            int i11 = i10 + 1;
            cArr[i10] = u9.b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = u9.b.f()[b10 & 15];
        }
        return P8.q.s(cArr);
    }

    public byte[] v() {
        return q();
    }

    public byte w(int i10) {
        return q()[i10];
    }

    public final k x() {
        return m("MD5");
    }

    public boolean y(int i10, k other, int i11, int i12) {
        AbstractC2855l.g(other, "other");
        return other.z(i11, q(), i10, i12);
    }

    public boolean z(int i10, byte[] other, int i11, int i12) {
        AbstractC2855l.g(other, "other");
        return i10 >= 0 && i10 <= q().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC3388e.a(q(), i10, other, i11, i12);
    }
}
