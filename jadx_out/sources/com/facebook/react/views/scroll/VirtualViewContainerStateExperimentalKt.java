package com.facebook.react.views.scroll;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a(\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "subtag", "Lkotlin/Function0;", "block", "Li7/B;", "debugLog", "(Ljava/lang/String;Lw7/a;)V", "DEBUG_TAG", "Ljava/lang/String;", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class VirtualViewContainerStateExperimentalKt {
    private static final String DEBUG_TAG = "VirtualViewContainerStateExperimental";

    private static final void debugLog(String str, InterfaceC3487a interfaceC3487a) {
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:" + str, (String) interfaceC3487a.invoke());
        }
    }

    static /* synthetic */ void debugLog$default(String str, InterfaceC3487a interfaceC3487a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC3487a = new InterfaceC3487a() { // from class: com.facebook.react.views.scroll.VirtualViewContainerStateExperimentalKt.debugLog.1
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return PointerEventHelper.POINTER_TYPE_UNKNOWN;
                }
            };
        }
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:" + str, (String) interfaceC3487a.invoke());
        }
    }
}
