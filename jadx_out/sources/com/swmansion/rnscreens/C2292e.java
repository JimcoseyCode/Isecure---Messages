package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.L0;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: com.swmansion.rnscreens.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2292e extends Toolbar {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final a0 f25107d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final boolean f25108e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final boolean f25109f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f25110g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private x0.e f25111h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f25112i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f25113j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final Choreographer.FrameCallback f25114k0;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Choreographer.FrameCallback {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            C2292e.this.f25113j0 = false;
            C2292e c2292e = C2292e.this;
            c2292e.measure(View.MeasureSpec.makeMeasureSpec(c2292e.getWidth(), androidx.customview.widget.a.INVALID_ID), View.MeasureSpec.makeMeasureSpec(C2292e.this.getHeight(), androidx.customview.widget.a.INVALID_ID));
            C2292e c2292e2 = C2292e.this;
            c2292e2.layout(c2292e2.getLeft(), C2292e.this.getTop(), C2292e.this.getRight(), C2292e.this.getBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2292e(Context context, a0 config) {
        super(context);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(config, "config");
        this.f25107d0 = config;
        this.f25108e0 = true;
        this.f25109f0 = true;
        x0.e NONE = x0.e.f33236e;
        AbstractC2855l.f(NONE, "NONE");
        this.f25111h0 = NONE;
        getMenu();
        this.f25114k0 = new a();
    }

    private final void T(int i10, int i11, int i12, int i13) {
        this.f25110g0 = true;
        U();
        setPadding(i10, i11, i12, i13);
    }

    private final void U() {
        this.f25112i0 = this.f25108e0;
    }

    public final void V() {
        setContentInsetStartWithNavigation(this.f25107d0.getPreferredContentInsetStartWithNavigation());
        J(this.f25107d0.getPreferredContentInsetStart(), this.f25107d0.getPreferredContentInsetEnd());
    }

    public final a0 getConfig() {
        return this.f25107d0;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        x0.e eVarB = Y6.d.b(this, L0.p.a(), windowInsetsOnApplyWindowInsets, false, 4, null);
        x0.e eVarB2 = Y6.d.b(this, L0.p.g(), windowInsetsOnApplyWindowInsets, false, 4, null);
        x0.e eVarC = x0.e.c(eVarB.f33237a + eVarB2.f33237a, 0, eVarB.f33239c + eVarB2.f33239c, 0);
        AbstractC2855l.f(eVarC, "of(...)");
        x0.e eVarC2 = x0.e.c(0, Math.max(eVarB.f33238b, this.f25109f0 ? eVarB2.f33238b : 0), 0, Math.max(eVarB.f33240d, 0));
        AbstractC2855l.f(eVarC2, "of(...)");
        x0.e eVarA = x0.e.a(eVarC, eVarC2);
        AbstractC2855l.f(eVarA, "add(...)");
        if (!AbstractC2855l.b(this.f25111h0, eVarA)) {
            this.f25111h0 = eVarA;
            T(eVarA.f33237a, eVarA.f33238b, eVarA.f33239c, eVarA.f33240d);
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f25107d0.k(this, z10 || this.f25112i0);
        this.f25112i0 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        ViewParent parent = getParent();
        Integer numValueOf = null;
        C2288a c2288a = parent instanceof C2288a ? (C2288a) parent : null;
        if (c2288a != null && this.f25110g0 && !c2288a.isInLayout()) {
            c2288a.H(getPaddingTop());
            this.f25110g0 = false;
        }
        Context context = getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((ThemedReactContext) context).getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            numValueOf = Integer.valueOf(attributes.softInputMode);
        }
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.f25113j0 || this.f25114k0 == null) {
            return;
        }
        this.f25113j0 = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f25114k0);
    }
}
