package O7;

import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import L7.InterfaceC1290o;
import L7.Z;
import L7.a0;
import L7.h0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class L extends J implements a0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C8.S f8401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a0 f8402t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Z z10, M7.h hVar, L7.E e10, AbstractC1295u abstractC1295u, boolean z11, boolean z12, boolean z13, InterfaceC1277b.a aVar, a0 a0Var, h0 h0Var) {
        super(e10, abstractC1295u, z10, hVar, k8.f.t("<get-" + z10.getName() + ">"), z11, z12, z13, aVar, h0Var);
        if (z10 == null) {
            G(0);
        }
        if (hVar == null) {
            G(1);
        }
        if (e10 == null) {
            G(2);
        }
        if (abstractC1295u == null) {
            G(3);
        }
        if (aVar == null) {
            G(4);
        }
        if (h0Var == null) {
            G(5);
        }
        this.f8402t = a0Var != null ? a0Var : this;
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.i(this, obj);
    }

    @Override // O7.AbstractC1335n
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public a0 a() {
        a0 a0Var = this.f8402t;
        if (a0Var == null) {
            G(8);
        }
        return a0Var;
    }

    public void M0(C8.S s10) {
        if (s10 == null) {
            s10 = y0().getType();
        }
        this.f8401s = s10;
    }

    @Override // L7.InterfaceC1300z, L7.InterfaceC1277b, L7.InterfaceC1276a
    public Collection e() {
        Collection collectionH0 = super.H0(true);
        if (collectionH0 == null) {
            G(6);
        }
        return collectionH0;
    }

    @Override // L7.InterfaceC1276a
    public C8.S getReturnType() {
        return this.f8401s;
    }

    @Override // L7.InterfaceC1276a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            G(7);
        }
        return list;
    }
}
