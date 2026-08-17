package z1;

import java.io.File;
import z1.InterfaceC3666a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements InterfaceC3666a.InterfaceC0379a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f34190b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f34189a = j10;
        this.f34190b = aVar;
    }

    @Override // z1.InterfaceC3666a.InterfaceC0379a
    public InterfaceC3666a build() {
        File fileA = this.f34190b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f34189a);
        }
        return null;
    }
}
