package P;

import P.C1364t;
import androidx.concurrent.futures.c;

/* JADX INFO: renamed from: P.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1346a extends C1364t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f8700c;

    C1346a(int i10, int i11, c.a aVar) {
        this.f8698a = i10;
        this.f8699b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f8700c = aVar;
    }

    @Override // P.C1364t.b
    c.a a() {
        return this.f8700c;
    }

    @Override // P.C1364t.b
    int b() {
        return this.f8698a;
    }

    @Override // P.C1364t.b
    int c() {
        return this.f8699b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1364t.b) {
            C1364t.b bVar = (C1364t.b) obj;
            if (this.f8698a == bVar.b() && this.f8699b == bVar.c() && this.f8700c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f8698a ^ 1000003) * 1000003) ^ this.f8699b) * 1000003) ^ this.f8700c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f8698a + ", rotationDegrees=" + this.f8699b + ", completer=" + this.f8700c + "}";
    }
}
