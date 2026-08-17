package w6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q6.C3127f;
import r6.i;
import u6.g;
import u6.k;
import u6.p;

/* JADX INFO: renamed from: w6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3484c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33160c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f33161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThemedReactContext f33162b;

    /* JADX INFO: renamed from: w6.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final B6.d a(ThemedReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        p pVar = this.f33161a;
        if (pVar == null || this.f33162b != reactContext) {
            if (pVar != null) {
                pVar.d();
            }
            p pVar2 = new p(reactContext);
            this.f33161a = pVar2;
            pVar2.b();
            this.f33162b = reactContext;
        }
        return new B6.d(reactContext);
    }

    public final Map b() {
        C3127f.a aVar = C3127f.f30847f;
        return MapBuilder.of(aVar.c().j(), MapBuilder.of("registrationName", "onKeyboardMove"), aVar.d().j(), MapBuilder.of("registrationName", "onKeyboardMoveStart"), aVar.a().j(), MapBuilder.of("registrationName", "onKeyboardMoveEnd"), aVar.b().j(), MapBuilder.of("registrationName", "onKeyboardMoveInteractive"), "topFocusedInputLayoutChanged", MapBuilder.of("registrationName", "onFocusedInputLayoutChanged"), "topFocusedInputTextChanged", MapBuilder.of("registrationName", "onFocusedInputTextChanged"), "topFocusedInputSelectionChanged", MapBuilder.of("registrationName", "onFocusedInputSelectionChanged"));
    }

    public final void c() {
        p pVar = this.f33161a;
        if (pVar != null) {
            pVar.d();
        }
        this.f33161a = null;
        this.f33162b = null;
    }

    public final void d(B6.d view) {
        AbstractC2855l.g(view, "view");
        view.n();
    }

    public final void e(B6.d view, boolean z10) {
        AbstractC2855l.g(view, "view");
        view.setActive(z10);
    }

    public final void f(B6.d view, boolean z10) {
        AbstractC2855l.g(view, "view");
        view.setNavigationBarTranslucent(z10);
    }

    public final void g(B6.d view, boolean z10) {
        AbstractC2855l.g(view, "view");
        view.setPreserveEdgeToEdge(z10);
    }

    public final void h(B6.d view, boolean z10) {
        AbstractC2855l.g(view, "view");
        view.setStatusBarTranslucent(z10);
    }

    public final void i(B6.d view) {
        g gVarI;
        AbstractC2855l.g(view, "view");
        k callback$react_native_keyboard_controller_release = view.getCallback$react_native_keyboard_controller_release();
        if (callback$react_native_keyboard_controller_release != null && (gVarI = callback$react_native_keyboard_controller_release.i()) != null) {
            gVarI.l();
        }
        i.b(view.getReactContext(), "KeyboardController::layoutDidSynchronize", Arguments.createMap());
    }
}
