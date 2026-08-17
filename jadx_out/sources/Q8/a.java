package Q8;

import P8.q;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0100a f9879h = new C0100a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f9880i = p(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f9881j = c.e(4611686018427387903L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f9882k = c.e(-4611686018427387903L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f9883g;

    /* JADX INFO: renamed from: Q8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0100a {
        public /* synthetic */ C0100a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0100a() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.f9883g = j10;
    }

    public static final int A(long j10) {
        if (H(j10)) {
            return 0;
        }
        return (int) (x(j10) % ((long) 60));
    }

    private static final d B(long j10) {
        return G(j10) ? d.f9886h : d.f9888j;
    }

    private static final long C(long j10) {
        return j10 >> 1;
    }

    public static int D(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean E(long j10) {
        return !H(j10);
    }

    private static final boolean F(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean G(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean H(long j10) {
        return j10 == f9881j || j10 == f9882k;
    }

    public static final boolean I(long j10) {
        return j10 < 0;
    }

    public static final double J(long j10, d unit) {
        AbstractC2855l.g(unit, "unit");
        if (j10 == f9881j) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f9882k) {
            return Double.NEGATIVE_INFINITY;
        }
        return e.a(C(j10), B(j10), unit);
    }

    public static final long K(long j10, d unit) {
        AbstractC2855l.g(unit, "unit");
        if (j10 == f9881j) {
            return Long.MAX_VALUE;
        }
        if (j10 == f9882k) {
            return Long.MIN_VALUE;
        }
        return e.b(C(j10), B(j10), unit);
    }

    public static String L(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f9881j) {
            return "Infinity";
        }
        if (j10 == f9882k) {
            return "-Infinity";
        }
        boolean zI = I(j10);
        StringBuilder sb = new StringBuilder();
        if (zI) {
            sb.append('-');
        }
        long jR = r(j10);
        long jT = t(jR);
        int iS = s(jR);
        int iY = y(jR);
        int iA = A(jR);
        int iZ = z(jR);
        int i10 = 0;
        boolean z10 = jT != 0;
        boolean z11 = iS != 0;
        boolean z12 = iY != 0;
        boolean z13 = (iA == 0 && iZ == 0) ? false : true;
        if (z10) {
            sb.append(jT);
            sb.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iS);
            sb.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iY);
            sb.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (iA != 0 || z10 || z11 || z12) {
                h(j10, sb, iA, iZ, 9, "s", false);
            } else if (iZ >= 1000000) {
                h(j10, sb, iZ / 1000000, iZ % 1000000, 6, "ms", false);
            } else if (iZ >= 1000) {
                h(j10, sb, iZ / ProgressBarContainerView.MAX_PROGRESS, iZ % ProgressBarContainerView.MAX_PROGRESS, 3, "us", false);
            } else {
                sb.append(iZ);
                sb.append("ns");
            }
            i10 = i13;
        }
        if (zI && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long M(long j10) {
        return c.d(-C(j10), ((int) j10) & 1);
    }

    private static final void h(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String strO0 = q.o0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strO0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strO0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb.append((CharSequence) strO0, 0, ((i13 + 3) / 3) * 3);
                AbstractC2855l.f(sb, "append(...)");
            } else {
                sb.append((CharSequence) strO0, 0, i15);
                AbstractC2855l.f(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a j(long j10) {
        return new a(j10);
    }

    public static int m(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return AbstractC2855l.j(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return I(j10) ? -i10 : i10;
    }

    public static long p(long j10) {
        if (!b.a()) {
            return j10;
        }
        if (G(j10)) {
            long jC = C(j10);
            if (-4611686018426999999L <= jC && jC < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(C(j10) + " ns is out of nanoseconds range");
        }
        long jC2 = C(j10);
        if (-4611686018427387903L > jC2 || jC2 >= 4611686018427387904L) {
            throw new AssertionError(C(j10) + " ms is out of milliseconds range");
        }
        long jC3 = C(j10);
        if (-4611686018426L > jC3 || jC3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(C(j10) + " ms is denormalized");
    }

    public static boolean q(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).N();
    }

    public static final long r(long j10) {
        return I(j10) ? M(j10) : j10;
    }

    public static final int s(long j10) {
        if (H(j10)) {
            return 0;
        }
        return (int) (u(j10) % ((long) 24));
    }

    public static final long t(long j10) {
        return K(j10, d.f9892n);
    }

    public static final long u(long j10) {
        return K(j10, d.f9891m);
    }

    public static final long v(long j10) {
        return (F(j10) && E(j10)) ? C(j10) : K(j10, d.f9888j);
    }

    public static final long w(long j10) {
        return K(j10, d.f9890l);
    }

    public static final long x(long j10) {
        return K(j10, d.f9889k);
    }

    public static final int y(long j10) {
        if (H(j10)) {
            return 0;
        }
        return (int) (w(j10) % ((long) 60));
    }

    public static final int z(long j10) {
        if (H(j10)) {
            return 0;
        }
        return (int) (F(j10) ? c.h(C(j10) % ((long) ProgressBarContainerView.MAX_PROGRESS)) : C(j10) % ((long) 1000000000));
    }

    public final /* synthetic */ long N() {
        return this.f9883g;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return k(((a) obj).N());
    }

    public boolean equals(Object obj) {
        return q(this.f9883g, obj);
    }

    public int hashCode() {
        return D(this.f9883g);
    }

    public int k(long j10) {
        return m(this.f9883g, j10);
    }

    public String toString() {
        return L(this.f9883g);
    }
}
