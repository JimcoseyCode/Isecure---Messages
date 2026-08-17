package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002?@B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\n\u0010\u000eJ9\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010(J7\u0010/\u001a\u00020.2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J3\u00101\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010 H\u0002¢\u0006\u0004\b1\u00102J'\u00106\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00108R\u0014\u00109\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/facebook/react/uimanager/TouchTargetHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventX", "eventY", "Landroid/view/ViewGroup;", "viewGroup", PointerEventHelper.POINTER_TYPE_UNKNOWN, "findTargetTagForTouch", "(FFLandroid/view/ViewGroup;)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "nativeViewId", "(FFLandroid/view/ViewGroup;[I)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewCoords", "nativeViewTag", "findTargetTagAndCoordinatesForTouch", "(FFLandroid/view/ViewGroup;[F[I)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;", "findTargetPathAndCoordinatesForTouch", "(FFLandroid/view/ViewGroup;[F)Ljava/util/List;", "Landroid/view/View;", "view", "findClosestReactAncestor", "(Landroid/view/View;)Landroid/view/View;", "eventCoords", "Ljava/util/EnumSet;", "Lcom/facebook/react/uimanager/TouchTargetHelper$TouchTargetReturnType;", "allowReturnTouchTargetTypes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pathAccumulator", "findTouchTargetView", "([FLandroid/view/View;Ljava/util/EnumSet;Ljava/util/List;)Landroid/view/View;", "x", "y", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isTouchPointInView", "(FFLandroid/view/View;)Z", "isTouchPointInViewWithOverflowInset", "parent", "child", "Landroid/graphics/PointF;", "outLocalPoint", "Li7/B;", "getChildPoint", "(FFLandroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/PointF;)V", "findTouchTargetViewWithPointerEvents", "([FLandroid/view/View;Ljava/util/List;)Landroid/view/View;", "targetView", "viewX", "viewY", "getTouchTargetForView", "(Landroid/view/View;FF)I", "[F", "tempPoint", "Landroid/graphics/PointF;", "matrixTransformCoords", "Landroid/graphics/Matrix;", "inverseMatrix", "Landroid/graphics/Matrix;", "TouchTargetReturnType", "ViewTarget", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TouchTargetHelper {
    public static final TouchTargetHelper INSTANCE = new TouchTargetHelper();
    private static final float[] eventCoords = new float[2];
    private static final PointF tempPoint = new PointF();
    private static final float[] matrixTransformCoords = new float[2];
    private static final Matrix inverseMatrix = new Matrix();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/uimanager/TouchTargetHelper$TouchTargetReturnType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "SELF", "CHILD", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class TouchTargetReturnType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TouchTargetReturnType[] $VALUES;
        public static final TouchTargetReturnType SELF = new TouchTargetReturnType("SELF", 0);
        public static final TouchTargetReturnType CHILD = new TouchTargetReturnType("CHILD", 1);

        private static final /* synthetic */ TouchTargetReturnType[] $values() {
            return new TouchTargetReturnType[]{SELF, CHILD};
        }

        static {
            TouchTargetReturnType[] touchTargetReturnTypeArr$values = $values();
            $VALUES = touchTargetReturnTypeArr$values;
            $ENTRIES = AbstractC3083a.a(touchTargetReturnTypeArr$values);
        }

        private TouchTargetReturnType(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static TouchTargetReturnType valueOf(String str) {
            return (TouchTargetReturnType) Enum.valueOf(TouchTargetReturnType.class, str);
        }

        public static TouchTargetReturnType[] values() {
            return (TouchTargetReturnType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "view", "Landroid/view/View;", "<init>", "(ILandroid/view/View;)V", "getViewId", "getView", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewTarget {
        private final View view;
        private final int viewId;

        public ViewTarget(int i10, View view) {
            this.viewId = i10;
            this.view = view;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewTarget) && ((ViewTarget) other).getViewId() == this.viewId;
        }

        public final View getView() {
            return this.view;
        }

        public final int getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return Integer.hashCode(this.viewId);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TouchTargetHelper() {
    }

    private final View findClosestReactAncestor(View view) {
        while (view != null && view.getId() <= 0) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view;
    }

    public static final List<ViewTarget> findTargetPathAndCoordinatesForTouch(float eventX, float eventY, ViewGroup viewGroup, float[] viewCoords) {
        int touchTargetForView;
        AbstractC2855l.g(viewGroup, "viewGroup");
        AbstractC2855l.g(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        viewCoords[0] = eventX;
        viewCoords[1] = eventY;
        ArrayList arrayList = new ArrayList();
        View viewFindTouchTargetViewWithPointerEvents = INSTANCE.findTouchTargetViewWithPointerEvents(viewCoords, viewGroup, arrayList);
        if (viewFindTouchTargetViewWithPointerEvents != null) {
            int i10 = 0;
            while (viewFindTouchTargetViewWithPointerEvents != null && viewFindTouchTargetViewWithPointerEvents.getId() <= 0) {
                Object parent = viewFindTouchTargetViewWithPointerEvents.getParent();
                viewFindTouchTargetViewWithPointerEvents = parent instanceof View ? (View) parent : null;
                i10++;
            }
            if (i10 > 0 && i10 <= arrayList.size()) {
                arrayList.subList(i10, arrayList.size());
            }
            if (viewFindTouchTargetViewWithPointerEvents != null && (touchTargetForView = INSTANCE.getTouchTargetForView(viewFindTouchTargetViewWithPointerEvents, viewCoords[0], viewCoords[1])) != viewFindTouchTargetViewWithPointerEvents.getId()) {
                arrayList.add(0, new ViewTarget(touchTargetForView, null));
            }
        }
        return arrayList;
    }

    public static final int findTargetTagAndCoordinatesForTouch(float eventX, float eventY, ViewGroup viewGroup, float[] viewCoords, int[] nativeViewTag) {
        View viewFindClosestReactAncestor;
        AbstractC2855l.g(viewGroup, "viewGroup");
        AbstractC2855l.g(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        viewCoords[0] = eventX;
        viewCoords[1] = eventY;
        TouchTargetHelper touchTargetHelper = INSTANCE;
        View viewFindTouchTargetViewWithPointerEvents = touchTargetHelper.findTouchTargetViewWithPointerEvents(viewCoords, viewGroup, null);
        if (viewFindTouchTargetViewWithPointerEvents == null || (viewFindClosestReactAncestor = touchTargetHelper.findClosestReactAncestor(viewFindTouchTargetViewWithPointerEvents)) == null) {
            return id;
        }
        if (nativeViewTag != null) {
            nativeViewTag[0] = viewFindClosestReactAncestor.getId();
        }
        return touchTargetHelper.getTouchTargetForView(viewFindClosestReactAncestor, viewCoords[0], viewCoords[1]);
    }

    public static final int findTargetTagForTouch(float eventX, float eventY, ViewGroup viewGroup) {
        AbstractC2855l.g(viewGroup, "viewGroup");
        return findTargetTagAndCoordinatesForTouch(eventX, eventY, viewGroup, eventCoords, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View findTouchTargetView(float[] eventCoords2, View view, EnumSet<TouchTargetReturnType> allowReturnTouchTargetTypes, List<ViewTarget> pathAccumulator) {
        if (allowReturnTouchTargetTypes.contains(TouchTargetReturnType.CHILD) && (view instanceof ViewGroup)) {
            if (!isTouchPointInView(eventCoords2[0], eventCoords2[1], view)) {
                if (view instanceof ReactOverflowViewWithInset) {
                    if (ViewUtil.getUIManagerType(view.getId()) == 2 && !isTouchPointInViewWithOverflowInset(eventCoords2[0], eventCoords2[1], view)) {
                        return null;
                    }
                    String overflow = ((ReactOverflowView) view).getOverflow();
                    if (AbstractC2855l.b(ViewProps.HIDDEN, overflow) || AbstractC2855l.b(ViewProps.SCROLL, overflow)) {
                        return null;
                    }
                }
                if (((ViewGroup) view).getClipChildren()) {
                    return null;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            ReactZIndexedViewGroup reactZIndexedViewGroup = view instanceof ReactZIndexedViewGroup ? (ReactZIndexedViewGroup) view : null;
            for (int i10 = childCount - 1; -1 < i10; i10--) {
                View childAt = viewGroup.getChildAt(reactZIndexedViewGroup != null ? reactZIndexedViewGroup.getZIndexMappedChildIndex(i10) : i10);
                PointF pointF = tempPoint;
                float f10 = eventCoords2[0];
                float f11 = eventCoords2[1];
                AbstractC2855l.d(childAt);
                getChildPoint(f10, f11, viewGroup, childAt, pointF);
                float f12 = eventCoords2[0];
                float f13 = eventCoords2[1];
                eventCoords2[0] = pointF.x;
                eventCoords2[1] = pointF.y;
                View viewFindTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(eventCoords2, childAt, pathAccumulator);
                if (viewFindTouchTargetViewWithPointerEvents != null) {
                    return viewFindTouchTargetViewWithPointerEvents;
                }
                eventCoords2[0] = f12;
                eventCoords2[1] = f13;
            }
        }
        if (allowReturnTouchTargetTypes.contains(TouchTargetReturnType.SELF) && isTouchPointInView(eventCoords2[0], eventCoords2[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View findTouchTargetViewWithPointerEvents(float[] eventCoords2, View view, List<ViewTarget> pathAccumulator) {
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[pointerEvents.ordinal()];
            if (i10 == 1) {
                pointerEvents = PointerEvents.BOX_NONE;
            } else if (i10 == 2) {
                pointerEvents = PointerEvents.NONE;
            }
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[pointerEvents.ordinal()];
        if (i11 == 2) {
            EnumSet<TouchTargetReturnType> enumSetOf = EnumSet.of(TouchTargetReturnType.SELF);
            AbstractC2855l.f(enumSetOf, "of(...)");
            View viewFindTouchTargetView = findTouchTargetView(eventCoords2, view, enumSetOf, pathAccumulator);
            if (viewFindTouchTargetView != null && pathAccumulator != null) {
                pathAccumulator.add(new ViewTarget(view.getId(), view));
            }
            return viewFindTouchTargetView;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                if (pointerEvents != PointerEvents.AUTO) {
                    AbstractC2325a.I(ReactConstants.TAG, "Unknown pointer event type: " + pointerEvents);
                }
                if (!(view instanceof ReactCompoundViewGroup) || !isTouchPointInView(eventCoords2[0], eventCoords2[1], view) || !((ReactCompoundViewGroup) view).interceptsTouchEvent(eventCoords2[0], eventCoords2[1])) {
                    EnumSet<TouchTargetReturnType> enumSetOf2 = EnumSet.of(TouchTargetReturnType.SELF, TouchTargetReturnType.CHILD);
                    AbstractC2855l.f(enumSetOf2, "of(...)");
                    View viewFindTouchTargetView2 = findTouchTargetView(eventCoords2, view, enumSetOf2, pathAccumulator);
                    if (viewFindTouchTargetView2 != null && pathAccumulator != null) {
                        pathAccumulator.add(new ViewTarget(view.getId(), view));
                    }
                    return viewFindTouchTargetView2;
                }
                if (pathAccumulator != null) {
                    pathAccumulator.add(new ViewTarget(view.getId(), view));
                    return view;
                }
            } else {
                EnumSet<TouchTargetReturnType> enumSetOf3 = EnumSet.of(TouchTargetReturnType.CHILD);
                AbstractC2855l.f(enumSetOf3, "of(...)");
                View viewFindTouchTargetView3 = findTouchTargetView(eventCoords2, view, enumSetOf3, pathAccumulator);
                if (viewFindTouchTargetView3 != null) {
                    if (pathAccumulator != null) {
                        pathAccumulator.add(new ViewTarget(view.getId(), view));
                    }
                    return viewFindTouchTargetView3;
                }
                if ((view instanceof ReactCompoundView) && isTouchPointInView(eventCoords2[0], eventCoords2[1], view) && ((ReactCompoundView) view).reactTagForTouch(eventCoords2[0], eventCoords2[1]) != view.getId()) {
                    if (pathAccumulator != null) {
                        pathAccumulator.add(new ViewTarget(view.getId(), view));
                    }
                }
            }
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ View findTouchTargetViewWithPointerEvents$default(TouchTargetHelper touchTargetHelper, float[] fArr, View view, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = null;
        }
        return touchTargetHelper.findTouchTargetViewWithPointerEvents(fArr, view, list);
    }

    private final void getChildPoint(float x10, float y10, ViewGroup parent, View child, PointF outLocalPoint) {
        float scrollX = (x10 + parent.getScrollX()) - child.getLeft();
        float scrollY = (y10 + parent.getScrollY()) - child.getTop();
        Matrix matrix = child.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = matrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = inverseMatrix;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f10 = fArr[0];
            scrollY = fArr[1];
            scrollX = f10;
        }
        outLocalPoint.set(scrollX, scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getTouchTargetForView(View targetView, float viewX, float viewY) {
        return targetView instanceof ReactCompoundView ? ((ReactCompoundView) targetView).reactTagForTouch(viewX, viewY) : targetView.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isTouchPointInView(float x10, float y10, View view) {
        ReactHitSlopView reactHitSlopView = view instanceof ReactHitSlopView ? (ReactHitSlopView) view : null;
        Rect hitSlopRect = reactHitSlopView != null ? reactHitSlopView.getHitSlopRect() : null;
        return hitSlopRect != null ? x10 >= ((float) (-hitSlopRect.left)) && x10 < ((float) (view.getWidth() + hitSlopRect.right)) && y10 >= ((float) (-hitSlopRect.top)) && y10 < ((float) (view.getHeight() + hitSlopRect.bottom)) : x10 >= 0.0f && x10 < ((float) view.getWidth()) && y10 >= 0.0f && y10 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isTouchPointInViewWithOverflowInset(float x10, float y10, View view) {
        if (!(view instanceof ReactOverflowViewWithInset)) {
            return false;
        }
        Rect overflowInset = ((ReactOverflowViewWithInset) view).getOverflowInset();
        return x10 >= ((float) overflowInset.left) && x10 < ((float) (view.getWidth() - overflowInset.right)) && y10 >= ((float) overflowInset.top) && y10 < ((float) (view.getHeight() - overflowInset.bottom));
    }

    public static final int findTargetTagForTouch(float eventX, float eventY, ViewGroup viewGroup, int[] nativeViewId) {
        AbstractC2855l.g(viewGroup, "viewGroup");
        return findTargetTagAndCoordinatesForTouch(eventX, eventY, viewGroup, eventCoords, nativeViewId);
    }
}
