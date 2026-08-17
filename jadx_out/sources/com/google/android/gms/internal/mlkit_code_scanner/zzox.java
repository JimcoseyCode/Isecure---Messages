package com.google.android.gms.internal.mlkit_code_scanner;

import G4.N6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzox extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzox> CREATOR = new N6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21469h;

    public zzox(String str, String str2) {
        this.f21468g = str;
        this.f21469h = str2;
    }

    public final String e() {
        return this.f21468g;
    }

    public final String s() {
        return this.f21469h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, this.f21468g, false);
        AbstractC3325b.p(parcel, 2, this.f21469h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
