package androidx.customview.widget;

import I0.A;
import I0.AbstractC0805b;
import I0.B;
import I0.z;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import androidx.customview.widget.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.ArrayList;
import java.util.List;
import m0.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C1657a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, INVALID_ID, INVALID_ID);
    private static final b.a NODE_ADAPTER = new C0168a();
    private static final b.InterfaceC0169b SPARSE_VALUES_ADAPTER = new b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = INVALID_ID;
    int mKeyboardFocusedVirtualViewId = INVALID_ID;
    private int mHoveredVirtualViewId = INVALID_ID;

    /* JADX INFO: renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0168a implements b.a {
        C0168a() {
        }

        @Override // androidx.customview.widget.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(z zVar, Rect rect) {
            zVar.m(rect);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements b.InterfaceC0169b {
        b() {
        }

        @Override // androidx.customview.widget.b.InterfaceC0169b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public z a(j jVar, int i10) {
            return (z) jVar.m(i10);
        }

        @Override // androidx.customview.widget.b.InterfaceC0169b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(j jVar) {
            return jVar.l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c extends A {
        c() {
        }

        @Override // I0.A
        public z b(int i10) {
            return z.k0(a.this.obtainAccessibilityNodeInfo(i10));
        }

        @Override // I0.A
        public z d(int i10) {
            int i11 = i10 == 2 ? a.this.mAccessibilityFocusedVirtualViewId : a.this.mKeyboardFocusedVirtualViewId;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // I0.A
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.performAction(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC1658a0.w(view) == 0) {
            AbstractC1658a0.s0(view, 1);
        }
    }

    private boolean c(int i10) {
        if (this.mAccessibilityFocusedVirtualViewId != i10) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = INVALID_ID;
        this.mHost.invalidate();
        sendEventForVirtualView(i10, 65536);
        return true;
    }

    private boolean d() {
        int i10 = this.mKeyboardFocusedVirtualViewId;
        return i10 != Integer.MIN_VALUE && onPerformActionForVirtualView(i10, 16, null);
    }

    private AccessibilityEvent e(int i10, int i11) {
        return i10 != -1 ? f(i10, i11) : g(i11);
    }

    private AccessibilityEvent f(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        z zVarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i10);
        accessibilityEventObtain.getText().add(zVarObtainAccessibilityNodeInfo.J());
        accessibilityEventObtain.setContentDescription(zVarObtainAccessibilityNodeInfo.w());
        accessibilityEventObtain.setScrollable(zVarObtainAccessibilityNodeInfo.e0());
        accessibilityEventObtain.setPassword(zVarObtainAccessibilityNodeInfo.c0());
        accessibilityEventObtain.setEnabled(zVarObtainAccessibilityNodeInfo.V());
        accessibilityEventObtain.setChecked(zVarObtainAccessibilityNodeInfo.S());
        onPopulateEventForVirtualView(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(zVarObtainAccessibilityNodeInfo.s());
        B.c(accessibilityEventObtain, this.mHost, i10);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent g(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private z h(int i10) {
        z zVarJ0 = z.j0();
        zVarJ0.B0(true);
        zVarJ0.D0(true);
        zVarJ0.w0(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        zVarJ0.s0(rect);
        zVarJ0.t0(rect);
        zVarJ0.M0(this.mHost);
        onPopulateNodeForVirtualView(i10, zVarJ0);
        if (zVarJ0.J() == null && zVarJ0.w() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        zVarJ0.m(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iK = zVarJ0.k();
        if ((iK & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        zVarJ0.K0(this.mHost.getContext().getPackageName());
        zVarJ0.V0(this.mHost, i10);
        if (this.mAccessibilityFocusedVirtualViewId == i10) {
            zVarJ0.q0(true);
            zVarJ0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        } else {
            zVarJ0.q0(false);
            zVarJ0.a(64);
        }
        boolean z10 = this.mKeyboardFocusedVirtualViewId == i10;
        if (z10) {
            zVarJ0.a(2);
        } else if (zVarJ0.X()) {
            zVarJ0.a(1);
        }
        zVarJ0.E0(z10);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        zVarJ0.n(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            zVarJ0.m(this.mTempScreenRect);
            if (zVarJ0.f3854b != -1) {
                z zVarJ02 = z.j0();
                for (int i11 = zVarJ0.f3854b; i11 != -1; i11 = zVarJ02.f3854b) {
                    zVarJ02.N0(this.mHost, -1);
                    zVarJ02.s0(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i11, zVarJ02);
                    zVarJ02.m(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                zVarJ02.n0();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                zVarJ0.t0(this.mTempScreenRect);
                if (m(this.mTempScreenRect)) {
                    zVarJ0.b1(true);
                }
            }
        }
        return zVarJ0;
    }

    private z i() {
        z zVarL0 = z.l0(this.mHost);
        AbstractC1658a0.X(this.mHost, zVarL0);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (zVarL0.r() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zVarL0.d(this.mHost, ((Integer) arrayList.get(i10)).intValue());
        }
        return zVarL0;
    }

    private j j() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        j jVar = new j();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jVar.j(((Integer) arrayList.get(i10)).intValue(), h(((Integer) arrayList.get(i10)).intValue()));
        }
        return jVar;
    }

    private void k(int i10, Rect rect) {
        obtainAccessibilityNodeInfo(i10).m(rect);
    }

    private static Rect l(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean m(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int n(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean o(int i10, Rect rect) {
        z zVar;
        j jVarJ = j();
        int i11 = this.mKeyboardFocusedVirtualViewId;
        int i12 = INVALID_ID;
        z zVar2 = i11 == Integer.MIN_VALUE ? null : (z) jVarJ.f(i11);
        if (i10 == 1 || i10 == 2) {
            zVar = (z) androidx.customview.widget.b.d(jVarJ, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, zVar2, i10, AbstractC1658a0.y(this.mHost) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.mKeyboardFocusedVirtualViewId;
            if (i13 != Integer.MIN_VALUE) {
                k(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                l(this.mHost, i10, rect2);
            }
            zVar = (z) androidx.customview.widget.b.c(jVarJ, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, zVar2, rect2, i10);
        }
        if (zVar != null) {
            i12 = jVarJ.i(jVarJ.h(zVar));
        }
        return requestKeyboardFocusForVirtualView(i12);
    }

    private boolean p(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? onPerformActionForVirtualView(i10, i11, bundle) : c(i10) : r(i10) : clearKeyboardFocusForVirtualView(i10) : requestKeyboardFocusForVirtualView(i10);
    }

    private boolean q(int i10, Bundle bundle) {
        return AbstractC1658a0.Z(this.mHost, i10, bundle);
    }

    private boolean r(int i10) {
        int i11;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i11 = this.mAccessibilityFocusedVirtualViewId) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            c(i11);
        }
        this.mAccessibilityFocusedVirtualViewId = i10;
        this.mHost.invalidate();
        sendEventForVirtualView(i10, 32768);
        return true;
    }

    private void s(int i10) {
        int i11 = this.mHoveredVirtualViewId;
        if (i11 == i10) {
            return;
        }
        this.mHoveredVirtualViewId = i10;
        sendEventForVirtualView(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sendEventForVirtualView(i11, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i10) {
        if (this.mKeyboardFocusedVirtualViewId != i10) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = INVALID_ID;
        onVirtualViewKeyboardFocusChanged(i10, false);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                s(INVALID_ID);
                return true;
            }
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            s(virtualViewAt);
            if (virtualViewAt != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                int iN = n(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && o(iN, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            break;
                        case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                d();
                                return true;
                            }
                            break;
                    }
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return o(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return o(1, null);
                }
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.C1657a
    public A getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    protected abstract int getVirtualViewAt(float f10, float f11);

    protected abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i10) {
        invalidateVirtualView(i10, 0);
    }

    z obtainAccessibilityNodeInfo(int i10) {
        return i10 == -1 ? i() : h(i10);
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = this.mKeyboardFocusedVirtualViewId;
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (z10) {
            o(i10, rect);
        }
    }

    @Override // androidx.core.view.C1657a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.C1657a
    public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
        super.onInitializeAccessibilityNodeInfo(view, zVar);
        onPopulateNodeForHost(zVar);
    }

    protected abstract boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle);

    protected abstract void onPopulateNodeForVirtualView(int i10, z zVar);

    boolean performAction(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? p(i10, i11, bundle) : q(i11, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i10) {
        int i11;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i11 = this.mKeyboardFocusedVirtualViewId) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i10;
        onVirtualViewKeyboardFocusChanged(i10, true);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, e(i10, i11));
    }

    public final void invalidateVirtualView(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventE = e(i10, 2048);
        AbstractC0805b.b(accessibilityEventE, i11);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventE);
    }

    protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(z zVar) {
    }

    protected void onPopulateEventForVirtualView(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected void onVirtualViewKeyboardFocusChanged(int i10, boolean z10) {
    }
}
