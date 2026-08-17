package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;
import w4.C3479a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C3479a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f21324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21325i;

    public FavaDiagnosticsEntity(int i10, String str, int i11) {
        this.f21323g = i10;
        this.f21324h = str;
        this.f21325i = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21323g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.p(parcel, 2, this.f21324h, false);
        AbstractC3325b.j(parcel, 3, this.f21325i);
        AbstractC3325b.b(parcel, iA);
    }
}
