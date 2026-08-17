package com.google.android.gms.common.api.internal;

import P4.C1379m;
import com.google.android.gms.common.Feature;
import o4.C3008a;
import p4.AbstractC3078y;
import p4.InterfaceC3062i;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Feature[] f21050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21052c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC3062i f21053a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Feature[] f21055c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f21054b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21056d = 0;

        /* synthetic */ a(AbstractC3078y abstractC3078y) {
        }

        public d a() {
            AbstractC3268i.b(this.f21053a != null, "execute parameter required");
            return new t(this, this.f21055c, this.f21054b, this.f21056d);
        }

        public a b(InterfaceC3062i interfaceC3062i) {
            this.f21053a = interfaceC3062i;
            return this;
        }

        public a c(boolean z10) {
            this.f21054b = z10;
            return this;
        }

        public a d(Feature... featureArr) {
            this.f21055c = featureArr;
            return this;
        }

        public a e(int i10) {
            this.f21056d = i10;
            return this;
        }
    }

    protected d(Feature[] featureArr, boolean z10, int i10) {
        this.f21050a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f21051b = z11;
        this.f21052c = i10;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(C3008a.b bVar, C1379m c1379m);

    public boolean c() {
        return this.f21051b;
    }

    public final int d() {
        return this.f21052c;
    }

    public final Feature[] e() {
        return this.f21050a;
    }
}
