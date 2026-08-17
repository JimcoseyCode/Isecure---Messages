package r4;

import android.os.Bundle;
import o4.C3008a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class n implements C3008a.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f31935h = a().a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31936g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f31937a;

        /* synthetic */ a(q qVar) {
        }

        public n a() {
            return new n(this.f31937a, null);
        }

        public a b(String str) {
            this.f31937a = str;
            return this;
        }
    }

    /* synthetic */ n(String str, r rVar) {
        this.f31936g = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f31936g;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return AbstractC3267h.a(this.f31936g, ((n) obj).f31936g);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3267h.b(this.f31936g);
    }
}
