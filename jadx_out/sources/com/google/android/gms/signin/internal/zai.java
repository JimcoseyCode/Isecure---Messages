package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f22556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final zat f22557h;

    zai(int i10, zat zatVar) {
        this.f22556g = i10;
        this.f22557h = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f22556g);
        AbstractC3325b.o(parcel, 2, this.f22557h, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
