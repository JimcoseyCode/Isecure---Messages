package w8;

import C8.S;
import expo.modules.notifications.service.NotificationsService;

/* JADX INFO: renamed from: w8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3503i extends AbstractC3495a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3503i(S s10) {
        this(s10, null);
        if (s10 == null) {
            b(0);
        }
    }

    private static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = NotificationsService.EVENT_TYPE_KEY;
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C3503i(S s10, InterfaceC3501g interfaceC3501g) {
        super(s10, interfaceC3501g);
        if (s10 == null) {
            b(1);
        }
    }
}
