package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r4.AbstractC3268i;
import s4.AbstractC3325b;
import y4.d;
import y4.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f20923t = f.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f20924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f20926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f20927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f20928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Uri f20929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f20930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f20931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f20932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final List f20933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f20934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f20935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set f20936s = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f20924g = i10;
        this.f20925h = str;
        this.f20926i = str2;
        this.f20927j = str3;
        this.f20928k = str4;
        this.f20929l = uri;
        this.f20930m = str5;
        this.f20931n = j10;
        this.f20932o = str6;
        this.f20933p = list;
        this.f20934q = str7;
        this.f20935r = str8;
    }

    public static GoogleSignInAccount J0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), AbstractC3268i.e(str7), new ArrayList((Collection) AbstractC3268i.k(set)), str5, str6);
    }

    public static GoogleSignInAccount K0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountJ0 = J0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountJ0.f20930m = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountJ0;
    }

    public Set A0() {
        HashSet hashSet = new HashSet(this.f20933p);
        hashSet.addAll(this.f20936s);
        return hashSet;
    }

    public String D0() {
        return this.f20930m;
    }

    public String X() {
        return this.f20935r;
    }

    public String e() {
        return this.f20928k;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f20932o.equals(this.f20932o) && googleSignInAccount.A0().equals(A0());
    }

    public int hashCode() {
        return ((this.f20932o.hashCode() + 527) * 31) + A0().hashCode();
    }

    public String k0() {
        return this.f20934q;
    }

    public String l0() {
        return this.f20925h;
    }

    public String s() {
        return this.f20927j;
    }

    public String t0() {
        return this.f20926i;
    }

    public Uri u0() {
        return this.f20929l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f20924g);
        AbstractC3325b.p(parcel, 2, l0(), false);
        AbstractC3325b.p(parcel, 3, t0(), false);
        AbstractC3325b.p(parcel, 4, s(), false);
        AbstractC3325b.p(parcel, 5, e(), false);
        AbstractC3325b.o(parcel, 6, u0(), i10, false);
        AbstractC3325b.p(parcel, 7, D0(), false);
        AbstractC3325b.l(parcel, 8, this.f20931n);
        AbstractC3325b.p(parcel, 9, this.f20932o, false);
        AbstractC3325b.t(parcel, 10, this.f20933p, false);
        AbstractC3325b.p(parcel, 11, k0(), false);
        AbstractC3325b.p(parcel, 12, X(), false);
        AbstractC3325b.b(parcel, iA);
    }
}
