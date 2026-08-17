package G4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: G4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0677n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f3004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f3005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.d f3006c;

    C0677n(Map map, Map map2, v5.d dVar) {
        this.f3004a = map;
        this.f3005b = map2;
        this.f3006c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C0653k(byteArrayOutputStream, this.f3004a, this.f3005b, this.f3006c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
