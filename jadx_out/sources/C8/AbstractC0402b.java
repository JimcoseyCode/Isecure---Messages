package C8;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: C8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0402b extends AbstractC0430p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0402b(B8.n nVar) {
        super(nVar);
        if (nVar == null) {
            G(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i10 == 2) {
            objArr[0] = "classifier";
        } else if (i10 != 3 && i10 != 4) {
            objArr[0] = "storageManager";
        }
        if (i10 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: H */
    public abstract InterfaceC1280e p();

    @Override // C8.AbstractC0435v
    protected boolean c(InterfaceC1283h interfaceC1283h) {
        if (interfaceC1283h == null) {
            G(2);
        }
        return (interfaceC1283h instanceof InterfaceC1280e) && a(p(), interfaceC1283h);
    }

    @Override // C8.v0
    public I7.i n() {
        I7.i iVarM = AbstractC3340e.m(p());
        if (iVarM == null) {
            G(1);
        }
        return iVarM;
    }

    @Override // C8.AbstractC0430p
    protected S r() {
        if (I7.i.u0(p())) {
            return null;
        }
        return n().i();
    }

    @Override // C8.AbstractC0430p
    protected Collection s(boolean z10) {
        InterfaceC1288m interfaceC1288mB = p().b();
        if (!(interfaceC1288mB instanceof InterfaceC1280e)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                G(3);
            }
            return list;
        }
        M8.k kVar = new M8.k();
        InterfaceC1280e interfaceC1280e = (InterfaceC1280e) interfaceC1288mB;
        kVar.add(interfaceC1280e.r());
        InterfaceC1280e interfaceC1280eR = interfaceC1280e.R();
        if (z10 && interfaceC1280eR != null) {
            kVar.add(interfaceC1280eR.r());
        }
        return kVar;
    }
}
