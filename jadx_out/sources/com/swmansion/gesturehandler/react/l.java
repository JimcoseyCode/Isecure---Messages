package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends ReactViewGroup {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f24952j = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f24955i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    return true;
                }
                if (parent instanceof RootView) {
                    return false;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public l(Context context) {
        super(context);
    }

    public final void c(View view) {
        AbstractC2855l.g(view, "view");
        k kVar = this.f24955i;
        if (kVar != null) {
            kVar.d(view);
        }
    }

    public final boolean d() {
        return this.f24953g;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        AbstractC2855l.g(ev, "ev");
        if (this.f24953g && com.swmansion.gesturehandler.react.a.c(ev)) {
            k kVar = this.f24955i;
            AbstractC2855l.d(kVar);
            if (kVar.e(ev)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        if (this.f24953g) {
            k kVar = this.f24955i;
            AbstractC2855l.d(kVar);
            if (kVar.e(event)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(event);
    }

    public final void e() {
        k kVar = this.f24955i;
        if (kVar != null) {
            kVar.j();
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.f24954h || !f24952j.b(this);
        this.f24953g = z10;
        if (z10 && this.f24955i == null) {
            Context context = getContext();
            AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f24955i = new k((ReactContext) context, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f24953g) {
            k kVar = this.f24955i;
            AbstractC2855l.d(kVar);
            kVar.i();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setUnstableForceActive(boolean z10) {
        this.f24954h = z10;
    }
}
