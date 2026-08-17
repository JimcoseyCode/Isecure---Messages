package w6;

import B6.g;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3485d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f33163a = new a(null);

    /* JADX INFO: renamed from: w6.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final g a(ThemedReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return new g(reactContext);
    }

    public final void b(g view, String interpolator) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(interpolator, "interpolator");
        view.setInterpolator(interpolator);
    }

    public final void c(g view, double d10) {
        AbstractC2855l.g(view, "view");
        view.setOffset(d10);
    }

    public final void d(g view, boolean z10) {
        AbstractC2855l.g(view, "view");
        view.setScrollKeyboardOffScreenWhenVisible(z10);
    }

    public final void e(g view, boolean z10) {
        AbstractC2855l.g(view, "view");
        view.setScrollKeyboardOnScreenWhenNotVisible(z10);
    }
}
