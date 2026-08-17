package D0;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f743e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f739a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f740b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f741c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f742d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f743e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
