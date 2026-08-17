package g5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import x0.AbstractC3516d;

/* JADX INFO: renamed from: g5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2679a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f28218i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f28219j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f28220k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f28221l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f28222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f28223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f28224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f28228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f28229h;

    public C2679a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f28228g;
        if (z10) {
            int[] iArr = f28220k;
            iArr[0] = 0;
            iArr[1] = this.f28227f;
            iArr[2] = this.f28226e;
            iArr[3] = this.f28225d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f28220k;
            iArr2[0] = 0;
            iArr2[1] = this.f28225d;
            iArr2[2] = this.f28226e;
            iArr2[3] = this.f28227f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f28221l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f28223b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f28220k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f28229h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f28223b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f28218i;
        iArr[0] = this.f28227f;
        iArr[1] = this.f28226e;
        iArr[2] = this.f28225d;
        Paint paint = this.f28224c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f28219j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f28224c);
        canvas.restore();
    }

    public Paint c() {
        return this.f28222a;
    }

    public void d(int i10) {
        this.f28225d = AbstractC3516d.k(i10, 68);
        this.f28226e = AbstractC3516d.k(i10, 20);
        this.f28227f = AbstractC3516d.k(i10, 0);
        this.f28222a.setColor(this.f28225d);
    }

    public C2679a(int i10) {
        this.f28228g = new Path();
        Paint paint = new Paint();
        this.f28229h = paint;
        this.f28222a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f28223b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f28224c = new Paint(paint2);
    }
}
