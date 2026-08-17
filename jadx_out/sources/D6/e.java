package D6;

import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends ReactViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final EventDispatcher f806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WindowManager f807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f808j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f805g = reactContext;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        this.f806h = eventDispatcherForReactTag;
        Object systemService = reactContext.getSystemService("window");
        AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f807i = (WindowManager) systemService;
        f fVar = new f(reactContext);
        this.f808j = fVar;
        fVar.setEventDispatcher$react_native_keyboard_controller_release(eventDispatcherForReactTag);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList outChildren) {
        AbstractC2855l.g(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f808j.addView(view, i10);
    }

    public final void c() {
        if (this.f808j.c()) {
            this.f807i.removeView(this.f808j);
        }
    }

    public final void d() {
        this.f807i.addView(this.f808j, new WindowManager.LayoutParams(-1, -1, ProgressBarContainerView.MAX_PROGRESS, 520, -3));
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        AbstractC2855l.g(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i10) {
        return this.f808j.getChildAt(i10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f808j.getChildCount();
    }

    public final StateWrapper getStateWrapper() {
        return this.f808j.getStateWrapper$react_native_keyboard_controller_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f808j.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f808j.removeView(getChildAt(i10));
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f808j.setStateWrapper$react_native_keyboard_controller_release(stateWrapper);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
