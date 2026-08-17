package com.facebook.react.runtime;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/runtime/ReactLifecycleStateManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/runtime/ReactHostStateTracker;", "stateTracker", "<init>", "(Lcom/facebook/react/runtime/ReactHostStateTracker;)V", "Lcom/facebook/react/bridge/ReactContext;", "currentContext", "Landroid/app/Activity;", "activity", "Li7/B;", "resumeReactContextIfHostResumed", "(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V", "moveToOnHostResume", "moveToOnHostPause", "moveToOnHostDestroy", "(Lcom/facebook/react/bridge/ReactContext;)V", "Lcom/facebook/react/runtime/ReactHostStateTracker;", "Lcom/facebook/react/common/LifecycleState;", "state", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", "lifecycleState", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactLifecycleStateManager {
    private LifecycleState state;
    private final ReactHostStateTracker stateTracker;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            try {
                iArr[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LifecycleState.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LifecycleState.BEFORE_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReactLifecycleStateManager(ReactHostStateTracker stateTracker) {
        AbstractC2855l.g(stateTracker, "stateTracker");
        this.stateTracker = stateTracker;
        this.state = LifecycleState.BEFORE_CREATE;
    }

    /* JADX INFO: renamed from: getLifecycleState, reason: from getter */
    public final LifecycleState getState() {
        return this.state;
    }

    public final void moveToOnHostDestroy(ReactContext currentContext) {
        if (currentContext != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
            if (i10 == 2) {
                ReactHostStateTracker.enterState$default(this.stateTracker, "ReactContext.onHostPause()", null, 2, null);
                currentContext.onHostPause();
                ReactHostStateTracker.enterState$default(this.stateTracker, "ReactContext.onHostDestroy()", null, 2, null);
                currentContext.onHostDestroy();
            } else if (i10 == 3) {
                ReactHostStateTracker.enterState$default(this.stateTracker, "ReactContext.onHostDestroy()", null, 2, null);
                currentContext.onHostDestroy();
            }
        }
        this.state = LifecycleState.BEFORE_CREATE;
    }

    public final void moveToOnHostPause(ReactContext currentContext, Activity activity) {
        if (currentContext != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
            if (i10 == 1) {
                ReactHostStateTracker.enterState$default(this.stateTracker, "ReactContext.onHostResume()", null, 2, null);
                currentContext.onHostResume(activity);
                ReactHostStateTracker.enterState$default(this.stateTracker, "ReactContext.onHostPause()", null, 2, null);
                currentContext.onHostPause();
            } else if (i10 == 2) {
                ReactHostStateTracker.enterState$default(this.stateTracker, "ReactContext.onHostPause()", null, 2, null);
                currentContext.onHostPause();
            }
        }
        this.state = LifecycleState.BEFORE_RESUME;
    }

    public final void moveToOnHostResume(ReactContext currentContext, Activity activity) {
        LifecycleState lifecycleState = this.state;
        LifecycleState lifecycleState2 = LifecycleState.RESUMED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        if (currentContext != null) {
            ReactHostStateTracker.enterState$default(this.stateTracker, "ReactContext.onHostResume()", null, 2, null);
            currentContext.onHostResume(activity);
        }
        this.state = lifecycleState2;
    }

    public final void resumeReactContextIfHostResumed(ReactContext currentContext, Activity activity) {
        AbstractC2855l.g(currentContext, "currentContext");
        if (this.state == LifecycleState.RESUMED) {
            ReactHostStateTracker.enterState$default(this.stateTracker, "ReactContext.onHostResume()", null, 2, null);
            currentContext.onHostResume(activity);
        }
    }
}
