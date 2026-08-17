package w8;

import C8.S;
import L7.InterfaceC1276a;

/* JADX INFO: renamed from: w8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3498d extends AbstractC3495a implements InterfaceC3501g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1276a f33172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3498d(InterfaceC1276a interfaceC1276a, S s10, InterfaceC3501g interfaceC3501g) {
        super(s10, interfaceC3501g);
        if (interfaceC1276a == null) {
            b(0);
        }
        if (s10 == null) {
            b(1);
        }
        this.f33172c = interfaceC1276a;
    }

    private static /* synthetic */ void b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f33172c + "}";
    }
}
