package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e0 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f16825g;

    public e0(J j10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f16825g = null;
    }

    public C1728v a() {
        return new C1728v(getMessage());
    }
}
