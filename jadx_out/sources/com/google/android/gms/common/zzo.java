package com.google.android.gms.common;

import B4.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new r();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f21379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f21380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f21381l;

    zzo(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f21376g = str;
        this.f21377h = z10;
        this.f21378i = z11;
        this.f21379j = (Context) B4.b.f(a.AbstractBinderC0016a.d(iBinder));
        this.f21380k = z12;
        this.f21381l = z13;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [B4.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21376g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.c(parcel, 2, this.f21377h);
        AbstractC3325b.c(parcel, 3, this.f21378i);
        AbstractC3325b.i(parcel, 4, B4.b.x(this.f21379j), false);
        AbstractC3325b.c(parcel, 5, this.f21380k);
        AbstractC3325b.c(parcel, 6, this.f21381l);
        AbstractC3325b.b(parcel, iA);
    }
}
