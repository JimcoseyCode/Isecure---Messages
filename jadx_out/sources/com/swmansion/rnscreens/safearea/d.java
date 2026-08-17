package com.swmansion.rnscreens.safearea;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.rnscreens.safearea.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x0.e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends ReactViewGroup implements I, ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f25364o = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f25365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference f25366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.swmansion.rnscreens.safearea.a f25367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.swmansion.rnscreens.safearea.a f25368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private StateWrapper f25370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private U6.a f25371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f25372n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f25365g = reactContext;
        this.f25366h = new WeakReference(null);
        a.C0243a c0243a = com.swmansion.rnscreens.safearea.a.f25353e;
        this.f25367i = c0243a.b();
        this.f25368j = c0243a.b();
        this.f25372n = b.f25359g;
        AbstractC1658a0.w0(this, this);
    }

    private final c c() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof c)) {
            parent = parent.getParent();
        }
        if (parent instanceof c) {
            return (c) parent;
        }
        return null;
    }

    private final e d(e eVar) {
        U6.a aVar = this.f25371m;
        int i10 = aVar != null ? aVar.b() : false ? 0 : eVar.f33237a;
        U6.a aVar2 = this.f25371m;
        int i11 = aVar2 != null ? aVar2.d() : false ? 0 : eVar.f33238b;
        U6.a aVar3 = this.f25371m;
        int i12 = aVar3 != null ? aVar3.c() : false ? 0 : eVar.f33239c;
        U6.a aVar4 = this.f25371m;
        e eVarC = e.c(i10, i11, i12, aVar4 != null ? aVar4.a() : false ? 0 : eVar.f33240d);
        AbstractC2855l.f(eVarC, "of(...)");
        return eVarC;
    }

    private final void f() {
        a.C0243a c0243a = com.swmansion.rnscreens.safearea.a.f25353e;
        com.swmansion.rnscreens.safearea.a aVarC = c0243a.c(this.f25372n.j() ? this.f25367i : c0243a.b(), this.f25372n.k() ? this.f25368j : c0243a.b());
        StateWrapper stateWrapper = getStateWrapper();
        if (stateWrapper != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(aVarC.c()));
            writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(aVarC.e()));
            writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(aVarC.d()));
            writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(aVarC.b()));
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putMap("insets", writableMapCreateMap);
            stateWrapper.updateState(writableMapCreateMap2);
        }
    }

    private final boolean g() {
        if (!this.f25369k) {
            return false;
        }
        this.f25369k = false;
        f();
        return true;
    }

    @Override // androidx.core.view.I
    public L0 a(View view, L0 insets) {
        boolean zB;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(insets, "insets");
        e eVarF = insets.f(L0.p.g() | L0.p.a());
        AbstractC2855l.f(eVarF, "getInsets(...)");
        if (!AbstractC2855l.b(eVarF, this.f25368j)) {
            this.f25368j = com.swmansion.rnscreens.safearea.a.f25353e.a(eVarF);
            if (this.f25372n.k()) {
                this.f25369k = true;
            }
        }
        L0.a aVar = new L0.a(insets);
        if (this.f25372n.k()) {
            e eVarF2 = insets.f(L0.p.g());
            AbstractC2855l.f(eVarF2, "getInsets(...)");
            e eVarD = d(eVarF2);
            e eVarF3 = insets.f(L0.p.a());
            AbstractC2855l.f(eVarF3, "getInsets(...)");
            e eVarD2 = d(eVarF3);
            zB = AbstractC2855l.b(eVarD2, e.f33236e);
            aVar.b(L0.p.g(), eVarD);
            aVar.b(L0.p.a(), eVarD2);
        } else {
            zB = false;
        }
        L0 l0A = aVar.a();
        AbstractC2855l.f(l0A, "build(...)");
        if (Build.VERSION.SDK_INT >= 30 || !zB) {
            return l0A;
        }
        L0 l0A2 = l0A.a();
        AbstractC2855l.f(l0A2, "consumeDisplayCutout(...)");
        return l0A2;
    }

    public final void e(com.swmansion.rnscreens.safearea.a newInterfaceInsets) {
        AbstractC2855l.g(newInterfaceInsets, "newInterfaceInsets");
        if (AbstractC2855l.b(newInterfaceInsets, this.f25367i)) {
            return;
        }
        this.f25367i = newInterfaceInsets;
        if (this.f25372n.j()) {
            this.f25369k = true;
        }
    }

    public final StateWrapper getStateWrapper() {
        return this.f25370l;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        getViewTreeObserver().addOnPreDrawListener(this);
        c cVarC = c();
        if (cVarC == null) {
            super.onAttachedToWindow();
            return;
        }
        cVarC.setOnInterfaceInsetsChangeListener(this);
        this.f25366h = new WeakReference(cVarC);
        this.f25367i = cVarC.getInterfaceInsets();
        f();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        c cVar = (c) this.f25366h.get();
        if (cVar != null) {
            cVar.c(this);
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zG = g();
        if (zG) {
            requestLayout();
        }
        return !zG;
    }

    public final void setEdges(U6.a edges) {
        AbstractC2855l.g(edges, "edges");
        this.f25371m = edges;
        requestApplyInsets();
        this.f25369k = true;
    }

    public final void setInsetType(b insetType) {
        AbstractC2855l.g(insetType, "insetType");
        this.f25372n = insetType;
        requestApplyInsets();
        this.f25369k = true;
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f25370l = stateWrapper;
    }
}
