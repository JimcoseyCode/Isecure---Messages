package R3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f10015A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f10016B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private S3.b f10017C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Paint f10018v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Paint f10019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f10020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f10021y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f10022z;

    public l(P3.b bVar, b.j jVar) {
        super(bVar, jVar);
        Paint paint = new Paint();
        this.f10018v = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap bitmapI;
        Bitmap bitmapI2;
        int i10;
        if (aVar == null || this.f20865p == null || this.f20865p.width() <= 0 || this.f20865p.height() <= 0 || (bitmapI = I(this.f20865p.width() / this.f20860k, this.f20865p.height() / this.f20860k)) == null) {
            return;
        }
        Canvas canvas = (Canvas) this.f20863n.get(bitmapI);
        if (canvas == null) {
            canvas = new Canvas(bitmapI);
            this.f20863n.put(bitmapI, canvas);
        }
        Canvas canvas2 = canvas;
        this.f20864o.rewind();
        bitmapI.copyPixelsFromBuffer(this.f20864o);
        int i11 = this.f20854e;
        if (i11 != 0) {
            com.github.penfeizhou.animation.decode.a aVar2 = (com.github.penfeizhou.animation.decode.a) this.f20853d.get(i11 - 1);
            if ((aVar2 instanceof d) && ((d) aVar2).f10002d) {
                int i12 = aVar2.frameX;
                int i13 = this.f20860k;
                canvas2.drawRect((i12 * 2.0f) / i13, (aVar2.frameY * 2.0f) / i13, ((i12 * 2) + aVar2.frameWidth) / i13, ((r7 * 2) + aVar2.frameHeight) / i13, this.f10018v);
            }
        } else if (this.f10015A) {
            canvas2.drawColor(0, PorterDuff.Mode.SRC);
        } else {
            canvas2.drawColor(this.f10016B, PorterDuff.Mode.SRC);
        }
        int i14 = aVar.frameWidth;
        if (i14 <= 0 || (i10 = aVar.frameHeight) <= 0) {
            bitmapI2 = null;
        } else {
            int i15 = this.f20860k;
            bitmapI2 = I(i14 / i15, i10 / i15);
        }
        Bitmap bitmap = bitmapI2;
        L(aVar.draw(canvas2, this.f10019w, this.f20860k, bitmap, C()));
        L(bitmap);
        this.f20864o.rewind();
        bitmapI.copyPixelsToBuffer(this.f20864o);
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public S3.a A(Reader reader) {
        return new S3.a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public S3.b C() {
        if (this.f10017C == null) {
            this.f10017C = new S3.b();
        }
        return this.f10017C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(S3.a aVar) {
        boolean z10 = false;
        boolean z11 = false;
        for (e eVar : m.b(aVar)) {
            if (eVar instanceof k) {
                k kVar = (k) eVar;
                this.f10021y = kVar.f10013e;
                this.f10022z = kVar.f10014f;
                this.f10015A = kVar.d();
                z11 = true;
            } else if (eVar instanceof b) {
                b bVar = (b) eVar;
                this.f10016B = bVar.f9985d;
                this.f10020x = bVar.f9986e;
                z10 = true;
            } else if (eVar instanceof c) {
                this.f20853d.add(new d(aVar, (c) eVar));
            }
        }
        if (!z10) {
            if (!z11) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(aVar.toInputStream(), null, options);
                this.f10021y = options.outWidth;
                this.f10022z = options.outHeight;
            }
            this.f20853d.add(new h(aVar, this.f10021y, this.f10022z));
            this.f10020x = 1;
        }
        Paint paint = new Paint();
        this.f10019w = paint;
        paint.setAntiAlias(true);
        if (!this.f10015A) {
            this.f10018v.setColor(this.f10016B);
        }
        return new Rect(0, 0, this.f10021y, this.f10022z);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f10020x;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
    }
}
