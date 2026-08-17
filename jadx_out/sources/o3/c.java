package O3;

import R3.m;
import com.github.penfeizhou.animation.io.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import v1.h;
import v1.j;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f8190a;

    public c(j jVar) {
        this.f8190a = jVar;
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
    public v decode(InputStream inputStream, int i10, int i11, h hVar) {
        byte[] bArrC = c(inputStream);
        if (bArrC == null) {
            return null;
        }
        return this.f8190a.decode(ByteBuffer.wrap(bArrC), i10, i11, hVar);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(InputStream inputStream, h hVar) {
        if (!((Boolean) hVar.b(a.f8182b)).booleanValue() && m.a(new d(inputStream))) {
            return true;
        }
        if (!((Boolean) hVar.b(a.f8183c)).booleanValue() && F3.d.a(new d(inputStream))) {
            return true;
        }
        if (((Boolean) hVar.b(a.f8181a)).booleanValue() || !M3.h.b(new d(inputStream))) {
            return !((Boolean) hVar.b(a.f8185e)).booleanValue() && I3.c.a(new d(inputStream));
        }
        return true;
    }
}
