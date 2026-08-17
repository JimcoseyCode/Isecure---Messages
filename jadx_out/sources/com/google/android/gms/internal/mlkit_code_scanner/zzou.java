package com.google.android.gms.internal.mlkit_code_scanner;

import G4.K6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new K6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f21462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f21463m;

    public zzou(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f21457g = str;
        this.f21458h = str2;
        this.f21459i = str3;
        this.f21460j = str4;
        this.f21461k = str5;
        this.f21462l = str6;
        this.f21463m = str7;
    }

    public final String X() {
        return this.f21462l;
    }

    public final String e() {
        return this.f21460j;
    }

    public final String k0() {
        return this.f21461k;
    }

    public final String l0() {
        return this.f21459i;
    }

    public final String s() {
        return this.f21457g;
    }

    public final String t0() {
        return this.f21458h;
    }

    public final String u0() {
        return this.f21463m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, this.f21457g, false);
        AbstractC3325b.p(parcel, 2, this.f21458h, false);
        AbstractC3325b.p(parcel, 3, this.f21459i, false);
        AbstractC3325b.p(parcel, 4, this.f21460j, false);
        AbstractC3325b.p(parcel, 5, this.f21461k, false);
        AbstractC3325b.p(parcel, 6, this.f21462l, false);
        AbstractC3325b.p(parcel, 7, this.f21463m, false);
        AbstractC3325b.b(parcel, iA);
    }
}
