package h5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import b5.AbstractC1807a;
import g5.C2679a;
import h5.l;
import h5.m;
import h5.n;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class h extends Drawable implements o {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    static final l f28298L = l.a().q(0, 0.0f).m();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Paint f28299M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final e[] f28300N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private PorterDuffColorFilter f28301A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f28302B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final RectF f28303C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f28304D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f28305E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private l f28306F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private U0.n f28307G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    U0.m[] f28308H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float[] f28309I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float[] f28310J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private d f28311K;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l.c f28312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f28313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n.g[] f28314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n.g[] f28315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final BitSet f28316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Matrix f28319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Path f28320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Path f28321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final RectF f28322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RectF f28323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Region f28324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Region f28325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Paint f28326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Paint f28327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C2679a f28328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final m.b f28329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final m f28330y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private PorterDuffColorFilter f28331z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements l.c {
        a() {
        }

        @Override // h5.l.c
        public h5.d a(h5.d dVar) {
            return dVar instanceof j ? dVar : new h5.b(-h.this.I(), dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements m.b {
        b() {
        }

        @Override // h5.m.b
        public void a(n nVar, Matrix matrix, int i10) {
            h.this.f28316k.set(i10 + 4, nVar.e());
            h.this.f28315j[i10] = nVar.f(matrix);
        }

        @Override // h5.m.b
        public void b(n nVar, Matrix matrix, int i10) {
            h.this.f28316k.set(i10, nVar.e());
            h.this.f28314i[i10] = nVar.f(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
        void a(float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e extends U0.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f28357b;

        e(int i10) {
            super("cornerSizeAtIndex" + i10);
            this.f28357b = i10;
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(h hVar) {
            if (hVar.f28309I != null) {
                return hVar.f28309I[this.f28357b];
            }
            return 0.0f;
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(h hVar, float f10) {
            if (hVar.f28309I == null || hVar.f28309I[this.f28357b] == f10) {
                return;
            }
            hVar.f28309I[this.f28357b] = f10;
            if (hVar.f28311K != null) {
                hVar.f28311K.a(hVar.z());
            }
            hVar.invalidateSelf();
        }
    }

    static {
        int i10 = 0;
        Paint paint = new Paint(1);
        f28299M = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f28300N = new e[4];
        while (true) {
            e[] eVarArr = f28300N;
            if (i10 >= eVarArr.length) {
                return;
            }
            eVarArr[i10] = new e(i10);
            i10++;
        }
    }

    public h() {
        this(new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float I() {
        if (Q()) {
            return this.f28327v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean O() {
        c cVar = this.f28313h;
        int i10 = cVar.f28351r;
        if (i10 == 1 || cVar.f28352s <= 0) {
            return false;
        }
        return i10 == 2 || Y();
    }

    private boolean P() {
        Paint.Style style = this.f28313h.f28356w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean Q() {
        Paint.Style style = this.f28313h.f28356w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f28327v.getStrokeWidth() > 0.0f;
    }

    private void S() {
        super.invalidateSelf();
    }

    private void V(Canvas canvas) {
        if (O()) {
            canvas.save();
            X(canvas);
            if (!this.f28304D) {
                s(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f28303C.width() - getBounds().width());
            int iHeight = (int) (this.f28303C.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f28303C.width()) + (this.f28313h.f28352s * 2) + iWidth, ((int) this.f28303C.height()) + (this.f28313h.f28352s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f28313h.f28352s) - iWidth;
            float f11 = (getBounds().top - this.f28313h.f28352s) - iHeight;
            canvas2.translate(-f10, -f11);
            s(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int W(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void X(Canvas canvas) {
        canvas.translate(F(), G());
    }

    private PorterDuffColorFilter j(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iQ = q(color);
        this.f28302B = iQ;
        if (iQ != color) {
            return new PorterDuffColorFilter(iQ, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void k(RectF rectF, Path path) {
        l(rectF, path);
        if (this.f28313h.f28344k != 1.0f) {
            this.f28319n.reset();
            Matrix matrix = this.f28319n;
            float f10 = this.f28313h.f28344k;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f28319n);
        }
        path.computeBounds(this.f28303C, true);
    }

    private float m(RectF rectF, l lVar, float[] fArr) {
        if (fArr == null) {
            if (lVar.v(rectF)) {
                return lVar.r().a(rectF);
            }
            return -1.0f;
        }
        if (AbstractC1807a.a(fArr) && lVar.u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private void n() {
        q0();
        this.f28330y.d(this.f28306F, this.f28310J, this.f28313h.f28345l, y(), null, this.f28321p);
    }

    private boolean n0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f28313h.f28338e == null || color2 == (colorForState2 = this.f28313h.f28338e.getColorForState(iArr, (color2 = this.f28326u.getColor())))) {
            z10 = false;
        } else {
            this.f28326u.setColor(colorForState2);
            z10 = true;
        }
        if (this.f28313h.f28339f == null || color == (colorForState = this.f28313h.f28339f.getColorForState(iArr, (color = this.f28327v.getColor())))) {
            return z10;
        }
        this.f28327v.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = q(colorForState);
        }
        this.f28302B = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private void o0(int[] iArr) {
        p0(iArr, false);
    }

    private PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? j(paint, z10) : o(colorStateList, mode, z10);
    }

    private void p0(int[] iArr, boolean z10) {
        RectF rectFX = x();
        if (this.f28313h.f28335b == null || rectFX.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.f28307G == null);
        if (this.f28309I == null) {
            this.f28309I = new float[4];
        }
        l lVarD = this.f28313h.f28335b.d(iArr);
        for (int i10 = 0; i10 < 4; i10++) {
            float fA = this.f28330y.f(i10, lVarD).a(rectFX);
            if (z11) {
                this.f28309I[i10] = fA;
            }
            U0.m mVar = this.f28308H[i10];
            if (mVar != null) {
                mVar.o(fA);
                if (z11) {
                    this.f28308H[i10].u();
                }
            }
        }
        if (z11) {
            invalidateSelf();
        }
    }

    private void q0() {
        this.f28306F = H().z(this.f28312g);
        float[] fArr = this.f28309I;
        if (fArr == null) {
            this.f28310J = null;
            return;
        }
        if (this.f28310J == null) {
            this.f28310J = new float[fArr.length];
        }
        float fI = I();
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.f28309I;
            if (i10 >= fArr2.length) {
                return;
            }
            this.f28310J[i10] = Math.max(0.0f, fArr2[i10] - fI);
            i10++;
        }
    }

    public static h r(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(X4.a.c(context, Q4.a.f9109J, h.class.getSimpleName()));
        }
        h hVar = new h();
        hVar.R(context);
        hVar.d0(colorStateList);
        hVar.c0(f10);
        return hVar;
    }

    private boolean r0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f28331z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f28301A;
        c cVar = this.f28313h;
        this.f28331z = p(cVar.f28341h, cVar.f28342i, this.f28326u, true);
        c cVar2 = this.f28313h;
        this.f28301A = p(cVar2.f28340g, cVar2.f28342i, this.f28327v, false);
        c cVar3 = this.f28313h;
        if (cVar3.f28355v) {
            this.f28328w.d(cVar3.f28341h.getColorForState(getState(), 0));
        }
        return (H0.c.a(porterDuffColorFilter, this.f28331z) && H0.c.a(porterDuffColorFilter2, this.f28301A)) ? false : true;
    }

    private void s(Canvas canvas) {
        this.f28316k.cardinality();
        if (this.f28313h.f28353t != 0) {
            canvas.drawPath(this.f28320o, this.f28328w.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f28314i[i10].b(this.f28328w, this.f28313h.f28352s, canvas);
            this.f28315j[i10].b(this.f28328w, this.f28313h.f28352s, canvas);
        }
        if (this.f28304D) {
            int iF = F();
            int iG = G();
            canvas.translate(-iF, -iG);
            canvas.drawPath(this.f28320o, f28299M);
            canvas.translate(iF, iG);
        }
    }

    private void s0() {
        float fN = N();
        this.f28313h.f28352s = (int) Math.ceil(0.75f * fN);
        this.f28313h.f28353t = (int) Math.ceil(fN * 0.25f);
        r0();
        S();
    }

    private void t(Canvas canvas) {
        v(canvas, this.f28326u, this.f28320o, this.f28313h.f28334a, this.f28309I, x());
    }

    private void v(Canvas canvas, Paint paint, Path path, l lVar, float[] fArr, RectF rectF) {
        float fM = m(rectF, lVar, fArr);
        if (fM < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fM * this.f28313h.f28345l;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    private RectF y() {
        this.f28323r.set(x());
        float fI = I();
        this.f28323r.inset(fI, fI);
        return this.f28323r;
    }

    public float A() {
        return this.f28313h.f28349p;
    }

    public ColorStateList B() {
        return this.f28313h.f28338e;
    }

    public float C() {
        return this.f28313h.f28345l;
    }

    public float D() {
        return this.f28313h.f28348o;
    }

    public int E() {
        return this.f28302B;
    }

    public int F() {
        return (int) (((double) this.f28313h.f28353t) * Math.sin(Math.toRadians(r0.f28354u)));
    }

    public int G() {
        return (int) (((double) this.f28313h.f28353t) * Math.cos(Math.toRadians(r0.f28354u)));
    }

    public l H() {
        return this.f28313h.f28334a;
    }

    public ColorStateList J() {
        return this.f28313h.f28341h;
    }

    public float K() {
        float[] fArr = this.f28309I;
        return fArr != null ? fArr[3] : this.f28313h.f28334a.r().a(x());
    }

    public float L() {
        float[] fArr = this.f28309I;
        return fArr != null ? fArr[0] : this.f28313h.f28334a.t().a(x());
    }

    public float M() {
        return this.f28313h.f28350q;
    }

    public float N() {
        return A() + M();
    }

    public void R(Context context) {
        this.f28313h.f28336c = new Z4.a(context);
        s0();
    }

    public boolean T() {
        Z4.a aVar = this.f28313h.f28336c;
        return aVar != null && aVar.d();
    }

    public boolean U() {
        if (this.f28313h.f28334a.v(x())) {
            return true;
        }
        float[] fArr = this.f28309I;
        return fArr != null && AbstractC1807a.a(fArr) && this.f28313h.f28334a.u();
    }

    public boolean Y() {
        return (U() || this.f28320o.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Z(float f10) {
        setShapeAppearanceModel(this.f28313h.f28334a.x(f10));
    }

    public void a0(h5.d dVar) {
        setShapeAppearanceModel(this.f28313h.f28334a.y(dVar));
    }

    public void b0(U0.n nVar) {
        if (this.f28307G == nVar) {
            return;
        }
        this.f28307G = nVar;
        int i10 = 0;
        while (true) {
            U0.m[] mVarArr = this.f28308H;
            if (i10 >= mVarArr.length) {
                p0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (mVarArr[i10] == null) {
                    mVarArr[i10] = new U0.m(this, f28300N[i10]);
                }
                this.f28308H[i10].t(new U0.n().f(nVar.a()).h(nVar.c()));
                i10++;
            }
        }
    }

    public void c0(float f10) {
        c cVar = this.f28313h;
        if (cVar.f28349p != f10) {
            cVar.f28349p = f10;
            s0();
        }
    }

    public void d0(ColorStateList colorStateList) {
        c cVar = this.f28313h;
        if (cVar.f28338e != colorStateList) {
            cVar.f28338e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f28326u.setColorFilter(this.f28331z);
        int alpha = this.f28326u.getAlpha();
        this.f28326u.setAlpha(W(alpha, this.f28313h.f28347n));
        this.f28327v.setColorFilter(this.f28301A);
        this.f28327v.setStrokeWidth(this.f28313h.f28346m);
        int alpha2 = this.f28327v.getAlpha();
        this.f28327v.setAlpha(W(alpha2, this.f28313h.f28347n));
        if (P()) {
            if (this.f28317l) {
                k(x(), this.f28320o);
                this.f28317l = false;
            }
            V(canvas);
            t(canvas);
        }
        if (Q()) {
            if (this.f28318m) {
                n();
                this.f28318m = false;
            }
            w(canvas);
        }
        this.f28326u.setAlpha(alpha);
        this.f28327v.setAlpha(alpha2);
    }

    public void e0(float f10) {
        c cVar = this.f28313h;
        if (cVar.f28345l != f10) {
            cVar.f28345l = f10;
            this.f28317l = true;
            this.f28318m = true;
            invalidateSelf();
        }
    }

    public void f0(d dVar) {
        this.f28311K = dVar;
    }

    public void g0(int i10, int i11, int i12, int i13) {
        c cVar = this.f28313h;
        if (cVar.f28343j == null) {
            cVar.f28343j = new Rect();
        }
        this.f28313h.f28343j.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f28313h.f28347n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f28313h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f28313h.f28351r == 2) {
            return;
        }
        RectF rectFX = x();
        if (rectFX.isEmpty()) {
            return;
        }
        float fM = m(rectFX, this.f28313h.f28334a, this.f28309I);
        if (fM >= 0.0f) {
            outline.setRoundRect(getBounds(), fM * this.f28313h.f28345l);
            return;
        }
        if (this.f28317l) {
            k(rectFX, this.f28320o);
            this.f28317l = false;
        }
        com.google.android.material.drawable.d.j(outline, this.f28320o);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f28313h.f28343j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f28324s.set(getBounds());
        k(x(), this.f28320o);
        this.f28325t.setPath(this.f28320o, this.f28324s);
        this.f28324s.op(this.f28325t, Region.Op.DIFFERENCE);
        return this.f28324s;
    }

    public void h0(float f10) {
        c cVar = this.f28313h;
        if (cVar.f28348o != f10) {
            cVar.f28348o = f10;
            s0();
        }
    }

    public void i0(q qVar) {
        c cVar = this.f28313h;
        if (cVar.f28335b != qVar) {
            cVar.f28335b = qVar;
            p0(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f28317l = true;
        this.f28318m = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f28313h.f28341h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f28313h.f28340g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f28313h.f28339f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f28313h.f28338e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        q qVar = this.f28313h.f28335b;
        return qVar != null && qVar.f();
    }

    public void j0(float f10, int i10) {
        m0(f10);
        l0(ColorStateList.valueOf(i10));
    }

    public void k0(float f10, ColorStateList colorStateList) {
        m0(f10);
        l0(colorStateList);
    }

    protected final void l(RectF rectF, Path path) {
        m mVar = this.f28330y;
        c cVar = this.f28313h;
        mVar.d(cVar.f28334a, this.f28309I, cVar.f28345l, rectF, this.f28329x, path);
    }

    public void l0(ColorStateList colorStateList) {
        c cVar = this.f28313h;
        if (cVar.f28339f != colorStateList) {
            cVar.f28339f = colorStateList;
            onStateChange(getState());
        }
    }

    public void m0(float f10) {
        this.f28313h.f28346m = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f28313h = new c(this.f28313h);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f28317l = true;
        this.f28318m = true;
        super.onBoundsChange(rect);
        if (this.f28313h.f28335b != null && !rect.isEmpty()) {
            p0(getState(), this.f28305E);
        }
        this.f28305E = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.i.b
    protected boolean onStateChange(int[] iArr) {
        if (this.f28313h.f28335b != null) {
            o0(iArr);
        }
        boolean z10 = n0(iArr) || r0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected int q(int i10) {
        float fN = N() + D();
        Z4.a aVar = this.f28313h.f28336c;
        return aVar != null ? aVar.c(i10, fN) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f28313h;
        if (cVar.f28347n != i10) {
            cVar.f28347n = i10;
            S();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28313h.f28337d = colorFilter;
        S();
    }

    @Override // h5.o
    public void setShapeAppearanceModel(l lVar) {
        c cVar = this.f28313h;
        cVar.f28334a = lVar;
        cVar.f28335b = null;
        this.f28309I = null;
        this.f28310J = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f28313h.f28341h = colorStateList;
        r0();
        S();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f28313h;
        if (cVar.f28342i != mode) {
            cVar.f28342i = mode;
            r0();
            S();
        }
    }

    protected void u(Canvas canvas, Paint paint, Path path, RectF rectF) {
        v(canvas, paint, path, this.f28313h.f28334a, this.f28309I, rectF);
    }

    protected void w(Canvas canvas) {
        v(canvas, this.f28327v, this.f28321p, this.f28306F, this.f28310J, y());
    }

    protected RectF x() {
        this.f28322q.set(getBounds());
        return this.f28322q;
    }

    public float z() {
        float fA;
        float fA2;
        float[] fArr = this.f28309I;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFX = x();
            fA = (this.f28330y.f(3, H()).a(rectFX) + this.f28330y.f(2, H()).a(rectFX)) - this.f28330y.f(1, H()).a(rectFX);
            fA2 = this.f28330y.f(0, H()).a(rectFX);
        }
        return (fA - fA2) / 2.0f;
    }

    public h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(l.e(context, attributeSet, i10, i11).m());
    }

    public h(l lVar) {
        this(new c(lVar, null));
    }

    protected h(c cVar) {
        m mVar;
        this.f28312g = new a();
        this.f28314i = new n.g[4];
        this.f28315j = new n.g[4];
        this.f28316k = new BitSet(8);
        this.f28319n = new Matrix();
        this.f28320o = new Path();
        this.f28321p = new Path();
        this.f28322q = new RectF();
        this.f28323r = new RectF();
        this.f28324s = new Region();
        this.f28325t = new Region();
        Paint paint = new Paint(1);
        this.f28326u = paint;
        Paint paint2 = new Paint(1);
        this.f28327v = paint2;
        this.f28328w = new C2679a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = m.j();
        } else {
            mVar = new m();
        }
        this.f28330y = mVar;
        this.f28303C = new RectF();
        this.f28304D = true;
        this.f28305E = true;
        this.f28308H = new U0.m[4];
        this.f28313h = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r0();
        n0(getState());
        this.f28329x = new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f28334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        q f28335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Z4.a f28336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorFilter f28337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f28338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f28339f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f28340g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ColorStateList f28341h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f28342i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Rect f28343j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f28344k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f28345l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f28346m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f28347n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f28348o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f28349p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f28350q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f28351r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f28352s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f28353t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f28354u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f28355v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Paint.Style f28356w;

        public c(l lVar, Z4.a aVar) {
            this.f28338e = null;
            this.f28339f = null;
            this.f28340g = null;
            this.f28341h = null;
            this.f28342i = PorterDuff.Mode.SRC_IN;
            this.f28343j = null;
            this.f28344k = 1.0f;
            this.f28345l = 1.0f;
            this.f28347n = 255;
            this.f28348o = 0.0f;
            this.f28349p = 0.0f;
            this.f28350q = 0.0f;
            this.f28351r = 0;
            this.f28352s = 0;
            this.f28353t = 0;
            this.f28354u = 0;
            this.f28355v = false;
            this.f28356w = Paint.Style.FILL_AND_STROKE;
            this.f28334a = lVar;
            this.f28336c = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f28317l = true;
            hVar.f28318m = true;
            return hVar;
        }

        public c(c cVar) {
            this.f28338e = null;
            this.f28339f = null;
            this.f28340g = null;
            this.f28341h = null;
            this.f28342i = PorterDuff.Mode.SRC_IN;
            this.f28343j = null;
            this.f28344k = 1.0f;
            this.f28345l = 1.0f;
            this.f28347n = 255;
            this.f28348o = 0.0f;
            this.f28349p = 0.0f;
            this.f28350q = 0.0f;
            this.f28351r = 0;
            this.f28352s = 0;
            this.f28353t = 0;
            this.f28354u = 0;
            this.f28355v = false;
            this.f28356w = Paint.Style.FILL_AND_STROKE;
            this.f28334a = cVar.f28334a;
            this.f28335b = cVar.f28335b;
            this.f28336c = cVar.f28336c;
            this.f28346m = cVar.f28346m;
            this.f28337d = cVar.f28337d;
            this.f28338e = cVar.f28338e;
            this.f28339f = cVar.f28339f;
            this.f28342i = cVar.f28342i;
            this.f28341h = cVar.f28341h;
            this.f28347n = cVar.f28347n;
            this.f28344k = cVar.f28344k;
            this.f28353t = cVar.f28353t;
            this.f28351r = cVar.f28351r;
            this.f28355v = cVar.f28355v;
            this.f28345l = cVar.f28345l;
            this.f28348o = cVar.f28348o;
            this.f28349p = cVar.f28349p;
            this.f28350q = cVar.f28350q;
            this.f28352s = cVar.f28352s;
            this.f28354u = cVar.f28354u;
            this.f28340g = cVar.f28340g;
            this.f28356w = cVar.f28356w;
            if (cVar.f28343j != null) {
                this.f28343j = new Rect(cVar.f28343j);
            }
        }
    }
}
