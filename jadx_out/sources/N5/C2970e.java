package n5;

import D0.m;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2097a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m0.C2892a;
import q5.C3119c;
import q5.n;
import q5.w;
import r4.AbstractC3267h;
import r4.AbstractC3268i;
import z5.InterfaceC3678c;

/* JADX INFO: renamed from: n5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2970e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f30034k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map f30035l = new C2892a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2976k f30038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f30039d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f30042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C5.b f30043h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f30040e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f30041f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f30044i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f30045j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: n5.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: renamed from: n5.e$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements ComponentCallbacks2C2097a.InterfaceC0221a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference f30046a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (y4.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f30046a.get() == null) {
                    b bVar = new b();
                    if (androidx.camera.view.i.a(f30046a, null, bVar)) {
                        ComponentCallbacks2C2097a.c(application);
                        ComponentCallbacks2C2097a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2097a.InterfaceC0221a
        public void a(boolean z10) {
            synchronized (C2970e.f30034k) {
                try {
                    for (C2970e c2970e : new ArrayList(C2970e.f30035l.values())) {
                        if (c2970e.f30040e.get()) {
                            c2970e.v(z10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n5.e$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference f30047b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f30048a;

        public c(Context context) {
            this.f30048a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f30047b.get() == null) {
                c cVar = new c(context);
                if (androidx.camera.view.i.a(f30047b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f30048a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C2970e.f30034k) {
                try {
                    Iterator it = C2970e.f30035l.values().iterator();
                    while (it.hasNext()) {
                        ((C2970e) it.next()).o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected C2970e(final Context context, String str, C2976k c2976k) {
        this.f30036a = (Context) AbstractC3268i.k(context);
        this.f30037b = AbstractC3268i.e(str);
        this.f30038c = (C2976k) AbstractC3268i.k(c2976k);
        AbstractC2977l abstractC2977lB = FirebaseInitProvider.b();
        L5.c.b("Firebase");
        L5.c.b("ComponentDiscovery");
        List listB = q5.f.c(context, ComponentDiscoveryService.class).b();
        L5.c.a();
        L5.c.b("Runtime");
        n.b bVarF = n.k(r5.l.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C3119c.q(context, Context.class, new Class[0])).b(C3119c.q(this, C2970e.class, new Class[0])).b(C3119c.q(c2976k, C2976k.class, new Class[0])).f(new L5.b());
        if (m.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C3119c.q(abstractC2977lB, AbstractC2977l.class, new Class[0]));
        }
        n nVarE = bVarF.e();
        this.f30039d = nVarE;
        L5.c.a();
        this.f30042g = new w(new C5.b() { // from class: n5.c
            @Override // C5.b
            public final Object get() {
                return C2970e.b(this.f30031a, context);
            }
        });
        this.f30043h = nVarE.c(A5.f.class);
        g(new a() { // from class: n5.d
            @Override // n5.C2970e.a
            public final void a(boolean z10) {
                C2970e.a(this.f30033a, z10);
            }
        });
        L5.c.a();
    }

    public static /* synthetic */ void a(C2970e c2970e, boolean z10) {
        if (z10) {
            c2970e.getClass();
        } else {
            ((A5.f) c2970e.f30043h.get()).h();
        }
    }

    public static /* synthetic */ H5.a b(C2970e c2970e, Context context) {
        return new H5.a(context, c2970e.n(), (InterfaceC3678c) c2970e.f30039d.a(InterfaceC3678c.class));
    }

    private void h() {
        AbstractC3268i.o(!this.f30041f.get(), "FirebaseApp was deleted");
    }

    public static C2970e k() {
        C2970e c2970e;
        synchronized (f30034k) {
            try {
                c2970e = (C2970e) f30035l.get("[DEFAULT]");
                if (c2970e == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + y4.n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((A5.f) c2970e.f30043h.get()).h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2970e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!m.a(this.f30036a)) {
            l();
            c.b(this.f30036a);
        } else {
            l();
            this.f30039d.n(t());
            ((A5.f) this.f30043h.get()).h();
        }
    }

    public static C2970e p(Context context) {
        synchronized (f30034k) {
            try {
                if (f30035l.containsKey("[DEFAULT]")) {
                    return k();
                }
                C2976k c2976kA = C2976k.a(context);
                if (c2976kA == null) {
                    return null;
                }
                return q(context, c2976kA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C2970e q(Context context, C2976k c2976k) {
        return r(context, c2976k, "[DEFAULT]");
    }

    public static C2970e r(Context context, C2976k c2976k, String str) {
        C2970e c2970e;
        b.c(context);
        String strU = u(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f30034k) {
            Map map = f30035l;
            AbstractC3268i.o(!map.containsKey(strU), "FirebaseApp name " + strU + " already exists!");
            AbstractC3268i.l(context, "Application context cannot be null.");
            c2970e = new C2970e(context, strU, c2976k);
            map.put(strU, c2970e);
        }
        c2970e.o();
        return c2970e;
    }

    private static String u(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z10) {
        Iterator it = this.f30044i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2970e) {
            return this.f30037b.equals(((C2970e) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f30040e.get() && ComponentCallbacks2C2097a.b().d()) {
            aVar.a(true);
        }
        this.f30044i.add(aVar);
    }

    public int hashCode() {
        return this.f30037b.hashCode();
    }

    public Object i(Class cls) {
        h();
        return this.f30039d.a(cls);
    }

    public Context j() {
        h();
        return this.f30036a;
    }

    public String l() {
        h();
        return this.f30037b;
    }

    public C2976k m() {
        h();
        return this.f30038c;
    }

    public String n() {
        return y4.c.c(l().getBytes(Charset.defaultCharset())) + "+" + y4.c.c(m().c().getBytes(Charset.defaultCharset()));
    }

    public boolean s() {
        h();
        return ((H5.a) this.f30042g.get()).b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return AbstractC3267h.c(this).a("name", this.f30037b).a("options", this.f30038c).toString();
    }
}
