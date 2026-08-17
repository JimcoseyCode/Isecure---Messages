package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.T9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxr> CREATOR = new T9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final zzxq f21587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzxq f21588m;

    public zzxr(String str, String str2, String str3, String str4, String str5, zzxq zzxqVar, zzxq zzxqVar2) {
        this.f21582g = str;
        this.f21583h = str2;
        this.f21584i = str3;
        this.f21585j = str4;
        this.f21586k = str5;
        this.f21587l = zzxqVar;
        this.f21588m = zzxqVar2;
    }

    public final String X() {
        return this.f21583h;
    }

    public final zzxq e() {
        return this.f21588m;
    }

    public final String k0() {
        return this.f21584i;
    }

    public final String l0() {
        return this.f21585j;
    }

    public final zzxq s() {
        return this.f21587l;
    }

    public final String t0() {
        return this.f21586k;
    }

    public final String u0() {
        return this.f21582g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21582g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f21583h, false);
        AbstractC3325b.p(parcel, 3, this.f21584i, false);
        AbstractC3325b.p(parcel, 4, this.f21585j, false);
        AbstractC3325b.p(parcel, 5, this.f21586k, false);
        AbstractC3325b.o(parcel, 6, this.f21587l, i10, false);
        AbstractC3325b.o(parcel, 7, this.f21588m, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
