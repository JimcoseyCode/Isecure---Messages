package G4;

import java.io.IOException;

/* JADX INFO: renamed from: G4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0685o implements v5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3281a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3282b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v5.c f3283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0653k f3284d;

    C0685o(C0653k c0653k) {
        this.f3284d = c0653k;
    }

    private final void b() {
        if (this.f3281a) {
            throw new v5.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3281a = true;
    }

    final void a(v5.c cVar, boolean z10) {
        this.f3281a = false;
        this.f3283c = cVar;
        this.f3282b = z10;
    }

    @Override // v5.g
    public final v5.g d(String str) throws IOException {
        b();
        this.f3284d.f(this.f3283c, str, this.f3282b);
        return this;
    }

    @Override // v5.g
    public final v5.g e(boolean z10) throws IOException {
        b();
        this.f3284d.g(this.f3283c, z10 ? 1 : 0, this.f3282b);
        return this;
    }
}
