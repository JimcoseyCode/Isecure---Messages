package L7;

import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3037s;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: L7.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1299y {
    public static final InterfaceC1280e b(H h10, k8.b classId) {
        AbstractC2855l.g(h10, "<this>");
        AbstractC2855l.g(classId, "classId");
        InterfaceC1283h interfaceC1283hC = c(h10, classId);
        if (interfaceC1283hC instanceof InterfaceC1280e) {
            return (InterfaceC1280e) interfaceC1283hC;
        }
        return null;
    }

    public static final InterfaceC1283h c(H h10, k8.b classId) {
        AbstractC2855l.g(h10, "<this>");
        AbstractC2855l.g(classId, "classId");
        H hA = AbstractC3037s.a(h10);
        if (hA == null) {
            V vE0 = h10.e0(classId.f());
            List listF = classId.g().f();
            AbstractC2855l.f(listF, "pathSegments(...)");
            InterfaceC3442k interfaceC3442kO = vE0.o();
            Object objE0 = AbstractC2800q.e0(listF);
            AbstractC2855l.f(objE0, "first(...)");
            InterfaceC1283h interfaceC1283hF = interfaceC3442kO.f((k8.f) objE0, T7.d.f10643x);
            if (interfaceC1283hF == null) {
                return null;
            }
            for (k8.f fVar : listF.subList(1, listF.size())) {
                if (!(interfaceC1283hF instanceof InterfaceC1280e)) {
                    return null;
                }
                InterfaceC3442k interfaceC3442kV0 = ((InterfaceC1280e) interfaceC1283hF).v0();
                AbstractC2855l.d(fVar);
                InterfaceC1283h interfaceC1283hF2 = interfaceC3442kV0.f(fVar, T7.d.f10643x);
                interfaceC1283hF = interfaceC1283hF2 instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hF2 : null;
                if (interfaceC1283hF == null) {
                    return null;
                }
            }
            return interfaceC1283hF;
        }
        V vE02 = hA.e0(classId.f());
        List listF2 = classId.g().f();
        AbstractC2855l.f(listF2, "pathSegments(...)");
        InterfaceC3442k interfaceC3442kO2 = vE02.o();
        Object objE02 = AbstractC2800q.e0(listF2);
        AbstractC2855l.f(objE02, "first(...)");
        InterfaceC1283h interfaceC1283hF3 = interfaceC3442kO2.f((k8.f) objE02, T7.d.f10643x);
        if (interfaceC1283hF3 == null) {
            interfaceC1283hF3 = null;
            break;
        }
        for (k8.f fVar2 : listF2.subList(1, listF2.size())) {
            if (interfaceC1283hF3 instanceof InterfaceC1280e) {
                InterfaceC3442k interfaceC3442kV02 = ((InterfaceC1280e) interfaceC1283hF3).v0();
                AbstractC2855l.d(fVar2);
                InterfaceC1283h interfaceC1283hF4 = interfaceC3442kV02.f(fVar2, T7.d.f10643x);
                interfaceC1283hF3 = interfaceC1283hF4 instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hF4 : null;
                if (interfaceC1283hF3 != null) {
                }
            }
            interfaceC1283hF3 = null;
        }
        if (interfaceC1283hF3 != null) {
            return interfaceC1283hF3;
        }
        V vE03 = h10.e0(classId.f());
        List listF3 = classId.g().f();
        AbstractC2855l.f(listF3, "pathSegments(...)");
        InterfaceC3442k interfaceC3442kO3 = vE03.o();
        Object objE03 = AbstractC2800q.e0(listF3);
        AbstractC2855l.f(objE03, "first(...)");
        InterfaceC1283h interfaceC1283hF5 = interfaceC3442kO3.f((k8.f) objE03, T7.d.f10643x);
        if (interfaceC1283hF5 == null) {
            return null;
        }
        for (k8.f fVar3 : listF3.subList(1, listF3.size())) {
            if (!(interfaceC1283hF5 instanceof InterfaceC1280e)) {
                return null;
            }
            InterfaceC3442k interfaceC3442kV03 = ((InterfaceC1280e) interfaceC1283hF5).v0();
            AbstractC2855l.d(fVar3);
            InterfaceC1283h interfaceC1283hF6 = interfaceC3442kV03.f(fVar3, T7.d.f10643x);
            interfaceC1283hF5 = interfaceC1283hF6 instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hF6 : null;
            if (interfaceC1283hF5 == null) {
                return null;
            }
        }
        return interfaceC1283hF5;
    }

    public static final InterfaceC1280e d(H h10, k8.b classId, M notFoundClasses) {
        AbstractC2855l.g(h10, "<this>");
        AbstractC2855l.g(classId, "classId");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        InterfaceC1280e interfaceC1280eB = b(h10, classId);
        return interfaceC1280eB != null ? interfaceC1280eB : notFoundClasses.d(classId, O8.l.S(O8.l.J(O8.l.n(classId, new kotlin.jvm.internal.u() { // from class: L7.y.a
            @Override // C7.m
            public Object get(Object obj) {
                return ((k8.b) obj).e();
            }

            @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.AbstractC2846c
            public C7.f getOwner() {
                return kotlin.jvm.internal.D.b(k8.b.class);
            }

            @Override // kotlin.jvm.internal.AbstractC2846c
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }), C1298x.f7373g)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(k8.b it) {
        AbstractC2855l.g(it, "it");
        return 0;
    }

    public static final l0 f(H h10, k8.b classId) {
        AbstractC2855l.g(h10, "<this>");
        AbstractC2855l.g(classId, "classId");
        InterfaceC1283h interfaceC1283hC = c(h10, classId);
        if (interfaceC1283hC instanceof l0) {
            return (l0) interfaceC1283hC;
        }
        return null;
    }
}
