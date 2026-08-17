package w6;

import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f33165a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final D6.e a(ThemedReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return new D6.e(reactContext);
    }

    public final void b(D6.e view, boolean z10) {
        AbstractC2855l.g(view, "view");
        if (z10) {
            view.d();
        } else {
            view.c();
        }
    }
}
