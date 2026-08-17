package T2;

import R2.b;
import R2.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements R2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U2.a f10397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f10398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R2.c f10399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f10400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f10401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f10402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f10403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final R2.b[] f10404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f10405i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f10406j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f10407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f10408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f10409m;

    public a(U2.a aVar, e eVar, Rect rect, boolean z10) {
        this.f10397a = aVar;
        this.f10398b = eVar;
        R2.c cVarD = eVar.d();
        this.f10399c = cVarD;
        int[] iArrP = cVarD.p();
        this.f10401e = iArrP;
        aVar.a(iArrP);
        this.f10403g = aVar.c(iArrP);
        this.f10402f = aVar.b(iArrP);
        this.f10400d = m(cVarD, rect);
        this.f10407k = z10;
        this.f10404h = new R2.b[cVarD.a()];
        for (int i10 = 0; i10 < this.f10399c.a(); i10++) {
            this.f10404h[i10] = this.f10399c.c(i10);
        }
        Paint paint = new Paint();
        this.f10408l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private synchronized void l() {
        Bitmap bitmap = this.f10409m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f10409m = null;
        }
    }

    private static Rect m(R2.c cVar, Rect rect) {
        return rect == null ? new Rect(0, 0, cVar.getWidth(), cVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    private void n(Canvas canvas, float f10, float f11, R2.b bVar) {
        if (bVar.f9965g == b.EnumC0104b.DISPOSE_TO_BACKGROUND) {
            int iCeil = (int) Math.ceil(bVar.f9962d * f10);
            int iCeil2 = (int) Math.ceil(bVar.f9963e * f11);
            int iCeil3 = (int) Math.ceil(bVar.f9960b * f10);
            int iCeil4 = (int) Math.ceil(bVar.f9961c * f11);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.f10408l);
        }
    }

    private synchronized Bitmap o(int i10, int i11) {
        try {
            Bitmap bitmap = this.f10409m;
            if (bitmap != null && (bitmap.getWidth() < i10 || this.f10409m.getHeight() < i11)) {
                l();
            }
            if (this.f10409m == null) {
                this.f10409m = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            }
            this.f10409m.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.f10409m;
    }

    private void p(Canvas canvas, R2.d dVar) {
        int width;
        int height;
        int iB;
        int iC;
        if (this.f10407k) {
            float fMax = Math.max(dVar.getWidth() / Math.min(dVar.getWidth(), canvas.getWidth()), dVar.getHeight() / Math.min(dVar.getHeight(), canvas.getHeight()));
            width = (int) (dVar.getWidth() / fMax);
            height = (int) (dVar.getHeight() / fMax);
            iB = (int) (dVar.b() / fMax);
            iC = (int) (dVar.c() / fMax);
        } else {
            width = dVar.getWidth();
            height = dVar.getHeight();
            iB = dVar.b();
            iC = dVar.c();
        }
        synchronized (this) {
            Bitmap bitmapO = o(width, height);
            this.f10409m = bitmapO;
            dVar.a(width, height, bitmapO);
            canvas.save();
            canvas.translate(iB, iC);
            canvas.drawBitmap(this.f10409m, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void q(Canvas canvas, R2.d dVar) {
        double dWidth = ((double) this.f10400d.width()) / ((double) this.f10399c.getWidth());
        double dHeight = ((double) this.f10400d.height()) / ((double) this.f10399c.getHeight());
        int iRound = (int) Math.round(((double) dVar.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) dVar.getHeight()) * dHeight);
        int iB = (int) (((double) dVar.b()) * dWidth);
        int iC = (int) (((double) dVar.c()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f10400d.width();
                int iHeight = this.f10400d.height();
                o(iWidth, iHeight);
                Bitmap bitmap = this.f10409m;
                if (bitmap != null) {
                    dVar.a(iRound, iRound2, bitmap);
                }
                this.f10405i.set(0, 0, iWidth, iHeight);
                this.f10406j.set(iB, iC, iWidth + iB, iHeight + iC);
                Bitmap bitmap2 = this.f10409m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f10405i, this.f10406j, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void r(Canvas canvas, R2.d dVar, R2.b bVar, R2.b bVar2) {
        Rect rect = this.f10400d;
        if (rect == null || rect.width() <= 0 || this.f10400d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f10400d.width();
        if (bVar2 != null) {
            n(canvas, width, width, bVar2);
        }
        int width2 = dVar.getWidth();
        int height = dVar.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i10 = (int) (width2 * width);
        int i11 = (int) (height * width);
        int iB = (int) (dVar.b() * width);
        int iC = (int) (dVar.c() * width);
        Rect rect3 = new Rect(iB, iC, i10 + iB, i11 + iC);
        if (bVar.f9964f == b.a.NO_BLEND) {
            canvas.drawRect(rect3, this.f10408l);
        }
        synchronized (this) {
            Bitmap bitmapO = o(width2, height);
            dVar.a(width2, height, bitmapO);
            canvas.drawBitmap(bitmapO, rect2, rect3, (Paint) null);
        }
    }

    private void s(Canvas canvas, R2.d dVar, R2.b bVar, R2.b bVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        int width = this.f10399c.getWidth();
        int height = this.f10399c.getHeight();
        float f14 = width;
        float f15 = height;
        int width2 = dVar.getWidth();
        int height2 = dVar.getHeight();
        int iB = dVar.b();
        int iC = dVar.c();
        if (f14 > canvas.getWidth() || f15 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f16 = f14 / f15;
            if (iMin > iMin2) {
                f11 = iMin;
                f10 = f11 / f16;
            } else {
                f10 = iMin2;
                f11 = f10 * f16;
            }
            f12 = f11 / f14;
            f13 = f10 / f15;
            width2 = (int) Math.ceil(dVar.getWidth() * f12);
            height2 = (int) Math.ceil(dVar.getHeight() * f13);
            iB = (int) Math.ceil(dVar.b() * f12);
            iC = (int) Math.ceil(dVar.c() * f13);
        } else {
            f12 = 1.0f;
            f13 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(iB, iC, iB + width2, iC + height2);
        if (bVar2 != null) {
            n(canvas, f12, f13, bVar2);
        }
        if (bVar.f9964f == b.a.NO_BLEND) {
            canvas.drawRect(rect2, this.f10408l);
        }
        synchronized (this) {
            Bitmap bitmapO = o(width2, height2);
            dVar.a(width2, height2, bitmapO);
            canvas.drawBitmap(bitmapO, rect, rect2, (Paint) null);
        }
    }

    @Override // R2.a
    public int a() {
        return this.f10399c.a();
    }

    @Override // R2.a
    public int b() {
        return this.f10399c.b();
    }

    @Override // R2.a
    public R2.b c(int i10) {
        return this.f10404h[i10];
    }

    @Override // R2.a
    public int d() {
        return this.f10403g;
    }

    @Override // R2.a
    public void e(int i10, Canvas canvas) {
        R2.d dVarN = this.f10399c.n(i10);
        try {
            if (dVarN.getWidth() > 0 && dVarN.getHeight() > 0) {
                if (this.f10399c.o()) {
                    q(canvas, dVarN);
                } else {
                    p(canvas, dVarN);
                }
                dVarN.dispose();
            }
        } finally {
            dVarN.dispose();
        }
    }

    @Override // R2.a
    public int f(int i10) {
        return this.f10401e[i10];
    }

    @Override // R2.a
    public R2.a g(Rect rect) {
        return m(this.f10399c, rect).equals(this.f10400d) ? this : new a(this.f10397a, this.f10398b, rect, this.f10407k);
    }

    @Override // R2.a
    public int getHeight() {
        return this.f10399c.getHeight();
    }

    @Override // R2.a
    public int getWidth() {
        return this.f10399c.getWidth();
    }

    @Override // R2.a
    public int h() {
        return this.f10400d.height();
    }

    @Override // R2.a
    public void i(int i10, Canvas canvas) {
        R2.d dVarN = this.f10399c.n(i10);
        R2.b bVarC = this.f10399c.c(i10);
        R2.b bVarC2 = i10 == 0 ? null : this.f10399c.c(i10 - 1);
        try {
            if (dVarN.getWidth() > 0 && dVarN.getHeight() > 0) {
                if (this.f10399c.o()) {
                    s(canvas, dVarN, bVarC, bVarC2);
                } else {
                    r(canvas, dVarN, bVarC, bVarC2);
                }
                dVarN.dispose();
            }
        } finally {
            dVarN.dispose();
        }
    }

    @Override // R2.a
    public int j() {
        return this.f10400d.width();
    }

    @Override // R2.a
    public e k() {
        return this.f10398b;
    }
}
