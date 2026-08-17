package m8;

import java.io.IOException;
import java.io.InputStream;
import m8.AbstractC2942a;

/* JADX INFO: renamed from: m8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2943b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2948g f29633a = C2948g.c();

    private p d(p pVar) throws C2952k {
        if (pVar == null || pVar.e()) {
            return pVar;
        }
        throw e(pVar).a().i(pVar);
    }

    private v e(p pVar) {
        return pVar instanceof AbstractC2942a ? ((AbstractC2942a) pVar).d() : new v(pVar);
    }

    @Override // m8.r
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p b(InputStream inputStream, C2948g c2948g) {
        return d(h(inputStream, c2948g));
    }

    @Override // m8.r
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p c(InputStream inputStream, C2948g c2948g) {
        return d(i(inputStream, c2948g));
    }

    public p h(InputStream inputStream, C2948g c2948g) throws C2952k {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return i(new AbstractC2942a.AbstractC0318a.C0319a(inputStream, C2946e.A(i10, inputStream)), c2948g);
        } catch (IOException e10) {
            throw new C2952k(e10.getMessage());
        }
    }

    public p i(InputStream inputStream, C2948g c2948g) throws C2952k {
        C2946e c2946eG = C2946e.g(inputStream);
        p pVar = (p) a(c2946eG, c2948g);
        try {
            c2946eG.a(0);
            return pVar;
        } catch (C2952k e10) {
            throw e10.i(pVar);
        }
    }
}
