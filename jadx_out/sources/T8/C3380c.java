package t8;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import X7.j;
import Y7.D;
import b8.EnumC1816D;
import b8.InterfaceC1823g;
import j7.AbstractC2800q;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: t8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3380c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f32525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V7.j f32526b;

    public C3380c(j packageFragmentProvider, V7.j javaResolverCache) {
        AbstractC2855l.g(packageFragmentProvider, "packageFragmentProvider");
        AbstractC2855l.g(javaResolverCache, "javaResolverCache");
        this.f32525a = packageFragmentProvider;
        this.f32526b = javaResolverCache;
    }

    public final j a() {
        return this.f32525a;
    }

    public final InterfaceC1280e b(InterfaceC1823g javaClass) {
        AbstractC2855l.g(javaClass, "javaClass");
        k8.c cVarD = javaClass.d();
        if (cVarD != null && javaClass.E() == EnumC1816D.f18663g) {
            return this.f32526b.e(cVarD);
        }
        InterfaceC1823g interfaceC1823gH = javaClass.h();
        if (interfaceC1823gH != null) {
            InterfaceC1280e interfaceC1280eB = b(interfaceC1823gH);
            InterfaceC3442k interfaceC3442kV0 = interfaceC1280eB != null ? interfaceC1280eB.v0() : null;
            InterfaceC1283h interfaceC1283hF = interfaceC3442kV0 != null ? interfaceC3442kV0.f(javaClass.getName(), T7.d.f10644y) : null;
            if (interfaceC1283hF instanceof InterfaceC1280e) {
                return (InterfaceC1280e) interfaceC1283hF;
            }
            return null;
        }
        if (cVarD == null) {
            return null;
        }
        j jVar = this.f32525a;
        k8.c cVarE = cVarD.e();
        AbstractC2855l.f(cVarE, "parent(...)");
        D d10 = (D) AbstractC2800q.g0(jVar.c(cVarE));
        if (d10 != null) {
            return d10.K0(javaClass);
        }
        return null;
    }
}
