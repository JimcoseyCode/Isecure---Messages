package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/bridge/Callback;", "completionCallback", "Li7/B;", "initializeFromConfig", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "reset", "Landroid/view/View;", "viewToAnimate", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldAnimateLayout", "(Landroid/view/View;)Z", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "x", "y", "width", "height", "applyLayoutUpdate", "(Landroid/view/View;IIII)V", "Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;", "listener", "deleteView", "(Landroid/view/View;Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class LayoutAnimationController {
    public void applyLayoutUpdate(View view, int x10, int y10, int width, int height) {
        AbstractC2855l.g(view, "view");
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutAnimationController", LegacyArchitectureLogLevel.ERROR);
    }

    public void deleteView(View view, LayoutAnimationListener listener) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(listener, "listener");
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutAnimationController", LegacyArchitectureLogLevel.ERROR);
    }

    public final void initializeFromConfig(ReadableMap config, Callback completionCallback) {
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutAnimationController", LegacyArchitectureLogLevel.ERROR);
    }

    public void reset() {
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutAnimationController", LegacyArchitectureLogLevel.ERROR);
    }

    public boolean shouldAnimateLayout(View viewToAnimate) {
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutAnimationController", LegacyArchitectureLogLevel.ERROR);
        return false;
    }
}
