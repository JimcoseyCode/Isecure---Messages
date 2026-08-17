package com.swmansion.rnscreens.safearea;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x0.e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0243a f25353e = new C0243a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f25354f = new a(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f25357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f25358d;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.safearea.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0243a {
        public /* synthetic */ C0243a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(e insets) {
            AbstractC2855l.g(insets, "insets");
            return new a(insets.f33237a, insets.f33238b, insets.f33239c, insets.f33240d);
        }

        public final a b() {
            return a.f25354f;
        }

        public final a c(a i12, a i22) {
            AbstractC2855l.g(i12, "i1");
            AbstractC2855l.g(i22, "i2");
            return new a(Math.max(i12.c(), i22.c()), Math.max(i12.e(), i22.e()), Math.max(i12.d(), i22.d()), Math.max(i12.b(), i22.b()));
        }

        private C0243a() {
        }
    }

    public a(float f10, float f11, float f12, float f13) {
        this.f25355a = f10;
        this.f25356b = f11;
        this.f25357c = f12;
        this.f25358d = f13;
    }

    public final float b() {
        return this.f25358d;
    }

    public final float c() {
        return this.f25355a;
    }

    public final float d() {
        return this.f25357c;
    }

    public final float e() {
        return this.f25356b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f25355a, aVar.f25355a) == 0 && Float.compare(this.f25356b, aVar.f25356b) == 0 && Float.compare(this.f25357c, aVar.f25357c) == 0 && Float.compare(this.f25358d, aVar.f25358d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f25355a) * 31) + Float.hashCode(this.f25356b)) * 31) + Float.hashCode(this.f25357c)) * 31) + Float.hashCode(this.f25358d);
    }

    public String toString() {
        return "EdgeInsets(left=" + this.f25355a + ", top=" + this.f25356b + ", right=" + this.f25357c + ", bottom=" + this.f25358d + ")";
    }
}
