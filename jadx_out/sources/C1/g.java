package C1;

import B1.n;
import B1.o;
import B1.r;
import java.io.InputStream;
import java.net.URL;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f491a;

    public g(n nVar) {
        this.f491a = nVar;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(URL url, int i10, int i11, h hVar) {
        return this.f491a.buildLoadData(new B1.h(url), i10, i11, hVar);
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(URL url) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a implements o {
        @Override // B1.o
        public n build(r rVar) {
            return new g(rVar.d(B1.h.class, InputStream.class));
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
