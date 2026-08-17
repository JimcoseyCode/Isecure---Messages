package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Account f21274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final GoogleSignInAccount f21276j;

    zat(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f21273g = i10;
        this.f21274h = account;
        this.f21275i = i11;
        this.f21276j = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21273g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.o(parcel, 2, this.f21274h, i10, false);
        AbstractC3325b.j(parcel, 3, this.f21275i);
        AbstractC3325b.o(parcel, 4, this.f21276j, i10, false);
        AbstractC3325b.b(parcel, iA);
    }

    public zat(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
