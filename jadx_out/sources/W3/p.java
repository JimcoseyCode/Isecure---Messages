package W3;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class p implements U3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f12105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f12106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f12107c;

    p(Set set, o oVar, s sVar) {
        this.f12105a = set;
        this.f12106b = oVar;
        this.f12107c = sVar;
    }

    @Override // U3.i
    public U3.h a(String str, Class cls, U3.c cVar, U3.g gVar) {
        if (this.f12105a.contains(cVar)) {
            return new r(this.f12106b, str, cVar, gVar, this.f12107c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f12105a));
    }
}
