package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.I9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new I9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f21508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f21509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zzj f21510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public zzj f21511m;

    public zzk(String str, String str2, String str3, String str4, String str5, zzj zzjVar, zzj zzjVar2) {
        this.f21505g = str;
        this.f21506h = str2;
        this.f21507i = str3;
        this.f21508j = str4;
        this.f21509k = str5;
        this.f21510l = zzjVar;
        this.f21511m = zzjVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 2, this.f21505g, false);
        AbstractC3325b.p(parcel, 3, this.f21506h, false);
        AbstractC3325b.p(parcel, 4, this.f21507i, false);
        AbstractC3325b.p(parcel, 5, this.f21508j, false);
        AbstractC3325b.p(parcel, 6, this.f21509k, false);
        AbstractC3325b.o(parcel, 7, this.f21510l, i10, false);
        AbstractC3325b.o(parcel, 8, this.f21511m, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
