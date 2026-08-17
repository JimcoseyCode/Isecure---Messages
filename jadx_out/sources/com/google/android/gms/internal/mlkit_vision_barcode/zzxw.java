package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.ca;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxw> CREATOR = new ca();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f21621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f21622m;

    public zzxw(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f21616g = str;
        this.f21617h = str2;
        this.f21618i = str3;
        this.f21619j = str4;
        this.f21620k = str5;
        this.f21621l = str6;
        this.f21622m = str7;
    }

    public final String X() {
        return this.f21621l;
    }

    public final String e() {
        return this.f21619j;
    }

    public final String k0() {
        return this.f21620k;
    }

    public final String l0() {
        return this.f21618i;
    }

    public final String s() {
        return this.f21616g;
    }

    public final String t0() {
        return this.f21617h;
    }

    public final String u0() {
        return this.f21622m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21616g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f21617h, false);
        AbstractC3325b.p(parcel, 3, this.f21618i, false);
        AbstractC3325b.p(parcel, 4, this.f21619j, false);
        AbstractC3325b.p(parcel, 5, this.f21620k, false);
        AbstractC3325b.p(parcel, 6, this.f21621l, false);
        AbstractC3325b.p(parcel, 7, this.f21622m, false);
        AbstractC3325b.b(parcel, iA);
    }
}
