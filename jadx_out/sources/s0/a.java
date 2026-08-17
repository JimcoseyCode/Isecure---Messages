package S0;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f10244a;

    a(a aVar) {
        this.f10244a = aVar;
    }

    public static a g(Context context, Uri uri) {
        return new c(null, context, uri);
    }

    public static a h(Context context, Uri uri) {
        String strC = E0.c.c(uri);
        if (E0.c.d(context, uri)) {
            strC = E0.c.b(uri);
        }
        if (strC == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriA = E0.c.a(uri, strC);
        if (uriA != null) {
            return new d(null, context, uriA);
        }
        throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract a c(String str);

    public abstract a d(String str, String str2);

    public abstract boolean e();

    public abstract boolean f();

    public abstract String i();

    public a j() {
        return this.f10244a;
    }

    public abstract String k();

    public abstract Uri l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract long o();

    public abstract long p();

    public abstract a[] q();
}
