package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new v();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final Scope[] f21165u = new Scope[0];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Feature[] f21166v = new Feature[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f21168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f21169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f21170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    IBinder f21171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Scope[] f21172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Bundle f21173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Account f21174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Feature[] f21175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Feature[] f21176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final boolean f21177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f21178r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f21179s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f21180t;

    GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f21165u : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f21166v : featureArr;
        featureArr2 = featureArr2 == null ? f21166v : featureArr2;
        this.f21167g = i10;
        this.f21168h = i11;
        this.f21169i = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f21170j = "com.google.android.gms";
        } else {
            this.f21170j = str;
        }
        if (i10 < 2) {
            this.f21174n = iBinder != null ? AbstractBinderC2099a.f(e.a.d(iBinder)) : null;
        } else {
            this.f21171k = iBinder;
            this.f21174n = account;
        }
        this.f21172l = scopeArr;
        this.f21173m = bundle;
        this.f21175o = featureArr;
        this.f21176p = featureArr2;
        this.f21177q = z10;
        this.f21178r = i13;
        this.f21179s = z11;
        this.f21180t = str2;
    }

    public final String e() {
        return this.f21180t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        v.a(this, parcel, i10);
    }
}
