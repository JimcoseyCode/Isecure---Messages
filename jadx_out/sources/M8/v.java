package m8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class v extends RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f29734g;

    public v(p pVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f29734g = null;
    }

    public C2952k a() {
        return new C2952k(getMessage());
    }
}
