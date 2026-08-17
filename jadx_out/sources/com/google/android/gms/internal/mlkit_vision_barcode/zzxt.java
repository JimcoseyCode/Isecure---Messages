package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.V9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new V9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f21601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f21602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f21603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f21604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f21605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f21606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f21607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f21608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f21609t;

    public zzxt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f21596g = str;
        this.f21597h = str2;
        this.f21598i = str3;
        this.f21599j = str4;
        this.f21600k = str5;
        this.f21601l = str6;
        this.f21602m = str7;
        this.f21603n = str8;
        this.f21604o = str9;
        this.f21605p = str10;
        this.f21606q = str11;
        this.f21607r = str12;
        this.f21608s = str13;
        this.f21609t = str14;
    }

    public final String A0() {
        return this.f21597h;
    }

    public final String D0() {
        return this.f21600k;
    }

    public final String J0() {
        return this.f21606q;
    }

    public final String K0() {
        return this.f21609t;
    }

    public final String L0() {
        return this.f21599j;
    }

    public final String M0() {
        return this.f21605p;
    }

    public final String N0() {
        return this.f21598i;
    }

    public final String X() {
        return this.f21601l;
    }

    public final String e() {
        return this.f21602m;
    }

    public final String k0() {
        return this.f21604o;
    }

    public final String l0() {
        return this.f21608s;
    }

    public final String s() {
        return this.f21603n;
    }

    public final String t0() {
        return this.f21596g;
    }

    public final String u0() {
        return this.f21607r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21596g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f21597h, false);
        AbstractC3325b.p(parcel, 3, this.f21598i, false);
        AbstractC3325b.p(parcel, 4, this.f21599j, false);
        AbstractC3325b.p(parcel, 5, this.f21600k, false);
        AbstractC3325b.p(parcel, 6, this.f21601l, false);
        AbstractC3325b.p(parcel, 7, this.f21602m, false);
        AbstractC3325b.p(parcel, 8, this.f21603n, false);
        AbstractC3325b.p(parcel, 9, this.f21604o, false);
        AbstractC3325b.p(parcel, 10, this.f21605p, false);
        AbstractC3325b.p(parcel, 11, this.f21606q, false);
        AbstractC3325b.p(parcel, 12, this.f21607r, false);
        AbstractC3325b.p(parcel, 13, this.f21608s, false);
        AbstractC3325b.p(parcel, 14, this.f21609t, false);
        AbstractC3325b.b(parcel, iA);
    }
}
