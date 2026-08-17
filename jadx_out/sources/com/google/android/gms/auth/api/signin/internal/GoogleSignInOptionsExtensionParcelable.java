package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f20965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bundle f20967i;

    GoogleSignInOptionsExtensionParcelable(int i10, int i11, Bundle bundle) {
        this.f20965g = i10;
        this.f20966h = i11;
        this.f20967i = bundle;
    }

    public int e() {
        return this.f20966h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f20965g);
        AbstractC3325b.j(parcel, 2, e());
        AbstractC3325b.d(parcel, 3, this.f20967i, false);
        AbstractC3325b.b(parcel, iA);
    }
}
