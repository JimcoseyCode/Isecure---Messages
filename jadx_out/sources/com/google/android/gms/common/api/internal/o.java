package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import p4.AbstractC3067n;
import p4.C3055b;
import r4.AbstractC3267h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3055b f21082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Feature f21083b;

    /* synthetic */ o(C3055b c3055b, Feature feature, AbstractC3067n abstractC3067n) {
        this.f21082a = c3055b;
        this.f21083b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o)) {
            o oVar = (o) obj;
            if (AbstractC3267h.a(this.f21082a, oVar.f21082a) && AbstractC3267h.a(this.f21083b, oVar.f21083b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3267h.b(this.f21082a, this.f21083b);
    }

    public final String toString() {
        return AbstractC3267h.c(this).a("key", this.f21082a).a("feature", this.f21083b).toString();
    }
}
