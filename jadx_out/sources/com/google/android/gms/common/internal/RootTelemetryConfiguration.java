package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.C3258C;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C3258C();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21194k;

    public RootTelemetryConfiguration(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f21190g = i10;
        this.f21191h = z10;
        this.f21192i = z11;
        this.f21193j = i11;
        this.f21194k = i12;
    }

    public boolean X() {
        return this.f21191h;
    }

    public int e() {
        return this.f21193j;
    }

    public boolean k0() {
        return this.f21192i;
    }

    public int l0() {
        return this.f21190g;
    }

    public int s() {
        return this.f21194k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, l0());
        AbstractC3325b.c(parcel, 2, X());
        AbstractC3325b.c(parcel, 3, k0());
        AbstractC3325b.j(parcel, 4, e());
        AbstractC3325b.j(parcel, 5, s());
        AbstractC3325b.b(parcel, iA);
    }
}
