package y8;

import A8.C0393m;
import I7.o;
import L7.InterfaceC1280e;
import L7.h0;
import h8.AbstractC2708a;
import h8.InterfaceC2710c;
import h8.h;
import java.util.Iterator;
import java.util.Set;
import k8.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3650l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f34098c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f34099d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3652n f34100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f34101b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y8.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k8.b f34102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C3647i f34103b;

        public a(k8.b classId, C3647i c3647i) {
            AbstractC2855l.g(classId, "classId");
            this.f34102a = classId;
            this.f34103b = c3647i;
        }

        public final C3647i a() {
            return this.f34103b;
        }

        public final k8.b b() {
            return this.f34102a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC2855l.b(this.f34102a, ((a) obj).f34102a);
        }

        public int hashCode() {
            return this.f34102a.hashCode();
        }
    }

    /* JADX INFO: renamed from: y8.l$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return C3650l.f34099d;
        }

        private b() {
        }
    }

    static {
        b.a aVar = k8.b.f29200d;
        k8.c cVarL = o.a.f5189d.l();
        AbstractC2855l.f(cVarL, "toSafe(...)");
        f34099d = j7.T.d(aVar.c(cVarL));
    }

    public C3650l(C3652n components) {
        AbstractC2855l.g(components, "components");
        this.f34100a = components;
        this.f34101b = components.u().i(new C3649k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1280e c(C3650l c3650l, a key) {
        AbstractC2855l.g(key, "key");
        return c3650l.d(key);
    }

    private final InterfaceC1280e d(a aVar) {
        Object next;
        C3654p c3654pA;
        k8.b bVarB = aVar.b();
        Iterator it = this.f34100a.l().iterator();
        while (it.hasNext()) {
            InterfaceC1280e interfaceC1280eC = ((N7.b) it.next()).c(bVarB);
            if (interfaceC1280eC != null) {
                return interfaceC1280eC;
            }
        }
        if (f34099d.contains(bVarB)) {
            return null;
        }
        C3647i c3647iA = aVar.a();
        if (c3647iA == null && (c3647iA = this.f34100a.e().a(bVarB)) == null) {
            return null;
        }
        InterfaceC2710c interfaceC2710cA = c3647iA.a();
        f8.c cVarB = c3647iA.b();
        AbstractC2708a abstractC2708aC = c3647iA.c();
        h0 h0VarD = c3647iA.d();
        k8.b bVarE = bVarB.e();
        if (bVarE != null) {
            InterfaceC1280e interfaceC1280eF = f(this, bVarE, null, 2, null);
            C0393m c0393m = interfaceC1280eF instanceof C0393m ? (C0393m) interfaceC1280eF : null;
            if (c0393m == null || !c0393m.h1(bVarB.h())) {
                return null;
            }
            c3654pA = c0393m.a1();
        } else {
            Iterator it2 = L7.T.c(this.f34100a.s(), bVarB.f()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                L7.N n10 = (L7.N) next;
                if (!(n10 instanceof r) || ((r) n10).H0(bVarB.h())) {
                    break;
                }
            }
            L7.N n11 = (L7.N) next;
            if (n11 == null) {
                return null;
            }
            C3652n c3652n = this.f34100a;
            f8.t tVarH1 = cVarB.h1();
            AbstractC2855l.f(tVarH1, "getTypeTable(...)");
            h8.g gVar = new h8.g(tVarH1);
            h.a aVar2 = h8.h.f28564b;
            f8.w wVarJ1 = cVarB.j1();
            AbstractC2855l.f(wVarJ1, "getVersionRequirementTable(...)");
            c3654pA = c3652n.a(n11, interfaceC2710cA, gVar, aVar2.a(wVarJ1), abstractC2708aC, null);
            abstractC2708aC = abstractC2708aC;
        }
        return new C0393m(c3654pA, cVarB, interfaceC2710cA, abstractC2708aC, h0VarD);
    }

    public static /* synthetic */ InterfaceC1280e f(C3650l c3650l, k8.b bVar, C3647i c3647i, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c3647i = null;
        }
        return c3650l.e(bVar, c3647i);
    }

    public final InterfaceC1280e e(k8.b classId, C3647i c3647i) {
        AbstractC2855l.g(classId, "classId");
        return (InterfaceC1280e) this.f34101b.invoke(new a(classId, c3647i));
    }
}
