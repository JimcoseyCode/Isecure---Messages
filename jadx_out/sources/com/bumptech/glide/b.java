package com.bumptech.glide;

import J1.o;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.module.AppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x1.C3527k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile b f19035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static volatile boolean f19036r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3527k f19037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y1.d f19038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z1.h f19039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f19040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final y1.b f19041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o f19042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final J1.c f19043m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f19045o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f19044n = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f19046p = f.NORMAL;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        M1.f build();
    }

    b(Context context, C3527k c3527k, z1.h hVar, y1.d dVar, y1.b bVar, o oVar, J1.c cVar, int i10, a aVar, Map map, List list, List list2, AppGlideModule appGlideModule, e eVar) {
        this.f19037g = c3527k;
        this.f19038h = dVar;
        this.f19041k = bVar;
        this.f19039i = hVar;
        this.f19042l = oVar;
        this.f19043m = cVar;
        this.f19045o = aVar;
        this.f19040j = new d(context, bVar, i.d(this, list2, appGlideModule), new N1.b(), aVar, map, list, c3527k, eVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f19036r) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f19036r = true;
        try {
            n(context, generatedAppGlideModule);
        } finally {
            f19036r = false;
        }
    }

    public static b d(Context context) {
        if (f19035q == null) {
            GeneratedAppGlideModule generatedAppGlideModuleE = e(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f19035q == null) {
                        a(context, generatedAppGlideModuleE);
                    }
                } finally {
                }
            }
        }
        return f19035q;
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e10) {
            r(e10);
            return null;
        } catch (InstantiationException e11) {
            r(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            r(e12);
            return null;
        } catch (InvocationTargetException e13) {
            r(e13);
            return null;
        }
    }

    private static o m(Context context) {
        Q1.k.f(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    private static void n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new c(), generatedAppGlideModule);
    }

    private static void o(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            listB = new K1.c(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set setA = generatedAppGlideModule.a();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                K1.a aVar = (K1.a) it.next();
                if (setA.contains(aVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        aVar.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                ((K1.a) it2.next()).getClass().toString();
            }
        }
        cVar.c(generatedAppGlideModule != null ? generatedAppGlideModule.b() : null);
        Iterator it3 = listB.iterator();
        while (it3.hasNext()) {
            ((K1.a) it3.next()).a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, cVar);
        }
        b bVarA = cVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(bVarA);
        f19035q = bVarA;
    }

    private static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k u(Activity activity) {
        return v(activity.getApplicationContext());
    }

    public static k v(Context context) {
        return m(context).d(context);
    }

    public void b() {
        Q1.l.a();
        this.f19037g.e();
    }

    public void c() {
        Q1.l.b();
        this.f19039i.b();
        this.f19038h.b();
        this.f19041k.b();
    }

    public y1.b f() {
        return this.f19041k;
    }

    public y1.d g() {
        return this.f19038h;
    }

    J1.c h() {
        return this.f19043m;
    }

    public Context i() {
        return this.f19040j.getBaseContext();
    }

    d j() {
        return this.f19040j;
    }

    public h k() {
        return this.f19040j.h();
    }

    public o l() {
        return this.f19042l;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        s(i10);
    }

    void p(k kVar) {
        synchronized (this.f19044n) {
            try {
                if (this.f19044n.contains(kVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f19044n.add(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q(N1.d dVar) {
        synchronized (this.f19044n) {
            try {
                Iterator it = this.f19044n.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).q(dVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i10) {
        Q1.l.b();
        synchronized (this.f19044n) {
            try {
                Iterator it = this.f19044n.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f19039i.a(i10);
        this.f19038h.a(i10);
        this.f19041k.a(i10);
    }

    void t(k kVar) {
        synchronized (this.f19044n) {
            try {
                if (!this.f19044n.contains(kVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f19044n.remove(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
