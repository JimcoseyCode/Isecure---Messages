package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.AbstractC1658a0;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.scroll.MaintainVisibleScrollPositionHelper;
import com.facebook.react.views.scroll.ReactScrollViewCommandHelper;
import com.facebook.react.views.scroll.ScrollEventType;
import i7.t;
import j7.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ReactScrollViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0017\u0018\u0000 q2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001qB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0019H\u0007¢\u0006\u0004\b \u0010\u001cJ!\u0010#\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0013H\u0007¢\u0006\u0004\b)\u0010\u0017J\u001f\u0010+\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010\u0017J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0013H\u0007¢\u0006\u0004\b-\u0010\u0017J\u001f\u0010/\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0013H\u0007¢\u0006\u0004\b/\u0010\u0017J!\u00101\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b1\u0010'J\u001f\u00103\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0013H\u0007¢\u0006\u0004\b3\u0010\u0017J\u001f\u00106\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J!\u00108\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b8\u0010'J!\u00109\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b9\u0010\u0017J\u001d\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000204\u0018\u00010:H\u0016¢\u0006\u0004\b;\u0010<J)\u0010@\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u0002042\b\u0010?\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b@\u0010AJ)\u0010@\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\r2\b\u0010?\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b@\u0010BJ\u0017\u0010C\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00022\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ)\u0010K\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u0002042\u0006\u0010J\u001a\u00020\u0019H\u0007¢\u0006\u0004\bK\u0010LJ#\u0010N\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010M\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bN\u0010'J)\u0010P\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u0002042\u0006\u0010O\u001a\u00020\u0019H\u0007¢\u0006\u0004\bP\u0010LJ+\u0010Q\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0004\bQ\u0010RJ!\u0010T\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010S\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bT\u0010'J\u001f\u0010V\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00022\u0006\u0010F\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\bX\u0010\u0017J\u001f\u0010Z\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020YH\u0007¢\u0006\u0004\bZ\u0010[J!\u0010]\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\\H\u0007¢\u0006\u0004\b]\u0010^J!\u0010_\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\\H\u0007¢\u0006\u0004\b_\u0010^J)\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\be\u0010fJ\u001d\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020d\u0018\u00010:H\u0016¢\u0006\u0004\bg\u0010<J!\u0010i\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010h\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bi\u0010'J\u001f\u0010k\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010j\u001a\u000204H\u0007¢\u0006\u0004\bk\u00107J!\u0010m\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010l\u001a\u00020\u0013H\u0007¢\u0006\u0004\bm\u0010\u0017J\u001f\u0010o\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u0013H\u0007¢\u0006\u0004\bo\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010p¨\u0006r"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/scroll/ReactScrollView;", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;", "Lcom/facebook/react/views/scroll/FpsListener;", "fpsListener", "<init>", "(Lcom/facebook/react/views/scroll/FpsListener;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/scroll/ReactScrollView;)Lcom/facebook/react/views/scroll/ReactScrollView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/scroll/ReactScrollView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setScrollEnabled", "(Lcom/facebook/react/views/scroll/ReactScrollView;Z)V", "setShowsVerticalScrollIndicator", PointerEventHelper.POINTER_TYPE_UNKNOWN, "decelerationRate", "setDecelerationRate", "(Lcom/facebook/react/views/scroll/ReactScrollView;F)V", "disableIntervalMomentum", "setDisableIntervalMomentum", "snapToInterval", "setSnapToInterval", "Lcom/facebook/react/bridge/ReadableArray;", "snapToOffsets", "setSnapToOffsets", "(Lcom/facebook/react/views/scroll/ReactScrollView;Lcom/facebook/react/bridge/ReadableArray;)V", "alignment", "setSnapToAlignment", "(Lcom/facebook/react/views/scroll/ReactScrollView;Ljava/lang/String;)V", "snapToStart", "setSnapToStart", "snapToEnd", "setSnapToEnd", ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS, "setRemoveClippedSubviews", "sendMomentumEvents", "setSendMomentumEvents", "scrollPerfTag", "setScrollPerfTag", "pagingEnabled", "setPagingEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.COLOR, "setBottomFillColor", "(Lcom/facebook/react/views/scroll/ReactScrollView;I)V", "setOverScrollMode", "setNestedScrollEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCommandsMap", "()Ljava/util/Map;", "scrollView", "commandId", "args", "receiveCommand", "(Lcom/facebook/react/views/scroll/ReactScrollView;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/scroll/ReactScrollView;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "flashScrollIndicators", "(Lcom/facebook/react/views/scroll/ReactScrollView;)V", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;", "data", "scrollTo", "(Lcom/facebook/react/views/scroll/ReactScrollView;Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;)V", "index", ViewProps.BORDER_RADIUS, "setBorderRadius", "(Lcom/facebook/react/views/scroll/ReactScrollView;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/scroll/ReactScrollView;ILjava/lang/Integer;)V", ViewProps.OVERFLOW, "setOverflow", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;", "scrollToEnd", "(Lcom/facebook/react/views/scroll/ReactScrollView;Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;)V", "setPersistentScrollbar", "Lcom/facebook/react/bridge/Dynamic;", "setFadingEdgeLength", "(Lcom/facebook/react/views/scroll/ReactScrollView;Lcom/facebook/react/bridge/Dynamic;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setContentOffset", "(Lcom/facebook/react/views/scroll/ReactScrollView;Lcom/facebook/react/bridge/ReadableMap;)V", "setMaintainVisibleContentPosition", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", PointerEventHelper.POINTER_TYPE_UNKNOWN, "updateState", "(Lcom/facebook/react/views/scroll/ReactScrollView;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "getExportedCustomDirectEventTypeConstants", "pointerEventsStr", "setPointerEvents", "scrollEventThrottle", "setScrollEventThrottle", "horizontal", "setHorizontal", "applyFix", "setIsInvertedVirtualizedList", "Lcom/facebook/react/views/scroll/FpsListener;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactScrollViewManager extends ViewGroupManager<ReactScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactScrollView> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String REACT_CLASS = "RCTScrollView";
    private final FpsListener fpsListener;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewManager$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "REACT_CLASS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "createExportedCustomDirectEventTypeConstants", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, Object> createExportedCustomDirectEventTypeConstants() {
            ScrollEventType.Companion companion = ScrollEventType.INSTANCE;
            return K.l(t.a(companion.getJSEventName(ScrollEventType.SCROLL), K.f(t.a("registrationName", "onScroll"))), t.a(companion.getJSEventName(ScrollEventType.BEGIN_DRAG), K.f(t.a("registrationName", "onScrollBeginDrag"))), t.a(companion.getJSEventName(ScrollEventType.END_DRAG), K.f(t.a("registrationName", "onScrollEndDrag"))), t.a(companion.getJSEventName(ScrollEventType.MOMENTUM_BEGIN), K.f(t.a("registrationName", "onMomentumScrollBegin"))), t.a(companion.getJSEventName(ScrollEventType.MOMENTUM_END), K.f(t.a("registrationName", "onMomentumScrollEnd"))));
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReactScrollViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return ReactScrollViewCommandHelper.INSTANCE.getCommandsMap();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(INSTANCE.createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor(ReactScrollView view, int index, Integer color) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, color);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(ReactScrollView view, int index, float borderRadius) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderRadius(view, (BorderRadiusProp) BorderRadiusProp.getEntries().get(index), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
        }
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(ReactScrollView view, String borderStyle) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public final void setBorderWidth(ReactScrollView view, int index, float width) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderWidth(view, (LogicalEdge) LogicalEdge.getEntries().get(index), Float.valueOf(width));
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public final void setBottomFillColor(ReactScrollView view, int color) {
        AbstractC2855l.g(view, "view");
        view.setEndFillColor(color);
    }

    @ReactProp(customType = "Point", name = "contentOffset")
    public final void setContentOffset(ReactScrollView view, ReadableMap value) {
        AbstractC2855l.g(view, "view");
        view.setContentOffset(value);
    }

    @ReactProp(name = "decelerationRate")
    public final void setDecelerationRate(ReactScrollView view, float decelerationRate) {
        AbstractC2855l.g(view, "view");
        view.setDecelerationRate(decelerationRate);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public final void setDisableIntervalMomentum(ReactScrollView view, boolean disableIntervalMomentum) {
        AbstractC2855l.g(view, "view");
        view.setDisableIntervalMomentum(disableIntervalMomentum);
    }

    @ReactProp(name = "fadingEdgeLength")
    public final void setFadingEdgeLength(ReactScrollView view, Dynamic value) {
        ReadableMap readableMapAsMap;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(value, "value");
        int i10 = WhenMappings.$EnumSwitchMapping$0[value.getType().ordinal()];
        if (i10 == 1) {
            view.setFadingEdgeLengthStart(value.asInt());
            view.setFadingEdgeLengthEnd(value.asInt());
        } else if (i10 == 2 && (readableMapAsMap = value.asMap()) != null) {
            int i11 = (!readableMapAsMap.hasKey(ViewProps.START) || readableMapAsMap.getInt(ViewProps.START) <= 0) ? 0 : readableMapAsMap.getInt(ViewProps.START);
            int i12 = (!readableMapAsMap.hasKey(ViewProps.END) || readableMapAsMap.getInt(ViewProps.END) <= 0) ? 0 : readableMapAsMap.getInt(ViewProps.END);
            view.setFadingEdgeLengthStart(i11);
            view.setFadingEdgeLengthEnd(i12);
        }
        if (view.getFadingEdgeLengthStart() > 0 || view.getFadingEdgeLengthEnd() > 0) {
            view.setVerticalFadingEdgeEnabled(true);
            view.setFadingEdgeLength(Math.round(PixelUtil.INSTANCE.dpToPx(Math.max(view.getFadingEdgeLengthStart(), view.getFadingEdgeLengthEnd()))));
        } else {
            view.setVerticalFadingEdgeEnabled(false);
            view.setFadingEdgeLength(0);
        }
    }

    @ReactProp(name = "isInvertedVirtualizedList")
    public final void setIsInvertedVirtualizedList(ReactScrollView view, boolean applyFix) {
        AbstractC2855l.g(view, "view");
        if (applyFix) {
            view.setVerticalScrollbarPosition(1);
        } else {
            view.setVerticalScrollbarPosition(0);
        }
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public final void setMaintainVisibleContentPosition(ReactScrollView view, ReadableMap value) {
        AbstractC2855l.g(view, "view");
        if (value != null) {
            view.setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config.INSTANCE.fromReadableMap(value));
        } else {
            view.setMaintainVisibleContentPosition(null);
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public final void setNestedScrollEnabled(ReactScrollView view, boolean value) {
        if (view != null) {
            AbstractC1658a0.v0(view, value);
        }
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(ReactScrollView view, String value) {
        AbstractC2855l.g(view, "view");
        view.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(value));
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(ReactScrollView view, String overflow) {
        AbstractC2855l.g(view, "view");
        view.setOverflow(overflow);
    }

    @ReactProp(name = "pagingEnabled")
    public final void setPagingEnabled(ReactScrollView view, boolean pagingEnabled) {
        AbstractC2855l.g(view, "view");
        view.setPagingEnabled(pagingEnabled);
    }

    @ReactProp(name = "persistentScrollbar")
    public final void setPersistentScrollbar(ReactScrollView view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setScrollbarFadingEnabled(!value);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public final void setPointerEvents(ReactScrollView view, String pointerEventsStr) {
        AbstractC2855l.g(view, "view");
        view.setPointerEvents(PointerEvents.INSTANCE.parsePointerEvents(pointerEventsStr));
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public final void setRemoveClippedSubviews(ReactScrollView view, boolean removeClippedSubviews) {
        AbstractC2855l.g(view, "view");
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(ReactScrollView view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setScrollEnabled(value);
        view.setFocusable(value);
    }

    @ReactProp(name = "scrollEventThrottle")
    public final void setScrollEventThrottle(ReactScrollView view, int scrollEventThrottle) {
        AbstractC2855l.g(view, "view");
        view.setScrollEventThrottle(scrollEventThrottle);
    }

    @ReactProp(name = "scrollPerfTag")
    public final void setScrollPerfTag(ReactScrollView view, String scrollPerfTag) {
        AbstractC2855l.g(view, "view");
        view.setScrollPerfTag(scrollPerfTag);
    }

    @ReactProp(name = "sendMomentumEvents")
    public final void setSendMomentumEvents(ReactScrollView view, boolean sendMomentumEvents) {
        AbstractC2855l.g(view, "view");
        view.setSendMomentumEvents(sendMomentumEvents);
    }

    @ReactProp(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public final void setShowsVerticalScrollIndicator(ReactScrollView view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setVerticalScrollBarEnabled(value);
    }

    @ReactProp(name = "snapToAlignment")
    public final void setSnapToAlignment(ReactScrollView view, String alignment) {
        AbstractC2855l.g(view, "view");
        view.setSnapToAlignment(ReactScrollViewHelper.parseSnapToAlignment(alignment));
    }

    @ReactProp(name = "snapToEnd")
    public final void setSnapToEnd(ReactScrollView view, boolean snapToEnd) {
        AbstractC2855l.g(view, "view");
        view.setSnapToEnd(snapToEnd);
    }

    @ReactProp(name = "snapToInterval")
    public final void setSnapToInterval(ReactScrollView view, float snapToInterval) {
        AbstractC2855l.g(view, "view");
        view.setSnapInterval((int) (snapToInterval * PixelUtil.getDisplayMetricDensity()));
    }

    @ReactProp(name = "snapToOffsets")
    public final void setSnapToOffsets(ReactScrollView view, ReadableArray snapToOffsets) {
        AbstractC2855l.g(view, "view");
        if (snapToOffsets == null || snapToOffsets.size() == 0) {
            view.setSnapOffsets(null);
            return;
        }
        float displayMetricDensity = PixelUtil.getDisplayMetricDensity();
        ArrayList arrayList = new ArrayList();
        int size = snapToOffsets.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf((int) (snapToOffsets.getDouble(i10) * ((double) displayMetricDensity))));
        }
        view.setSnapOffsets(arrayList);
    }

    @ReactProp(name = "snapToStart")
    public final void setSnapToStart(ReactScrollView view, boolean snapToStart) {
        AbstractC2855l.g(view, "view");
        view.setSnapToStart(snapToStart);
    }

    public /* synthetic */ ReactScrollViewManager(FpsListener fpsListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : fpsListener);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactScrollView createViewInstance(ThemedReactContext context) {
        AbstractC2855l.g(context, "context");
        return new ReactScrollView(context, this.fpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void flashScrollIndicators(ReactScrollView scrollView) {
        AbstractC2855l.g(scrollView, "scrollView");
        scrollView.flashScrollIndicators();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactScrollView prepareToRecycleView(ThemedReactContext reactContext, ReactScrollView view) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(view, "view");
        ReactScrollView reactScrollView = (ReactScrollView) super.prepareToRecycleView(reactContext, view);
        if (reactScrollView != null) {
            reactScrollView.recycleView();
        }
        return reactScrollView;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollTo(ReactScrollView scrollView, ReactScrollViewCommandHelper.ScrollToCommandData data) {
        AbstractC2855l.g(scrollView, "scrollView");
        AbstractC2855l.g(data, "data");
        scrollView.abortAnimation();
        if (data.mAnimated) {
            scrollView.reactSmoothScrollTo(data.mDestX, data.mDestY);
        } else {
            scrollView.scrollTo(data.mDestX, data.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollToEnd(ReactScrollView scrollView, ReactScrollViewCommandHelper.ScrollToEndCommandData data) {
        AbstractC2855l.g(scrollView, "scrollView");
        AbstractC2855l.g(data, "data");
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + scrollView.getPaddingBottom();
        scrollView.abortAnimation();
        if (data.mAnimated) {
            scrollView.reactSmoothScrollTo(scrollView.getScrollX(), height);
        } else {
            scrollView.scrollTo(scrollView.getScrollX(), height);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactScrollView view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(props, "props");
        AbstractC2855l.g(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        if (!ReactNativeFeatureFlags.enableViewCulling() && !ReactNativeFeatureFlags.useTraitHiddenOnAndroid()) {
            return null;
        }
        ReactScrollViewHelper.loadFabricScrollState$ReactAndroid_release(view, stateWrapper);
        return null;
    }

    public ReactScrollViewManager(FpsListener fpsListener) {
        super(null, 1, null);
        this.fpsListener = fpsListener;
        if (ReactNativeFeatureFlags.enableViewRecyclingForScrollView()) {
            setupViewRecycling();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactScrollView scrollView, int commandId, ReadableArray args) {
        AbstractC2855l.g(scrollView, "scrollView");
        ReactScrollViewCommandHelper.INSTANCE.receiveCommand(this, scrollView, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactScrollView scrollView, String commandId, ReadableArray args) {
        AbstractC2855l.g(scrollView, "scrollView");
        AbstractC2855l.g(commandId, "commandId");
        ReactScrollViewCommandHelper.INSTANCE.receiveCommand(this, scrollView, commandId, args);
    }

    @ReactProp(name = "horizontal")
    public final void setHorizontal(ReactScrollView view, boolean horizontal) {
    }
}
