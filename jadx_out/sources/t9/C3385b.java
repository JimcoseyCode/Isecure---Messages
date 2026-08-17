package t9;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: t9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3385b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3385b f32573a = new C3385b();

    private C3385b() {
    }

    public final InterfaceC3392i a(D sink) {
        AbstractC2855l.g(sink, "sink");
        return s.c(sink);
    }

    public final j b(F source) {
        AbstractC2855l.g(source, "source");
        return s.d(source);
    }

    public final D c(File file) {
        AbstractC2855l.g(file, "file");
        return t.g(file, false, 1, null);
    }

    public final D d(OutputStream outputStream) {
        AbstractC2855l.g(outputStream, "outputStream");
        return s.g(outputStream);
    }

    public final F e(InputStream inputStream) {
        AbstractC2855l.g(inputStream, "inputStream");
        return s.k(inputStream);
    }
}
