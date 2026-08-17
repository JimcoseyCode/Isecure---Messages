package U1;

import U1.b;
import U1.e;
import U1.g;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.devtools.ExpoNetworkInspectOkHttpNetworkInterceptor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static HashSet f11135i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f11136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f11137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U1.g f11138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0115h f11139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack f11140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Stack f11141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Stack f11142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.q f11143h = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f11146c;

        static {
            int[] iArr = new int[g.E.d.values().length];
            f11146c = iArr;
            try {
                iArr[g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11146c[g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11146c[g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[g.E.c.values().length];
            f11145b = iArr2;
            try {
                iArr2[g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11145b[g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11145b[g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[e.a.values().length];
            f11144a = iArr3;
            try {
                iArr3[e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11144a[e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11144a[e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11144a[e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11144a[e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11144a[e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11144a[e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11144a[e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b implements g.InterfaceC1470x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f11148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f11149c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f11154h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f11147a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f11150d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11151e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11152f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11153g = -1;

        b(g.C1469w c1469w) {
            if (c1469w == null) {
                return;
            }
            c1469w.h(this);
            if (this.f11154h) {
                this.f11150d.b((c) this.f11147a.get(this.f11153g));
                this.f11147a.set(this.f11153g, this.f11150d);
                this.f11154h = false;
            }
            c cVar = this.f11150d;
            if (cVar != null) {
                this.f11147a.add(cVar);
            }
        }

        @Override // U1.g.InterfaceC1470x
        public void a(float f10, float f11, float f12, float f13) {
            this.f11150d.a(f10, f11);
            this.f11147a.add(this.f11150d);
            this.f11150d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f11154h = false;
        }

        @Override // U1.g.InterfaceC1470x
        public void b(float f10, float f11) {
            if (this.f11154h) {
                this.f11150d.b((c) this.f11147a.get(this.f11153g));
                this.f11147a.set(this.f11153g, this.f11150d);
                this.f11154h = false;
            }
            c cVar = this.f11150d;
            if (cVar != null) {
                this.f11147a.add(cVar);
            }
            this.f11148b = f10;
            this.f11149c = f11;
            this.f11150d = h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f11153g = this.f11147a.size();
        }

        @Override // U1.g.InterfaceC1470x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f11152f || this.f11151e) {
                this.f11150d.a(f10, f11);
                this.f11147a.add(this.f11150d);
                this.f11151e = false;
            }
            this.f11150d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f11154h = false;
        }

        @Override // U1.g.InterfaceC1470x
        public void close() {
            this.f11147a.add(this.f11150d);
            e(this.f11148b, this.f11149c);
            this.f11154h = true;
        }

        @Override // U1.g.InterfaceC1470x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f11151e = true;
            this.f11152f = false;
            c cVar = this.f11150d;
            h.h(cVar.f11156a, cVar.f11157b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f11152f = true;
            this.f11154h = false;
        }

        @Override // U1.g.InterfaceC1470x
        public void e(float f10, float f11) {
            this.f11150d.a(f10, f11);
            this.f11147a.add(this.f11150d);
            h hVar = h.this;
            c cVar = this.f11150d;
            this.f11150d = hVar.new c(f10, f11, f10 - cVar.f11156a, f11 - cVar.f11157b);
            this.f11154h = false;
        }

        List f() {
            return this.f11147a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f11156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f11159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f11160e = false;

        c(float f10, float f11, float f12, float f13) {
            this.f11158c = 0.0f;
            this.f11159d = 0.0f;
            this.f11156a = f10;
            this.f11157b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f11158c = (float) (((double) f12) / dSqrt);
                this.f11159d = (float) (((double) f13) / dSqrt);
            }
        }

        void a(float f10, float f11) {
            float f12 = f10 - this.f11156a;
            float f13 = f11 - this.f11157b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f11158c;
            if (f12 != (-f14) || f13 != (-this.f11159d)) {
                this.f11158c = f14 + f12;
                this.f11159d += f13;
            } else {
                this.f11160e = true;
                this.f11158c = -f13;
                this.f11159d = f12;
            }
        }

        void b(c cVar) {
            float f10 = cVar.f11158c;
            float f11 = this.f11158c;
            if (f10 == (-f11)) {
                float f12 = cVar.f11159d;
                if (f12 == (-this.f11159d)) {
                    this.f11160e = true;
                    this.f11158c = -f12;
                    this.f11159d = cVar.f11158c;
                    return;
                }
            }
            this.f11158c = f11 + f10;
            this.f11159d += cVar.f11159d;
        }

        public String toString() {
            return "(" + this.f11156a + "," + this.f11157b + " " + this.f11158c + "," + this.f11159d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class d implements g.InterfaceC1470x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Path f11162a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11164c;

        d(g.C1469w c1469w) {
            if (c1469w == null) {
                return;
            }
            c1469w.h(this);
        }

        @Override // U1.g.InterfaceC1470x
        public void a(float f10, float f11, float f12, float f13) {
            this.f11162a.quadTo(f10, f11, f12, f13);
            this.f11163b = f12;
            this.f11164c = f13;
        }

        @Override // U1.g.InterfaceC1470x
        public void b(float f10, float f11) {
            this.f11162a.moveTo(f10, f11);
            this.f11163b = f10;
            this.f11164c = f11;
        }

        @Override // U1.g.InterfaceC1470x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f11162a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f11163b = f14;
            this.f11164c = f15;
        }

        @Override // U1.g.InterfaceC1470x
        public void close() {
            this.f11162a.close();
        }

        @Override // U1.g.InterfaceC1470x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.f11163b, this.f11164c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f11163b = f13;
            this.f11164c = f14;
        }

        @Override // U1.g.InterfaceC1470x
        public void e(float f10, float f11) {
            this.f11162a.lineTo(f10, f11);
            this.f11163b = f10;
            this.f11164c = f11;
        }

        Path f() {
            return this.f11162a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Path f11166e;

        e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f11166e = path;
        }

        @Override // U1.h.f, U1.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f11139d.f11176b) {
                    str2 = str;
                    h.this.f11136a.drawTextOnPath(str2, this.f11166e, this.f11168b, this.f11169c, h.this.f11139d.f11178d);
                } else {
                    str2 = str;
                }
                if (h.this.f11139d.f11177c) {
                    h.this.f11136a.drawTextOnPath(str2, this.f11166e, this.f11168b, this.f11169c, h.this.f11139d.f11179e);
                }
            } else {
                str2 = str;
            }
            this.f11168b += h.this.f11139d.f11178d.measureText(str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11169c;

        f(float f10, float f11) {
            super(h.this, null);
            this.f11168b = f10;
            this.f11169c = f11;
        }

        @Override // U1.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f11139d.f11176b) {
                    h.this.f11136a.drawText(str, this.f11168b, this.f11169c, h.this.f11139d.f11178d);
                }
                if (h.this.f11139d.f11177c) {
                    h.this.f11136a.drawText(str, this.f11168b, this.f11169c, h.this.f11139d.f11179e);
                }
            }
            this.f11168b += h.this.f11139d.f11178d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f11173d;

        g(float f10, float f11, Path path) {
            super(h.this, null);
            this.f11171b = f10;
            this.f11172c = f11;
            this.f11173d = path;
        }

        @Override // U1.h.j
        public boolean a(g.Y y10) {
            if (!(y10 instanceof g.Z)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // U1.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f11139d.f11178d.getTextPath(str2, 0, str.length(), this.f11171b, this.f11172c, path);
                this.f11173d.addPath(path);
            } else {
                str2 = str;
            }
            this.f11171b += h.this.f11139d.f11178d.measureText(str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RectF f11186d;

        i(float f10, float f11) {
            super(h.this, null);
            this.f11186d = new RectF();
            this.f11184b = f10;
            this.f11185c = f11;
        }

        @Override // U1.h.j
        public boolean a(g.Y y10) {
            if (!(y10 instanceof g.Z)) {
                return true;
            }
            g.Z z10 = (g.Z) y10;
            g.N nR = y10.f11025a.r(z10.f11038o);
            if (nR == null) {
                h.F("TextPath path reference '%s' not found", z10.f11038o);
                return false;
            }
            g.C1468v c1468v = (g.C1468v) nR;
            Path pathF = h.this.new d(c1468v.f11120o).f();
            Matrix matrix = c1468v.f11092n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.f11186d.union(rectF);
            return false;
        }

        @Override // U1.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f11139d.f11178d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f11184b, this.f11185c);
                this.f11186d.union(rectF);
            }
            this.f11184b += h.this.f11139d.f11178d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private abstract class j {
        private j() {
        }

        public boolean a(g.Y y10) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    h(Canvas canvas, float f10) {
        this.f11136a = canvas;
        this.f11137b = f10;
    }

    private boolean A() {
        Boolean bool = this.f11139d.f11175a.f10931G;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(g.N n10) {
        if (n10 instanceof g.InterfaceC1466t) {
            return;
        }
        S0();
        u(n10);
        if (n10 instanceof g.F) {
            x0((g.F) n10);
        } else if (n10 instanceof g.e0) {
            E0((g.e0) n10);
        } else if (n10 instanceof g.S) {
            B0((g.S) n10);
        } else if (n10 instanceof g.C1459m) {
            q0((g.C1459m) n10);
        } else if (n10 instanceof g.C1461o) {
            r0((g.C1461o) n10);
        } else if (n10 instanceof g.C1468v) {
            t0((g.C1468v) n10);
        } else if (n10 instanceof g.B) {
            w0((g.B) n10);
        } else if (n10 instanceof g.C1451d) {
            o0((g.C1451d) n10);
        } else if (n10 instanceof g.C1455i) {
            p0((g.C1455i) n10);
        } else if (n10 instanceof g.C1463q) {
            s0((g.C1463q) n10);
        } else if (n10 instanceof g.A) {
            v0((g.A) n10);
        } else if (n10 instanceof g.C1472z) {
            u0((g.C1472z) n10);
        } else if (n10 instanceof g.W) {
            D0((g.W) n10);
        }
        R0();
    }

    private void B(g.K k10, Path path) {
        g.O o10 = this.f11139d.f11175a.f10945h;
        if (o10 instanceof g.C1467u) {
            g.N nR = this.f11138c.r(((g.C1467u) o10).f11118g);
            if (nR instanceof g.C1471y) {
                L(k10, path, (g.C1471y) nR);
                return;
            }
        }
        this.f11136a.drawPath(path, this.f11139d.f11178d);
    }

    private void B0(g.S s10) {
        y("Switch render", new Object[0]);
        W0(this.f11139d, s10);
        if (A()) {
            Matrix matrix = s10.f11093o;
            if (matrix != null) {
                this.f11136a.concat(matrix);
            }
            p(s10);
            boolean zM0 = m0();
            K0(s10);
            if (zM0) {
                j0(s10);
            }
            U0(s10);
        }
    }

    private void C(Path path) {
        C0115h c0115h = this.f11139d;
        if (c0115h.f11175a.f10942R != g.E.i.NonScalingStroke) {
            this.f11136a.drawPath(path, c0115h.f11179e);
            return;
        }
        Matrix matrix = this.f11136a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f11136a.setMatrix(new Matrix());
        Shader shader = this.f11139d.f11179e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f11136a.drawPath(path2, this.f11139d.f11179e);
        this.f11136a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(g.T t10, g.C1449b c1449b) {
        y("Symbol render", new Object[0]);
        if (c1449b.f11048c == 0.0f || c1449b.f11049d == 0.0f) {
            return;
        }
        U1.e eVar = t10.f11027o;
        if (eVar == null) {
            eVar = U1.e.f10882e;
        }
        W0(this.f11139d, t10);
        C0115h c0115h = this.f11139d;
        c0115h.f11180f = c1449b;
        if (!c0115h.f11175a.f10926B.booleanValue()) {
            g.C1449b c1449b2 = this.f11139d.f11180f;
            O0(c1449b2.f11046a, c1449b2.f11047b, c1449b2.f11048c, c1449b2.f11049d);
        }
        g.C1449b c1449b3 = t10.f11033p;
        if (c1449b3 != null) {
            this.f11136a.concat(o(this.f11139d.f11180f, c1449b3, eVar));
            this.f11139d.f11181g = t10.f11033p;
        } else {
            Canvas canvas = this.f11136a;
            g.C1449b c1449b4 = this.f11139d.f11180f;
            canvas.translate(c1449b4.f11046a, c1449b4.f11047b);
        }
        boolean zM0 = m0();
        F0(t10, true);
        if (zM0) {
            j0(t10);
        }
        U0(t10);
    }

    private float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    private void D0(g.W w10) {
        y("Text render", new Object[0]);
        W0(this.f11139d, w10);
        if (A()) {
            Matrix matrix = w10.f11037s;
            if (matrix != null) {
                this.f11136a.concat(matrix);
            }
            List list = w10.f11042o;
            float fG = 0.0f;
            float f10 = (list == null || list.size() == 0) ? 0.0f : ((g.C1462p) w10.f11042o.get(0)).f(this);
            List list2 = w10.f11043p;
            float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : ((g.C1462p) w10.f11043p.get(0)).g(this);
            List list3 = w10.f11044q;
            float f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C1462p) w10.f11044q.get(0)).f(this);
            List list4 = w10.f11045r;
            if (list4 != null && list4.size() != 0) {
                fG = ((g.C1462p) w10.f11045r.get(0)).g(this);
            }
            g.E.f fVarO = O();
            if (fVarO != g.E.f.Start) {
                float fN = n(w10);
                if (fVarO == g.E.f.Middle) {
                    fN /= 2.0f;
                }
                f10 -= fN;
            }
            if (w10.f11015h == null) {
                i iVar = new i(f10, fG2);
                E(w10, iVar);
                RectF rectF = iVar.f11186d;
                w10.f11015h = new g.C1449b(rectF.left, rectF.top, rectF.width(), iVar.f11186d.height());
            }
            U0(w10);
            r(w10);
            p(w10);
            boolean zM0 = m0();
            E(w10, new f(f10 + f11, fG2 + fG));
            if (zM0) {
                j0(w10);
            }
        }
    }

    private void E(g.Y y10, j jVar) {
        if (A()) {
            Iterator it = y10.f11004i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                g.N n10 = (g.N) it.next();
                if (n10 instanceof g.c0) {
                    jVar.b(T0(((g.c0) n10).f11054c, z10, !it.hasNext()));
                } else {
                    l0(n10, jVar);
                }
                z10 = false;
            }
        }
    }

    private void E0(g.e0 e0Var) {
        y("Use render", new Object[0]);
        g.C1462p c1462p = e0Var.f11073s;
        if (c1462p == null || !c1462p.i()) {
            g.C1462p c1462p2 = e0Var.f11074t;
            if (c1462p2 == null || !c1462p2.i()) {
                W0(this.f11139d, e0Var);
                if (A()) {
                    g.N nR = e0Var.f11025a.r(e0Var.f11070p);
                    if (nR == null) {
                        F("Use reference '%s' not found", e0Var.f11070p);
                        return;
                    }
                    Matrix matrix = e0Var.f11093o;
                    if (matrix != null) {
                        this.f11136a.concat(matrix);
                    }
                    g.C1462p c1462p3 = e0Var.f11071q;
                    float f10 = c1462p3 != null ? c1462p3.f(this) : 0.0f;
                    g.C1462p c1462p4 = e0Var.f11072r;
                    this.f11136a.translate(f10, c1462p4 != null ? c1462p4.g(this) : 0.0f);
                    p(e0Var);
                    boolean zM0 = m0();
                    i0(e0Var);
                    if (nR instanceof g.F) {
                        g.C1449b c1449bF0 = f0(null, null, e0Var.f11073s, e0Var.f11074t);
                        S0();
                        y0((g.F) nR, c1449bF0);
                        R0();
                    } else if (nR instanceof g.T) {
                        g.C1462p c1462p5 = e0Var.f11073s;
                        if (c1462p5 == null) {
                            c1462p5 = new g.C1462p(100.0f, g.d0.percent);
                        }
                        g.C1462p c1462p6 = e0Var.f11074t;
                        if (c1462p6 == null) {
                            c1462p6 = new g.C1462p(100.0f, g.d0.percent);
                        }
                        g.C1449b c1449bF02 = f0(null, null, c1462p5, c1462p6);
                        S0();
                        C0((g.T) nR, c1449bF02);
                        R0();
                    } else {
                        A0(nR);
                    }
                    h0();
                    if (zM0) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        String.format(str, objArr);
    }

    private void F0(g.J j10, boolean z10) {
        if (z10) {
            i0(j10);
        }
        Iterator it = j10.b().iterator();
        while (it.hasNext()) {
            A0((g.N) it.next());
        }
        if (z10) {
            h0();
        }
    }

    private void G(g.Y y10, StringBuilder sb) {
        Iterator it = y10.f11004i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            g.N n10 = (g.N) it.next();
            if (n10 instanceof g.Y) {
                G((g.Y) n10, sb);
            } else if (n10 instanceof g.c0) {
                sb.append(T0(((g.c0) n10).f11054c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    private void H(g.AbstractC1456j abstractC1456j, String str) {
        g.N nR = abstractC1456j.f11025a.r(str);
        if (nR == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(nR instanceof g.AbstractC1456j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (nR == abstractC1456j) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        g.AbstractC1456j abstractC1456j2 = (g.AbstractC1456j) nR;
        if (abstractC1456j.f11084i == null) {
            abstractC1456j.f11084i = abstractC1456j2.f11084i;
        }
        if (abstractC1456j.f11085j == null) {
            abstractC1456j.f11085j = abstractC1456j2.f11085j;
        }
        if (abstractC1456j.f11086k == null) {
            abstractC1456j.f11086k = abstractC1456j2.f11086k;
        }
        if (abstractC1456j.f11083h.isEmpty()) {
            abstractC1456j.f11083h = abstractC1456j2.f11083h;
        }
        try {
            if (abstractC1456j instanceof g.M) {
                I((g.M) abstractC1456j, (g.M) nR);
            } else {
                J((g.Q) abstractC1456j, (g.Q) nR);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC1456j2.f11087l;
        if (str2 != null) {
            H(abstractC1456j, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void H0(g.C1464r c1464r, c cVar) {
        float fFloatValue;
        float f10;
        float f11;
        float f12;
        S0();
        Float f13 = c1464r.f11111v;
        float f14 = 0.0f;
        if (f13 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f13.floatValue())) {
            float f15 = cVar.f11158c;
            if (f15 != 0.0f || cVar.f11159d != 0.0f) {
                fFloatValue = (float) Math.toDegrees(Math.atan2(cVar.f11159d, f15));
            }
        } else {
            fFloatValue = c1464r.f11111v.floatValue();
        }
        float fB = c1464r.f11106q ? 1.0f : this.f11139d.f11175a.f10950m.b(this.f11137b);
        this.f11139d = M(c1464r);
        Matrix matrix = new Matrix();
        matrix.preTranslate(cVar.f11156a, cVar.f11157b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fB, fB);
        g.C1462p c1462p = c1464r.f11107r;
        float f16 = c1462p != null ? c1462p.f(this) : 0.0f;
        g.C1462p c1462p2 = c1464r.f11108s;
        float fG = c1462p2 != null ? c1462p2.g(this) : 0.0f;
        g.C1462p c1462p3 = c1464r.f11109t;
        float f17 = c1462p3 != null ? c1462p3.f(this) : 3.0f;
        g.C1462p c1462p4 = c1464r.f11110u;
        float fG2 = c1462p4 != null ? c1462p4.g(this) : 3.0f;
        g.C1449b c1449b = c1464r.f11033p;
        if (c1449b != null) {
            float fMax = f17 / c1449b.f11048c;
            float f18 = fG2 / c1449b.f11049d;
            U1.e eVar = c1464r.f11027o;
            if (eVar == null) {
                eVar = U1.e.f10882e;
            }
            if (!eVar.equals(U1.e.f10881d)) {
                fMax = eVar.b() == e.b.slice ? Math.max(fMax, f18) : Math.min(fMax, f18);
                f18 = fMax;
            }
            matrix.preTranslate((-f16) * fMax, (-fG) * f18);
            this.f11136a.concat(matrix);
            g.C1449b c1449b2 = c1464r.f11033p;
            float f19 = c1449b2.f11048c * fMax;
            float f20 = c1449b2.f11049d * f18;
            int[] iArr = a.f11144a;
            switch (iArr[eVar.a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f10 = (f17 - f19) / 2.0f;
                    f11 = 0.0f - f10;
                    break;
                case 4:
                case 5:
                case 6:
                    f10 = f17 - f19;
                    f11 = 0.0f - f10;
                    break;
                default:
                    f11 = 0.0f;
                    break;
            }
            int i10 = iArr[eVar.a().ordinal()];
            if (i10 == 2) {
                f12 = (fG2 - f20) / 2.0f;
                f14 = 0.0f - f12;
                if (!this.f11139d.f11175a.f10926B.booleanValue()) {
                    O0(f11, f14, f17, fG2);
                }
                matrix.reset();
                matrix.preScale(fMax, f18);
                this.f11136a.concat(matrix);
            } else {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                            }
                        }
                    }
                    f12 = (fG2 - f20) / 2.0f;
                    f14 = 0.0f - f12;
                    if (!this.f11139d.f11175a.f10926B.booleanValue()) {
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f18);
                    this.f11136a.concat(matrix);
                }
                f12 = fG2 - f20;
                f14 = 0.0f - f12;
                if (!this.f11139d.f11175a.f10926B.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(fMax, f18);
                this.f11136a.concat(matrix);
            }
        } else {
            matrix.preTranslate(-f16, -fG);
            this.f11136a.concat(matrix);
            if (!this.f11139d.f11175a.f10926B.booleanValue()) {
                O0(0.0f, 0.0f, f17, fG2);
            }
        }
        boolean zM0 = m0();
        F0(c1464r, false);
        if (zM0) {
            j0(c1464r);
        }
        R0();
    }

    private void I(g.M m10, g.M m11) {
        if (m10.f11021m == null) {
            m10.f11021m = m11.f11021m;
        }
        if (m10.f11022n == null) {
            m10.f11022n = m11.f11022n;
        }
        if (m10.f11023o == null) {
            m10.f11023o = m11.f11023o;
        }
        if (m10.f11024p == null) {
            m10.f11024p = m11.f11024p;
        }
    }

    private void I0(g.AbstractC1458l abstractC1458l) {
        g.C1464r c1464r;
        g.C1464r c1464r2;
        g.C1464r c1464r3;
        int size;
        g.E e10 = this.f11139d.f11175a;
        String str = e10.f10928D;
        if (str == null && e10.f10929E == null && e10.f10930F == null) {
            return;
        }
        if (str == null) {
            c1464r = null;
        } else {
            g.N nR = abstractC1458l.f11025a.r(str);
            if (nR != null) {
                c1464r = (g.C1464r) nR;
            } else {
                F("Marker reference '%s' not found", this.f11139d.f11175a.f10928D);
                c1464r = null;
            }
        }
        String str2 = this.f11139d.f11175a.f10929E;
        if (str2 == null) {
            c1464r2 = null;
        } else {
            g.N nR2 = abstractC1458l.f11025a.r(str2);
            if (nR2 != null) {
                c1464r2 = (g.C1464r) nR2;
            } else {
                F("Marker reference '%s' not found", this.f11139d.f11175a.f10929E);
                c1464r2 = null;
            }
        }
        String str3 = this.f11139d.f11175a.f10930F;
        if (str3 == null) {
            c1464r3 = null;
        } else {
            g.N nR3 = abstractC1458l.f11025a.r(str3);
            if (nR3 != null) {
                c1464r3 = (g.C1464r) nR3;
            } else {
                F("Marker reference '%s' not found", this.f11139d.f11175a.f10930F);
                c1464r3 = null;
            }
        }
        List listF = abstractC1458l instanceof g.C1468v ? new b(((g.C1468v) abstractC1458l).f11120o).f() : abstractC1458l instanceof g.C1463q ? k((g.C1463q) abstractC1458l) : l((g.C1472z) abstractC1458l);
        if (listF == null || (size = listF.size()) == 0) {
            return;
        }
        g.E e11 = this.f11139d.f11175a;
        e11.f10930F = null;
        e11.f10929E = null;
        e11.f10928D = null;
        if (c1464r != null) {
            H0(c1464r, (c) listF.get(0));
        }
        if (c1464r2 != null && listF.size() > 2) {
            c cVarN0 = (c) listF.get(0);
            c cVar = (c) listF.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = (c) listF.get(i10);
                cVarN0 = cVar.f11160e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(c1464r2, cVarN0);
                cVar = cVar2;
            }
        }
        if (c1464r3 != null) {
            H0(c1464r3, (c) listF.get(size - 1));
        }
    }

    private void J(g.Q q10, g.Q q11) {
        if (q10.f11028m == null) {
            q10.f11028m = q11.f11028m;
        }
        if (q10.f11029n == null) {
            q10.f11029n = q11.f11029n;
        }
        if (q10.f11030o == null) {
            q10.f11030o = q11.f11030o;
        }
        if (q10.f11031p == null) {
            q10.f11031p = q11.f11031p;
        }
        if (q10.f11032q == null) {
            q10.f11032q = q11.f11032q;
        }
    }

    private void J0(g.C1465s c1465s, g.K k10, g.C1449b c1449b) {
        float f10;
        float fG;
        y("Mask render", new Object[0]);
        Boolean bool = c1465s.f11112o;
        if (bool == null || !bool.booleanValue()) {
            g.C1462p c1462p = c1465s.f11116s;
            float fE = c1462p != null ? c1462p.e(this, 1.0f) : 1.2f;
            g.C1462p c1462p2 = c1465s.f11117t;
            float fE2 = c1462p2 != null ? c1462p2.e(this, 1.0f) : 1.2f;
            f10 = fE * c1449b.f11048c;
            fG = fE2 * c1449b.f11049d;
        } else {
            g.C1462p c1462p3 = c1465s.f11116s;
            f10 = c1462p3 != null ? c1462p3.f(this) : c1449b.f11048c;
            g.C1462p c1462p4 = c1465s.f11117t;
            fG = c1462p4 != null ? c1462p4.g(this) : c1449b.f11049d;
        }
        if (f10 == 0.0f || fG == 0.0f) {
            return;
        }
        S0();
        C0115h c0115hM = M(c1465s);
        this.f11139d = c0115hM;
        c0115hM.f11175a.f10956s = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f11136a.save();
        Boolean bool2 = c1465s.f11113p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f11136a.translate(c1449b.f11046a, c1449b.f11047b);
            this.f11136a.scale(c1449b.f11048c, c1449b.f11049d);
        }
        F0(c1465s, false);
        this.f11136a.restore();
        if (zM0) {
            k0(k10, c1449b);
        }
        R0();
    }

    private void K(g.C1471y c1471y, String str) {
        g.N nR = c1471y.f11025a.r(str);
        if (nR == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(nR instanceof g.C1471y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (nR == c1471y) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        g.C1471y c1471y2 = (g.C1471y) nR;
        if (c1471y.f11126q == null) {
            c1471y.f11126q = c1471y2.f11126q;
        }
        if (c1471y.f11127r == null) {
            c1471y.f11127r = c1471y2.f11127r;
        }
        if (c1471y.f11128s == null) {
            c1471y.f11128s = c1471y2.f11128s;
        }
        if (c1471y.f11129t == null) {
            c1471y.f11129t = c1471y2.f11129t;
        }
        if (c1471y.f11130u == null) {
            c1471y.f11130u = c1471y2.f11130u;
        }
        if (c1471y.f11131v == null) {
            c1471y.f11131v = c1471y2.f11131v;
        }
        if (c1471y.f11132w == null) {
            c1471y.f11132w = c1471y2.f11132w;
        }
        if (c1471y.f11004i.isEmpty()) {
            c1471y.f11004i = c1471y2.f11004i;
        }
        if (c1471y.f11033p == null) {
            c1471y.f11033p = c1471y2.f11033p;
        }
        if (c1471y.f11027o == null) {
            c1471y.f11027o = c1471y2.f11027o;
        }
        String str2 = c1471y2.f11133x;
        if (str2 != null) {
            K(c1471y, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(g.S s10) {
        Set setC;
        String language = Locale.getDefault().getLanguage();
        U1.g.k();
        for (g.N n10 : s10.b()) {
            if (n10 instanceof g.G) {
                g.G g10 = (g.G) n10;
                if (g10.e() == null && ((setC = g10.c()) == null || (!setC.isEmpty() && setC.contains(language)))) {
                    Set setI = g10.i();
                    if (setI != null) {
                        if (f11135i == null) {
                            V();
                        }
                        if (setI.isEmpty() || !f11135i.containsAll(setI)) {
                        }
                    }
                    Set setM = g10.m();
                    if (setM != null) {
                        setM.isEmpty();
                    } else {
                        Set setN = g10.n();
                        if (setN == null) {
                            A0(n10);
                            return;
                        }
                        setN.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void L(g.K k10, Path path, g.C1471y c1471y) {
        float f10;
        float fG;
        float fG2;
        float f11;
        float f12;
        boolean z10;
        boolean z11;
        float f13;
        Boolean bool = c1471y.f11126q;
        boolean z12 = bool != null && bool.booleanValue();
        String str = c1471y.f11133x;
        if (str != null) {
            K(c1471y, str);
        }
        if (z12) {
            g.C1462p c1462p = c1471y.f11129t;
            f10 = c1462p != null ? c1462p.f(this) : 0.0f;
            g.C1462p c1462p2 = c1471y.f11130u;
            fG2 = c1462p2 != null ? c1462p2.g(this) : 0.0f;
            g.C1462p c1462p3 = c1471y.f11131v;
            f11 = c1462p3 != null ? c1462p3.f(this) : 0.0f;
            g.C1462p c1462p4 = c1471y.f11132w;
            fG = c1462p4 != null ? c1462p4.g(this) : 0.0f;
        } else {
            g.C1462p c1462p5 = c1471y.f11129t;
            float fE = c1462p5 != null ? c1462p5.e(this, 1.0f) : 0.0f;
            g.C1462p c1462p6 = c1471y.f11130u;
            float fE2 = c1462p6 != null ? c1462p6.e(this, 1.0f) : 0.0f;
            g.C1462p c1462p7 = c1471y.f11131v;
            float fE3 = c1462p7 != null ? c1462p7.e(this, 1.0f) : 0.0f;
            g.C1462p c1462p8 = c1471y.f11132w;
            float fE4 = c1462p8 != null ? c1462p8.e(this, 1.0f) : 0.0f;
            g.C1449b c1449b = k10.f11015h;
            float f14 = c1449b.f11046a;
            float f15 = c1449b.f11048c;
            f10 = (fE * f15) + f14;
            float f16 = c1449b.f11047b;
            float f17 = c1449b.f11049d;
            float f18 = fE3 * f15;
            fG = fE4 * f17;
            fG2 = (fE2 * f17) + f16;
            f11 = f18;
        }
        if (f11 == 0.0f || fG == 0.0f) {
            return;
        }
        U1.e eVar = c1471y.f11027o;
        if (eVar == null) {
            eVar = U1.e.f10882e;
        }
        S0();
        this.f11136a.clipPath(path);
        C0115h c0115h = new C0115h();
        V0(c0115h, g.E.a());
        c0115h.f11175a.f10926B = Boolean.FALSE;
        this.f11139d = N(c1471y, c0115h);
        g.C1449b c1449b2 = k10.f11015h;
        Matrix matrix = c1471y.f11128s;
        if (matrix != null) {
            this.f11136a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (c1471y.f11128s.invert(matrix2)) {
                g.C1449b c1449b3 = k10.f11015h;
                float f19 = c1449b3.f11046a;
                float f20 = c1449b3.f11047b;
                float fB = c1449b3.b();
                g.C1449b c1449b4 = k10.f11015h;
                z10 = false;
                float f21 = c1449b4.f11047b;
                float fB2 = c1449b4.b();
                z11 = true;
                float fC = k10.f11015h.c();
                g.C1449b c1449b5 = k10.f11015h;
                f12 = f10;
                float[] fArr = {f19, f20, fB, f21, fB2, fC, c1449b5.f11046a, c1449b5.c()};
                matrix2.mapPoints(fArr);
                float f22 = fArr[0];
                float f23 = fArr[1];
                RectF rectF = new RectF(f22, f23, f22, f23);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f24 = fArr[i10];
                    if (f24 < rectF.left) {
                        rectF.left = f24;
                    }
                    if (f24 > rectF.right) {
                        rectF.right = f24;
                    }
                    float f25 = fArr[i10 + 1];
                    if (f25 < rectF.top) {
                        rectF.top = f25;
                    }
                    if (f25 > rectF.bottom) {
                        rectF.bottom = f25;
                    }
                }
                float f26 = rectF.left;
                float f27 = rectF.top;
                c1449b2 = new g.C1449b(f26, f27, rectF.right - f26, rectF.bottom - f27);
            } else {
                f12 = f10;
                z10 = false;
                z11 = true;
            }
        }
        float fFloor = f12 + (((float) Math.floor((c1449b2.f11046a - f12) / f11)) * f11);
        float fB3 = c1449b2.b();
        float fC2 = c1449b2.c();
        g.C1449b c1449b6 = new g.C1449b(0.0f, 0.0f, f11, fG);
        boolean zM0 = m0();
        for (float fFloor2 = fG2 + (((float) Math.floor((c1449b2.f11047b - fG2) / fG)) * fG); fFloor2 < fC2; fFloor2 += fG) {
            float f28 = fFloor;
            while (f28 < fB3) {
                c1449b6.f11046a = f28;
                c1449b6.f11047b = fFloor2;
                S0();
                if (this.f11139d.f11175a.f10926B.booleanValue()) {
                    f13 = fFloor;
                } else {
                    f13 = fFloor;
                    O0(c1449b6.f11046a, c1449b6.f11047b, c1449b6.f11048c, c1449b6.f11049d);
                }
                g.C1449b c1449b7 = c1471y.f11033p;
                if (c1449b7 != null) {
                    this.f11136a.concat(o(c1449b6, c1449b7, eVar));
                } else {
                    Boolean bool2 = c1471y.f11127r;
                    boolean z13 = (bool2 == null || bool2.booleanValue()) ? z11 : z10;
                    this.f11136a.translate(f28, fFloor2);
                    if (!z13) {
                        Canvas canvas = this.f11136a;
                        g.C1449b c1449b8 = k10.f11015h;
                        canvas.scale(c1449b8.f11048c, c1449b8.f11049d);
                    }
                }
                Iterator it = c1471y.f11004i.iterator();
                while (it.hasNext()) {
                    A0((g.N) it.next());
                }
                R0();
                f28 += f11;
                fFloor = f13;
            }
        }
        if (zM0) {
            j0(c1471y);
        }
        R0();
    }

    private void L0(g.Z z10) {
        y("TextPath render", new Object[0]);
        W0(this.f11139d, z10);
        if (A() && Y0()) {
            g.N nR = z10.f11025a.r(z10.f11038o);
            if (nR == null) {
                F("TextPath reference '%s' not found", z10.f11038o);
                return;
            }
            g.C1468v c1468v = (g.C1468v) nR;
            Path pathF = new d(c1468v.f11120o).f();
            Matrix matrix = c1468v.f11092n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            g.C1462p c1462p = z10.f11039p;
            float fE = c1462p != null ? c1462p.e(this, pathMeasure.getLength()) : 0.0f;
            g.E.f fVarO = O();
            if (fVarO != g.E.f.Start) {
                float fN = n(z10);
                if (fVarO == g.E.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            r((g.K) z10.g());
            boolean zM0 = m0();
            E(z10, new e(pathF, fE, 0.0f));
            if (zM0) {
                j0(z10);
            }
        }
    }

    private C0115h M(g.N n10) {
        C0115h c0115h = new C0115h();
        V0(c0115h, g.E.a());
        return N(n10, c0115h);
    }

    private boolean M0() {
        return this.f11139d.f11175a.f10956s.floatValue() < 1.0f || this.f11139d.f11175a.f10937M != null;
    }

    private C0115h N(g.N n10, C0115h c0115h) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n10 instanceof g.L) {
                arrayList.add(0, (g.L) n10);
            }
            Object obj = n10.f11026b;
            if (obj == null) {
                break;
            }
            n10 = (g.N) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(c0115h, (g.L) it.next());
        }
        C0115h c0115h2 = this.f11139d;
        c0115h.f11181g = c0115h2.f11181g;
        c0115h.f11180f = c0115h2.f11180f;
        return c0115h;
    }

    private void N0() {
        this.f11139d = new C0115h();
        this.f11140e = new Stack();
        V0(this.f11139d, g.E.a());
        C0115h c0115h = this.f11139d;
        c0115h.f11180f = null;
        c0115h.f11182h = false;
        this.f11140e.push(new C0115h(c0115h));
        this.f11142g = new Stack();
        this.f11141f = new Stack();
    }

    private g.E.f O() {
        g.E.f fVar;
        g.E e10 = this.f11139d.f11175a;
        if (e10.f10963z == g.E.h.LTR || (fVar = e10.f10925A) == g.E.f.Middle) {
            return e10.f10925A;
        }
        g.E.f fVar2 = g.E.f.Start;
        return fVar == fVar2 ? g.E.f.End : fVar2;
    }

    private void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float fG = f13 + f11;
        g.C1450c c1450c = this.f11139d.f11175a.f10927C;
        if (c1450c != null) {
            f10 += c1450c.f11053d.f(this);
            f11 += this.f11139d.f11175a.f10927C.f11050a.g(this);
            f14 -= this.f11139d.f11175a.f10927C.f11051b.f(this);
            fG -= this.f11139d.f11175a.f10927C.f11052c.g(this);
        }
        this.f11136a.clipRect(f10, f11, f14, fG);
    }

    private Path.FillType P() {
        g.E.a aVar = this.f11139d.f11175a.f10936L;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0115h c0115h, boolean z10, g.O o10) {
        int i10;
        g.E e10 = c0115h.f11175a;
        float fFloatValue = (z10 ? e10.f10947j : e10.f10949l).floatValue();
        if (o10 instanceof g.C1453f) {
            i10 = ((g.C1453f) o10).f11077g;
        } else if (!(o10 instanceof g.C0114g)) {
            return;
        } else {
            i10 = c0115h.f11175a.f10957t.f11077g;
        }
        int iX = x(i10, fFloatValue);
        if (z10) {
            c0115h.f11178d.setColor(iX);
        } else {
            c0115h.f11179e.setColor(iX);
        }
    }

    private void Q0(boolean z10, g.C c10) {
        if (z10) {
            if (W(c10.f11018e, 2147483648L)) {
                C0115h c0115h = this.f11139d;
                g.E e10 = c0115h.f11175a;
                g.O o10 = c10.f11018e.f10938N;
                e10.f10945h = o10;
                c0115h.f11176b = o10 != null;
            }
            if (W(c10.f11018e, 4294967296L)) {
                this.f11139d.f11175a.f10947j = c10.f11018e.f10939O;
            }
            if (W(c10.f11018e, 6442450944L)) {
                C0115h c0115h2 = this.f11139d;
                P0(c0115h2, z10, c0115h2.f11175a.f10945h);
                return;
            }
            return;
        }
        if (W(c10.f11018e, 2147483648L)) {
            C0115h c0115h3 = this.f11139d;
            g.E e11 = c0115h3.f11175a;
            g.O o11 = c10.f11018e.f10938N;
            e11.f10948k = o11;
            c0115h3.f11177c = o11 != null;
        }
        if (W(c10.f11018e, 4294967296L)) {
            this.f11139d.f11175a.f10949l = c10.f11018e.f10939O;
        }
        if (W(c10.f11018e, 6442450944L)) {
            C0115h c0115h4 = this.f11139d;
            P0(c0115h4, z10, c0115h4.f11175a.f10948k);
        }
    }

    private void R0() {
        this.f11136a.restore();
        this.f11139d = (C0115h) this.f11140e.pop();
    }

    private void S0() {
        this.f11136a.save();
        this.f11140e.push(this.f11139d);
        this.f11139d = new C0115h(this.f11139d);
    }

    private String T0(String str, boolean z10, boolean z11) {
        if (this.f11139d.f11182h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", PointerEventHelper.POINTER_TYPE_UNKNOWN).replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        g.E.a aVar = this.f11139d.f11175a.f10946i;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(g.K k10) {
        if (k10.f11026b == null || k10.f11015h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f11142g.peek()).invert(matrix)) {
            g.C1449b c1449b = k10.f11015h;
            float f10 = c1449b.f11046a;
            float f11 = c1449b.f11047b;
            float fB = c1449b.b();
            g.C1449b c1449b2 = k10.f11015h;
            float f12 = c1449b2.f11047b;
            float fB2 = c1449b2.b();
            float fC = k10.f11015h.c();
            g.C1449b c1449b3 = k10.f11015h;
            float[] fArr = {f10, f11, fB, f12, fB2, fC, c1449b3.f11046a, c1449b3.c()};
            matrix.preConcat(this.f11136a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            g.K k11 = (g.K) this.f11141f.peek();
            g.C1449b c1449b4 = k11.f11015h;
            if (c1449b4 == null) {
                k11.f11015h = g.C1449b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c1449b4.e(g.C1449b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        HashSet hashSet = new HashSet();
        f11135i = hashSet;
        hashSet.add("Structure");
        f11135i.add("BasicStructure");
        f11135i.add("ConditionalProcessing");
        f11135i.add("Image");
        f11135i.add("Style");
        f11135i.add("ViewportAttribute");
        f11135i.add("Shape");
        f11135i.add("BasicText");
        f11135i.add("PaintAttribute");
        f11135i.add("BasicPaintAttribute");
        f11135i.add("OpacityAttribute");
        f11135i.add("BasicGraphicsAttribute");
        f11135i.add("Marker");
        f11135i.add("Gradient");
        f11135i.add("Pattern");
        f11135i.add("Clip");
        f11135i.add("BasicClip");
        f11135i.add("Mask");
        f11135i.add("View");
    }

    private void V0(C0115h c0115h, g.E e10) {
        if (W(e10, 4096L)) {
            c0115h.f11175a.f10957t = e10.f10957t;
        }
        if (W(e10, 2048L)) {
            c0115h.f11175a.f10956s = e10.f10956s;
        }
        if (W(e10, 1L)) {
            c0115h.f11175a.f10945h = e10.f10945h;
            g.O o10 = e10.f10945h;
            c0115h.f11176b = (o10 == null || o10 == g.C1453f.f11076i) ? false : true;
        }
        if (W(e10, 4L)) {
            c0115h.f11175a.f10947j = e10.f10947j;
        }
        if (W(e10, 6149L)) {
            P0(c0115h, true, c0115h.f11175a.f10945h);
        }
        if (W(e10, 2L)) {
            c0115h.f11175a.f10946i = e10.f10946i;
        }
        if (W(e10, 8L)) {
            c0115h.f11175a.f10948k = e10.f10948k;
            g.O o11 = e10.f10948k;
            c0115h.f11177c = (o11 == null || o11 == g.C1453f.f11076i) ? false : true;
        }
        if (W(e10, 16L)) {
            c0115h.f11175a.f10949l = e10.f10949l;
        }
        if (W(e10, 6168L)) {
            P0(c0115h, false, c0115h.f11175a.f10948k);
        }
        if (W(e10, 34359738368L)) {
            c0115h.f11175a.f10942R = e10.f10942R;
        }
        if (W(e10, 32L)) {
            g.E e11 = c0115h.f11175a;
            g.C1462p c1462p = e10.f10950m;
            e11.f10950m = c1462p;
            c0115h.f11179e.setStrokeWidth(c1462p.c(this));
        }
        if (W(e10, 64L)) {
            c0115h.f11175a.f10951n = e10.f10951n;
            int i10 = a.f11145b[e10.f10951n.ordinal()];
            if (i10 == 1) {
                c0115h.f11179e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0115h.f11179e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0115h.f11179e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e10, 128L)) {
            c0115h.f11175a.f10952o = e10.f10952o;
            int i11 = a.f11146c[e10.f10952o.ordinal()];
            if (i11 == 1) {
                c0115h.f11179e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0115h.f11179e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0115h.f11179e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e10, 256L)) {
            c0115h.f11175a.f10953p = e10.f10953p;
            c0115h.f11179e.setStrokeMiter(e10.f10953p.floatValue());
        }
        if (W(e10, 512L)) {
            c0115h.f11175a.f10954q = e10.f10954q;
        }
        if (W(e10, 1024L)) {
            c0115h.f11175a.f10955r = e10.f10955r;
        }
        Typeface typefaceT = null;
        if (W(e10, 1536L)) {
            g.C1462p[] c1462pArr = c0115h.f11175a.f10954q;
            if (c1462pArr == null) {
                c0115h.f11179e.setPathEffect(null);
            } else {
                int length = c1462pArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fC = c0115h.f11175a.f10954q[i13 % length].c(this);
                    fArr[i13] = fC;
                    f10 += fC;
                }
                if (f10 == 0.0f) {
                    c0115h.f11179e.setPathEffect(null);
                } else {
                    float fC2 = c0115h.f11175a.f10955r.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f10) + f10;
                    }
                    c0115h.f11179e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (W(e10, 16384L)) {
            float fQ = Q();
            c0115h.f11175a.f10959v = e10.f10959v;
            c0115h.f11178d.setTextSize(e10.f10959v.e(this, fQ));
            c0115h.f11179e.setTextSize(e10.f10959v.e(this, fQ));
        }
        if (W(e10, 8192L)) {
            c0115h.f11175a.f10958u = e10.f10958u;
        }
        if (W(e10, 32768L)) {
            if (e10.f10960w.intValue() == -1 && c0115h.f11175a.f10960w.intValue() > 100) {
                g.E e12 = c0115h.f11175a;
                e12.f10960w = Integer.valueOf(e12.f10960w.intValue() - 100);
            } else if (e10.f10960w.intValue() != 1 || c0115h.f11175a.f10960w.intValue() >= 900) {
                c0115h.f11175a.f10960w = e10.f10960w;
            } else {
                g.E e13 = c0115h.f11175a;
                e13.f10960w = Integer.valueOf(e13.f10960w.intValue() + 100);
            }
        }
        if (W(e10, 65536L)) {
            c0115h.f11175a.f10961x = e10.f10961x;
        }
        if (W(e10, 106496L)) {
            if (c0115h.f11175a.f10958u != null && this.f11138c != null) {
                U1.g.k();
                for (String str : c0115h.f11175a.f10958u) {
                    g.E e14 = c0115h.f11175a;
                    typefaceT = t(str, e14.f10960w, e14.f10961x);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                g.E e15 = c0115h.f11175a;
                typefaceT = t("serif", e15.f10960w, e15.f10961x);
            }
            c0115h.f11178d.setTypeface(typefaceT);
            c0115h.f11179e.setTypeface(typefaceT);
        }
        if (W(e10, 131072L)) {
            c0115h.f11175a.f10962y = e10.f10962y;
            Paint paint = c0115h.f11178d;
            g.E.EnumC0113g enumC0113g = e10.f10962y;
            g.E.EnumC0113g enumC0113g2 = g.E.EnumC0113g.LineThrough;
            paint.setStrikeThruText(enumC0113g == enumC0113g2);
            Paint paint2 = c0115h.f11178d;
            g.E.EnumC0113g enumC0113g3 = e10.f10962y;
            g.E.EnumC0113g enumC0113g4 = g.E.EnumC0113g.Underline;
            paint2.setUnderlineText(enumC0113g3 == enumC0113g4);
            c0115h.f11179e.setStrikeThruText(e10.f10962y == enumC0113g2);
            c0115h.f11179e.setUnderlineText(e10.f10962y == enumC0113g4);
        }
        if (W(e10, 68719476736L)) {
            c0115h.f11175a.f10963z = e10.f10963z;
        }
        if (W(e10, 262144L)) {
            c0115h.f11175a.f10925A = e10.f10925A;
        }
        if (W(e10, 524288L)) {
            c0115h.f11175a.f10926B = e10.f10926B;
        }
        if (W(e10, 2097152L)) {
            c0115h.f11175a.f10928D = e10.f10928D;
        }
        if (W(e10, 4194304L)) {
            c0115h.f11175a.f10929E = e10.f10929E;
        }
        if (W(e10, 8388608L)) {
            c0115h.f11175a.f10930F = e10.f10930F;
        }
        if (W(e10, 16777216L)) {
            c0115h.f11175a.f10931G = e10.f10931G;
        }
        if (W(e10, 33554432L)) {
            c0115h.f11175a.f10932H = e10.f10932H;
        }
        if (W(e10, ExpoNetworkInspectOkHttpNetworkInterceptor.MAX_BODY_SIZE)) {
            c0115h.f11175a.f10927C = e10.f10927C;
        }
        if (W(e10, 268435456L)) {
            c0115h.f11175a.f10935K = e10.f10935K;
        }
        if (W(e10, 536870912L)) {
            c0115h.f11175a.f10936L = e10.f10936L;
        }
        if (W(e10, 1073741824L)) {
            c0115h.f11175a.f10937M = e10.f10937M;
        }
        if (W(e10, 67108864L)) {
            c0115h.f11175a.f10933I = e10.f10933I;
        }
        if (W(e10, 134217728L)) {
            c0115h.f11175a.f10934J = e10.f10934J;
        }
        if (W(e10, 8589934592L)) {
            c0115h.f11175a.f10940P = e10.f10940P;
        }
        if (W(e10, 17179869184L)) {
            c0115h.f11175a.f10941Q = e10.f10941Q;
        }
        if (W(e10, 137438953472L)) {
            c0115h.f11175a.f10943S = e10.f10943S;
        }
    }

    private boolean W(g.E e10, long j10) {
        return (e10.f10944g & j10) != 0;
    }

    private void W0(C0115h c0115h, g.L l10) {
        c0115h.f11175a.b(l10.f11026b == null);
        g.E e10 = l10.f11018e;
        if (e10 != null) {
            V0(c0115h, e10);
        }
        if (this.f11138c.n()) {
            for (b.p pVar : this.f11138c.d()) {
                if (U1.b.l(this.f11143h, pVar.f10861a, l10)) {
                    V0(c0115h, pVar.f10862b);
                }
            }
        }
        g.E e11 = l10.f11019f;
        if (e11 != null) {
            V0(c0115h, e11);
        }
    }

    private void X(boolean z10, g.C1449b c1449b, g.M m10) {
        float fE;
        float f10;
        float fE2;
        float f11;
        String str = m10.f11087l;
        if (str != null) {
            H(m10, str);
        }
        Boolean bool = m10.f11084i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0115h c0115h = this.f11139d;
        Paint paint = z10 ? c0115h.f11178d : c0115h.f11179e;
        if (z11) {
            g.C1449b c1449bS = S();
            g.C1462p c1462p = m10.f11021m;
            float f12 = c1462p != null ? c1462p.f(this) : 0.0f;
            g.C1462p c1462p2 = m10.f11022n;
            fE = c1462p2 != null ? c1462p2.g(this) : 0.0f;
            g.C1462p c1462p3 = m10.f11023o;
            float f13 = c1462p3 != null ? c1462p3.f(this) : c1449bS.f11048c;
            g.C1462p c1462p4 = m10.f11024p;
            f11 = f13;
            f10 = f12;
            fE2 = c1462p4 != null ? c1462p4.g(this) : 0.0f;
        } else {
            g.C1462p c1462p5 = m10.f11021m;
            float fE3 = c1462p5 != null ? c1462p5.e(this, 1.0f) : 0.0f;
            g.C1462p c1462p6 = m10.f11022n;
            fE = c1462p6 != null ? c1462p6.e(this, 1.0f) : 0.0f;
            g.C1462p c1462p7 = m10.f11023o;
            float fE4 = c1462p7 != null ? c1462p7.e(this, 1.0f) : 1.0f;
            g.C1462p c1462p8 = m10.f11024p;
            f10 = fE3;
            fE2 = c1462p8 != null ? c1462p8.e(this, 1.0f) : 0.0f;
            f11 = fE4;
        }
        float f14 = fE;
        S0();
        this.f11139d = M(m10);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c1449b.f11046a, c1449b.f11047b);
            matrix.preScale(c1449b.f11048c, c1449b.f11049d);
        }
        Matrix matrix2 = m10.f11085j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m10.f11083h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f11139d.f11176b = false;
                return;
            } else {
                this.f11139d.f11177c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m10.f11083h.iterator();
        float f15 = -1.0f;
        while (it.hasNext()) {
            g.D d10 = (g.D) ((g.N) it.next());
            Float f16 = d10.f10924h;
            float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f15) {
                fArr[i10] = fFloatValue;
                f15 = fFloatValue;
            } else {
                fArr[i10] = f15;
            }
            S0();
            W0(this.f11139d, d10);
            g.E e10 = this.f11139d.f11175a;
            g.C1453f c1453f = (g.C1453f) e10.f10933I;
            if (c1453f == null) {
                c1453f = g.C1453f.f11075h;
            }
            iArr[i10] = x(c1453f.f11077g, e10.f10934J.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f11 && f14 == fE2) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.EnumC1457k enumC1457k = m10.f11086k;
        if (enumC1457k != null) {
            if (enumC1457k == g.EnumC1457k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC1457k == g.EnumC1457k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f14, f11, fE2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f11139d.f11175a.f10947j.floatValue()));
    }

    private void X0() {
        int iX;
        g.E e10 = this.f11139d.f11175a;
        g.O o10 = e10.f10940P;
        if (o10 instanceof g.C1453f) {
            iX = ((g.C1453f) o10).f11077g;
        } else if (!(o10 instanceof g.C0114g)) {
            return;
        } else {
            iX = e10.f10957t.f11077g;
        }
        Float f10 = e10.f10941Q;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f11136a.drawColor(iX);
    }

    private Path Y(g.C1451d c1451d) {
        g.C1462p c1462p = c1451d.f11056o;
        float f10 = c1462p != null ? c1462p.f(this) : 0.0f;
        g.C1462p c1462p2 = c1451d.f11057p;
        float fG = c1462p2 != null ? c1462p2.g(this) : 0.0f;
        float fC = c1451d.f11058q.c(this);
        float f11 = f10 - fC;
        float f12 = fG - fC;
        float f13 = f10 + fC;
        float f14 = fG + fC;
        if (c1451d.f11015h == null) {
            float f15 = 2.0f * fC;
            c1451d.f11015h = new g.C1449b(f11, f12, f15, f15);
        }
        float f16 = fC * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f12);
        float f17 = f10 + f16;
        float f18 = fG - f16;
        path.cubicTo(f17, f12, f13, f18, f13, fG);
        float f19 = fG + f16;
        path.cubicTo(f13, f19, f17, f14, f10, f14);
        float f20 = f10 - f16;
        path.cubicTo(f20, f14, f11, f19, f11, fG);
        path.cubicTo(f11, f18, f20, f12, f10, f12);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f11139d.f11175a.f10932H;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(g.C1455i c1455i) {
        g.C1462p c1462p = c1455i.f11079o;
        float f10 = c1462p != null ? c1462p.f(this) : 0.0f;
        g.C1462p c1462p2 = c1455i.f11080p;
        float fG = c1462p2 != null ? c1462p2.g(this) : 0.0f;
        float f11 = c1455i.f11081q.f(this);
        float fG2 = c1455i.f11082r.g(this);
        float f12 = f10 - f11;
        float f13 = fG - fG2;
        float f14 = f10 + f11;
        float f15 = fG + fG2;
        if (c1455i.f11015h == null) {
            c1455i.f11015h = new g.C1449b(f12, f13, f11 * 2.0f, 2.0f * fG2);
        }
        float f16 = f11 * 0.5522848f;
        float f17 = fG2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f13);
        float f18 = f10 + f16;
        float f19 = fG - f17;
        path.cubicTo(f18, f13, f14, f19, f14, fG);
        float f20 = fG + f17;
        path.cubicTo(f14, f20, f18, f15, f10, f15);
        float f21 = f10 - f16;
        path.cubicTo(f21, f15, f12, f20, f12, fG);
        path.cubicTo(f12, f19, f21, f13, f10, f13);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        String.format(str, objArr);
    }

    private Path a0(g.C1463q c1463q) {
        g.C1462p c1462p = c1463q.f11102o;
        float f10 = c1462p == null ? 0.0f : c1462p.f(this);
        g.C1462p c1462p2 = c1463q.f11103p;
        float fG = c1462p2 == null ? 0.0f : c1462p2.g(this);
        g.C1462p c1462p3 = c1463q.f11104q;
        float f11 = c1462p3 == null ? 0.0f : c1462p3.f(this);
        g.C1462p c1462p4 = c1463q.f11105r;
        float fG2 = c1462p4 != null ? c1462p4.g(this) : 0.0f;
        if (c1463q.f11015h == null) {
            c1463q.f11015h = new g.C1449b(Math.min(f10, f11), Math.min(fG, fG2), Math.abs(f11 - f10), Math.abs(fG2 - fG));
        }
        Path path = new Path();
        path.moveTo(f10, fG);
        path.lineTo(f11, fG2);
        return path;
    }

    private Path b0(g.C1472z c1472z) {
        Path path = new Path();
        float[] fArr = c1472z.f11134o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = c1472z.f11134o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (c1472z instanceof g.A) {
            path.close();
        }
        if (c1472z.f11015h == null) {
            c1472z.f11015h = m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path c0(g.B b10) {
        float f10;
        float fG;
        float fMin;
        float f11;
        float fG2;
        float f12;
        float f13;
        Path path;
        g.C1462p c1462p = b10.f10922s;
        if (c1462p == null && b10.f10923t == null) {
            f10 = 0.0f;
        } else if (c1462p == null) {
            f10 = b10.f10923t.g(this);
        } else {
            if (b10.f10923t != null) {
                f10 = c1462p.f(this);
                fG = b10.f10923t.g(this);
                fMin = Math.min(f10, b10.f10920q.f(this) / 2.0f);
                float fMin2 = Math.min(fG, b10.f10921r.g(this) / 2.0f);
                g.C1462p c1462p2 = b10.f10918o;
                f11 = c1462p2 == null ? c1462p2.f(this) : 0.0f;
                g.C1462p c1462p3 = b10.f10919p;
                fG2 = c1462p3 == null ? c1462p3.g(this) : 0.0f;
                float f14 = b10.f10920q.f(this);
                float fG3 = b10.f10921r.g(this);
                if (b10.f11015h == null) {
                    b10.f11015h = new g.C1449b(f11, fG2, f14, fG3);
                }
                f12 = f14 + f11;
                f13 = fG2 + fG3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(f11, fG2);
                    path.lineTo(f12, fG2);
                    path.lineTo(f12, f13);
                    path.lineTo(f11, f13);
                    path.lineTo(f11, fG2);
                } else {
                    float f15 = fMin * 0.5522848f;
                    float f16 = 0.5522848f * fMin2;
                    float f17 = fG2 + fMin2;
                    path.moveTo(f11, f17);
                    float f18 = f17 - f16;
                    float f19 = f11 + fMin;
                    float f20 = f19 - f15;
                    path.cubicTo(f11, f18, f20, fG2, f19, fG2);
                    float f21 = f12 - fMin;
                    path.lineTo(f21, fG2);
                    float f22 = f21 + f15;
                    path.cubicTo(f22, fG2, f12, f18, f12, f17);
                    float f23 = f13 - fMin2;
                    path.lineTo(f12, f23);
                    float f24 = f23 + f16;
                    path.cubicTo(f12, f24, f22, f13, f21, f13);
                    path.lineTo(f19, f13);
                    float f25 = f11;
                    path.cubicTo(f20, f13, f25, f24, f11, f23);
                    path.lineTo(f25, f17);
                }
                path.close();
                return path;
            }
            f10 = c1462p.f(this);
        }
        fG = f10;
        fMin = Math.min(f10, b10.f10920q.f(this) / 2.0f);
        float fMin22 = Math.min(fG, b10.f10921r.g(this) / 2.0f);
        g.C1462p c1462p22 = b10.f10918o;
        if (c1462p22 == null) {
        }
        g.C1462p c1462p32 = b10.f10919p;
        if (c1462p32 == null) {
        }
        float f142 = b10.f10920q.f(this);
        float fG32 = b10.f10921r.g(this);
        if (b10.f11015h == null) {
        }
        f12 = f142 + f11;
        f13 = fG2 + fG32;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(f11, fG2);
            path.lineTo(f12, fG2);
            path.lineTo(f12, f13);
            path.lineTo(f11, f13);
            path.lineTo(f11, fG2);
        }
        path.close();
        return path;
    }

    private Path d0(g.W w10) {
        List list = w10.f11042o;
        float fG = 0.0f;
        float f10 = (list == null || list.size() == 0) ? 0.0f : ((g.C1462p) w10.f11042o.get(0)).f(this);
        List list2 = w10.f11043p;
        float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : ((g.C1462p) w10.f11043p.get(0)).g(this);
        List list3 = w10.f11044q;
        float f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C1462p) w10.f11044q.get(0)).f(this);
        List list4 = w10.f11045r;
        if (list4 != null && list4.size() != 0) {
            fG = ((g.C1462p) w10.f11045r.get(0)).g(this);
        }
        if (this.f11139d.f11175a.f10925A != g.E.f.Start) {
            float fN = n(w10);
            if (this.f11139d.f11175a.f10925A == g.E.f.Middle) {
                fN /= 2.0f;
            }
            f10 -= fN;
        }
        if (w10.f11015h == null) {
            i iVar = new i(f10, fG2);
            E(w10, iVar);
            RectF rectF = iVar.f11186d;
            w10.f11015h = new g.C1449b(rectF.left, rectF.top, rectF.width(), iVar.f11186d.height());
        }
        Path path = new Path();
        E(w10, new g(f10 + f11, fG2 + fG, path));
        return path;
    }

    private void e0(boolean z10, g.C1449b c1449b, g.Q q10) {
        float f10;
        float fE;
        float f11;
        String str = q10.f11087l;
        if (str != null) {
            H(q10, str);
        }
        Boolean bool = q10.f11084i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0115h c0115h = this.f11139d;
        Paint paint = z10 ? c0115h.f11178d : c0115h.f11179e;
        if (z11) {
            g.C1462p c1462p = new g.C1462p(50.0f, g.d0.percent);
            g.C1462p c1462p2 = q10.f11028m;
            float f12 = c1462p2 != null ? c1462p2.f(this) : c1462p.f(this);
            g.C1462p c1462p3 = q10.f11029n;
            float fG = c1462p3 != null ? c1462p3.g(this) : c1462p.g(this);
            g.C1462p c1462p4 = q10.f11030o;
            fE = c1462p4 != null ? c1462p4.c(this) : c1462p.c(this);
            f10 = f12;
            f11 = fG;
        } else {
            g.C1462p c1462p5 = q10.f11028m;
            float fE2 = c1462p5 != null ? c1462p5.e(this, 1.0f) : 0.5f;
            g.C1462p c1462p6 = q10.f11029n;
            float fE3 = c1462p6 != null ? c1462p6.e(this, 1.0f) : 0.5f;
            g.C1462p c1462p7 = q10.f11030o;
            f10 = fE2;
            fE = c1462p7 != null ? c1462p7.e(this, 1.0f) : 0.5f;
            f11 = fE3;
        }
        S0();
        this.f11139d = M(q10);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c1449b.f11046a, c1449b.f11047b);
            matrix.preScale(c1449b.f11048c, c1449b.f11049d);
        }
        Matrix matrix2 = q10.f11085j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q10.f11083h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f11139d.f11176b = false;
                return;
            } else {
                this.f11139d.f11177c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = q10.f11083h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            g.D d10 = (g.D) ((g.N) it.next());
            Float f14 = d10.f10924h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f11139d, d10);
            g.E e10 = this.f11139d.f11175a;
            g.C1453f c1453f = (g.C1453f) e10.f10933I;
            if (c1453f == null) {
                c1453f = g.C1453f.f11075h;
            }
            iArr[i10] = x(c1453f.f11077g, e10.f10934J.floatValue());
            i10++;
            R0();
        }
        if (fE == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.EnumC1457k enumC1457k = q10.f11086k;
        if (enumC1457k != null) {
            if (enumC1457k == g.EnumC1457k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC1457k == g.EnumC1457k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fE, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f11139d.f11175a.f10947j.floatValue()));
    }

    private g.C1449b f0(g.C1462p c1462p, g.C1462p c1462p2, g.C1462p c1462p3, g.C1462p c1462p4) {
        float f10 = c1462p != null ? c1462p.f(this) : 0.0f;
        float fG = c1462p2 != null ? c1462p2.g(this) : 0.0f;
        g.C1449b c1449bS = S();
        return new g.C1449b(f10, fG, c1462p3 != null ? c1462p3.f(this) : c1449bS.f11048c, c1462p4 != null ? c1462p4.g(this) : c1449bS.f11049d);
    }

    private Path g0(g.K k10, boolean z10) {
        Path pathD0;
        Path pathJ;
        this.f11140e.push(this.f11139d);
        C0115h c0115h = new C0115h(this.f11139d);
        this.f11139d = c0115h;
        W0(c0115h, k10);
        if (!A() || !Y0()) {
            this.f11139d = (C0115h) this.f11140e.pop();
            return null;
        }
        if (k10 instanceof g.e0) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            g.e0 e0Var = (g.e0) k10;
            g.N nR = k10.f11025a.r(e0Var.f11070p);
            if (nR == null) {
                F("Use reference '%s' not found", e0Var.f11070p);
                this.f11139d = (C0115h) this.f11140e.pop();
                return null;
            }
            if (!(nR instanceof g.K)) {
                this.f11139d = (C0115h) this.f11140e.pop();
                return null;
            }
            pathD0 = g0((g.K) nR, false);
            if (pathD0 == null) {
                return null;
            }
            if (e0Var.f11015h == null) {
                e0Var.f11015h = m(pathD0);
            }
            Matrix matrix = e0Var.f11093o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k10 instanceof g.AbstractC1458l) {
            g.AbstractC1458l abstractC1458l = (g.AbstractC1458l) k10;
            if (k10 instanceof g.C1468v) {
                pathD0 = new d(((g.C1468v) k10).f11120o).f();
                if (k10.f11015h == null) {
                    k10.f11015h = m(pathD0);
                }
            } else {
                pathD0 = k10 instanceof g.B ? c0((g.B) k10) : k10 instanceof g.C1451d ? Y((g.C1451d) k10) : k10 instanceof g.C1455i ? Z((g.C1455i) k10) : k10 instanceof g.C1472z ? b0((g.C1472z) k10) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (abstractC1458l.f11015h == null) {
                abstractC1458l.f11015h = m(pathD0);
            }
            Matrix matrix2 = abstractC1458l.f11092n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k10 instanceof g.W)) {
                F("Invalid %s element found in clipPath definition", k10.o());
                return null;
            }
            g.W w10 = (g.W) k10;
            pathD0 = d0(w10);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w10.f11037s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f11139d.f11175a.f10935K != null && (pathJ = j(k10, k10.f11015h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f11139d = (C0115h) this.f11140e.pop();
        return pathD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, g.InterfaceC1470x interfaceC1470x) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            interfaceC1470x.e(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (dCos * d11);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = (-((d25 * d12) / d24)) * dSqrt2;
        double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dV = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && dV > 0.0d) {
            dV -= 6.283185307179586d;
        } else if (z11 && dV < 0.0d) {
            dV += 6.283185307179586d;
        }
        float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrI);
        fArrI[fArrI.length - 2] = f15;
        fArrI[fArrI.length - 1] = f16;
        for (int i10 = 0; i10 < fArrI.length; i10 += 6) {
            interfaceC1470x.c(fArrI[i10], fArrI[i10 + 1], fArrI[i10 + 2], fArrI[i10 + 3], fArrI[i10 + 4], fArrI[i10 + 5]);
        }
    }

    private void h0() {
        this.f11141f.pop();
        this.f11142g.pop();
    }

    private static float[] i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d14 = d10 + (((double) i10) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private void i0(g.J j10) {
        this.f11141f.push(j10);
        this.f11142g.push(this.f11136a.getMatrix());
    }

    private Path j(g.K k10, g.C1449b c1449b) {
        Path pathG0;
        g.N nR = k10.f11025a.r(this.f11139d.f11175a.f10935K);
        if (nR == null) {
            F("ClipPath reference '%s' not found", this.f11139d.f11175a.f10935K);
            return null;
        }
        g.C1452e c1452e = (g.C1452e) nR;
        this.f11140e.push(this.f11139d);
        this.f11139d = M(c1452e);
        Boolean bool = c1452e.f11069p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c1449b.f11046a, c1449b.f11047b);
            matrix.preScale(c1449b.f11048c, c1449b.f11049d);
        }
        Matrix matrix2 = c1452e.f11093o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (g.N n10 : c1452e.f11004i) {
            if ((n10 instanceof g.K) && (pathG0 = g0((g.K) n10, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f11139d.f11175a.f10935K != null) {
            if (c1452e.f11015h == null) {
                c1452e.f11015h = m(path);
            }
            Path pathJ = j(c1452e, c1452e.f11015h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f11139d = (C0115h) this.f11140e.pop();
        return path;
    }

    private void j0(g.K k10) {
        k0(k10, k10.f11015h);
    }

    private List k(g.C1463q c1463q) {
        g.C1462p c1462p = c1463q.f11102o;
        float f10 = c1462p != null ? c1462p.f(this) : 0.0f;
        g.C1462p c1462p2 = c1463q.f11103p;
        float fG = c1462p2 != null ? c1462p2.g(this) : 0.0f;
        g.C1462p c1462p3 = c1463q.f11104q;
        float f11 = c1462p3 != null ? c1462p3.f(this) : 0.0f;
        g.C1462p c1462p4 = c1463q.f11105r;
        float fG2 = c1462p4 != null ? c1462p4.g(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = f11 - f10;
        float f13 = fG2 - fG;
        arrayList.add(new c(f10, fG, f12, f13));
        arrayList.add(new c(f11, fG2, f12, f13));
        return arrayList;
    }

    private void k0(g.K k10, g.C1449b c1449b) {
        if (this.f11139d.f11175a.f10937M != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f11136a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f11136a.saveLayer(null, paint2, 31);
            g.C1465s c1465s = (g.C1465s) this.f11138c.r(this.f11139d.f11175a.f10937M);
            J0(c1465s, k10, c1449b);
            this.f11136a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f11136a.saveLayer(null, paint3, 31);
            J0(c1465s, k10, c1449b);
            this.f11136a.restore();
            this.f11136a.restore();
        }
        R0();
    }

    private List l(g.C1472z c1472z) {
        int length = c1472z.f11134o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c1472z.f11134o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = c1472z.f11134o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f11156a, f13 - cVar.f11157b);
            f10 = f12;
            f11 = f13;
        }
        if (!(c1472z instanceof g.A)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = c1472z.f11134o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f11156a, f15 - cVar.f11157b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    private void l0(g.N n10, j jVar) {
        float f10;
        float fG;
        float f11;
        g.E.f fVarO;
        if (jVar.a((g.Y) n10)) {
            if (n10 instanceof g.Z) {
                S0();
                L0((g.Z) n10);
                R0();
                return;
            }
            if (!(n10 instanceof g.V)) {
                if (n10 instanceof g.U) {
                    S0();
                    g.U u10 = (g.U) n10;
                    W0(this.f11139d, u10);
                    if (A()) {
                        r((g.K) u10.g());
                        g.N nR = n10.f11025a.r(u10.f11034o);
                        if (nR == null || !(nR instanceof g.Y)) {
                            F("Tref reference '%s' not found", u10.f11034o);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            G((g.Y) nR, sb);
                            if (sb.length() > 0) {
                                jVar.b(sb.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            g.V v10 = (g.V) n10;
            W0(this.f11139d, v10);
            if (A()) {
                List list = v10.f11042o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float fG2 = 0.0f;
                if (z11) {
                    float f12 = !z10 ? ((f) jVar).f11168b : ((g.C1462p) v10.f11042o.get(0)).f(this);
                    List list2 = v10.f11043p;
                    fG = (list2 == null || list2.size() == 0) ? ((f) jVar).f11169c : ((g.C1462p) v10.f11043p.get(0)).g(this);
                    List list3 = v10.f11044q;
                    f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C1462p) v10.f11044q.get(0)).f(this);
                    List list4 = v10.f11045r;
                    if (list4 != null && list4.size() != 0) {
                        fG2 = ((g.C1462p) v10.f11045r.get(0)).g(this);
                    }
                    f10 = fG2;
                    fG2 = f12;
                } else {
                    f10 = 0.0f;
                    fG = 0.0f;
                    f11 = 0.0f;
                }
                if (z10 && (fVarO = O()) != g.E.f.Start) {
                    float fN = n(v10);
                    if (fVarO == g.E.f.Middle) {
                        fN /= 2.0f;
                    }
                    fG2 -= fN;
                }
                r((g.K) v10.g());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f11168b = fG2 + f11;
                    fVar.f11169c = fG + f10;
                }
                boolean zM0 = m0();
                E(v10, jVar);
                if (zM0) {
                    j0(v10);
                }
            }
            R0();
        }
    }

    private g.C1449b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new g.C1449b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        g.N nR;
        if (!M0()) {
            return false;
        }
        this.f11136a.saveLayerAlpha(null, w(this.f11139d.f11175a.f10956s.floatValue()), 31);
        this.f11140e.push(this.f11139d);
        C0115h c0115h = new C0115h(this.f11139d);
        this.f11139d = c0115h;
        String str = c0115h.f11175a.f10937M;
        if (str != null && ((nR = this.f11138c.r(str)) == null || !(nR instanceof g.C1465s))) {
            F("Mask reference '%s' not found", this.f11139d.f11175a.f10937M);
            this.f11139d.f11175a.f10937M = null;
        }
        return true;
    }

    private float n(g.Y y10) {
        k kVar = new k(this, null);
        E(y10, kVar);
        return kVar.f11189b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f11158c, cVar2.f11159d, cVar2.f11156a - cVar.f11156a, cVar2.f11157b - cVar.f11157b);
        if (fD == 0.0f) {
            fD = D(cVar2.f11158c, cVar2.f11159d, cVar3.f11156a - cVar2.f11156a, cVar3.f11157b - cVar2.f11157b);
        }
        if (fD > 0.0f || (fD == 0.0f && (cVar2.f11158c > 0.0f || cVar2.f11159d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f11158c = -cVar2.f11158c;
        cVar2.f11159d = -cVar2.f11159d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Matrix o(g.C1449b c1449b, g.C1449b c1449b2, U1.e eVar) {
        int i10;
        float f10;
        float f11;
        Matrix matrix = new Matrix();
        if (eVar != null && eVar.a() != null) {
            float f12 = c1449b.f11048c / c1449b2.f11048c;
            float f13 = c1449b.f11049d / c1449b2.f11049d;
            float f14 = -c1449b2.f11046a;
            float f15 = -c1449b2.f11047b;
            if (eVar.equals(U1.e.f10881d)) {
                matrix.preTranslate(c1449b.f11046a, c1449b.f11047b);
                matrix.preScale(f12, f13);
                matrix.preTranslate(f14, f15);
                return matrix;
            }
            float fMax = eVar.b() == e.b.slice ? Math.max(f12, f13) : Math.min(f12, f13);
            float f16 = c1449b.f11048c / fMax;
            float f17 = c1449b.f11049d / fMax;
            int[] iArr = a.f11144a;
            switch (iArr[eVar.a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f11 = (c1449b2.f11048c - f16) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f11 = c1449b2.f11048c - f16;
                    break;
                default:
                    i10 = iArr[eVar.a().ordinal()];
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    if (i10 != 7) {
                                    }
                                }
                            }
                            f10 = (c1449b2.f11049d - f17) / 2.0f;
                            f15 -= f10;
                            matrix.preTranslate(c1449b.f11046a, c1449b.f11047b);
                            matrix.preScale(fMax, fMax);
                            matrix.preTranslate(f14, f15);
                        }
                        f10 = c1449b2.f11049d - f17;
                        f15 -= f10;
                        matrix.preTranslate(c1449b.f11046a, c1449b.f11047b);
                        matrix.preScale(fMax, fMax);
                        matrix.preTranslate(f14, f15);
                    } else {
                        f10 = (c1449b2.f11049d - f17) / 2.0f;
                        f15 -= f10;
                        matrix.preTranslate(c1449b.f11046a, c1449b.f11047b);
                        matrix.preScale(fMax, fMax);
                        matrix.preTranslate(f14, f15);
                    }
                    break;
            }
            f14 -= f11;
            i10 = iArr[eVar.a().ordinal()];
            if (i10 != 2) {
            }
        }
        return matrix;
    }

    private void o0(g.C1451d c1451d) {
        y("Circle render", new Object[0]);
        g.C1462p c1462p = c1451d.f11058q;
        if (c1462p == null || c1462p.i()) {
            return;
        }
        W0(this.f11139d, c1451d);
        if (A() && Y0()) {
            Matrix matrix = c1451d.f11092n;
            if (matrix != null) {
                this.f11136a.concat(matrix);
            }
            Path pathY = Y(c1451d);
            U0(c1451d);
            r(c1451d);
            p(c1451d);
            boolean zM0 = m0();
            if (this.f11139d.f11176b) {
                B(c1451d, pathY);
            }
            if (this.f11139d.f11177c) {
                C(pathY);
            }
            if (zM0) {
                j0(c1451d);
            }
        }
    }

    private void p(g.K k10) {
        q(k10, k10.f11015h);
    }

    private void p0(g.C1455i c1455i) {
        y("Ellipse render", new Object[0]);
        g.C1462p c1462p = c1455i.f11081q;
        if (c1462p == null || c1455i.f11082r == null || c1462p.i() || c1455i.f11082r.i()) {
            return;
        }
        W0(this.f11139d, c1455i);
        if (A() && Y0()) {
            Matrix matrix = c1455i.f11092n;
            if (matrix != null) {
                this.f11136a.concat(matrix);
            }
            Path pathZ = Z(c1455i);
            U0(c1455i);
            r(c1455i);
            p(c1455i);
            boolean zM0 = m0();
            if (this.f11139d.f11176b) {
                B(c1455i, pathZ);
            }
            if (this.f11139d.f11177c) {
                C(pathZ);
            }
            if (zM0) {
                j0(c1455i);
            }
        }
    }

    private void q(g.K k10, g.C1449b c1449b) {
        Path pathJ;
        if (this.f11139d.f11175a.f10935K == null || (pathJ = j(k10, c1449b)) == null) {
            return;
        }
        this.f11136a.clipPath(pathJ);
    }

    private void q0(g.C1459m c1459m) {
        y("Group render", new Object[0]);
        W0(this.f11139d, c1459m);
        if (A()) {
            Matrix matrix = c1459m.f11093o;
            if (matrix != null) {
                this.f11136a.concat(matrix);
            }
            p(c1459m);
            boolean zM0 = m0();
            F0(c1459m, true);
            if (zM0) {
                j0(c1459m);
            }
            U0(c1459m);
        }
    }

    private void r(g.K k10) {
        g.O o10 = this.f11139d.f11175a.f10945h;
        if (o10 instanceof g.C1467u) {
            z(true, k10.f11015h, (g.C1467u) o10);
        }
        g.O o11 = this.f11139d.f11175a.f10948k;
        if (o11 instanceof g.C1467u) {
            z(false, k10.f11015h, (g.C1467u) o11);
        }
    }

    private void r0(g.C1461o c1461o) {
        g.C1462p c1462p;
        String str;
        y("Image render", new Object[0]);
        g.C1462p c1462p2 = c1461o.f11097s;
        if (c1462p2 == null || c1462p2.i() || (c1462p = c1461o.f11098t) == null || c1462p.i() || (str = c1461o.f11094p) == null) {
            return;
        }
        U1.e eVar = c1461o.f11027o;
        if (eVar == null) {
            eVar = U1.e.f10882e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            U1.g.k();
            return;
        }
        g.C1449b c1449b = new g.C1449b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f11139d, c1461o);
        if (A() && Y0()) {
            Matrix matrix = c1461o.f11099u;
            if (matrix != null) {
                this.f11136a.concat(matrix);
            }
            g.C1462p c1462p3 = c1461o.f11095q;
            float f10 = c1462p3 != null ? c1462p3.f(this) : 0.0f;
            g.C1462p c1462p4 = c1461o.f11096r;
            this.f11139d.f11180f = new g.C1449b(f10, c1462p4 != null ? c1462p4.g(this) : 0.0f, c1461o.f11097s.f(this), c1461o.f11098t.f(this));
            if (!this.f11139d.f11175a.f10926B.booleanValue()) {
                g.C1449b c1449b2 = this.f11139d.f11180f;
                O0(c1449b2.f11046a, c1449b2.f11047b, c1449b2.f11048c, c1449b2.f11049d);
            }
            c1461o.f11015h = this.f11139d.f11180f;
            U0(c1461o);
            p(c1461o);
            boolean zM0 = m0();
            X0();
            this.f11136a.save();
            this.f11136a.concat(o(this.f11139d.f11180f, c1449b, eVar));
            this.f11136a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.f11139d.f11175a.f10943S != g.E.e.optimizeSpeed ? 2 : 0));
            this.f11136a.restore();
            if (zM0) {
                j0(c1461o);
            }
        }
    }

    private Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    private void s0(g.C1463q c1463q) {
        y("Line render", new Object[0]);
        W0(this.f11139d, c1463q);
        if (A() && Y0() && this.f11139d.f11177c) {
            Matrix matrix = c1463q.f11092n;
            if (matrix != null) {
                this.f11136a.concat(matrix);
            }
            Path pathA0 = a0(c1463q);
            U0(c1463q);
            r(c1463q);
            p(c1463q);
            boolean zM0 = m0();
            C(pathA0);
            I0(c1463q);
            if (zM0) {
                j0(c1463q);
            }
        }
    }

    private Typeface t(String str, Integer num, g.E.b bVar) {
        int i10;
        boolean z10 = bVar == g.E.b.Italic;
        i10 = num.intValue() > 500 ? z10 ? 3 : 1 : z10 ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    private void t0(g.C1468v c1468v) {
        y("Path render", new Object[0]);
        if (c1468v.f11120o == null) {
            return;
        }
        W0(this.f11139d, c1468v);
        if (A() && Y0()) {
            C0115h c0115h = this.f11139d;
            if (c0115h.f11177c || c0115h.f11176b) {
                Matrix matrix = c1468v.f11092n;
                if (matrix != null) {
                    this.f11136a.concat(matrix);
                }
                Path pathF = new d(c1468v.f11120o).f();
                if (c1468v.f11015h == null) {
                    c1468v.f11015h = m(pathF);
                }
                U0(c1468v);
                r(c1468v);
                p(c1468v);
                boolean zM0 = m0();
                if (this.f11139d.f11176b) {
                    pathF.setFillType(U());
                    B(c1468v, pathF);
                }
                if (this.f11139d.f11177c) {
                    C(pathF);
                }
                I0(c1468v);
                if (zM0) {
                    j0(c1468v);
                }
            }
        }
    }

    private void u(g.N n10) {
        Boolean bool;
        if ((n10 instanceof g.L) && (bool = ((g.L) n10).f11017d) != null) {
            this.f11139d.f11182h = bool.booleanValue();
        }
    }

    private void u0(g.C1472z c1472z) {
        y("PolyLine render", new Object[0]);
        W0(this.f11139d, c1472z);
        if (A() && Y0()) {
            C0115h c0115h = this.f11139d;
            if (c0115h.f11177c || c0115h.f11176b) {
                Matrix matrix = c1472z.f11092n;
                if (matrix != null) {
                    this.f11136a.concat(matrix);
                }
                if (c1472z.f11134o.length < 2) {
                    return;
                }
                Path pathB0 = b0(c1472z);
                U0(c1472z);
                pathB0.setFillType(U());
                r(c1472z);
                p(c1472z);
                boolean zM0 = m0();
                if (this.f11139d.f11176b) {
                    B(c1472z, pathB0);
                }
                if (this.f11139d.f11177c) {
                    C(pathB0);
                }
                I0(c1472z);
                if (zM0) {
                    j0(c1472z);
                }
            }
        }
    }

    private static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    private void v0(g.A a10) {
        y("Polygon render", new Object[0]);
        W0(this.f11139d, a10);
        if (A() && Y0()) {
            C0115h c0115h = this.f11139d;
            if (c0115h.f11177c || c0115h.f11176b) {
                Matrix matrix = a10.f11092n;
                if (matrix != null) {
                    this.f11136a.concat(matrix);
                }
                if (a10.f11134o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a10);
                U0(a10);
                r(a10);
                p(a10);
                boolean zM0 = m0();
                if (this.f11139d.f11176b) {
                    B(a10, pathB0);
                }
                if (this.f11139d.f11177c) {
                    C(pathB0);
                }
                I0(a10);
                if (zM0) {
                    j0(a10);
                }
            }
        }
    }

    private static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    private void w0(g.B b10) {
        y("Rect render", new Object[0]);
        g.C1462p c1462p = b10.f10920q;
        if (c1462p == null || b10.f10921r == null || c1462p.i() || b10.f10921r.i()) {
            return;
        }
        W0(this.f11139d, b10);
        if (A() && Y0()) {
            Matrix matrix = b10.f11092n;
            if (matrix != null) {
                this.f11136a.concat(matrix);
            }
            Path pathC0 = c0(b10);
            U0(b10);
            r(b10);
            p(b10);
            boolean zM0 = m0();
            if (this.f11139d.f11176b) {
                B(b10, pathC0);
            }
            if (this.f11139d.f11177c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b10);
            }
        }
    }

    private static int x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    private void x0(g.F f10) {
        z0(f10, f0(f10.f10999q, f10.f11000r, f10.f11001s, f10.f11002t), f10.f11033p, f10.f11027o);
    }

    private void y0(g.F f10, g.C1449b c1449b) {
        z0(f10, c1449b, f10.f11033p, f10.f11027o);
    }

    private void z(boolean z10, g.C1449b c1449b, g.C1467u c1467u) {
        g.N nR = this.f11138c.r(c1467u.f11118g);
        if (nR == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", c1467u.f11118g);
            g.O o10 = c1467u.f11119h;
            if (o10 != null) {
                P0(this.f11139d, z10, o10);
                return;
            } else if (z10) {
                this.f11139d.f11176b = false;
                return;
            } else {
                this.f11139d.f11177c = false;
                return;
            }
        }
        if (nR instanceof g.M) {
            X(z10, c1449b, (g.M) nR);
        } else if (nR instanceof g.Q) {
            e0(z10, c1449b, (g.Q) nR);
        } else if (nR instanceof g.C) {
            Q0(z10, (g.C) nR);
        }
    }

    private void z0(g.F f10, g.C1449b c1449b, g.C1449b c1449b2, U1.e eVar) {
        y("Svg render", new Object[0]);
        if (c1449b.f11048c == 0.0f || c1449b.f11049d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f10.f11027o) == null) {
            eVar = U1.e.f10882e;
        }
        W0(this.f11139d, f10);
        if (A()) {
            C0115h c0115h = this.f11139d;
            c0115h.f11180f = c1449b;
            if (!c0115h.f11175a.f10926B.booleanValue()) {
                g.C1449b c1449b3 = this.f11139d.f11180f;
                O0(c1449b3.f11046a, c1449b3.f11047b, c1449b3.f11048c, c1449b3.f11049d);
            }
            q(f10, this.f11139d.f11180f);
            if (c1449b2 != null) {
                this.f11136a.concat(o(this.f11139d.f11180f, c1449b2, eVar));
                this.f11139d.f11181g = f10.f11033p;
            } else {
                Canvas canvas = this.f11136a;
                g.C1449b c1449b4 = this.f11139d.f11180f;
                canvas.translate(c1449b4.f11046a, c1449b4.f11047b);
            }
            boolean zM0 = m0();
            X0();
            F0(f10, true);
            if (zM0) {
                j0(f10);
            }
            U0(f10);
        }
    }

    void G0(U1.g gVar, U1.f fVar) {
        g.C1449b c1449b;
        U1.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f11138c = gVar;
        g.F fM = gVar.m();
        if (fM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.d()) {
            g.L lJ = this.f11138c.j(fVar.f10909e);
            if (lJ == null || !(lJ instanceof g.f0)) {
                String.format("View element with id \"%s\" not found.", fVar.f10909e);
                return;
            }
            g.f0 f0Var = (g.f0) lJ;
            c1449b = f0Var.f11033p;
            if (c1449b == null) {
                String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f10909e);
                return;
            }
            eVar = f0Var.f11027o;
        } else {
            c1449b = fVar.e() ? fVar.f10908d : fM.f11033p;
            eVar = fVar.b() ? fVar.f10906b : fM.f11027o;
        }
        if (fVar.a()) {
            gVar.a(fVar.f10905a);
        }
        if (fVar.c()) {
            b.q qVar = new b.q();
            this.f11143h = qVar;
            qVar.f10864a = gVar.j(fVar.f10907c);
        }
        N0();
        u(fM);
        S0();
        g.C1449b c1449b2 = new g.C1449b(fVar.f10910f);
        g.C1462p c1462p = fM.f11001s;
        if (c1462p != null) {
            c1449b2.f11048c = c1462p.e(this, c1449b2.f11048c);
        }
        g.C1462p c1462p2 = fM.f11002t;
        if (c1462p2 != null) {
            c1449b2.f11049d = c1462p2.e(this, c1449b2.f11049d);
        }
        z0(fM, c1449b2, c1449b, eVar);
        R0();
        if (fVar.a()) {
            gVar.b();
        }
    }

    float Q() {
        return this.f11139d.f11178d.getTextSize();
    }

    float R() {
        return this.f11139d.f11178d.getTextSize() / 2.0f;
    }

    g.C1449b S() {
        C0115h c0115h = this.f11139d;
        g.C1449b c1449b = c0115h.f11181g;
        return c1449b != null ? c1449b : c0115h.f11180f;
    }

    float T() {
        return this.f11137b;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11189b;

        private k() {
            super(h.this, null);
            this.f11189b = 0.0f;
        }

        @Override // U1.h.j
        public void b(String str) {
            this.f11189b += h.this.f11139d.f11178d.measureText(str);
        }

        /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: U1.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class C0115h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.E f11175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f11176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f11177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f11178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f11179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        g.C1449b f11180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        g.C1449b f11181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f11182h;

        C0115h() {
            Paint paint = new Paint();
            this.f11178d = paint;
            paint.setFlags(193);
            this.f11178d.setHinting(0);
            this.f11178d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f11178d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f11179e = paint3;
            paint3.setFlags(193);
            this.f11179e.setHinting(0);
            this.f11179e.setStyle(Paint.Style.STROKE);
            this.f11179e.setTypeface(typeface);
            this.f11175a = g.E.a();
        }

        C0115h(C0115h c0115h) {
            this.f11176b = c0115h.f11176b;
            this.f11177c = c0115h.f11177c;
            this.f11178d = new Paint(c0115h.f11178d);
            this.f11179e = new Paint(c0115h.f11179e);
            g.C1449b c1449b = c0115h.f11180f;
            if (c1449b != null) {
                this.f11180f = new g.C1449b(c1449b);
            }
            g.C1449b c1449b2 = c0115h.f11181g;
            if (c1449b2 != null) {
                this.f11181g = new g.C1449b(c1449b2);
            }
            this.f11182h = c0115h.f11182h;
            try {
                this.f11175a = (g.E) c0115h.f11175a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f11175a = g.E.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }
}
