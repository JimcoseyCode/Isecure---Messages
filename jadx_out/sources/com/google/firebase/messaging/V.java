package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC3324a;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class V implements Parcelable.Creator {
    static void c(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.d(parcel, 2, remoteMessage.f24162g, false);
        AbstractC3325b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        Bundle bundleF = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            if (AbstractC3324a.u(iY) != 2) {
                AbstractC3324a.E(parcel, iY);
            } else {
                bundleF = AbstractC3324a.f(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new RemoteMessage(bundleF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
