package p9;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f30685a = new f();

    private f() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        AbstractC2855l.g(record, "record");
        e eVar = e.f30684c;
        String loggerName = record.getLoggerName();
        AbstractC2855l.f(loggerName, "record.loggerName");
        int iB = g.b(record);
        String message = record.getMessage();
        AbstractC2855l.f(message, "record.message");
        eVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
