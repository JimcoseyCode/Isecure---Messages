package I4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.d f4584c;

    S0(Map map, Map map2, v5.d dVar) {
        this.f4582a = map;
        this.f4583b = map2;
        this.f4584c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new P0(byteArrayOutputStream, this.f4582a, this.f4583b, this.f4584c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
