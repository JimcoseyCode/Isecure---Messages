package I6;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final void a(ReactContext reactContext, Event event) {
        AbstractC2855l.g(reactContext, "<this>");
        AbstractC2855l.g(event, "event");
        UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
        AbstractC2855l.e(uIManager, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        ((FabricUIManager) uIManager).getEventDispatcher().dispatchEvent(event);
    }
}
