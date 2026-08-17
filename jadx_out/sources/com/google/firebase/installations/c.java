package com.google.firebase.installations;

import F5.d;
import F5.f;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1379m;
import android.text.TextUtils;
import com.google.firebase.installations.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import n5.C2970e;
import q5.w;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class c implements D5.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f24086m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f24087n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2970e f24088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F5.c f24089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E5.c f24090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f24091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f24092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D5.g f24093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f24094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f24095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f24096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f24097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f24098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f24099l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f24100a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f24100a.getAndIncrement())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f24102b;

        static {
            int[] iArr = new int[f.b.values().length];
            f24102b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24102b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24102b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f24101a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24101a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final C2970e c2970e, C5.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c2970e, new F5.c(c2970e.j(), bVar), new E5.c(c2970e), i.c(), new w(new C5.b() { // from class: D5.a
            @Override // C5.b
            public final Object get() {
                return com.google.firebase.installations.c.e(c2970e);
            }
        }), new D5.g());
    }

    private synchronized void A(E5.d dVar, E5.d dVar2) {
        if (this.f24098k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f24098k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    public static /* synthetic */ E5.b e(C2970e c2970e) {
        return new E5.b(c2970e);
    }

    private AbstractC1378l f() {
        C1379m c1379m = new C1379m();
        h(new e(this.f24091d, c1379m));
        return c1379m.a();
    }

    private AbstractC1378l g() {
        C1379m c1379m = new C1379m();
        h(new f(c1379m));
        return c1379m.a();
    }

    private void h(h hVar) {
        synchronized (this.f24094g) {
            this.f24099l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        E5.d dVarW;
        E5.d dVarQ = q();
        try {
            if (dVarQ.i() || dVarQ.l()) {
                dVarW = w(dVarQ);
            } else {
                if (!z10 && !this.f24091d.f(dVarQ)) {
                    return;
                }
                dVarW = k(dVarQ);
            }
            t(dVarW);
            A(dVarQ, dVarW);
            if (dVarW.k()) {
                z(dVarW.d());
            }
            if (dVarW.i()) {
                x(new d(d.a.BAD_CONFIG));
            } else if (dVarW.j()) {
                x(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                y(dVarW);
            }
        } catch (d e10) {
            x(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final boolean z10) {
        E5.d dVarR = r();
        if (z10) {
            dVarR = dVarR.p();
        }
        y(dVarR);
        this.f24096i.execute(new Runnable() { // from class: D5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f799g.i(z10);
            }
        });
    }

    private E5.d k(E5.d dVar) throws d {
        F5.f fVarE = this.f24089b.e(l(), dVar.d(), s(), dVar.f());
        int i10 = b.f24102b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f24091d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        z(null);
        return dVar.r();
    }

    private synchronized String n() {
        return this.f24097j;
    }

    private E5.b o() {
        return (E5.b) this.f24092e.get();
    }

    public static c p(C2970e c2970e) {
        AbstractC3268i.b(c2970e != null, "Null is not a valid value of FirebaseApp.");
        return (c) c2970e.i(D5.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private E5.d q() {
        E5.d dVarD;
        synchronized (f24086m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f24088a.j(), "generatefid.lock");
                try {
                    dVarD = this.f24090c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    private E5.d r() {
        E5.d dVarD;
        synchronized (f24086m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f24088a.j(), "generatefid.lock");
                try {
                    dVarD = this.f24090c.d();
                    if (dVarD.j()) {
                        dVarD = this.f24090c.b(dVarD.t(v(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    private void t(E5.d dVar) {
        synchronized (f24086m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f24088a.j(), "generatefid.lock");
                try {
                    this.f24090c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void u() {
        AbstractC3268i.f(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3268i.f(s(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3268i.f(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3268i.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3268i.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String v(E5.d dVar) {
        if ((!this.f24088a.l().equals("CHIME_ANDROID_SDK") && !this.f24088a.t()) || !dVar.m()) {
            return this.f24093f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f24093f.a() : strF;
    }

    private E5.d w(E5.d dVar) throws d {
        F5.d dVarD = this.f24089b.d(l(), dVar.d(), s(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f24101a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f24091d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void x(Exception exc) {
        synchronized (this.f24094g) {
            try {
                Iterator it = this.f24099l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void y(E5.d dVar) {
        synchronized (this.f24094g) {
            try {
                Iterator it = this.f24099l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void z(String str) {
        this.f24097j = str;
    }

    @Override // D5.e
    public AbstractC1378l a(final boolean z10) {
        u();
        AbstractC1378l abstractC1378lF = f();
        this.f24095h.execute(new Runnable() { // from class: D5.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f797g.j(z10);
            }
        });
        return abstractC1378lF;
    }

    @Override // D5.e
    public AbstractC1378l getId() {
        u();
        String strN = n();
        if (strN != null) {
            return AbstractC1381o.f(strN);
        }
        AbstractC1378l abstractC1378lG = g();
        this.f24095h.execute(new Runnable() { // from class: D5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f796g.j(false);
            }
        });
        return abstractC1378lG;
    }

    String l() {
        return this.f24088a.m().b();
    }

    String m() {
        return this.f24088a.m().c();
    }

    String s() {
        return this.f24088a.m().e();
    }

    c(ExecutorService executorService, Executor executor, C2970e c2970e, F5.c cVar, E5.c cVar2, i iVar, w wVar, D5.g gVar) {
        this.f24094g = new Object();
        this.f24098k = new HashSet();
        this.f24099l = new ArrayList();
        this.f24088a = c2970e;
        this.f24089b = cVar;
        this.f24090c = cVar2;
        this.f24091d = iVar;
        this.f24092e = wVar;
        this.f24093f = gVar;
        this.f24095h = executorService;
        this.f24096i = executor;
    }
}
