package y1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f33889a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33890b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f33891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f33892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f33893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f33894d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f33892b == null) {
                this.f33892b = new ArrayList();
            }
            this.f33892b.add(obj);
        }

        public Object b() {
            int iC = c();
            if (iC > 0) {
                return this.f33892b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f33892b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f33894d = this;
            this.f33893c = this;
            this.f33891a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f33889a;
        aVar.f33894d = aVar2;
        aVar.f33893c = aVar2.f33893c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f33889a;
        aVar.f33894d = aVar2.f33894d;
        aVar.f33893c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f33894d;
        aVar2.f33893c = aVar.f33893c;
        aVar.f33893c.f33894d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f33893c.f33894d = aVar;
        aVar.f33894d.f33893c = aVar;
    }

    public Object a(m mVar) {
        a aVar = (a) this.f33890b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            this.f33890b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(m mVar, Object obj) {
        a aVar = (a) this.f33890b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            c(aVar);
            this.f33890b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f33889a.f33894d; !aVar.equals(this.f33889a); aVar = aVar.f33894d) {
            Object objB = aVar.b();
            if (objB != null) {
                return objB;
            }
            e(aVar);
            this.f33890b.remove(aVar.f33891a);
            ((m) aVar.f33891a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f33889a.f33893c;
        boolean z10 = false;
        while (!aVar.equals(this.f33889a)) {
            sb.append('{');
            sb.append(aVar.f33891a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.f33893c;
            z10 = true;
        }
        if (z10) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
