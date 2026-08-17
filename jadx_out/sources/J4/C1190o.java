package J4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: J4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1190o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.d f6210c;

    C1190o(Map map, Map map2, v5.d dVar) {
        this.f6208a = map;
        this.f6209b = map2;
        this.f6210c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C1169l(byteArrayOutputStream, this.f6208a, this.f6209b, this.f6210c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
