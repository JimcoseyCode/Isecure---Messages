package B1;

import B1.n;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class v implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f334a;

    public v(n nVar) {
        this.f334a = nVar;
    }

    private static Uri c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return d(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? d(str) : uri;
    }

    private static Uri d(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(String str, int i10, int i11, v1.h hVar) {
        Uri uriC = c(str);
        if (uriC == null || !this.f334a.handles(uriC)) {
            return null;
        }
        return this.f334a.buildLoadData(uriC, i10, i11, hVar);
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(String str) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements o {
        @Override // B1.o
        public n build(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b implements o {
        @Override // B1.o
        public n build(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c implements o {
        @Override // B1.o
        public n build(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
