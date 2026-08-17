package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.AbstractC3267h;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new n4.i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f20996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f20998i;

    public Feature(String str, int i10, long j10) {
        this.f20996g = str;
        this.f20997h = i10;
        this.f20998i = j10;
    }

    public String e() {
        return this.f20996g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((e() != null && e().equals(feature.e())) || (e() == null && feature.e() == null)) && s() == feature.s()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3267h.b(e(), Long.valueOf(s()));
    }

    public long s() {
        long j10 = this.f20998i;
        return j10 == -1 ? this.f20997h : j10;
    }

    public final String toString() {
        AbstractC3267h.a aVarC = AbstractC3267h.c(this);
        aVarC.a("name", e());
        aVarC.a("version", Long.valueOf(s()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, e(), false);
        AbstractC3325b.j(parcel, 2, this.f20997h);
        AbstractC3325b.l(parcel, 3, s());
        AbstractC3325b.b(parcel, iA);
    }

    public Feature(String str, long j10) {
        this.f20996g = str;
        this.f20998i = j10;
        this.f20997h = -1;
    }
}
