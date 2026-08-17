package expo.modules.adapters.react.views;

import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewManagerAdapterUtils {
    public static String normalizeEventName(String str) {
        if (!str.startsWith(ViewProps.ON)) {
            return str;
        }
        return ViewProps.TOP + str.substring(2);
    }
}
