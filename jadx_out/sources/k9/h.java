package k9;

import e9.E;
import e9.x;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f29350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f29351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t9.j f29352i;

    public h(String str, long j10, t9.j source) {
        AbstractC2855l.g(source, "source");
        this.f29350g = str;
        this.f29351h = j10;
        this.f29352i = source;
    }

    @Override // e9.E
    public long contentLength() {
        return this.f29351h;
    }

    @Override // e9.E
    public x contentType() {
        String str = this.f29350g;
        if (str != null) {
            return x.f26347g.c(str);
        }
        return null;
    }

    @Override // e9.E
    public t9.j source() {
        return this.f29352i;
    }
}
