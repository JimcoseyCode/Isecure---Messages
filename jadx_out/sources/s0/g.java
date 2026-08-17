package s0;

import s0.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32135m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f32118e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f32118e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // s0.f
    public void d(int i10) {
        if (this.f32123j) {
            return;
        }
        this.f32123j = true;
        this.f32120g = i10;
        for (InterfaceC3315d interfaceC3315d : this.f32124k) {
            interfaceC3315d.a(interfaceC3315d);
        }
    }
}
