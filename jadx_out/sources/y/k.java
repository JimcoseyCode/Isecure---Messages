package Y;

import J.n;
import Y.k;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;
import y.C3598s;
import y.InterfaceC3584i;
import y.K0;
import y.r;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12592b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f12593c = new k(new g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f12594a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k d(Void r02) {
            return k.f12593c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k e(Function1 function1, Object obj) {
            return (k) function1.invoke(obj);
        }

        public final InterfaceFutureC2904a c(Context context) {
            AbstractC2855l.g(context, "context");
            H0.g.g(context);
            InterfaceFutureC2904a interfaceFutureC2904aE = k.f12593c.e(context);
            final Function1 function1 = new Function1() { // from class: Y.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k.a.d((Void) obj);
                }
            };
            InterfaceFutureC2904a interfaceFutureC2904aX = n.x(interfaceFutureC2904aE, new InterfaceC2955a() { // from class: Y.j
                @Override // n.InterfaceC2955a
                public final Object apply(Object obj) {
                    return k.a.e(function1, obj);
                }
            }, I.c.b());
            AbstractC2855l.f(interfaceFutureC2904aX, "transform(...)");
            return interfaceFutureC2904aX;
        }

        private a() {
        }
    }

    private k(g gVar) {
        this.f12594a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceFutureC2904a e(Context context) {
        return this.f12594a.v(context, null);
    }

    @Override // y.r
    public int a() {
        return this.f12594a.a();
    }

    public final InterfaceC3584i d(androidx.lifecycle.r lifecycleOwner, C3598s cameraSelector, K0 useCaseGroup) {
        AbstractC2855l.g(lifecycleOwner, "lifecycleOwner");
        AbstractC2855l.g(cameraSelector, "cameraSelector");
        AbstractC2855l.g(useCaseGroup, "useCaseGroup");
        return this.f12594a.n(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    public final void f() {
        this.f12594a.E();
    }
}
