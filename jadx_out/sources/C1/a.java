package C1;

import B1.h;
import B1.m;
import B1.n;
import B1.o;
import B1.r;
import com.bumptech.glide.load.data.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1.g f467b = v1.g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f468a;

    public a(m mVar) {
        this.f468a = mVar;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(h hVar, int i10, int i11, v1.h hVar2) {
        m mVar = this.f468a;
        if (mVar != null) {
            h hVar3 = (h) mVar.a(hVar, 0, 0);
            if (hVar3 == null) {
                this.f468a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar3;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) hVar2.b(f467b)).intValue()));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(h hVar) {
        return true;
    }

    /* JADX INFO: renamed from: C1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class C0021a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f469a = new m(500);

        @Override // B1.o
        public n build(r rVar) {
            return new a(this.f469a);
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
