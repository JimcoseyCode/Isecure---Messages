package expo.modules.adapters.react.services;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import expo.modules.adapters.react.views.ViewManagerAdapterUtils;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.services.EventEmitter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class EventEmitterModule implements EventEmitter, InternalModule {
    private ReactContext mReactContext;

    public EventEmitterModule(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    private static Event getReactEventFromEvent(final int i10, final EventEmitter.Event event) {
        return new Event(i10) { // from class: expo.modules.adapters.react.services.EventEmitterModule.2
            @Override // com.facebook.react.uimanager.events.Event
            public boolean canCoalesce() {
                return event.canCoalesce();
            }

            @Override // com.facebook.react.uimanager.events.Event
            public void dispatch(RCTEventEmitter rCTEventEmitter) {
                rCTEventEmitter.receiveEvent(i10, getEventName(), Arguments.fromBundle(event.getEventBody()));
            }

            @Override // com.facebook.react.uimanager.events.Event
            public short getCoalescingKey() {
                return event.getCoalescingKey();
            }

            @Override // com.facebook.react.uimanager.events.Event
            public String getEventName() {
                return ViewManagerAdapterUtils.normalizeEventName(event.getEventName());
            }
        };
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(String str, Bundle bundle) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, Arguments.fromBundle(bundle));
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class> getExportedInterfaces() {
        return Collections.singletonList(EventEmitter.class);
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(int i10, EventEmitter.Event event) {
        UIManagerHelper.getEventDispatcherForReactTag(this.mReactContext, i10).dispatchEvent(getReactEventFromEvent(i10, event));
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(final int i10, final String str, final Bundle bundle) {
        UIManagerHelper.getEventDispatcherForReactTag(this.mReactContext, i10).dispatchEvent(new Event(i10) { // from class: expo.modules.adapters.react.services.EventEmitterModule.1
            @Override // com.facebook.react.uimanager.events.Event
            public boolean canCoalesce() {
                return false;
            }

            @Override // com.facebook.react.uimanager.events.Event
            public void dispatch(RCTEventEmitter rCTEventEmitter) {
                int i11 = i10;
                String eventName = getEventName();
                Bundle bundle2 = bundle;
                rCTEventEmitter.receiveEvent(i11, eventName, bundle2 != null ? Arguments.fromBundle(bundle2) : null);
            }

            @Override // com.facebook.react.uimanager.events.Event
            public short getCoalescingKey() {
                return (short) 0;
            }

            @Override // com.facebook.react.uimanager.events.Event
            public String getEventName() {
                return ViewManagerAdapterUtils.normalizeEventName(str);
            }
        });
    }
}
