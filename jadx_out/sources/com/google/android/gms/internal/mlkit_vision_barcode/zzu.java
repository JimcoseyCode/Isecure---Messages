package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.G8;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new G8();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Point[] f21559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zzn f21560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public zzq f21561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zzr f21562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zzt f21563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zzs f21564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public zzo f21565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public zzk f21566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzl f21567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zzm f21568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f21569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f21571w;

    public zzu(int i10, String str, String str2, int i11, Point[] pointArr, zzn zznVar, zzq zzqVar, zzr zzrVar, zzt zztVar, zzs zzsVar, zzo zzoVar, zzk zzkVar, zzl zzlVar, zzm zzmVar, byte[] bArr, boolean z10, double d10) {
        this.f21555g = i10;
        this.f21556h = str;
        this.f21569u = bArr;
        this.f21557i = str2;
        this.f21558j = i11;
        this.f21559k = pointArr;
        this.f21570v = z10;
        this.f21571w = d10;
        this.f21560l = zznVar;
        this.f21561m = zzqVar;
        this.f21562n = zzrVar;
        this.f21563o = zztVar;
        this.f21564p = zzsVar;
        this.f21565q = zzoVar;
        this.f21566r = zzkVar;
        this.f21567s = zzlVar;
        this.f21568t = zzmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 2, this.f21555g);
        AbstractC3325b.p(parcel, 3, this.f21556h, false);
        AbstractC3325b.p(parcel, 4, this.f21557i, false);
        AbstractC3325b.j(parcel, 5, this.f21558j);
        AbstractC3325b.s(parcel, 6, this.f21559k, i10, false);
        AbstractC3325b.o(parcel, 7, this.f21560l, i10, false);
        AbstractC3325b.o(parcel, 8, this.f21561m, i10, false);
        AbstractC3325b.o(parcel, 9, this.f21562n, i10, false);
        AbstractC3325b.o(parcel, 10, this.f21563o, i10, false);
        AbstractC3325b.o(parcel, 11, this.f21564p, i10, false);
        AbstractC3325b.o(parcel, 12, this.f21565q, i10, false);
        AbstractC3325b.o(parcel, 13, this.f21566r, i10, false);
        AbstractC3325b.o(parcel, 14, this.f21567s, i10, false);
        AbstractC3325b.o(parcel, 15, this.f21568t, i10, false);
        AbstractC3325b.e(parcel, 16, this.f21569u, false);
        AbstractC3325b.c(parcel, 17, this.f21570v);
        AbstractC3325b.f(parcel, 18, this.f21571w);
        AbstractC3325b.b(parcel, iA);
    }
}
