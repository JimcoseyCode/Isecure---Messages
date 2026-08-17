package O7;

import L7.InterfaceC1288m;

/* JADX INFO: renamed from: O7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1334m extends M7.b implements InterfaceC1288m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k8.f f8477h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1334m(M7.h hVar, k8.f fVar) {
        super(hVar);
        if (hVar == null) {
            G(0);
        }
        if (fVar == null) {
            G(1);
        }
        this.f8477h = fVar;
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String L(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            G(4);
        }
        try {
            String str = n8.n.f30125k.O(interfaceC1288m) + "[" + interfaceC1288m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC1288m)) + "]";
            if (str == null) {
                G(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC1288m.getClass().getSimpleName() + " " + interfaceC1288m.getName();
            if (str2 == null) {
                G(6);
            }
            return str2;
        }
    }

    @Override // L7.J
    public k8.f getName() {
        k8.f fVar = this.f8477h;
        if (fVar == null) {
            G(2);
        }
        return fVar;
    }

    public String toString() {
        return L(this);
    }

    public InterfaceC1288m a() {
        return this;
    }
}
