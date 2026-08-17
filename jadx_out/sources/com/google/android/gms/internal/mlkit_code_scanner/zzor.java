package com.google.android.gms.internal.mlkit_code_scanner;

import G4.H6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzor> CREATOR = new H6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f21442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f21443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f21444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f21445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f21446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f21447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f21448r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f21449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f21450t;

    public zzor(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f21437g = str;
        this.f21438h = str2;
        this.f21439i = str3;
        this.f21440j = str4;
        this.f21441k = str5;
        this.f21442l = str6;
        this.f21443m = str7;
        this.f21444n = str8;
        this.f21445o = str9;
        this.f21446p = str10;
        this.f21447q = str11;
        this.f21448r = str12;
        this.f21449s = str13;
        this.f21450t = str14;
    }

    public final String A0() {
        return this.f21438h;
    }

    public final String D0() {
        return this.f21441k;
    }

    public final String J0() {
        return this.f21447q;
    }

    public final String K0() {
        return this.f21450t;
    }

    public final String L0() {
        return this.f21440j;
    }

    public final String M0() {
        return this.f21446p;
    }

    public final String N0() {
        return this.f21439i;
    }

    public final String X() {
        return this.f21442l;
    }

    public final String e() {
        return this.f21443m;
    }

    public final String k0() {
        return this.f21445o;
    }

    public final String l0() {
        return this.f21449s;
    }

    public final String s() {
        return this.f21444n;
    }

    public final String t0() {
        return this.f21437g;
    }

    public final String u0() {
        return this.f21448r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, this.f21437g, false);
        AbstractC3325b.p(parcel, 2, this.f21438h, false);
        AbstractC3325b.p(parcel, 3, this.f21439i, false);
        AbstractC3325b.p(parcel, 4, this.f21440j, false);
        AbstractC3325b.p(parcel, 5, this.f21441k, false);
        AbstractC3325b.p(parcel, 6, this.f21442l, false);
        AbstractC3325b.p(parcel, 7, this.f21443m, false);
        AbstractC3325b.p(parcel, 8, this.f21444n, false);
        AbstractC3325b.p(parcel, 9, this.f21445o, false);
        AbstractC3325b.p(parcel, 10, this.f21446p, false);
        AbstractC3325b.p(parcel, 11, this.f21447q, false);
        AbstractC3325b.p(parcel, 12, this.f21448r, false);
        AbstractC3325b.p(parcel, 13, this.f21449s, false);
        AbstractC3325b.p(parcel, 14, this.f21450t, false);
        AbstractC3325b.b(parcel, iA);
    }
}
