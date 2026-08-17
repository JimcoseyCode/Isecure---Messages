package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.text.TextAttributeProps;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.AbstractC3267h;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f20992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PendingIntent f20994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f20995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ConnectionResult f20991k = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new g();

    ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f20992g = i10;
        this.f20993h = i11;
        this.f20994i = pendingIntent;
        this.f20995j = str;
    }

    static String t0(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                        return "CANCELED";
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                        return "TIMEOUT";
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                        return "SERVICE_UPDATING";
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                        return "API_DISABLED";
                    case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public PendingIntent X() {
        return this.f20994i;
    }

    public int e() {
        return this.f20993h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f20993h == connectionResult.f20993h && AbstractC3267h.a(this.f20994i, connectionResult.f20994i) && AbstractC3267h.a(this.f20995j, connectionResult.f20995j);
    }

    public int hashCode() {
        return AbstractC3267h.b(Integer.valueOf(this.f20993h), this.f20994i, this.f20995j);
    }

    public boolean k0() {
        return (this.f20993h == 0 || this.f20994i == null) ? false : true;
    }

    public boolean l0() {
        return this.f20993h == 0;
    }

    public String s() {
        return this.f20995j;
    }

    public String toString() {
        AbstractC3267h.a aVarC = AbstractC3267h.c(this);
        aVarC.a("statusCode", t0(this.f20993h));
        aVarC.a("resolution", this.f20994i);
        aVarC.a("message", this.f20995j);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f20992g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.j(parcel, 2, e());
        AbstractC3325b.o(parcel, 3, X(), i10, false);
        AbstractC3325b.p(parcel, 4, s(), false);
        AbstractC3325b.b(parcel, iA);
    }

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
