package W2;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: W2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1495b implements W1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X2.g f11959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X2.h f11960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X2.d f11961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W1.d f11962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f11963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f11964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f11965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f11966i;

    public C1495b(String sourceString, X2.g gVar, X2.h rotationOptions, X2.d imageDecodeOptions, W1.d dVar, String str) {
        AbstractC2855l.g(sourceString, "sourceString");
        AbstractC2855l.g(rotationOptions, "rotationOptions");
        AbstractC2855l.g(imageDecodeOptions, "imageDecodeOptions");
        this.f11958a = sourceString;
        this.f11959b = gVar;
        this.f11960c = rotationOptions;
        this.f11961d = imageDecodeOptions;
        this.f11962e = dVar;
        this.f11963f = str;
        this.f11965h = (((((((((sourceString.hashCode() * 31) + (gVar != null ? gVar.hashCode() : 0)) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        this.f11966i = RealtimeSinceBootClock.get().now();
    }

    @Override // W1.d
    public boolean a(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        String strC = c();
        String string = uri.toString();
        AbstractC2855l.f(string, "toString(...)");
        return P8.q.Q(strC, string, false, 2, null);
    }

    @Override // W1.d
    public boolean b() {
        return false;
    }

    @Override // W1.d
    public String c() {
        return this.f11958a;
    }

    public final void d(Object obj) {
        this.f11964g = obj;
    }

    @Override // W1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC2855l.b(C1495b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C1495b c1495b = (C1495b) obj;
        return AbstractC2855l.b(this.f11958a, c1495b.f11958a) && AbstractC2855l.b(this.f11959b, c1495b.f11959b) && AbstractC2855l.b(this.f11960c, c1495b.f11960c) && AbstractC2855l.b(this.f11961d, c1495b.f11961d) && AbstractC2855l.b(this.f11962e, c1495b.f11962e) && AbstractC2855l.b(this.f11963f, c1495b.f11963f);
    }

    @Override // W1.d
    public int hashCode() {
        return this.f11965h;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f11958a + ", resizeOptions=" + this.f11959b + ", rotationOptions=" + this.f11960c + ", imageDecodeOptions=" + this.f11961d + ", postprocessorCacheKey=" + this.f11962e + ", postprocessorName=" + this.f11963f + ")";
    }
}
