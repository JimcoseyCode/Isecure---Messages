package H1;

import java.io.File;
import java.io.IOException;
import v1.k;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d implements k {
    @Override // v1.k
    public v1.c a(v1.h hVar) {
        return v1.c.SOURCE;
    }

    @Override // v1.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(v vVar, File file, v1.h hVar) throws Throwable {
        try {
            Q1.a.f(((c) vVar.get()).c(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
