package com.google.android.gms.internal.mlkit_code_scanner;

import G4.I6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = new I6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21454j;

    public zzos(int i10, String str, String str2, String str3) {
        this.f21451g = i10;
        this.f21452h = str;
        this.f21453i = str2;
        this.f21454j = str3;
    }

    public final String X() {
        return this.f21454j;
    }

    public final int e() {
        return this.f21451g;
    }

    public final String k0() {
        return this.f21453i;
    }

    public final String s() {
        return this.f21452h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21451g);
        AbstractC3325b.p(parcel, 2, this.f21452h, false);
        AbstractC3325b.p(parcel, 3, this.f21453i, false);
        AbstractC3325b.p(parcel, 4, this.f21454j, false);
        AbstractC3325b.b(parcel, iA);
    }
}
