package B1;

import B1.n;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class s implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f325b;

    public s(Resources resources, n nVar) {
        this.f325b = resources;
        this.f324a = nVar;
    }

    private Uri b(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f325b.getResourcePackageName(num.intValue()) + '/' + num);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(Integer num, int i10, int i11, v1.h hVar) {
        Uri uriB = b(num);
        if (uriB == null) {
            return null;
        }
        return this.f324a.buildLoadData(uriB, i10, i11, hVar);
    }

    @Override // B1.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean handles(Integer num) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f326a;

        public a(Resources resources) {
            this.f326a = resources;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new s(this.f326a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f327a;

        public b(Resources resources) {
            this.f327a = resources;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new s(this.f327a, rVar.d(Uri.class, InputStream.class));
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f328a;

        public c(Resources resources) {
            this.f328a = resources;
        }

        @Override // B1.o
        public n build(r rVar) {
            return new s(this.f328a, w.a());
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
