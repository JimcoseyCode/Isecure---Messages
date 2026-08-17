package B;

import F.AbstractC0504q0;
import F.D1;
import F.k1;
import J.n;
import android.util.Size;
import kotlin.jvm.internal.AbstractC2855l;
import m5.InterfaceFutureC2904a;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f228a = b.f230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f229b = new C0007a();

    /* JADX INFO: renamed from: B.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0007a implements a {
        C0007a() {
        }

        @Override // B.a
        public boolean a(k1 sessionConfig) {
            AbstractC2855l.g(sessionConfig, "sessionConfig");
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f230a = new b();

        /* JADX INFO: renamed from: B.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0008a extends AbstractC0504q0 {
            C0008a(Size size, int i10) {
                super(size, i10);
            }

            @Override // F.AbstractC0504q0
            protected InterfaceFutureC2904a o() {
                InterfaceFutureC2904a interfaceFutureC2904aP = n.p(null);
                AbstractC2855l.f(interfaceFutureC2904aP, "immediateFuture(...)");
                return interfaceFutureC2904aP;
            }
        }

        private b() {
        }

        public final k1.b a(D1 d12, Size resolution, C3563H dynamicRange) {
            AbstractC2855l.g(d12, "<this>");
            AbstractC2855l.g(resolution, "resolution");
            AbstractC2855l.g(dynamicRange, "dynamicRange");
            C0008a c0008a = new C0008a(resolution, d12.r());
            Class clsJ = c.f233i.b(d12).j();
            if (clsJ != null) {
                c0008a.p(clsJ);
            }
            k1.b bVarM = k1.b.r(d12, resolution).m(c0008a, dynamicRange);
            AbstractC2855l.f(bVarM, "addSurface(...)");
            return bVarM;
        }
    }

    static k1.b b(D1 d12, Size size, C3563H c3563h) {
        return f228a.a(d12, size, c3563h);
    }

    boolean a(k1 k1Var);
}
