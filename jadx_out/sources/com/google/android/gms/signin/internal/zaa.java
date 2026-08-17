package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f22551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Intent f22553i;

    zaa(int i10, int i11, Intent intent) {
        this.f22551g = i10;
        this.f22552h = i11;
        this.f22553i = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22551g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.j(parcel, 2, this.f22552h);
        AbstractC3325b.o(parcel, 3, this.f22553i, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
