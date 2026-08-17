package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u00060\u001aR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/devsupport/FpsView;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "currentFPS", "currentJSFPS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "droppedUIFrames", "total4PlusFrameStutters", PointerEventHelper.POINTER_TYPE_UNKNOWN, "runningOnFabric", "Li7/B;", "setCurrentFPS", "(DDIIZ)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;", "frameCallback", "Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;", "Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;", "fpsMonitorRunnable", "Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;", "Companion", "FPSMonitorRunnable", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FpsView extends FrameLayout {
    private static final int UPDATE_INTERVAL_MS = 500;
    private final FPSMonitorRunnable fpsMonitorRunnable;
    private final FpsDebugFrameCallback frameCallback;
    private final TextView textView;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;", "Ljava/lang/Runnable;", "<init>", "(Lcom/facebook/react/devsupport/FpsView;)V", "Li7/B;", "run", "()V", ViewProps.START, "stop", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldStop", "Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "totalFramesDropped", "I", "total4PlusFrameStutters", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class FPSMonitorRunnable implements Runnable {
        private boolean shouldStop;
        private int total4PlusFrameStutters;
        private int totalFramesDropped;

        public FPSMonitorRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.shouldStop) {
                return;
            }
            this.totalFramesDropped += FpsView.this.frameCallback.getExpectedNumFrames() - FpsView.this.frameCallback.getNumFrames();
            this.total4PlusFrameStutters += FpsView.this.frameCallback.getFourPlusFrameStutters();
            FpsView fpsView = FpsView.this;
            fpsView.setCurrentFPS(fpsView.frameCallback.getFps(), FpsView.this.frameCallback.getJsFPS(), this.totalFramesDropped, this.total4PlusFrameStutters, FpsView.this.frameCallback.getIsRunningOnFabric());
            FpsView.this.frameCallback.reset();
            FpsView.this.postDelayed(this, 500L);
        }

        public final void start() {
            this.shouldStop = false;
            FpsView.this.post(this);
        }

        public final void stop() {
            this.shouldStop = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsView(ReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.d(reactContext);
        View.inflate(reactContext, R.layout.fps_view, this);
        View viewFindViewById = findViewById(R.id.fps_text);
        AbstractC2855l.e(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.textView = (TextView) viewFindViewById;
        FpsDebugFrameCallback fpsDebugFrameCallback = new FpsDebugFrameCallback(reactContext);
        this.frameCallback = fpsDebugFrameCallback;
        this.fpsMonitorRunnable = new FPSMonitorRunnable();
        setCurrentFPS(0.0d, 0.0d, 0, 0, fpsDebugFrameCallback.getIsRunningOnFabric());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentFPS(double currentFPS, double currentJSFPS, int droppedUIFrames, int total4PlusFrameStutters, boolean runningOnFabric) {
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
        Locale locale = Locale.US;
        String str = String.format(locale, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far", Arrays.copyOf(new Object[]{Double.valueOf(currentFPS), Integer.valueOf(droppedUIFrames), Integer.valueOf(total4PlusFrameStutters)}, 3));
        AbstractC2855l.f(str, "format(...)");
        if (!runningOnFabric) {
            String str2 = String.format(locale, "\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(currentJSFPS)}, 1));
            AbstractC2855l.f(str2, "format(...)");
            str = str + str2;
        }
        this.textView.setText(str);
        AbstractC2325a.b(ReactConstants.TAG, str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.frameCallback.reset();
        FpsDebugFrameCallback.start$default(this.frameCallback, 0.0d, 1, null);
        this.fpsMonitorRunnable.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.frameCallback.stop();
        this.fpsMonitorRunnable.stop();
    }
}
