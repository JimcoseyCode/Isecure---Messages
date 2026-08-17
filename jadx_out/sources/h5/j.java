package h5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f28358a;

    public j(float f10) {
        this.f28358a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // h5.d
    public float a(RectF rectF) {
        return this.f28358a * b(rectF);
    }

    public float c() {
        return this.f28358a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f28358a == ((j) obj).f28358a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f28358a)});
    }

    public String toString() {
        return ((int) (c() * 100.0f)) + "%";
    }
}
