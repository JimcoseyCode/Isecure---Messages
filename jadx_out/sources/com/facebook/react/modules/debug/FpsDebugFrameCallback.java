package com.facebook.react.modules.debug;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010$R$\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0014\u0010+\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u0014\u0010-\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0013R\u0011\u00100\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00104\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u0010\u0013R\u0011\u00106\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u00068"}, d2 = {"Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "l", "Li7/B;", "doFrame", "(J)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "targetFps", ViewProps.START, "(D)V", "stop", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "get4PlusFrameStutters", "()I", "reset", "Lcom/facebook/react/bridge/ReactContext;", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;", "didJSUpdateUiDuringFrameDetector", "Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;", "firstFrameTime", "J", "lastFrameTime", "numFrameCallbacks", "I", "expectedNumFramesPrev", "fourPlusFrameStutters", "numFrameCallbacksWithBatchDispatches", "D", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "isRunningOnFabric", "Z", "()Z", "getNumJSFrames", "numJSFrames", "getTotalTimeMS", "totalTimeMS", "getFps", "()D", "fps", "getJsFPS", "jsFPS", "getNumFrames", "numFrames", "getExpectedNumFrames", "expectedNumFrames", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FpsDebugFrameCallback implements Choreographer.FrameCallback {
    private static final Companion Companion = new Companion(null);
    private static final double DEFAULT_FPS = 60.0d;
    private Choreographer choreographer;
    private final DidJSUpdateUiDuringFrameDetector didJSUpdateUiDuringFrameDetector;
    private int expectedNumFramesPrev;
    private long firstFrameTime;
    private int fourPlusFrameStutters;
    private boolean isRunningOnFabric;
    private long lastFrameTime;
    private int numFrameCallbacks;
    private int numFrameCallbacksWithBatchDispatches;
    private final ReactContext reactContext;
    private double targetFps;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "DEFAULT_FPS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FpsDebugFrameCallback(ReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.didJSUpdateUiDuringFrameDetector = new DidJSUpdateUiDuringFrameDetector();
        this.firstFrameTime = -1L;
        this.lastFrameTime = -1L;
        this.targetFps = DEFAULT_FPS;
        this.isRunningOnFabric = true;
    }

    private final int getNumJSFrames() {
        return this.numFrameCallbacksWithBatchDispatches - 1;
    }

    private final int getTotalTimeMS() {
        return (int) ((this.lastFrameTime - this.firstFrameTime) / 1000000.0d);
    }

    public static /* synthetic */ void start$default(FpsDebugFrameCallback fpsDebugFrameCallback, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = fpsDebugFrameCallback.targetFps;
        }
        fpsDebugFrameCallback.start(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(FpsDebugFrameCallback fpsDebugFrameCallback) {
        Choreographer choreographer = Choreographer.getInstance();
        fpsDebugFrameCallback.choreographer = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(fpsDebugFrameCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(FpsDebugFrameCallback fpsDebugFrameCallback) {
        Choreographer choreographer = Choreographer.getInstance();
        fpsDebugFrameCallback.choreographer = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(fpsDebugFrameCallback);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long l10) {
        if (this.firstFrameTime == -1) {
            this.firstFrameTime = l10;
        }
        long j10 = this.lastFrameTime;
        this.lastFrameTime = l10;
        if (this.didJSUpdateUiDuringFrameDetector.getDidJSHitFrameAndCleanup(j10, l10)) {
            this.numFrameCallbacksWithBatchDispatches++;
        }
        this.numFrameCallbacks++;
        int expectedNumFrames = getExpectedNumFrames();
        if ((expectedNumFrames - this.expectedNumFramesPrev) - 1 >= 4) {
            this.fourPlusFrameStutters++;
        }
        this.expectedNumFramesPrev = expectedNumFrames;
        Choreographer choreographer = this.choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: get4PlusFrameStutters, reason: from getter */
    public final int getFourPlusFrameStutters() {
        return this.fourPlusFrameStutters;
    }

    public final int getExpectedNumFrames() {
        return (int) (((this.targetFps * ((double) getTotalTimeMS())) / ((double) ProgressBarContainerView.MAX_PROGRESS)) + ((double) 1));
    }

    public final double getFps() {
        if (this.lastFrameTime == this.firstFrameTime) {
            return 0.0d;
        }
        return (((double) getNumFrames()) * 1.0E9d) / (this.lastFrameTime - this.firstFrameTime);
    }

    public final double getJsFPS() {
        if (this.lastFrameTime == this.firstFrameTime) {
            return 0.0d;
        }
        return (((double) getNumJSFrames()) * 1.0E9d) / (this.lastFrameTime - this.firstFrameTime);
    }

    public final int getNumFrames() {
        return this.numFrameCallbacks - 1;
    }

    /* JADX INFO: renamed from: isRunningOnFabric, reason: from getter */
    public final boolean getIsRunningOnFabric() {
        return this.isRunningOnFabric;
    }

    public final void reset() {
        this.firstFrameTime = -1L;
        this.lastFrameTime = -1L;
        this.numFrameCallbacks = 0;
        this.fourPlusFrameStutters = 0;
        this.numFrameCallbacksWithBatchDispatches = 0;
    }

    public final void start() {
        start$default(this, 0.0d, 1, null);
    }

    public final void stop() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            UIManagerModule uIManagerModule = (UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class);
            if (!this.reactContext.isBridgeless()) {
                this.reactContext.getCatalystInstance().removeBridgeIdleDebugListener(this.didJSUpdateUiDuringFrameDetector);
            }
            if (uIManagerModule != null) {
                uIManagerModule.setViewHierarchyUpdateDebugListener(null);
            }
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.e
            @Override // java.lang.Runnable
            public final void run() {
                FpsDebugFrameCallback.stop$lambda$1(this.f20424g);
            }
        });
    }

    public final void start(double targetFps) {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            UIManagerModule uIManagerModule = (UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class);
            if (this.reactContext.isBridgeless()) {
                this.isRunningOnFabric = true;
            } else {
                this.reactContext.getCatalystInstance().addBridgeIdleDebugListener(this.didJSUpdateUiDuringFrameDetector);
                this.isRunningOnFabric = false;
            }
            if (uIManagerModule != null) {
                uIManagerModule.setViewHierarchyUpdateDebugListener(this.didJSUpdateUiDuringFrameDetector);
            }
        }
        this.targetFps = targetFps;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.d
            @Override // java.lang.Runnable
            public final void run() {
                FpsDebugFrameCallback.start$lambda$0(this.f20423g);
            }
        });
    }
}
