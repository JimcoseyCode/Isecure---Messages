package com.facebook.react.uimanager.events;

import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0013\u0010\u0003¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/uimanager/events/BlackHoleEventDispatcher;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "()V", "Lcom/facebook/react/uimanager/events/Event;", "event", "Li7/B;", "dispatchEvent", "(Lcom/facebook/react/uimanager/events/Event;)V", "dispatchAllEvents", "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", "listener", "addListener", "(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V", "removeListener", "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;", "addBatchEventDispatchedListener", "(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V", "removeBatchEventDispatchedListener", "onCatalystInstanceDestroyed", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlackHoleEventDispatcher implements EventDispatcher {
    public static final BlackHoleEventDispatcher INSTANCE = new BlackHoleEventDispatcher();

    private BlackHoleEventDispatcher() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addBatchEventDispatchedListener(BatchEventDispatchedListener listener) {
        AbstractC2855l.g(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addListener(EventDispatcherListener listener) {
        AbstractC2855l.g(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(Event<?> event) {
        AbstractC2855l.g(event, "event");
        AbstractC2325a.b("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getEventName());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeBatchEventDispatchedListener(BatchEventDispatchedListener listener) {
        AbstractC2855l.g(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeListener(EventDispatcherListener listener) {
        AbstractC2855l.g(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchAllEvents() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void onCatalystInstanceDestroyed() {
    }
}
