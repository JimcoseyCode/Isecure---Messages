package s0;

import r0.C3242e;
import r0.C3245h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class j extends p {
    public j(C3242e c3242e) {
        super(c3242e);
        c3242e.f31678e.f();
        c3242e.f31680f.f();
        this.f32172f = ((C3245h) c3242e).m1();
    }

    private void q(f fVar) {
        this.f32174h.f32124k.add(fVar);
        fVar.f32125l.add(this.f32174h);
    }

    @Override // s0.p, s0.InterfaceC3315d
    public void a(InterfaceC3315d interfaceC3315d) {
        f fVar = this.f32174h;
        if (fVar.f32116c && !fVar.f32123j) {
            this.f32174h.d((int) ((((f) fVar.f32125l.get(0)).f32120g * ((C3245h) this.f32168b).p1()) + 0.5f));
        }
    }

    @Override // s0.p
    void d() {
        C3245h c3245h = (C3245h) this.f32168b;
        int iN1 = c3245h.n1();
        int iO1 = c3245h.o1();
        c3245h.p1();
        if (c3245h.m1() == 1) {
            if (iN1 != -1) {
                this.f32174h.f32125l.add(this.f32168b.f31669Z.f31678e.f32174h);
                this.f32168b.f31669Z.f31678e.f32174h.f32124k.add(this.f32174h);
                this.f32174h.f32119f = iN1;
            } else if (iO1 != -1) {
                this.f32174h.f32125l.add(this.f32168b.f31669Z.f31678e.f32175i);
                this.f32168b.f31669Z.f31678e.f32175i.f32124k.add(this.f32174h);
                this.f32174h.f32119f = -iO1;
            } else {
                f fVar = this.f32174h;
                fVar.f32115b = true;
                fVar.f32125l.add(this.f32168b.f31669Z.f31678e.f32175i);
                this.f32168b.f31669Z.f31678e.f32175i.f32124k.add(this.f32174h);
            }
            q(this.f32168b.f31678e.f32174h);
            q(this.f32168b.f31678e.f32175i);
            return;
        }
        if (iN1 != -1) {
            this.f32174h.f32125l.add(this.f32168b.f31669Z.f31680f.f32174h);
            this.f32168b.f31669Z.f31680f.f32174h.f32124k.add(this.f32174h);
            this.f32174h.f32119f = iN1;
        } else if (iO1 != -1) {
            this.f32174h.f32125l.add(this.f32168b.f31669Z.f31680f.f32175i);
            this.f32168b.f31669Z.f31680f.f32175i.f32124k.add(this.f32174h);
            this.f32174h.f32119f = -iO1;
        } else {
            f fVar2 = this.f32174h;
            fVar2.f32115b = true;
            fVar2.f32125l.add(this.f32168b.f31669Z.f31680f.f32175i);
            this.f32168b.f31669Z.f31680f.f32175i.f32124k.add(this.f32174h);
        }
        q(this.f32168b.f31680f.f32174h);
        q(this.f32168b.f31680f.f32175i);
    }

    @Override // s0.p
    public void e() {
        if (((C3245h) this.f32168b).m1() == 1) {
            this.f32168b.g1(this.f32174h.f32120g);
        } else {
            this.f32168b.h1(this.f32174h.f32120g);
        }
    }

    @Override // s0.p
    void f() {
        this.f32174h.c();
    }

    @Override // s0.p
    boolean m() {
        return false;
    }
}
