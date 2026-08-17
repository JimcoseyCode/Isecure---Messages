package C8;

import expo.modules.notifications.service.NotificationsService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class D0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N0 f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f558b;

    public D0(N0 n02, S s10) {
        if (n02 == null) {
            c(0);
        }
        if (s10 == null) {
            c(1);
        }
        this.f557a = n02;
        this.f558b = s10;
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // C8.B0
    public N0 a() {
        N0 n02 = this.f557a;
        if (n02 == null) {
            c(4);
        }
        return n02;
    }

    @Override // C8.B0
    public boolean b() {
        return false;
    }

    @Override // C8.B0
    public S getType() {
        S s10 = this.f558b;
        if (s10 == null) {
            c(5);
        }
        return s10;
    }

    @Override // C8.B0
    public B0 o(D8.g gVar) {
        if (gVar == null) {
            c(6);
        }
        return new D0(this.f557a, gVar.a(this.f558b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(S s10) {
        this(N0.f592k, s10);
        if (s10 == null) {
            c(2);
        }
    }
}
