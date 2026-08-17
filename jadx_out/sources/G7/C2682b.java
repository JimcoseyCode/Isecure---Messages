package g7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import h7.AbstractC2707a;
import java.security.MessageDigest;
import v1.f;
import y1.d;

/* JADX INFO: renamed from: g7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2682b extends AbstractC2681a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28231c;

    public C2682b(int i10, int i11) {
        this.f28230b = i10;
        this.f28231c = i11;
    }

    @Override // g7.AbstractC2681a
    protected Bitmap c(Context context, d dVar, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = this.f28231c;
        Bitmap bitmapD = dVar.d(width / i12, height / i12, Bitmap.Config.ARGB_8888);
        b(bitmap, bitmapD);
        Canvas canvas = new Canvas(bitmapD);
        int i13 = this.f28231c;
        canvas.scale(1.0f / i13, 1.0f / i13);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            return h7.b.a(context, bitmapD, this.f28230b);
        } catch (RSRuntimeException unused) {
            return AbstractC2707a.a(bitmapD, this.f28230b, true);
        }
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof C2682b)) {
            return false;
        }
        C2682b c2682b = (C2682b) obj;
        return c2682b.f28230b == this.f28230b && c2682b.f28231c == this.f28231c;
    }

    @Override // v1.f
    public int hashCode() {
        return 737513610 + (this.f28230b * ProgressBarContainerView.MAX_PROGRESS) + (this.f28231c * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f28230b + ", sampling=" + this.f28231c + ")";
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.BlurTransformation.1" + this.f28230b + this.f28231c).getBytes(f.f32884a));
    }
}
