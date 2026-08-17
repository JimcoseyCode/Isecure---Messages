package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f24445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f24446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f24447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f24448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Path f24449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList f24450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static float f24451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static float f24452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static float f24453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static float f24454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static float f24455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f24456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f24457m;

    private static void A(float f10, float f11, float f12, float f13) {
        float f14 = (f24451g * 2.0f) - f24453i;
        float f15 = (f24452h * 2.0f) - f24454j;
        f24453i = f10;
        f24454j = f11;
        e(f14, f15, f10, f11, f12, f13);
    }

    private static void B(float f10, float f11) {
        C(f10 + f24451g, f11 + f24452h);
    }

    private static void C(float f10, float f11) {
        u((f24451g * 2.0f) - f24453i, (f24452h * 2.0f) - f24454j, f10, f11);
    }

    private static void a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        b(f10, f11, f12, z10, z11, f13 + f24451g, f14 + f24452h);
    }

    private static void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = f24451g;
        float f20 = f24452h;
        float fAbs = Math.abs(f11 == 0.0f ? f10 == 0.0f ? f14 - f20 : f10 : f11);
        float fAbs2 = Math.abs(f10 == 0.0f ? f13 - f19 : f10);
        if (fAbs2 == 0.0f || fAbs == 0.0f || (f13 == f19 && f14 == f20)) {
            l(f13, f14);
            return;
        }
        float radians = (float) Math.toRadians(f12);
        double d10 = radians;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f21 = f13 - f19;
        float f22 = f14 - f20;
        float f23 = ((fCos * f21) / 2.0f) + ((fSin * f22) / 2.0f);
        float f24 = -fSin;
        float f25 = ((f24 * f21) / 2.0f) + ((fCos * f22) / 2.0f);
        float f26 = fAbs2 * fAbs2;
        float f27 = f26 * fAbs * fAbs;
        float f28 = (f27 - ((f26 * f25) * f25)) - (((fAbs * fAbs) * f23) * f23);
        if (f28 < 0.0f) {
            float f29 = 1.0f - (f28 / f27);
            f15 = 0.0f;
            float fSqrt = (float) Math.sqrt(f29);
            fAbs2 *= fSqrt;
            f18 = fAbs * fSqrt;
            f17 = f21 / 2.0f;
            f16 = f22 / 2.0f;
        } else {
            f15 = 0.0f;
            float fSqrt2 = (float) Math.sqrt(f28 / (r16 + r18));
            if (z10 == z11) {
                fSqrt2 = -fSqrt2;
            }
            float f30 = (((-fSqrt2) * f25) * fAbs2) / fAbs;
            float f31 = ((fSqrt2 * f23) * fAbs) / fAbs2;
            f16 = (f22 / 2.0f) + (f30 * fSin) + (f31 * fCos);
            f17 = ((fCos * f30) - (fSin * f31)) + (f21 / 2.0f);
            f18 = fAbs;
        }
        float f32 = fCos / fAbs2;
        float f33 = fSin / fAbs2;
        float f34 = f24 / f18;
        float f35 = fCos / f18;
        float f36 = -f17;
        float f37 = -f16;
        float f38 = f17;
        float fAtan2 = (float) Math.atan2((f34 * f36) + (f35 * f37), (f36 * f32) + (f33 * f37));
        float f39 = f21 - f38;
        float f40 = f22 - f16;
        float fAtan22 = (float) Math.atan2((f34 * f39) + (f35 * f40), (f32 * f39) + (f33 * f40));
        float f41 = f38 + f19;
        float f42 = f16 + f20;
        float f43 = f21 + f19;
        float f44 = f22 + f20;
        w();
        f24453i = f43;
        f24451g = f43;
        f24454j = f44;
        f24452h = f44;
        if (fAbs2 != f18 || radians != f15) {
            c(f41, f42, fAbs2, f18, fAtan2, fAtan22, z11, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(fAtan2);
        float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan22))) % 360.0f);
        if (!z10 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
            fAbs3 = 360.0f - fAbs3;
        }
        if (!z11) {
            fAbs3 = -fAbs3;
        }
        float f45 = f24445a;
        f24449e.arcTo(new RectF((f41 - fAbs2) * f45, (f42 - fAbs2) * f45, (f41 + fAbs2) * f45, (f42 + fAbs2) * f45), degrees, fAbs3);
        f24450f.add(new H(EnumC2268g.kCGPathElementAddCurveToPoint, new L[]{new L(f43, f44)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, float f16) {
        double d10;
        int iCeil;
        int i10;
        float f17 = f14;
        double d11 = f16;
        float fCos = (float) Math.cos(d11);
        float fSin = (float) Math.sin(d11);
        float f18 = fCos * f12;
        float f19 = (-fSin) * f13;
        float f20 = fSin * f12;
        float f21 = fCos * f13;
        float f22 = f15 - f17;
        if (f22 >= 0.0f || !z10) {
            if (f22 > 0.0f && !z10) {
                d10 = ((double) f22) - 6.283185307179586d;
            }
            iCeil = (int) Math.ceil(Math.abs(v(((double) f22) / 1.5707963267948966d)));
            float f23 = f22 / iCeil;
            float fTan = (float) (Math.tan(f23 / 4.0f) * 1.3333333333333333d);
            double d12 = f17;
            float fCos2 = (float) Math.cos(d12);
            float fSin2 = (float) Math.sin(d12);
            i10 = 0;
            while (i10 < iCeil) {
                float f24 = fCos2 - (fTan * fSin2);
                float f25 = fSin2 + (fCos2 * fTan);
                float f26 = f17 + f23;
                double d13 = f26;
                float fCos3 = (float) Math.cos(d13);
                float fSin3 = (float) Math.sin(d13);
                float f27 = (fTan * fSin3) + fCos3;
                float f28 = fSin3 - (fTan * fCos3);
                float f29 = f10 + (f18 * f24) + (f19 * f25);
                float f30 = f11 + (f24 * f20) + (f25 * f21);
                float f31 = f10 + (f18 * f27) + (f19 * f28);
                float f32 = f11 + (f27 * f20) + (f28 * f21);
                float f33 = f10 + (f18 * fCos3) + (f19 * fSin3);
                float f34 = f11 + (f20 * fCos3) + (f21 * fSin3);
                Path path = f24449e;
                float f35 = f24445a;
                path.cubicTo(f29 * f35, f30 * f35, f31 * f35, f32 * f35, f33 * f35, f35 * f34);
                float f36 = f23;
                f24450f.add(new H(EnumC2268g.kCGPathElementAddCurveToPoint, new L[]{new L(f29, f30), new L(f31, f32), new L(f33, f34)}));
                i10++;
                f17 = f26;
                f21 = f21;
                f23 = f36;
                f20 = f20;
                fSin2 = fSin3;
                f18 = f18;
                f19 = f19;
                iCeil = iCeil;
                fCos2 = fCos3;
            }
        }
        d10 = ((double) f22) + 6.283185307179586d;
        f22 = (float) d10;
        iCeil = (int) Math.ceil(Math.abs(v(((double) f22) / 1.5707963267948966d)));
        float f232 = f22 / iCeil;
        float fTan2 = (float) (Math.tan(f232 / 4.0f) * 1.3333333333333333d);
        double d122 = f17;
        float fCos22 = (float) Math.cos(d122);
        float fSin22 = (float) Math.sin(d122);
        i10 = 0;
        while (i10 < iCeil) {
        }
    }

    private static void d() {
        if (f24457m) {
            f24451g = f24455k;
            f24452h = f24456l;
            f24457m = false;
            f24449e.close();
            f24450f.add(new H(EnumC2268g.kCGPathElementCloseSubpath, new L[]{new L(f24451g, f24452h)}));
        }
    }

    private static void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        w();
        f24451g = f14;
        f24452h = f15;
        Path path = f24449e;
        float f16 = f24445a;
        path.cubicTo(f10 * f16, f11 * f16, f12 * f16, f13 * f16, f14 * f16, f16 * f15);
        f24450f.add(new H(EnumC2268g.kCGPathElementAddCurveToPoint, new L[]{new L(f10, f11), new L(f12, f13), new L(f14, f15)}));
    }

    private static void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f24451g;
        float f17 = f24452h;
        g(f10 + f16, f11 + f17, f12 + f16, f13 + f17, f14 + f16, f15 + f17);
    }

    private static void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        f24453i = f12;
        f24454j = f13;
        e(f10, f11, f12, f13, f14, f15);
    }

    private static boolean h(char c10) {
        return Character.isUpperCase(c10);
    }

    private static boolean i(char c10) {
        switch (c10) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c10) {
        return (c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-' || c10 == '+';
    }

    private static void k(float f10, float f11) {
        l(f10 + f24451g, f11 + f24452h);
    }

    private static void l(float f10, float f11) {
        w();
        f24451g = f10;
        f24453i = f10;
        f24452h = f11;
        f24454j = f11;
        Path path = f24449e;
        float f12 = f24445a;
        path.lineTo(f10 * f12, f12 * f11);
        f24450f.add(new H(EnumC2268g.kCGPathElementAddLineToPoint, new L[]{new L(f10, f11)}));
    }

    private static void m(float f10, float f11) {
        n(f10 + f24451g, f11 + f24452h);
    }

    private static void n(float f10, float f11) {
        f24451g = f10;
        f24453i = f10;
        f24455k = f10;
        f24452h = f11;
        f24454j = f11;
        f24456l = f11;
        Path path = f24449e;
        float f12 = f24445a;
        path.moveTo(f10 * f12, f12 * f11);
        f24450f.add(new H(EnumC2268g.kCGPathElementMoveToPoint, new L[]{new L(f10, f11)}));
    }

    static Path o(String str) {
        f24450f = new ArrayList();
        Path path = new Path();
        f24449e = path;
        if (str == null) {
            return path;
        }
        f24447c = str.length();
        f24448d = str;
        f24446b = 0;
        f24451g = 0.0f;
        f24452h = 0.0f;
        f24453i = 0.0f;
        f24454j = 0.0f;
        f24455k = 0.0f;
        f24456l = 0.0f;
        f24457m = false;
        char c10 = ' ';
        while (f24446b < f24447c) {
            y();
            int i10 = f24446b;
            if (i10 >= f24447c) {
                return f24449e;
            }
            boolean z10 = true;
            boolean z11 = c10 != ' ';
            char cCharAt = f24448d.charAt(i10);
            if (!z11 && cCharAt != 'M' && cCharAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f24446b), f24448d));
            }
            if (i(cCharAt)) {
                f24446b++;
                z10 = false;
                c10 = cCharAt;
            } else {
                if (!j(cCharAt) || !z11) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f24446b), f24448d));
                }
                if (c10 == 'Z' || c10 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f24448d));
                }
                if (c10 == 'M' || c10 == 'm') {
                    c10 = h(c10) ? 'L' : 'l';
                } else {
                    z10 = false;
                }
            }
            boolean zH = h(c10);
            switch (c10) {
                case 'A':
                    b(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'C':
                    g(q(), q(), q(), q(), q(), q());
                    break;
                case 'H':
                    l(q(), f24452h);
                    break;
                case 'L':
                    l(q(), q());
                    break;
                case 'M':
                    n(q(), q());
                    break;
                case 'Q':
                    u(q(), q(), q(), q());
                    break;
                case 'S':
                    A(q(), q(), q(), q());
                    break;
                case 'T':
                    C(q(), q());
                    break;
                case 'V':
                    l(f24451g, q());
                    break;
                case 'Z':
                case 'z':
                    d();
                    break;
                case 'a':
                    a(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'c':
                    f(q(), q(), q(), q(), q(), q());
                    break;
                case 'h':
                    k(q(), 0.0f);
                    break;
                case 'l':
                    k(q(), q());
                    break;
                case 'm':
                    m(q(), q());
                    break;
                case 'q':
                    t(q(), q(), q(), q());
                    break;
                case 's':
                    z(q(), q(), q(), q());
                    break;
                case 't':
                    B(q(), q());
                    break;
                case 'v':
                    k(0.0f, q());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c10), f24448d));
            }
            if (z10) {
                c10 = zH ? 'M' : 'm';
            }
        }
        return f24449e;
    }

    private static boolean p() {
        y();
        char cCharAt = f24448d.charAt(f24446b);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f24446b), f24448d));
        }
        int i10 = f24446b + 1;
        f24446b = i10;
        if (i10 < f24447c && f24448d.charAt(i10) == ',') {
            f24446b++;
        }
        y();
        return cCharAt == '1';
    }

    private static float q() {
        if (f24446b == f24447c) {
            throw new Error(String.format("Unexpected end (s=%s)", f24448d));
        }
        float fS = s();
        y();
        r();
        return fS;
    }

    private static void r() {
        int i10 = f24446b;
        if (i10 >= f24447c || f24448d.charAt(i10) != ',') {
            return;
        }
        f24446b++;
    }

    private static float s() {
        char cCharAt;
        y();
        int i10 = f24446b;
        if (i10 == f24447c) {
            throw new Error(String.format("Unexpected end (s=%s)", f24448d));
        }
        char cCharAt2 = f24448d.charAt(i10);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i11 = f24446b + 1;
            f24446b = i11;
            cCharAt2 = f24448d.charAt(i11);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            x();
            int i12 = f24446b;
            if (i12 < f24447c) {
                cCharAt2 = f24448d.charAt(i12);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f24446b), f24448d));
        }
        if (cCharAt2 == '.') {
            f24446b++;
            x();
            int i13 = f24446b;
            if (i13 < f24447c) {
                cCharAt2 = f24448d.charAt(i13);
            }
        }
        if (cCharAt2 == 'e' || cCharAt2 == 'E') {
            int i14 = f24446b;
            if (i14 + 1 < f24447c && (cCharAt = f24448d.charAt(i14 + 1)) != 'm' && cCharAt != 'x') {
                int i15 = f24446b + 1;
                f24446b = i15;
                char cCharAt3 = f24448d.charAt(i15);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    f24446b++;
                    x();
                } else {
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f24446b), f24448d));
                    }
                    x();
                }
            }
        }
        String strSubstring = f24448d.substring(i10, f24446b);
        float f10 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i10), Integer.valueOf(f24446b), f24448d));
        }
        return f10;
    }

    private static void t(float f10, float f11, float f12, float f13) {
        float f14 = f24451g;
        float f15 = f24452h;
        u(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }

    private static void u(float f10, float f11, float f12, float f13) {
        f24453i = f10;
        f24454j = f11;
        float f14 = f10 * 2.0f;
        float f15 = f11 * 2.0f;
        e((f24451g + f14) / 3.0f, (f24452h + f15) / 3.0f, (f12 + f14) / 3.0f, (f13 + f15) / 3.0f, f12, f13);
    }

    private static double v(double d10) {
        return Math.round(d10 * r0) / Math.pow(10.0d, 4.0d);
    }

    private static void w() {
        if (f24457m) {
            return;
        }
        f24455k = f24451g;
        f24456l = f24452h;
        f24457m = true;
    }

    private static void x() {
        while (true) {
            int i10 = f24446b;
            if (i10 >= f24447c || !Character.isDigit(f24448d.charAt(i10))) {
                return;
            } else {
                f24446b++;
            }
        }
    }

    private static void y() {
        while (true) {
            int i10 = f24446b;
            if (i10 >= f24447c || !Character.isWhitespace(f24448d.charAt(i10))) {
                return;
            } else {
                f24446b++;
            }
        }
    }

    private static void z(float f10, float f11, float f12, float f13) {
        float f14 = f24451g;
        float f15 = f24452h;
        A(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }
}
