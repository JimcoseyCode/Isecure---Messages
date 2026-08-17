package com.facebook.react.views.scroll;

import android.graphics.Rect;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0082\b¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u001a\u0010\u000f\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/graphics/Rect;", "rect1", "rect2", PointerEventHelper.POINTER_TYPE_UNKNOWN, "rectsOverlap", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "subtag", "Lkotlin/Function0;", "block", "Li7/B;", "debugLog", "(Ljava/lang/String;Lw7/a;)V", "DEBUG_TAG", "Ljava/lang/String;", "IS_DEBUG_BUILD", "Z", "getIS_DEBUG_BUILD", "()Z", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class VirtualViewContainerKt {
    private static final String DEBUG_TAG = "VirtualViewContainerState";
    private static final boolean IS_DEBUG_BUILD;

    static {
        IS_DEBUG_BUILD = ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD || ReactBuildConfig.ENABLE_PERFETTO;
    }

    private static final void debugLog(String str, InterfaceC3487a interfaceC3487a) {
        if (getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerState:" + str, (String) interfaceC3487a.invoke());
        }
    }

    static /* synthetic */ void debugLog$default(String str, InterfaceC3487a interfaceC3487a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC3487a = new InterfaceC3487a() { // from class: com.facebook.react.views.scroll.VirtualViewContainerKt.debugLog.1
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return PointerEventHelper.POINTER_TYPE_UNKNOWN;
                }
            };
        }
        if (getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerState:" + str, (String) interfaceC3487a.invoke());
        }
    }

    public static final boolean getIS_DEBUG_BUILD() {
        return IS_DEBUG_BUILD;
    }

    public static final boolean rectsOverlap(Rect rect1, Rect rect2) {
        AbstractC2855l.g(rect1, "rect1");
        AbstractC2855l.g(rect2, "rect2");
        return rect1.top < rect2.bottom && rect2.top < rect1.bottom && rect1.left < rect2.right && rect2.left < rect1.right;
    }
}
