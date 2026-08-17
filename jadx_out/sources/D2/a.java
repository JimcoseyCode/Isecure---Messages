package D2;

import C2.a;
import C2.c;
import F2.a;
import V2.d;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d2.AbstractC2325a;
import g2.AbstractC2662a;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements C2.a, c.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0029a f754r = new C0029a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Class f755s = a.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2.d f758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F2.a f761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F2.b f762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bitmap.Config f764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Matrix f770o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a.InterfaceC0023a f772q;

    /* JADX INFO: renamed from: D2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0029a {
        public /* synthetic */ C0029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0029a() {
        }
    }

    public a(d platformBitmapFactory, b bitmapFrameCache, C2.d animationInformation, c bitmapFrameRenderer, boolean z10, F2.a aVar, F2.b bVar, P2.d dVar) {
        AbstractC2855l.g(platformBitmapFactory, "platformBitmapFactory");
        AbstractC2855l.g(bitmapFrameCache, "bitmapFrameCache");
        AbstractC2855l.g(animationInformation, "animationInformation");
        AbstractC2855l.g(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.f756a = platformBitmapFactory;
        this.f757b = bitmapFrameCache;
        this.f758c = animationInformation;
        this.f759d = bitmapFrameRenderer;
        this.f760e = z10;
        this.f761f = aVar;
        this.f762g = bVar;
        this.f763h = null;
        this.f764i = Bitmap.Config.ARGB_8888;
        this.f765j = new Paint(6);
        this.f769n = new Path();
        this.f770o = new Matrix();
        this.f771p = -1;
        s();
    }

    private final void o(int i10, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.f766k;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f765j);
        } else if (t(i10, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.f769n, this.f765j);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f765j);
        }
    }

    private final boolean p(int i10, AbstractC2662a abstractC2662a, Canvas canvas, int i11) {
        if (abstractC2662a == null || !AbstractC2662a.d0(abstractC2662a)) {
            return false;
        }
        Object objJ = abstractC2662a.J();
        AbstractC2855l.f(objJ, "get(...)");
        o(i10, (Bitmap) objJ, canvas);
        if (i11 == 3 || this.f760e) {
            return true;
        }
        this.f757b.c(i10, abstractC2662a, i11);
        return true;
    }

    private final boolean q(Canvas canvas, int i10, int i11) throws Throwable {
        AbstractC2662a abstractC2662aD;
        boolean zP;
        AbstractC2662a abstractC2662a = null;
        try {
            boolean z10 = false;
            int i12 = 1;
            if (this.f760e) {
                F2.a aVar = this.f761f;
                AbstractC2662a abstractC2662aB = aVar != null ? aVar.b(i10, canvas.getWidth(), canvas.getHeight()) : null;
                if (abstractC2662aB != null) {
                    try {
                        if (abstractC2662aB.W()) {
                            Object objJ = abstractC2662aB.J();
                            AbstractC2855l.f(objJ, "get(...)");
                            o(i10, (Bitmap) objJ, canvas);
                            AbstractC2662a.B(abstractC2662aB);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        abstractC2662a = abstractC2662aB;
                        AbstractC2662a.B(abstractC2662a);
                        throw th;
                    }
                }
                F2.a aVar2 = this.f761f;
                if (aVar2 != null) {
                    aVar2.a(canvas.getWidth(), canvas.getHeight(), null);
                }
                AbstractC2662a.B(abstractC2662aB);
                return false;
            }
            if (i11 == 0) {
                abstractC2662aD = this.f757b.d(i10);
                zP = p(i10, abstractC2662aD, canvas, 0);
            } else if (i11 == 1) {
                abstractC2662aD = this.f757b.a(i10, this.f767l, this.f768m);
                if (r(i10, abstractC2662aD) && p(i10, abstractC2662aD, canvas, 1)) {
                    z10 = true;
                }
                zP = z10;
                i12 = 2;
            } else if (i11 == 2) {
                try {
                    abstractC2662aD = this.f756a.b(this.f767l, this.f768m, this.f764i);
                    if (r(i10, abstractC2662aD) && p(i10, abstractC2662aD, canvas, 2)) {
                        z10 = true;
                    }
                    zP = z10;
                    i12 = 3;
                } catch (RuntimeException e10) {
                    AbstractC2325a.F(f755s, "Failed to create frame bitmap", e10);
                    AbstractC2662a.B(null);
                    return false;
                }
            } else {
                if (i11 != 3) {
                    AbstractC2662a.B(null);
                    return false;
                }
                abstractC2662aD = this.f757b.e(i10);
                zP = p(i10, abstractC2662aD, canvas, 3);
                i12 = -1;
            }
            AbstractC2662a.B(abstractC2662aD);
            return (zP || i12 == -1) ? zP : q(canvas, i10, i12);
        } catch (Throwable th2) {
            th = th2;
            AbstractC2662a.B(abstractC2662a);
            throw th;
        }
    }

    private final boolean r(int i10, AbstractC2662a abstractC2662a) {
        if (abstractC2662a == null || !abstractC2662a.W()) {
            return false;
        }
        c cVar = this.f759d;
        Object objJ = abstractC2662a.J();
        AbstractC2855l.f(objJ, "get(...)");
        boolean zA = cVar.a(i10, (Bitmap) objJ);
        if (!zA) {
            AbstractC2662a.B(abstractC2662a);
        }
        return zA;
    }

    private final void s() {
        int iE = this.f759d.e();
        this.f767l = iE;
        if (iE == -1) {
            Rect rect = this.f766k;
            this.f767l = rect != null ? rect.width() : -1;
        }
        int iC = this.f759d.c();
        this.f768m = iC;
        if (iC == -1) {
            Rect rect2 = this.f766k;
            this.f768m = rect2 != null ? rect2.height() : -1;
        }
    }

    private final boolean t(int i10, Bitmap bitmap, float f10, float f11) {
        if (this.f763h == null) {
            return false;
        }
        if (i10 == this.f771p) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f770o.setRectToRect(new RectF(0.0f, 0.0f, this.f767l, this.f768m), new RectF(0.0f, 0.0f, f10, f11), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.f770o);
        this.f765j.setShader(bitmapShader);
        this.f769n.addRoundRect(new RectF(0.0f, 0.0f, f10, f11), this.f763h, Path.Direction.CW);
        this.f771p = i10;
        return true;
    }

    @Override // C2.d
    public int a() {
        return this.f758c.a();
    }

    @Override // C2.d
    public int b() {
        return this.f758c.b();
    }

    @Override // C2.a
    public int c() {
        return this.f768m;
    }

    @Override // C2.a
    public void clear() {
        if (!this.f760e) {
            this.f757b.clear();
            return;
        }
        F2.a aVar = this.f761f;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // C2.a
    public void d(Rect rect) {
        this.f766k = rect;
        this.f759d.d(rect);
        s();
    }

    @Override // C2.a
    public int e() {
        return this.f767l;
    }

    @Override // C2.c.b
    public void f() {
        if (!this.f760e) {
            clear();
            return;
        }
        F2.a aVar = this.f761f;
        if (aVar != null) {
            aVar.onStop();
        }
    }

    @Override // C2.a
    public void g(ColorFilter colorFilter) {
        this.f765j.setColorFilter(colorFilter);
    }

    @Override // C2.d
    public int h() {
        return this.f758c.h();
    }

    @Override // C2.d
    public int i() {
        return this.f758c.i();
    }

    @Override // C2.d
    public int j(int i10) {
        return this.f758c.j(i10);
    }

    @Override // C2.a
    public void k(int i10) {
        this.f765j.setAlpha(i10);
    }

    @Override // C2.d
    public int l() {
        return this.f758c.l();
    }

    @Override // C2.a
    public void m(a.InterfaceC0023a interfaceC0023a) {
        this.f772q = interfaceC0023a;
    }

    @Override // C2.a
    public boolean n(Drawable parent, Canvas canvas, int i10) throws Throwable {
        F2.b bVar;
        F2.a aVar;
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(canvas, "canvas");
        boolean zQ = q(canvas, i10, 0);
        if (!this.f760e && (bVar = this.f762g) != null && (aVar = this.f761f) != null) {
            a.C0040a.f(aVar, bVar, this.f757b, this, i10, null, 16, null);
        }
        return zQ;
    }
}
