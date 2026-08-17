package V7;

import I7.o;
import U7.I;
import Y7.C1546j;
import b8.InterfaceC1817a;
import b8.InterfaceC1820d;
import i7.t;
import j7.K;
import java.util.Map;
import k8.b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11817a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k8.f f11818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k8.f f11819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k8.f f11820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f11821e;

    static {
        k8.f fVarQ = k8.f.q("message");
        AbstractC2855l.f(fVarQ, "identifier(...)");
        f11818b = fVarQ;
        k8.f fVarQ2 = k8.f.q("allowedTargets");
        AbstractC2855l.f(fVarQ2, "identifier(...)");
        f11819c = fVarQ2;
        k8.f fVarQ3 = k8.f.q("value");
        AbstractC2855l.f(fVarQ3, "identifier(...)");
        f11820d = fVarQ3;
        f11821e = K.l(t.a(o.a.f5156H, I.f11399d), t.a(o.a.f5164L, I.f11401f), t.a(o.a.f5172P, I.f11404i));
    }

    private d() {
    }

    public static /* synthetic */ M7.c f(d dVar, InterfaceC1817a interfaceC1817a, X7.k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.e(interfaceC1817a, kVar, z10);
    }

    public final M7.c a(k8.c kotlinName, InterfaceC1820d annotationOwner, X7.k c10) {
        InterfaceC1817a interfaceC1817aB;
        AbstractC2855l.g(kotlinName, "kotlinName");
        AbstractC2855l.g(annotationOwner, "annotationOwner");
        AbstractC2855l.g(c10, "c");
        if (AbstractC2855l.b(kotlinName, o.a.f5231y)) {
            k8.c DEPRECATED_ANNOTATION = I.f11403h;
            AbstractC2855l.f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC1817a interfaceC1817aB2 = annotationOwner.b(DEPRECATED_ANNOTATION);
            if (interfaceC1817aB2 != null || annotationOwner.k()) {
                return new h(interfaceC1817aB2, c10);
            }
        }
        k8.c cVar = (k8.c) f11821e.get(kotlinName);
        if (cVar == null || (interfaceC1817aB = annotationOwner.b(cVar)) == null) {
            return null;
        }
        return f(f11817a, interfaceC1817aB, c10, false, 4, null);
    }

    public final k8.f b() {
        return f11818b;
    }

    public final k8.f c() {
        return f11820d;
    }

    public final k8.f d() {
        return f11819c;
    }

    public final M7.c e(InterfaceC1817a annotation, X7.k c10, boolean z10) {
        AbstractC2855l.g(annotation, "annotation");
        AbstractC2855l.g(c10, "c");
        k8.b bVarC = annotation.c();
        b.a aVar = k8.b.f29200d;
        k8.c TARGET_ANNOTATION = I.f11399d;
        AbstractC2855l.f(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (AbstractC2855l.b(bVarC, aVar.c(TARGET_ANNOTATION))) {
            return new n(annotation, c10);
        }
        k8.c RETENTION_ANNOTATION = I.f11401f;
        AbstractC2855l.f(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (AbstractC2855l.b(bVarC, aVar.c(RETENTION_ANNOTATION))) {
            return new l(annotation, c10);
        }
        k8.c DOCUMENTED_ANNOTATION = I.f11404i;
        AbstractC2855l.f(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (AbstractC2855l.b(bVarC, aVar.c(DOCUMENTED_ANNOTATION))) {
            return new c(c10, annotation, o.a.f5172P);
        }
        k8.c DEPRECATED_ANNOTATION = I.f11403h;
        AbstractC2855l.f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (AbstractC2855l.b(bVarC, aVar.c(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new C1546j(c10, annotation, z10);
    }
}
