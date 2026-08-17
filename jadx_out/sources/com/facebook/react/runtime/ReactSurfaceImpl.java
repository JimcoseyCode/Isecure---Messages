package com.facebook.react.runtime;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.ReactHost;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u001aJ/\u0010)\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028AX\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00108\u001a\u0004\u0018\u0001048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u0004\u0018\u00010@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010F¨\u0006J"}, d2 = {"Lcom/facebook/react/runtime/ReactSurfaceImpl;", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "surfaceHandler", "Landroid/content/Context;", "context", "<init>", "(Lcom/facebook/react/fabric/SurfaceHandlerBinding;Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleName", "Landroid/os/Bundle;", "initialProps", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/facebook/react/ReactHost;", "host", "Li7/B;", "attach", "(Lcom/facebook/react/ReactHost;)V", "Lcom/facebook/react/runtime/ReactSurfaceView;", "view", "attachView", "(Lcom/facebook/react/runtime/ReactSurfaceView;)V", "newProps", "updateInitProps", "(Landroid/os/Bundle;)V", "detach", "()V", "Lcom/facebook/react/interfaces/TaskInterface;", "Ljava/lang/Void;", "prerender", "()Lcom/facebook/react/interfaces/TaskInterface;", ViewProps.START, "stop", "clear", PointerEventHelper.POINTER_TYPE_UNKNOWN, "widthMeasureSpec", "heightMeasureSpec", "offsetX", "offsetY", "updateLayoutSpecs$ReactAndroid_release", "(IIII)V", "updateLayoutSpecs", "Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "getSurfaceHandler", "()Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "value", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicReference;", "surfaceViewRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/react/runtime/ReactHostImpl;", "reactHostRef", "getReactHost$ReactAndroid_release", "()Lcom/facebook/react/runtime/ReactHostImpl;", "reactHost", "getView", "()Lcom/facebook/react/runtime/ReactSurfaceView;", "getSurfaceID", "()I", "surfaceID", "getModuleName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isAttached$ReactAndroid_release", "()Z", "isAttached", "isRunning", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSurfaceImpl implements ReactSurface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Context context;
    private final AtomicReference<ReactHostImpl> reactHostRef;
    private final SurfaceHandlerBinding surfaceHandler;
    private final AtomicReference<ReactSurfaceView> surfaceViewRef;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/runtime/ReactSurfaceImpl$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "createWithView", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "context", "Landroid/content/Context;", "moduleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "initialProps", "Landroid/os/Bundle;", "isRTL", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getFontScale", PointerEventHelper.POINTER_TYPE_UNKNOWN, "doRTLSwap", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean doRTLSwap(Context context) {
            return I18nUtil.INSTANCE.getInstance().doLeftAndRightSwapInRTL(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getFontScale(Context context) {
            if (ReactNativeFeatureFlags.enableFontScaleChangesUpdatingLayout()) {
                return context.getResources().getConfiguration().fontScale;
            }
            return 1.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isRTL(Context context) {
            return I18nUtil.INSTANCE.getInstance().isRTL(context);
        }

        public final ReactSurfaceImpl createWithView(Context context, String moduleName, Bundle initialProps) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(moduleName, "moduleName");
            ReactSurfaceImpl reactSurfaceImpl = new ReactSurfaceImpl(context, moduleName, initialProps);
            reactSurfaceImpl.attachView(new ReactSurfaceView(context, reactSurfaceImpl));
            return reactSurfaceImpl;
        }

        private Companion() {
        }
    }

    @VisibleForTesting
    public ReactSurfaceImpl(SurfaceHandlerBinding surfaceHandler, Context context) {
        AbstractC2855l.g(surfaceHandler, "surfaceHandler");
        AbstractC2855l.g(context, "context");
        this.surfaceHandler = surfaceHandler;
        this.context = context;
        this.surfaceViewRef = new AtomicReference<>(null);
        this.reactHostRef = new AtomicReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clear$lambda$4(ReactSurfaceImpl reactSurfaceImpl) {
        ReactSurfaceView view = reactSurfaceImpl.getView();
        if (view != null) {
            view.removeAllViews();
            view.setId(-1);
        }
    }

    public static final ReactSurfaceImpl createWithView(Context context, String str, Bundle bundle) {
        return INSTANCE.createWithView(context, str, bundle);
    }

    public final void attach(ReactHost host) {
        AbstractC2855l.g(host, "host");
        if (!(host instanceof ReactHostImpl)) {
            throw new IllegalArgumentException("ReactSurfaceImpl.attach can only attach to ReactHostImpl.");
        }
        if (!androidx.camera.view.i.a(this.reactHostRef, null, host)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
    }

    public final void attachView(ReactSurfaceView view) {
        AbstractC2855l.g(view, "view");
        if (!androidx.camera.view.i.a(this.surfaceViewRef, null, view)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        this.context = context;
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public void clear() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.runtime.Y
            @Override // java.lang.Runnable
            public final void run() {
                ReactSurfaceImpl.clear$lambda$4(this.f20511g);
            }
        });
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public void detach() {
        this.reactHostRef.set(null);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public Context getContext() {
        return this.context;
    }

    public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
        ReactHostImpl reactHost$ReactAndroid_release = getReactHost$ReactAndroid_release();
        if (reactHost$ReactAndroid_release != null) {
            return reactHost$ReactAndroid_release.getEventDispatcher$ReactAndroid_release();
        }
        return null;
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public String getModuleName() {
        return this.surfaceHandler.getModuleName();
    }

    public final ReactHostImpl getReactHost$ReactAndroid_release() {
        return this.reactHostRef.get();
    }

    public final SurfaceHandlerBinding getSurfaceHandler() {
        return this.surfaceHandler;
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public int getSurfaceID() {
        return this.surfaceHandler.getSurfaceId();
    }

    public final boolean isAttached$ReactAndroid_release() {
        return getReactHost$ReactAndroid_release() != null;
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public boolean isRunning() {
        return this.surfaceHandler.isRunning();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> prerender() {
        ReactHostImpl reactHost$ReactAndroid_release = getReactHost$ReactAndroid_release();
        return reactHost$ReactAndroid_release == null ? Task.INSTANCE.forError(new IllegalStateException("Trying to call ReactSurface.prerender(), but no ReactHost is attached.")) : reactHost$ReactAndroid_release.prerenderSurface$ReactAndroid_release(this);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> start() {
        if (this.surfaceViewRef.get() == null) {
            return Task.INSTANCE.forError(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHost$ReactAndroid_release = getReactHost$ReactAndroid_release();
        return reactHost$ReactAndroid_release == null ? Task.INSTANCE.forError(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.")) : reactHost$ReactAndroid_release.startSurface$ReactAndroid_release(this);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> stop() {
        ReactHostImpl reactHost$ReactAndroid_release = getReactHost$ReactAndroid_release();
        return reactHost$ReactAndroid_release == null ? Task.INSTANCE.forError(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHost$ReactAndroid_release.stopSurface$ReactAndroid_release(this);
    }

    public final void updateInitProps(Bundle newProps) {
        AbstractC2855l.g(newProps, "newProps");
        SurfaceHandlerBinding surfaceHandlerBinding = this.surfaceHandler;
        Object objFromBundle = Arguments.fromBundle(newProps);
        AbstractC2855l.e(objFromBundle, "null cannot be cast to non-null type com.facebook.react.bridge.NativeMap");
        surfaceHandlerBinding.setProps((NativeMap) objFromBundle);
    }

    public final synchronized void updateLayoutSpecs$ReactAndroid_release(int widthMeasureSpec, int heightMeasureSpec, int offsetX, int offsetY) {
        SurfaceHandlerBinding surfaceHandlerBinding = this.surfaceHandler;
        Companion companion = INSTANCE;
        surfaceHandlerBinding.setLayoutConstraints(widthMeasureSpec, heightMeasureSpec, offsetX, offsetY, companion.doRTLSwap(getContext()), companion.isRTL(getContext()), getContext().getResources().getDisplayMetrics().density, companion.getFontScale(getContext()));
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public ReactSurfaceView getView() {
        return this.surfaceViewRef.get();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactSurfaceImpl(Context context, String moduleName, Bundle bundle) {
        NativeMap nativeMap;
        this(new SurfaceHandlerBinding(moduleName), context);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(moduleName, "moduleName");
        if (bundle != null) {
            Object objFromBundle = Arguments.fromBundle(bundle);
            AbstractC2855l.e(objFromBundle, "null cannot be cast to non-null type com.facebook.react.bridge.NativeMap");
            nativeMap = (NativeMap) objFromBundle;
        } else {
            nativeMap = null;
        }
        this.surfaceHandler.setProps(nativeMap);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        SurfaceHandlerBinding surfaceHandlerBinding = this.surfaceHandler;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, androidx.customview.widget.a.INVALID_ID);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, androidx.customview.widget.a.INVALID_ID);
        Companion companion = INSTANCE;
        surfaceHandlerBinding.setLayoutConstraints(iMakeMeasureSpec, iMakeMeasureSpec2, 0, 0, companion.doRTLSwap(context), companion.isRTL(context), displayMetrics.density, companion.getFontScale(context));
    }
}
