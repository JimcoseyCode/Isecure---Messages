package androidx.media;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f17653a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f17654b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f17655c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f17656d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f17654b;
    }

    public int b() {
        int i10 = this.f17655c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f17656d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f17655c, this.f17653a);
    }

    public int d() {
        return this.f17653a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f17654b == audioAttributesImplBase.a() && this.f17655c == audioAttributesImplBase.b() && this.f17653a == audioAttributesImplBase.d() && this.f17656d == audioAttributesImplBase.f17656d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17654b), Integer.valueOf(this.f17655c), Integer.valueOf(this.f17653a), Integer.valueOf(this.f17656d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f17656d != -1) {
            sb.append(" stream=");
            sb.append(this.f17656d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f17653a));
        sb.append(" content=");
        sb.append(this.f17654b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f17655c).toUpperCase());
        return sb.toString();
    }
}
