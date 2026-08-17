package I3;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.e;
import org.aomedia.avif.android.AvifDecoder;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AvifDecoder f3927v;

    public a(P3.b bVar, b.j jVar) {
        super(bVar, jVar);
        this.f3927v = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int B() {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected /* bridge */ /* synthetic */ e C() {
        X();
        return null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        AvifDecoder avifDecoder = this.f3927v;
        if (avifDecoder != null) {
            avifDecoder.release();
            this.f3927v = null;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap bitmapI = I(this.f3927v.getWidth(), this.f3927v.getHeight());
        AvifDecoder avifDecoder = this.f3927v;
        if (avifDecoder == null) {
            return;
        }
        int i10 = this.f20854e;
        int i11 = ((b) aVar).f3928a;
        if (i10 != i11) {
            avifDecoder.nthFrame(i11, bitmapI);
        } else if (i10 == 0) {
            avifDecoder.nthFrame(0, bitmapI);
        } else {
            avifDecoder.nextFrame(bitmapI);
        }
        this.f20864o.rewind();
        try {
            bitmapI.copyPixelsToBuffer(this.f20864o);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public J3.a A(Reader reader) {
        return new J3.a(reader);
    }

    protected J3.b X() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(J3.a aVar) {
        this.f3927v = AvifDecoder.create(aVar.a());
        return new Rect(0, 0, this.f3927v.getWidth(), this.f3927v.getHeight());
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public com.github.penfeizhou.animation.decode.a u(int i10) {
        b bVar = new b(null);
        bVar.f3928a = i10;
        bVar.frameDuration = (int) (this.f3927v.getFrameDurations()[i10] * 1000.0d);
        return bVar;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public Bitmap v(int i10) {
        if (this.f3927v == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        this.f3927v.nthFrame(i10, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int w() {
        AvifDecoder avifDecoder = this.f3927v;
        if (avifDecoder == null) {
            return 0;
        }
        return avifDecoder.getFrameCount();
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        AvifDecoder avifDecoder = this.f3927v;
        if (avifDecoder == null) {
            return 0;
        }
        if (avifDecoder.getFrameCount() == 1) {
            return 1;
        }
        return this.f3927v.getRepetitionCount();
    }
}
