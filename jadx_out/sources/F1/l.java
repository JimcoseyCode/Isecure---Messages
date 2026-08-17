package F1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l implements v1.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1.g f1801b = v1.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1802a;

    public l(Context context) {
        this.f1802a = context.getApplicationContext();
    }

    private Context b(Uri uri, String str) {
        if (str.equals(this.f1802a.getPackageName())) {
            return this.f1802a;
        }
        try {
            return this.f1802a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f1802a.getPackageName())) {
                return this.f1802a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int c(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int d(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int e(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return d(context, uri);
        }
        if (pathSegments.size() == 1) {
            return c(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v decode(Uri uri, int i10, int i11, v1.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextB = b(uri, authority);
            int iE = e(contextB, uri);
            Resources.Theme theme = ((String) Q1.k.e(authority)).equals(this.f1802a.getPackageName()) ? (Resources.Theme) hVar.b(f1801b) : null;
            return k.d(theme == null ? i.b(this.f1802a, contextB, iE) : i.a(this.f1802a, iE, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // v1.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean handles(Uri uri, v1.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
