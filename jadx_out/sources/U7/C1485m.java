package U7;

import L7.InterfaceC1277b;
import j7.AbstractC2800q;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: U7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1485m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1485m f11520a = new C1485m();

    private C1485m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        return f11520a.d(it);
    }

    private final boolean e(InterfaceC1277b interfaceC1277b) {
        if (AbstractC2800q.X(C1482j.f11513a.c(), AbstractC3340e.k(interfaceC1277b)) && interfaceC1277b.i().isEmpty()) {
            return true;
        }
        if (!I7.i.g0(interfaceC1277b)) {
            return false;
        }
        Collection<InterfaceC1277b> collectionE = interfaceC1277b.e();
        AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
        if (collectionE.isEmpty()) {
            return false;
        }
        for (InterfaceC1277b interfaceC1277b2 : collectionE) {
            C1485m c1485m = f11520a;
            AbstractC2855l.d(interfaceC1277b2);
            if (c1485m.d(interfaceC1277b2)) {
                return true;
            }
        }
        return false;
    }

    public final String b(InterfaceC1277b interfaceC1277b) {
        k8.f fVar;
        AbstractC2855l.g(interfaceC1277b, "<this>");
        I7.i.g0(interfaceC1277b);
        InterfaceC1277b interfaceC1277bI = AbstractC3340e.i(AbstractC3340e.w(interfaceC1277b), false, C1484l.f11519g, 1, null);
        if (interfaceC1277bI == null || (fVar = (k8.f) C1482j.f11513a.a().get(AbstractC3340e.o(interfaceC1277bI))) == null) {
            return null;
        }
        return fVar.j();
    }

    public final boolean d(InterfaceC1277b callableMemberDescriptor) {
        AbstractC2855l.g(callableMemberDescriptor, "callableMemberDescriptor");
        if (C1482j.f11513a.d().contains(callableMemberDescriptor.getName())) {
            return e(callableMemberDescriptor);
        }
        return false;
    }
}
