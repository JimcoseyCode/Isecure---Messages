package f6;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import g6.InterfaceC2680a;
import java.util.Arrays;
import java.util.List;
import l6.AbstractC2876b;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: f6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2615a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2680a f27243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f27244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Point[] f27245c;

    /* JADX INFO: renamed from: f6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class C0272a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f27247b;

        public C0272a(int i10, String[] strArr) {
            this.f27246a = i10;
            this.f27247b = strArr;
        }

        public String[] a() {
            return this.f27247b;
        }
    }

    /* JADX INFO: renamed from: f6.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f27251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f27252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f27253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f27254g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f27255h;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
            this.f27248a = i10;
            this.f27249b = i11;
            this.f27250c = i12;
            this.f27251d = i13;
            this.f27252e = i14;
            this.f27253f = i15;
            this.f27254g = z10;
            this.f27255h = str;
        }
    }

    /* JADX INFO: renamed from: f6.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f27260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f27261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final b f27262g;

        public c(String str, String str2, String str3, String str4, String str5, b bVar, b bVar2) {
            this.f27256a = str;
            this.f27257b = str2;
            this.f27258c = str3;
            this.f27259d = str4;
            this.f27260e = str5;
            this.f27261f = bVar;
            this.f27262g = bVar2;
        }

        public String a() {
            return this.f27257b;
        }

        public b b() {
            return this.f27262g;
        }

        public String c() {
            return this.f27258c;
        }

        public b d() {
            return this.f27261f;
        }

        public String e() {
            return this.f27256a;
        }
    }

    /* JADX INFO: renamed from: f6.a$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f27263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f27266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f27267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f27268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f27269g;

        public d(h hVar, String str, String str2, List list, List list2, List list3, List list4) {
            this.f27263a = hVar;
            this.f27264b = str;
            this.f27265c = str2;
            this.f27266d = list;
            this.f27267e = list2;
            this.f27268f = list3;
            this.f27269g = list4;
        }

        public List a() {
            return this.f27269g;
        }

        public List b() {
            return this.f27267e;
        }

        public h c() {
            return this.f27263a;
        }

        public String d() {
            return this.f27264b;
        }

        public List e() {
            return this.f27266d;
        }

        public String f() {
            return this.f27265c;
        }

        public List g() {
            return this.f27268f;
        }
    }

    /* JADX INFO: renamed from: f6.a$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f27274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f27275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f27276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f27277h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f27278i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f27279j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f27280k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f27281l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f27282m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f27283n;

        public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f27270a = str;
            this.f27271b = str2;
            this.f27272c = str3;
            this.f27273d = str4;
            this.f27274e = str5;
            this.f27275f = str6;
            this.f27276g = str7;
            this.f27277h = str8;
            this.f27278i = str9;
            this.f27279j = str10;
            this.f27280k = str11;
            this.f27281l = str12;
            this.f27282m = str13;
            this.f27283n = str14;
        }

        public String a() {
            return this.f27276g;
        }

        public String b() {
            return this.f27277h;
        }

        public String c() {
            return this.f27275f;
        }

        public String d() {
            return this.f27281l;
        }

        public String e() {
            return this.f27271b;
        }

        public String f() {
            return this.f27280k;
        }

        public String g() {
            return this.f27273d;
        }

        public String h() {
            return this.f27279j;
        }

        public String i() {
            return this.f27272c;
        }
    }

    /* JADX INFO: renamed from: f6.a$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27287d;

        public f(int i10, String str, String str2, String str3) {
            this.f27284a = i10;
            this.f27285b = str;
            this.f27286c = str2;
            this.f27287d = str3;
        }

        public String a() {
            return this.f27285b;
        }

        public String b() {
            return this.f27287d;
        }

        public String c() {
            return this.f27286c;
        }
    }

    /* JADX INFO: renamed from: f6.a$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f27288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f27289b;

        public g(double d10, double d11) {
            this.f27288a = d10;
            this.f27289b = d11;
        }

        public double a() {
            return this.f27288a;
        }

        public double b() {
            return this.f27289b;
        }
    }

    /* JADX INFO: renamed from: f6.a$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f27294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f27295f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f27296g;

        public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f27290a = str;
            this.f27291b = str2;
            this.f27292c = str3;
            this.f27293d = str4;
            this.f27294e = str5;
            this.f27295f = str6;
            this.f27296g = str7;
        }

        public String a() {
            return this.f27293d;
        }

        public String b() {
            return this.f27295f;
        }

        public String c() {
            return this.f27294e;
        }
    }

    /* JADX INFO: renamed from: f6.a$i */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27298b;

        public i(String str, int i10) {
            this.f27297a = str;
            this.f27298b = i10;
        }

        public String a() {
            return this.f27297a;
        }

        public int b() {
            return this.f27298b;
        }
    }

    /* JADX INFO: renamed from: f6.a$j */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27300b;

        public j(String str, String str2) {
            this.f27299a = str;
            this.f27300b = str2;
        }

        public String a() {
            return this.f27299a;
        }

        public String b() {
            return this.f27300b;
        }
    }

    /* JADX INFO: renamed from: f6.a$k */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27302b;

        public k(String str, String str2) {
            this.f27301a = str;
            this.f27302b = str2;
        }

        public String a() {
            return this.f27302b;
        }
    }

    /* JADX INFO: renamed from: f6.a$l */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27305c;

        public l(String str, String str2, int i10) {
            this.f27303a = str;
            this.f27304b = str2;
            this.f27305c = i10;
        }

        public int a() {
            return this.f27305c;
        }

        public String b() {
            return this.f27304b;
        }

        public String c() {
            return this.f27303a;
        }
    }

    public C2615a(InterfaceC2680a interfaceC2680a) {
        this(interfaceC2680a, null);
    }

    public c a() {
        return this.f27243a.e();
    }

    public d b() {
        return this.f27243a.h();
    }

    public Point[] c() {
        return this.f27245c;
    }

    public String d() {
        return this.f27243a.i();
    }

    public e e() {
        return this.f27243a.b();
    }

    public f f() {
        return this.f27243a.l();
    }

    public int g() {
        int format = this.f27243a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public g h() {
        return this.f27243a.m();
    }

    public i i() {
        return this.f27243a.a();
    }

    public byte[] j() {
        byte[] bArrJ = this.f27243a.j();
        if (bArrJ != null) {
            return Arrays.copyOf(bArrJ, bArrJ.length);
        }
        return null;
    }

    public String k() {
        return this.f27243a.d();
    }

    public j l() {
        return this.f27243a.g();
    }

    public k m() {
        return this.f27243a.getUrl();
    }

    public int n() {
        return this.f27243a.f();
    }

    public l o() {
        return this.f27243a.n();
    }

    public C2615a(InterfaceC2680a interfaceC2680a, Matrix matrix) {
        this.f27243a = (InterfaceC2680a) AbstractC3268i.k(interfaceC2680a);
        Rect rectC = interfaceC2680a.c();
        if (rectC != null && matrix != null) {
            AbstractC2876b.c(rectC, matrix);
        }
        this.f27244b = rectC;
        Point[] pointArrK = interfaceC2680a.k();
        if (pointArrK != null && matrix != null) {
            AbstractC2876b.b(pointArrK, matrix);
        }
        this.f27245c = pointArrK;
    }
}
