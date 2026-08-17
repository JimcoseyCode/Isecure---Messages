package m2;

import a2.C1592a;
import c2.k;
import c2.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29571b;

    private h(List list, boolean z10) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f29570a = list;
        this.f29571b = z10;
    }

    public static h c(List list, boolean z10) {
        return new h(list, z10);
    }

    @Override // c2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return c2.i.a(this.f29570a, ((h) obj).f29570a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29570a.hashCode();
    }

    public String toString() {
        return c2.i.b(this).b("list", this.f29570a).toString();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC2894a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ArrayList f29572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f29574j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AtomicInteger f29575k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Throwable f29576l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map f29577m;

        public a() {
            if (h.this.f29571b) {
                return;
            }
            y();
        }

        private synchronized c A(int i10) {
            ArrayList arrayList;
            arrayList = this.f29572h;
            return (arrayList == null || i10 >= arrayList.size()) ? null : (c) this.f29572h.get(i10);
        }

        private synchronized c B() {
            return A(this.f29573i);
        }

        private void C() {
            Throwable th;
            if (this.f29575k.incrementAndGet() != this.f29574j || (th = this.f29576l) == null) {
                return;
            }
            o(th, this.f29577m);
        }

        private void D(int i10, c cVar, boolean z10) {
            synchronized (this) {
                try {
                    int i11 = this.f29573i;
                    if (cVar == A(i10) && i10 != this.f29573i) {
                        if (B() == null || (z10 && i10 < this.f29573i)) {
                            this.f29573i = i10;
                        } else {
                            i10 = i11;
                        }
                        while (i11 > i10) {
                            x(z(i11));
                            i11--;
                        }
                    }
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(int i10, c cVar) {
            x(G(i10, cVar));
            if (i10 == 0) {
                this.f29576l = cVar.b();
                this.f29577m = cVar.getExtras();
            }
            C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(int i10, c cVar) {
            D(i10, cVar, cVar.isFinished());
            if (cVar == B()) {
                s(null, i10 == 0 && cVar.isFinished(), cVar.getExtras());
            }
            C();
        }

        private synchronized c G(int i10, c cVar) {
            if (cVar == B()) {
                return null;
            }
            if (cVar != A(i10)) {
                return cVar;
            }
            return z(i10);
        }

        private void x(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private void y() {
            if (this.f29575k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f29575k == null) {
                        this.f29575k = new AtomicInteger(0);
                        int size = h.this.f29570a.size();
                        this.f29574j = size;
                        this.f29573i = size;
                        this.f29572h = new ArrayList(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            c cVar = (c) ((n) h.this.f29570a.get(i10)).get();
                            this.f29572h.add(cVar);
                            cVar.c(new C0316a(i10), C1592a.d());
                            if (!cVar.a()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        private synchronized c z(int i10) {
            c cVar;
            ArrayList arrayList = this.f29572h;
            cVar = null;
            if (arrayList != null && i10 < arrayList.size()) {
                cVar = (c) this.f29572h.set(i10, null);
            }
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
        @Override // m2.AbstractC2894a, m2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public synchronized boolean a() {
            boolean z10;
            try {
                if (h.this.f29571b) {
                    y();
                }
                c cVarB = B();
                if (cVarB != null) {
                    z10 = cVarB.a();
                }
            } catch (Throwable th) {
                throw th;
            }
            return z10;
        }

        @Override // m2.AbstractC2894a, m2.c
        public boolean close() {
            if (h.this.f29571b) {
                y();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.f29572h;
                    this.f29572h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        x((c) arrayList.get(i10));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // m2.AbstractC2894a, m2.c
        public synchronized Object getResult() {
            c cVarB;
            try {
                if (h.this.f29571b) {
                    y();
                }
                cVarB = B();
            } catch (Throwable th) {
                throw th;
            }
            return cVarB != null ? cVarB.getResult() : null;
        }

        /* JADX INFO: renamed from: m2.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private class C0316a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f29579a;

            public C0316a(int i10) {
                this.f29579a = i10;
            }

            @Override // m2.e
            public void onFailure(c cVar) {
                a.this.E(this.f29579a, cVar);
            }

            @Override // m2.e
            public void onNewResult(c cVar) {
                if (cVar.a()) {
                    a.this.F(this.f29579a, cVar);
                } else if (cVar.isFinished()) {
                    a.this.E(this.f29579a, cVar);
                }
            }

            @Override // m2.e
            public void onProgressUpdate(c cVar) {
                if (this.f29579a == 0) {
                    a.this.q(cVar.d());
                }
            }

            @Override // m2.e
            public void onCancellation(c cVar) {
            }
        }
    }
}
