package com.facebook.react.uimanager.events;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H'¢\u0006\u0004\b\u0012\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/events/EventDispatcher;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/events/Event;", "event", "Li7/B;", "dispatchEvent", "(Lcom/facebook/react/uimanager/events/Event;)V", "dispatchAllEvents", "()V", "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", "listener", "addListener", "(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V", "removeListener", "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;", "addBatchEventDispatchedListener", "(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V", "removeBatchEventDispatchedListener", "onCatalystInstanceDestroyed", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EventDispatcher {
    void addBatchEventDispatchedListener(BatchEventDispatchedListener listener);

    void addListener(EventDispatcherListener listener);

    void dispatchAllEvents();

    void dispatchEvent(Event<?> event);

    void onCatalystInstanceDestroyed();

    void removeBatchEventDispatchedListener(BatchEventDispatchedListener listener);

    void removeListener(EventDispatcherListener listener);
}
