package V7;

import C8.S;
import I7.o;
import L7.H;
import L7.t0;
import M7.q;
import M7.r;
import b8.InterfaceC1818b;
import b8.InterfaceC1829m;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import j7.T;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import q8.C3137b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11823a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f11824b = K.l(t.a("PACKAGE", EnumSet.noneOf(r.class)), t.a("TYPE", EnumSet.of(r.f7652z, r.f7603M)), t.a("ANNOTATION_TYPE", EnumSet.of(r.f7591A)), t.a("TYPE_PARAMETER", EnumSet.of(r.f7592B)), t.a("FIELD", EnumSet.of(r.f7594D)), t.a("LOCAL_VARIABLE", EnumSet.of(r.f7595E)), t.a("PARAMETER", EnumSet.of(r.f7596F)), t.a("CONSTRUCTOR", EnumSet.of(r.f7597G)), t.a("METHOD", EnumSet.of(r.f7598H, r.f7599I, r.f7600J)), t.a("TYPE_USE", EnumSet.of(r.f7601K)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f11825c = K.l(t.a("RUNTIME", q.f7586g), t.a("CLASS", q.f7587h), t.a("SOURCE", q.f7588i));

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S e(H module) {
        S type;
        AbstractC2855l.g(module, "module");
        t0 t0VarB = a.b(d.f11817a.d(), module.n().o(o.a.f5156H));
        return (t0VarB == null || (type = t0VarB.getType()) == null) ? E8.l.d(E8.k.f1184J0, new String[0]) : type;
    }

    public final q8.g b(InterfaceC1818b interfaceC1818b) {
        InterfaceC1829m interfaceC1829m = interfaceC1818b instanceof InterfaceC1829m ? (InterfaceC1829m) interfaceC1818b : null;
        if (interfaceC1829m != null) {
            Map map = f11825c;
            k8.f fVarD = interfaceC1829m.d();
            q qVar = (q) map.get(fVarD != null ? fVarD.j() : null);
            if (qVar != null) {
                k8.b bVarC = k8.b.f29200d.c(o.a.f5162K);
                k8.f fVarQ = k8.f.q(qVar.name());
                AbstractC2855l.f(fVarQ, "identifier(...)");
                return new q8.k(bVarC, fVarQ);
            }
        }
        return null;
    }

    public final Set c(String str) {
        EnumSet enumSet = (EnumSet) f11824b.get(str);
        return enumSet != null ? enumSet : T.e();
    }

    public final q8.g d(List arguments) {
        AbstractC2855l.g(arguments, "arguments");
        ArrayList<InterfaceC1829m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof InterfaceC1829m) {
                arrayList.add(obj);
            }
        }
        ArrayList<r> arrayList2 = new ArrayList();
        for (InterfaceC1829m interfaceC1829m : arrayList) {
            f fVar = f11823a;
            k8.f fVarD = interfaceC1829m.d();
            AbstractC2800q.A(arrayList2, fVar.c(fVarD != null ? fVarD.j() : null));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(arrayList2, 10));
        for (r rVar : arrayList2) {
            k8.b bVarC = k8.b.f29200d.c(o.a.f5160J);
            k8.f fVarQ = k8.f.q(rVar.name());
            AbstractC2855l.f(fVarQ, "identifier(...)");
            arrayList3.add(new q8.k(bVarC, fVarQ));
        }
        return new C3137b(arrayList3, e.f11822g);
    }
}
