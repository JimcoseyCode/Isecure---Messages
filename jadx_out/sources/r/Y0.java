package r;

import F.C0473c0;
import F.M;
import androidx.lifecycle.AbstractC1776x;
import java.util.Objects;
import y.AbstractC3583h0;
import y.AbstractC3599t;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0473c0 f31194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.A f31195b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31196a;

        static {
            int[] iArr = new int[M.a.values().length];
            f31196a = iArr;
            try {
                iArr[M.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31196a[M.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31196a[M.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31196a[M.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31196a[M.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31196a[M.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31196a[M.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31196a[M.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    Y0(C0473c0 c0473c0) {
        this.f31194a = c0473c0;
        androidx.lifecycle.A a10 = new androidx.lifecycle.A();
        this.f31195b = a10;
        a10.l(AbstractC3599t.a(AbstractC3599t.b.CLOSED));
    }

    private AbstractC3599t b() {
        return this.f31194a.c() ? AbstractC3599t.a(AbstractC3599t.b.OPENING) : AbstractC3599t.a(AbstractC3599t.b.PENDING_OPEN);
    }

    public AbstractC1776x a() {
        return this.f31195b;
    }

    public void c(M.a aVar, AbstractC3599t.a aVar2) {
        AbstractC3599t abstractC3599tB;
        if (aVar2 == null || aVar2.d() != 8) {
            switch (a.f31196a[aVar.ordinal()]) {
                case 1:
                    abstractC3599tB = b();
                    break;
                case 2:
                    abstractC3599tB = AbstractC3599t.b(AbstractC3599t.b.OPENING, aVar2);
                    break;
                case 3:
                case 4:
                    abstractC3599tB = AbstractC3599t.b(AbstractC3599t.b.OPEN, aVar2);
                    break;
                case 5:
                case 6:
                    abstractC3599tB = AbstractC3599t.b(AbstractC3599t.b.CLOSING, aVar2);
                    break;
                case 7:
                case 8:
                    abstractC3599tB = AbstractC3599t.b(AbstractC3599t.b.CLOSED, aVar2);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + aVar);
            }
        } else {
            abstractC3599tB = AbstractC3599t.b(AbstractC3599t.b.CLOSED, aVar2);
        }
        AbstractC3583h0.a("CameraStateMachine", "New public camera state " + abstractC3599tB + " from " + aVar + " and " + aVar2);
        if (Objects.equals((AbstractC3599t) this.f31195b.e(), abstractC3599tB)) {
            return;
        }
        AbstractC3583h0.a("CameraStateMachine", "Publishing new public camera state " + abstractC3599tB);
        this.f31195b.l(abstractC3599tB);
    }
}
