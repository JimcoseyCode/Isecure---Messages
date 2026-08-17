package M6;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C2311y;
import com.swmansion.rnscreens.F;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2311y f7528a;

    public i(C2311y screen) {
        AbstractC2855l.g(screen, "screen");
        this.f7528a = screen;
    }

    public final C2735B a() {
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF == null) {
            return null;
        }
        eventDispatcherF.dispatchEvent(new f(g(), this.f7528a.getId()));
        return C2735B.f28704a;
    }

    public final C2735B b() {
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF == null) {
            return null;
        }
        eventDispatcherF.dispatchEvent(new g(g(), this.f7528a.getId()));
        return C2735B.f28704a;
    }

    public final C2735B c() {
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF == null) {
            return null;
        }
        eventDispatcherF.dispatchEvent(new k(g(), this.f7528a.getId()));
        return C2735B.f28704a;
    }

    public final C2735B d() {
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF == null) {
            return null;
        }
        eventDispatcherF.dispatchEvent(new l(g(), this.f7528a.getId()));
        return C2735B.f28704a;
    }

    public final void e(float f10, boolean z10, boolean z11) {
        float fK = B7.d.k(f10, 0.0f, 1.0f);
        short sA = F.INSTANCE.a(fK);
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF != null) {
            eventDispatcherF.dispatchEvent(new j(g(), this.f7528a.getId(), fK, z10, z11, sA));
        }
    }

    public final EventDispatcher f() {
        return this.f7528a.getReactEventDispatcher();
    }

    public final int g() {
        return UIManagerHelper.getSurfaceId(this.f7528a);
    }
}
