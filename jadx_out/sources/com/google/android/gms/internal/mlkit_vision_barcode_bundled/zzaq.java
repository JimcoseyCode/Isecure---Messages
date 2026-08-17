package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new C2202v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f22477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f22478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f22479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f22480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f22481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f22482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f22483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f22484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f22485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f22486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f22487t;

    public zzaq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f22474g = str;
        this.f22475h = str2;
        this.f22476i = str3;
        this.f22477j = str4;
        this.f22478k = str5;
        this.f22479l = str6;
        this.f22480m = str7;
        this.f22481n = str8;
        this.f22482o = str9;
        this.f22483p = str10;
        this.f22484q = str11;
        this.f22485r = str12;
        this.f22486s = str13;
        this.f22487t = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f22474g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f22475h, false);
        AbstractC3325b.p(parcel, 3, this.f22476i, false);
        AbstractC3325b.p(parcel, 4, this.f22477j, false);
        AbstractC3325b.p(parcel, 5, this.f22478k, false);
        AbstractC3325b.p(parcel, 6, this.f22479l, false);
        AbstractC3325b.p(parcel, 7, this.f22480m, false);
        AbstractC3325b.p(parcel, 8, this.f22481n, false);
        AbstractC3325b.p(parcel, 9, this.f22482o, false);
        AbstractC3325b.p(parcel, 10, this.f22483p, false);
        AbstractC3325b.p(parcel, 11, this.f22484q, false);
        AbstractC3325b.p(parcel, 12, this.f22485r, false);
        AbstractC3325b.p(parcel, 13, this.f22486s, false);
        AbstractC3325b.p(parcel, 14, this.f22487t, false);
        AbstractC3325b.b(parcel, iA);
    }
}
