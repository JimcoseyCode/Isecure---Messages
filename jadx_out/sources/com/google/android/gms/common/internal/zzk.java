package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new u();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f21287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Feature[] f21288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f21289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ConnectionTelemetryConfiguration f21290j;

    zzk(Bundle bundle, Feature[] featureArr, int i10, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f21287g = bundle;
        this.f21288h = featureArr;
        this.f21289i = i10;
        this.f21290j = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.d(parcel, 1, this.f21287g, false);
        AbstractC3325b.s(parcel, 2, this.f21288h, i10, false);
        AbstractC3325b.j(parcel, 3, this.f21289i);
        AbstractC3325b.o(parcel, 4, this.f21290j, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
