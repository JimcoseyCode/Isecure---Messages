package u6;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r6.AbstractC3277f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f32725e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f32726f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThemedReactContext f32727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3404a f32728b = new C3404a(0.0d, 0.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f32729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f32730d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(ThemedReactContext themedReactContext) {
        this.f32727a = themedReactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p pVar, ViewGroup viewGroup) {
        pVar.e(viewGroup);
    }

    private final void e(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        C3404a c3404a = new C3404a(AbstractC3277f.a(viewGroup.getWidth()), AbstractC3277f.a(viewGroup.getHeight()));
        if (AbstractC2855l.b(c3404a, this.f32728b)) {
            return;
        }
        this.f32728b = c3404a;
        ThemedReactContext themedReactContext = this.f32727a;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("height", c3404a.a());
        writableMapCreateMap.putDouble("width", c3404a.b());
        C2735B c2735b = C2735B.f28704a;
        r6.i.b(themedReactContext, "KeyboardController::windowDidResize", writableMapCreateMap);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        ThemedReactContext themedReactContext = this.f32727a;
        if (themedReactContext == null || f32726f == themedReactContext.hashCode()) {
            return;
        }
        f32726f = this.f32727a.hashCode();
        final ViewGroup viewGroupA = r6.h.a(this.f32727a);
        this.f32730d = viewGroupA;
        e(viewGroupA);
        this.f32729c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u6.o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                p.c(this.f32723g, viewGroupA);
            }
        };
        if (viewGroupA == null || (viewTreeObserver = viewGroupA.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.f32729c);
    }

    public final void d() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.f32730d;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f32729c);
        }
        this.f32730d = null;
        this.f32729c = null;
        f32726f = -1;
    }
}
