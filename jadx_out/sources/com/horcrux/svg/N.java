package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f24476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f24477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static L f24478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static L f24479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static L f24480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static L f24481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f24482j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    O f24483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    L f24484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f24485c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f24487b;

        static {
            int[] iArr = new int[EnumC2268g.values().length];
            f24487b = iArr;
            try {
                iArr[EnumC2268g.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24487b[EnumC2268g.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24487b[EnumC2268g.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24487b[EnumC2268g.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24487b[EnumC2268g.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[O.values().length];
            f24486a = iArr2;
            try {
                iArr2[O.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24486a[O.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24486a[O.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private N(O o10, L l10, double d10) {
        this.f24483a = o10;
        this.f24484b = l10;
        this.f24485c = d10;
    }

    private static double a(double d10, double d11) {
        if (Math.abs(d10 - d11) > 180.0d) {
            d10 += 360.0d;
        }
        return (d10 + d11) / 2.0d;
    }

    private static void b(S s10, L l10, L l11, L l12) {
        s10.f24510a = k(l11, l10);
        s10.f24511b = k(l12, l11);
        if (i(s10.f24510a)) {
            s10.f24510a = s10.f24511b;
        } else if (i(s10.f24511b)) {
            s10.f24511b = s10.f24510a;
        }
    }

    private static double c(O o10) {
        double dJ = j(f(f24480h));
        double dJ2 = j(f(f24481i));
        int i10 = a.f24486a[o10.ordinal()];
        if (i10 == 1) {
            return f24482j ? dJ2 + 180.0d : dJ2;
        }
        if (i10 == 2) {
            return a(dJ, dJ2);
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return dJ;
    }

    private static S d(H h10) {
        S s10 = new S();
        L[] lArr = h10.f24444b;
        int i10 = a.f24487b[h10.f24443a.ordinal()];
        if (i10 == 1) {
            s10.f24512c = lArr[2];
            s10.f24510a = k(lArr[0], f24478f);
            s10.f24511b = k(lArr[2], lArr[1]);
            if (i(s10.f24510a)) {
                b(s10, lArr[0], lArr[1], lArr[2]);
                return s10;
            }
            if (i(s10.f24511b)) {
                b(s10, f24478f, lArr[0], lArr[1]);
            }
        } else {
            if (i10 == 2) {
                L l10 = lArr[1];
                s10.f24512c = l10;
                b(s10, f24478f, lArr[0], l10);
                return s10;
            }
            if (i10 == 3 || i10 == 4) {
                L l11 = lArr[0];
                s10.f24512c = l11;
                s10.f24510a = k(l11, f24478f);
                s10.f24511b = k(s10.f24512c, f24478f);
                return s10;
            }
            if (i10 == 5) {
                L l12 = f24479g;
                s10.f24512c = l12;
                s10.f24510a = k(l12, f24478f);
                s10.f24511b = k(s10.f24512c, f24478f);
                return s10;
            }
        }
        return s10;
    }

    private static void e() {
        O o10 = O.kEndMarker;
        f24476d.add(new N(o10, f24478f, c(o10)));
    }

    private static double f(L l10) {
        return Math.atan2(l10.f24474b, l10.f24473a);
    }

    private static void g(H h10) {
        S sD = d(h10);
        f24481i = sD.f24510a;
        int i10 = f24477e;
        if (i10 > 0) {
            O o10 = i10 == 1 ? O.kStartMarker : O.kMidMarker;
            f24476d.add(new N(o10, f24478f, c(o10)));
        }
        f24480h = sD.f24511b;
        f24478f = sD.f24512c;
        EnumC2268g enumC2268g = h10.f24443a;
        if (enumC2268g == EnumC2268g.kCGPathElementMoveToPoint) {
            f24479g = h10.f24444b[0];
        } else if (enumC2268g == EnumC2268g.kCGPathElementCloseSubpath) {
            f24479g = new L(0.0d, 0.0d);
        }
        f24477e++;
    }

    static ArrayList h(ArrayList arrayList) {
        f24476d = new ArrayList();
        f24477e = 0;
        f24478f = new L(0.0d, 0.0d);
        f24479g = new L(0.0d, 0.0d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((H) it.next());
        }
        e();
        return f24476d;
    }

    private static boolean i(L l10) {
        return l10.f24473a == 0.0d && l10.f24474b == 0.0d;
    }

    private static double j(double d10) {
        return d10 * 57.29577951308232d;
    }

    private static L k(L l10, L l11) {
        return new L(l11.f24473a - l10.f24473a, l11.f24474b - l10.f24474b);
    }
}
