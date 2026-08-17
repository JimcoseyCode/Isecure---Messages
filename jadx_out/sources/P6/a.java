package P6;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0095a f8845d = new C0095a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f8846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventDispatcher f8848c;

    /* JADX INFO: renamed from: P6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0095a {
        public /* synthetic */ C0095a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0095a() {
        }
    }

    public a(ReactContext reactContext, int i10) {
        AbstractC2855l.g(reactContext, "reactContext");
        this.f8846a = reactContext;
        this.f8847b = i10;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, i10);
        if (eventDispatcherForReactTag != null) {
            this.f8848c = eventDispatcherForReactTag;
            return;
        }
        throw new IllegalStateException(("[RNScreens] Nullish event dispatcher for view with tag: " + i10).toString());
    }

    protected final EventDispatcher e() {
        return this.f8848c;
    }

    protected final int f() {
        return UIManagerHelper.getSurfaceId(this.f8846a);
    }

    public final int g() {
        return this.f8847b;
    }
}
