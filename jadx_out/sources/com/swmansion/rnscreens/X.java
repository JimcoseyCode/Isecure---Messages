package com.swmansion.rnscreens;

import L6.o;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1690q0;
import androidx.core.view.L0;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.d0;
import h5.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020)2\b\b\u0002\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u0010\u0018J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0007J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00107J\u000f\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010\u0007J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010\u0007J\u000f\u0010<\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010\u0007J\u0019\u0010?\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J+\u0010E\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bE\u0010FJ!\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u001d2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bH\u0010IJ)\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0012H\u0016¢\u0006\u0004\bN\u0010OJ)\u0010P\u001a\u0004\u0018\u00010\n2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0012H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bR\u0010\u0007J\u000f\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010\u0007J\u0017\u0010T\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\bT\u0010\u001cJ\u001f\u0010V\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010B\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0016H\u0016¢\u0006\u0004\bX\u0010\u0018J\u000f\u0010Y\u001a\u00020\bH\u0016¢\u0006\u0004\bY\u0010\u0007J\u000f\u0010[\u001a\u00020ZH\u0000¢\u0006\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010<R\u0016\u0010f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010<R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010s\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR0\u0010{\u001a\u0010\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\b\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u0088\u0001\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010.\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u008e\u0001\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010\\\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0091\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/swmansion/rnscreens/X;", "Lcom/swmansion/rnscreens/F;", "Lcom/swmansion/rnscreens/Y;", "Lcom/swmansion/rnscreens/y;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/y;)V", "()V", "Li7/B;", "f0", "Landroid/animation/Animator;", "W", "()Landroid/animation/Animator;", "X", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "V", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "screen", PointerEventHelper.POINTER_TYPE_UNKNOWN, "m0", "(Lcom/swmansion/rnscreens/y;)Ljava/lang/Integer;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "r0", "()Z", "Landroid/view/Menu;", "menu", "s0", "(Landroid/view/Menu;)V", "Landroid/view/View;", "a0", "()Landroid/view/View;", "LL6/b;", "sheetTransitionCoordinator", "P", "(LL6/b;)V", "Landroidx/core/view/L0;", "insetsCompat", "e0", "(Landroidx/core/view/L0;)V", "forceCreation", "LL6/g;", "j0", "(Z)LL6/g;", "LL6/o;", "l0", "()LL6/o;", "b", "h0", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "o0", "(Landroidx/appcompat/widget/Toolbar;)V", ViewProps.HIDDEN, "p0", "(Z)V", "translucent", "q0", "n", "H", "Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "onCreateAnimator", "(IZI)Landroid/animation/Animator;", "onStart", "onStop", "onPrepareOptionsMenu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "U", "Y", "LL6/c;", "i0", "()LL6/c;", "Lcom/swmansion/rnscreens/a;", "o", "Lcom/swmansion/rnscreens/a;", "appBarLayout", "p", "Landroidx/appcompat/widget/Toolbar;", "q", "isToolbarShadowHidden", "r", "isToolbarTranslucent", "s", "LL6/b;", "t", "Landroid/view/View;", "lastFocusedChild", "Lcom/swmansion/rnscreens/d;", "u", "Lcom/swmansion/rnscreens/d;", "c0", "()Lcom/swmansion/rnscreens/d;", "setSearchView", "(Lcom/swmansion/rnscreens/d;)V", "searchView", "Lkotlin/Function1;", "v", "Lkotlin/jvm/functions/Function1;", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "n0", "(Lkotlin/jvm/functions/Function1;)V", "onSearchViewCreate", "LW6/e;", "w", "LW6/e;", "coordinatorLayout", "x", "LL6/g;", "dimmingDelegate", "y", "LL6/o;", "d0", "setSheetDelegate$react_native_screens_release", "(LL6/o;)V", "sheetDelegate", "z", "LL6/c;", "getBottomSheetWindowInsetListenerChain$react_native_screens_release", "setBottomSheetWindowInsetListenerChain$react_native_screens_release", "(LL6/c;)V", "bottomSheetWindowInsetListenerChain", "A", "Landroidx/core/view/L0;", "lastInsetsCompat", "Lcom/swmansion/rnscreens/S;", "b0", "()Lcom/swmansion/rnscreens/S;", "screenStack", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class X extends F implements Y {

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    private L0 lastInsetsCompat;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private C2288a appBarLayout;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Toolbar toolbar;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isToolbarShadowHidden;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isToolbarTranslucent;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private L6.b sheetTransitionCoordinator;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private View lastFocusedChild;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C2291d searchView;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function1 onSearchViewCreate;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private W6.e coordinatorLayout;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private L6.g dimmingDelegate;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private L6.o sheetDelegate;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private L6.c bottomSheetWindowInsetListenerChain;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends C1690q0.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ L6.o f25059g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ X f25060h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L6.o oVar, X x10) {
            super(0);
            this.f25059g = oVar;
            this.f25060h = x10;
        }

        @Override // androidx.core.view.C1690q0.b
        public void onEnd(C1690q0 animation) {
            AbstractC2855l.g(animation, "animation");
            super.onEnd(animation);
            this.f25060h.j().y();
        }

        @Override // androidx.core.view.C1690q0.b
        public L0 onProgress(L0 insets, List runningAnimations) {
            AbstractC2855l.g(insets, "insets");
            AbstractC2855l.g(runningAnimations, "runningAnimations");
            if (Build.VERSION.SDK_INT >= 30) {
                this.f25059g.I(insets);
            }
            return insets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C2311y screenView) {
        super(screenView);
        AbstractC2855l.g(screenView, "screenView");
    }

    private final void P(final L6.b sheetTransitionCoordinator) {
        final A container = j().getContainer();
        if (container != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.swmansion.rnscreens.U
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return X.Q(container, this, view, windowInsets);
                    }
                });
            } else {
                i0().b(new androidx.core.view.I() { // from class: com.swmansion.rnscreens.V
                    @Override // androidx.core.view.I
                    public final L0 a(View view, L0 l02) {
                        return X.R(this.f25043g, view, l02);
                    }
                });
            }
        }
        A container2 = j().getContainer();
        if (container2 != null) {
            container2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.rnscreens.W
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    X.S(sheetTransitionCoordinator, this, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets Q(A a10, X x10, View view, WindowInsets insets) {
        AbstractC2855l.g(view, "<unused var>");
        AbstractC2855l.g(insets, "insets");
        L0 l0Z = L0.z(insets, a10);
        AbstractC2855l.f(l0Z, "toWindowInsetsCompat(...)");
        x10.e0(l0Z);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 R(X x10, View view, L0 windowInsets) {
        AbstractC2855l.g(view, "<unused var>");
        AbstractC2855l.g(windowInsets, "windowInsets");
        x10.e0(windowInsets);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(L6.b bVar, X x10, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        bVar.b(x10.j());
    }

    private final void T(C2311y screen) {
        float fMax = Math.max(PixelUtil.toPixelFromDIP(screen.getSheetCornerRadius()), 0.0f);
        l.b bVar = new l.b();
        bVar.A(0, fMax);
        bVar.F(0, fMax);
        h5.l lVarM = bVar.m();
        AbstractC2855l.f(lVarM, "build(...)");
        h5.h hVar = new h5.h(lVarM);
        Integer numM0 = m0(screen);
        hVar.setTint(numM0 != null ? numM0.intValue() : 0);
        screen.setBackground(hVar);
    }

    private final BottomSheetBehavior V() {
        return new BottomSheetBehavior();
    }

    private final Animator W() {
        L6.o oVarL0 = l0();
        W6.e eVar = null;
        L6.g gVarK0 = k0(this, false, 1, null);
        C2311y c2311yJ = j();
        W6.e eVar2 = this.coordinatorLayout;
        if (eVar2 == null) {
            AbstractC2855l.y("coordinatorLayout");
        } else {
            eVar = eVar2;
        }
        return oVarL0.r(new o.c(this, c2311yJ, eVar, gVarK0));
    }

    private final Animator X() {
        L6.o oVarL0 = l0();
        W6.e eVar = null;
        L6.g gVarK0 = k0(this, false, 1, null);
        C2311y c2311yJ = j();
        W6.e eVar2 = this.coordinatorLayout;
        if (eVar2 == null) {
            AbstractC2855l.y("coordinatorLayout");
        } else {
            eVar = eVar2;
        }
        return oVarL0.s(new o.c(this, c2311yJ, eVar, gVarK0));
    }

    private final View a0() {
        View viewJ = j();
        while (viewJ != null) {
            if (viewJ.isFocused()) {
                return viewJ;
            }
            viewJ = viewJ instanceof ViewGroup ? ((ViewGroup) viewJ).getFocusedChild() : null;
        }
        return null;
    }

    private final S b0() {
        A container = j().getContainer();
        if (container instanceof S) {
            return (S) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    private final void e0(L0 insetsCompat) {
        if (AbstractC2855l.b(this.lastInsetsCompat, insetsCompat)) {
            return;
        }
        this.lastInsetsCompat = insetsCompat;
        L6.o oVarL0 = l0();
        BottomSheetBehavior<C2311y> sheetBehavior = j().getSheetBehavior();
        AbstractC2855l.d(sheetBehavior);
        oVarL0.R(sheetBehavior);
        A container = j().getContainer();
        L6.b bVar = null;
        if (container != null) {
            W6.e eVar = this.coordinatorLayout;
            if (eVar == null) {
                AbstractC2855l.y("coordinatorLayout");
                eVar = null;
            }
            eVar.forceLayout();
            W6.e eVar2 = this.coordinatorLayout;
            if (eVar2 == null) {
                AbstractC2855l.y("coordinatorLayout");
                eVar2 = null;
            }
            eVar2.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            W6.e eVar3 = this.coordinatorLayout;
            if (eVar3 == null) {
                AbstractC2855l.y("coordinatorLayout");
                eVar3 = null;
            }
            eVar3.layout(0, 0, container.getWidth(), container.getHeight());
        }
        j().u(true);
        L6.b bVar2 = this.sheetTransitionCoordinator;
        if (bVar2 == null) {
            AbstractC2855l.y("sheetTransitionCoordinator");
        } else {
            bVar = bVar2;
        }
        bVar.a(j());
    }

    private final void f0() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof S) {
            ((S) parent).b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 g0(L6.o oVar, View view, L0 windowInsets) {
        AbstractC2855l.g(view, "<unused var>");
        AbstractC2855l.g(windowInsets, "windowInsets");
        oVar.I(windowInsets);
        return windowInsets;
    }

    private final L6.g j0(boolean forceCreation) {
        L6.g gVar = this.dimmingDelegate;
        if (gVar == null || forceCreation) {
            if (gVar != null) {
                gVar.f(j().getSheetBehavior());
            }
            this.dimmingDelegate = new L6.g(j().getReactContext(), j());
        }
        L6.g gVar2 = this.dimmingDelegate;
        AbstractC2855l.d(gVar2);
        return gVar2;
    }

    static /* synthetic */ L6.g k0(X x10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return x10.j0(z10);
    }

    private final L6.o l0() {
        if (this.sheetDelegate == null) {
            this.sheetDelegate = new L6.o(j());
        }
        L6.o oVar = this.sheetDelegate;
        AbstractC2855l.d(oVar);
        return oVar;
    }

    private final Integer m0(C2311y screen) {
        Integer numValueOf;
        ColorStateList colorStateListJ;
        Drawable background = screen.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            numValueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            h5.h hVar = background2 instanceof h5.h ? (h5.h) background2 : null;
            numValueOf = (hVar == null || (colorStateListJ = hVar.J()) == null) ? null : Integer.valueOf(colorStateListJ.getDefaultColor());
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        B contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return null;
        }
        return Y6.i.a(contentWrapper);
    }

    private final boolean r0() {
        a0 headerConfig = j().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i10 = 0; i10 < configSubviewsCount; i10++) {
                if (headerConfig.g(i10).getType() == d0.a.f25104k) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void s0(Menu menu) {
        menu.clear();
        if (r0()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                C2291d c2291d = new C2291d(context, this);
                this.searchView = c2291d;
                Function1 function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(c2291d);
                }
            }
            MenuItem menuItemAdd = menu.add(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(this.searchView);
        }
    }

    @Override // com.swmansion.rnscreens.F
    public void H() {
        super.H();
        f0();
        j().k();
    }

    public boolean U() {
        A container = j().getContainer();
        if (!(container instanceof S)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!AbstractC2855l.b(((S) container).getRootScreen(), j())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof X) {
            return ((X) parentFragment).U();
        }
        return false;
    }

    public void Y() {
        b0().N(this);
    }

    public final void Z() {
        if (isRemoving() && isDetached()) {
            return;
        }
        ThemedReactContext reactContext = j().getReactContext();
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, j().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new M6.h(surfaceId, j().getId()));
        }
    }

    @Override // com.swmansion.rnscreens.F, com.swmansion.rnscreens.G
    public boolean b() {
        return j().s();
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final C2291d getSearchView() {
        return this.searchView;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final L6.o getSheetDelegate() {
        return this.sheetDelegate;
    }

    public void h0() {
        Toolbar toolbar;
        C2288a c2288a = this.appBarLayout;
        if (c2288a != null && (toolbar = this.toolbar) != null && toolbar.getParent() == c2288a) {
            c2288a.removeView(toolbar);
        }
        this.toolbar = null;
    }

    public final L6.c i0() {
        if (this.bottomSheetWindowInsetListenerChain == null) {
            this.bottomSheetWindowInsetListenerChain = new L6.c();
        }
        L6.c cVar = this.bottomSheetWindowInsetListenerChain;
        AbstractC2855l.d(cVar);
        return cVar;
    }

    @Override // com.swmansion.rnscreens.F, com.swmansion.rnscreens.G
    public void n() {
        super.n();
        a0 headerConfig = j().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.l();
        }
    }

    public final void n0(Function1 function1) {
        this.onSearchViewCreate = function1;
    }

    public void o0(Toolbar toolbar) {
        AbstractC2855l.g(toolbar, "toolbar");
        C2288a c2288a = this.appBarLayout;
        if (c2288a != null) {
            c2288a.addView(toolbar);
        }
        AppBarLayout.d dVar = new AppBarLayout.d(-1, -2);
        dVar.g(0);
        toolbar.setLayoutParams(dVar);
        this.toolbar = toolbar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        if (L6.r.d(j())) {
            return enter ? W() : X();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        AbstractC2855l.g(menu, "menu");
        AbstractC2855l.g(inflater, "inflater");
        s0(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.F, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C2288a c2288a;
        C2288a c2288a2;
        C2288a c2288a3;
        AbstractC2855l.g(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC2855l.f(contextRequireContext, "requireContext(...)");
        this.coordinatorLayout = new W6.e(contextRequireContext, this);
        C2311y c2311yJ = j();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.n(L6.r.d(j()) ? V() : this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior());
        c2311yJ.setLayoutParams(fVar);
        W6.e eVar = this.coordinatorLayout;
        if (eVar == null) {
            AbstractC2855l.y("coordinatorLayout");
            eVar = null;
        }
        eVar.addView(N6.c.c(j()));
        if (L6.r.d(j())) {
            j().setClipToOutline(true);
            T(j());
            j().setElevation(j().getSheetElevation());
            final L6.o oVarL0 = l0();
            BottomSheetBehavior<C2311y> sheetBehavior = j().getSheetBehavior();
            AbstractC2855l.d(sheetBehavior);
            L6.o.o(oVarL0, sheetBehavior, null, 0, 6, null);
            L6.g gVarJ0 = j0(true);
            C2311y c2311yJ2 = j();
            W6.e eVar2 = this.coordinatorLayout;
            if (eVar2 == null) {
                AbstractC2855l.y("coordinatorLayout");
                eVar2 = null;
            }
            gVarJ0.h(c2311yJ2, eVar2);
            C2311y c2311yJ3 = j();
            BottomSheetBehavior<C2311y> sheetBehavior2 = j().getSheetBehavior();
            AbstractC2855l.d(sheetBehavior2);
            gVarJ0.g(c2311yJ3, sheetBehavior2);
            if (!j().getSheetShouldOverflowTopInset()) {
                L6.b bVar = new L6.b();
                this.sheetTransitionCoordinator = bVar;
                P(bVar);
            }
            A container2 = j().getContainer();
            AbstractC2855l.d(container2);
            W6.e eVar3 = this.coordinatorLayout;
            if (eVar3 == null) {
                AbstractC2855l.y("coordinatorLayout");
                eVar3 = null;
            }
            eVar3.measure(View.MeasureSpec.makeMeasureSpec(container2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container2.getHeight(), 1073741824));
            W6.e eVar4 = this.coordinatorLayout;
            if (eVar4 == null) {
                AbstractC2855l.y("coordinatorLayout");
                eVar4 = null;
            }
            eVar4.layout(0, 0, container2.getWidth(), container2.getHeight());
            if (Build.VERSION.SDK_INT < 30) {
                L6.c cVarI0 = i0();
                cVarI0.b(new androidx.core.view.I() { // from class: com.swmansion.rnscreens.T
                    @Override // androidx.core.view.I
                    public final L0 a(View view, L0 l02) {
                        return X.g0(oVarL0, view, l02);
                    }
                });
                AbstractC1658a0.w0(j(), cVarI0);
            }
            AbstractC1658a0.C0(j(), new a(oVarL0, this));
        } else {
            Context context = getContext();
            if (context != null) {
                c2288a = new C2288a(context);
                c2288a.setBackgroundColor(0);
                c2288a.setLayoutParams(new AppBarLayout.d(-1, -2));
            } else {
                c2288a = null;
            }
            this.appBarLayout = c2288a;
            W6.e eVar5 = this.coordinatorLayout;
            if (eVar5 == null) {
                AbstractC2855l.y("coordinatorLayout");
                eVar5 = null;
            }
            eVar5.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (c2288a3 = this.appBarLayout) != null) {
                c2288a3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (c2288a2 = this.appBarLayout) != null) {
                c2288a2.addView(N6.c.c(toolbar));
            }
            setHasOptionsMenu(true);
        }
        W6.e eVar6 = this.coordinatorLayout;
        if (eVar6 != null) {
            return eVar6;
        }
        AbstractC2855l.y("coordinatorLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        a0 headerConfig;
        AbstractC2855l.g(menu, "menu");
        if (!j().s() || ((headerConfig = j().getHeaderConfig()) != null && !headerConfig.h())) {
            s0(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (Y6.b.f12946a.a(getContext())) {
            this.lastFocusedChild = a0();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC2855l.g(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    public void p0(boolean hidden) {
        if (this.isToolbarShadowHidden != hidden) {
            C2288a c2288a = this.appBarLayout;
            if (c2288a != null) {
                c2288a.setElevation(hidden ? 0.0f : PixelUtil.toPixelFromDIP(4.0f));
            }
            C2288a c2288a2 = this.appBarLayout;
            if (c2288a2 != null) {
                c2288a2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = hidden;
        }
    }

    public void q0(boolean translucent) {
        if (this.isToolbarTranslucent != translucent) {
            ViewGroup.LayoutParams layoutParams = j().getLayoutParams();
            AbstractC2855l.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.f) layoutParams).n(translucent ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = translucent;
        }
    }

    public X() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
