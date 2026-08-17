package com.google.android.gms.internal.mlkit_code_scanner;

import G4.O6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoy> CREATOR = new O6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21472i;

    public zzoy(String str, String str2, int i10) {
        this.f21470g = str;
        this.f21471h = str2;
        this.f21472i = i10;
    }

    public final String X() {
        return this.f21470g;
    }

    public final int e() {
        return this.f21472i;
    }

    public final String s() {
        return this.f21471h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, this.f21470g, false);
        AbstractC3325b.p(parcel, 2, this.f21471h, false);
        AbstractC3325b.j(parcel, 3, this.f21472i);
        AbstractC3325b.b(parcel, iA);
    }
}
