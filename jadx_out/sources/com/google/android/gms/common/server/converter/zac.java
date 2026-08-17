package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f21332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f21333i;

    zac(int i10, String str, int i11) {
        this.f21331g = i10;
        this.f21332h = str;
        this.f21333i = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21331g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.p(parcel, 2, this.f21332h, false);
        AbstractC3325b.j(parcel, 3, this.f21333i);
        AbstractC3325b.b(parcel, iA);
    }

    zac(String str, int i10) {
        this.f21331g = 1;
        this.f21332h = str;
        this.f21333i = i10;
    }
}
