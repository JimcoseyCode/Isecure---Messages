package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import y3.AbstractC3612a;
import y3.C3614c;
import z3.AbstractC3674b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class SoLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static x f20660b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20671m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f20661c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Context f20662d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile E[] f20663e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f20664f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static A3.i f20665g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f20666h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f20667i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f20668j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f20669k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f20670l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20672n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static l f20673o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f20659a = true;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th);
        }
    }

    private static int A() {
        ReentrantReadWriteLock reentrantReadWriteLock = f20661c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i10 = f20671m;
            int i11 = (i10 & 2) != 0 ? 1 : 0;
            if ((i10 & 256) != 0) {
                i11 |= 4;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                i11 |= 8;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i11;
        } catch (Throwable th) {
            f20661c.writeLock().unlock();
            throw th;
        }
    }

    private static int B(int i10) {
        return (i10 & 2048) != 0 ? 1 : 0;
    }

    private static A3.h C(String str, UnsatisfiedLinkError unsatisfiedLinkError, A3.h hVar) {
        p.g("SoLoader", "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = f20661c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (hVar == null) {
                try {
                    hVar = j();
                    if (hVar == null) {
                        p.g("SoLoader", "No recovery strategy");
                        throw unsatisfiedLinkError;
                    }
                } catch (v e10) {
                    p.c("SoLoader", "Base APK not found during recovery", e10);
                    throw e10;
                } catch (Exception e11) {
                    p.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e11);
                    throw unsatisfiedLinkError;
                }
            }
            if (D(unsatisfiedLinkError, hVar)) {
                f20664f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return hVar;
            }
            reentrantReadWriteLock.writeLock().unlock();
            p.g("SoLoader", "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th) {
            f20661c.writeLock().unlock();
            throw th;
        }
    }

    private static boolean D(UnsatisfiedLinkError unsatisfiedLinkError, A3.h hVar) {
        AbstractC3674b.h(hVar);
        try {
            boolean zA = hVar.a(unsatisfiedLinkError, f20663e);
            AbstractC3674b.g(null);
            return zA;
        } finally {
        }
    }

    private static void a(ArrayList arrayList, int i10) {
        C2090a c2090a = new C2090a(f20662d, i10);
        p.a("SoLoader", "Adding application source: " + c2090a.toString());
        arrayList.add(0, c2090a);
    }

    private static void b(Context context, ArrayList arrayList, boolean z10) {
        if ((f20671m & 8) != 0) {
            return;
        }
        arrayList.add(0, new C2092c(context, "lib-main", !z10));
    }

    private static void c(Context context, ArrayList arrayList) {
        C2093d c2093d = new C2093d(context);
        p.a("SoLoader", "validating/adding directApk source: " + c2093d.toString());
        if (c2093d.o()) {
            arrayList.add(0, c2093d);
        }
    }

    private static void d(ArrayList arrayList) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals(PointerEventHelper.POINTER_TYPE_UNKNOWN)) {
            str = str2 + ":" + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            p.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new C2095f(new File(str3), 2));
        }
    }

    private static void e(Context context, ArrayList arrayList) {
        F f10 = new F();
        p.a("SoLoader", "adding systemLoadWrapper source: " + f10);
        arrayList.add(0, f10);
    }

    private static void f() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        ReentrantReadWriteLock reentrantReadWriteLock = f20661c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f20663e == null) {
                p.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z10 = true;
            } else {
                z10 = false;
            }
            if (f20659a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (E e10 : f20663e) {
                            if (x(e10, str, i10, threadPolicy)) {
                                if (z10) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw B.b(str, f20662d, f20663e);
                    } catch (IOException e11) {
                        C c10 = new C(str, e11.toString());
                        c10.initCause(e11);
                        throw c10;
                    }
                } finally {
                }
            } finally {
                if (f20659a) {
                    if (str2 != null) {
                        Api18TraceUtils.b();
                    }
                    Api18TraceUtils.b();
                }
                if (z10) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    private static int h(Context context) {
        int i10 = f20672n;
        if (i10 != 0) {
            return i10;
        }
        if (context == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.flags;
        int i12 = (i11 & 1) != 0 ? (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 3 : 2 : 1;
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i12);
        return i12;
    }

    private static int i() {
        int i10 = f20672n;
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i10) throws IOException {
        k(context, i10, null);
    }

    private static synchronized A3.h j() {
        A3.i iVar;
        iVar = f20665g;
        return iVar == null ? null : iVar.get();
    }

    public static void k(Context context, int i10, x xVar) {
        if (r()) {
            p.g("SoLoader", "SoLoader already initialized");
            return;
        }
        p.g("SoLoader", "Initializing SoLoader: " + i10);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zO = o(context);
            f20670l = zO;
            if (zO) {
                int iH = h(context);
                f20672n = iH;
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0 && SysUtil.l(context, iH)) {
                    i10 |= 8;
                }
                p(context, xVar, i10);
                q(context, i10);
                p.f("SoLoader", "Init SoLoader delegate");
                AbstractC3612a.b(new u());
            } else {
                n();
                p.f("SoLoader", "Init System Loader delegate");
                AbstractC3612a.b(new C3614c());
            }
            p.g("SoLoader", "SoLoader initialized: " + i10);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static void l(Context context, l lVar) throws IOException {
        synchronized (SoLoader.class) {
            f20673o = lVar;
        }
        init(context, 0);
    }

    public static void m(Context context, boolean z10) {
        try {
            k(context, z10 ? 1 : 0, null);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void n() {
        if (f20663e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f20661c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f20663e == null) {
                f20663e = new E[0];
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f20661c.writeLock().unlock();
            throw th;
        }
    }

    private static boolean o(Context context) {
        String packageName;
        if (f20673o != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
        } catch (Exception e10) {
            e = e10;
            packageName = null;
        }
        try {
            bundle = context.getPackageManager().getApplicationInfo(packageName, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
        } catch (Exception e11) {
            e = e11;
            p.h("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    private static synchronized void p(Context context, x xVar, int i10) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    p.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                f20662d = context;
                f20665g = new A3.f(context, B(i10));
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null || f20660b == null) {
            if (xVar != null) {
                f20660b = xVar;
            } else {
                f20660b = new o(new y());
            }
        }
    }

    private static void q(Context context, int i10) {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f20663e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f20661c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f20663e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f20671m = i10;
                ArrayList arrayList = new ArrayList();
                boolean z10 = true;
                boolean z11 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
                boolean z12 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
                if (z11) {
                    e(context, arrayList);
                } else if (z12) {
                    d(arrayList);
                    arrayList.add(0, new C2094e(Constants.SENSITIVITY_BASE));
                } else {
                    d(arrayList);
                    if (context != null) {
                        if ((i10 & 1) != 0) {
                            a(arrayList, i());
                            p.a("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new k(context, "lib-main"));
                        } else {
                            if (SysUtil.l(context, f20672n)) {
                                c(context, arrayList);
                            }
                            a(arrayList, i());
                            if ((i10 & 4096) == 0) {
                                z10 = false;
                            }
                            b(context, arrayList, z10);
                        }
                    }
                }
                E[] eArr = (E[]) arrayList.toArray(new E[arrayList.size()]);
                int iA = A();
                int length = eArr.length;
                while (true) {
                    int i11 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    p.d("SoLoader", "Preparing SO source: " + eArr[i11]);
                    boolean z13 = f20659a;
                    if (z13) {
                        Api18TraceUtils.a("SoLoader", "_", eArr[i11].getClass().getSimpleName());
                    }
                    eArr[i11].e(iA);
                    if (z13) {
                        Api18TraceUtils.b();
                    }
                    length = i11;
                }
                f20663e = eArr;
                f20664f.getAndIncrement();
                p.d("SoLoader", "init finish: " + f20663e.length + " SO sources prepared");
                writeLock = f20661c.writeLock();
            }
            writeLock.unlock();
        } catch (Throwable th) {
            f20661c.writeLock().unlock();
            throw th;
        }
    }

    public static boolean r() {
        if (f20663e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f20661c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z10 = f20663e != null;
            reentrantReadWriteLock.readLock().unlock();
            return z10;
        } catch (Throwable th) {
            f20661c.readLock().unlock();
            throw th;
        }
    }

    static void s(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        AbstractC3674b.d(str, i10);
        try {
            AbstractC3674b.c(null, w(str, null, null, i10 | 1, threadPolicy));
        } finally {
        }
    }

    public static boolean t(String str) {
        return f20670l ? u(str, 0) : AbstractC3612a.d(str);
    }

    public static boolean u(String str, int i10) {
        Boolean boolZ = z(str);
        if (boolZ != null) {
            return boolZ.booleanValue();
        }
        if (!f20670l) {
            return AbstractC3612a.d(str);
        }
        if (f20672n != 2) {
        }
        return y(str, i10);
    }

    private static boolean v(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        A3.h hVarC = null;
        while (true) {
            try {
                return w(str, str2, str3, i10, threadPolicy);
            } catch (UnsatisfiedLinkError e10) {
                hVarC = C(str, e10, hVarC);
            }
        }
    }

    private static boolean w(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && f20668j.contains(str2)) {
            return false;
        }
        Set set = f20666h;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                if (!set.contains(str)) {
                    z10 = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z10 = true;
                }
                Map map = f20667i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj3 = new Object();
                    map.put(str, obj3);
                    obj = obj3;
                }
                Map map2 = f20669k;
                if (map2.containsKey(str2)) {
                    obj2 = map2.get(str2);
                } else {
                    Object obj4 = new Object();
                    map2.put(str2, obj4);
                    obj2 = obj4;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f20661c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z10) {
                            if (set.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z10 = true;
                            }
                            if (!z10) {
                                try {
                                    p.a("SoLoader", "About to load: " + str);
                                    g(str, str2, i10, threadPolicy);
                                    p.a("SoLoader", "Loaded: " + str);
                                    set.add(str);
                                } catch (UnsatisfiedLinkError e10) {
                                    String message = e10.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e10;
                                    }
                                    throw new a(e10, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                        synchronized (obj2) {
                            if ((i10 & 16) == 0 && str3 != null) {
                                try {
                                    if (TextUtils.isEmpty(str2) || !f20668j.contains(str2)) {
                                        boolean z11 = f20659a;
                                        if (z11 && f20673o == null) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            p.a("SoLoader", "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                            l lVar = f20673o;
                                            if (lVar != null) {
                                                lVar.invokeJniOnload(str2);
                                            } else {
                                                r.a(str2);
                                            }
                                            f20668j.add(str2);
                                            if (z11 && f20673o == null) {
                                                Api18TraceUtils.b();
                                            }
                                        } catch (UnsatisfiedLinkError e11) {
                                            throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (f20659a && f20673o == null) {
                                        Api18TraceUtils.b();
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z10;
                    }
                } catch (Throwable th2) {
                    f20661c.readLock().unlock();
                    throw th2;
                }
            } finally {
            }
        }
    }

    private static boolean x(E e10, String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        AbstractC3674b.l(e10);
        try {
            boolean z10 = e10.d(str, i10, threadPolicy) != 0;
            AbstractC3674b.k(null);
            return z10;
        } finally {
        }
    }

    private static boolean y(String str, int i10) {
        l lVar = f20673o;
        String strMapLibName = lVar != null ? lVar.mapLibName(str) : r.b(str);
        String str2 = strMapLibName != null ? strMapLibName : str;
        AbstractC3674b.f(str, strMapLibName, i10);
        try {
            boolean zV = v(System.mapLibraryName(str2), str, strMapLibName, i10, null);
            AbstractC3674b.e(null, zV);
            return zV;
        } finally {
        }
    }

    private static Boolean z(String str) {
        Boolean boolValueOf;
        if (f20663e != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f20661c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f20663e == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean zContains = f20666h.contains(str);
                            boolean z10 = !zContains;
                            if (!zContains) {
                                System.loadLibrary(str);
                            }
                            boolValueOf = Boolean.valueOf(z10);
                        } finally {
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                f();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th) {
            f20661c.readLock().unlock();
            throw th;
        }
    }
}
