package W3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U3.c f12099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f12100b;

    public h(U3.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f12099a = cVar;
        this.f12100b = bArr;
    }

    public byte[] a() {
        return this.f12100b;
    }

    public U3.c b() {
        return this.f12099a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f12099a.equals(hVar.f12099a)) {
            return Arrays.equals(this.f12100b, hVar.f12100b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12099a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12100b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f12099a + ", bytes=[...]}";
    }
}
