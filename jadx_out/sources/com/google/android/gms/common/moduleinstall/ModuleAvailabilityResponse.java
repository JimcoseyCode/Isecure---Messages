package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;
import u4.e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21293h;

    public ModuleAvailabilityResponse(boolean z10, int i10) {
        this.f21292g = z10;
        this.f21293h = i10;
    }

    public boolean e() {
        return this.f21292g;
    }

    public int s() {
        return this.f21293h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.c(parcel, 1, e());
        AbstractC3325b.j(parcel, 2, s());
        AbstractC3325b.b(parcel, iA);
    }
}
