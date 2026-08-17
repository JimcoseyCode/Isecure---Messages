package y5;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class i implements v5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33980a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33981b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v5.c f33982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f33983d;

    i(f fVar) {
        this.f33983d = fVar;
    }

    private void a() {
        if (this.f33980a) {
            throw new v5.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f33980a = true;
    }

    void b(v5.c cVar, boolean z10) {
        this.f33980a = false;
        this.f33982c = cVar;
        this.f33981b = z10;
    }

    @Override // v5.g
    public v5.g d(String str) throws IOException {
        a();
        this.f33983d.g(this.f33982c, str, this.f33981b);
        return this;
    }

    @Override // v5.g
    public v5.g e(boolean z10) {
        a();
        this.f33983d.l(this.f33982c, z10, this.f33981b);
        return this;
    }
}
