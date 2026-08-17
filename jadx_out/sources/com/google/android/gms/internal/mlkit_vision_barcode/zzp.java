package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.C0840d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C0840d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f21542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f21543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f21544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f21545m;

    public zzp(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f21539g = str;
        this.f21540h = str2;
        this.f21541i = str3;
        this.f21542j = str4;
        this.f21543k = str5;
        this.f21544l = str6;
        this.f21545m = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 2, this.f21539g, false);
        AbstractC3325b.p(parcel, 3, this.f21540h, false);
        AbstractC3325b.p(parcel, 4, this.f21541i, false);
        AbstractC3325b.p(parcel, 5, this.f21542j, false);
        AbstractC3325b.p(parcel, 6, this.f21543k, false);
        AbstractC3325b.p(parcel, 7, this.f21544l, false);
        AbstractC3325b.p(parcel, 8, this.f21545m, false);
        AbstractC3325b.b(parcel, iA);
    }
}
