package F;

import F.C1;
import F.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f1287b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        boolean a(b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k1 f1288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final D1 f1289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o1 f1290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f1291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1292e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1293f = false;

        b(k1 k1Var, D1 d12, o1 o1Var, List list) {
            this.f1288a = k1Var;
            this.f1289b = d12;
            this.f1290c = o1Var;
            this.f1291d = list;
        }

        boolean a() {
            return this.f1293f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.f1292e;
        }

        public List c() {
            return this.f1291d;
        }

        public k1 d() {
            return this.f1288a;
        }

        public o1 e() {
            return this.f1290c;
        }

        public D1 f() {
            return this.f1289b;
        }

        void g(boolean z10) {
            this.f1293f = z10;
        }

        void h(boolean z10) {
            this.f1292e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f1288a + ", mUseCaseConfig=" + this.f1289b + ", mStreamSpec=" + this.f1290c + ", mCaptureTypes=" + this.f1291d + ", mAttached=" + this.f1292e + ", mActive=" + this.f1293f + '}';
        }
    }

    public C1(String str) {
        this.f1286a = str;
    }

    public static /* synthetic */ boolean a(b bVar) {
        return bVar.a() && bVar.b();
    }

    private b k(String str, k1 k1Var, D1 d12, o1 o1Var, List list) {
        b bVar = (b) this.f1287b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(k1Var, d12, o1Var, list);
        this.f1287b.put(str, bVar2);
        return bVar2;
    }

    private Collection l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1287b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).d());
            }
        }
        return arrayList;
    }

    private Collection m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1287b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).f());
            }
        }
        return arrayList;
    }

    private Collection n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1287b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add((b) entry.getValue());
            }
        }
        return arrayList;
    }

    public k1.h e() {
        k1.h hVar = new k1.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1287b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.a() && bVar.b()) {
                String str = (String) entry.getKey();
                hVar.b(bVar.d());
                arrayList.add(str);
            }
        }
        AbstractC3583h0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f1286a);
        return hVar;
    }

    public Collection f() {
        return Collections.unmodifiableCollection(l(new a() { // from class: F.A1
            @Override // F.C1.a
            public final boolean a(C1.b bVar) {
                return C1.a(bVar);
            }
        }));
    }

    public k1.h g() {
        k1.h hVar = new k1.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1287b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.b()) {
                hVar.b(bVar.d());
                arrayList.add((String) entry.getKey());
            }
        }
        AbstractC3583h0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f1286a);
        return hVar;
    }

    public Collection h() {
        return Collections.unmodifiableCollection(l(new a() { // from class: F.y1
            @Override // F.C1.a
            public final boolean a(C1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection i() {
        return Collections.unmodifiableCollection(m(new a() { // from class: F.z1
            @Override // F.C1.a
            public final boolean a(C1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection j() {
        return Collections.unmodifiableCollection(n(new a() { // from class: F.B1
            @Override // F.C1.a
            public final boolean a(C1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public boolean o(String str) {
        if (this.f1287b.containsKey(str)) {
            return ((b) this.f1287b.get(str)).b();
        }
        return false;
    }

    public void p(String str) {
        this.f1287b.remove(str);
    }

    public void q(String str, k1 k1Var, D1 d12, o1 o1Var, List list) {
        k(str, k1Var, d12, o1Var, list).g(true);
    }

    public void r(String str, k1 k1Var, D1 d12, o1 o1Var, List list) {
        k(str, k1Var, d12, o1Var, list).h(true);
        u(str, k1Var, d12, o1Var, list);
    }

    public void s(String str) {
        if (this.f1287b.containsKey(str)) {
            b bVar = (b) this.f1287b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.f1287b.remove(str);
        }
    }

    public void t(String str) {
        if (this.f1287b.containsKey(str)) {
            b bVar = (b) this.f1287b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.f1287b.remove(str);
        }
    }

    public void u(String str, k1 k1Var, D1 d12, o1 o1Var, List list) {
        if (this.f1287b.containsKey(str)) {
            b bVar = new b(k1Var, d12, o1Var, list);
            b bVar2 = (b) this.f1287b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f1287b.put(str, bVar);
        }
    }
}
