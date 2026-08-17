package n5;

import android.content.Context;
import android.text.TextUtils;
import r4.AbstractC3267h;
import r4.AbstractC3268i;
import r4.C3270k;
import y4.o;

/* JADX INFO: renamed from: n5.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2976k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f30055g;

    private C2976k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3268i.o(!o.a(str), "ApplicationId must be set.");
        this.f30050b = str;
        this.f30049a = str2;
        this.f30051c = str3;
        this.f30052d = str4;
        this.f30053e = str5;
        this.f30054f = str6;
        this.f30055g = str7;
    }

    public static C2976k a(Context context) {
        C3270k c3270k = new C3270k(context);
        String strA = c3270k.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new C2976k(strA, c3270k.a("google_api_key"), c3270k.a("firebase_database_url"), c3270k.a("ga_trackingId"), c3270k.a("gcm_defaultSenderId"), c3270k.a("google_storage_bucket"), c3270k.a("project_id"));
    }

    public String b() {
        return this.f30049a;
    }

    public String c() {
        return this.f30050b;
    }

    public String d() {
        return this.f30053e;
    }

    public String e() {
        return this.f30055g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2976k)) {
            return false;
        }
        C2976k c2976k = (C2976k) obj;
        return AbstractC3267h.a(this.f30050b, c2976k.f30050b) && AbstractC3267h.a(this.f30049a, c2976k.f30049a) && AbstractC3267h.a(this.f30051c, c2976k.f30051c) && AbstractC3267h.a(this.f30052d, c2976k.f30052d) && AbstractC3267h.a(this.f30053e, c2976k.f30053e) && AbstractC3267h.a(this.f30054f, c2976k.f30054f) && AbstractC3267h.a(this.f30055g, c2976k.f30055g);
    }

    public int hashCode() {
        return AbstractC3267h.b(this.f30050b, this.f30049a, this.f30051c, this.f30052d, this.f30053e, this.f30054f, this.f30055g);
    }

    public String toString() {
        return AbstractC3267h.c(this).a("applicationId", this.f30050b).a("apiKey", this.f30049a).a("databaseUrl", this.f30051c).a("gcmSenderId", this.f30053e).a("storageBucket", this.f30054f).a("projectId", this.f30055g).toString();
    }
}
