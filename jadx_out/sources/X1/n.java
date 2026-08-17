package x1;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class n implements v1.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f33436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f33439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f33440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v1.f f33441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f33442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v1.h f33443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33444j;

    n(Object obj, v1.f fVar, int i10, int i11, Map map, Class cls, Class cls2, v1.h hVar) {
        this.f33436b = Q1.k.e(obj);
        this.f33441g = (v1.f) Q1.k.f(fVar, "Signature must not be null");
        this.f33437c = i10;
        this.f33438d = i11;
        this.f33442h = (Map) Q1.k.e(map);
        this.f33439e = (Class) Q1.k.f(cls, "Resource class must not be null");
        this.f33440f = (Class) Q1.k.f(cls2, "Transcode class must not be null");
        this.f33443i = (v1.h) Q1.k.e(hVar);
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f33436b.equals(nVar.f33436b) && this.f33441g.equals(nVar.f33441g) && this.f33438d == nVar.f33438d && this.f33437c == nVar.f33437c && this.f33442h.equals(nVar.f33442h) && this.f33439e.equals(nVar.f33439e) && this.f33440f.equals(nVar.f33440f) && this.f33443i.equals(nVar.f33443i)) {
                return true;
            }
        }
        return false;
    }

    @Override // v1.f
    public int hashCode() {
        if (this.f33444j == 0) {
            int iHashCode = this.f33436b.hashCode();
            this.f33444j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f33441g.hashCode()) * 31) + this.f33437c) * 31) + this.f33438d;
            this.f33444j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f33442h.hashCode();
            this.f33444j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f33439e.hashCode();
            this.f33444j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f33440f.hashCode();
            this.f33444j = iHashCode5;
            this.f33444j = (iHashCode5 * 31) + this.f33443i.hashCode();
        }
        return this.f33444j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f33436b + ", width=" + this.f33437c + ", height=" + this.f33438d + ", resourceClass=" + this.f33439e + ", transcodeClass=" + this.f33440f + ", signature=" + this.f33441g + ", hashCode=" + this.f33444j + ", transformations=" + this.f33442h + ", options=" + this.f33443i + '}';
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
