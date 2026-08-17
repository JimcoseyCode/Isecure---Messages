package W1;

import android.net.Uri;
import c2.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f11953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f11954b;

    public i(String str) {
        this(str, false);
    }

    @Override // W1.d
    public boolean a(Uri uri) {
        return this.f11953a.contains(uri.toString());
    }

    @Override // W1.d
    public boolean b() {
        return this.f11954b;
    }

    @Override // W1.d
    public String c() {
        return this.f11953a;
    }

    @Override // W1.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f11953a.equals(((i) obj).f11953a);
        }
        return false;
    }

    @Override // W1.d
    public int hashCode() {
        return this.f11953a.hashCode();
    }

    public String toString() {
        return this.f11953a;
    }

    public i(String str, boolean z10) {
        this.f11953a = (String) k.g(str);
        this.f11954b = z10;
    }
}
