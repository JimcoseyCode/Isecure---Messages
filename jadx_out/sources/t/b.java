package T;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f10321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f10322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f10323c;

    public b(Rect cropRectBeforeScaling, Size childSizeToScale, Size originalSelectedChildSize) {
        AbstractC2855l.g(cropRectBeforeScaling, "cropRectBeforeScaling");
        AbstractC2855l.g(childSizeToScale, "childSizeToScale");
        AbstractC2855l.g(originalSelectedChildSize, "originalSelectedChildSize");
        this.f10321a = cropRectBeforeScaling;
        this.f10322b = childSizeToScale;
        this.f10323c = originalSelectedChildSize;
    }

    public final Size a() {
        return this.f10322b;
    }

    public final Rect b() {
        return this.f10321a;
    }

    public final Size c() {
        return this.f10323c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC2855l.b(this.f10321a, bVar.f10321a) && AbstractC2855l.b(this.f10322b, bVar.f10322b) && AbstractC2855l.b(this.f10323c, bVar.f10323c);
    }

    public int hashCode() {
        return (((this.f10321a.hashCode() * 31) + this.f10322b.hashCode()) * 31) + this.f10323c.hashCode();
    }

    public String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f10321a + ", childSizeToScale=" + this.f10322b + ", originalSelectedChildSize=" + this.f10323c + ')';
    }
}
