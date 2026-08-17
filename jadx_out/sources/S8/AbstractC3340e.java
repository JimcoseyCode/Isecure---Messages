package s8;

import C8.S;
import D8.g;
import D8.h;
import L7.A;
import L7.H;
import L7.I;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1284i;
import L7.InterfaceC1288m;
import L7.N;
import L7.Y;
import L7.Z;
import L7.r0;
import L7.t0;
import M8.b;
import O8.i;
import O8.l;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import k8.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import o8.AbstractC3027i;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: s8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3340e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f32330a;

    /* JADX INFO: renamed from: s8.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2852i implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f32331g = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return D.b(t0.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 p02) {
            AbstractC2855l.g(p02, "p0");
            return Boolean.valueOf(p02.q0());
        }
    }

    /* JADX INFO: renamed from: s8.e$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends b.AbstractC0071b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f32332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f32333b;

        b(C c10, Function1 function1) {
            this.f32332a = c10;
            this.f32333b = function1;
        }

        @Override // M8.b.AbstractC0071b, M8.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC1277b current) {
            AbstractC2855l.g(current, "current");
            if (this.f32332a.f29371g == null && ((Boolean) this.f32333b.invoke(current)).booleanValue()) {
                this.f32332a.f29371g = current;
            }
        }

        @Override // M8.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1277b current) {
            AbstractC2855l.g(current, "current");
            return this.f32332a.f29371g == null;
        }

        @Override // M8.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC1277b a() {
            return (InterfaceC1277b) this.f32332a.f29371g;
        }
    }

    static {
        f fVarQ = f.q("value");
        AbstractC2855l.f(fVarQ, "identifier(...)");
        f32330a = fVarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i A(boolean z10, InterfaceC1277b interfaceC1277b) {
        AbstractC2855l.d(interfaceC1277b);
        return z(interfaceC1277b, z10);
    }

    public static final InterfaceC1280e B(H h10, k8.c topLevelClassFqName, T7.b location) {
        AbstractC2855l.g(h10, "<this>");
        AbstractC2855l.g(topLevelClassFqName, "topLevelClassFqName");
        AbstractC2855l.g(location, "location");
        topLevelClassFqName.d();
        k8.c cVarE = topLevelClassFqName.e();
        AbstractC2855l.f(cVarE, "parent(...)");
        InterfaceC3442k interfaceC3442kO = h10.e0(cVarE).o();
        f fVarG = topLevelClassFqName.g();
        AbstractC2855l.f(fVarG, "shortName(...)");
        InterfaceC1283h interfaceC1283hF = interfaceC3442kO.f(fVarG, location);
        if (interfaceC1283hF instanceof InterfaceC1280e) {
            return (InterfaceC1280e) interfaceC1283hF;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1288m a(InterfaceC1288m it) {
        AbstractC2855l.g(it, "it");
        return it.b();
    }

    public static final boolean f(t0 t0Var) {
        AbstractC2855l.g(t0Var, "<this>");
        Boolean boolE = M8.b.e(AbstractC2800q.e(t0Var), C3336a.f32326a, a.f32331g);
        AbstractC2855l.f(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(t0 t0Var) {
        Collection collectionE = t0Var.e();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).a());
        }
        return arrayList;
    }

    public static final InterfaceC1277b h(InterfaceC1277b interfaceC1277b, boolean z10, Function1 predicate) {
        AbstractC2855l.g(interfaceC1277b, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return (InterfaceC1277b) M8.b.b(AbstractC2800q.e(interfaceC1277b), new C3338c(z10), new b(new C(), predicate));
    }

    public static /* synthetic */ InterfaceC1277b i(InterfaceC1277b interfaceC1277b, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(interfaceC1277b, z10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable j(boolean z10, InterfaceC1277b interfaceC1277b) {
        Collection collectionE;
        if (z10) {
            interfaceC1277b = interfaceC1277b != null ? interfaceC1277b.a() : null;
        }
        return (interfaceC1277b == null || (collectionE = interfaceC1277b.e()) == null) ? AbstractC2800q.j() : collectionE;
    }

    public static final k8.c k(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        k8.d dVarP = p(interfaceC1288m);
        if (!dVarP.f()) {
            dVarP = null;
        }
        if (dVarP != null) {
            return dVarP.l();
        }
        return null;
    }

    public static final InterfaceC1280e l(M7.c cVar) {
        AbstractC2855l.g(cVar, "<this>");
        InterfaceC1283h interfaceC1283hP = cVar.getType().K0().p();
        if (interfaceC1283hP instanceof InterfaceC1280e) {
            return (InterfaceC1280e) interfaceC1283hP;
        }
        return null;
    }

    public static final I7.i m(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        return s(interfaceC1288m).n();
    }

    public static final k8.b n(InterfaceC1283h interfaceC1283h) {
        InterfaceC1288m interfaceC1288mB;
        k8.b bVarN;
        if (interfaceC1283h != null && (interfaceC1288mB = interfaceC1283h.b()) != null) {
            if (interfaceC1288mB instanceof N) {
                k8.c cVarD = ((N) interfaceC1288mB).d();
                f name = interfaceC1283h.getName();
                AbstractC2855l.f(name, "getName(...)");
                return new k8.b(cVarD, name);
            }
            if ((interfaceC1288mB instanceof InterfaceC1284i) && (bVarN = n((InterfaceC1283h) interfaceC1288mB)) != null) {
                f name2 = interfaceC1283h.getName();
                AbstractC2855l.f(name2, "getName(...)");
                return bVarN.d(name2);
            }
        }
        return null;
    }

    public static final k8.c o(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        k8.c cVarN = AbstractC3027i.n(interfaceC1288m);
        AbstractC2855l.f(cVarN, "getFqNameSafe(...)");
        return cVarN;
    }

    public static final k8.d p(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        k8.d dVarM = AbstractC3027i.m(interfaceC1288m);
        AbstractC2855l.f(dVarM, "getFqName(...)");
        return dVarM;
    }

    public static final A q(InterfaceC1280e interfaceC1280e) {
        r0 r0VarW0 = interfaceC1280e != null ? interfaceC1280e.w0() : null;
        if (r0VarW0 instanceof A) {
            return (A) r0VarW0;
        }
        return null;
    }

    public static final g r(H h10) {
        AbstractC2855l.g(h10, "<this>");
        android.support.v4.media.session.b.a(h10.s0(h.a()));
        return g.a.f821a;
    }

    public static final H s(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        H hG = AbstractC3027i.g(interfaceC1288m);
        AbstractC2855l.f(hG, "getContainingModule(...)");
        return hG;
    }

    public static final I t(InterfaceC1280e interfaceC1280e) {
        r0 r0VarW0 = interfaceC1280e != null ? interfaceC1280e.w0() : null;
        if (r0VarW0 instanceof I) {
            return (I) r0VarW0;
        }
        return null;
    }

    public static final i u(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        return l.w(v(interfaceC1288m), 1);
    }

    public static final i v(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        return l.n(interfaceC1288m, C3337b.f32327g);
    }

    public static final InterfaceC1277b w(InterfaceC1277b interfaceC1277b) {
        AbstractC2855l.g(interfaceC1277b, "<this>");
        if (!(interfaceC1277b instanceof Y)) {
            return interfaceC1277b;
        }
        Z zY0 = ((Y) interfaceC1277b).y0();
        AbstractC2855l.f(zY0, "getCorrespondingProperty(...)");
        return zY0;
    }

    public static final InterfaceC1280e x(InterfaceC1280e interfaceC1280e) {
        AbstractC2855l.g(interfaceC1280e, "<this>");
        for (S s10 : interfaceC1280e.r().K0().g()) {
            if (!I7.i.b0(s10)) {
                InterfaceC1283h interfaceC1283hP = s10.K0().p();
                if (AbstractC3027i.w(interfaceC1283hP)) {
                    AbstractC2855l.e(interfaceC1283hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC1280e) interfaceC1283hP;
                }
            }
        }
        return null;
    }

    public static final boolean y(H h10) {
        AbstractC2855l.g(h10, "<this>");
        android.support.v4.media.session.b.a(h10.s0(h.a()));
        return false;
    }

    public static final i z(InterfaceC1277b interfaceC1277b, boolean z10) {
        AbstractC2855l.g(interfaceC1277b, "<this>");
        if (z10) {
            interfaceC1277b = interfaceC1277b.a();
        }
        i iVarR = l.r(interfaceC1277b);
        Collection collectionE = interfaceC1277b.e();
        AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
        return l.L(iVarR, l.D(AbstractC2800q.V(collectionE), new C3339d(z10)));
    }
}
