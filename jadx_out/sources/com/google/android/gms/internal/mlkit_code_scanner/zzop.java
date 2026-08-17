package com.google.android.gms.internal.mlkit_code_scanner;

import G4.F6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzop extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzop> CREATOR = new F6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final zzoo f21428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzoo f21429m;

    public zzop(String str, String str2, String str3, String str4, String str5, zzoo zzooVar, zzoo zzooVar2) {
        this.f21423g = str;
        this.f21424h = str2;
        this.f21425i = str3;
        this.f21426j = str4;
        this.f21427k = str5;
        this.f21428l = zzooVar;
        this.f21429m = zzooVar2;
    }

    public final String X() {
        return this.f21424h;
    }

    public final zzoo e() {
        return this.f21429m;
    }

    public final String k0() {
        return this.f21425i;
    }

    public final String l0() {
        return this.f21426j;
    }

    public final zzoo s() {
        return this.f21428l;
    }

    public final String t0() {
        return this.f21427k;
    }

    public final String u0() {
        return this.f21423g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, this.f21423g, false);
        AbstractC3325b.p(parcel, 2, this.f21424h, false);
        AbstractC3325b.p(parcel, 3, this.f21425i, false);
        AbstractC3325b.p(parcel, 4, this.f21426j, false);
        AbstractC3325b.p(parcel, 5, this.f21427k, false);
        AbstractC3325b.o(parcel, 6, this.f21428l, i10, false);
        AbstractC3325b.o(parcel, 7, this.f21429m, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
