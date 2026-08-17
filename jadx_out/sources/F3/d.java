package F3;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends IOException {
        a() {
            super("APNG Format error");
        }
    }

    public static boolean a(Reader reader) {
        G3.a aVar = reader instanceof G3.a ? (G3.a) reader : new G3.a(reader);
        try {
            if (!aVar.a("\u0089PNG") || !aVar.a("\r\n\u001a\n")) {
                throw new a();
            }
            while (aVar.available() > 0) {
                if (c(aVar) instanceof F3.a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List b(G3.a aVar) throws a {
        if (!aVar.a("\u0089PNG") || !aVar.a("\r\n\u001a\n")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.available() > 0) {
            arrayList.add(c(aVar));
        }
        return arrayList;
    }

    private static e c(G3.a aVar) throws IOException {
        int iPosition = aVar.position();
        int iC = aVar.c();
        int iB = aVar.b();
        e aVar2 = iB == F3.a.f1831g ? new F3.a() : iB == f.f1853n ? new f() : iB == g.f1863f ? new g() : iB == h.f1865e ? new h() : iB == i.f1866e ? new i() : iB == j.f1867h ? new j() : new e();
        aVar2.f1852d = iPosition;
        aVar2.f1850b = iB;
        aVar2.f1849a = iC;
        aVar2.c(aVar);
        aVar2.f1851c = aVar.c();
        return aVar2;
    }
}
