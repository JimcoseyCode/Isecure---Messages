package R8;

import i7.C2735B;
import i7.C2752o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: R8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1405e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10178b = AtomicIntegerFieldUpdater.newUpdater(C1405e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V[] f10179a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: R8.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a extends F0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f10180n = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final InterfaceC1421m f10181k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public InterfaceC1408f0 f10182l;

        public a(InterfaceC1421m interfaceC1421m) {
            this.f10181k = interfaceC1421m;
        }

        public final void B(b bVar) {
            f10180n.set(this, bVar);
        }

        public final void C(InterfaceC1408f0 interfaceC1408f0) {
            this.f10182l = interfaceC1408f0;
        }

        @Override // R8.F0
        public boolean v() {
            return false;
        }

        @Override // R8.F0
        public void w(Throwable th) {
            if (th != null) {
                Object objJ = this.f10181k.j(th);
                if (objJ != null) {
                    this.f10181k.q(objJ);
                    b bVarY = y();
                    if (bVarY != null) {
                        bVarY.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C1405e.d().decrementAndGet(C1405e.this) == 0) {
                InterfaceC1421m interfaceC1421m = this.f10181k;
                V[] vArr = C1405e.this.f10179a;
                ArrayList arrayList = new ArrayList(vArr.length);
                for (V v10 : vArr) {
                    arrayList.add(v10.r());
                }
                interfaceC1421m.resumeWith(C2752o.b(arrayList));
            }
        }

        public final b y() {
            return (b) f10180n.get(this);
        }

        public final InterfaceC1408f0 z() {
            InterfaceC1408f0 interfaceC1408f0 = this.f10182l;
            if (interfaceC1408f0 != null) {
                return interfaceC1408f0;
            }
            AbstractC2855l.y("handle");
            return null;
        }
    }

    /* JADX INFO: renamed from: R8.e$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class b implements InterfaceC1419l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a[] f10184a;

        public b(a[] aVarArr) {
            this.f10184a = aVarArr;
        }

        @Override // R8.InterfaceC1419l
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f10184a) {
                aVar.z().dispose();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f10184a + ']';
        }
    }

    public C1405e(V[] vArr) {
        this.f10179a = vArr;
        this.notCompletedCount$volatile = vArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f10178b;
    }

    public final Object c(n7.f fVar) {
        C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        int length = this.f10179a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            V v10 = this.f10179a[i10];
            v10.start();
            a aVar = new a(c1425o);
            aVar.C(E0.j(v10, false, aVar, 1, null));
            C2735B c2735b = C2735B.f28704a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].B(bVar);
        }
        if (c1425o.isCompleted()) {
            bVar.b();
        } else {
            AbstractC1429q.c(c1425o, bVar);
        }
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ;
    }
}
