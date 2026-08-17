package com.swmansion.rnscreens.gamma.stack.host;

import android.view.ViewGroup;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.swmansion.rnscreens.gamma.stack.screen.a;
import i7.C2750m;
import j7.AbstractC2800q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends ViewGroup implements UIManagerListener, i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f25155k = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f25156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f25157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f25158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f25159j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25160a;

        static {
            int[] iArr = new int[a.EnumC0239a.values().length];
            try {
                iArr[a.EnumC0239a.f25168g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0239a.f25169h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25160a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f25156g = reactContext;
        this.f25157h = new ArrayList();
        h hVar = new h(reactContext, new WeakReference(this));
        this.f25158i = hVar;
        this.f25159j = new j();
        addView(hVar);
        UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
        if (uIManager == null) {
            throw new IllegalStateException("[RNScreens] UIManager must not be null.");
        }
        uIManager.addUIManagerEventListener(this);
    }

    private final void b(com.swmansion.rnscreens.gamma.stack.screen.a aVar) {
        if (aVar.getActivityMode() != a.EnumC0239a.f25169h || aVar.b()) {
            aVar.getScreenKey();
        } else {
            this.f25159j.a(aVar);
        }
    }

    private final void c(com.swmansion.rnscreens.gamma.stack.screen.a aVar) {
        if (aVar.getActivityMode() == a.EnumC0239a.f25169h) {
            this.f25159j.b(aVar);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.stack.host.i
    public void a(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC2855l.g(stackScreen, "stackScreen");
        if (stackScreen.getActivityMode() == a.EnumC0239a.f25169h) {
            stackScreen.setNativelyDismissed$react_native_screens_release(true);
        }
    }

    public final void d(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen, int i10) {
        AbstractC2855l.g(stackScreen, "stackScreen");
        this.f25157h.add(i10, stackScreen);
        stackScreen.setStackHost$react_native_screens_release(new WeakReference<>(this));
        c(stackScreen);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        this.f25159j.c(this.f25158i, this.f25157h);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }

    public final void e(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC2855l.g(stackScreen, "stackScreen");
        int i10 = b.f25160a[stackScreen.getActivityMode().ordinal()];
        if (i10 == 1) {
            this.f25159j.a(stackScreen);
        } else {
            if (i10 != 2) {
                throw new C2750m();
            }
            this.f25159j.b(stackScreen);
        }
    }

    public final void f() {
        Iterator it = AbstractC2800q.O(this.f25157h).iterator();
        while (it.hasNext()) {
            b((com.swmansion.rnscreens.gamma.stack.screen.a) it.next());
        }
        this.f25157h.clear();
    }

    public final void g(com.swmansion.rnscreens.gamma.stack.screen.a reactSubview) {
        AbstractC2855l.g(reactSubview, "reactSubview");
        this.f25157h.remove(reactSubview);
        b(reactSubview);
    }

    public final ArrayList<com.swmansion.rnscreens.gamma.stack.screen.a> getRenderedScreens$react_native_screens_release() {
        return this.f25157h;
    }

    public final void h(int i10) {
        Object objRemove = this.f25157h.remove(i10);
        AbstractC2855l.f(objRemove, "removeAt(...)");
        b((com.swmansion.rnscreens.gamma.stack.screen.a) objRemove);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Y6.e.f12948a.a("StackHost", "StackHost [" + getId() + "] attached to window");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f25158i.layout(i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f25158i.measure(i10, i11);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }
}
