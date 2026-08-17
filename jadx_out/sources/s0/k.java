package s0;

import java.util.Iterator;
import r0.C3238a;
import r0.C3242e;
import s0.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class k extends p {
    public k(C3242e c3242e) {
        super(c3242e);
    }

    private void q(f fVar) {
        this.f32174h.f32124k.add(fVar);
        fVar.f32125l.add(this.f32174h);
    }

    @Override // s0.p, s0.InterfaceC3315d
    public void a(InterfaceC3315d interfaceC3315d) {
        C3238a c3238a = (C3238a) this.f32168b;
        int iP1 = c3238a.p1();
        Iterator it = this.f32174h.f32125l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f32120g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iP1 == 0 || iP1 == 2) {
            this.f32174h.d(i11 + c3238a.q1());
        } else {
            this.f32174h.d(i10 + c3238a.q1());
        }
    }

    @Override // s0.p
    void d() {
        C3242e c3242e = this.f32168b;
        if (c3242e instanceof C3238a) {
            this.f32174h.f32115b = true;
            C3238a c3238a = (C3238a) c3242e;
            int iP1 = c3238a.p1();
            boolean zO1 = c3238a.o1();
            int i10 = 0;
            if (iP1 == 0) {
                this.f32174h.f32118e = f.a.LEFT;
                while (i10 < c3238a.f31811K0) {
                    C3242e c3242e2 = c3238a.f31810J0[i10];
                    if (zO1 || c3242e2.S() != 8) {
                        f fVar = c3242e2.f31678e.f32174h;
                        fVar.f32124k.add(this.f32174h);
                        this.f32174h.f32125l.add(fVar);
                    }
                    i10++;
                }
                q(this.f32168b.f31678e.f32174h);
                q(this.f32168b.f31678e.f32175i);
                return;
            }
            if (iP1 == 1) {
                this.f32174h.f32118e = f.a.RIGHT;
                while (i10 < c3238a.f31811K0) {
                    C3242e c3242e3 = c3238a.f31810J0[i10];
                    if (zO1 || c3242e3.S() != 8) {
                        f fVar2 = c3242e3.f31678e.f32175i;
                        fVar2.f32124k.add(this.f32174h);
                        this.f32174h.f32125l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f32168b.f31678e.f32174h);
                q(this.f32168b.f31678e.f32175i);
                return;
            }
            if (iP1 == 2) {
                this.f32174h.f32118e = f.a.TOP;
                while (i10 < c3238a.f31811K0) {
                    C3242e c3242e4 = c3238a.f31810J0[i10];
                    if (zO1 || c3242e4.S() != 8) {
                        f fVar3 = c3242e4.f31680f.f32174h;
                        fVar3.f32124k.add(this.f32174h);
                        this.f32174h.f32125l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f32168b.f31680f.f32174h);
                q(this.f32168b.f31680f.f32175i);
                return;
            }
            if (iP1 != 3) {
                return;
            }
            this.f32174h.f32118e = f.a.BOTTOM;
            while (i10 < c3238a.f31811K0) {
                C3242e c3242e5 = c3238a.f31810J0[i10];
                if (zO1 || c3242e5.S() != 8) {
                    f fVar4 = c3242e5.f31680f.f32175i;
                    fVar4.f32124k.add(this.f32174h);
                    this.f32174h.f32125l.add(fVar4);
                }
                i10++;
            }
            q(this.f32168b.f31680f.f32174h);
            q(this.f32168b.f31680f.f32175i);
        }
    }

    @Override // s0.p
    public void e() {
        C3242e c3242e = this.f32168b;
        if (c3242e instanceof C3238a) {
            int iP1 = ((C3238a) c3242e).p1();
            if (iP1 == 0 || iP1 == 1) {
                this.f32168b.g1(this.f32174h.f32120g);
            } else {
                this.f32168b.h1(this.f32174h.f32120g);
            }
        }
    }

    @Override // s0.p
    void f() {
        this.f32169c = null;
        this.f32174h.c();
    }

    @Override // s0.p
    boolean m() {
        return false;
    }
}
