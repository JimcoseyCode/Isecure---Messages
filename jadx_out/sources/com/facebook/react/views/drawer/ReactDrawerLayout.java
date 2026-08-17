package com.facebook.react.views.drawer;

import I0.z;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001a\u0010\u000eR\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayout;", "Landroidx/drawerlayout/widget/DrawerLayout;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "Landroid/view/MotionEvent;", "ev", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Li7/B;", "openDrawer$ReactAndroid_release", "()V", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, "closeDrawer$ReactAndroid_release", ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER, PointerEventHelper.POINTER_TYPE_UNKNOWN, "newDrawerPosition", "setDrawerPosition$ReactAndroid_release", "(I)V", "setDrawerPosition", "drawerWidthInPx", "setDrawerWidth$ReactAndroid_release", "setDrawerWidth", "setDrawerProperties$ReactAndroid_release", "setDrawerProperties", "drawerPosition", "I", "drawerWidth", "dragging", "Z", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactDrawerLayout extends DrawerLayout {
    public static final int DEFAULT_DRAWER_WIDTH = -1;
    private boolean dragging;
    private int drawerPosition;
    private int drawerWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactDrawerLayout(ReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.drawerPosition = 8388611;
        this.drawerWidth = -1;
        AbstractC1658a0.k0(this, new C1657a() { // from class: com.facebook.react.views.drawer.ReactDrawerLayout.1
            @Override // androidx.core.view.C1657a
            public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
                AbstractC2855l.g(host, "host");
                AbstractC2855l.g(event, "event");
                super.onInitializeAccessibilityEvent(host, event);
                Object tag = host.getTag(R.id.accessibility_role);
                if (tag instanceof ReactAccessibilityDelegate.AccessibilityRole) {
                    event.setClassName(ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.getValue((ReactAccessibilityDelegate.AccessibilityRole) tag));
                }
            }

            @Override // androidx.core.view.C1657a
            public void onInitializeAccessibilityNodeInfo(View host, z info) {
                AbstractC2855l.g(host, "host");
                AbstractC2855l.g(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                ReactAccessibilityDelegate.AccessibilityRole.Companion companion = ReactAccessibilityDelegate.AccessibilityRole.INSTANCE;
                ReactAccessibilityDelegate.AccessibilityRole accessibilityRoleFromViewTag = companion.fromViewTag(host);
                if (accessibilityRoleFromViewTag != null) {
                    info.w0(companion.getValue(accessibilityRoleFromViewTag));
                }
            }
        });
    }

    public final void closeDrawer$ReactAndroid_release() {
        closeDrawer(this.drawerPosition);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        AbstractC2855l.g(ev, "ev");
        try {
            if (!super.onInterceptTouchEvent(ev)) {
                return false;
            }
            NativeGestureUtil.notifyNativeGestureStarted(this, ev);
            this.dragging = true;
            return true;
        } catch (IllegalArgumentException e10) {
            AbstractC2325a.J(ReactConstants.TAG, "Error intercepting touch event.", e10);
            return false;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        AbstractC2855l.g(ev, "ev");
        if (ev.getActionMasked() == 1 && this.dragging) {
            NativeGestureUtil.notifyNativeGestureEnded(this, ev);
            this.dragging = false;
        }
        return super.onTouchEvent(ev);
    }

    public final void openDrawer$ReactAndroid_release() {
        openDrawer(this.drawerPosition);
    }

    public final void setDrawerPosition$ReactAndroid_release(int newDrawerPosition) {
        this.drawerPosition = newDrawerPosition;
        setDrawerProperties$ReactAndroid_release();
    }

    public final void setDrawerProperties$ReactAndroid_release() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            AbstractC2855l.e(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            DrawerLayout.f fVar = (DrawerLayout.f) layoutParams;
            fVar.f17071a = this.drawerPosition;
            ((ViewGroup.MarginLayoutParams) fVar).width = this.drawerWidth;
            childAt.setLayoutParams(fVar);
            childAt.setClickable(true);
        }
    }

    public final void setDrawerWidth$ReactAndroid_release(int drawerWidthInPx) {
        this.drawerWidth = drawerWidthInPx;
        setDrawerProperties$ReactAndroid_release();
    }
}
