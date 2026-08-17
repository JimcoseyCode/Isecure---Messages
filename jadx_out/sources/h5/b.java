package h5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f28294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f28295b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f28294a;
            f10 += ((b) dVar).f28295b;
        }
        this.f28294a = dVar;
        this.f28295b = f10;
    }

    @Override // h5.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f28294a.a(rectF) + this.f28295b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f28294a.equals(bVar.f28294a) && this.f28295b == bVar.f28295b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28294a, Float.valueOf(this.f28295b)});
    }
}
