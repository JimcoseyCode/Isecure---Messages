package O7;

import L7.InterfaceC1288m;
import L7.h0;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Y extends X {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f8430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected B8.j f8431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected InterfaceC3487a f8432n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC1288m interfaceC1288m, M7.h hVar, k8.f fVar, C8.S s10, boolean z10, h0 h0Var) {
        super(interfaceC1288m, hVar, fVar, s10, h0Var);
        if (interfaceC1288m == null) {
            G(0);
        }
        if (hVar == null) {
            G(1);
        }
        if (fVar == null) {
            G(2);
        }
        if (h0Var == null) {
            G(3);
        }
        this.f8430l = z10;
    }

    private static /* synthetic */ void G(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void H0(B8.j jVar, InterfaceC3487a interfaceC3487a) {
        if (interfaceC3487a == null) {
            G(5);
        }
        this.f8432n = interfaceC3487a;
        if (jVar == null) {
            jVar = (B8.j) interfaceC3487a.invoke();
        }
        this.f8431m = jVar;
    }

    public void I0(InterfaceC3487a interfaceC3487a) {
        if (interfaceC3487a == null) {
            G(4);
        }
        H0(null, interfaceC3487a);
    }

    @Override // L7.u0
    public q8.g U() {
        B8.j jVar = this.f8431m;
        if (jVar != null) {
            return (q8.g) jVar.invoke();
        }
        return null;
    }

    @Override // L7.u0
    public boolean d0() {
        return this.f8430l;
    }
}
