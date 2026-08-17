package z1;

import android.content.Context;
import java.io.File;
import z1.d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34197b;

        a(Context context, String str) {
            this.f34196a = context;
            this.f34197b = str;
        }

        @Override // z1.d.a
        public File a() {
            File cacheDir = this.f34196a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f34197b != null ? new File(cacheDir, this.f34197b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
