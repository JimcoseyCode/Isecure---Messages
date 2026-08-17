package com.facebook.react.uimanager;

import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010Je\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\u001c\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\u0013\u0012\u0006\b\u0000\u0012\u00020\u00130\u00120\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0001¢\u0006\u0004\b\b\u0010\u0017J\u008b\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\u0016\u0010\u0018\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0013\u0012\u0006\b\u0000\u0012\u00020\u00130\u00122\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010\"\u001a\u00020\u000e2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010)R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0003\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/facebook/react/uimanager/UIManagerModuleConstantsHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerResolver;", "resolver", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "internal_createConstants", "(Lcom/facebook/react/uimanager/ViewManagerResolver;)Ljava/util/Map;", "createConstants", "viewManagerName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "directEvents", "Li7/B;", "validateDirectEventNames", "(Ljava/lang/String;Ljava/util/Map;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ViewManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagers", "allBubblingEventTypes", "allDirectEventTypes", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "viewManager", "defaultBubblingEvents", "defaultDirectEvents", "cumulativeBubblingEventTypes", "cumulativeDirectEventTypes", "internal_createConstantsForViewManager", "(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "createConstantsForViewManager", "dest", "source", "recursiveMerge", "(Ljava/util/Map;Ljava/util/Map;)V", "eventsToNormalize", "normalizeEventTypes$ReactAndroid_release", "(Ljava/util/Map;)Ljava/util/Map;", "normalizeEventTypes", "TAG", "Ljava/lang/String;", "BUBBLING_EVENTS_KEY", "DIRECT_EVENTS_KEY", "getDefaultExportableEventTypes", "()Ljava/util/Map;", "getDefaultExportableEventTypes$annotations", "defaultExportableEventTypes", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UIManagerModuleConstantsHelper {
    private static final String BUBBLING_EVENTS_KEY = "bubblingEventTypes";
    private static final String DIRECT_EVENTS_KEY = "directEventTypes";
    public static final UIManagerModuleConstantsHelper INSTANCE = new UIManagerModuleConstantsHelper();
    private static final String TAG = "UIManagerModuleConstantsHelper";

    private UIManagerModuleConstantsHelper() {
    }

    public static final Map<String, Object> getDefaultExportableEventTypes() {
        return j7.K.l(i7.t.a(BUBBLING_EVENTS_KEY, UIManagerModuleConstants.bubblingEventTypeConstants), i7.t.a(DIRECT_EVENTS_KEY, UIManagerModuleConstants.directEventTypeConstants));
    }

    public static final Map<String, Object> internal_createConstants(ViewManagerResolver resolver) {
        AbstractC2855l.g(resolver, "resolver");
        return j7.K.o(UIManagerModuleConstants.constants, j7.K.l(i7.t.a("ViewManagerNames", new ArrayList(resolver.getViewManagerNames())), i7.t.a("LazyViewManagersEnabled", Boolean.TRUE)));
    }

    public static final Map<String, Object> internal_createConstantsForViewManager(ViewManager viewManager, Map<String, Object> defaultBubblingEvents, Map<String, Object> defaultDirectEvents, Map<String, Object> cumulativeBubblingEventTypes, Map<String, Object> cumulativeDirectEventTypes) {
        AbstractC2855l.g(viewManager, "viewManager");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer() && ReactNativeNewArchitectureFeatureFlags.useFabricInterop()) {
                exportedCustomBubblingEventTypeConstants = INSTANCE.normalizeEventTypes$ReactAndroid_release(exportedCustomBubblingEventTypeConstants);
            }
            UIManagerModuleConstantsHelper uIManagerModuleConstantsHelper = INSTANCE;
            uIManagerModuleConstantsHelper.recursiveMerge(cumulativeBubblingEventTypes, exportedCustomBubblingEventTypeConstants);
            uIManagerModuleConstantsHelper.recursiveMerge(exportedCustomBubblingEventTypeConstants, defaultBubblingEvents);
            linkedHashMap.put(BUBBLING_EVENTS_KEY, exportedCustomBubblingEventTypeConstants);
        } else if (defaultBubblingEvents != null) {
            linkedHashMap.put(BUBBLING_EVENTS_KEY, defaultBubblingEvents);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        UIManagerModuleConstantsHelper uIManagerModuleConstantsHelper2 = INSTANCE;
        String name = viewManager.getName();
        AbstractC2855l.f(name, "getName(...)");
        uIManagerModuleConstantsHelper2.validateDirectEventNames(name, exportedCustomDirectEventTypeConstants);
        if (exportedCustomDirectEventTypeConstants != null) {
            if (ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer() && ReactNativeNewArchitectureFeatureFlags.useFabricInterop()) {
                exportedCustomDirectEventTypeConstants = uIManagerModuleConstantsHelper2.normalizeEventTypes$ReactAndroid_release(exportedCustomDirectEventTypeConstants);
            }
            uIManagerModuleConstantsHelper2.recursiveMerge(cumulativeDirectEventTypes, exportedCustomDirectEventTypeConstants);
            uIManagerModuleConstantsHelper2.recursiveMerge(exportedCustomDirectEventTypeConstants, defaultDirectEvents);
            linkedHashMap.put(DIRECT_EVENTS_KEY, exportedCustomDirectEventTypeConstants);
        } else if (defaultDirectEvents != null) {
            linkedHashMap.put(DIRECT_EVENTS_KEY, defaultDirectEvents);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            linkedHashMap.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            linkedHashMap.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            AbstractC2855l.d(nativeProps);
            linkedHashMap.put("NativeProps", nativeProps);
        }
        return linkedHashMap;
    }

    private final void recursiveMerge(Map<String, Object> dest, Map<String, Object> source) {
        if (dest == null || source == null || source.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : source.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Object obj = dest.get(key);
            if (obj != null && kotlin.jvm.internal.I.l(value) && kotlin.jvm.internal.I.l(obj)) {
                if (!(obj instanceof HashMap)) {
                    HashMap map = new HashMap((Map) obj);
                    dest.replace(key, kotlin.jvm.internal.I.c(map));
                    obj = map;
                }
                Map<String, Object> mapC = kotlin.jvm.internal.I.c(obj);
                AbstractC2855l.e(value, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                recursiveMerge(mapC, kotlin.jvm.internal.I.c(value));
            } else {
                dest.put(key, value);
            }
        }
    }

    private final void validateDirectEventNames(String viewManagerName, Map<String, Object> directEvents) {
        String str;
        if (!ReactBuildConfig.DEBUG || directEvents == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : directEvents.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (kotlin.jvm.internal.I.l(value) && (str = (String) ((Map) value).get("registrationName")) != null && P8.q.K(key, ViewProps.TOP, false, 2, null) && P8.q.K(str, ViewProps.ON, false, 2, null)) {
                String strSubstring = key.substring(3);
                AbstractC2855l.f(strSubstring, "substring(...)");
                String strSubstring2 = str.substring(2);
                AbstractC2855l.f(strSubstring2, "substring(...)");
                if (!AbstractC2855l.b(strSubstring, strSubstring2)) {
                    AbstractC2325a.m(TAG, "Direct event name for '" + viewManagerName + "' doesn't correspond to the naming convention, expected 'topEventName'->'onEventName', got '" + key + "'->'" + str + "'");
                }
            }
        }
    }

    public final Map<String, Object> normalizeEventTypes$ReactAndroid_release(Map<String, Object> eventsToNormalize) {
        String strSubstring;
        AbstractC2855l.g(eventsToNormalize, "eventsToNormalize");
        HashSet<String> hashSet = new HashSet();
        for (String str : eventsToNormalize.keySet()) {
            if (!P8.q.K(str, ViewProps.TOP, false, 2, null)) {
                hashSet.add(str);
            }
        }
        if (!(eventsToNormalize instanceof HashMap)) {
            eventsToNormalize = new HashMap(eventsToNormalize);
        }
        for (String str2 : hashSet) {
            Object obj = eventsToNormalize.get(str2);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (P8.q.K(str2, ViewProps.ON, false, 2, null)) {
                strSubstring = str2.substring(2);
                AbstractC2855l.f(strSubstring, "substring(...)");
            } else {
                String strSubstring2 = str2.substring(0, 1);
                AbstractC2855l.f(strSubstring2, "substring(...)");
                Locale locale = Locale.getDefault();
                AbstractC2855l.f(locale, "getDefault(...)");
                String upperCase = strSubstring2.toUpperCase(locale);
                AbstractC2855l.f(upperCase, "toUpperCase(...)");
                String strSubstring3 = str2.substring(1);
                AbstractC2855l.f(strSubstring3, "substring(...)");
                strSubstring = upperCase + strSubstring3;
            }
            eventsToNormalize.put(ViewProps.TOP + strSubstring, obj);
        }
        return eventsToNormalize;
    }

    public static final Map<String, Object> internal_createConstants(List<? extends ViewManager> viewManagers, Map<String, Object> allBubblingEventTypes, Map<String, Object> allDirectEventTypes) {
        AbstractC2855l.g(viewManagers, "viewManagers");
        Map<String, Object> mapW = j7.K.w(UIManagerModuleConstants.constants);
        Map<String, Object> map = UIManagerModuleConstants.bubblingEventTypeConstants;
        Map<String, Object> map2 = UIManagerModuleConstants.directEventTypeConstants;
        if (allBubblingEventTypes != null) {
            allBubblingEventTypes.putAll(map);
        }
        if (allDirectEventTypes != null) {
            allDirectEventTypes.putAll(map2);
        }
        for (ViewManager viewManager : viewManagers) {
            String name = viewManager.getName();
            AbstractC2855l.f(name, "getName(...)");
            Map<String, Object> mapInternal_createConstantsForViewManager = internal_createConstantsForViewManager(viewManager, null, null, allBubblingEventTypes, allDirectEventTypes);
            if (!mapInternal_createConstantsForViewManager.isEmpty()) {
                mapW.put(name, mapInternal_createConstantsForViewManager);
            }
        }
        mapW.put("genericBubblingEventTypes", map);
        mapW.put("genericDirectEventTypes", map2);
        return mapW;
    }

    public static /* synthetic */ void getDefaultExportableEventTypes$annotations() {
    }
}
