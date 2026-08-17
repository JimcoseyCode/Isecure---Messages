package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.AbstractC3267h;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new r4.o();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f21157h;

    public ClientIdentity(int i10, String str) {
        this.f21156g = i10;
        this.f21157h = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f21156g == this.f21156g && AbstractC3267h.a(clientIdentity.f21157h, this.f21157h);
    }

    public final int hashCode() {
        return this.f21156g;
    }

    public final String toString() {
        return this.f21156g + ":" + this.f21157h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21156g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.p(parcel, 2, this.f21157h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
