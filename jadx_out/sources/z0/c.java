package Z0;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import j7.AbstractC2800q;
import j7.K;
import j7.T;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f13534a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0137c f13535b = C0137c.f13547d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
    }

    /* JADX INFO: renamed from: Z0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0137c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f13546c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0137c f13547d = new C0137c(T.e(), null, K.i());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f13548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f13549b;

        /* JADX INFO: renamed from: Z0.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public C0137c(Set flags, b bVar, Map allowedViolations) {
            AbstractC2855l.g(flags, "flags");
            AbstractC2855l.g(allowedViolations, "allowedViolations");
            this.f13548a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f13549b = linkedHashMap;
        }

        public final Set a() {
            return this.f13548a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f13549b;
        }
    }

    private c() {
    }

    private final C0137c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                AbstractC2855l.f(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.C0() != null) {
                    C0137c c0137cC0 = parentFragmentManager.C0();
                    AbstractC2855l.d(c0137cC0);
                    return c0137cC0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f13535b;
    }

    private final void c(C0137c c0137c, final m mVar) {
        Fragment fragmentA = mVar.a();
        final String name = fragmentA.getClass().getName();
        c0137c.a().contains(a.PENALTY_LOG);
        c0137c.b();
        if (c0137c.a().contains(a.PENALTY_DEATH)) {
            p(fragmentA, new Runnable() { // from class: Z0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, mVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, m violation) {
        AbstractC2855l.g(violation, "$violation");
        throw violation;
    }

    private final void e(m mVar) {
        if (FragmentManager.J0(3)) {
            mVar.a().getClass();
        }
    }

    public static final void f(Fragment fragment, String previousFragmentId) {
        AbstractC2855l.g(fragment, "fragment");
        AbstractC2855l.g(previousFragmentId, "previousFragmentId");
        Z0.a aVar = new Z0.a(fragment, previousFragmentId);
        c cVar = f13534a;
        cVar.e(aVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.q(c0137cB, fragment.getClass(), aVar.getClass())) {
            cVar.c(c0137cB, aVar);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        AbstractC2855l.g(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f13534a;
        cVar.e(dVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.q(c0137cB, fragment.getClass(), dVar.getClass())) {
            cVar.c(c0137cB, dVar);
        }
    }

    public static final void h(Fragment fragment) {
        AbstractC2855l.g(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f13534a;
        cVar.e(eVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(c0137cB, fragment.getClass(), eVar.getClass())) {
            cVar.c(c0137cB, eVar);
        }
    }

    public static final void i(Fragment fragment) {
        AbstractC2855l.g(fragment, "fragment");
        f fVar = new f(fragment);
        c cVar = f13534a;
        cVar.e(fVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(c0137cB, fragment.getClass(), fVar.getClass())) {
            cVar.c(c0137cB, fVar);
        }
    }

    public static final void j(Fragment fragment) {
        AbstractC2855l.g(fragment, "fragment");
        g gVar = new g(fragment);
        c cVar = f13534a;
        cVar.e(gVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(c0137cB, fragment.getClass(), gVar.getClass())) {
            cVar.c(c0137cB, gVar);
        }
    }

    public static final void k(Fragment fragment) {
        AbstractC2855l.g(fragment, "fragment");
        i iVar = new i(fragment);
        c cVar = f13534a;
        cVar.e(iVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(c0137cB, fragment.getClass(), iVar.getClass())) {
            cVar.c(c0137cB, iVar);
        }
    }

    public static final void l(Fragment violatingFragment, Fragment targetFragment, int i10) {
        AbstractC2855l.g(violatingFragment, "violatingFragment");
        AbstractC2855l.g(targetFragment, "targetFragment");
        j jVar = new j(violatingFragment, targetFragment, i10);
        c cVar = f13534a;
        cVar.e(jVar);
        C0137c c0137cB = cVar.b(violatingFragment);
        if (c0137cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(c0137cB, violatingFragment.getClass(), jVar.getClass())) {
            cVar.c(c0137cB, jVar);
        }
    }

    public static final void m(Fragment fragment, boolean z10) {
        AbstractC2855l.g(fragment, "fragment");
        k kVar = new k(fragment, z10);
        c cVar = f13534a;
        cVar.e(kVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.q(c0137cB, fragment.getClass(), kVar.getClass())) {
            cVar.c(c0137cB, kVar);
        }
    }

    public static final void n(Fragment fragment, ViewGroup container) {
        AbstractC2855l.g(fragment, "fragment");
        AbstractC2855l.g(container, "container");
        n nVar = new n(fragment, container);
        c cVar = f13534a;
        cVar.e(nVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.q(c0137cB, fragment.getClass(), nVar.getClass())) {
            cVar.c(c0137cB, nVar);
        }
    }

    public static final void o(Fragment fragment, Fragment expectedParentFragment, int i10) {
        AbstractC2855l.g(fragment, "fragment");
        AbstractC2855l.g(expectedParentFragment, "expectedParentFragment");
        o oVar = new o(fragment, expectedParentFragment, i10);
        c cVar = f13534a;
        cVar.e(oVar);
        C0137c c0137cB = cVar.b(fragment);
        if (c0137cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.q(c0137cB, fragment.getClass(), oVar.getClass())) {
            cVar.c(c0137cB, oVar);
        }
    }

    private final void p(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerG = fragment.getParentFragmentManager().w0().g();
        AbstractC2855l.f(handlerG, "fragment.parentFragmentManager.host.handler");
        if (AbstractC2855l.b(handlerG.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerG.post(runnable);
        }
    }

    private final boolean q(C0137c c0137c, Class cls, Class cls2) {
        Set set = (Set) c0137c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC2855l.b(cls2.getSuperclass(), m.class) || !AbstractC2800q.X(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
