package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.text.TextAttributeProps;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import s4.AbstractC3324a;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, getServiceRequest.f21167g);
        AbstractC3325b.j(parcel, 2, getServiceRequest.f21168h);
        AbstractC3325b.j(parcel, 3, getServiceRequest.f21169i);
        AbstractC3325b.p(parcel, 4, getServiceRequest.f21170j, false);
        AbstractC3325b.i(parcel, 5, getServiceRequest.f21171k, false);
        AbstractC3325b.s(parcel, 6, getServiceRequest.f21172l, i10, false);
        AbstractC3325b.d(parcel, 7, getServiceRequest.f21173m, false);
        AbstractC3325b.o(parcel, 8, getServiceRequest.f21174n, i10, false);
        AbstractC3325b.s(parcel, 10, getServiceRequest.f21175o, i10, false);
        AbstractC3325b.s(parcel, 11, getServiceRequest.f21176p, i10, false);
        AbstractC3325b.c(parcel, 12, getServiceRequest.f21177q);
        AbstractC3325b.j(parcel, 13, getServiceRequest.f21178r);
        AbstractC3325b.c(parcel, 14, getServiceRequest.f21179s);
        AbstractC3325b.p(parcel, 15, getServiceRequest.e(), false);
        AbstractC3325b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        Scope[] scopeArr = GetServiceRequest.f21165u;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f21166v;
        Feature[] featureArr2 = featureArr;
        String strO = null;
        IBinder iBinderZ = null;
        Account account = null;
        String strO2 = null;
        int iA = 0;
        int iA2 = 0;
        int iA3 = 0;
        boolean zV = false;
        int iA4 = 0;
        boolean zV2 = false;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 2:
                    iA2 = AbstractC3324a.A(parcel, iY);
                    break;
                case 3:
                    iA3 = AbstractC3324a.A(parcel, iY);
                    break;
                case 4:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 5:
                    iBinderZ = AbstractC3324a.z(parcel, iY);
                    break;
                case 6:
                    scopeArr = (Scope[]) AbstractC3324a.r(parcel, iY, Scope.CREATOR);
                    break;
                case 7:
                    bundle = AbstractC3324a.f(parcel, iY);
                    break;
                case 8:
                    account = (Account) AbstractC3324a.n(parcel, iY, Account.CREATOR);
                    break;
                case 9:
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
                case 10:
                    featureArr = (Feature[]) AbstractC3324a.r(parcel, iY, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) AbstractC3324a.r(parcel, iY, Feature.CREATOR);
                    break;
                case 12:
                    zV = AbstractC3324a.v(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    iA4 = AbstractC3324a.A(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    zV2 = AbstractC3324a.v(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new GetServiceRequest(iA, iA2, iA3, strO, iBinderZ, scopeArr, bundle, account, featureArr, featureArr2, zV, iA4, zV2, strO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
