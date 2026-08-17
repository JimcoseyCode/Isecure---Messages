package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H0.e f18040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f18041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f18042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0184a f18043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f18044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f18045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final h f18046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18047h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface InterfaceC0184a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.E e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f18050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18051d;

        b(int i10, int i11, int i12, Object obj) {
            this.f18048a = i10;
            this.f18049b = i11;
            this.f18051d = i12;
            this.f18050c = obj;
        }

        String a() {
            int i10 = this.f18048a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f18048a;
            if (i10 != bVar.f18048a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f18051d - this.f18049b) == 1 && this.f18051d == bVar.f18049b && this.f18049b == bVar.f18051d) {
                return true;
            }
            if (this.f18051d != bVar.f18051d || this.f18049b != bVar.f18049b) {
                return false;
            }
            Object obj2 = this.f18050c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f18050c)) {
                    return false;
                }
            } else if (bVar.f18050c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f18048a * 31) + this.f18049b) * 31) + this.f18051d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f18049b + "c:" + this.f18051d + ",p:" + this.f18050c + "]";
        }
    }

    a(InterfaceC0184a interfaceC0184a) {
        this(interfaceC0184a, false);
    }

    private void c(b bVar) {
        t(bVar);
    }

    private void d(b bVar) {
        t(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f18049b;
        int i11 = bVar.f18051d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f18043d.e(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    t(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f18051d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            t(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f18049b;
        int i11 = bVar.f18051d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f18043d.e(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(b(4, i13, i12, bVar.f18050c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    t(b(4, i13, i12, bVar.f18050c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f18051d) {
            Object obj = bVar.f18050c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            t(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f18042c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f18042c.get(i11);
            int i12 = bVar.f18048a;
            if (i12 == 8) {
                if (n(bVar.f18051d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f18049b;
                int i14 = bVar.f18051d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f18048a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iX = x(bVar.f18049b, i11);
        int i12 = bVar.f18049b;
        int i13 = bVar.f18048a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f18051d; i15++) {
            int iX2 = x(bVar.f18049b + (i10 * i15), bVar.f18048a);
            int i16 = bVar.f18048a;
            if (i16 == 2 ? iX2 != iX : !(i16 == 4 && iX2 == iX + 1)) {
                b bVarB = b(i16, iX, i14, bVar.f18050c);
                l(bVarB, i12);
                a(bVarB);
                if (bVar.f18048a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iX = iX2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f18050c;
        a(bVar);
        if (i14 > 0) {
            b bVarB2 = b(bVar.f18048a, iX, i14, obj);
            l(bVarB2, i12);
            a(bVarB2);
        }
    }

    private void t(b bVar) {
        this.f18042c.add(bVar);
        int i10 = bVar.f18048a;
        if (i10 == 1) {
            this.f18043d.g(bVar.f18049b, bVar.f18051d);
            return;
        }
        if (i10 == 2) {
            this.f18043d.f(bVar.f18049b, bVar.f18051d);
            return;
        }
        if (i10 == 4) {
            this.f18043d.c(bVar.f18049b, bVar.f18051d, bVar.f18050c);
        } else {
            if (i10 == 8) {
                this.f18043d.a(bVar.f18049b, bVar.f18051d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int x(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f18042c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f18042c.get(size);
            int i14 = bVar.f18048a;
            if (i14 == 8) {
                int i15 = bVar.f18049b;
                int i16 = bVar.f18051d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f18049b = i15 + 1;
                            bVar.f18051d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f18049b = i15 - 1;
                            bVar.f18051d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f18051d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f18051d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f18049b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f18049b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f18049b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f18051d;
                    } else if (i14 == 2) {
                        i10 += bVar.f18051d;
                    }
                } else if (i11 == 1) {
                    bVar.f18049b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f18049b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f18042c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f18042c.get(size2);
            if (bVar2.f18048a == 8) {
                int i18 = bVar2.f18051d;
                if (i18 == bVar2.f18049b || i18 < 0) {
                    this.f18042c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f18051d <= 0) {
                this.f18042c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f18045f) {
            return;
        }
        bVar.f18050c = null;
        this.f18040a.release(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f18040a.acquire();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f18048a = i10;
        bVar.f18049b = i11;
        bVar.f18051d = i12;
        bVar.f18050c = obj;
        return bVar;
    }

    public int e(int i10) {
        int size = this.f18041b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f18041b.get(i11);
            int i12 = bVar.f18048a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f18049b;
                    if (i13 <= i10) {
                        int i14 = bVar.f18051d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f18049b;
                    if (i15 == i10) {
                        i10 = bVar.f18051d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f18051d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f18049b <= i10) {
                i10 += bVar.f18051d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f18042c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18043d.d((b) this.f18042c.get(i10));
        }
        v(this.f18042c);
        this.f18047h = 0;
    }

    void j() {
        i();
        int size = this.f18041b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f18041b.get(i10);
            int i11 = bVar.f18048a;
            if (i11 == 1) {
                this.f18043d.d(bVar);
                this.f18043d.g(bVar.f18049b, bVar.f18051d);
            } else if (i11 == 2) {
                this.f18043d.d(bVar);
                this.f18043d.h(bVar.f18049b, bVar.f18051d);
            } else if (i11 == 4) {
                this.f18043d.d(bVar);
                this.f18043d.c(bVar.f18049b, bVar.f18051d, bVar.f18050c);
            } else if (i11 == 8) {
                this.f18043d.d(bVar);
                this.f18043d.a(bVar.f18049b, bVar.f18051d);
            }
            Runnable runnable = this.f18044e;
            if (runnable != null) {
                runnable.run();
            }
        }
        v(this.f18041b);
        this.f18047h = 0;
    }

    void l(b bVar, int i10) {
        this.f18043d.b(bVar);
        int i11 = bVar.f18048a;
        if (i11 == 2) {
            this.f18043d.h(i10, bVar.f18051d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f18043d.c(i10, bVar.f18051d, bVar.f18050c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f18042c.size();
        while (i11 < size) {
            b bVar = (b) this.f18042c.get(i11);
            int i12 = bVar.f18048a;
            if (i12 == 8) {
                int i13 = bVar.f18049b;
                if (i13 == i10) {
                    i10 = bVar.f18051d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f18051d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f18049b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f18051d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f18051d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f18047h) != 0;
    }

    boolean p() {
        return this.f18041b.size() > 0;
    }

    boolean q() {
        return (this.f18042c.isEmpty() || this.f18041b.isEmpty()) ? false : true;
    }

    boolean r(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f18041b.add(b(1, i10, i11, null));
        this.f18047h |= 1;
        return this.f18041b.size() == 1;
    }

    boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f18041b.add(b(2, i10, i11, null));
        this.f18047h |= 2;
        return this.f18041b.size() == 1;
    }

    void u() {
        this.f18046g.b(this.f18041b);
        int size = this.f18041b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f18041b.get(i10);
            int i11 = bVar.f18048a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f18044e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f18041b.clear();
    }

    void v(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((b) list.get(i10));
        }
        list.clear();
    }

    void w() {
        v(this.f18041b);
        v(this.f18042c);
        this.f18047h = 0;
    }

    a(InterfaceC0184a interfaceC0184a, boolean z10) {
        this.f18040a = new Pools$SimplePool(30);
        this.f18041b = new ArrayList();
        this.f18042c = new ArrayList();
        this.f18047h = 0;
        this.f18043d = interfaceC0184a;
        this.f18045f = z10;
        this.f18046g = new h(this);
    }
}
