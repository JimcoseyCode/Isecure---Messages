package O7;

import C8.G0;
import C8.N0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.InterfaceC1280e;
import L7.InterfaceC1290o;
import L7.c0;
import L7.h0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import w8.C3503i;

/* JADX INFO: renamed from: O7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1324c extends AbstractC1334m implements c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1324c(M7.h hVar) {
        super(hVar, k8.h.f29228i);
        if (hVar == null) {
            G(0);
        }
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.g(this, obj);
    }

    @Override // L7.InterfaceC1276a
    public boolean F() {
        return false;
    }

    @Override // L7.InterfaceC1276a
    public c0 a0() {
        return null;
    }

    @Override // L7.InterfaceC1276a
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            G(8);
        }
        return set;
    }

    @Override // L7.InterfaceC1291p
    public h0 g() {
        h0 h0Var = h0.f7335a;
        if (h0Var == null) {
            G(11);
        }
        return h0Var;
    }

    @Override // L7.InterfaceC1276a
    public C8.S getReturnType() {
        return getType();
    }

    @Override // L7.s0
    public C8.S getType() {
        C8.S type = getValue().getType();
        if (type == null) {
            G(6);
        }
        return type;
    }

    @Override // L7.InterfaceC1276a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            G(5);
        }
        return list;
    }

    @Override // L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u abstractC1295u = AbstractC1294t.f7348f;
        if (abstractC1295u == null) {
            G(9);
        }
        return abstractC1295u;
    }

    @Override // L7.InterfaceC1276a
    public c0 h0() {
        return null;
    }

    @Override // L7.InterfaceC1276a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            G(7);
        }
        return list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1324c(M7.h hVar, k8.f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            G(1);
        }
        if (fVar == null) {
            G(2);
        }
    }

    @Override // L7.j0
    public c0 c(G0 g02) {
        if (g02 == null) {
            G(3);
        }
        if (!g02.k()) {
            C8.S sP = b() instanceof InterfaceC1280e ? g02.p(getType(), N0.f594m) : g02.p(getType(), N0.f592k);
            if (sP == null) {
                return null;
            }
            if (sP != getType()) {
                return new N(b(), new C3503i(sP), getAnnotations());
            }
        }
        return this;
    }

    @Override // O7.AbstractC1334m, L7.InterfaceC1288m
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public L7.W a() {
        return this;
    }
}
