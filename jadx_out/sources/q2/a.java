package Q2;

import Q2.c;
import j7.AbstractC2793j;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f9045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f9046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f9047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f9048f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f9051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f9052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f9053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f9054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f9055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[][] f9056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f9057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f9058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f9059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f9060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f9061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f9062t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0099a f9044b = new C0099a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f9049g = f.a("GIF87a");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f9050h = f.a("GIF89a");

    /* JADX INFO: renamed from: Q2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0099a {
        public /* synthetic */ C0099a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int k(byte[] bArr) {
            if (bArr.length < 4) {
                return -1;
            }
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c l(byte[] bArr, int i10) {
            if (l2.c.h(bArr, 0, i10)) {
                return l2.c.g(bArr, 0) ? b.f9070g : l2.c.f(bArr, 0) ? b.f9071h : l2.c.c(bArr, 0, i10) ? l2.c.b(bArr, 0) ? b.f9074k : l2.c.d(bArr, 0) ? b.f9073j : b.f9072i : c.f9081d;
            }
            throw new IllegalStateException("Check failed.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(byte[] bArr, int i10) {
            if (i10 >= 12 && k(bArr) >= 8 && f.b(bArr, a.f9061s, 4)) {
                return f.b(bArr, a.f9062t, 8);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(byte[] bArr, int i10) {
            return i10 >= 4 && f.c(bArr, a.f9060r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(byte[] bArr, int i10) {
            if (i10 < a.f9051i.length) {
                return false;
            }
            return f.c(bArr, a.f9051i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p(byte[] bArr, int i10) {
            if (i10 >= a.f9059q) {
                return f.c(bArr, a.f9057o) || f.c(bArr, a.f9058p);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q(byte[] bArr, int i10) {
            if (i10 < 6) {
                return false;
            }
            return f.c(bArr, a.f9049g) || f.c(bArr, a.f9050h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r(byte[] bArr, int i10) {
            if (i10 < 12 || bArr[3] < 8 || !f.b(bArr, a.f9055m, 4)) {
                return false;
            }
            for (byte[] bArr2 : a.f9056n) {
                if (f.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean s(byte[] bArr, int i10) {
            if (i10 < a.f9053k.length) {
                return false;
            }
            return f.c(bArr, a.f9053k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean t(byte[] bArr, int i10) {
            return i10 >= a.f9045c.length && f.c(bArr, a.f9045c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean u(byte[] bArr, int i10) {
            return i10 >= a.f9047e.length && f.c(bArr, a.f9047e);
        }

        private C0099a() {
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f9045c = bArr;
        f9046d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f9047e = bArr2;
        f9048f = bArr2.length;
        byte[] bArrA = f.a("BM");
        f9051i = bArrA;
        f9052j = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f9053k = bArr3;
        f9054l = bArr3.length;
        f9055m = f.a("ftyp");
        f9056n = new byte[][]{f.a("heic"), f.a("heix"), f.a("hevc"), f.a("hevx"), f.a("mif1"), f.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f9057o = bArr4;
        f9058p = new byte[]{77, 77, 0, 42};
        f9059q = bArr4.length;
        f9060r = new byte[]{3, 0, 8, 0};
        f9061s = f.a("ftyp");
        f9062t = f.a("avif");
    }

    public a() {
        Object objE0 = AbstractC2793j.e0(new Integer[]{21, 20, Integer.valueOf(f9046d), Integer.valueOf(f9048f), 6, Integer.valueOf(f9052j), Integer.valueOf(f9054l), 12, 4, 12});
        if (objE0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f9063a = ((Number) objE0).intValue();
    }

    @Override // Q2.c.b
    public int a() {
        return this.f9063a;
    }

    @Override // Q2.c.b
    public c b(byte[] headerBytes, int i10) {
        AbstractC2855l.g(headerBytes, "headerBytes");
        if (l2.c.h(headerBytes, 0, i10)) {
            return f9044b.l(headerBytes, i10);
        }
        C0099a c0099a = f9044b;
        return c0099a.t(headerBytes, i10) ? b.f9065b : c0099a.u(headerBytes, i10) ? b.f9066c : c0099a.q(headerBytes, i10) ? b.f9067d : c0099a.o(headerBytes, i10) ? b.f9068e : c0099a.s(headerBytes, i10) ? b.f9069f : c0099a.m(headerBytes, i10) ? b.f9078o : c0099a.r(headerBytes, i10) ? b.f9075l : c0099a.n(headerBytes, i10) ? b.f9077n : c0099a.p(headerBytes, i10) ? b.f9076m : c.f9081d;
    }
}
