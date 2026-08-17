package R3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d extends com.github.penfeizhou.animation.decode.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final PorterDuffXfermode f9997f = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final PorterDuffXfermode f9998g = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f9999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f10000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f10001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f10002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f10003e;

    public d(S3.a aVar, c cVar) {
        super(aVar);
        this.frameWidth = cVar.f9990f;
        this.frameHeight = cVar.f9991g;
        this.frameX = cVar.f9988d;
        this.frameY = cVar.f9989e;
        int i10 = cVar.f9992h;
        this.frameDuration = i10;
        if (i10 == 0) {
            this.frameDuration = 100;
        }
        this.f10001c = cVar.d();
        this.f10002d = cVar.e();
        this.f9999a = cVar.f10006c + 24;
        int i11 = cVar.f10005b;
        this.f10000b = (i11 - 16) + (i11 & 1);
        this.f10003e = cVar.f9994j != null;
    }

    private int b(S3.b bVar) {
        int i10 = 30 + this.f10000b;
        bVar.d(i10);
        bVar.h("RIFF");
        bVar.j(i10);
        bVar.h("WEBP");
        bVar.j(k.f10011g);
        bVar.j(10);
        bVar.b((byte) (this.f10003e ? 16 : 0));
        bVar.i(0);
        bVar.g(this.frameWidth);
        bVar.g(this.frameHeight);
        try {
            ((S3.a) this.reader).reset();
            ((S3.a) this.reader).skip(this.f9999a);
            ((S3.a) this.reader).read(bVar.f(), bVar.a(), this.f10000b);
            return i10;
        } catch (IOException e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, S3.b bVar) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        int iB = b(bVar);
        byte[] bArrF = bVar.f();
        try {
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, iB, options);
        } catch (IllegalArgumentException unused) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = i10;
            options2.inMutable = true;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, iB, options2);
        }
        if (bitmapDecodeByteArray == null) {
            return bitmap;
        }
        if (this.f10001c) {
            paint.setXfermode(f9998g);
        } else {
            paint.setXfermode(f9997f);
        }
        Rect rect = this.srcRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = bitmapDecodeByteArray.getWidth();
        this.srcRect.bottom = bitmapDecodeByteArray.getHeight();
        Rect rect2 = this.dstRect;
        int i11 = this.frameX;
        float f10 = i10;
        rect2.left = (int) ((i11 * 2.0f) / f10);
        rect2.top = (int) ((this.frameY * 2.0f) / f10);
        rect2.right = (int) (((i11 * 2.0f) / f10) + bitmapDecodeByteArray.getWidth());
        this.dstRect.bottom = (int) (((this.frameY * 2.0f) / f10) + bitmapDecodeByteArray.getHeight());
        canvas.drawBitmap(bitmapDecodeByteArray, this.srcRect, this.dstRect, paint);
        return bitmapDecodeByteArray;
    }
}
