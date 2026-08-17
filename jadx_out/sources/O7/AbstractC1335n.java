package O7;

import L7.InterfaceC1288m;
import L7.InterfaceC1289n;
import L7.InterfaceC1291p;
import L7.h0;

/* JADX INFO: renamed from: O7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1335n extends AbstractC1334m implements InterfaceC1289n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC1288m f8478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h0 f8479j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1335n(InterfaceC1288m interfaceC1288m, M7.h hVar, k8.f fVar, h0 h0Var) {
        super(hVar, fVar);
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
        this.f8478i = interfaceC1288m;
        this.f8479j = h0Var;
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public InterfaceC1288m b() {
        InterfaceC1288m interfaceC1288m = this.f8478i;
        if (interfaceC1288m == null) {
            G(5);
        }
        return interfaceC1288m;
    }

    public h0 g() {
        h0 h0Var = this.f8479j;
        if (h0Var == null) {
            G(6);
        }
        return h0Var;
    }

    @Override // O7.AbstractC1334m, L7.InterfaceC1288m
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1291p a() {
        InterfaceC1291p interfaceC1291p = (InterfaceC1291p) super.a();
        if (interfaceC1291p == null) {
            G(4);
        }
        return interfaceC1291p;
    }
}
