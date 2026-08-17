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
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ReactHorizontalScrollViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001kB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b%\u0010\u001eJ\u001f\u0010'\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010&\u001a\u00020 H\u0007¢\u0006\u0004\b'\u0010#J!\u0010)\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u001aH\u0007¢\u0006\u0004\b0\u0010\u001eJ\u001f\u00102\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u001aH\u0007¢\u0006\u0004\b2\u0010\u001eJ\u001f\u00104\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u001aH\u0007¢\u0006\u0004\b4\u0010\u001eJ\u001f\u00106\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u001aH\u0007¢\u0006\u0004\b6\u0010\u001eJ!\u00108\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b8\u0010*J\u001f\u0010:\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u001aH\u0007¢\u0006\u0004\b:\u0010\u001eJ!\u0010;\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b;\u0010*J!\u0010<\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b<\u0010\u001eJ)\u0010A\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010+H\u0017¢\u0006\u0004\bA\u0010BJ)\u0010A\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\bA\u0010CJ\u0017\u0010D\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010G\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010M\u001a\u00020>H\u0007¢\u0006\u0004\bN\u0010OJ)\u0010R\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020 H\u0007¢\u0006\u0004\bR\u0010SJ#\u0010U\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010T\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bU\u0010*J)\u0010W\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010P\u001a\u00020>2\u0006\u0010V\u001a\u00020 H\u0007¢\u0006\u0004\bW\u0010SJ)\u0010X\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010P\u001a\u00020>2\b\u0010M\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\bX\u0010YJ!\u0010[\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b[\u0010*J\u001f\u0010\\\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\\\u0010\u001eJ\u001f\u0010^\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020]H\u0007¢\u0006\u0004\b^\u0010_J!\u0010a\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010`H\u0007¢\u0006\u0004\ba\u0010bJ!\u0010c\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010`H\u0007¢\u0006\u0004\bc\u0010bJ!\u0010e\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010d\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\be\u0010*J\u001f\u0010g\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010f\u001a\u00020>H\u0007¢\u0006\u0004\bg\u0010OJ!\u0010i\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010h\u001a\u00020\u001aH\u0007¢\u0006\u0004\bi\u0010\u001eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010j¨\u0006l"}, d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;", "Lcom/facebook/react/views/scroll/FpsListener;", "fpsListener", "<init>", "(Lcom/facebook/react/views/scroll/FpsListener;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;)Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", PointerEventHelper.POINTER_TYPE_UNKNOWN, "updateState", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setScrollEnabled", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Z)V", "setShowsHorizontalScrollIndicator", PointerEventHelper.POINTER_TYPE_UNKNOWN, "decelerationRate", "setDecelerationRate", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;F)V", "disableIntervalMomentum", "setDisableIntervalMomentum", "snapToInterval", "setSnapToInterval", "alignment", "setSnapToAlignment", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableArray;", "snapToOffsets", "setSnapToOffsets", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Lcom/facebook/react/bridge/ReadableArray;)V", "snapToStart", "setSnapToStart", "snapToEnd", "setSnapToEnd", ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS, "setRemoveClippedSubviews", "sendMomentumEvents", "setSendMomentumEvents", "scrollPerfTag", "setScrollPerfTag", "pagingEnabled", "setPagingEnabled", "setOverScrollMode", "setNestedScrollEnabled", "scrollView", PointerEventHelper.POINTER_TYPE_UNKNOWN, "commandId", "args", "receiveCommand", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "flashScrollIndicators", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;)V", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;", "data", "scrollTo", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;)V", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;", "scrollToEnd", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;)V", ViewProps.COLOR, "setBottomFillColor", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;I)V", "index", ViewProps.BORDER_RADIUS, "setBorderRadius", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;ILjava/lang/Integer;)V", ViewProps.OVERFLOW, "setOverflow", "setPersistentScrollbar", "Lcom/facebook/react/bridge/Dynamic;", "setFadingEdgeLength", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Lcom/facebook/react/bridge/Dynamic;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setContentOffset", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;Lcom/facebook/react/bridge/ReadableMap;)V", "setMaintainVisibleContentPosition", "pointerEventsStr", "setPointerEvents", "scrollEventThrottle", "setScrollEventThrottle", "horizontal", "setHorizontal", "Lcom/facebook/react/views/scroll/FpsListener;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactHorizontalScrollViewManager extends ViewGroupManager<ReactHorizontalScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactHorizontalScrollView> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private final FpsListener fpsListener;

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
    public ReactHorizontalScrollViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor(ReactHorizontalScrollView view, int index, Integer color) {
        AbstractC2855l.g(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, color);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(ReactHorizontalScrollView view, int index, float borderRadius) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderRadius(view, (BorderRadiusProp) BorderRadiusProp.getEntries().get(index), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
        }
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(ReactHorizontalScrollView view, String borderStyle) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public final void setBorderWidth(ReactHorizontalScrollView view, int index, float width) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderWidth(view, (LogicalEdge) LogicalEdge.getEntries().get(index), Float.valueOf(width));
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public final void setBottomFillColor(ReactHorizontalScrollView view, int color) {
        AbstractC2855l.g(view, "view");
        view.setEndFillColor(color);
    }

    @ReactProp(name = "contentOffset")
    public final void setContentOffset(ReactHorizontalScrollView view, ReadableMap value) {
        AbstractC2855l.g(view, "view");
        if (value != null) {
            view.scrollTo((int) PixelUtil.toPixelFromDIP(value.hasKey("x") ? value.getDouble("x") : 0.0d), (int) PixelUtil.toPixelFromDIP(value.hasKey("y") ? value.getDouble("y") : 0.0d));
        } else {
            view.scrollTo(0, 0);
        }
    }

    @ReactProp(name = "decelerationRate")
    public final void setDecelerationRate(ReactHorizontalScrollView view, float decelerationRate) {
        AbstractC2855l.g(view, "view");
        view.setDecelerationRate(decelerationRate);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public final void setDisableIntervalMomentum(ReactHorizontalScrollView view, boolean disableIntervalMomentum) {
        AbstractC2855l.g(view, "view");
        view.setDisableIntervalMomentum(disableIntervalMomentum);
    }

    @ReactProp(name = "fadingEdgeLength")
    public final void setFadingEdgeLength(ReactHorizontalScrollView view, Dynamic value) {
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
            view.setHorizontalFadingEdgeEnabled(true);
            view.setFadingEdgeLength(Math.round(PixelUtil.INSTANCE.dpToPx(Math.max(view.getFadingEdgeLengthStart(), view.getFadingEdgeLengthEnd()))));
        } else {
            view.setHorizontalFadingEdgeEnabled(false);
            view.setFadingEdgeLength(0);
        }
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public final void setMaintainVisibleContentPosition(ReactHorizontalScrollView view, ReadableMap value) {
        AbstractC2855l.g(view, "view");
        if (value != null) {
            view.setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config.INSTANCE.fromReadableMap(value));
        } else {
            view.setMaintainVisibleContentPosition(null);
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public final void setNestedScrollEnabled(ReactHorizontalScrollView view, boolean value) {
        if (view != null) {
            AbstractC1658a0.v0(view, value);
        }
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(ReactHorizontalScrollView view, String value) {
        AbstractC2855l.g(view, "view");
        view.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(value));
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(ReactHorizontalScrollView view, String overflow) {
        AbstractC2855l.g(view, "view");
        view.setOverflow(overflow);
    }

    @ReactProp(name = "pagingEnabled")
    public final void setPagingEnabled(ReactHorizontalScrollView view, boolean pagingEnabled) {
        AbstractC2855l.g(view, "view");
        view.setPagingEnabled(pagingEnabled);
    }

    @ReactProp(name = "persistentScrollbar")
    public final void setPersistentScrollbar(ReactHorizontalScrollView view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setScrollbarFadingEnabled(!value);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public final void setPointerEvents(ReactHorizontalScrollView view, String pointerEventsStr) {
        AbstractC2855l.g(view, "view");
        view.setPointerEvents(PointerEvents.INSTANCE.parsePointerEvents(pointerEventsStr));
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public final void setRemoveClippedSubviews(ReactHorizontalScrollView view, boolean removeClippedSubviews) {
        AbstractC2855l.g(view, "view");
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(ReactHorizontalScrollView view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setScrollEnabled(value);
    }

    @ReactProp(name = "scrollEventThrottle")
    public final void setScrollEventThrottle(ReactHorizontalScrollView view, int scrollEventThrottle) {
        AbstractC2855l.g(view, "view");
        view.setScrollEventThrottle(scrollEventThrottle);
    }

    @ReactProp(name = "scrollPerfTag")
    public final void setScrollPerfTag(ReactHorizontalScrollView view, String scrollPerfTag) {
        AbstractC2855l.g(view, "view");
        view.setScrollPerfTag(scrollPerfTag);
    }

    @ReactProp(name = "sendMomentumEvents")
    public final void setSendMomentumEvents(ReactHorizontalScrollView view, boolean sendMomentumEvents) {
        AbstractC2855l.g(view, "view");
        view.setSendMomentumEvents(sendMomentumEvents);
    }

    @ReactProp(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public final void setShowsHorizontalScrollIndicator(ReactHorizontalScrollView view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setHorizontalScrollBarEnabled(value);
    }

    @ReactProp(name = "snapToAlignment")
    public final void setSnapToAlignment(ReactHorizontalScrollView view, String alignment) {
        AbstractC2855l.g(view, "view");
        view.setSnapToAlignment(ReactScrollViewHelper.parseSnapToAlignment(alignment));
    }

    @ReactProp(name = "snapToEnd")
    public final void setSnapToEnd(ReactHorizontalScrollView view, boolean snapToEnd) {
        AbstractC2855l.g(view, "view");
        view.setSnapToEnd(snapToEnd);
    }

    @ReactProp(name = "snapToInterval")
    public final void setSnapToInterval(ReactHorizontalScrollView view, float snapToInterval) {
        AbstractC2855l.g(view, "view");
        view.setSnapInterval((int) (snapToInterval * PixelUtil.getDisplayMetricDensity()));
    }

    @ReactProp(name = "snapToOffsets")
    public final void setSnapToOffsets(ReactHorizontalScrollView view, ReadableArray snapToOffsets) {
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
    public final void setSnapToStart(ReactHorizontalScrollView view, boolean snapToStart) {
        AbstractC2855l.g(view, "view");
        view.setSnapToStart(snapToStart);
    }

    public /* synthetic */ ReactHorizontalScrollViewManager(FpsListener fpsListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : fpsListener);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactHorizontalScrollView createViewInstance(ThemedReactContext context) {
        AbstractC2855l.g(context, "context");
        return new ReactHorizontalScrollView(context, this.fpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void flashScrollIndicators(ReactHorizontalScrollView scrollView) {
        AbstractC2855l.g(scrollView, "scrollView");
        scrollView.flashScrollIndicators();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactHorizontalScrollView prepareToRecycleView(ThemedReactContext reactContext, ReactHorizontalScrollView view) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(view, "view");
        ReactHorizontalScrollView reactHorizontalScrollView = (ReactHorizontalScrollView) super.prepareToRecycleView(reactContext, view);
        if (reactHorizontalScrollView != null) {
            reactHorizontalScrollView.recycleView();
        }
        return reactHorizontalScrollView;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollTo(ReactHorizontalScrollView scrollView, ReactScrollViewCommandHelper.ScrollToCommandData data) {
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
    public void scrollToEnd(ReactHorizontalScrollView scrollView, ReactScrollViewCommandHelper.ScrollToEndCommandData data) {
        AbstractC2855l.g(scrollView, "scrollView");
        AbstractC2855l.g(data, "data");
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int width = childAt.getWidth() + scrollView.getPaddingRight();
        scrollView.abortAnimation();
        if (data.mAnimated) {
            scrollView.reactSmoothScrollTo(width, scrollView.getScrollY());
        } else {
            scrollView.scrollTo(width, scrollView.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactHorizontalScrollView view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
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

    public ReactHorizontalScrollViewManager(FpsListener fpsListener) {
        super(null, 1, null);
        this.fpsListener = fpsListener;
        if (ReactNativeFeatureFlags.enableViewRecyclingForScrollView()) {
            setupViewRecycling();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactHorizontalScrollView scrollView, int commandId, ReadableArray args) {
        AbstractC2855l.g(scrollView, "scrollView");
        ReactScrollViewCommandHelper.INSTANCE.receiveCommand(this, scrollView, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactHorizontalScrollView scrollView, String commandId, ReadableArray args) {
        AbstractC2855l.g(scrollView, "scrollView");
        AbstractC2855l.g(commandId, "commandId");
        ReactScrollViewCommandHelper.INSTANCE.receiveCommand(this, scrollView, commandId, args);
    }

    @ReactProp(name = "horizontal")
    public final void setHorizontal(ReactHorizontalScrollView view, boolean horizontal) {
    }
}
