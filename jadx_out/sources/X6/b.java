package x6;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.DialogC1623w;
import androidx.core.view.AbstractC1658a0;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.facebook.react.views.modal.ReactModalHostView;
import com.facebook.react.views.modal.ShowEvent;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r6.h;
import r6.j;
import u6.k;
import u6.l;
import v6.C3429a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements EventDispatcherListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f33550g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactViewGroup f33551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThemedReactContext f33552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f33553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3487a f33554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UIManager f33555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EventDispatcher f33556f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(ReactViewGroup view, ThemedReactContext reactContext, l config, InterfaceC3487a callback) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(config, "config");
        AbstractC2855l.g(callback, "callback");
        this.f33551a = view;
        this.f33552b = reactContext;
        this.f33553c = config;
        this.f33554d = callback;
        this.f33555e = h.d(reactContext);
        this.f33556f = h.b(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k kVar, ReactViewGroup reactViewGroup, b bVar, DialogInterface dialogInterface) {
        k.q(kVar, null, null, 3, null);
        kVar.e();
        j.a(reactViewGroup);
        k kVar2 = (k) bVar.f33554d.invoke();
        if (kVar2 != null) {
            kVar2.o(false);
        }
    }

    public final void b() {
        EventDispatcher eventDispatcher = this.f33556f;
        if (eventDispatcher != null) {
            eventDispatcher.removeListener(this);
        }
    }

    public final void c() {
        EventDispatcher eventDispatcher = this.f33556f;
        if (eventDispatcher != null) {
            eventDispatcher.addListener(this);
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(Event event) {
        View decorView;
        View viewResolveView;
        AbstractC2855l.g(event, "event");
        if (AbstractC2855l.b(event.internal_getEventNameCompat(), ShowEvent.EVENT_NAME)) {
            View rootView = null;
            try {
                UIManager uIManager = this.f33555e;
                viewResolveView = uIManager != null ? uIManager.resolveView(event.getViewTag()) : null;
            } catch (Exception e10) {
                C3429a.f32948a.c(c.f33557a, "Can not resolve view for Modal#" + event.getViewTag(), e10);
            }
            ReactModalHostView reactModalHostView = viewResolveView instanceof ReactModalHostView ? (ReactModalHostView) viewResolveView : null;
            if (reactModalHostView == null) {
                return;
            }
            DialogC1623w dialog = reactModalHostView.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                rootView = decorView.getRootView();
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            if (viewGroup != null) {
                final ReactViewGroup reactViewGroup = new ReactViewGroup(this.f33552b);
                reactViewGroup.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                final k kVar = new k(this.f33551a, viewGroup, this.f33552b, this.f33553c);
                viewGroup.addView(reactViewGroup);
                if (c.f33558b) {
                    k kVar2 = (k) this.f33554d.invoke();
                    if (kVar2 != null) {
                        kVar2.o(true);
                    }
                    AbstractC1658a0.C0(viewGroup, kVar);
                    AbstractC1658a0.w0(reactViewGroup, kVar);
                    kVar.p(Double.valueOf(0.0d), Boolean.FALSE);
                }
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: x6.a
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            b.d(kVar, reactViewGroup, this, dialogInterface);
                        }
                    });
                }
                if (window != null) {
                    window.setSoftInputMode(48);
                }
            }
        }
    }
}
