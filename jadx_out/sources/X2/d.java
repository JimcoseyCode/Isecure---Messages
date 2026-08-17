package X2;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import c2.i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final d f12413m = b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f12421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap.Config f12422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b3.c f12423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorSpace f12424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f12425l;

    public d(e eVar) {
        this.f12414a = eVar.l();
        this.f12415b = eVar.k();
        this.f12416c = eVar.h();
        this.f12417d = eVar.n();
        this.f12418e = eVar.m();
        this.f12419f = eVar.g();
        this.f12420g = eVar.j();
        this.f12421h = eVar.c();
        this.f12422i = eVar.b();
        this.f12423j = eVar.f();
        eVar.d();
        this.f12424k = eVar.e();
        this.f12425l = eVar.i();
    }

    public static d a() {
        return f12413m;
    }

    public static e b() {
        return new e();
    }

    protected i.a c() {
        return c2.i.b(this).a("minDecodeIntervalMs", this.f12414a).a("maxDimensionPx", this.f12415b).c("decodePreviewFrame", this.f12416c).c("useLastFrameForPreview", this.f12417d).c("useEncodedImageForPreview", this.f12418e).c("decodeAllFrames", this.f12419f).c("forceStaticImage", this.f12420g).b("bitmapConfigName", this.f12421h.name()).b("animatedBitmapConfigName", this.f12422i.name()).b("customImageDecoder", this.f12423j).b("bitmapTransformation", null).b("colorSpace", this.f12424k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f12414a != dVar.f12414a || this.f12415b != dVar.f12415b || this.f12416c != dVar.f12416c || this.f12417d != dVar.f12417d || this.f12418e != dVar.f12418e || this.f12419f != dVar.f12419f || this.f12420g != dVar.f12420g) {
            return false;
        }
        boolean z10 = this.f12425l;
        if (z10 || this.f12421h == dVar.f12421h) {
            return (z10 || this.f12422i == dVar.f12422i) && this.f12423j == dVar.f12423j && this.f12424k == dVar.f12424k;
        }
        return false;
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f12414a * 31) + this.f12415b) * 31) + (this.f12416c ? 1 : 0)) * 31) + (this.f12417d ? 1 : 0)) * 31) + (this.f12418e ? 1 : 0)) * 31) + (this.f12419f ? 1 : 0)) * 31) + (this.f12420g ? 1 : 0);
        if (!this.f12425l) {
            iOrdinal = (iOrdinal * 31) + this.f12421h.ordinal();
        }
        if (!this.f12425l) {
            int i10 = iOrdinal * 31;
            Bitmap.Config config = this.f12422i;
            iOrdinal = i10 + (config != null ? config.ordinal() : 0);
        }
        int i11 = iOrdinal * 31;
        b3.c cVar = this.f12423j;
        int iHashCode = (i11 + (cVar != null ? cVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f12424k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
