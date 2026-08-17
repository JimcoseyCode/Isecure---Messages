package t9;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class E extends C3389f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f32565o;

    public E(Socket socket) {
        AbstractC2855l.g(socket, "socket");
        this.f32565o = socket;
    }

    @Override // t9.C3389f
    protected void B() {
        try {
            this.f32565o.close();
        } catch (AssertionError e10) {
            if (!s.e(e10)) {
                throw e10;
            }
            t.f32623a.log(Level.WARNING, "Failed to close timed out socket " + this.f32565o, (Throwable) e10);
        } catch (Exception e11) {
            t.f32623a.log(Level.WARNING, "Failed to close timed out socket " + this.f32565o, (Throwable) e11);
        }
    }

    @Override // t9.C3389f
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
