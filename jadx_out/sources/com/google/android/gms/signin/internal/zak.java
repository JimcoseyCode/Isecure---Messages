package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f22558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConnectionResult f22559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final zav f22560i;

    zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f22558g = i10;
        this.f22559h = connectionResult;
        this.f22560i = zavVar;
    }

    public final ConnectionResult e() {
        return this.f22559h;
    }

    public final zav s() {
        return this.f22560i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f22558g);
        AbstractC3325b.o(parcel, 2, this.f22559h, i10, false);
        AbstractC3325b.o(parcel, 3, this.f22560i, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
