package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.ChoreographerProvider;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006#"}, d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/internal/ChoreographerProvider;", "choreographerProvider", "<init>", "(Lcom/facebook/react/internal/ChoreographerProvider;)V", "Li7/B;", "postFrameCallbackOnChoreographer", "()V", "maybeRemoveFrameCallback", "Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;", NotificationsService.EVENT_TYPE_KEY, "Landroid/view/Choreographer$FrameCallback;", "callback", "postFrameCallback", "(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V", "frameCallback", "removeFrameCallback", "Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;", "choreographer$1", "Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;", "choreographer", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/util/ArrayDeque;", "callbackQueues", "[Ljava/util/ArrayDeque;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "totalCallbacks", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasPostedCallback", "Z", "Landroid/view/Choreographer$FrameCallback;", "Companion", "CallbackType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactChoreographer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static ReactChoreographer choreographer;
    private final ArrayDeque<Choreographer.FrameCallback>[] callbackQueues;

    /* JADX INFO: renamed from: choreographer$1, reason: from kotlin metadata */
    private ChoreographerProvider.Choreographer choreographer;
    private final Choreographer.FrameCallback frameCallback;
    private boolean hasPostedCallback;
    private int totalCallbacks;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "order", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;II)V", "getOrder$ReactAndroid_release", "()I", "PERF_MARKERS", "DISPATCH_UI", "NATIVE_ANIMATED_MODULE", "TIMERS_EVENTS", "IDLE_EVENT", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallbackType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallbackType[] $VALUES;
        private final int order;
        public static final CallbackType PERF_MARKERS = new CallbackType("PERF_MARKERS", 0, 0);
        public static final CallbackType DISPATCH_UI = new CallbackType("DISPATCH_UI", 1, 1);
        public static final CallbackType NATIVE_ANIMATED_MODULE = new CallbackType("NATIVE_ANIMATED_MODULE", 2, 2);
        public static final CallbackType TIMERS_EVENTS = new CallbackType("TIMERS_EVENTS", 3, 3);
        public static final CallbackType IDLE_EVENT = new CallbackType("IDLE_EVENT", 4, 4);

        private static final /* synthetic */ CallbackType[] $values() {
            return new CallbackType[]{PERF_MARKERS, DISPATCH_UI, NATIVE_ANIMATED_MODULE, TIMERS_EVENTS, IDLE_EVENT};
        }

        static {
            CallbackType[] callbackTypeArr$values = $values();
            $VALUES = callbackTypeArr$values;
            $ENTRIES = AbstractC3083a.a(callbackTypeArr$values);
        }

        private CallbackType(String str, int i10, int i11) {
            this.order = i11;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static CallbackType valueOf(String str) {
            return (CallbackType) Enum.valueOf(CallbackType.class, str);
        }

        public static CallbackType[] values() {
            return (CallbackType[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: getOrder$ReactAndroid_release, reason: from getter */
        public final int getOrder() {
            return this.order;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/internal/ChoreographerProvider;", "choreographerProvider", "Li7/B;", "initialize", "(Lcom/facebook/react/internal/ChoreographerProvider;)V", "Lcom/facebook/react/modules/core/ReactChoreographer;", "getInstance", "()Lcom/facebook/react/modules/core/ReactChoreographer;", "instance", "overrideInstanceForTest$ReactAndroid_release", "(Lcom/facebook/react/modules/core/ReactChoreographer;)Lcom/facebook/react/modules/core/ReactChoreographer;", "overrideInstanceForTest", "choreographer", "Lcom/facebook/react/modules/core/ReactChoreographer;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReactChoreographer getInstance() {
            ReactChoreographer reactChoreographer = ReactChoreographer.choreographer;
            if (reactChoreographer != null) {
                return reactChoreographer;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void initialize(ChoreographerProvider choreographerProvider) {
            AbstractC2855l.g(choreographerProvider, "choreographerProvider");
            if (ReactChoreographer.choreographer == null) {
                ReactChoreographer.choreographer = new ReactChoreographer(choreographerProvider, null);
            }
        }

        @VisibleForTesting
        public final ReactChoreographer overrideInstanceForTest$ReactAndroid_release(ReactChoreographer instance) {
            ReactChoreographer reactChoreographer = ReactChoreographer.choreographer;
            ReactChoreographer.choreographer = instance;
            return reactChoreographer;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactChoreographer(ChoreographerProvider choreographerProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographerProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ReactChoreographer reactChoreographer, ChoreographerProvider choreographerProvider) {
        reactChoreographer.choreographer = choreographerProvider.getChoreographer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameCallback$lambda$1(ReactChoreographer reactChoreographer, long j10) {
        synchronized (reactChoreographer.callbackQueues) {
            try {
                reactChoreographer.hasPostedCallback = false;
                int length = reactChoreographer.callbackQueues.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ArrayDeque<Choreographer.FrameCallback> arrayDeque = reactChoreographer.callbackQueues[i10];
                    int size = arrayDeque.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Choreographer.FrameCallback frameCallbackPollFirst = arrayDeque.pollFirst();
                        if (frameCallbackPollFirst != null) {
                            frameCallbackPollFirst.doFrame(j10);
                            reactChoreographer.totalCallbacks--;
                        } else {
                            AbstractC2325a.m(ReactConstants.TAG, "Tried to execute non-existent frame callback");
                        }
                    }
                }
                reactChoreographer.maybeRemoveFrameCallback();
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final ReactChoreographer getInstance() {
        return INSTANCE.getInstance();
    }

    public static final void initialize(ChoreographerProvider choreographerProvider) {
        INSTANCE.initialize(choreographerProvider);
    }

    private final void maybeRemoveFrameCallback() {
        AbstractC3007a.a(this.totalCallbacks >= 0);
        if (this.totalCallbacks == 0 && this.hasPostedCallback) {
            ChoreographerProvider.Choreographer choreographer2 = this.choreographer;
            if (choreographer2 != null) {
                choreographer2.removeFrameCallback(this.frameCallback);
            }
            this.hasPostedCallback = false;
        }
    }

    private final void postFrameCallbackOnChoreographer() {
        if (this.hasPostedCallback) {
            return;
        }
        ChoreographerProvider.Choreographer choreographer2 = this.choreographer;
        if (choreographer2 == null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.g
                @Override // java.lang.Runnable
                public final void run() {
                    ReactChoreographer.postFrameCallbackOnChoreographer$lambda$6(this.f20418g);
                }
            });
        } else {
            choreographer2.postFrameCallback(this.frameCallback);
            this.hasPostedCallback = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallbackOnChoreographer$lambda$6(ReactChoreographer reactChoreographer) {
        synchronized (reactChoreographer.callbackQueues) {
            reactChoreographer.postFrameCallbackOnChoreographer();
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public final void postFrameCallback(CallbackType type, Choreographer.FrameCallback callback) {
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(callback, "callback");
        synchronized (this.callbackQueues) {
            this.callbackQueues[type.getOrder()].addLast(callback);
            boolean z10 = true;
            int i10 = this.totalCallbacks + 1;
            this.totalCallbacks = i10;
            if (i10 <= 0) {
                z10 = false;
            }
            AbstractC3007a.a(z10);
            postFrameCallbackOnChoreographer();
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public final void removeFrameCallback(CallbackType type, Choreographer.FrameCallback frameCallback) {
        AbstractC2855l.g(type, "type");
        synchronized (this.callbackQueues) {
            try {
                if (this.callbackQueues[type.getOrder()].removeFirstOccurrence(frameCallback)) {
                    this.totalCallbacks--;
                    maybeRemoveFrameCallback();
                } else {
                    AbstractC2325a.m(ReactConstants.TAG, "Tried to remove non-existent frame callback");
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ReactChoreographer(final ChoreographerProvider choreographerProvider) {
        int size = CallbackType.getEntries().size();
        ArrayDeque<Choreographer.FrameCallback>[] arrayDequeArr = new ArrayDeque[size];
        for (int i10 = 0; i10 < size; i10++) {
            arrayDequeArr[i10] = new ArrayDeque<>();
        }
        this.callbackQueues = arrayDequeArr;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: com.facebook.react.modules.core.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                ReactChoreographer.frameCallback$lambda$1(this.f20415a, j10);
            }
        };
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.f
            @Override // java.lang.Runnable
            public final void run() {
                ReactChoreographer._init_$lambda$2(this.f20416g, choreographerProvider);
            }
        });
    }
}
