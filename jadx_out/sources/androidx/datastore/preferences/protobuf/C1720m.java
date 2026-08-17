package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1726t;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1720m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C1720m f16947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1720m f16948c = new C1720m(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f16949a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f16950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16951b;

        a(Object obj, int i10) {
            this.f16950a = obj;
            this.f16951b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16950a == aVar.f16950a && this.f16951b == aVar.f16951b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f16950a) * 65535) + this.f16951b;
        }
    }

    C1720m(boolean z10) {
    }

    public static C1720m b() {
        C1720m c1720mA;
        if (U.f16788d) {
            return f16948c;
        }
        C1720m c1720m = f16947b;
        if (c1720m != null) {
            return c1720m;
        }
        synchronized (C1720m.class) {
            try {
                c1720mA = f16947b;
                if (c1720mA == null) {
                    c1720mA = AbstractC1719l.a();
                    f16947b = c1720mA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1720mA;
    }

    public AbstractC1726t.c a(J j10, int i10) {
        android.support.v4.media.session.b.a(this.f16949a.get(new a(j10, i10)));
        return null;
    }
}
