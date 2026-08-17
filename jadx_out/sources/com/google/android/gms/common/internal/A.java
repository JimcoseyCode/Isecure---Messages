package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class A extends F4.a implements e {
    A(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.e
    public final Account zzb() {
        Parcel parcelC = c(2, d());
        Account account = (Account) F4.c.a(parcelC, Account.CREATOR);
        parcelC.recycle();
        return account;
    }
}
