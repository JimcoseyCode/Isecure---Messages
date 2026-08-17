package h5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import g5.C2679a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f28404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f28405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f28406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f28407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f28408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f28409g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f28410h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28411i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f28412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f28413d;

        a(List list, Matrix matrix) {
            this.f28412c = list;
            this.f28413d = matrix;
        }

        @Override // h5.n.g
        public void a(Matrix matrix, C2679a c2679a, int i10, Canvas canvas) {
            Iterator it = this.f28412c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f28413d, c2679a, i10, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f28415c;

        public b(d dVar) {
            this.f28415c = dVar;
        }

        @Override // h5.n.g
        public void a(Matrix matrix, C2679a c2679a, int i10, Canvas canvas) {
            c2679a.a(canvas, matrix, new RectF(this.f28415c.k(), this.f28415c.o(), this.f28415c.l(), this.f28415c.j()), i10, this.f28415c.m(), this.f28415c.n());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f28416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f28417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f28418e;

        public c(e eVar, float f10, float f11) {
            this.f28416c = eVar;
            this.f28417d = f10;
            this.f28418e = f11;
        }

        @Override // h5.n.g
        public void a(Matrix matrix, C2679a c2679a, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f28416c.f28427c - this.f28418e, this.f28416c.f28426b - this.f28417d), 0.0f);
            this.f28430a.set(matrix);
            this.f28430a.preTranslate(this.f28417d, this.f28418e);
            this.f28430a.preRotate(c());
            c2679a.b(canvas, this.f28430a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f28416c.f28427c - this.f28418e) / (this.f28416c.f28426b - this.f28417d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f28419h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f28420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f28421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f28422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f28423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f28424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f28425g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f28423e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f28420b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f28422d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f28424f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f28425g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f28421c;
        }

        private void p(float f10) {
            this.f28423e = f10;
        }

        private void q(float f10) {
            this.f28420b = f10;
        }

        private void r(float f10) {
            this.f28422d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f28424f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f28425g = f10;
        }

        private void u(float f10) {
            this.f28421c = f10;
        }

        @Override // h5.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f28428a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f28419h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f28426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f28427c;

        @Override // h5.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f28428a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f28426b, this.f28427c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f28428a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f28429b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f28430a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, C2679a c2679a, int i10, Canvas canvas);

        public final void b(C2679a c2679a, int i10, Canvas canvas) {
            a(f28429b, c2679a, i10, canvas);
        }
    }

    public n() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f28410h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f28410h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f28407e;
    }

    private float h() {
        return this.f28408f;
    }

    private void p(float f10) {
        this.f28407e = f10;
    }

    private void q(float f10) {
        this.f28408f = f10;
    }

    private void r(float f10) {
        this.f28405c = f10;
    }

    private void s(float f10) {
        this.f28406d = f10;
    }

    private void t(float f10) {
        this.f28403a = f10;
    }

    private void u(float f10) {
        this.f28404b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f28409g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f28409g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f28409g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f28411i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f28410h), new Matrix(matrix));
    }

    float i() {
        return this.f28405c;
    }

    float j() {
        return this.f28406d;
    }

    float k() {
        return this.f28403a;
    }

    float l() {
        return this.f28404b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f28426b = f10;
        eVar.f28427c = f11;
        this.f28409g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f28409g.clear();
        this.f28410h.clear();
        this.f28411i = false;
    }
}
