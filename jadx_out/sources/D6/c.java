package D6;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import i7.AbstractC2746i;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends JSPointerDispatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f803b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f804a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup) {
        super(viewGroup);
        AbstractC2855l.g(viewGroup, "viewGroup");
        this.f804a = AbstractC2746i.b(new InterfaceC3487a() { // from class: D6.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return c.d();
            }
        });
    }

    private final Method b() {
        return (Method) this.f804a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method d() {
        try {
            try {
                return JSPointerDispatcher.class.getMethod("handleMotionEvent", MotionEvent.class, EventDispatcher.class, Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (NoSuchMethodException unused2) {
            return JSPointerDispatcher.class.getMethod("handleMotionEvent", MotionEvent.class, EventDispatcher.class);
        }
    }

    public final void c(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z10) {
        Method methodB = b();
        if (methodB != null) {
            if (D6.a.a(methodB) == 3) {
                methodB.invoke(this, motionEvent, eventDispatcher, Boolean.valueOf(z10));
            } else {
                methodB.invoke(this, motionEvent, eventDispatcher);
            }
        }
    }
}
