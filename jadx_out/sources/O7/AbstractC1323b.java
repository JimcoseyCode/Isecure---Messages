package O7;

import C8.N0;
import L7.InterfaceC1288m;
import L7.h0;
import L7.k0;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: O7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1323b extends AbstractC1329h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1323b(B8.n nVar, InterfaceC1288m interfaceC1288m, M7.h hVar, k8.f fVar, N0 n02, boolean z10, int i10, h0 h0Var, k0 k0Var) {
        super(nVar, interfaceC1288m, hVar, fVar, n02, z10, i10, h0Var, k0Var);
        if (nVar == null) {
            G(0);
        }
        if (interfaceC1288m == null) {
            G(1);
        }
        if (hVar == null) {
            G(2);
        }
        if (fVar == null) {
            G(3);
        }
        if (n02 == null) {
            G(4);
        }
        if (h0Var == null) {
            G(5);
        }
        if (k0Var == null) {
            G(6);
        }
    }

    private static /* synthetic */ void G(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // O7.AbstractC1334m
    public String toString() {
        boolean zE = E();
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        String str2 = zE ? "reified " : PointerEventHelper.POINTER_TYPE_UNKNOWN;
        if (m() != N0.f592k) {
            str = m() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
