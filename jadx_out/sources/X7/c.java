package X7;

import L7.InterfaceC1282g;
import L7.InterfaceC1288m;
import U7.E;
import b8.z;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    private static final k c(k kVar, InterfaceC1288m interfaceC1288m, z zVar, int i10, Lazy lazy) {
        return new k(kVar.a(), zVar != null ? new m(kVar, interfaceC1288m, zVar, i10) : kVar.f(), lazy);
    }

    public static final k d(k kVar, p typeParameterResolver) {
        AbstractC2855l.g(kVar, "<this>");
        AbstractC2855l.g(typeParameterResolver, "typeParameterResolver");
        return new k(kVar.a(), typeParameterResolver, kVar.c());
    }

    public static final k e(k kVar, InterfaceC1282g containingDeclaration, z zVar, int i10) {
        AbstractC2855l.g(kVar, "<this>");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        return c(kVar, containingDeclaration, zVar, i10, AbstractC2746i.a(EnumC2749l.f28718i, new a(kVar, containingDeclaration)));
    }

    public static /* synthetic */ k f(k kVar, InterfaceC1282g interfaceC1282g, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(kVar, interfaceC1282g, zVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E g(k kVar, InterfaceC1282g interfaceC1282g) {
        return j(kVar, interfaceC1282g.getAnnotations());
    }

    public static final k h(k kVar, InterfaceC1288m containingDeclaration, z typeParameterOwner, int i10) {
        AbstractC2855l.g(kVar, "<this>");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(typeParameterOwner, "typeParameterOwner");
        return c(kVar, containingDeclaration, typeParameterOwner, i10, kVar.c());
    }

    public static /* synthetic */ k i(k kVar, InterfaceC1288m interfaceC1288m, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(kVar, interfaceC1288m, zVar, i10);
    }

    public static final E j(k kVar, M7.h additionalAnnotations) {
        AbstractC2855l.g(kVar, "<this>");
        AbstractC2855l.g(additionalAnnotations, "additionalAnnotations");
        return kVar.a().a().d(kVar.b(), additionalAnnotations);
    }

    public static final k k(k kVar, M7.h additionalAnnotations) {
        AbstractC2855l.g(kVar, "<this>");
        AbstractC2855l.g(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? kVar : new k(kVar.a(), kVar.f(), AbstractC2746i.a(EnumC2749l.f28718i, new b(kVar, additionalAnnotations)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E l(k kVar, M7.h hVar) {
        return j(kVar, hVar);
    }

    public static final k m(k kVar, d components) {
        AbstractC2855l.g(kVar, "<this>");
        AbstractC2855l.g(components, "components");
        return new k(components, kVar.f(), kVar.c());
    }
}
