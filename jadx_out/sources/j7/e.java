package J7;

import C8.AbstractC0407d0;
import C8.G0;
import C8.N0;
import C8.S;
import J8.t;
import L7.AbstractC1294t;
import L7.E;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.c0;
import L7.h0;
import L7.m0;
import L7.t0;
import M7.h;
import O7.AbstractC1339s;
import O7.O;
import O7.V;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import j7.C2783G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends O {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final a f6823K = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final t0 b(e eVar, int i10, m0 m0Var) {
            String lowerCase;
            String strJ = m0Var.getName().j();
            AbstractC2855l.f(strJ, "asString(...)");
            if (AbstractC2855l.b(strJ, "T")) {
                lowerCase = "instance";
            } else if (AbstractC2855l.b(strJ, "E")) {
                lowerCase = NotificationsService.RECEIVER_KEY;
            } else {
                lowerCase = strJ.toLowerCase(Locale.ROOT);
                AbstractC2855l.f(lowerCase, "toLowerCase(...)");
            }
            h hVarB = h.f7570a.b();
            k8.f fVarQ = k8.f.q(lowerCase);
            AbstractC2855l.f(fVarQ, "identifier(...)");
            AbstractC0407d0 abstractC0407d0R = m0Var.r();
            AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
            h0 NO_SOURCE = h0.f7335a;
            AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
            return new V(eVar, null, i10, hVarB, fVarQ, abstractC0407d0R, false, false, false, null, NO_SOURCE);
        }

        public final e a(b functionClass, boolean z10) {
            AbstractC2855l.g(functionClass, "functionClass");
            List listT = functionClass.t();
            e eVar = new e(functionClass, null, InterfaceC1277b.a.DECLARATION, z10, null);
            c0 c0VarG0 = functionClass.G0();
            List listJ = AbstractC2800q.j();
            List listJ2 = AbstractC2800q.j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listT) {
                if (((m0) obj).m() != N0.f593l) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<C2783G> iterableV0 = AbstractC2800q.V0(arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(iterableV0, 10));
            for (C2783G c2783g : iterableV0) {
                arrayList2.add(e.f6823K.b(eVar, c2783g.c(), (m0) c2783g.d()));
            }
            eVar.O0(null, c0VarG0, listJ, listJ2, arrayList2, ((m0) AbstractC2800q.q0(listT)).r(), E.f7286k, AbstractC1294t.f7347e);
            eVar.W0(true);
            return eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(InterfaceC1288m interfaceC1288m, e eVar, InterfaceC1277b.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1288m, eVar, aVar, z10);
    }

    private final InterfaceC1300z m1(List list) {
        k8.f fVar;
        int size = i().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List listI = i();
            AbstractC2855l.f(listI, "getValueParameters(...)");
            List<Pair> listX0 = AbstractC2800q.X0(list, listI);
            if (listX0 != null && listX0.isEmpty()) {
                return this;
            }
            for (Pair pair : listX0) {
                if (!AbstractC2855l.b((k8.f) pair.getFirst(), ((t0) pair.getSecond()).getName())) {
                }
            }
            return this;
        }
        List<t0> listI2 = i();
        AbstractC2855l.f(listI2, "getValueParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI2, 10));
        for (t0 t0Var : listI2) {
            k8.f name = t0Var.getName();
            AbstractC2855l.f(name, "getName(...)");
            int index = t0Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = (k8.f) list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(t0Var.z(this, name, index));
        }
        AbstractC1339s.c cVarP0 = P0(G0.f565b);
        if (list.isEmpty()) {
            z10 = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((k8.f) it.next()) == null) {
                    break;
                }
            }
            z10 = false;
        }
        AbstractC1339s.c cVarR = cVarP0.G(z10).d(arrayList).r(a());
        AbstractC2855l.f(cVarR, "setOriginal(...)");
        InterfaceC1300z interfaceC1300zJ0 = super.J0(cVarR);
        AbstractC2855l.d(interfaceC1300zJ0);
        return interfaceC1300zJ0;
    }

    @Override // O7.O, O7.AbstractC1339s
    /* JADX INFO: renamed from: I0 */
    protected AbstractC1339s l1(InterfaceC1288m newOwner, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a kind, k8.f fVar, h annotations, h0 source) {
        AbstractC2855l.g(newOwner, "newOwner");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(source, "source");
        return new e(newOwner, (e) interfaceC1300z, kind, isSuspend());
    }

    @Override // O7.AbstractC1339s
    protected InterfaceC1300z J0(AbstractC1339s.c configuration) {
        AbstractC2855l.g(configuration, "configuration");
        e eVar = (e) super.J0(configuration);
        if (eVar == null) {
            return null;
        }
        List listI = eVar.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        if (listI != null && listI.isEmpty()) {
            return eVar;
        }
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            S type = ((t0) it.next()).getType();
            AbstractC2855l.f(type, "getType(...)");
            if (I7.h.d(type) != null) {
                List listI2 = eVar.i();
                AbstractC2855l.f(listI2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI2, 10));
                Iterator it2 = listI2.iterator();
                while (it2.hasNext()) {
                    S type2 = ((t0) it2.next()).getType();
                    AbstractC2855l.f(type2, "getType(...)");
                    arrayList.add(I7.h.d(type2));
                }
                return eVar.m1(arrayList);
            }
        }
        return eVar;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z
    public boolean N() {
        return false;
    }

    @Override // O7.AbstractC1339s, L7.D
    public boolean isExternal() {
        return false;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z
    public boolean isInline() {
        return false;
    }

    private e(InterfaceC1288m interfaceC1288m, e eVar, InterfaceC1277b.a aVar, boolean z10) {
        super(interfaceC1288m, eVar, h.f7570a.b(), t.f6922i, aVar, h0.f7335a);
        c1(true);
        e1(z10);
        V0(false);
    }
}
