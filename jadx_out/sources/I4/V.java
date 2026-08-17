package I4;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class V extends H {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f4609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ X f4611i;

    V(X x10, int i10) {
        this.f4611i = x10;
        this.f4609g = X.j(x10, i10);
        this.f4610h = i10;
    }

    private final void a() {
        int i10 = this.f4610h;
        if (i10 == -1 || i10 >= this.f4611i.size() || !AbstractC0972p.a(this.f4609g, X.j(this.f4611i, this.f4610h))) {
            this.f4610h = this.f4611i.z(this.f4609g);
        }
    }

    @Override // I4.H, java.util.Map.Entry
    public final Object getKey() {
        return this.f4609g;
    }

    @Override // I4.H, java.util.Map.Entry
    public final Object getValue() {
        Map mapO = this.f4611i.o();
        if (mapO != null) {
            return mapO.get(this.f4609g);
        }
        a();
        int i10 = this.f4610h;
        if (i10 == -1) {
            return null;
        }
        return X.m(this.f4611i, i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapO = this.f4611i.o();
        if (mapO != null) {
            return mapO.put(this.f4609g, obj);
        }
        a();
        int i10 = this.f4610h;
        if (i10 == -1) {
            this.f4611i.put(this.f4609g, obj);
            return null;
        }
        X x10 = this.f4611i;
        Object objM = X.m(x10, i10);
        X.q(x10, this.f4610h, obj);
        return objM;
    }
}
