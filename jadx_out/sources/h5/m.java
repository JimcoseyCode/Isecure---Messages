package h5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n[] f28385a = new n[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f28386b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f28387c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f28388d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f28389e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f28390f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f28391g = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f28392h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f28393i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f28394j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f28395k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28396l = true;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f28397a = new m();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(n nVar, Matrix matrix, int i10);

        void b(n nVar, Matrix matrix, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f28398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f28399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f28400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f28401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f28402e;

        c(l lVar, float f10, RectF rectF, b bVar, Path path) {
            this.f28401d = bVar;
            this.f28398a = lVar;
            this.f28402e = f10;
            this.f28400c = rectF;
            this.f28399b = path;
        }
    }

    public m() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f28385a[i10] = new n();
            this.f28386b[i10] = new Matrix();
            this.f28387c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f28392h[0] = this.f28385a[i10].k();
        this.f28392h[1] = this.f28385a[i10].l();
        this.f28386b[i10].mapPoints(this.f28392h);
        if (i10 == 0) {
            Path path = cVar.f28399b;
            float[] fArr = this.f28392h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f28399b;
            float[] fArr2 = this.f28392h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f28385a[i10].d(this.f28386b[i10], cVar.f28399b);
        b bVar = cVar.f28401d;
        if (bVar != null) {
            bVar.b(this.f28385a[i10], this.f28386b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f28392h[0] = this.f28385a[i10].i();
        this.f28392h[1] = this.f28385a[i10].j();
        this.f28386b[i10].mapPoints(this.f28392h);
        this.f28393i[0] = this.f28385a[i11].k();
        this.f28393i[1] = this.f28385a[i11].l();
        this.f28386b[i11].mapPoints(this.f28393i);
        float f10 = this.f28392h[0];
        float[] fArr = this.f28393i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fH = h(cVar.f28400c, i10);
        this.f28391g.n(0.0f, 0.0f);
        g gVarI = i(i10, cVar.f28398a);
        gVarI.b(fMax, fH, cVar.f28402e, this.f28391g);
        this.f28394j.reset();
        this.f28391g.d(this.f28387c[i10], this.f28394j);
        if (this.f28396l && (gVarI.a() || k(this.f28394j, i10) || k(this.f28394j, i11))) {
            Path path = this.f28394j;
            path.op(path, this.f28390f, Path.Op.DIFFERENCE);
            this.f28392h[0] = this.f28391g.k();
            this.f28392h[1] = this.f28391g.l();
            this.f28387c[i10].mapPoints(this.f28392h);
            Path path2 = this.f28389e;
            float[] fArr2 = this.f28392h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f28391g.d(this.f28387c[i10], this.f28389e);
        } else {
            this.f28391g.d(this.f28387c[i10], cVar.f28399b);
        }
        b bVar = cVar.f28401d;
        if (bVar != null) {
            bVar.a(this.f28391g, this.f28387c[i10], i10);
        }
    }

    private void e(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e g(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.s() : lVar.q() : lVar.i() : lVar.k();
    }

    private float h(RectF rectF, int i10) {
        float[] fArr = this.f28392h;
        n nVar = this.f28385a[i10];
        fArr[0] = nVar.f28405c;
        fArr[1] = nVar.f28406d;
        this.f28386b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f28392h[0]) : Math.abs(rectF.centerY() - this.f28392h[1]);
    }

    private g i(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.o() : lVar.p() : lVar.n() : lVar.h();
    }

    public static m j() {
        return a.f28397a;
    }

    private boolean k(Path path, int i10) {
        this.f28395k.reset();
        this.f28385a[i10].d(this.f28386b[i10], this.f28395k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f28395k.computeBounds(rectF, true);
        path.op(this.f28395k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void l(c cVar, int i10, float[] fArr) {
        g(i10, cVar.f28398a).b(this.f28385a[i10], 90.0f, cVar.f28402e, cVar.f28400c, fArr == null ? f(i10, cVar.f28398a) : new h5.c(fArr[i10]));
        float fA = a(i10);
        this.f28386b[i10].reset();
        e(i10, cVar.f28400c, this.f28388d);
        Matrix matrix = this.f28386b[i10];
        PointF pointF = this.f28388d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f28386b[i10].preRotate(fA);
    }

    private void m(int i10) {
        this.f28392h[0] = this.f28385a[i10].i();
        this.f28392h[1] = this.f28385a[i10].j();
        this.f28386b[i10].mapPoints(this.f28392h);
        float fA = a(i10);
        this.f28387c[i10].reset();
        Matrix matrix = this.f28387c[i10];
        float[] fArr = this.f28392h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f28387c[i10].preRotate(fA);
    }

    public void d(l lVar, float[] fArr, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f28389e.rewind();
        this.f28390f.rewind();
        this.f28390f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(lVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            l(cVar, i10, fArr);
            m(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f28389e.close();
        if (this.f28389e.isEmpty()) {
            return;
        }
        path.op(this.f28389e, Path.Op.UNION);
    }

    d f(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.t() : lVar.r() : lVar.j() : lVar.l();
    }
}
