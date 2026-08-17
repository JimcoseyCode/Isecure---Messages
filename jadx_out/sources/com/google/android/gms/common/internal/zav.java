package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.AbstractC3267h;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final IBinder f21278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConnectionResult f21279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f21280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f21281k;

    zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f21277g = i10;
        this.f21278h = iBinder;
        this.f21279i = connectionResult;
        this.f21280j = z10;
        this.f21281k = z11;
    }

    public final ConnectionResult e() {
        return this.f21279i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.f21279i.equals(zavVar.f21279i) && AbstractC3267h.a(s(), zavVar.s());
    }

    public final e s() {
        IBinder iBinder = this.f21278h;
        if (iBinder == null) {
            return null;
        }
        return e.a.d(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21277g);
        AbstractC3325b.i(parcel, 2, this.f21278h, false);
        AbstractC3325b.o(parcel, 3, this.f21279i, i10, false);
        AbstractC3325b.c(parcel, 4, this.f21280j);
        AbstractC3325b.c(parcel, 5, this.f21281k);
        AbstractC3325b.b(parcel, iA);
    }
}
