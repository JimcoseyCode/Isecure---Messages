package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new C2165n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f22513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Point[] f22514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f22515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzar f22516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zzau f22517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zzav f22518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final zzax f22519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final zzaw f22520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final zzas f22521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final zzao f22522s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final zzap f22523t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final zzaq f22524u;

    public zzay(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, zzar zzarVar, zzau zzauVar, zzav zzavVar, zzax zzaxVar, zzaw zzawVar, zzas zzasVar, zzao zzaoVar, zzap zzapVar, zzaq zzaqVar) {
        this.f22510g = i10;
        this.f22511h = str;
        this.f22512i = str2;
        this.f22513j = bArr;
        this.f22514k = pointArr;
        this.f22515l = i11;
        this.f22516m = zzarVar;
        this.f22517n = zzauVar;
        this.f22518o = zzavVar;
        this.f22519p = zzaxVar;
        this.f22520q = zzawVar;
        this.f22521r = zzasVar;
        this.f22522s = zzaoVar;
        this.f22523t = zzapVar;
        this.f22524u = zzaqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22510g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.p(parcel, 2, this.f22511h, false);
        AbstractC3325b.p(parcel, 3, this.f22512i, false);
        AbstractC3325b.e(parcel, 4, this.f22513j, false);
        AbstractC3325b.s(parcel, 5, this.f22514k, i10, false);
        AbstractC3325b.j(parcel, 6, this.f22515l);
        AbstractC3325b.o(parcel, 7, this.f22516m, i10, false);
        AbstractC3325b.o(parcel, 8, this.f22517n, i10, false);
        AbstractC3325b.o(parcel, 9, this.f22518o, i10, false);
        AbstractC3325b.o(parcel, 10, this.f22519p, i10, false);
        AbstractC3325b.o(parcel, 11, this.f22520q, i10, false);
        AbstractC3325b.o(parcel, 12, this.f22521r, i10, false);
        AbstractC3325b.o(parcel, 13, this.f22522s, i10, false);
        AbstractC3325b.o(parcel, 14, this.f22523t, i10, false);
        AbstractC3325b.o(parcel, 15, this.f22524u, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
