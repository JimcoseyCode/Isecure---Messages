package J4;

import java.io.IOException;

/* JADX INFO: renamed from: J4.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1197p implements v5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6227a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6228b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v5.c f6229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1169l f6230d;

    C1197p(C1169l c1169l) {
        this.f6230d = c1169l;
    }

    private final void b() {
        if (this.f6227a) {
            throw new v5.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6227a = true;
    }

    final void a(v5.c cVar, boolean z10) {
        this.f6227a = false;
        this.f6229c = cVar;
        this.f6228b = z10;
    }

    @Override // v5.g
    public final v5.g d(String str) throws IOException {
        b();
        this.f6230d.f(this.f6229c, str, this.f6228b);
        return this;
    }

    @Override // v5.g
    public final v5.g e(boolean z10) throws IOException {
        b();
        this.f6230d.g(this.f6229c, z10 ? 1 : 0, this.f6228b);
        return this;
    }
}
