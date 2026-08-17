package t9;

import j7.AbstractC2793j;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient byte[][] f32563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final transient int[] f32564m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(byte[][] segments, int[] directory) {
        super(k.f32604k.q());
        AbstractC2855l.g(segments, "segments");
        AbstractC2855l.g(directory, "directory");
        this.f32563l = segments;
        this.f32564m = directory;
    }

    private final k M() {
        return new k(H());
    }

    private final Object writeReplace() {
        k kVarM = M();
        AbstractC2855l.e(kVarM, "null cannot be cast to non-null type java.lang.Object");
        return kVarM;
    }

    @Override // t9.k
    public k G() {
        return M().G();
    }

    @Override // t9.k
    public byte[] H() {
        byte[] bArr = new byte[E()];
        int length = L().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = K()[length + i10];
            int i14 = K()[i10];
            int i15 = i14 - i11;
            AbstractC2793j.f(L()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // t9.k
    public void J(C3391h buffer, int i10, int i11) {
        AbstractC2855l.g(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = u9.c.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : K()[iB - 1];
            int i14 = K()[iB] - i13;
            int i15 = K()[L().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            A a10 = new A(L()[iB], i16, i16 + iMin, true, false);
            A a11 = buffer.f32592g;
            if (a11 == null) {
                a10.f32557g = a10;
                a10.f32556f = a10;
                buffer.f32592g = a10;
            } else {
                AbstractC2855l.d(a11);
                A a12 = a11.f32557g;
                AbstractC2855l.d(a12);
                a12.c(a10);
            }
            i10 += iMin;
            iB++;
        }
        buffer.O0(buffer.size() + ((long) i11));
    }

    public final int[] K() {
        return this.f32564m;
    }

    public final byte[][] L() {
        return this.f32563l;
    }

    @Override // t9.k
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.E() == E() && y(0, kVar, 0, E())) {
                return true;
            }
        }
        return false;
    }

    @Override // t9.k
    public int hashCode() {
        int iR = r();
        if (iR != 0) {
            return iR;
        }
        int length = L().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = K()[length + i10];
            int i14 = K()[i10];
            byte[] bArr = L()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        A(i11);
        return i11;
    }

    @Override // t9.k
    public String j() {
        return M().j();
    }

    @Override // t9.k
    public k m(String algorithm) throws NoSuchAlgorithmException {
        AbstractC2855l.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = L().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = K()[length + i10];
            int i13 = K()[i10];
            messageDigest.update(L()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digestBytes = messageDigest.digest();
        AbstractC2855l.f(digestBytes, "digestBytes");
        return new k(digestBytes);
    }

    @Override // t9.k
    public int s() {
        return K()[L().length - 1];
    }

    @Override // t9.k
    public String toString() {
        return M().toString();
    }

    @Override // t9.k
    public String u() {
        return M().u();
    }

    @Override // t9.k
    public byte[] v() {
        return H();
    }

    @Override // t9.k
    public byte w(int i10) {
        AbstractC3388e.b(K()[L().length - 1], i10, 1L);
        int iB = u9.c.b(this, i10);
        return L()[iB][(i10 - (iB == 0 ? 0 : K()[iB - 1])) + K()[L().length + iB]];
    }

    @Override // t9.k
    public boolean y(int i10, k other, int i11, int i12) {
        AbstractC2855l.g(other, "other");
        if (i10 < 0 || i10 > E() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = u9.c.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : K()[iB - 1];
            int i15 = K()[iB] - i14;
            int i16 = K()[L().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.z(i11, L()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // t9.k
    public boolean z(int i10, byte[] other, int i11, int i12) {
        AbstractC2855l.g(other, "other");
        if (i10 < 0 || i10 > E() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = u9.c.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : K()[iB - 1];
            int i15 = K()[iB] - i14;
            int i16 = K()[L().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC3388e.a(L()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }
}
