package m2;

import a2.C1592a;
import c2.k;
import c2.n;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29564a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC2894a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29565h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f29566i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f29567j = null;

        /* JADX INFO: renamed from: m2.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private class C0315a implements e {
            @Override // m2.e
            public void onFailure(c cVar) {
                a.this.C(cVar);
            }

            @Override // m2.e
            public void onNewResult(c cVar) {
                if (cVar.a()) {
                    a.this.D(cVar);
                } else if (cVar.isFinished()) {
                    a.this.C(cVar);
                }
            }

            @Override // m2.e
            public void onProgressUpdate(c cVar) {
                a.this.q(Math.max(a.this.d(), cVar.d()));
            }

            private C0315a() {
            }

            @Override // m2.e
            public void onCancellation(c cVar) {
            }
        }

        public a() {
            if (F()) {
                return;
            }
            n(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private synchronized n A() {
            if (i() || this.f29565h >= f.this.f29564a.size()) {
                return null;
            }
            List list = f.this.f29564a;
            int i10 = this.f29565h;
            this.f29565h = i10 + 1;
            return (n) list.get(i10);
        }

        private void B(c cVar, boolean z10) {
            c cVar2;
            synchronized (this) {
                if (cVar == this.f29566i && cVar != (cVar2 = this.f29567j)) {
                    if (cVar2 == null || z10) {
                        this.f29567j = cVar;
                    } else {
                        cVar2 = null;
                    }
                    y(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(c cVar) {
            if (x(cVar)) {
                if (cVar != z()) {
                    y(cVar);
                }
                if (F()) {
                    return;
                }
                o(cVar.b(), cVar.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(c cVar) {
            B(cVar, cVar.isFinished());
            if (cVar == z()) {
                s(null, cVar.isFinished(), cVar.getExtras());
            }
        }

        private synchronized boolean E(c cVar) {
            if (i()) {
                return false;
            }
            this.f29566i = cVar;
            return true;
        }

        private boolean F() {
            n nVarA = A();
            c cVar = nVarA != null ? (c) nVarA.get() : null;
            if (!E(cVar) || cVar == null) {
                y(cVar);
                return false;
            }
            cVar.c(new C0315a(), C1592a.d());
            return true;
        }

        private synchronized boolean x(c cVar) {
            if (!i() && cVar == this.f29566i) {
                this.f29566i = null;
                return true;
            }
            return false;
        }

        private void y(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c z() {
            return this.f29567j;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
        @Override // m2.AbstractC2894a, m2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public synchronized boolean a() {
            boolean z10;
            c cVarZ = z();
            if (cVarZ != null) {
                z10 = cVarZ.a();
            }
            return z10;
        }

        @Override // m2.AbstractC2894a, m2.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c cVar = this.f29566i;
                    this.f29566i = null;
                    c cVar2 = this.f29567j;
                    this.f29567j = null;
                    y(cVar2);
                    y(cVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // m2.AbstractC2894a, m2.c
        public synchronized Object getResult() {
            c cVarZ;
            cVarZ = z();
            return cVarZ != null ? cVarZ.getResult() : null;
        }
    }

    private f(List list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f29564a = list;
    }

    public static f b(List list) {
        return new f(list);
    }

    @Override // c2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return c2.i.a(this.f29564a, ((f) obj).f29564a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29564a.hashCode();
    }

    public String toString() {
        return c2.i.b(this).b("list", this.f29564a).toString();
    }
}
