package r4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f31902f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f31905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31907e;

    public F(String str, String str2, int i10, boolean z10) {
        AbstractC3268i.e(str);
        this.f31903a = str;
        AbstractC3268i.e(str2);
        this.f31904b = str2;
        this.f31905c = null;
        this.f31906d = 4225;
        this.f31907e = z10;
    }

    public final ComponentName a() {
        return this.f31905c;
    }

    public final Intent b(Context context) {
        Bundle bundleCall;
        if (this.f31903a == null) {
            return new Intent().setComponent(this.f31905c);
        }
        if (this.f31907e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f31903a);
            try {
                bundleCall = context.getContentResolver().call(f31902f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                "Dynamic intent resolution failed: ".concat(e10.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f31903a));
            }
        }
        return intent == null ? new Intent(this.f31903a).setPackage(this.f31904b) : intent;
    }

    public final String c() {
        return this.f31904b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return AbstractC3267h.a(this.f31903a, f10.f31903a) && AbstractC3267h.a(this.f31904b, f10.f31904b) && AbstractC3267h.a(this.f31905c, f10.f31905c) && this.f31907e == f10.f31907e;
    }

    public final int hashCode() {
        return AbstractC3267h.b(this.f31903a, this.f31904b, this.f31905c, 4225, Boolean.valueOf(this.f31907e));
    }

    public final String toString() {
        String str = this.f31903a;
        if (str != null) {
            return str;
        }
        AbstractC3268i.k(this.f31905c);
        return this.f31905c.flattenToString();
    }
}
