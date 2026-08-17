package T2;

import W2.n;
import android.net.Uri;
import c2.i;
import g2.AbstractC2662a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W1.d f10410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f10411b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f10413d = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.b f10412c = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements n.b {
        a() {
        }

        @Override // W2.n.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(W1.d dVar, boolean z10) {
            c.this.f(dVar, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements W1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final W1.d f10415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10416b;

        public b(W1.d dVar, int i10) {
            this.f10415a = dVar;
            this.f10416b = i10;
        }

        @Override // W1.d
        public boolean a(Uri uri) {
            return this.f10415a.a(uri);
        }

        @Override // W1.d
        public boolean b() {
            return false;
        }

        @Override // W1.d
        public String c() {
            return null;
        }

        @Override // W1.d
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f10416b == bVar.f10416b && this.f10415a.equals(bVar.f10415a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // W1.d
        public int hashCode() {
            return (this.f10415a.hashCode() * 1013) + this.f10416b;
        }

        public String toString() {
            return i.b(this).b("imageCacheKey", this.f10415a).a("frameIndex", this.f10416b).toString();
        }
    }

    public c(W1.d dVar, n nVar) {
        this.f10410a = dVar;
        this.f10411b = nVar;
    }

    private b e(int i10) {
        return new b(this.f10410a, i10);
    }

    private synchronized W1.d g() {
        W1.d dVar;
        Iterator it = this.f10413d.iterator();
        if (it.hasNext()) {
            dVar = (W1.d) it.next();
            it.remove();
        } else {
            dVar = null;
        }
        return dVar;
    }

    public AbstractC2662a a(int i10, AbstractC2662a abstractC2662a) {
        return this.f10411b.e(e(i10), abstractC2662a, this.f10412c);
    }

    public boolean b(int i10) {
        return this.f10411b.contains(e(i10));
    }

    public AbstractC2662a c(int i10) {
        return this.f10411b.get(e(i10));
    }

    public AbstractC2662a d() {
        AbstractC2662a abstractC2662aC;
        do {
            W1.d dVarG = g();
            if (dVarG == null) {
                return null;
            }
            abstractC2662aC = this.f10411b.c(dVarG);
        } while (abstractC2662aC == null);
        return abstractC2662aC;
    }

    public synchronized void f(W1.d dVar, boolean z10) {
        try {
            if (z10) {
                this.f10413d.add(dVar);
            } else {
                this.f10413d.remove(dVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
