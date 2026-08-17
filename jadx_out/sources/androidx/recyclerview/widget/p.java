package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m0.i f18200a = new m0.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m0.f f18201b = new m0.f();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static H0.e f18202d = new Pools$SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.m.b f18204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.m.b f18205c;

        private a() {
        }

        static void a() {
            while (f18202d.acquire() != null) {
            }
        }

        static a b() {
            a aVar = (a) f18202d.acquire();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f18203a = 0;
            aVar.f18204b = null;
            aVar.f18205c = null;
            f18202d.release(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b {
        void a(RecyclerView.E e10);

        void b(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void c(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void d(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);
    }

    p() {
    }

    private RecyclerView.m.b l(RecyclerView.E e10, int i10) {
        a aVar;
        RecyclerView.m.b bVar;
        int iD = this.f18200a.d(e10);
        if (iD >= 0 && (aVar = (a) this.f18200a.j(iD)) != null) {
            int i11 = aVar.f18203a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f18203a = i12;
                if (i10 == 4) {
                    bVar = aVar.f18204b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f18205c;
                }
                if ((i12 & 12) == 0) {
                    this.f18200a.h(iD);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.E e10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f18200a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f18200a.put(e10, aVarB);
        }
        aVarB.f18203a |= 2;
        aVarB.f18204b = bVar;
    }

    void b(RecyclerView.E e10) {
        a aVarB = (a) this.f18200a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f18200a.put(e10, aVarB);
        }
        aVarB.f18203a |= 1;
    }

    void c(long j10, RecyclerView.E e10) {
        this.f18201b.g(j10, e10);
    }

    void d(RecyclerView.E e10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f18200a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f18200a.put(e10, aVarB);
        }
        aVarB.f18205c = bVar;
        aVarB.f18203a |= 8;
    }

    void e(RecyclerView.E e10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f18200a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f18200a.put(e10, aVarB);
        }
        aVarB.f18204b = bVar;
        aVarB.f18203a |= 4;
    }

    void f() {
        this.f18200a.clear();
        this.f18201b.a();
    }

    RecyclerView.E g(long j10) {
        return (RecyclerView.E) this.f18201b.c(j10);
    }

    boolean h(RecyclerView.E e10) {
        a aVar = (a) this.f18200a.get(e10);
        return (aVar == null || (aVar.f18203a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.E e10) {
        a aVar = (a) this.f18200a.get(e10);
        return (aVar == null || (aVar.f18203a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.E e10) {
        p(e10);
    }

    RecyclerView.m.b m(RecyclerView.E e10) {
        return l(e10, 8);
    }

    RecyclerView.m.b n(RecyclerView.E e10) {
        return l(e10, 4);
    }

    void o(b bVar) {
        for (int size = this.f18200a.size() - 1; size >= 0; size--) {
            RecyclerView.E e10 = (RecyclerView.E) this.f18200a.f(size);
            a aVar = (a) this.f18200a.h(size);
            int i10 = aVar.f18203a;
            if ((i10 & 3) == 3) {
                bVar.a(e10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.b bVar2 = aVar.f18204b;
                if (bVar2 == null) {
                    bVar.a(e10);
                } else {
                    bVar.c(e10, bVar2, aVar.f18205c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.b(e10, aVar.f18204b, aVar.f18205c);
            } else if ((i10 & 12) == 12) {
                bVar.d(e10, aVar.f18204b, aVar.f18205c);
            } else if ((i10 & 4) != 0) {
                bVar.c(e10, aVar.f18204b, null);
            } else if ((i10 & 8) != 0) {
                bVar.b(e10, aVar.f18204b, aVar.f18205c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.E e10) {
        a aVar = (a) this.f18200a.get(e10);
        if (aVar == null) {
            return;
        }
        aVar.f18203a &= -2;
    }

    void q(RecyclerView.E e10) {
        int iJ = this.f18201b.j() - 1;
        while (true) {
            if (iJ < 0) {
                break;
            }
            if (e10 == this.f18201b.k(iJ)) {
                this.f18201b.i(iJ);
                break;
            }
            iJ--;
        }
        a aVar = (a) this.f18200a.remove(e10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
