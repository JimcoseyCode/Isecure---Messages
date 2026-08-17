package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0010\b\u0000\u0010\u0003*\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u00020\u0004:\u00011B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0005\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;", "Landroid/view/ViewGroup;", "ScrollViewT", "Lcom/facebook/react/bridge/UIManagerListener;", "scrollView", PointerEventHelper.POINTER_TYPE_UNKNOWN, "horizontal", "<init>", "(Landroid/view/ViewGroup;Z)V", "Li7/B;", "updateScrollPositionInternal", "()V", "computeTargetView", ViewProps.START, "stop", "updateScrollPosition", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "willDispatchViewUpdates", "(Lcom/facebook/react/bridge/UIManager;)V", "willMountItems", "didMountItems", "didDispatchMountItems", "didScheduleMountItems", "Landroid/view/ViewGroup;", "Z", "Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;", "config", "Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;", "getConfig", "()Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;", "setConfig", "(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;)V", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "firstVisibleViewRef", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Rect;", "prevFirstVisibleFrame", "Landroid/graphics/Rect;", "isListening", "Lcom/facebook/react/views/view/ReactViewGroup;", "getContentView", "()Lcom/facebook/react/views/view/ReactViewGroup;", "contentView", "getUIManager", "()Lcom/facebook/react/bridge/UIManager;", "uIManager", "Config", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MaintainVisibleScrollPositionHelper<ScrollViewT extends ViewGroup & ReactScrollViewHelper.HasSmoothScroll> implements UIManagerListener {
    private Config config;
    private WeakReference<View> firstVisibleViewRef;
    private final boolean horizontal;
    private boolean isListening;
    private Rect prevFirstVisibleFrame;
    private final ScrollViewT scrollView;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "minIndexForVisible", PointerEventHelper.POINTER_TYPE_UNKNOWN, "autoScrollToTopThreshold", "<init>", "(ILjava/lang/Integer;)V", "getMinIndexForVisible", "()I", "getAutoScrollToTopThreshold", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer autoScrollToTopThreshold;
        private final int minIndexForVisible;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromReadableMap", "Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;", "value", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Config fromReadableMap(ReadableMap value) {
                AbstractC2855l.g(value, "value");
                return new Config(value.getInt("minIndexForVisible"), value.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(value.getInt("autoscrollToTopThreshold")) : null);
            }

            private Companion() {
            }
        }

        public Config(int i10, Integer num) {
            this.minIndexForVisible = i10;
            this.autoScrollToTopThreshold = num;
        }

        public static final Config fromReadableMap(ReadableMap readableMap) {
            return INSTANCE.fromReadableMap(readableMap);
        }

        public final Integer getAutoScrollToTopThreshold() {
            return this.autoScrollToTopThreshold;
        }

        public final int getMinIndexForVisible() {
            return this.minIndexForVisible;
        }
    }

    public MaintainVisibleScrollPositionHelper(ScrollViewT scrollviewt, boolean z10) {
        this.scrollView = scrollviewt;
        this.horizontal = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void computeTargetView() {
        ScrollViewT scrollviewt;
        ReactViewGroup contentView;
        float y10;
        int height;
        Config config = this.config;
        if (config == null || (scrollviewt = this.scrollView) == null || (contentView = getContentView()) == null) {
            return;
        }
        int scrollX = this.horizontal ? scrollviewt.getScrollX() : scrollviewt.getScrollY();
        int childCount = contentView.getChildCount();
        for (int minIndexForVisible = config.getMinIndexForVisible(); minIndexForVisible < childCount; minIndexForVisible++) {
            View childAt = contentView.getChildAt(minIndexForVisible);
            if (this.horizontal) {
                y10 = childAt.getX();
                height = childAt.getWidth();
            } else {
                y10 = childAt.getY();
                height = childAt.getHeight();
            }
            if (y10 + height > scrollX || minIndexForVisible == contentView.getChildCount() - 1) {
                this.firstVisibleViewRef = new WeakReference<>(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.prevFirstVisibleFrame = rect;
                return;
            }
        }
    }

    private final ReactViewGroup getContentView() {
        ScrollViewT scrollviewt = this.scrollView;
        return (ReactViewGroup) (scrollviewt != null ? scrollviewt.getChildAt(0) : null);
    }

    private final UIManager getUIManager() {
        ScrollViewT scrollviewt = this.scrollView;
        ReactContext reactContext = (ReactContext) (scrollviewt != null ? scrollviewt.getContext() : null);
        if (reactContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ScrollViewT scrollviewt2 = this.scrollView;
        UIManager uIManager = UIManagerHelper.getUIManager(reactContext, ViewUtil.getUIManagerType(scrollviewt2 != null ? scrollviewt2.getId() : 0));
        if (uIManager != null) {
            return uIManager;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateScrollPositionInternal() {
        WeakReference<View> weakReference;
        Rect rect;
        View view;
        ScrollViewT scrollviewt;
        Config config = this.config;
        if (config == null || (weakReference = this.firstVisibleViewRef) == null || (rect = this.prevFirstVisibleFrame) == null || (view = weakReference.get()) == null || (scrollviewt = this.scrollView) == 0) {
            return;
        }
        Rect rect2 = new Rect();
        view.getHitRect(rect2);
        if (this.horizontal) {
            int i10 = rect2.left - rect.left;
            if (i10 != 0) {
                int scrollX = scrollviewt.getScrollX();
                ScrollViewT scrollviewt2 = scrollviewt;
                scrollviewt2.scrollToPreservingMomentum(i10 + scrollX, scrollviewt.getScrollY());
                this.prevFirstVisibleFrame = rect2;
                if (config.getAutoScrollToTopThreshold() == null || scrollX > config.getAutoScrollToTopThreshold().intValue()) {
                    return;
                }
                scrollviewt2.reactSmoothScrollTo(0, scrollviewt.getScrollY());
                return;
            }
            return;
        }
        int i11 = rect2.top - rect.top;
        if (i11 != 0) {
            int scrollY = scrollviewt.getScrollY();
            ScrollViewT scrollviewt3 = scrollviewt;
            scrollviewt3.scrollToPreservingMomentum(scrollviewt.getScrollX(), i11 + scrollY);
            this.prevFirstVisibleFrame = rect2;
            if (config.getAutoScrollToTopThreshold() == null || scrollY > config.getAutoScrollToTopThreshold().intValue()) {
                return;
            }
            scrollviewt3.reactSmoothScrollTo(scrollviewt.getScrollX(), 0);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        updateScrollPositionInternal();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }

    public final Config getConfig() {
        return this.config;
    }

    public final void setConfig(Config config) {
        this.config = config;
    }

    public final void start() {
        if (this.isListening) {
            return;
        }
        this.isListening = true;
        getUIManager().addUIManagerEventListener(this);
    }

    public final void stop() {
        if (this.isListening) {
            this.isListening = false;
            getUIManager().removeUIManagerEventListener(this);
        }
    }

    public final void updateScrollPosition() {
        ScrollViewT scrollviewt = this.scrollView;
        if (scrollviewt == null || ViewUtil.getUIManagerType(scrollviewt.getId()) == 2) {
            return;
        }
        updateScrollPositionInternal();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.views.scroll.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f20625g.computeTargetView();
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        computeTargetView();
    }
}
