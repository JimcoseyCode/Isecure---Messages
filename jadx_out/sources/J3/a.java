package J3;

import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f5407g;

    public a(Reader reader) {
        super(reader);
        this.f5407g = null;
    }

    public ByteBuffer a() throws IOException {
        if (this.f5407g == null) {
            int iAvailable = available();
            byte[] bArr = new byte[iAvailable];
            read(bArr, 0, iAvailable);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iAvailable);
            this.f5407g = byteBufferAllocateDirect;
            byteBufferAllocateDirect.put(bArr);
        }
        this.f5407g.flip();
        return this.f5407g;
    }
}
