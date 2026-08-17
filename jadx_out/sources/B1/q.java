package B1;

import B1.n;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class q implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.e f307b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements com.bumptech.glide.load.data.d, d.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final H0.e f309h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f310i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private com.bumptech.glide.g f311j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d.a f312k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List f313l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f314m;

        a(List list, H0.e eVar) {
            this.f309h = eVar;
            Q1.k.d(list);
            this.f308g = list;
            this.f310i = 0;
        }

        private void b() {
            if (this.f314m) {
                return;
            }
            if (this.f310i < this.f308g.size() - 1) {
                this.f310i++;
                loadData(this.f311j, this.f312k);
            } else {
                Q1.k.e(this.f313l);
                this.f312k.a(new x1.q("Fetch failed", new ArrayList(this.f313l)));
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void a(Exception exc) {
            ((List) Q1.k.e(this.f313l)).add(exc);
            b();
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Object obj) {
            if (obj != null) {
                this.f312k.c(obj);
            } else {
                b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f314m = true;
            Iterator it = this.f308g.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            List list = this.f313l;
            if (list != null) {
                this.f309h.release(list);
            }
            this.f313l = null;
            Iterator it = this.f308g.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return ((com.bumptech.glide.load.data.d) this.f308g.get(0)).getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return ((com.bumptech.glide.load.data.d) this.f308g.get(0)).getDataSource();
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            this.f311j = gVar;
            this.f312k = aVar;
            this.f313l = (List) this.f309h.acquire();
            ((com.bumptech.glide.load.data.d) this.f308g.get(this.f310i)).loadData(gVar, this);
            if (this.f314m) {
                cancel();
            }
        }
    }

    q(List list, H0.e eVar) {
        this.f306a = list;
        this.f307b = eVar;
    }

    @Override // B1.n
    public n.a buildLoadData(Object obj, int i10, int i11, v1.h hVar) {
        n.a aVarBuildLoadData;
        int size = this.f306a.size();
        ArrayList arrayList = new ArrayList(size);
        v1.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f306a.get(i12);
            if (nVar.handles(obj) && (aVarBuildLoadData = nVar.buildLoadData(obj, i10, i11, hVar)) != null) {
                fVar = aVarBuildLoadData.f299a;
                arrayList.add(aVarBuildLoadData.f301c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a(fVar, new a(arrayList, this.f307b));
    }

    @Override // B1.n
    public boolean handles(Object obj) {
        Iterator it = this.f306a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).handles(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f306a.toArray()) + '}';
    }
}
