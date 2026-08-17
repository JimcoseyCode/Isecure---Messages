package T6;

import P8.q;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10611b;

    public a(Context context, String str) {
        AbstractC2855l.g(context, "context");
        this.f10610a = context;
        this.f10611b = str;
    }

    private final Uri a(String str, Context context) {
        return b.f10612a.b(context, str);
    }

    private final Uri b(Context context) {
        String str = this.f10611b;
        if (str == null) {
            return null;
        }
        try {
            Uri uri = Uri.parse(str);
            return uri.getScheme() == null ? a(str, context) : uri;
        } catch (Exception unused) {
            return a(str, context);
        }
    }

    private final boolean d(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return q.K(scheme, "res", false, 2, null);
    }

    public final Uri c(Context context) {
        AbstractC2855l.g(context, "context");
        Uri uriB = b(context);
        if (!d(uriB)) {
            return uriB;
        }
        AbstractC2855l.d(uriB);
        String string = uriB.toString();
        AbstractC2855l.f(string, "toString(...)");
        return Uri.parse(q.E(string, "res:/", "android.resource://" + context.getPackageName() + "/", false, 4, null));
    }
}
