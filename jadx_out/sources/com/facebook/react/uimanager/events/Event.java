package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.SystemClock;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 C*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0002DCB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0019\b\u0014\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0005¢\u0006\u0004\b\u000b\u0010\u0007J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000b\u0010\u000eJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020\u0005H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u0005H\u0000¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020\u000fH\u0014¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010,\u001a\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010\u0011J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R$\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\u0011R$\u0010\b\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010'R$\u0010\u0006\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010'R$\u0010\r\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0017\u00109\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010'R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0011\u0010?\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b>\u0010\u001cR\u0016\u0010B\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/facebook/react/uimanager/events/Event;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewTag", "(I)V", "surfaceId", "(II)V", "Li7/B;", "init", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timestampMs", "(IIJ)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "canCoalesce", "()Z", "otherEvent", "coalesce", "(Lcom/facebook/react/uimanager/events/Event;)Lcom/facebook/react/uimanager/events/Event;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCoalescingKey", "()S", "onDispose", "dispose", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "internal_getEventData$ReactAndroid_release", "internal_getEventData", "getEventCategory", "()I", "internal_getEventCategory$ReactAndroid_release", "internal_getEventCategory", "experimental_isSynchronous", "internal_experimental_isSynchronous$ReactAndroid_release", "internal_experimental_isSynchronous", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "dispatchModern", "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "value", "isInitialized", "Z", "I", "getSurfaceId", "getViewTag", "J", "getTimestampMs", "()J", "uniqueID", "getUniqueID", "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "eventAnimationDriverMatchSpecCached", "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "internal_getEventNameCompat", "eventName", "getEventAnimationDriverMatchSpec", "()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "eventAnimationDriverMatchSpec", "Companion", "EventAnimationDriverMatchSpec", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Event<T extends Event<T>> {
    private static final Companion Companion = new Companion(null);
    private static int uniqueIdCounter;
    private EventAnimationDriverMatchSpec eventAnimationDriverMatchSpecCached;
    private boolean isInitialized;
    private int surfaceId;
    private long timestampMs;
    private final int uniqueID;
    private int viewTag;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/uimanager/events/Event$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "uniqueIdCounter", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "match", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewTagRhs", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventNameRhs", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface EventAnimationDriverMatchSpec {
        boolean match(int viewTagRhs, String eventNameRhs);
    }

    protected Event() {
        int i10 = uniqueIdCounter;
        uniqueIdCounter = i10 + 1;
        this.uniqueID = i10;
    }

    public boolean canCoalesce() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Event<?> coalesce(Event<?> otherEvent) {
        return this.timestampMs >= (otherEvent != null ? otherEvent.timestampMs : 0L) ? this : otherEvent;
    }

    public void dispatch(RCTEventEmitter rctEventEmitter) {
        AbstractC2855l.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(this.viewTag, internal_getEventNameCompat(), getEventData());
    }

    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        AbstractC2855l.g(rctEventEmitter, "rctEventEmitter");
        int i10 = this.surfaceId;
        if (i10 != -1) {
            rctEventEmitter.receiveEvent(i10, this.viewTag, internal_getEventNameCompat(), canCoalesce(), getCoalescingKey(), getEventData(), getEventCategory());
        } else {
            dispatch(rctEventEmitter);
        }
    }

    public final void dispose() {
        this.isInitialized = false;
        onDispose();
    }

    protected boolean experimental_isSynchronous() {
        return false;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    public EventAnimationDriverMatchSpec getEventAnimationDriverMatchSpec() {
        if (this.eventAnimationDriverMatchSpecCached == null) {
            this.eventAnimationDriverMatchSpecCached = new EventAnimationDriverMatchSpec(this) { // from class: com.facebook.react.uimanager.events.Event$eventAnimationDriverMatchSpec$1
                final /* synthetic */ Event<T> this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.facebook.react.uimanager.events.Event.EventAnimationDriverMatchSpec
                public boolean match(int viewTagRhs, String eventNameRhs) {
                    AbstractC2855l.g(eventNameRhs, "eventNameRhs");
                    return this.this$0.getViewTag() == viewTagRhs && AbstractC2855l.b(this.this$0.internal_getEventNameCompat(), eventNameRhs);
                }
            };
        }
        return this.eventAnimationDriverMatchSpecCached;
    }

    protected int getEventCategory() {
        return 2;
    }

    protected WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final int getUniqueID() {
        return this.uniqueID;
    }

    public final int getViewTag() {
        return this.viewTag;
    }

    protected final void init(int viewTag) {
        init(-1, viewTag);
    }

    public final boolean internal_experimental_isSynchronous$ReactAndroid_release() {
        return experimental_isSynchronous();
    }

    public final int internal_getEventCategory$ReactAndroid_release() {
        return getEventCategory();
    }

    public final WritableMap internal_getEventData$ReactAndroid_release() {
        return getEventData();
    }

    public final String internal_getEventNameCompat() {
        return getEventName();
    }

    /* JADX INFO: renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    protected final void init(int surfaceId, int viewTag, long timestampMs) {
        this.surfaceId = surfaceId;
        this.viewTag = viewTag;
        this.timestampMs = timestampMs;
        this.isInitialized = true;
    }

    protected Event(int i10) {
        int i11 = uniqueIdCounter;
        uniqueIdCounter = i11 + 1;
        this.uniqueID = i11;
        init(i10);
    }

    protected Event(int i10, int i11) {
        int i12 = uniqueIdCounter;
        uniqueIdCounter = i12 + 1;
        this.uniqueID = i12;
        init(i10, i11);
    }

    protected final void init(int surfaceId, int viewTag) {
        init(surfaceId, viewTag, SystemClock.uptimeMillis());
    }

    public void onDispose() {
    }
}
