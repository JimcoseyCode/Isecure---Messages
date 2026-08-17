package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.events.TouchEventType;
import com.facebook.react.views.textinput.ReactContentSizeChangedEvent;
import com.facebook.react.views.textinput.ReactTextChangedEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/UIManagerModuleConstants;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "bubblingEventTypeConstants", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "directEventTypeConstants", "constants", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UIManagerModuleConstants {
    public static final UIManagerModuleConstants INSTANCE = new UIManagerModuleConstants();
    public static final Map<String, Object> bubblingEventTypeConstants;
    public static final Map<String, Object> constants;
    public static final Map<String, Object> directEventTypeConstants;

    static {
        Pair pairA = i7.t.a(ReactTextChangedEvent.EVENT_NAME, j7.K.f(i7.t.a("phasedRegistrationNames", j7.K.l(i7.t.a("bubbled", "onChange"), i7.t.a("captured", "onChangeCapture")))));
        Pair pairA2 = i7.t.a("topSelect", j7.K.f(i7.t.a("phasedRegistrationNames", j7.K.l(i7.t.a("bubbled", "onSelect"), i7.t.a("captured", "onSelectCapture")))));
        TouchEventType.Companion companion = TouchEventType.INSTANCE;
        bubblingEventTypeConstants = j7.K.l(pairA, pairA2, i7.t.a(companion.getJSEventName(TouchEventType.START), j7.K.f(i7.t.a("phasedRegistrationNames", j7.K.l(i7.t.a("bubbled", "onTouchStart"), i7.t.a("captured", "onTouchStartCapture"))))), i7.t.a(companion.getJSEventName(TouchEventType.MOVE), j7.K.f(i7.t.a("phasedRegistrationNames", j7.K.l(i7.t.a("bubbled", "onTouchMove"), i7.t.a("captured", "onTouchMoveCapture"))))), i7.t.a(companion.getJSEventName(TouchEventType.END), j7.K.f(i7.t.a("phasedRegistrationNames", j7.K.l(i7.t.a("bubbled", "onTouchEnd"), i7.t.a("captured", "onTouchEndCapture"))))), i7.t.a(companion.getJSEventName(TouchEventType.CANCEL), j7.K.f(i7.t.a("phasedRegistrationNames", j7.K.l(i7.t.a("bubbled", "onTouchCancel"), i7.t.a("captured", "onTouchCancelCapture"))))));
        directEventTypeConstants = j7.K.l(i7.t.a(ReactContentSizeChangedEvent.EVENT_NAME, j7.K.f(i7.t.a("registrationName", "onContentSizeChange"))), i7.t.a("topLayout", j7.K.f(i7.t.a("registrationName", "onLayout"))), i7.t.a("topLoadingError", j7.K.f(i7.t.a("registrationName", "onLoadingError"))), i7.t.a("topLoadingFinish", j7.K.f(i7.t.a("registrationName", "onLoadingFinish"))), i7.t.a("topLoadingStart", j7.K.f(i7.t.a("registrationName", "onLoadingStart"))), i7.t.a("topSelectionChange", j7.K.f(i7.t.a("registrationName", "onSelectionChange"))), i7.t.a("topMessage", j7.K.f(i7.t.a("registrationName", "onMessage"))), i7.t.a("topScrollBeginDrag", j7.K.f(i7.t.a("registrationName", "onScrollBeginDrag"))), i7.t.a("topScrollEndDrag", j7.K.f(i7.t.a("registrationName", "onScrollEndDrag"))), i7.t.a("topScroll", j7.K.f(i7.t.a("registrationName", "onScroll"))), i7.t.a("topMomentumScrollBegin", j7.K.f(i7.t.a("registrationName", "onMomentumScrollBegin"))), i7.t.a("topMomentumScrollEnd", j7.K.f(i7.t.a("registrationName", "onMomentumScrollEnd"))));
        constants = j7.K.l(i7.t.a("UIView", j7.K.f(i7.t.a("ContentMode", j7.K.l(i7.t.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal())), i7.t.a("ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal())), i7.t.a("ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal())))))), i7.t.a("StyleConstants", j7.K.f(i7.t.a("PointerEventsValues", j7.K.l(i7.t.a("none", Integer.valueOf(PointerEvents.NONE.ordinal())), i7.t.a("boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal())), i7.t.a("boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal())), i7.t.a("unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal())))))), i7.t.a("AccessibilityEventTypes", j7.K.l(i7.t.a("typeWindowStateChanged", 32), i7.t.a("typeViewFocused", 8), i7.t.a("typeViewClicked", 1))));
    }

    private UIManagerModuleConstants() {
    }
}
