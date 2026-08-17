package expo.modules.kotlin.events;

import P8.q;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"normalizeEventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventName", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class KModuleEventEmitterWrapperKt {
    public static final String normalizeEventName(String eventName) {
        AbstractC2855l.g(eventName, "eventName");
        if (!q.K(eventName, ViewProps.ON, false, 2, null)) {
            return eventName;
        }
        String strSubstring = eventName.substring(2);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return ViewProps.TOP + strSubstring;
    }
}
