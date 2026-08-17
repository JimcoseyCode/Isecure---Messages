package F;

import F.InterfaceC0515w0;
import java.util.List;

/* JADX INFO: renamed from: F.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0491k extends InterfaceC0515w0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f1508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f1509d;

    C0491k(int i10, int i11, List list, List list2) {
        this.f1506a = i10;
        this.f1507b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f1508c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f1509d = list2;
    }

    @Override // F.InterfaceC0515w0
    public int a() {
        return this.f1506a;
    }

    @Override // F.InterfaceC0515w0
    public int b() {
        return this.f1507b;
    }

    @Override // F.InterfaceC0515w0
    public List c() {
        return this.f1508c;
    }

    @Override // F.InterfaceC0515w0
    public List d() {
        return this.f1509d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0515w0.b) {
            InterfaceC0515w0.b bVar = (InterfaceC0515w0.b) obj;
            if (this.f1506a == bVar.a() && this.f1507b == bVar.b() && this.f1508c.equals(bVar.c()) && this.f1509d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f1506a ^ 1000003) * 1000003) ^ this.f1507b) * 1000003) ^ this.f1508c.hashCode()) * 1000003) ^ this.f1509d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f1506a + ", recommendedFileFormat=" + this.f1507b + ", audioProfiles=" + this.f1508c + ", videoProfiles=" + this.f1509d + "}";
    }
}
