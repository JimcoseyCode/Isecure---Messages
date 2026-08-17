package y4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f33944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f33945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f33946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f33947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f33948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f33949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f33950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Method f33951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Method f33952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Boolean f33953j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f33944a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f33945b = method;
        if (l.c()) {
            try {
                method2 = WorkSource.class.getMethod("add", cls, String.class);
            } catch (Exception unused2) {
                method2 = null;
            }
        } else {
            method2 = null;
        }
        f33946c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f33947d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f33948e = method4;
        if (l.c()) {
            try {
                method5 = WorkSource.class.getMethod("getName", cls);
            } catch (Exception unused5) {
                method5 = null;
            }
        } else {
            method5 = null;
        }
        f33949f = method5;
        if (l.h()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception unused6) {
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f33950g = method6;
        if (l.h()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception unused7) {
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f33951h = method7;
        if (l.h()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused8) {
                }
            } catch (Exception unused9) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f33952i = method8;
        f33953j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f33946c;
        if (method != null) {
            if (str == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        Method method2 = f33945b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoB = A4.d.a(context).b(str, 0);
                if (applicationInfoB == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i10 = applicationInfoB.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        Boolean bool = f33953j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z10 = androidx.core.content.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f33953j = Boolean.valueOf(z10);
        return z10;
    }
}
