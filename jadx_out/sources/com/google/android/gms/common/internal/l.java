package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import r4.InterfaceC3264e;
import r4.InterfaceC3265f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class l implements InterfaceC3265f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f21242c;

    l(IBinder iBinder) {
        this.f21242c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21242c;
    }

    @Override // r4.InterfaceC3265f
    public final void i(InterfaceC3264e interfaceC3264e, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC3264e != null ? interfaceC3264e.asBinder() : null);
            if (getServiceRequest != null) {
                parcelObtain.writeInt(1);
                v.a(getServiceRequest, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f21242c.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
