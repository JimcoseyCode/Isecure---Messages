package F3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends com.github.penfeizhou.animation.decode.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f1841f = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f1842g = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ThreadLocal f1843h = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f1844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f1845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte[] f1846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List f1847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List f1848e;

    public c(G3.a aVar, f fVar) {
        super(aVar);
        this.f1847d = new ArrayList();
        this.f1848e = new ArrayList();
        this.f1844a = fVar.f1862m;
        this.f1845b = fVar.f1861l;
        int i10 = fVar.f1859j * 1000;
        short s10 = fVar.f1860k;
        int i11 = i10 / (s10 == 0 ? (short) 100 : s10);
        this.frameDuration = i11;
        if (i11 < 10) {
            this.frameDuration = 100;
        }
        this.frameWidth = fVar.f1855f;
        this.frameHeight = fVar.f1856g;
        this.frameX = fVar.f1857h;
        this.frameY = fVar.f1858i;
    }

    private int b(G3.b bVar) throws IOException {
        int i10;
        Iterator it = this.f1848e.iterator();
        int i11 = 33;
        while (it.hasNext()) {
            i11 += ((e) it.next()).f1849a + 12;
        }
        for (e eVar : this.f1847d) {
            if (eVar instanceof h) {
                i10 = eVar.f1849a + 12;
            } else if (eVar instanceof g) {
                i10 = eVar.f1849a + 8;
            }
            i11 += i10;
        }
        int length = i11 + f1842g.length;
        bVar.d(length);
        bVar.c(f1841f);
        bVar.h(13);
        int iA = bVar.a();
        bVar.g(j.f1867h);
        bVar.h(this.frameWidth);
        bVar.h(this.frameHeight);
        bVar.c(this.f1846c);
        CRC32 crc32C = c();
        crc32C.reset();
        crc32C.update(bVar.f(), iA, 17);
        bVar.h((int) crc32C.getValue());
        for (e eVar2 : this.f1848e) {
            if (!(eVar2 instanceof i)) {
                ((G3.a) this.reader).reset();
                ((G3.a) this.reader).skip(eVar2.f1852d);
                ((G3.a) this.reader).read(bVar.f(), bVar.a(), eVar2.f1849a + 12);
                bVar.e(eVar2.f1849a + 12);
            }
        }
        for (e eVar3 : this.f1847d) {
            if (eVar3 instanceof h) {
                ((G3.a) this.reader).reset();
                ((G3.a) this.reader).skip(eVar3.f1852d);
                ((G3.a) this.reader).read(bVar.f(), bVar.a(), eVar3.f1849a + 12);
                bVar.e(eVar3.f1849a + 12);
            } else if (eVar3 instanceof g) {
                bVar.h(eVar3.f1849a - 4);
                int iA2 = bVar.a();
                bVar.g(h.f1865e);
                ((G3.a) this.reader).reset();
                ((G3.a) this.reader).skip(eVar3.f1852d + 12);
                ((G3.a) this.reader).read(bVar.f(), bVar.a(), eVar3.f1849a - 4);
                bVar.e(eVar3.f1849a - 4);
                crc32C.reset();
                crc32C.update(bVar.f(), iA2, eVar3.f1849a);
                bVar.h((int) crc32C.getValue());
            }
        }
        bVar.c(f1842g);
        return length;
    }

    private CRC32 c() {
        ThreadLocal threadLocal = f1843h;
        CRC32 crc32 = (CRC32) threadLocal.get();
        if (crc32 != null) {
            return crc32;
        }
        CRC32 crc322 = new CRC32();
        threadLocal.set(crc322);
        return crc322;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, G3.b bVar) {
        Bitmap bitmapDecodeByteArray;
        try {
            int iB = b(bVar);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = i10;
            options.inMutable = true;
            options.inBitmap = bitmap;
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
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmapDecodeByteArray.getWidth();
            this.srcRect.bottom = bitmapDecodeByteArray.getHeight();
            Rect rect2 = this.dstRect;
            int i11 = this.frameX;
            float f10 = i10;
            rect2.left = (int) (i11 / f10);
            rect2.top = (int) (this.frameY / f10);
            rect2.right = (int) ((i11 / f10) + bitmapDecodeByteArray.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f10) + bitmapDecodeByteArray.getHeight());
            canvas.drawBitmap(bitmapDecodeByteArray, this.srcRect, this.dstRect, paint);
            return bitmapDecodeByteArray;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
