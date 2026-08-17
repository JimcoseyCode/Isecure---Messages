package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Scope[] f21285j;

    zax(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f21282g = i10;
        this.f21283h = i11;
        this.f21284i = i12;
        this.f21285j = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21282g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.j(parcel, 2, this.f21283h);
        AbstractC3325b.j(parcel, 3, this.f21284i);
        AbstractC3325b.s(parcel, 4, this.f21285j, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
