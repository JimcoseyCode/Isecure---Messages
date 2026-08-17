package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import r4.AbstractC3267h;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f21396h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f21397i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f21398j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21399k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f21400l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static m f21405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static n f21406r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21407a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f21401m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f21402n = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f21403o = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f21390b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21391c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21392d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f21393e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f21394f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f21395g = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f21404p = new j();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends Exception {
        /* synthetic */ a(String str, C4.f fVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, C4.f fVar) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static class C0223b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21408a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21409b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f21410c = 0;
        }

        C0223b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC3268i.k(context);
        this.f21407a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC3267h.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e10) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage()));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    public static DynamiteModule d(Context context, b bVar, String str) throws Throwable {
        long j10;
        DynamiteModule dynamiteModuleG;
        Boolean bool;
        B4.a aVarB;
        DynamiteModule dynamiteModule;
        n nVar;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f21401m;
        k kVar = (k) threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal threadLocal2 = f21402n;
        Long l10 = (Long) threadLocal2.get();
        long jLongValue = l10.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0223b c0223bA = bVar.a(context, str, f21403o);
            int i10 = c0223bA.f21408a;
            int i11 = c0223bA.f21410c;
            if (i11 != 0) {
                if (i11 == -1) {
                    if (c0223bA.f21408a != 0) {
                        i11 = -1;
                    }
                }
                j10 = 0;
                if (i11 == 1) {
                    try {
                        if (c0223bA.f21409b != 0) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (jLongValue == j10) {
                            f21402n.remove();
                        } else {
                            f21402n.set(l10);
                        }
                        Cursor cursor = kVar2.f21411a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f21401m.set(kVar);
                        throw th;
                    }
                }
                if (i11 == -1) {
                    dynamiteModuleG = g(applicationContext, str);
                } else {
                    if (i11 != 1) {
                        throw new a("VersionPolicy returned invalid code:" + i11, null);
                    }
                    try {
                        int i12 = c0223bA.f21409b;
                        try {
                            synchronized (DynamiteModule.class) {
                                if (!j(context)) {
                                    throw new a("Remote loading disabled", null);
                                }
                                bool = f21396h;
                            }
                            if (bool == null) {
                                throw new a("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                synchronized (DynamiteModule.class) {
                                    nVar = f21406r;
                                }
                                if (nVar == null) {
                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                }
                                k kVar3 = (k) threadLocal.get();
                                if (kVar3 == null || kVar3.f21411a == null) {
                                    throw new a("No result cursor", null);
                                }
                                Context applicationContext2 = context.getApplicationContext();
                                Cursor cursor2 = kVar3.f21411a;
                                B4.b.x(null);
                                synchronized (DynamiteModule.class) {
                                    z10 = f21399k >= 2;
                                }
                                Context context2 = (Context) B4.b.f(z10 ? nVar.x(B4.b.x(applicationContext2), str, i12, B4.b.x(cursor2)) : nVar.f(B4.b.x(applicationContext2), str, i12, B4.b.x(cursor2)));
                                if (context2 == null) {
                                    throw new a("Failed to get module context", null);
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                m mVarK = k(context);
                                if (mVarK == null) {
                                    throw new a("Failed to create IDynamiteLoader.", null);
                                }
                                int iF = mVarK.f();
                                if (iF >= 3) {
                                    k kVar4 = (k) threadLocal.get();
                                    if (kVar4 == null) {
                                        throw new a("No cached result cursor holder", null);
                                    }
                                    aVarB = mVarK.A(B4.b.x(context), str, i12, B4.b.x(kVar4.f21411a));
                                } else {
                                    aVarB = iF == 2 ? mVarK.B(B4.b.x(context), str, i12) : mVarK.z(B4.b.x(context), str, i12);
                                }
                                Object objF = B4.b.f(aVarB);
                                if (objF == null) {
                                    throw new a("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objF);
                            }
                            dynamiteModuleG = dynamiteModule;
                        } catch (RemoteException e10) {
                            throw new a("Failed to load remote module.", e10, null);
                        } catch (a e11) {
                            throw e11;
                        } catch (Throwable th2) {
                            y4.e.a(context, th2);
                            throw new a("Failed to load remote module.", th2, null);
                        }
                    } catch (a e12) {
                        e12.getMessage();
                        int i13 = c0223bA.f21408a;
                        if (i13 == 0 || bVar.a(context, str, new l(i13, 0)).f21410c != -1) {
                            throw new a("Remote load failed. No local fallback found.", e12, null);
                        }
                        dynamiteModuleG = g(applicationContext, str);
                    }
                }
                if (jLongValue == 0) {
                    f21402n.remove();
                } else {
                    f21402n.set(l10);
                }
                Cursor cursor3 = kVar2.f21411a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f21401m.set(kVar);
                return dynamiteModuleG;
            }
            throw new a("No acceptable module " + str + " found. Local version is " + c0223bA.f21408a + " and remote version is " + c0223bA.f21409b + ".", null);
        } catch (Throwable th3) {
            th = th3;
            j10 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:139:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b A[Catch: all -> 0x00d5, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:139:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[Catch: all -> 0x00d5, SYNTHETIC, TRY_LEAVE, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:139:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #11 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:140:0x0026, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f21396h;
                int iY = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        e10.toString();
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                h(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!j(context)) {
                                return 0;
                            }
                            if (!f21398j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (bool2.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iF = f(context, str, z10, true);
                                        String str2 = f21397i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderA = C4.d.a();
                                            if (classLoaderA == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    C4.b.a();
                                                    String str3 = f21397i;
                                                    AbstractC3268i.k(str3);
                                                    classLoaderA = C4.a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f21397i;
                                                    AbstractC3268i.k(str4);
                                                    classLoaderA = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            h(classLoaderA);
                                            declaredField.set(null, classLoaderA);
                                            f21396h = bool2;
                                            return iF;
                                        }
                                        return iF;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        }
                        f21396h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z10, false);
                    } catch (a e11) {
                        e11.getMessage();
                        return 0;
                    }
                }
                m mVarK = k(context);
                if (mVarK != null) {
                    try {
                        int iF2 = mVarK.f();
                        if (iF2 >= 3) {
                            k kVar = (k) f21401m.get();
                            if (kVar == null || (cursor = kVar.f21411a) == null) {
                                Cursor cursor2 = (Cursor) B4.b.f(mVarK.C(B4.b.x(context), str, z10, ((Long) f21402n.get()).longValue()));
                                if (cursor2 != null) {
                                    try {
                                        if (cursor2.moveToFirst()) {
                                            int i10 = cursor2.getInt(0);
                                            if (i10 > 0) {
                                                cursor = i(cursor2) ? null : cursor2;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                iY = i10;
                                            }
                                        } else if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    } catch (RemoteException e12) {
                                        remoteException = e12;
                                        cursor = cursor2;
                                        try {
                                            remoteException.getMessage();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursor != null) {
                                                throw th;
                                            }
                                            cursor.close();
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                        }
                                    }
                                } else if (cursor2 != null) {
                                }
                            } else {
                                iY = cursor.getInt(0);
                            }
                        } else {
                            iY = iF2 == 2 ? mVarK.y(B4.b.x(context), str, z10) : mVarK.x(B4.b.x(context), str, z10);
                        }
                    } catch (RemoteException e13) {
                        remoteException = e13;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return iY;
            }
        } catch (Throwable th5) {
            y4.e.a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int f(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th;
        Exception exc;
        ?? r12 = 0;
        ?? r13 = 0;
        ?? r14 = 0;
        ?? r15 = 0;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f21402n.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f21397i = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f21399k = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z12 = false;
                                            }
                                            f21398j = z12;
                                            z13 = z12;
                                        }
                                    } finally {
                                    }
                                }
                                if (i(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new a("forcing fallback to container DynamiteLoader impl", r14 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i10;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (exc instanceof a) {
                            throw exc;
                        }
                        throw new a("V2 version check failed: " + exc.getMessage(), exc, r13 == true ? 1 : 0);
                    }
                }
                throw new a("Failed to connect to dynamite module ContentResolver.", r15 == true ? 1 : 0);
            } catch (Throwable th2) {
                th = th2;
                r12 = context;
                if (r12 != 0) {
                    throw th;
                }
                r12.close();
                throw th;
            }
        } catch (Exception e11) {
            exc = e11;
        } catch (Throwable th3) {
            th = th3;
            if (r12 != 0) {
            }
        }
    }

    private static DynamiteModule g(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void h(ClassLoader classLoader) throws a {
        n nVar;
        C4.f fVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
            }
            f21406r = nVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (InstantiationException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        }
    }

    private static boolean i(Cursor cursor) {
        k kVar = (k) f21401m.get();
        if (kVar == null || kVar.f21411a != null) {
            return false;
        }
        kVar.f21411a = cursor;
        return true;
    }

    private static boolean j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f21400l)) {
            return true;
        }
        boolean z10 = false;
        if (f21400l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (com.google.android.gms.common.b.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f21400l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f21398j = true;
            }
        }
        return z10;
    }

    private static m k(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f21405q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f21405q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                e10.getMessage();
            }
            return null;
        }
    }

    public IBinder c(String str) throws a {
        try {
            return (IBinder) this.f21407a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
