package com.th3rdwave.safeareacontext;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f25480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f25481d;

    public c(float f10, float f11, float f12, float f13) {
        this.f25478a = f10;
        this.f25479b = f11;
        this.f25480c = f12;
        this.f25481d = f13;
    }

    public final float a() {
        return this.f25481d;
    }

    public final float b() {
        return this.f25480c;
    }

    public final float c() {
        return this.f25478a;
    }

    public final float d() {
        return this.f25479b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f25478a, cVar.f25478a) == 0 && Float.compare(this.f25479b, cVar.f25479b) == 0 && Float.compare(this.f25480c, cVar.f25480c) == 0 && Float.compare(this.f25481d, cVar.f25481d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f25478a) * 31) + Float.hashCode(this.f25479b)) * 31) + Float.hashCode(this.f25480c)) * 31) + Float.hashCode(this.f25481d);
    }

    public String toString() {
        return "Rect(x=" + this.f25478a + ", y=" + this.f25479b + ", width=" + this.f25480c + ", height=" + this.f25481d + ")";
    }
}
