package r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends C3242e {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public ArrayList f31826J0 = new ArrayList();

    public void c(C3242e c3242e) {
        this.f31826J0.add(c3242e);
        if (c3242e.K() != null) {
            ((m) c3242e.K()).n1(c3242e);
        }
        c3242e.W0(this);
    }

    public ArrayList l1() {
        return this.f31826J0;
    }

    public abstract void m1();

    public void n1(C3242e c3242e) {
        this.f31826J0.remove(c3242e);
        c3242e.q0();
    }

    public void o1() {
        this.f31826J0.clear();
    }

    @Override // r0.C3242e
    public void q0() {
        this.f31826J0.clear();
        super.q0();
    }

    @Override // r0.C3242e
    public void t0(o0.c cVar) {
        super.t0(cVar);
        int size = this.f31826J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C3242e) this.f31826J0.get(i10)).t0(cVar);
        }
    }
}
