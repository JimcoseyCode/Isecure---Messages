package B1;

import B1.n;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class x implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f338b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f339a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public x(c cVar) {
        this.f339a = cVar;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(Uri uri, int i10, int i11, v1.h hVar) {
        return new n.a(new P1.c(uri), this.f339a.a(uri));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Uri uri) {
        return f338b.contains(uri.getScheme());
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f341b;

        public a(ContentResolver contentResolver, boolean z10) {
            this.f340a = contentResolver;
            this.f341b = z10;
        }

        @Override // B1.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f340a, uri, this.f341b);
        }

        @Override // B1.o
        public n build(r rVar) {
            return new x(this);
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f343b;

        public b(ContentResolver contentResolver, boolean z10) {
            this.f342a = contentResolver;
            this.f343b = z10;
        }

        @Override // B1.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f342a, uri, this.f343b);
        }

        @Override // B1.o
        public n build(r rVar) {
            return new x(this);
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f345b;

        public d(ContentResolver contentResolver, boolean z10) {
            this.f344a = contentResolver;
            this.f345b = z10;
        }

        @Override // B1.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f344a, uri, this.f345b);
        }

        @Override // B1.o
        public n build(r rVar) {
            return new x(this);
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
