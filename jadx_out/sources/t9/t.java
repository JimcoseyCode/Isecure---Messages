package t9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f32623a = Logger.getLogger("okio.Okio");

    public static final D b(File file) {
        AbstractC2855l.g(file, "<this>");
        return s.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        AbstractC2855l.g(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? P8.q.Q(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final D d(File file, boolean z10) {
        AbstractC2855l.g(file, "<this>");
        return s.g(new FileOutputStream(file, z10));
    }

    public static final D e(OutputStream outputStream) {
        AbstractC2855l.g(outputStream, "<this>");
        return new w(outputStream, new G());
    }

    public static final D f(Socket socket) throws IOException {
        AbstractC2855l.g(socket, "<this>");
        E e10 = new E(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC2855l.f(outputStream, "getOutputStream()");
        return e10.z(new w(outputStream, e10));
    }

    public static /* synthetic */ D g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return s.f(file, z10);
    }

    public static final F h(File file) {
        AbstractC2855l.g(file, "<this>");
        return new r(new FileInputStream(file), G.f32567e);
    }

    public static final F i(InputStream inputStream) {
        AbstractC2855l.g(inputStream, "<this>");
        return new r(inputStream, new G());
    }

    public static final F j(Socket socket) throws IOException {
        AbstractC2855l.g(socket, "<this>");
        E e10 = new E(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC2855l.f(inputStream, "getInputStream()");
        return e10.A(new r(inputStream, e10));
    }
}
