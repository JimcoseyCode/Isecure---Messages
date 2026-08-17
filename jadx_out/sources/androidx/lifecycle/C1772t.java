package androidx.lifecycle;

import androidx.lifecycle.AbstractC1764k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.C2891a;
import m.b;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1772t extends AbstractC1764k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f17604k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2891a f17606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC1764k.b f17607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f17608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f17612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final U8.l f17613j;

    /* JADX INFO: renamed from: androidx.lifecycle.t$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1764k.b a(AbstractC1764k.b state1, AbstractC1764k.b bVar) {
            AbstractC2855l.g(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC1764k.b f17614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1768o f17615b;

        public b(InterfaceC1770q interfaceC1770q, AbstractC1764k.b initialState) {
            AbstractC2855l.g(initialState, "initialState");
            AbstractC2855l.d(interfaceC1770q);
            this.f17615b = C1775w.f(interfaceC1770q);
            this.f17614a = initialState;
        }

        public final void a(r rVar, AbstractC1764k.a event) {
            AbstractC2855l.g(event, "event");
            AbstractC1764k.b bVarK = event.k();
            this.f17614a = C1772t.f17604k.a(this.f17614a, bVarK);
            InterfaceC1768o interfaceC1768o = this.f17615b;
            AbstractC2855l.d(rVar);
            interfaceC1768o.k(rVar, event);
            this.f17614a = bVarK;
        }

        public final AbstractC1764k.b b() {
            return this.f17614a;
        }
    }

    private C1772t(r rVar, boolean z10) {
        this.f17605b = z10;
        this.f17606c = new C2891a();
        AbstractC1764k.b bVar = AbstractC1764k.b.f17591h;
        this.f17607d = bVar;
        this.f17612i = new ArrayList();
        this.f17608e = new WeakReference(rVar);
        this.f17613j = U8.r.a(bVar);
    }

    private final void e(r rVar) {
        Iterator itDescendingIterator = this.f17606c.descendingIterator();
        AbstractC2855l.f(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.f17611h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            AbstractC2855l.d(entry);
            InterfaceC1770q interfaceC1770q = (InterfaceC1770q) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f17607d) > 0 && !this.f17611h && this.f17606c.contains(interfaceC1770q)) {
                AbstractC1764k.a aVarA = AbstractC1764k.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(aVarA.k());
                bVar.a(rVar, aVarA);
                l();
            }
        }
    }

    private final AbstractC1764k.b f(InterfaceC1770q interfaceC1770q) {
        b bVar;
        Map.Entry entryU = this.f17606c.u(interfaceC1770q);
        AbstractC1764k.b bVar2 = null;
        AbstractC1764k.b bVarB = (entryU == null || (bVar = (b) entryU.getValue()) == null) ? null : bVar.b();
        if (!this.f17612i.isEmpty()) {
            bVar2 = (AbstractC1764k.b) this.f17612i.get(r0.size() - 1);
        }
        a aVar = f17604k;
        return aVar.a(aVar.a(this.f17607d, bVarB), bVar2);
    }

    private final void g(String str) {
        if (!this.f17605b || AbstractC1774v.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(r rVar) {
        b.d dVarP = this.f17606c.p();
        AbstractC2855l.f(dVarP, "iteratorWithAdditions(...)");
        while (dVarP.hasNext() && !this.f17611h) {
            Map.Entry entry = (Map.Entry) dVarP.next();
            InterfaceC1770q interfaceC1770q = (InterfaceC1770q) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f17607d) < 0 && !this.f17611h && this.f17606c.contains(interfaceC1770q)) {
                m(bVar.b());
                AbstractC1764k.a aVarB = AbstractC1764k.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(rVar, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.f17606c.size() == 0) {
            return true;
        }
        Map.Entry entryD = this.f17606c.d();
        AbstractC2855l.d(entryD);
        AbstractC1764k.b bVarB = ((b) entryD.getValue()).b();
        Map.Entry entryQ = this.f17606c.q();
        AbstractC2855l.d(entryQ);
        AbstractC1764k.b bVarB2 = ((b) entryQ.getValue()).b();
        return bVarB == bVarB2 && this.f17607d == bVarB2;
    }

    private final void k(AbstractC1764k.b bVar) {
        if (this.f17607d == bVar) {
            return;
        }
        AbstractC1773u.a((r) this.f17608e.get(), this.f17607d, bVar);
        this.f17607d = bVar;
        if (this.f17610g || this.f17609f != 0) {
            this.f17611h = true;
            return;
        }
        this.f17610g = true;
        o();
        this.f17610g = false;
        if (this.f17607d == AbstractC1764k.b.f17590g) {
            this.f17606c = new C2891a();
        }
    }

    private final void l() {
        this.f17612i.remove(r0.size() - 1);
    }

    private final void m(AbstractC1764k.b bVar) {
        this.f17612i.add(bVar);
    }

    private final void o() {
        r rVar = (r) this.f17608e.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f17611h = false;
            AbstractC1764k.b bVar = this.f17607d;
            Map.Entry entryD = this.f17606c.d();
            AbstractC2855l.d(entryD);
            if (bVar.compareTo(((b) entryD.getValue()).b()) < 0) {
                e(rVar);
            }
            Map.Entry entryQ = this.f17606c.q();
            if (!this.f17611h && entryQ != null && this.f17607d.compareTo(((b) entryQ.getValue()).b()) > 0) {
                h(rVar);
            }
        }
        this.f17611h = false;
        this.f17613j.setValue(b());
    }

    @Override // androidx.lifecycle.AbstractC1764k
    public void a(InterfaceC1770q observer) {
        r rVar;
        AbstractC2855l.g(observer, "observer");
        g("addObserver");
        AbstractC1764k.b bVar = this.f17607d;
        AbstractC1764k.b bVar2 = AbstractC1764k.b.f17590g;
        if (bVar != bVar2) {
            bVar2 = AbstractC1764k.b.f17591h;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f17606c.s(observer, bVar3)) == null && (rVar = (r) this.f17608e.get()) != null) {
            boolean z10 = this.f17609f != 0 || this.f17610g;
            AbstractC1764k.b bVarF = f(observer);
            this.f17609f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.f17606c.contains(observer)) {
                m(bVar3.b());
                AbstractC1764k.a aVarB = AbstractC1764k.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(rVar, aVarB);
                l();
                bVarF = f(observer);
            }
            if (!z10) {
                o();
            }
            this.f17609f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1764k
    public AbstractC1764k.b b() {
        return this.f17607d;
    }

    @Override // androidx.lifecycle.AbstractC1764k
    public void d(InterfaceC1770q observer) {
        AbstractC2855l.g(observer, "observer");
        g("removeObserver");
        this.f17606c.t(observer);
    }

    public void i(AbstractC1764k.a event) {
        AbstractC2855l.g(event, "event");
        g("handleLifecycleEvent");
        k(event.k());
    }

    public void n(AbstractC1764k.b state) {
        AbstractC2855l.g(state, "state");
        g("setCurrentState");
        k(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1772t(r provider) {
        this(provider, true);
        AbstractC2855l.g(provider, "provider");
    }
}
