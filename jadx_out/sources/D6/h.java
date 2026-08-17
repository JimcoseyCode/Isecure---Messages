package D6;

import android.view.MotionEvent;
import com.facebook.react.uimanager.RootView;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface h extends RootView {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static void a(h hVar, MotionEvent ev) {
            AbstractC2855l.g(ev, "ev");
            hVar.onChildStartedNativeGesture(null, ev);
        }
    }
}
