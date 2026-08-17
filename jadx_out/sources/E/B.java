package E;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class B implements P.y {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        abstract V.g a();

        abstract P.z b();
    }

    static void b(File file, byte[] bArr) throws y.X {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new N.c().b(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            throw new y.X(1, "Failed to write to temp file", e10);
        }
    }

    @Override // P.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public V.h apply(a aVar) throws y.X {
        P.z zVarB = aVar.b();
        aVar.a();
        File fileB = AbstractC0461v.b(null);
        b(fileB, (byte[]) zVarB.c());
        H.g gVarD = zVarB.d();
        Objects.requireNonNull(gVarD);
        AbstractC0461v.g(fileB, gVarD, null, zVarB.f());
        return new V.h(AbstractC0461v.f(fileB, null), 256);
    }
}
