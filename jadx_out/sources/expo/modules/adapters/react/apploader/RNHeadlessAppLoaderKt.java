package expo.modules.adapters.react.apploader;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"appRecords", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ReactContext;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RNHeadlessAppLoaderKt {
    private static final Map<String, ReactContext> appRecords = new LinkedHashMap();
}
