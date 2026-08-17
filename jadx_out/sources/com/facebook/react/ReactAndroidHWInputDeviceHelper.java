package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/ReactAndroidHWInputDeviceHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "targetViewId", "eventKeyAction", "Li7/B;", "dispatchEvent", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;II)V", "Landroid/view/KeyEvent;", "ev", "handleKeyEvent", "(Landroid/view/KeyEvent;Lcom/facebook/react/bridge/ReactContext;)V", "Landroid/view/View;", "newFocusedView", "onFocusChanged", "(Landroid/view/View;Lcom/facebook/react/bridge/ReactContext;)V", "clearFocus", "(Lcom/facebook/react/bridge/ReactContext;)V", "lastFocusedViewId", "I", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactAndroidHWInputDeviceHelper {
    private static final Companion Companion = new Companion(null);
    private static final Map<Integer, String> KEY_EVENTS_ACTIONS = K.l(i7.t.a(23, "select"), i7.t.a(66, "select"), i7.t.a(62, "select"), i7.t.a(85, "playPause"), i7.t.a(89, "rewind"), i7.t.a(90, "fastForward"), i7.t.a(86, "stop"), i7.t.a(87, "next"), i7.t.a(88, "previous"), i7.t.a(19, "up"), i7.t.a(22, ViewProps.RIGHT), i7.t.a(20, "down"), i7.t.a(21, ViewProps.LEFT), i7.t.a(165, "info"), i7.t.a(82, "menu"), i7.t.a(166, "channelUp"), i7.t.a(167, "channelDown"));
    private int lastFocusedViewId = -1;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/ReactAndroidHWInputDeviceHelper$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "KEY_EVENTS_ACTIONS", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void dispatchEvent(ReactContext context, String eventType, int targetViewId, int eventKeyAction) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", eventType);
        writableNativeMap.putInt("eventKeyAction", eventKeyAction);
        if (targetViewId != -1) {
            writableNativeMap.putInt("tag", targetViewId);
        }
        context.emitDeviceEvent("onHWKeyEvent", writableNativeMap);
    }

    static /* synthetic */ void dispatchEvent$default(ReactAndroidHWInputDeviceHelper reactAndroidHWInputDeviceHelper, ReactContext reactContext, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        reactAndroidHWInputDeviceHelper.dispatchEvent(reactContext, str, i10, i11);
    }

    public final void clearFocus(ReactContext context) {
        ReactAndroidHWInputDeviceHelper reactAndroidHWInputDeviceHelper;
        AbstractC2855l.g(context, "context");
        int i10 = this.lastFocusedViewId;
        if (i10 != -1) {
            reactAndroidHWInputDeviceHelper = this;
            dispatchEvent$default(reactAndroidHWInputDeviceHelper, context, "blur", i10, 0, 8, null);
        } else {
            reactAndroidHWInputDeviceHelper = this;
        }
        reactAndroidHWInputDeviceHelper.lastFocusedViewId = -1;
    }

    public final void handleKeyEvent(KeyEvent ev, ReactContext context) {
        AbstractC2855l.g(ev, "ev");
        AbstractC2855l.g(context, "context");
        int keyCode = ev.getKeyCode();
        int action = ev.getAction();
        if (action == 1 || action == 0) {
            Map<Integer, String> map = KEY_EVENTS_ACTIONS;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                dispatchEvent(context, map.get(Integer.valueOf(keyCode)), this.lastFocusedViewId, action);
            }
        }
    }

    public final void onFocusChanged(View newFocusedView, ReactContext context) {
        AbstractC2855l.g(newFocusedView, "newFocusedView");
        AbstractC2855l.g(context, "context");
        if (this.lastFocusedViewId == newFocusedView.getId()) {
            return;
        }
        int i10 = this.lastFocusedViewId;
        if (i10 != -1) {
            dispatchEvent$default(this, context, "blur", i10, 0, 8, null);
        }
        this.lastFocusedViewId = newFocusedView.getId();
        dispatchEvent$default(this, context, "focus", newFocusedView.getId(), 0, 8, null);
    }
}
