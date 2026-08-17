package C8;

import L7.InterfaceC1280e;
import L7.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o8.AbstractC3027i;

/* JADX INFO: renamed from: C8.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C0434u extends AbstractC0402b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1280e f687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Collection f689f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0434u(InterfaceC1280e interfaceC1280e, List list, Collection collection, B8.n nVar) {
        super(nVar);
        if (interfaceC1280e == null) {
            G(0);
        }
        if (list == null) {
            G(1);
        }
        if (collection == null) {
            G(2);
        }
        if (nVar == null) {
            G(3);
        }
        this.f687d = interfaceC1280e;
        this.f688e = Collections.unmodifiableList(new ArrayList(list));
        this.f689f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // C8.AbstractC0435v, C8.v0
    /* JADX INFO: renamed from: H */
    public InterfaceC1280e p() {
        InterfaceC1280e interfaceC1280e = this.f687d;
        if (interfaceC1280e == null) {
            G(5);
        }
        return interfaceC1280e;
    }

    @Override // C8.v0
    public List getParameters() {
        List list = this.f688e;
        if (list == null) {
            G(4);
        }
        return list;
    }

    @Override // C8.AbstractC0430p
    protected Collection m() {
        Collection collection = this.f689f;
        if (collection == null) {
            G(6);
        }
        return collection;
    }

    @Override // C8.v0
    public boolean q() {
        return true;
    }

    public String toString() {
        return AbstractC3027i.m(this.f687d).b();
    }

    @Override // C8.AbstractC0430p
    protected L7.k0 u() {
        k0.a aVar = k0.a.f7338a;
        if (aVar == null) {
            G(7);
        }
        return aVar;
    }
}
