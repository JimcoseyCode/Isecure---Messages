package R8;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends CancellationException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient A0 f10116g;

    public B0(String str, Throwable th, A0 a02) {
        super(str);
        this.f10116g = a02;
        if (th != null) {
            initCause(th);
        }
    }

    public final A0 a() {
        A0 a02 = this.f10116g;
        return a02 == null ? M0.f10146h : a02;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return AbstractC2855l.b(b02.getMessage(), getMessage()) && AbstractC2855l.b(b02.a(), a()) && AbstractC2855l.b(b02.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        AbstractC2855l.d(message);
        int iHashCode = message.hashCode() * 31;
        A0 a0A = a();
        int iHashCode2 = (iHashCode + (a0A != null ? a0A.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + a();
    }
}
