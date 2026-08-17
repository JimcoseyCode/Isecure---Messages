package h5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: h5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2705a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f28293a;

    public C2705a(float f10) {
        this.f28293a = f10;
    }

    @Override // h5.d
    public float a(RectF rectF) {
        return this.f28293a;
    }

    public float b() {
        return this.f28293a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2705a) && this.f28293a == ((C2705a) obj).f28293a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f28293a)});
    }

    public String toString() {
        return b() + "px";
    }
}
