package x2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.q;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import y2.InterfaceC3611b;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3529a extends Drawable implements InterfaceC3611b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f33502A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f33503B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f33511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q f33512m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33515p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f33521v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f33523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f33524y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f33525z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap f33513n = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33516q = 80;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Paint f33517r = new Paint(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Matrix f33518s = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f33519t = new Rect();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f33520u = new RectF();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f33504C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f33505D = 0;

    public C3529a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i10) {
        String str3 = str + ": ";
        float fMeasureText = this.f33517r.measureText(str3);
        float fMeasureText2 = this.f33517r.measureText(str2);
        this.f33517r.setColor(1711276032);
        int i11 = this.f33524y;
        int i12 = this.f33525z;
        canvas.drawRect(i11 - 4, i12 + 8, i11 + fMeasureText + fMeasureText2 + 4.0f, i12 + this.f33523x + 8, this.f33517r);
        this.f33517r.setColor(-1);
        canvas.drawText(str3, this.f33524y, this.f33525z, this.f33517r);
        this.f33517r.setColor(i10);
        canvas.drawText(str2, this.f33524y + fMeasureText, this.f33525z, this.f33517r);
        this.f33525z += this.f33523x;
    }

    private static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i10, int i11) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i11, rect.height() / i10)));
        this.f33517r.setTextSize(iMin);
        int i12 = iMin + 8;
        this.f33523x = i12;
        int i13 = this.f33516q;
        if (i13 == 80) {
            this.f33523x = i12 * (-1);
        }
        this.f33521v = rect.left + 10;
        this.f33522w = i13 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // y2.InterfaceC3611b
    public void a(long j10) {
        this.f33502A = j10;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f33513n.put(str, str2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f33517r.setStyle(Paint.Style.STROKE);
        this.f33517r.setStrokeWidth(2.0f);
        this.f33517r.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f33517r);
        Paint paint = this.f33517r;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f33517r.setColor(this.f33505D);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f33517r);
        this.f33517r.setStyle(style);
        this.f33517r.setStrokeWidth(0.0f);
        this.f33517r.setColor(-1);
        this.f33524y = this.f33521v;
        this.f33525z = this.f33522w;
        String str = this.f33507h;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f33506g, str));
        } else {
            d(canvas, "ID", this.f33506g);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f33508i), Integer.valueOf(this.f33509j)), f(this.f33508i, this.f33509j, this.f33512m));
        int i10 = this.f33509j;
        if (i10 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f33508i / i10));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f33510k / IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)));
        String str2 = this.f33511l;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i11 = this.f33514o;
        if (i11 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i11), Integer.valueOf(this.f33515p)));
        }
        q qVar = this.f33512m;
        if (qVar != null) {
            c(canvas, "scale", qVar);
        }
        long j10 = this.f33502A;
        if (j10 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j10)));
        }
        String str3 = this.f33503B;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f33504C);
        }
        for (Map.Entry entry : this.f33513n.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    int f(int i10, int i11, q qVar) {
        int i12;
        int i13;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i10 > 0 && i11 > 0) {
            if (qVar != null) {
                Rect rect = this.f33519t;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f33518s.reset();
                i12 = i10;
                i13 = i11;
                qVar.getTransform(this.f33518s, this.f33519t, i12, i13, 0.0f, 0.0f);
                RectF rectF = this.f33520u;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i12;
                rectF.bottom = i13;
                this.f33518s.mapRect(rectF);
                int iWidth2 = (int) this.f33520u.width();
                int iHeight2 = (int) this.f33520u.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            } else {
                i12 = i10;
                i13 = i11;
            }
            float f10 = iWidth;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = iHeight;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int iAbs = Math.abs(i12 - iWidth);
            int iAbs2 = Math.abs(i13 - iHeight);
            float f16 = iAbs;
            if (f16 < f11 && iAbs2 < f14) {
                return -16711936;
            }
            if (f16 < f12 && iAbs2 < f15) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f33508i = -1;
        this.f33509j = -1;
        this.f33510k = -1;
        this.f33513n = new HashMap();
        this.f33514o = -1;
        this.f33515p = -1;
        this.f33511l = null;
        j(null);
        this.f33502A = -1L;
        this.f33503B = null;
        this.f33504C = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f33506g = str;
        invalidateSelf();
    }

    public void k(int i10, int i11) {
        this.f33508i = i10;
        this.f33509j = i11;
        invalidateSelf();
    }

    public void l(int i10) {
        this.f33510k = i10;
    }

    public void m(q qVar) {
        this.f33512m = qVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
