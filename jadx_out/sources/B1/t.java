package B1;

import B1.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f330b;

    t(Context context, n nVar) {
        this.f329a = context.getApplicationContext();
        this.f330b = nVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o d(Context context) {
        return new b(context);
    }

    private n.a e(Uri uri, int i10, int i11, v1.h hVar) {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f330b.buildLoadData(Integer.valueOf(i12), i10, i11, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                uri.toString();
            }
            return null;
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Objects.toString(uri);
            }
            return null;
        }
    }

    private n.a f(Uri uri, int i10, int i11, v1.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        int identifier = this.f329a.getResources().getIdentifier(pathSegments.get(1), str, this.f329a.getPackageName());
        if (identifier != 0) {
            return this.f330b.buildLoadData(Integer.valueOf(identifier), i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        uri.toString();
        return null;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(Uri uri, int i10, int i11, v1.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return e(uri, i10, i11, hVar);
        }
        if (pathSegments.size() == 2) {
            return f(uri, i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        uri.toString();
        return null;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f329a.getPackageName().equals(uri.getAuthority());
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f331a;

        a(Context context) {
            this.f331a = context;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new t(this.f331a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f332a;

        b(Context context) {
            this.f332a = context;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new t(this.f332a, rVar.d(Integer.class, InputStream.class));
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
