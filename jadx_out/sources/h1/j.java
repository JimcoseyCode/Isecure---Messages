package H1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1.j f3687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1.b f3688c;

    public j(List list, v1.j jVar, y1.b bVar) {
        this.f3686a = list;
        this.f3687b = jVar;
        this.f3688c = bVar;
    }

    private static byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v decode(InputStream inputStream, int i10, int i11, v1.h hVar) {
        byte[] bArrC = c(inputStream);
        if (bArrC == null) {
            return null;
        }
        return this.f3687b.decode(ByteBuffer.wrap(bArrC), i10, i11, hVar);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(InputStream inputStream, v1.h hVar) {
        return !((Boolean) hVar.b(i.f3685b)).booleanValue() && com.bumptech.glide.load.a.f(this.f3686a, inputStream, this.f3688c) == ImageHeaderParser.ImageType.GIF;
    }
}
