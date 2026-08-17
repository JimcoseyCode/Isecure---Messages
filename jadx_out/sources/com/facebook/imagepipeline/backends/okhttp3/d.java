package com.facebook.imagepipeline.backends.okhttp3;

import e9.D;
import e9.t;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Exception {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f19861i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f19862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f19863h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(D response) {
            AbstractC2855l.g(response, "response");
            D dT0 = response.t0();
            Integer numValueOf = dT0 != null ? Integer.valueOf(dT0.I()) : null;
            D dT02 = response.t0();
            return new d(numValueOf, dT02 != null ? dT02.g0() : null);
        }

        private a() {
        }
    }

    public d(Integer num, t tVar) {
        this.f19862g = num;
        this.f19863h = tVar;
    }
}
