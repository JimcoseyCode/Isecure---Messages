package B1;

import B1.n;
import android.content.res.AssetManager;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f246c = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0010a f248b;

    /* JADX INFO: renamed from: B1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0010a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    public a(AssetManager assetManager, InterfaceC0010a interfaceC0010a) {
        this.f247a = assetManager;
        this.f248b = interfaceC0010a;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(Uri uri, int i10, int i11, v1.h hVar) {
        return new n.a(new P1.c(uri), this.f248b.a(this.f247a, uri.toString().substring(f246c)));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b implements o, InterfaceC0010a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f249a;

        public b(AssetManager assetManager) {
            this.f249a = assetManager;
        }

        @Override // B1.a.InterfaceC0010a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // B1.o
        public n build(r rVar) {
            return new a(this.f249a, this);
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c implements o, InterfaceC0010a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f250a;

        public c(AssetManager assetManager) {
            this.f250a = assetManager;
        }

        @Override // B1.a.InterfaceC0010a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // B1.o
        public n build(r rVar) {
            return new a(this.f250a, this);
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
