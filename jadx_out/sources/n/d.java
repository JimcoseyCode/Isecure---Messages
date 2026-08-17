package N;

import F.g1;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.o;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IncorrectJpegMetadataQuirk f7687a;

    public d(g1 g1Var) {
        this.f7687a = (IncorrectJpegMetadataQuirk) g1Var.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(o oVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f7687a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.j(oVar);
        }
        ByteBuffer byteBufferC = oVar.p()[0].c();
        byte[] bArr = new byte[byteBufferC.capacity()];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        return bArr;
    }
}
