package o8;

import L7.E;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.N;
import L7.l0;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC2855l;
import l7.AbstractC2884a;
import s8.AbstractC3340e;
import v8.C3435d;
import v8.InterfaceC3442k;
import v8.InterfaceC3445n;

/* JADX INFO: renamed from: o8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3019a extends AbstractC3038t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3019a f30510a = new C3019a();

    /* JADX INFO: renamed from: o8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0339a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC2884a.a(AbstractC3340e.o((InterfaceC1280e) obj).b(), AbstractC3340e.o((InterfaceC1280e) obj2).b());
        }
    }

    private C3019a() {
    }

    private static final void b(InterfaceC1280e interfaceC1280e, LinkedHashSet linkedHashSet, InterfaceC3442k interfaceC3442k, boolean z10) {
        for (InterfaceC1288m interfaceC1288m : InterfaceC3445n.a.a(interfaceC3442k, C3435d.f32972t, null, 2, null)) {
            if (interfaceC1288m instanceof InterfaceC1280e) {
                InterfaceC1280e interfaceC1280eQ = (InterfaceC1280e) interfaceC1288m;
                if (interfaceC1280eQ.J()) {
                    k8.f name = interfaceC1280eQ.getName();
                    AbstractC2855l.f(name, "getName(...)");
                    InterfaceC1283h interfaceC1283hF = interfaceC3442k.f(name, T7.d.f10638s);
                    interfaceC1280eQ = interfaceC1283hF instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hF : interfaceC1283hF instanceof l0 ? ((l0) interfaceC1283hF).q() : null;
                }
                if (interfaceC1280eQ != null) {
                    if (AbstractC3027i.z(interfaceC1280eQ, interfaceC1280e)) {
                        linkedHashSet.add(interfaceC1280eQ);
                    }
                    if (z10) {
                        InterfaceC3442k interfaceC3442kV0 = interfaceC1280eQ.v0();
                        AbstractC2855l.f(interfaceC3442kV0, "getUnsubstitutedInnerClassesScope(...)");
                        b(interfaceC1280e, linkedHashSet, interfaceC3442kV0, z10);
                    }
                }
            }
        }
    }

    public Collection a(InterfaceC1280e sealedClass, boolean z10) {
        Object next;
        InterfaceC1288m interfaceC1288mB;
        AbstractC2855l.g(sealedClass, "sealedClass");
        if (sealedClass.k() != E.f7284i) {
            return AbstractC2800q.j();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator it = AbstractC3340e.u(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC1288m) next) instanceof N) {
                    break;
                }
            }
            interfaceC1288mB = (InterfaceC1288m) next;
        } else {
            interfaceC1288mB = sealedClass.b();
        }
        if (interfaceC1288mB instanceof N) {
            b(sealedClass, linkedHashSet, ((N) interfaceC1288mB).o(), z10);
        }
        InterfaceC3442k interfaceC3442kV0 = sealedClass.v0();
        AbstractC2855l.f(interfaceC3442kV0, "getUnsubstitutedInnerClassesScope(...)");
        b(sealedClass, linkedHashSet, interfaceC3442kV0, true);
        return AbstractC2800q.H0(linkedHashSet, new C0339a());
    }
}
