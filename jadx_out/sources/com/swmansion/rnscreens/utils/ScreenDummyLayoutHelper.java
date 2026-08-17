package com.swmansion.rnscreens.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.a0;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import i7.C2735B;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "g", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z", "Landroid/content/Context;", "contextWithTheme", "Li7/B;", "f", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.FONT_SIZE, "isTitleEmpty", PointerEventHelper.POINTER_TYPE_UNKNOWN, "computeDummyLayout", "(IZ)F", "Lkotlin/Function0;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "lazyMessage", "j", "(Lw7/a;)Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/app/Activity;", "i", "()Landroid/app/Activity;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "h", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Landroid/view/View;", "Landroid/view/View;", "dummyContentView", "Landroidx/appcompat/widget/Toolbar;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "k", "F", "defaultFontSize", "l", "I", "defaultContentInsetStartWithNavigation", "Lcom/swmansion/rnscreens/utils/a;", "m", "Lcom/swmansion/rnscreens/utils/a;", "cache", "Ljava/lang/ref/WeakReference;", "n", "Ljava/lang/ref/WeakReference;", "reactContextRef", "o", "Z", "isLayoutInitialized", "p", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static WeakReference f25379q = new WeakReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private CoordinatorLayout coordinatorLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private AppBarLayout appBarLayout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private View dummyContentView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Toolbar toolbar;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float defaultFontSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int defaultContentInsetStartWithNavigation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private a cache;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private WeakReference reactContextRef;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isLayoutInitialized;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @DoNotStrip
        public final ScreenDummyLayoutHelper getInstance() {
            return (ScreenDummyLayoutHelper) ScreenDummyLayoutHelper.f25379q.get();
        }

        private Companion() {
        }
    }

    public ScreenDummyLayoutHelper(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        this.cache = a.f25389c.a();
        this.reactContextRef = new WeakReference(reactContext);
        try {
            System.loadLibrary("react_codegen_rnscreens");
        } catch (UnsatisfiedLinkError unused) {
        }
        f25379q = new WeakReference(this);
        if (reactContext.hasCurrentActivity() && g(reactContext)) {
            return;
        }
        reactContext.addLifecycleEventListener(this);
    }

    @DoNotStrip
    private final float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        if (!this.isLayoutInitialized && !g(j(new InterfaceC3487a() { // from class: Y6.f
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ScreenDummyLayoutHelper.e();
            }
        }))) {
            return 0.0f;
        }
        if (this.cache.c(new b(fontSize, isTitleEmpty))) {
            return this.cache.b();
        }
        View decorView = i().getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        int iA = Y6.a.a(decorView);
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        AppBarLayout appBarLayout = null;
        if (isTitleEmpty) {
            Toolbar toolbar = this.toolbar;
            if (toolbar == null) {
                AbstractC2855l.y("toolbar");
                toolbar = null;
            }
            toolbar.setTitle(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            Toolbar toolbar2 = this.toolbar;
            if (toolbar2 == null) {
                AbstractC2855l.y("toolbar");
                toolbar2 = null;
            }
            toolbar2.setContentInsetStartWithNavigation(0);
        } else {
            Toolbar toolbar3 = this.toolbar;
            if (toolbar3 == null) {
                AbstractC2855l.y("toolbar");
                toolbar3 = null;
            }
            toolbar3.setTitle("FontSize123!#$");
            Toolbar toolbar4 = this.toolbar;
            if (toolbar4 == null) {
                AbstractC2855l.y("toolbar");
                toolbar4 = null;
            }
            toolbar4.setContentInsetStartWithNavigation(this.defaultContentInsetStartWithNavigation);
        }
        a0.a aVar = a0.f25062J;
        Toolbar toolbar5 = this.toolbar;
        if (toolbar5 == null) {
            AbstractC2855l.y("toolbar");
            toolbar5 = null;
        }
        TextView textViewA = aVar.a(toolbar5);
        if (textViewA != null) {
            textViewA.setTextSize(fontSize != -1 ? fontSize : this.defaultFontSize);
        }
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            AbstractC2855l.y("coordinatorLayout");
            coordinatorLayout = null;
        }
        coordinatorLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        CoordinatorLayout coordinatorLayout2 = this.coordinatorLayout;
        if (coordinatorLayout2 == null) {
            AbstractC2855l.y("coordinatorLayout");
            coordinatorLayout2 = null;
        }
        coordinatorLayout2.layout(0, 0, width, height);
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            AbstractC2855l.y("appBarLayout");
        } else {
            appBarLayout = appBarLayout2;
        }
        float dIPFromPixel = PixelUtil.toDIPFromPixel(appBarLayout.getHeight() + iA);
        this.cache = new a(new b(fontSize, isTitleEmpty), dIPFromPixel);
        return dIPFromPixel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e() {
        return "[RNScreens] Context was null-ed before dummy layout was initialized";
    }

    private final void f(Context contextWithTheme) {
        this.coordinatorLayout = new CoordinatorLayout(contextWithTheme);
        AppBarLayout appBarLayout = new AppBarLayout(contextWithTheme);
        appBarLayout.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        this.appBarLayout = appBarLayout;
        Toolbar toolbar = new Toolbar(contextWithTheme);
        toolbar.setTitle("FontSize123!#$");
        AppBarLayout.d dVar = new AppBarLayout.d(-1, -2);
        dVar.g(0);
        toolbar.setLayoutParams(dVar);
        this.toolbar = toolbar;
        TextView textViewA = a0.f25062J.a(toolbar);
        AbstractC2855l.d(textViewA);
        this.defaultFontSize = textViewA.getTextSize();
        Toolbar toolbar2 = this.toolbar;
        View view = null;
        if (toolbar2 == null) {
            AbstractC2855l.y("toolbar");
            toolbar2 = null;
        }
        this.defaultContentInsetStartWithNavigation = toolbar2.getContentInsetStartWithNavigation();
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            AbstractC2855l.y("appBarLayout");
            appBarLayout2 = null;
        }
        Toolbar toolbar3 = this.toolbar;
        if (toolbar3 == null) {
            AbstractC2855l.y("toolbar");
            toolbar3 = null;
        }
        appBarLayout2.addView(toolbar3);
        View view2 = new View(contextWithTheme);
        view2.setLayoutParams(new CoordinatorLayout.f(-1, -1));
        this.dummyContentView = view2;
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            AbstractC2855l.y("coordinatorLayout");
            coordinatorLayout = null;
        }
        AppBarLayout appBarLayout3 = this.appBarLayout;
        if (appBarLayout3 == null) {
            AbstractC2855l.y("appBarLayout");
            appBarLayout3 = null;
        }
        coordinatorLayout.addView(appBarLayout3);
        View view3 = this.dummyContentView;
        if (view3 == null) {
            AbstractC2855l.y("dummyContentView");
        } else {
            view = view3;
        }
        coordinatorLayout.addView(view);
        this.isLayoutInitialized = true;
    }

    private final boolean g(ReactApplicationContext reactContext) {
        if (this.isLayoutInitialized) {
            return true;
        }
        if (!reactContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
        }
        synchronized (this) {
            if (this.isLayoutInitialized) {
                return true;
            }
            f(currentActivity);
            C2735B c2735b = C2735B.f28704a;
            return true;
        }
    }

    @DoNotStrip
    public static final ScreenDummyLayoutHelper getInstance() {
        return INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h() {
        return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
    }

    private final Activity i() {
        Activity currentActivity = k(this, null, 1, null).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity");
    }

    private final ReactApplicationContext j(InterfaceC3487a lazyMessage) {
        Object obj = this.reactContextRef.get();
        if (lazyMessage == null) {
            lazyMessage = new InterfaceC3487a() { // from class: Y6.h
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return ScreenDummyLayoutHelper.l();
                }
            };
        }
        if (obj != null) {
            return (ReactApplicationContext) obj;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }

    static /* synthetic */ ReactApplicationContext k(ScreenDummyLayoutHelper screenDummyLayoutHelper, InterfaceC3487a interfaceC3487a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC3487a = null;
        }
        return screenDummyLayoutHelper.j(interfaceC3487a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l() {
        return "[RNScreens] Attempt to require missing react context";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.reactContextRef.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContextJ = j(new InterfaceC3487a() { // from class: Y6.g
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ScreenDummyLayoutHelper.h();
            }
        });
        if (g(reactApplicationContextJ)) {
            reactApplicationContextJ.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }
}
