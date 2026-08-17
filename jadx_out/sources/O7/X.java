package O7;

import L7.InterfaceC1288m;
import L7.c0;
import L7.h0;
import L7.u0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class X extends AbstractC1335n implements u0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected C8.S f8429k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(InterfaceC1288m interfaceC1288m, M7.h hVar, k8.f fVar, C8.S s10, h0 h0Var) {
        super(interfaceC1288m, hVar, fVar, h0Var);
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
        this.f8429k = s10;
    }

    private static /* synthetic */ void G(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public void C0(C8.S s10) {
        this.f8429k = s10;
    }

    @Override // L7.InterfaceC1276a
    public boolean F() {
        return false;
    }

    public c0 a0() {
        return null;
    }

    public C8.S getReturnType() {
        C8.S type = getType();
        if (type == null) {
            G(10);
        }
        return type;
    }

    @Override // L7.s0
    public C8.S getType() {
        C8.S s10 = this.f8429k;
        if (s10 == null) {
            G(4);
        }
        return s10;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            G(8);
        }
        return list;
    }

    public c0 h0() {
        return null;
    }

    @Override // L7.InterfaceC1276a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            G(6);
        }
        return list;
    }
}
