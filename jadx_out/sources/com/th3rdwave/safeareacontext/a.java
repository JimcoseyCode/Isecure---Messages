package com.th3rdwave.safeareacontext;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f25473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f25474d;

    public a(float f10, float f11, float f12, float f13) {
        this.f25471a = f10;
        this.f25472b = f11;
        this.f25473c = f12;
        this.f25474d = f13;
    }

    public final float a() {
        return this.f25473c;
    }

    public final float b() {
        return this.f25474d;
    }

    public final float c() {
        return this.f25472b;
    }

    public final float d() {
        return this.f25471a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f25471a, aVar.f25471a) == 0 && Float.compare(this.f25472b, aVar.f25472b) == 0 && Float.compare(this.f25473c, aVar.f25473c) == 0 && Float.compare(this.f25474d, aVar.f25474d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f25471a) * 31) + Float.hashCode(this.f25472b)) * 31) + Float.hashCode(this.f25473c)) * 31) + Float.hashCode(this.f25474d);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.f25471a + ", right=" + this.f25472b + ", bottom=" + this.f25473c + ", left=" + this.f25474d + ")";
    }
}
