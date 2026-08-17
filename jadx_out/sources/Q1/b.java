package Q1;

import m0.C2892a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends C2892a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9018m;

    @Override // m0.i, java.util.Map
    public void clear() {
        this.f9018m = 0;
        super.clear();
    }

    @Override // m0.i
    public void g(m0.i iVar) {
        this.f9018m = 0;
        super.g(iVar);
    }

    @Override // m0.i
    public Object h(int i10) {
        this.f9018m = 0;
        return super.h(i10);
    }

    @Override // m0.i, java.util.Map
    public int hashCode() {
        if (this.f9018m == 0) {
            this.f9018m = super.hashCode();
        }
        return this.f9018m;
    }

    @Override // m0.i
    public Object i(int i10, Object obj) {
        this.f9018m = 0;
        return super.i(i10, obj);
    }

    @Override // m0.i, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f9018m = 0;
        return super.put(obj, obj2);
    }
}
