package h1;

import android.os.Bundle;
import h1.C2699h;
import i1.C2722b;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: h1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2699h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28264c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2722b f28265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2697f f28266b;

    /* JADX INFO: renamed from: h1.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2735B c(InterfaceC2700i interfaceC2700i) {
            interfaceC2700i.getLifecycle().a(new C2693b(interfaceC2700i));
            return C2735B.f28704a;
        }

        public final C2699h b(final InterfaceC2700i owner) {
            AbstractC2855l.g(owner, "owner");
            return new C2699h(new C2722b(owner, new InterfaceC3487a() { // from class: h1.g
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return C2699h.a.c(owner);
                }
            }), null);
        }

        private a() {
        }
    }

    public /* synthetic */ C2699h(C2722b c2722b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2722b);
    }

    public static final C2699h a(InterfaceC2700i interfaceC2700i) {
        return f28264c.b(interfaceC2700i);
    }

    public final C2697f b() {
        return this.f28266b;
    }

    public final void c() {
        this.f28265a.f();
    }

    public final void d(Bundle bundle) {
        this.f28265a.h(bundle);
    }

    public final void e(Bundle outBundle) {
        AbstractC2855l.g(outBundle, "outBundle");
        this.f28265a.i(outBundle);
    }

    private C2699h(C2722b c2722b) {
        this.f28265a = c2722b;
        this.f28266b = new C2697f(c2722b);
    }
}
