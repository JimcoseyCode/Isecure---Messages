package i7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC2855l;
import q7.AbstractC3129b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: i7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2739b {
    public static void a(Throwable th, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        AbstractC2855l.g(th, "<this>");
        AbstractC2855l.g(exception, "exception");
        if (th != exception) {
            AbstractC3129b.f30867a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        AbstractC2855l.g(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }
}
