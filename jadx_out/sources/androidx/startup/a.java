package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import j1.AbstractC2761b;
import j1.C2762c;
import j1.InterfaceC2760a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.AbstractC2861a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f18207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f18208e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f18211c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f18210b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f18209a = new HashMap();

    a(Context context) {
        this.f18211c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objB;
        if (AbstractC2861a.h()) {
            try {
                AbstractC2861a.c(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC2861a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f18209a.containsKey(cls)) {
            objB = this.f18209a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC2760a interfaceC2760a = (InterfaceC2760a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = interfaceC2760a.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f18209a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = interfaceC2760a.b(this.f18211c);
                set.remove(cls);
                this.f18209a.put(cls, objB);
            } catch (Throwable th2) {
                throw new C2762c(th2);
            }
        }
        AbstractC2861a.f();
        return objB;
    }

    public static a e(Context context) {
        if (f18207d == null) {
            synchronized (f18208e) {
                try {
                    if (f18207d == null) {
                        f18207d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f18207d;
    }

    void a() {
        try {
            try {
                AbstractC2861a.c("Startup");
                b(this.f18211c.getPackageManager().getProviderInfo(new ComponentName(this.f18211c.getPackageName(), InitializationProvider.class.getName()), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new C2762c(e10);
            }
        } finally {
            AbstractC2861a.f();
        }
    }

    void b(Bundle bundle) {
        String string = this.f18211c.getString(AbstractC2761b.f28873a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC2760a.class.isAssignableFrom(cls)) {
                            this.f18210b.add(cls);
                        }
                    }
                }
                Iterator it = this.f18210b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new C2762c(e10);
            }
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f18208e) {
            try {
                objD = this.f18209a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f18210b.contains(cls);
    }
}
