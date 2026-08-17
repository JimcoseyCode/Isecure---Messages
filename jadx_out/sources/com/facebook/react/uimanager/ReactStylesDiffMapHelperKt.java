package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getBackingMap", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReactStylesDiffMapHelperKt {
    public static final ReadableMap getBackingMap(ReactStylesDiffMap reactStylesDiffMap) {
        AbstractC2855l.g(reactStylesDiffMap, "<this>");
        ReadableMap backingMap = ReactStylesDiffMapBackingFieldAccessor.getBackingMap(reactStylesDiffMap);
        AbstractC2855l.f(backingMap, "getBackingMap(...)");
        return backingMap;
    }
}
