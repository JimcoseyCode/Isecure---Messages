package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new s();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21385j;

    zzq(boolean z10, String str, int i10, int i11) {
        this.f21382g = z10;
        this.f21383h = str;
        this.f21384i = u.a(i10) - 1;
        this.f21385j = h.a(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.c(parcel, 1, this.f21382g);
        AbstractC3325b.p(parcel, 2, this.f21383h, false);
        AbstractC3325b.j(parcel, 3, this.f21384i);
        AbstractC3325b.j(parcel, 4, this.f21385j);
        AbstractC3325b.b(parcel, iA);
    }
}
