package O7;

import L7.InterfaceC1288m;
import w8.InterfaceC3501g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class N extends AbstractC1324c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC1288m f8405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC3501g f8406j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1288m interfaceC1288m, InterfaceC3501g interfaceC3501g, M7.h hVar) {
        this(interfaceC1288m, interfaceC3501g, hVar, k8.h.f29228i);
        if (interfaceC1288m == null) {
            G(0);
        }
        if (interfaceC3501g == null) {
            G(1);
        }
        if (hVar == null) {
            G(2);
        }
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // L7.InterfaceC1288m
    public InterfaceC1288m b() {
        InterfaceC1288m interfaceC1288m = this.f8405i;
        if (interfaceC1288m == null) {
            G(8);
        }
        return interfaceC1288m;
    }

    @Override // L7.c0
    public InterfaceC3501g getValue() {
        InterfaceC3501g interfaceC3501g = this.f8406j;
        if (interfaceC3501g == null) {
            G(7);
        }
        return interfaceC3501g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1288m interfaceC1288m, InterfaceC3501g interfaceC3501g, M7.h hVar, k8.f fVar) {
        super(hVar, fVar);
        if (interfaceC1288m == null) {
            G(3);
        }
        if (interfaceC3501g == null) {
            G(4);
        }
        if (hVar == null) {
            G(5);
        }
        if (fVar == null) {
            G(6);
        }
        this.f8405i = interfaceC1288m;
        this.f8406j = interfaceC3501g;
    }
}
