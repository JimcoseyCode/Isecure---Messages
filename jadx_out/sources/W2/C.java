package W2;

import d2.AbstractC2325a;
import g2.AbstractC2662a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f11956b = C.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f11957a = new HashMap();

    private C() {
    }

    public static C d() {
        return new C();
    }

    private synchronized void e() {
        AbstractC2325a.y(f11956b, "Count = %d", Integer.valueOf(this.f11957a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f11957a.values());
            this.f11957a.clear();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d3.k kVar = (d3.k) arrayList.get(i10);
            if (kVar != null) {
                kVar.close();
            }
        }
    }

    public synchronized boolean b(W1.d dVar) {
        c2.k.g(dVar);
        if (!this.f11957a.containsKey(dVar)) {
            return false;
        }
        d3.k kVar = (d3.k) this.f11957a.get(dVar);
        synchronized (kVar) {
            if (d3.k.u0(kVar)) {
                return true;
            }
            this.f11957a.remove(dVar);
            AbstractC2325a.G(f11956b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVar)), dVar.c(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    public synchronized d3.k c(W1.d dVar) {
        c2.k.g(dVar);
        d3.k kVarE = (d3.k) this.f11957a.get(dVar);
        if (kVarE != null) {
            synchronized (kVarE) {
                if (!d3.k.u0(kVarE)) {
                    this.f11957a.remove(dVar);
                    AbstractC2325a.G(f11956b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVarE)), dVar.c(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                kVarE = d3.k.e(kVarE);
            }
        }
        return kVarE;
    }

    public synchronized void f(W1.d dVar, d3.k kVar) {
        c2.k.g(dVar);
        c2.k.b(Boolean.valueOf(d3.k.u0(kVar)));
        d3.k.k((d3.k) this.f11957a.put(dVar, d3.k.e(kVar)));
        e();
    }

    public boolean g(W1.d dVar) {
        d3.k kVar;
        c2.k.g(dVar);
        synchronized (this) {
            kVar = (d3.k) this.f11957a.remove(dVar);
        }
        if (kVar == null) {
            return false;
        }
        try {
            return kVar.t0();
        } finally {
            kVar.close();
        }
    }

    public synchronized boolean h(W1.d dVar, d3.k kVar) {
        c2.k.g(dVar);
        c2.k.g(kVar);
        c2.k.b(Boolean.valueOf(d3.k.u0(kVar)));
        d3.k kVar2 = (d3.k) this.f11957a.get(dVar);
        if (kVar2 == null) {
            return false;
        }
        AbstractC2662a abstractC2662aR = kVar2.r();
        AbstractC2662a abstractC2662aR2 = kVar.r();
        if (abstractC2662aR != null && abstractC2662aR2 != null) {
            try {
                if (abstractC2662aR.J() == abstractC2662aR2.J()) {
                    this.f11957a.remove(dVar);
                    AbstractC2662a.B(abstractC2662aR2);
                    AbstractC2662a.B(abstractC2662aR);
                    d3.k.k(kVar2);
                    e();
                    return true;
                }
            } finally {
                AbstractC2662a.B(abstractC2662aR2);
                AbstractC2662a.B(abstractC2662aR);
                d3.k.k(kVar2);
            }
        }
        return false;
    }
}
