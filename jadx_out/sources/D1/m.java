package D1;

import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class m implements v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Object f752g;

    public m(Object obj) {
        this.f752g = Q1.k.e(obj);
    }

    @Override // x1.v
    public Class a() {
        return this.f752g.getClass();
    }

    @Override // x1.v
    public final int b() {
        return 1;
    }

    @Override // x1.v
    public final Object get() {
        return this.f752g;
    }

    @Override // x1.v
    public void recycle() {
    }
}
