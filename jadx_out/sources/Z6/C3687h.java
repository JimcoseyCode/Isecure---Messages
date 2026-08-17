package z6;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.I;
import v6.C3429a;

/* JADX INFO: renamed from: z6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3687h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f34281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Method f34282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Method f34283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Method f34284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f34285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Method f34286f;

    public C3687h(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        try {
            StatusBarModule.Companion companion = StatusBarModule.INSTANCE;
            this.f34281a = StatusBarModule.class.getConstructor(ReactApplicationContext.class).newInstance(reactContext);
            Class cls = Boolean.TYPE;
            this.f34282b = StatusBarModule.class.getMethod("setHidden", cls);
            this.f34283c = StatusBarModule.class.getMethod("setColor", Double.TYPE, cls);
            this.f34284d = StatusBarModule.class.getMethod("setTranslucent", cls);
            this.f34285e = StatusBarModule.class.getMethod("setStyle", String.class);
            this.f34286f = StatusBarModule.class.getMethod("getConstants", null);
        } catch (Exception e10) {
            C3429a.f32948a.c(AbstractC3688i.f34287a, "Failed to initialize StatusBarModule via reflection", e10);
        }
    }

    public final Map a() {
        try {
            Method method = this.f34286f;
            Object objInvoke = method != null ? method.invoke(this.f34281a, null) : null;
            if (I.l(objInvoke)) {
                return (Map) objInvoke;
            }
            return null;
        } catch (Exception e10) {
            C3429a.f32948a.c(AbstractC3688i.f34287a, "Error invoking StatusBarModule.getConstants method", e10);
            return null;
        }
    }

    public final void b(double d10, boolean z10) {
        try {
            Method method = this.f34283c;
            if (method != null) {
                method.invoke(this.f34281a, Double.valueOf(d10), Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            C3429a.f32948a.c(AbstractC3688i.f34287a, "Error invoking StatusBarModule.setColor method", e10);
        }
    }

    public final void c(String style) {
        AbstractC2855l.g(style, "style");
        try {
            Method method = this.f34285e;
            if (method != null) {
                method.invoke(this.f34281a, style);
            }
        } catch (Exception e10) {
            C3429a.f32948a.c(AbstractC3688i.f34287a, "Error invoking StatusBarModule.setStyle method", e10);
        }
    }

    public final void d(boolean z10) {
        try {
            Method method = this.f34284d;
            if (method != null) {
                method.invoke(this.f34281a, Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            C3429a.f32948a.c(AbstractC3688i.f34287a, "Error invoking StatusBarModule.setTranslucent method", e10);
        }
    }
}
