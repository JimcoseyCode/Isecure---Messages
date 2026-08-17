package I4;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class T0 implements v5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4593a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4594b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v5.c f4595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P0 f4596d;

    T0(P0 p02) {
        this.f4596d = p02;
    }

    private final void b() {
        if (this.f4593a) {
            throw new v5.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f4593a = true;
    }

    final void a(v5.c cVar, boolean z10) {
        this.f4593a = false;
        this.f4595c = cVar;
        this.f4594b = z10;
    }

    @Override // v5.g
    public final v5.g d(String str) throws IOException {
        b();
        this.f4596d.f(this.f4595c, str, this.f4594b);
        return this;
    }

    @Override // v5.g
    public final v5.g e(boolean z10) throws IOException {
        b();
        this.f4596d.g(this.f4595c, z10 ? 1 : 0, this.f4594b);
        return this;
    }
}
