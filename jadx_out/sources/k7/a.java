package K7;

import L7.AbstractC1294t;
import L7.E;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.h0;
import O7.O;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s8.AbstractC3340e;
import v8.AbstractC3437f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractC3437f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0065a f7106e = new C0065a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k8.f f7107f;

    /* JADX INFO: renamed from: K7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0065a {
        public /* synthetic */ C0065a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k8.f a() {
            return a.f7107f;
        }

        private C0065a() {
        }
    }

    static {
        k8.f fVarQ = k8.f.q("clone");
        AbstractC2855l.f(fVarQ, "identifier(...)");
        f7107f = fVarQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(B8.n storageManager, InterfaceC1280e containingClass) {
        super(storageManager, containingClass);
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(containingClass, "containingClass");
    }

    @Override // v8.AbstractC3437f
    protected List j() {
        O oI1 = O.i1(m(), M7.h.f7570a.b(), f7107f, InterfaceC1277b.a.DECLARATION, h0.f7335a);
        oI1.O0(null, m().G0(), AbstractC2800q.j(), AbstractC2800q.j(), AbstractC2800q.j(), AbstractC3340e.m(m()).i(), E.f7285j, AbstractC1294t.f7345c);
        return AbstractC2800q.e(oI1);
    }
}
