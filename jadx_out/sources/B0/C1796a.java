package b0;

import F.InterfaceC0515w0;
import java.util.List;

/* JADX INFO: renamed from: b0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1796a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f18612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f18613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0515w0.a f18614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0515w0.c f18615f;

    C1796a(int i10, int i11, List list, List list2, InterfaceC0515w0.a aVar, InterfaceC0515w0.c cVar) {
        this.f18610a = i10;
        this.f18611b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f18612c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f18613d = list2;
        this.f18614e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f18615f = cVar;
    }

    @Override // F.InterfaceC0515w0
    public int a() {
        return this.f18610a;
    }

    @Override // F.InterfaceC0515w0
    public int b() {
        return this.f18611b;
    }

    @Override // F.InterfaceC0515w0
    public List c() {
        return this.f18612c;
    }

    @Override // F.InterfaceC0515w0
    public List d() {
        return this.f18613d;
    }

    public boolean equals(Object obj) {
        InterfaceC0515w0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f18610a == iVar.a() && this.f18611b == iVar.b() && this.f18612c.equals(iVar.c()) && this.f18613d.equals(iVar.d()) && ((aVar = this.f18614e) != null ? aVar.equals(iVar.j()) : iVar.j() == null) && this.f18615f.equals(iVar.k())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f18610a ^ 1000003) * 1000003) ^ this.f18611b) * 1000003) ^ this.f18612c.hashCode()) * 1000003) ^ this.f18613d.hashCode()) * 1000003;
        InterfaceC0515w0.a aVar = this.f18614e;
        return ((iHashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f18615f.hashCode();
    }

    @Override // b0.i
    public InterfaceC0515w0.a j() {
        return this.f18614e;
    }

    @Override // b0.i
    public InterfaceC0515w0.c k() {
        return this.f18615f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f18610a + ", recommendedFileFormat=" + this.f18611b + ", audioProfiles=" + this.f18612c + ", videoProfiles=" + this.f18613d + ", defaultAudioProfile=" + this.f18614e + ", defaultVideoProfile=" + this.f18615f + "}";
    }
}
