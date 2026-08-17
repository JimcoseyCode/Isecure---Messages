package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.ia;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new ia();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f21522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f21523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f21524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f21525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f21526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f21527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f21528p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f21529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f21530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f21531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f21532t;

    public zzm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f21519g = str;
        this.f21520h = str2;
        this.f21521i = str3;
        this.f21522j = str4;
        this.f21523k = str5;
        this.f21524l = str6;
        this.f21525m = str7;
        this.f21526n = str8;
        this.f21527o = str9;
        this.f21528p = str10;
        this.f21529q = str11;
        this.f21530r = str12;
        this.f21531s = str13;
        this.f21532t = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 2, this.f21519g, false);
        AbstractC3325b.p(parcel, 3, this.f21520h, false);
        AbstractC3325b.p(parcel, 4, this.f21521i, false);
        AbstractC3325b.p(parcel, 5, this.f21522j, false);
        AbstractC3325b.p(parcel, 6, this.f21523k, false);
        AbstractC3325b.p(parcel, 7, this.f21524l, false);
        AbstractC3325b.p(parcel, 8, this.f21525m, false);
        AbstractC3325b.p(parcel, 9, this.f21526n, false);
        AbstractC3325b.p(parcel, 10, this.f21527o, false);
        AbstractC3325b.p(parcel, 11, this.f21528p, false);
        AbstractC3325b.p(parcel, 12, this.f21529q, false);
        AbstractC3325b.p(parcel, 13, this.f21530r, false);
        AbstractC3325b.p(parcel, 14, this.f21531s, false);
        AbstractC3325b.p(parcel, 15, this.f21532t, false);
        AbstractC3325b.b(parcel, iA);
    }
}
