package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0003\u00150RB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\"J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0004J\u001f\u0010+\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0004J\u0017\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b:\u0010;R(\u0010B\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bA\u0010\u0004\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0007R \u0010H\u001a\b\u0012\u0004\u0012\u00020-0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010IR\u0016\u0010K\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0016\u0010L\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010IR\u0016\u0010M\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010IR\u0016\u0010N\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010IR\u0014\u0010Q\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lcom/swmansion/rnscreens/F;", "Landroidx/fragment/app/Fragment;", "Lcom/swmansion/rnscreens/G;", "<init>", "()V", "Lcom/swmansion/rnscreens/y;", "screenView", "(Lcom/swmansion/rnscreens/y;)V", "Li7/B;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "n", PointerEventHelper.POINTER_TYPE_UNKNOWN, "b", "()Z", "Landroid/app/Activity;", "e", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/ReactContext;", "i", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/rnscreens/F$b;", "event", "x", "(Lcom/swmansion/rnscreens/F$b;)Z", "d", "(Lcom/swmansion/rnscreens/F$b;)V", "fragmentWrapper", "z", "(Lcom/swmansion/rnscreens/F$b;Lcom/swmansion/rnscreens/G;)V", "k", "y", PointerEventHelper.POINTER_TYPE_UNKNOWN, "alpha", "closing", "E", "(FZ)V", "Lcom/swmansion/rnscreens/A;", "m", "(Lcom/swmansion/rnscreens/A;)V", "c", "I", "H", "onDestroy", "K", "C", "A", "D", "B", "animationEnd", "F", "(Z)V", "g", "Lcom/swmansion/rnscreens/y;", "j", "()Lcom/swmansion/rnscreens/y;", "J", "getScreen$annotations", "screen", PointerEventHelper.POINTER_TYPE_UNKNOWN, "h", "Ljava/util/List;", "l", "()Ljava/util/List;", "childScreenContainers", "Z", "shouldUpdateOnResume", "transitionProgress", "canDispatchWillAppear", "canDispatchAppear", "isTransitioning", "f", "()Landroidx/fragment/app/Fragment;", "fragment", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class F extends Fragment implements G {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public C2311y screen;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List childScreenContainers;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean shouldUpdateOnResume;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float transitionProgress;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean canDispatchWillAppear;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean canDispatchAppear;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitioning;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.F$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a(float f10) {
            return (short) (f10 == 0.0f ? 1 : f10 == 1.0f ? 2 : 3);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f25007g = new b("DID_APPEAR", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f25008h = new b("WILL_APPEAR", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f25009i = new b("DID_DISAPPEAR", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f25010j = new b("WILL_DISAPPEAR", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ b[] f25011k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25012l;

        static {
            b[] bVarArrH = h();
            f25011k = bVarArrH;
            f25012l = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f25007g, f25008h, f25009i, f25010j};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25011k.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            AbstractC2855l.g(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25013a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f25008h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f25007g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f25010j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f25009i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25013a = iArr;
        }
    }

    public F() {
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final void A() {
        z(b.f25007g, this);
        E(1.0f, false);
    }

    private final void B() {
        z(b.f25009i, this);
        E(1.0f, true);
    }

    private final void C() {
        z(b.f25008h, this);
        E(0.0f, false);
    }

    private final void D() {
        z(b.f25010j, this);
        E(0.0f, true);
    }

    private final void F(final boolean animationEnd) {
        this.isTransitioning = !animationEnd;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof F) && !((F) parentFragment).isTransitioning)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        F.G(animationEnd, this);
                    }
                });
            } else if (animationEnd) {
                B();
            } else {
                D();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(boolean z10, F f10) {
        if (z10) {
            f10.A();
        } else {
            f10.C();
        }
    }

    private final void K() {
        AbstractActivityC1749q activity = getActivity();
        if (activity == null) {
            this.shouldUpdateOnResume = true;
        } else {
            g0.f25132a.p(j(), activity, i());
        }
    }

    public void E(float alpha, boolean closing) {
        if (!(this instanceof X) || this.transitionProgress == alpha) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, alpha));
        this.transitionProgress = fMax;
        short sA = INSTANCE.a(fMax);
        X x10 = (X) this;
        A container = x10.j().getContainer();
        boolean goingForward = container instanceof S ? ((S) container).getGoingForward() : false;
        Context context = x10.j().getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, x10.j().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new M6.j(UIManagerHelper.getSurfaceId(reactContext), x10.j().getId(), this.transitionProgress, closing, goingForward, sA));
        }
    }

    public void H() {
        F(true);
    }

    public void I() {
        F(false);
    }

    public void J(C2311y c2311y) {
        AbstractC2855l.g(c2311y, "<set-?>");
        this.screen = c2311y;
    }

    @Override // com.swmansion.rnscreens.G
    public boolean b() {
        return false;
    }

    @Override // com.swmansion.rnscreens.G
    public void c(A container) {
        AbstractC2855l.g(container, "container");
        getChildScreenContainers().remove(container);
    }

    @Override // com.swmansion.rnscreens.C
    public void d(b event) {
        AbstractC2855l.g(event, "event");
        int i10 = d.f25013a[event.ordinal()];
        if (i10 == 1) {
            this.canDispatchWillAppear = false;
            return;
        }
        if (i10 == 2) {
            this.canDispatchAppear = false;
        } else if (i10 == 3) {
            this.canDispatchWillAppear = true;
        } else {
            if (i10 != 4) {
                throw new C2750m();
            }
            this.canDispatchAppear = true;
        }
    }

    @Override // com.swmansion.rnscreens.G
    public Activity e() {
        Fragment fragment;
        AbstractActivityC1749q activity;
        AbstractActivityC1749q activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = j().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = j().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof C2311y) && (fragment = ((C2311y) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.G
    public ReactContext i() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (j().getContext() instanceof ReactContext) {
            Context context2 = j().getContext();
            AbstractC2855l.e(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = j().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C2311y) {
                C2311y c2311y = (C2311y) container;
                if (c2311y.getContext() instanceof ReactContext) {
                    Context context3 = c2311y.getContext();
                    AbstractC2855l.e(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.G
    public C2311y j() {
        C2311y c2311y = this.screen;
        if (c2311y != null) {
            return c2311y;
        }
        AbstractC2855l.y("screen");
        return null;
    }

    @Override // com.swmansion.rnscreens.C
    public void k(b event) {
        G fragmentWrapper;
        AbstractC2855l.g(event, "event");
        List childScreenContainers = getChildScreenContainers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childScreenContainers) {
            if (((A) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2311y topScreen = ((A) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                z(event, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.G
    /* JADX INFO: renamed from: l, reason: from getter */
    public List getChildScreenContainers() {
        return this.childScreenContainers;
    }

    @Override // com.swmansion.rnscreens.G
    public void m(A container) {
        AbstractC2855l.g(container, "container");
        getChildScreenContainers().add(container);
    }

    @Override // com.swmansion.rnscreens.G
    public void n() {
        K();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC2855l.g(inflater, "inflater");
        j().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        cVar.addView(N6.c.c(j()));
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        A container = j().getContainer();
        if (container == null || !container.n(j().getFragmentWrapper())) {
            Context context = j().getContext();
            if (context instanceof ReactContext) {
                int surfaceId = UIManagerHelper.getSurfaceId(context);
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, j().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new M6.h(surfaceId, j().getId()));
                }
            }
        }
        getChildScreenContainers().clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            g0.f25132a.p(j(), e(), i());
        }
    }

    public boolean x(b event) {
        AbstractC2855l.g(event, "event");
        int i10 = d.f25013a[event.ordinal()];
        if (i10 == 1) {
            return this.canDispatchWillAppear;
        }
        if (i10 == 2) {
            return this.canDispatchAppear;
        }
        if (i10 == 3) {
            return !this.canDispatchWillAppear;
        }
        if (i10 == 4) {
            return !this.canDispatchAppear;
        }
        throw new C2750m();
    }

    public void y() {
        Context context = j().getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, j().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new M6.b(surfaceId, j().getId()));
        }
    }

    public void z(b event, G fragmentWrapper) {
        Event<?> kVar;
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(fragmentWrapper, "fragmentWrapper");
        Fragment fragmentF = fragmentWrapper.f();
        if (fragmentF instanceof X) {
            X x10 = (X) fragmentF;
            if (x10.x(event)) {
                C2311y c2311yJ = x10.j();
                fragmentWrapper.d(event);
                int surfaceId = UIManagerHelper.getSurfaceId(c2311yJ);
                int i10 = d.f25013a[event.ordinal()];
                if (i10 == 1) {
                    kVar = new M6.k(surfaceId, c2311yJ.getId());
                } else if (i10 == 2) {
                    kVar = new M6.f(surfaceId, c2311yJ.getId());
                } else if (i10 == 3) {
                    kVar = new M6.l(surfaceId, c2311yJ.getId());
                } else {
                    if (i10 != 4) {
                        throw new C2750m();
                    }
                    kVar = new M6.g(surfaceId, c2311yJ.getId());
                }
                Context context = j().getContext();
                AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, j().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(kVar);
                }
                fragmentWrapper.k(event);
            }
        }
    }

    public F(C2311y screenView) {
        AbstractC2855l.g(screenView, "screenView");
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        J(screenView);
    }

    @Override // com.swmansion.rnscreens.InterfaceC2297j
    public Fragment f() {
        return this;
    }
}
