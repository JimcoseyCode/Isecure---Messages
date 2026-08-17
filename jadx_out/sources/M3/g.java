package M3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.gif.decode.GifFrame;
import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private N3.a f7462v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Paint f7463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f7464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final b f7465y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f7466z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ByteBuffer f7467a;

        private b() {
        }
    }

    public g(P3.b bVar, b.j jVar) {
        super(bVar, jVar);
        this.f7462v = new N3.a();
        Paint paint = new Paint();
        this.f7463w = paint;
        this.f7464x = 0;
        this.f7465y = new b();
        this.f7466z = 1;
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        this.f7465y.f7467a = null;
        this.f7462v = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        GifFrame gifFrame = (GifFrame) aVar;
        Bitmap bitmapI = I(this.f20865p.width() / this.f20860k, this.f20865p.height() / this.f20860k);
        Canvas canvas = (Canvas) this.f20863n.get(bitmapI);
        if (canvas == null) {
            canvas = new Canvas(bitmapI);
            this.f20863n.put(bitmapI, canvas);
        }
        this.f20864o.rewind();
        bitmapI.copyPixelsFromBuffer(this.f20864o);
        int i10 = !gifFrame.transparencyFlag() ? this.f7464x : 0;
        int i11 = this.f20854e;
        if (i11 == 0) {
            bitmapI.eraseColor(i10);
        } else {
            GifFrame gifFrame2 = (GifFrame) this.f20853d.get(i11 - 1);
            canvas.save();
            int i12 = gifFrame2.frameX;
            int i13 = this.f20860k;
            int i14 = gifFrame2.frameY;
            canvas.clipRect(i12 / i13, i14 / i13, (i12 + gifFrame2.frameWidth) / i13, (i14 + gifFrame2.frameHeight) / i13);
            int i15 = gifFrame2.disposalMethod;
            if (i15 == 2) {
                canvas.drawColor(this.f7464x, PorterDuff.Mode.CLEAR);
            } else if (i15 == 3) {
                this.f7465y.f7467a.rewind();
                canvas.drawColor(this.f7464x, PorterDuff.Mode.CLEAR);
                Bitmap bitmapI2 = I(this.f20865p.width() / this.f20860k, this.f20865p.height() / this.f20860k);
                bitmapI2.copyPixelsFromBuffer(this.f7465y.f7467a);
                canvas.drawBitmap(bitmapI2, 0.0f, 0.0f, this.f7463w);
                L(bitmapI2);
            }
            canvas.restore();
            if (gifFrame.disposalMethod == 3 && gifFrame2.disposalMethod != 3) {
                this.f20864o.rewind();
                this.f7465y.f7467a.rewind();
                this.f7465y.f7467a.put(this.f20864o);
            }
        }
        int i16 = aVar.frameWidth;
        int i17 = this.f20860k;
        Bitmap bitmapI3 = I(i16 / i17, aVar.frameHeight / i17);
        gifFrame.draw(canvas, this.f7463w, this.f20860k, bitmapI3, C());
        canvas.drawColor(i10, PorterDuff.Mode.DST_OVER);
        L(bitmapI3);
        this.f20864o.rewind();
        bitmapI.copyPixelsToBuffer(this.f20864o);
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public GifReader A(Reader reader) {
        return new GifReader(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public N3.a C() {
        if (this.f7462v == null) {
            this.f7462v = new N3.a();
        }
        return this.f7462v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(GifReader gifReader) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        c cVar = null;
        i iVar = null;
        for (M3.b bVar : h.c(gifReader)) {
            if (bVar instanceof k) {
                k kVar = (k) bVar;
                i11 = kVar.f7480a;
                i12 = kVar.f7481b;
                if (kVar.b()) {
                    i10 = kVar.f7483d & 255;
                }
            } else if (bVar instanceof c) {
                cVar = (c) bVar;
            } else if (bVar instanceof i) {
                iVar = (i) bVar;
            } else if (bVar instanceof j) {
                this.f20853d.add(new GifFrame(gifReader, cVar, iVar, (j) bVar));
            } else if (bVar instanceof M3.a) {
                M3.a aVar = (M3.a) bVar;
                if ("NETSCAPE2.0".equals(aVar.f7456b)) {
                    int i13 = aVar.f7455a;
                    if (i13 == 0) {
                        this.f7466z = 0;
                    } else if (i13 > 0) {
                        this.f7466z = i13 + 1;
                    }
                }
            }
        }
        int i14 = this.f20860k;
        long j10 = (((((long) i11) * ((long) i12)) / (((long) i14) * ((long) i14))) + 1) * 4;
        int i15 = (int) j10;
        try {
            this.f20864o = ByteBuffer.allocate(i15);
            this.f7465y.f7467a = ByteBuffer.allocate(i15);
            if (cVar != null && i10 >= 0 && i10 < cVar.b().length) {
                int i16 = cVar.b()[i10];
                this.f7464x = Color.rgb(i16 & 255, (i16 >> 8) & 255, (i16 >> 16) & 255);
            }
            return new Rect(0, 0, i11, i12);
        } catch (OutOfMemoryError e10) {
            String.format("OutOfMemoryError in GifDecoder: Buffer needed: %.2fMB (%,d bytes)", Double.valueOf(j10 / 1048576.0d), Long.valueOf(j10));
            this.f20864o = null;
            this.f7465y.f7467a = null;
            throw e10;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int t(int i10, int i11) {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f7466z;
    }
}
