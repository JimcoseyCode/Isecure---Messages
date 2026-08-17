package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.P9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new P9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzp f21512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zzq[] f21515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zzn[] f21516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f21517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public zzi[] f21518m;

    public zzl(zzp zzpVar, String str, String str2, zzq[] zzqVarArr, zzn[] zznVarArr, String[] strArr, zzi[] zziVarArr) {
        this.f21512g = zzpVar;
        this.f21513h = str;
        this.f21514i = str2;
        this.f21515j = zzqVarArr;
        this.f21516k = zznVarArr;
        this.f21517l = strArr;
        this.f21518m = zziVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 2, this.f21512g, i10, false);
        AbstractC3325b.p(parcel, 3, this.f21513h, false);
        AbstractC3325b.p(parcel, 4, this.f21514i, false);
        AbstractC3325b.s(parcel, 5, this.f21515j, i10, false);
        AbstractC3325b.s(parcel, 6, this.f21516k, i10, false);
        AbstractC3325b.q(parcel, 7, this.f21517l, false);
        AbstractC3325b.s(parcel, 8, this.f21518m, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
