package com.swmansion.rnscreens.utils;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0244a f25389c = new C0244a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f25390d = new a(new b(androidx.customview.widget.a.INVALID_ID, false), 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f25391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25392b;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0244a {
        public /* synthetic */ C0244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f25390d;
        }

        private C0244a() {
        }
    }

    public a(b cacheKey, float f10) {
        AbstractC2855l.g(cacheKey, "cacheKey");
        this.f25391a = cacheKey;
        this.f25392b = f10;
    }

    public final float b() {
        return this.f25392b;
    }

    public final boolean c(b key) {
        AbstractC2855l.g(key, "key");
        return this.f25391a.a() != Integer.MIN_VALUE && AbstractC2855l.b(this.f25391a, key);
    }
}
