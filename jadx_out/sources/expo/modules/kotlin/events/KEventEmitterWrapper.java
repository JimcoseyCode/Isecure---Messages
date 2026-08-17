package expo.modules.kotlin.events;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.services.EventEmitter;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0011J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u000e\u0010\u0013J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u000e\u0010\u0018J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u000e\u0010\u001bJ8\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\n\u001a\n \u001c*\u0004\u0018\u00010\t0\t2\u000e\u0010\f\u001a\n \u001c*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u001eJ0\u0010\u000e\u001a\u00020\r2\u000e\u0010\n\u001a\n \u001c*\u0004\u0018\u00010\t0\t2\u000e\u0010\f\u001a\n \u001c*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u001fJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010!\u001a\n \u001c*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lexpo/modules/kotlin/events/KEventEmitterWrapper;", "Lexpo/modules/kotlin/events/EventEmitter;", "Lexpo/modules/core/interfaces/services/EventEmitter;", "legacyEventEmitter", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/core/interfaces/services/EventEmitter;Ljava/lang/ref/WeakReference;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventName", "Lcom/facebook/react/bridge/WritableMap;", "eventBody", "Li7/B;", "emit", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lexpo/modules/kotlin/records/Record;", "(Ljava/lang/String;Lexpo/modules/kotlin/records/Record;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/String;Ljava/util/Map;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "coalescingKey", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V", "Landroid/view/View;", "view", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V", "kotlin.jvm.PlatformType", "Landroid/os/Bundle;", "(ILjava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Lexpo/modules/core/interfaces/services/EventEmitter$Event;", "event", "(ILexpo/modules/core/interfaces/services/EventEmitter$Event;)V", "Lexpo/modules/core/interfaces/services/EventEmitter;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "getDeviceEventEmitter", "()Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "deviceEventEmitter", "UIEvent", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class KEventEmitterWrapper implements EventEmitter, expo.modules.core.interfaces.services.EventEmitter {
    private final expo.modules.core.interfaces.services.EventEmitter legacyEventEmitter;
    private final WeakReference<ReactApplicationContext> reactContextHolder;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/events/KEventEmitterWrapper$UIEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewId", "eventNameInternal", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventBody", "Lcom/facebook/react/bridge/WritableMap;", "coalescingKey", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V", "Ljava/lang/Short;", "getEventName", "canCoalesce", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCoalescingKey", "getEventData", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class UIEvent extends Event<UIEvent> {
        private final Short coalescingKey;
        private final WritableMap eventBody;
        private final String eventNameInternal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UIEvent(int i10, int i11, String eventNameInternal, WritableMap writableMap, Short sh) {
            super(i10, i11);
            AbstractC2855l.g(eventNameInternal, "eventNameInternal");
            this.eventNameInternal = eventNameInternal;
            this.eventBody = writableMap;
            this.coalescingKey = sh;
        }

        @Override // com.facebook.react.uimanager.events.Event
        public boolean canCoalesce() {
            return this.coalescingKey != null;
        }

        @Override // com.facebook.react.uimanager.events.Event
        public short getCoalescingKey() {
            Short sh = this.coalescingKey;
            if (sh != null) {
                return sh.shortValue();
            }
            return (short) 0;
        }

        @Override // com.facebook.react.uimanager.events.Event
        /* JADX INFO: renamed from: getEventData */
        protected WritableMap getAccessibilityEventData() {
            WritableMap writableMap = this.eventBody;
            return writableMap == null ? Arguments.createMap() : writableMap;
        }

        @Override // com.facebook.react.uimanager.events.Event
        public String getEventName() {
            return KModuleEventEmitterWrapperKt.normalizeEventName(this.eventNameInternal);
        }
    }

    public KEventEmitterWrapper(expo.modules.core.interfaces.services.EventEmitter legacyEventEmitter, WeakReference<ReactApplicationContext> reactContextHolder) {
        AbstractC2855l.g(legacyEventEmitter, "legacyEventEmitter");
        AbstractC2855l.g(reactContextHolder, "reactContextHolder");
        this.legacyEventEmitter = legacyEventEmitter;
        this.reactContextHolder = reactContextHolder;
    }

    private final DeviceEventManagerModule.RCTDeviceEventEmitter getDeviceEventEmitter() {
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(int viewId, EventEmitter.Event event) {
        this.legacyEventEmitter.emit(viewId, event);
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(int viewId, String eventName, Bundle eventBody) {
        this.legacyEventEmitter.emit(viewId, eventName, eventBody);
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(String eventName, Bundle eventBody) {
        this.legacyEventEmitter.emit(eventName, eventBody);
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, WritableMap eventBody) {
        AbstractC2855l.g(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter != null) {
            deviceEventEmitter.emit(eventName, eventBody);
        }
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Record eventBody) {
        AbstractC2855l.g(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter != null) {
            deviceEventEmitter.emit(eventName, JSTypeConverterProvider.legacyConvertToJSValue$default(JSTypeConverterProvider.INSTANCE, eventBody, null, 2, null));
        }
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Map<?, ?> eventBody) {
        AbstractC2855l.g(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter != null) {
            deviceEventEmitter.emit(eventName, JSTypeConverterProvider.legacyConvertToJSValue$default(JSTypeConverterProvider.INSTANCE, eventBody, null, 2, null));
        }
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(int viewId, String eventName, WritableMap eventBody, Short coalescingKey) {
        AbstractC2855l.g(eventName, "eventName");
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext == null) {
            return;
        }
        UIEvent uIEvent = new UIEvent(-1, viewId, eventName, eventBody, coalescingKey);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactApplicationContext, viewId);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(uIEvent);
        }
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(View view, String eventName, WritableMap eventBody, Short coalescingKey) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(eventName, "eventName");
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext == null) {
            return;
        }
        UIEvent uIEvent = new UIEvent(UIManagerHelper.getSurfaceId(view), view.getId(), eventName, eventBody, coalescingKey);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactApplicationContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(uIEvent);
        }
    }
}
