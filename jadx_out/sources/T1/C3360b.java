package t1;

import Q1.k;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C1937g;
import com.bumptech.glide.load.resource.bitmap.C1949t;
import java.nio.ByteBuffer;
import org.aomedia.avif.android.AvifDecoder;
import v1.EnumC3418b;
import v1.h;
import v1.j;
import x1.v;
import y1.d;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3360b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f32464a;

    public C3360b(d dVar) {
        this.f32464a = (d) k.e(dVar);
    }

    private ByteBuffer c(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.flip();
        return byteBufferAllocateDirect;
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v decode(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
        ByteBuffer byteBufferC = c(byteBuffer);
        AvifDecoder.Info info = new AvifDecoder.Info();
        if (!AvifDecoder.getInfo(byteBufferC, byteBufferC.remaining(), info)) {
            return null;
        }
        Bitmap bitmapD = this.f32464a.d(info.width, info.height, hVar.b(C1949t.f19264f) == EnumC3418b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : info.depth == 8 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16);
        if (AvifDecoder.decode(byteBufferC, byteBufferC.remaining(), bitmapD)) {
            return C1937g.d(bitmapD, this.f32464a);
        }
        this.f32464a.c(bitmapD);
        return null;
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(ByteBuffer byteBuffer, h hVar) {
        return AvifDecoder.isAvifImage(c(byteBuffer));
    }
}
