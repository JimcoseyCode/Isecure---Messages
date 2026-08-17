package p9;

import P8.q;
import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import e9.z;
import j7.K;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f30683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f30684c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArraySet f30682a = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = z.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        AbstractC2855l.f(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = m9.e.class.getName();
        AbstractC2855l.f(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = i9.e.class.getName();
        AbstractC2855l.f(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f30683b = K.t(linkedHashMap);
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f30682a.add(logger)) {
            AbstractC2855l.f(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f30685a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f30683b.get(str);
        return str2 != null ? str2 : q.h1(str, 23);
    }

    public final void a(String loggerName, int i10, String message, Throwable th) {
        int iMin;
        AbstractC2855l.g(loggerName, "loggerName");
        AbstractC2855l.g(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th != null) {
                message = message + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iC0 = q.c0(str, '\n', i11, false, 4, null);
                if (iC0 == -1) {
                    iC0 = length;
                }
                while (true) {
                    iMin = Math.min(iC0, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iC0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f30683b.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
