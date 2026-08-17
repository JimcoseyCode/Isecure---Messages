package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.g;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import com.facebook.hermes.intl.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static c f14128g = new c(new d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14129h = -100;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static D0.h f14130i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static D0.h f14131j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Boolean f14132k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f14133l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final m0.b f14134m = new m0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f14135n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f14136o = new Object();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c implements Executor {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f14137g = new Object();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Queue f14138h = new ArrayDeque();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Executor f14139i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Runnable f14140j;

        c(Executor executor) {
            this.f14139i = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        protected void b() {
            synchronized (this.f14137g) {
                try {
                    Runnable runnable = (Runnable) this.f14138h.poll();
                    this.f14140j = runnable;
                    if (runnable != null) {
                        this.f14139i.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f14137g) {
                try {
                    this.f14138h.add(new Runnable() { // from class: androidx.appcompat.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.c.a(this.f14141g, runnable);
                        }
                    });
                    if (this.f14140j == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    g() {
    }

    static void G(g gVar) {
        synchronized (f14135n) {
            H(gVar);
        }
    }

    private static void H(g gVar) {
        synchronized (f14135n) {
            try {
                Iterator it = f14134m.iterator();
                while (it.hasNext()) {
                    g gVar2 = (g) ((WeakReference) it.next()).get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void M(int i10) {
        if ((i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) && f14129h != i10) {
            f14129h = i10;
            g();
        }
    }

    static void S(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().e()) {
                    String strB = androidx.core.app.f.b(context);
                    Object systemService = context.getSystemService(Constants.LOCALE);
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void T(final Context context) {
        if (x(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f14133l) {
                    return;
                }
                f14128g.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.c(context);
                    }
                });
                return;
            }
            synchronized (f14136o) {
                try {
                    D0.h hVar = f14130i;
                    if (hVar == null) {
                        if (f14131j == null) {
                            f14131j = D0.h.b(androidx.core.app.f.b(context));
                        }
                        if (f14131j.e()) {
                        } else {
                            f14130i = f14131j;
                        }
                    } else if (!hVar.equals(f14131j)) {
                        D0.h hVar2 = f14130i;
                        f14131j = hVar2;
                        androidx.core.app.f.a(context, hVar2.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        S(context);
        f14133l = true;
    }

    static void d(g gVar) {
        synchronized (f14135n) {
            H(gVar);
            f14134m.add(new WeakReference(gVar));
        }
    }

    private static void g() {
        synchronized (f14135n) {
            try {
                Iterator it = f14134m.iterator();
                while (it.hasNext()) {
                    g gVar = (g) ((WeakReference) it.next()).get();
                    if (gVar != null) {
                        gVar.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g j(Activity activity, e eVar) {
        return new AppCompatDelegateImpl(activity, eVar);
    }

    public static g k(Dialog dialog, e eVar) {
        return new AppCompatDelegateImpl(dialog, eVar);
    }

    public static D0.h m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objR = r();
            if (objR != null) {
                return D0.h.h(b.a(objR));
            }
        } else {
            D0.h hVar = f14130i;
            if (hVar != null) {
                return hVar;
            }
        }
        return D0.h.d();
    }

    public static int o() {
        return f14129h;
    }

    static Object r() {
        Context contextN;
        Iterator it = f14134m.iterator();
        while (it.hasNext()) {
            g gVar = (g) ((WeakReference) it.next()).get();
            if (gVar != null && (contextN = gVar.n()) != null) {
                return contextN.getSystemService(Constants.LOCALE);
            }
        }
        return null;
    }

    static D0.h t() {
        return f14130i;
    }

    static boolean x(Context context) {
        if (f14132k == null) {
            try {
                Bundle bundle = t.a(context).metaData;
                if (bundle != null) {
                    f14132k = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f14132k = Boolean.FALSE;
            }
        }
        return f14132k.booleanValue();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i10);

    public abstract void J(int i10);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void O(Toolbar toolbar);

    public abstract void P(int i10);

    public abstract void Q(CharSequence charSequence);

    public abstract androidx.appcompat.view.b R(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i10);

    public abstract Context n();

    public abstract androidx.appcompat.app.b p();

    public abstract int q();

    public abstract MenuInflater s();

    public abstract AbstractC1627a u();

    public abstract void v();

    public abstract void w();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);

    public void N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void h(Context context) {
    }
}
