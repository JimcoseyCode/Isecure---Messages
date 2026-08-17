package com.google.firebase.messaging;

import B5.a;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1379m;
import P4.InterfaceC1374h;
import P4.InterfaceC1377k;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.X;
import com.google.firebase.messaging.c0;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n5.AbstractC2967b;
import n5.C2970e;
import o5.InterfaceC3013a;
import r4.AbstractC3268i;
import z4.ThreadFactoryC3675a;
import z5.AbstractC3676a;
import z5.InterfaceC3677b;
import z5.InterfaceC3679d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static c0 f24122m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static ScheduledExecutorService f24124o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2970e f24125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f24127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X f24128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f24129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f24130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f24131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC1378l f24132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final L f24133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f24135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f24121l = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static C5.b f24123n = new C5.b() { // from class: com.google.firebase.messaging.u
        @Override // C5.b
        public final Object get() {
            return FirebaseMessaging.e();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3679d f24136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC3677b f24138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f24139d;

        a(InterfaceC3679d interfaceC3679d) {
            this.f24136a = interfaceC3679d;
        }

        public static /* synthetic */ void a(a aVar, AbstractC3676a abstractC3676a) {
            if (aVar.c()) {
                FirebaseMessaging.this.F();
            }
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextJ = FirebaseMessaging.this.f24125a.j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextJ.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f24137b) {
                    return;
                }
                Boolean boolD = d();
                this.f24139d = boolD;
                if (boolD == null) {
                    InterfaceC3677b interfaceC3677b = new InterfaceC3677b() { // from class: com.google.firebase.messaging.D
                        @Override // z5.InterfaceC3677b
                        public final void a(AbstractC3676a abstractC3676a) {
                            FirebaseMessaging.a.a(this.f24118a, abstractC3676a);
                        }
                    };
                    this.f24138c = interfaceC3677b;
                    this.f24136a.a(AbstractC2967b.class, interfaceC3677b);
                }
                this.f24137b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f24139d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f24125a.s();
        }
    }

    FirebaseMessaging(C2970e c2970e, B5.a aVar, C5.b bVar, C5.b bVar2, D5.e eVar, C5.b bVar3, InterfaceC3679d interfaceC3679d) {
        this(c2970e, aVar, bVar, bVar2, eVar, bVar3, interfaceC3679d, new L(c2970e.j()));
    }

    private boolean D() {
        S.c(this.f24126b);
        if (!S.d(this.f24126b)) {
            return false;
        }
        if (this.f24125a.i(InterfaceC3013a.class) != null) {
            return true;
        }
        return K.a() && f24123n != null;
    }

    private synchronized void E() {
        if (!this.f24134j) {
            H(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        if (I(v())) {
            E();
        }
    }

    public static /* synthetic */ AbstractC1378l a(FirebaseMessaging firebaseMessaging, String str, c0.a aVar, String str2) {
        s(firebaseMessaging.f24126b).g(firebaseMessaging.t(), str, str2, firebaseMessaging.f24133i.a());
        if (aVar == null || !str2.equals(aVar.f24235a)) {
            firebaseMessaging.z(str2);
        }
        return AbstractC1381o.f(str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.A()) {
            firebaseMessaging.F();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, C1379m c1379m) {
        firebaseMessaging.getClass();
        try {
            c1379m.c(firebaseMessaging.n());
        } catch (Exception e10) {
            c1379m.b(e10);
        }
    }

    public static /* synthetic */ U3.i e() {
        return null;
    }

    public static /* synthetic */ void g(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            K.y(cloudMessage.e());
            firebaseMessaging.x();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C2970e c2970e) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c2970e.i(FirebaseMessaging.class);
        AbstractC3268i.l(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ void i(FirebaseMessaging firebaseMessaging, h0 h0Var) {
        if (firebaseMessaging.A()) {
            h0Var.p();
        }
    }

    public static /* synthetic */ void k(FirebaseMessaging firebaseMessaging, C1379m c1379m) {
        firebaseMessaging.getClass();
        try {
            AbstractC1381o.a(firebaseMessaging.f24127c.c());
            s(firebaseMessaging.f24126b).d(firebaseMessaging.t(), L.c(firebaseMessaging.f24125a));
            c1379m.c(null);
        } catch (Exception e10) {
            c1379m.b(e10);
        }
    }

    public static synchronized FirebaseMessaging r() {
        return getInstance(C2970e.k());
    }

    private static synchronized c0 s(Context context) {
        try {
            if (f24122m == null) {
                f24122m = new c0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f24122m;
    }

    private String t() {
        return "[DEFAULT]".equals(this.f24125a.l()) ? PointerEventHelper.POINTER_TYPE_UNKNOWN : this.f24125a.n();
    }

    public static U3.i w() {
        return (U3.i) f24123n.get();
    }

    private void x() {
        this.f24127c.f().h(this.f24130f, new InterfaceC1374h() { // from class: com.google.firebase.messaging.C
            @Override // P4.InterfaceC1374h
            public final void onSuccess(Object obj) {
                FirebaseMessaging.g(this.f24117a, (CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        S.c(this.f24126b);
        U.f(this.f24126b, this.f24127c, D());
        if (D()) {
            x();
        }
    }

    private void z(String str) {
        if ("[DEFAULT]".equals(this.f24125a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                this.f24125a.l();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2246n(this.f24126b).g(intent);
        }
    }

    public boolean A() {
        return this.f24129e.c();
    }

    boolean B() {
        return this.f24133i.g();
    }

    synchronized void C(boolean z10) {
        this.f24134j = z10;
    }

    public AbstractC1378l G(final String str) {
        return this.f24132h.q(new InterfaceC1377k() { // from class: com.google.firebase.messaging.r
            @Override // P4.InterfaceC1377k
            public final AbstractC1378l a(Object obj) {
                return ((h0) obj).q(str);
            }
        });
    }

    synchronized void H(long j10) {
        p(new d0(this, Math.min(Math.max(30L, 2 * j10), f24121l)), j10);
        this.f24134j = true;
    }

    boolean I(c0.a aVar) {
        return aVar == null || aVar.b(this.f24133i.a());
    }

    public AbstractC1378l J(final String str) {
        return this.f24132h.q(new InterfaceC1377k() { // from class: com.google.firebase.messaging.w
            @Override // P4.InterfaceC1377k
            public final AbstractC1378l a(Object obj) {
                return ((h0) obj).t(str);
            }
        });
    }

    String n() throws IOException {
        final c0.a aVarV = v();
        if (!I(aVarV)) {
            return aVarV.f24235a;
        }
        final String strC = L.c(this.f24125a);
        try {
            return (String) AbstractC1381o.a(this.f24128d.b(strC, new X.a() { // from class: com.google.firebase.messaging.s
                @Override // com.google.firebase.messaging.X.a
                public final AbstractC1378l start() {
                    FirebaseMessaging firebaseMessaging = this.f24319a;
                    return firebaseMessaging.f24127c.g().r(firebaseMessaging.f24131g, new InterfaceC1377k() { // from class: com.google.firebase.messaging.t
                        @Override // P4.InterfaceC1377k
                        public final AbstractC1378l a(Object obj) {
                            return FirebaseMessaging.a(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public AbstractC1378l o() {
        if (v() == null) {
            return AbstractC1381o.f(null);
        }
        final C1379m c1379m = new C1379m();
        AbstractC2247o.e().execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.k(this.f24328g, c1379m);
            }
        });
        return c1379m.a();
    }

    void p(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f24124o == null) {
                    f24124o = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3675a("TAG"));
                }
                f24124o.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Context q() {
        return this.f24126b;
    }

    public AbstractC1378l u() {
        final C1379m c1379m = new C1379m();
        this.f24130f.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f24325g, c1379m);
            }
        });
        return c1379m.a();
    }

    c0.a v() {
        return s(this.f24126b).e(t(), L.c(this.f24125a));
    }

    FirebaseMessaging(C2970e c2970e, B5.a aVar, C5.b bVar, C5.b bVar2, D5.e eVar, C5.b bVar3, InterfaceC3679d interfaceC3679d, L l10) {
        this(c2970e, aVar, bVar3, interfaceC3679d, l10, new G(c2970e, l10, bVar, bVar2, eVar), AbstractC2247o.f(), AbstractC2247o.c(), AbstractC2247o.b());
    }

    FirebaseMessaging(C2970e c2970e, B5.a aVar, C5.b bVar, InterfaceC3679d interfaceC3679d, L l10, G g10, Executor executor, Executor executor2, Executor executor3) {
        this.f24134j = false;
        f24123n = bVar;
        this.f24125a = c2970e;
        this.f24129e = new a(interfaceC3679d);
        Context contextJ = c2970e.j();
        this.f24126b = contextJ;
        C2249q c2249q = new C2249q();
        this.f24135k = c2249q;
        this.f24133i = l10;
        this.f24127c = g10;
        this.f24128d = new X(executor);
        this.f24130f = executor2;
        this.f24131g = executor3;
        Context contextJ2 = c2970e.j();
        if (contextJ2 instanceof Application) {
            ((Application) contextJ2).registerActivityLifecycleCallbacks(c2249q);
        } else {
            Objects.toString(contextJ2);
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0017a() { // from class: com.google.firebase.messaging.y
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.z
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(this.f24331g);
            }
        });
        AbstractC1378l abstractC1378lF = h0.f(this, l10, g10, contextJ, AbstractC2247o.g());
        this.f24132h = abstractC1378lF;
        abstractC1378lF.h(executor2, new InterfaceC1374h() { // from class: com.google.firebase.messaging.A
            @Override // P4.InterfaceC1374h
            public final void onSuccess(Object obj) {
                FirebaseMessaging.i(this.f24115a, (h0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f24116g.y();
            }
        });
    }
}
