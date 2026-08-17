package com.swmansion.gesturehandler.react;

import J6.D;
import J6.v;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.view.ReactViewGroup;
import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements D {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24965a;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24965a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // J6.D
    public v a(View view) {
        AbstractC2855l.g(view, "view");
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return v.f6745h;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return v.f6744g;
            }
        }
        int i10 = a.f24965a[pointerEvents.ordinal()];
        if (i10 == 1) {
            return v.f6746i;
        }
        if (i10 == 2) {
            return v.f6745h;
        }
        if (i10 == 3) {
            return v.f6744g;
        }
        if (i10 == 4) {
            return v.f6747j;
        }
        throw new C2750m();
    }

    @Override // J6.D
    public boolean b(ViewGroup view) {
        AbstractC2855l.g(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof ReactScrollView) {
            return !AbstractC2855l.b(((ReactScrollView) view).getOverflow(), ViewProps.VISIBLE);
        }
        if (view instanceof ReactHorizontalScrollView) {
            return !AbstractC2855l.b(((ReactHorizontalScrollView) view).getOverflow(), ViewProps.VISIBLE);
        }
        if (view instanceof ReactViewGroup) {
            return AbstractC2855l.b(((ReactViewGroup) view).getOverflow(), ViewProps.HIDDEN);
        }
        return false;
    }

    @Override // J6.D
    public View c(ViewGroup parent, int i10) {
        AbstractC2855l.g(parent, "parent");
        if (parent instanceof ReactViewGroup) {
            View childAt = parent.getChildAt(((ReactViewGroup) parent).getZIndexMappedChildIndex(i10));
            AbstractC2855l.d(childAt);
            return childAt;
        }
        View childAt2 = parent.getChildAt(i10);
        AbstractC2855l.d(childAt2);
        return childAt2;
    }
}
