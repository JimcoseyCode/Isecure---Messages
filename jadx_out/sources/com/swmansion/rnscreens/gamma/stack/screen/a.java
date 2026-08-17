package com.swmansion.rnscreens.gamma.stack.screen;

import C7.k;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.r;
import com.facebook.react.uimanager.ThemedReactContext;
import java.lang.ref.WeakReference;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.p;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ViewGroup implements O6.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ k[] f25161m = {D.e(new p(a.class, "activityMode", "getActivityMode()Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f25162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference f25164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kotlin.properties.d f25165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f25166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f25167l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.stack.screen.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class EnumC0239a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0239a f25168g = new EnumC0239a("DETACHED", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final EnumC0239a f25169h = new EnumC0239a("ATTACHED", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumC0239a[] f25170i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25171j;

        static {
            EnumC0239a[] enumC0239aArrH = h();
            f25170i = enumC0239aArrH;
            f25171j = AbstractC3083a.a(enumC0239aArrH);
        }

        private EnumC0239a(String str, int i10) {
        }

        private static final /* synthetic */ EnumC0239a[] h() {
            return new EnumC0239a[]{f25168g, f25169h};
        }

        public static EnumC0239a valueOf(String str) {
            return (EnumC0239a) Enum.valueOf(EnumC0239a.class, str);
        }

        public static EnumC0239a[] values() {
            return (EnumC0239a[]) f25170i.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f25172a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, a aVar) {
            super(obj);
            this.f25172a = aVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(k property, Object obj, Object obj2) {
            com.swmansion.rnscreens.gamma.stack.host.k kVar;
            AbstractC2855l.g(property, "property");
            if (((EnumC0239a) obj) == ((EnumC0239a) obj2) || (kVar = this.f25172a.getStackHost$react_native_screens_release().get()) == null) {
                return;
            }
            kVar.e(this.f25172a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f25162g = reactContext;
        this.f25164i = new WeakReference(null);
        kotlin.properties.a aVar = kotlin.properties.a.f29400a;
        this.f25165j = new b(EnumC0239a.f25168g, this);
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.b a(r viewLifecycleOwner) {
        AbstractC2855l.g(viewLifecycleOwner, "viewLifecycleOwner");
        return new com.swmansion.rnscreens.gamma.stack.screen.b(viewLifecycleOwner.getLifecycle(), getEventEmitter$react_native_screens_release());
    }

    public final boolean b() {
        return this.f25163h;
    }

    public final void c() {
        if (getActivityMode() == EnumC0239a.f25169h) {
            setNativelyDismissed$react_native_screens_release(true);
        }
        getEventEmitter$react_native_screens_release().h(this.f25163h);
    }

    public final void d() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] StackScreen must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new c(this.f25162g, getId()));
    }

    public final EnumC0239a getActivityMode() {
        return (EnumC0239a) this.f25165j.getValue(this, f25161m[0]);
    }

    @Override // O6.a
    public Fragment getAssociatedFragment() {
        Fragment fragmentA = N6.c.a(this);
        if (fragmentA == null) {
            return null;
        }
        if (fragmentA instanceof d) {
            return fragmentA;
        }
        throw new IllegalStateException(("[RNScreens] Unexpected fragment type: " + fragmentA.getClass().getSimpleName()).toString());
    }

    public final c getEventEmitter$react_native_screens_release() {
        c cVar = this.f25167l;
        if (cVar != null) {
            return cVar;
        }
        AbstractC2855l.y("eventEmitter");
        return null;
    }

    public final String getScreenKey() {
        return this.f25166k;
    }

    public final WeakReference<com.swmansion.rnscreens.gamma.stack.host.k> getStackHost$react_native_screens_release() {
        return this.f25164i;
    }

    public final void setActivityMode(EnumC0239a enumC0239a) {
        AbstractC2855l.g(enumC0239a, "<set-?>");
        this.f25165j.setValue(this, f25161m[0], enumC0239a);
    }

    public final void setEventEmitter$react_native_screens_release(c cVar) {
        AbstractC2855l.g(cVar, "<set-?>");
        this.f25167l = cVar;
    }

    public final void setNativelyDismissed$react_native_screens_release(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("[RNScreens] Natively dismissed StackScreen must remain dismissed.");
        }
        this.f25163h = true;
    }

    public final void setScreenKey(String str) {
        if (this.f25166k != null) {
            throw new IllegalArgumentException("[RNScreens] StackScreen can't change its screenKey.");
        }
        this.f25166k = str;
    }

    public final void setStackHost$react_native_screens_release(WeakReference<com.swmansion.rnscreens.gamma.stack.host.k> weakReference) {
        AbstractC2855l.g(weakReference, "<set-?>");
        this.f25164i = weakReference;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
