package V8;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object f11844g;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f11844g = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
