package F7;

import A8.InterfaceC0398s;
import A8.InterfaceC0399t;
import F7.a1;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import d8.C2370r;
import d8.InterfaceC2376x;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class W0 implements C7.p, Y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f1990j = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(W0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L7.m0 f1991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a1.a f1992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final X0 f1993i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1994a;

        static {
            int[] iArr = new int[C8.N0.values().length];
            try {
                iArr[C8.N0.f592k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8.N0.f593l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8.N0.f594m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1994a = iArr;
        }
    }

    public W0(X0 x02, L7.m0 descriptor) {
        X xD;
        Object objE0;
        AbstractC2855l.g(descriptor, "descriptor");
        this.f1991g = descriptor;
        this.f1992h = a1.c(new V0(this));
        if (x02 == null) {
            InterfaceC1288m interfaceC1288mB = e().b();
            AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
            if (interfaceC1288mB instanceof InterfaceC1280e) {
                objE0 = d((InterfaceC1280e) interfaceC1288mB);
            } else {
                if (!(interfaceC1288mB instanceof InterfaceC1277b)) {
                    throw new Y0("Unknown type parameter container: " + interfaceC1288mB);
                }
                InterfaceC1288m interfaceC1288mB2 = ((InterfaceC1277b) interfaceC1288mB).b();
                AbstractC2855l.f(interfaceC1288mB2, "getContainingDeclaration(...)");
                if (interfaceC1288mB2 instanceof InterfaceC1280e) {
                    xD = d((InterfaceC1280e) interfaceC1288mB2);
                } else {
                    InterfaceC0399t interfaceC0399t = interfaceC1288mB instanceof InterfaceC0399t ? (InterfaceC0399t) interfaceC1288mB : null;
                    if (interfaceC0399t == null) {
                        throw new Y0("Non-class callable descriptor must be deserialized: " + interfaceC1288mB);
                    }
                    C7.d dVarE = AbstractC3430a.e(b(interfaceC0399t));
                    AbstractC2855l.e(dVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    xD = (X) dVarE;
                }
                objE0 = interfaceC1288mB.E0(new C0540j(xD), C2735B.f28704a);
            }
            x02 = (X0) objE0;
        }
        this.f1993i = x02;
    }

    private final Class b(InterfaceC0399t interfaceC0399t) {
        Class clsE;
        InterfaceC0398s interfaceC0398sY = interfaceC0399t.Y();
        C2370r c2370r = interfaceC0398sY instanceof C2370r ? (C2370r) interfaceC0398sY : null;
        InterfaceC2376x interfaceC2376xG = c2370r != null ? c2370r.g() : null;
        Q7.f fVar = interfaceC2376xG instanceof Q7.f ? (Q7.f) interfaceC2376xG : null;
        if (fVar != null && (clsE = fVar.e()) != null) {
            return clsE;
        }
        throw new Y0("Container of deserialized member is not resolved: " + interfaceC0399t);
    }

    private final X d(InterfaceC1280e interfaceC1280e) {
        Class clsQ = j1.q(interfaceC1280e);
        X x10 = (X) (clsQ != null ? AbstractC3430a.e(clsQ) : null);
        if (x10 != null) {
            return x10;
        }
        throw new Y0("Type parameter container is not resolved: " + interfaceC1280e.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(W0 w02) {
        List upperBounds = w02.e().getUpperBounds();
        AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new U0((C8.S) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // F7.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public L7.m0 e() {
        return this.f1991g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        return AbstractC2855l.b(this.f1993i, w02.f1993i) && AbstractC2855l.b(getName(), w02.getName());
    }

    @Override // C7.p
    public String getName() {
        String strJ = e().getName().j();
        AbstractC2855l.f(strJ, "asString(...)");
        return strJ;
    }

    @Override // C7.p
    public List getUpperBounds() {
        Object objC = this.f1992h.c(this, f1990j[0]);
        AbstractC2855l.f(objC, "getValue(...)");
        return (List) objC;
    }

    public int hashCode() {
        return (this.f1993i.hashCode() * 31) + getName().hashCode();
    }

    @Override // C7.p
    public C7.r m() {
        int i10 = a.f1994a[e().m().ordinal()];
        if (i10 == 1) {
            return C7.r.f523g;
        }
        if (i10 == 2) {
            return C7.r.f524h;
        }
        if (i10 == 3) {
            return C7.r.f525i;
        }
        throw new C2750m();
    }

    public String toString() {
        return kotlin.jvm.internal.J.f29376g.a(this);
    }
}
