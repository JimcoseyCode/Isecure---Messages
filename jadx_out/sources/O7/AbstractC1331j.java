package O7;

import L7.InterfaceC1288m;
import L7.h0;

/* JADX INFO: renamed from: O7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1331j extends AbstractC1322a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC1288m f8466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h0 f8467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f8468n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1331j(B8.n nVar, InterfaceC1288m interfaceC1288m, k8.f fVar, h0 h0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            x0(0);
        }
        if (interfaceC1288m == null) {
            x0(1);
        }
        if (fVar == null) {
            x0(2);
        }
        if (h0Var == null) {
            x0(3);
        }
        this.f8466l = interfaceC1288m;
        this.f8467m = h0Var;
        this.f8468n = z10;
    }

    private static /* synthetic */ void x0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1289n, L7.InterfaceC1288m
    public InterfaceC1288m b() {
        InterfaceC1288m interfaceC1288m = this.f8466l;
        if (interfaceC1288m == null) {
            x0(4);
        }
        return interfaceC1288m;
    }

    @Override // L7.InterfaceC1291p
    public h0 g() {
        h0 h0Var = this.f8467m;
        if (h0Var == null) {
            x0(5);
        }
        return h0Var;
    }

    public boolean isExternal() {
        return this.f8468n;
    }
}
