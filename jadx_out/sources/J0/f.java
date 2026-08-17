package J0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f5322a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface c {
        ClipDescription a();

        void b();

        Uri c();

        Object d();

        Uri getContentUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f5322a = new a(uri, clipDescription, uri2);
        } else {
            this.f5322a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f5322a.getContentUri();
    }

    public ClipDescription b() {
        return this.f5322a.a();
    }

    public Uri c() {
        return this.f5322a.c();
    }

    public void d() {
        this.f5322a.b();
    }

    public Object e() {
        return this.f5322a.d();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f5323a;

        a(Object obj) {
            this.f5323a = (InputContentInfo) obj;
        }

        @Override // J0.f.c
        public ClipDescription a() {
            return this.f5323a.getDescription();
        }

        @Override // J0.f.c
        public void b() {
            this.f5323a.requestPermission();
        }

        @Override // J0.f.c
        public Uri c() {
            return this.f5323a.getLinkUri();
        }

        @Override // J0.f.c
        public Object d() {
            return this.f5323a;
        }

        @Override // J0.f.c
        public Uri getContentUri() {
            return this.f5323a.getContentUri();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f5323a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f5322a = cVar;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f5324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f5325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f5326c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f5324a = uri;
            this.f5325b = clipDescription;
            this.f5326c = uri2;
        }

        @Override // J0.f.c
        public ClipDescription a() {
            return this.f5325b;
        }

        @Override // J0.f.c
        public Uri c() {
            return this.f5326c;
        }

        @Override // J0.f.c
        public Object d() {
            return null;
        }

        @Override // J0.f.c
        public Uri getContentUri() {
            return this.f5324a;
        }

        @Override // J0.f.c
        public void b() {
        }
    }
}
