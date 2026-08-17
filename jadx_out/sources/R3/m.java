package R3;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends IOException {
        a() {
            super("WebP Format error");
        }
    }

    public static boolean a(Reader reader) {
        S3.a aVar = reader instanceof S3.a ? (S3.a) reader : new S3.a(reader);
        try {
            if (!aVar.f("RIFF")) {
                return false;
            }
            aVar.skip(4L);
            if (!aVar.f("WEBP")) {
                return false;
            }
            while (aVar.available() > 0) {
                e eVarC = c(aVar);
                if (eVarC instanceof k) {
                    return ((k) eVarC).e();
                }
            }
        } catch (IOException e10) {
            if (!(e10 instanceof a)) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static List b(S3.a aVar) throws IOException {
        if (!aVar.f("RIFF")) {
            throw new a();
        }
        aVar.skip(4L);
        if (!aVar.f("WEBP")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.available() > 0) {
            arrayList.add(c(aVar));
        }
        return arrayList;
    }

    static e c(S3.a aVar) {
        int iPosition = aVar.position();
        int iB = aVar.b();
        int iE = aVar.e();
        e kVar = k.f10011g == iB ? new k() : b.f9984f == iB ? new b() : c.f9987m == iB ? new c() : R3.a.f9983d == iB ? new R3.a() : i.f10009d == iB ? new i() : j.f10010d == iB ? new j() : g.f10008d == iB ? new g() : n.f10023d == iB ? new n() : f.f10007d == iB ? new f() : new e();
        kVar.f10004a = iB;
        kVar.f10005b = iE;
        kVar.f10006c = iPosition;
        kVar.c(aVar);
        return kVar;
    }
}
