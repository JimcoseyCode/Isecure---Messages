package com.facebook.react.views.safeareaview;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import x0.e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "Lx0/e;", "insets", "Li7/B;", "updateState", "(Lx0/e;)V", "onAttachedToWindow", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "p0", PointerEventHelper.POINTER_TYPE_UNKNOWN, "p1", "p2", "p3", "p4", "onLayout", "(ZIIII)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper$ReactAndroid_release", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper$ReactAndroid_release", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSafeAreaView extends ViewGroup {
    private final ThemedReactContext reactContext;
    private StateWrapper stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSafeAreaView(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 onAttachedToWindow$lambda$0(ReactSafeAreaView reactSafeAreaView, View view, L0 windowInsets) {
        AbstractC2855l.g(view, "<unused var>");
        AbstractC2855l.g(windowInsets, "windowInsets");
        e eVarF = windowInsets.f(L0.p.g() | L0.p.a());
        AbstractC2855l.f(eVarF, "getInsets(...)");
        reactSafeAreaView.updateState(eVarF);
        return L0.f16462b;
    }

    private final void updateState(final e insets) {
        StateWrapper stateWrapper = this.stateWrapper;
        if (stateWrapper == null) {
            if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
                return;
            }
            ThemedReactContext themedReactContext = this.reactContext;
            themedReactContext.runOnNativeModulesQueueThread(new GuardedRunnable(themedReactContext) { // from class: com.facebook.react.views.safeareaview.ReactSafeAreaView.updateState.2
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    UIManagerModule uIManagerModule = (UIManagerModule) ReactSafeAreaView.this.getReactContext().getReactApplicationContext().getNativeModule(UIManagerModule.class);
                    if (uIManagerModule != null) {
                        int id = ReactSafeAreaView.this.getId();
                        e eVar = insets;
                        uIManagerModule.updateInsetsPadding(id, eVar.f33238b, eVar.f33237a, eVar.f33240d, eVar.f33239c);
                    }
                }
            });
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        writableNativeMap.putDouble(ViewProps.LEFT, pixelUtil.pxToDp(insets.f33237a));
        writableNativeMap.putDouble(ViewProps.TOP, pixelUtil.pxToDp(insets.f33238b));
        writableNativeMap.putDouble(ViewProps.BOTTOM, pixelUtil.pxToDp(insets.f33240d));
        writableNativeMap.putDouble(ViewProps.RIGHT, pixelUtil.pxToDp(insets.f33239c));
        stateWrapper.updateState(writableNativeMap);
    }

    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    /* JADX INFO: renamed from: getStateWrapper$ReactAndroid_release, reason: from getter */
    public final StateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1658a0.w0(this, new I() { // from class: com.facebook.react.views.safeareaview.a
            @Override // androidx.core.view.I
            public final L0 a(View view, L0 l02) {
                return ReactSafeAreaView.onAttachedToWindow$lambda$0(this.f20622g, view, l02);
            }
        });
        requestApplyInsets();
    }

    public final void setStateWrapper$ReactAndroid_release(StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean p02, int p12, int p22, int p32, int p42) {
    }
}
