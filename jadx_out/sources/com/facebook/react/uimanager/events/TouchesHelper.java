package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import i7.C2750m;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0003R\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0014\u0010%\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001c¨\u0006'"}, d2 = {"Lcom/facebook/react/uimanager/events/TouchesHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/uimanager/events/TouchEvent;", "event", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/WritableMap;", "createPointersArray", "(Lcom/facebook/react/uimanager/events/TouchEvent;)[Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "touchEvent", "Li7/B;", "sendTouchesLegacy", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;Lcom/facebook/react/uimanager/events/TouchEvent;)V", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "eventEmitter", "sendTouchEvent", "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;Lcom/facebook/react/uimanager/events/TouchEvent;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "copyObjects", "objects", "Lcom/facebook/react/bridge/WritableArray;", "getWritableArray", "(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "TARGET_KEY", "Ljava/lang/String;", "getTARGET_KEY$annotations", "TARGET_SURFACE_KEY", "CHANGED_TOUCHES_KEY", "TOUCHES_KEY", "PAGE_X_KEY", "PAGE_Y_KEY", "TIMESTAMP_KEY", "POINTER_IDENTIFIER_KEY", "LOCATION_X_KEY", "LOCATION_Y_KEY", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TouchesHelper {
    private static final String CHANGED_TOUCHES_KEY = "changedTouches";
    private static final String LOCATION_X_KEY = "locationX";
    private static final String LOCATION_Y_KEY = "locationY";
    private static final String PAGE_X_KEY = "pageX";
    private static final String PAGE_Y_KEY = "pageY";
    private static final String POINTER_IDENTIFIER_KEY = "identifier";
    private static final String TARGET_SURFACE_KEY = "targetSurface";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String TOUCHES_KEY = "touches";
    public static final TouchesHelper INSTANCE = new TouchesHelper();
    public static final String TARGET_KEY = "target";

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TouchEventType.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TouchEventType.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TouchesHelper() {
    }

    private final WritableMap[] createPointersArray(TouchEvent event) {
        MotionEvent motionEvent = event.getMotionEvent();
        WritableMap[] writableMapArr = new WritableMap[motionEvent.getPointerCount()];
        float x10 = motionEvent.getX() - event.getViewX();
        float y10 = motionEvent.getY() - event.getViewY();
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            writableMapCreateMap.putDouble(PAGE_X_KEY, pixelUtil.pxToDp(motionEvent.getX(i10)));
            writableMapCreateMap.putDouble(PAGE_Y_KEY, pixelUtil.pxToDp(motionEvent.getY(i10)));
            float x11 = motionEvent.getX(i10) - x10;
            float y11 = motionEvent.getY(i10) - y10;
            writableMapCreateMap.putDouble(LOCATION_X_KEY, pixelUtil.pxToDp(x11));
            writableMapCreateMap.putDouble(LOCATION_Y_KEY, pixelUtil.pxToDp(y11));
            writableMapCreateMap.putInt(TARGET_SURFACE_KEY, event.getSurfaceId());
            writableMapCreateMap.putInt(TARGET_KEY, event.getViewTag());
            writableMapCreateMap.putDouble(TIMESTAMP_KEY, event.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEvent.getPointerId(i10));
            writableMapArr[i10] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    private final WritableArray getWritableArray(boolean copyObjects, WritableMap[] objects) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (WritableMap writableMapCopy : objects) {
            if (writableMapCopy != null) {
                if (copyObjects) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        return writableArrayCreateArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:3:0x002d, B:11:0x0051, B:31:0x0097, B:32:0x009b, B:34:0x00a1, B:36:0x00a9, B:38:0x00c4, B:14:0x0059, B:15:0x005e, B:16:0x005f, B:17:0x0062, B:19:0x0065, B:21:0x0069, B:23:0x006f, B:25:0x0076, B:26:0x0083, B:28:0x008b, B:30:0x0091), top: B:44:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void sendTouchEvent(RCTModernEventEmitter eventEmitter, TouchEvent event) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        Iterator itA;
        WritableMap writableMap;
        RCTModernEventEmitter eventEmitter2 = eventEmitter;
        AbstractC2855l.g(eventEmitter2, "eventEmitter");
        AbstractC2855l.g(event, "event");
        B3.a.c(0L, "TouchesHelper.sentTouchEventModern(" + event.getEventName() + ")");
        try {
            TouchEventType touchEventType = event.getTouchEventType();
            MotionEvent motionEvent = event.getMotionEvent();
            WritableMap[] writableMapArrCreatePointersArray = INSTANCE.createPointersArray(event);
            int i10 = WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
            if (i10 == 1) {
                WritableMap writableMap2 = writableMapArrCreatePointersArray[motionEvent.getActionIndex()];
                writableMapArr = new WritableMap[]{writableMap2 != null ? writableMap2.copy() : null};
            } else if (i10 == 2) {
                int actionIndex = motionEvent.getActionIndex();
                WritableMap writableMap3 = writableMapArrCreatePointersArray[actionIndex];
                writableMapArrCreatePointersArray[actionIndex] = null;
                writableMapArr = new WritableMap[]{writableMap3};
            } else {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new C2750m();
                    }
                    writableMapArr2 = new WritableMap[0];
                    writableMapArr = writableMapArrCreatePointersArray;
                    itA = AbstractC2845b.a(writableMapArr);
                    while (itA.hasNext()) {
                        WritableMap writableMap4 = (WritableMap) itA.next();
                        if (writableMap4 != null) {
                            WritableMap writableMapCopy = writableMap4.copy();
                            TouchesHelper touchesHelper = INSTANCE;
                            WritableArray writableArray = touchesHelper.getWritableArray(true, writableMapArr);
                            WritableArray writableArray2 = touchesHelper.getWritableArray(true, writableMapArr2);
                            writableMapCopy.putArray(CHANGED_TOUCHES_KEY, writableArray);
                            writableMapCopy.putArray(TOUCHES_KEY, writableArray2);
                            writableMap = writableMapCopy;
                        } else {
                            writableMap = null;
                        }
                        eventEmitter2.receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), 0, writableMap, event.getEventCategory());
                        eventEmitter2 = eventEmitter;
                    }
                    B3.a.i(0L);
                }
                writableMapArr = new WritableMap[writableMapArrCreatePointersArray.length];
                for (int i11 = 0; i11 < writableMapArrCreatePointersArray.length; i11++) {
                    WritableMap writableMap5 = writableMapArrCreatePointersArray[i11];
                    writableMapArr[i11] = writableMap5 != null ? writableMap5.copy() : null;
                }
            }
            writableMapArr2 = writableMapArrCreatePointersArray;
            itA = AbstractC2845b.a(writableMapArr);
            while (itA.hasNext()) {
            }
            B3.a.i(0L);
        } catch (Throwable th) {
            B3.a.i(0L);
            throw th;
        }
    }

    public static final void sendTouchesLegacy(RCTEventEmitter rctEventEmitter, TouchEvent touchEvent) {
        AbstractC2855l.g(rctEventEmitter, "rctEventEmitter");
        AbstractC2855l.g(touchEvent, "touchEvent");
        TouchEventType touchEventType = touchEvent.getTouchEventType();
        TouchesHelper touchesHelper = INSTANCE;
        WritableArray writableArray = touchesHelper.getWritableArray(false, touchesHelper.createPointersArray(touchEvent));
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (touchEventType == TouchEventType.MOVE || touchEventType == TouchEventType.CANCEL) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < pointerCount; i10++) {
                writableArrayCreateArray.pushInt(i10);
            }
        } else {
            if (touchEventType != TouchEventType.START && touchEventType != TouchEventType.END) {
                throw new RuntimeException("Unknown touch type: " + touchEventType);
            }
            writableArrayCreateArray.pushInt(motionEvent.getActionIndex());
        }
        rctEventEmitter.receiveTouches(TouchEventType.INSTANCE.getJSEventName(touchEventType), writableArray, writableArrayCreateArray);
    }

    public static /* synthetic */ void getTARGET_KEY$annotations() {
    }
}
