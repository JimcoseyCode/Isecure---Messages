package K;

import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y.AbstractC3583h0;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements V.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6997e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.i f6998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V.j f7001d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(V.i iVar) {
            return new k(iVar, null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(V.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k kVar) {
        synchronized (kVar.f6999b) {
            try {
                if (kVar.f7001d == null) {
                    AbstractC3583h0.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                kVar.e();
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (this.f6999b) {
            try {
                if (this.f7000c) {
                    V.i iVar = this.f6998a;
                    if (iVar != null) {
                        iVar.clear();
                    } else {
                        AbstractC3583h0.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    AbstractC3583h0.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f7000c = false;
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        synchronized (this.f6999b) {
            try {
                V.j jVar = this.f7001d;
                if (jVar != null) {
                    jVar.a();
                }
                this.f7001d = null;
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final k g(V.i iVar) {
        return f6997e.a(iVar);
    }

    @Override // y.V.i
    public void a(long j10, V.j screenFlashListener) {
        AbstractC2855l.g(screenFlashListener, "screenFlashListener");
        synchronized (this.f6999b) {
            this.f7000c = true;
            this.f7001d = screenFlashListener;
            C2735B c2735b = C2735B.f28704a;
        }
        V.i iVar = this.f6998a;
        if (iVar != null) {
            iVar.a(j10, new V.j() { // from class: K.j
                @Override // y.V.j
                public final void a() {
                    k.c(this.f6996a);
                }
            });
        } else {
            AbstractC3583h0.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override // y.V.i
    public void clear() {
        d();
    }

    public final void f() {
        e();
        d();
    }

    public final V.i h() {
        return this.f6998a;
    }

    private k(V.i iVar) {
        this.f6998a = iVar;
        this.f6999b = new Object();
    }
}
