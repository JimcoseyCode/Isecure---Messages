package E0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import com.facebook.react.common.assets.ReactFontManager;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import x0.v;
import y.AbstractC3567L;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f1053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f1056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f1057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f1058f;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this(uri, i10, i11, z10, null, i12);
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f1058f;
        }

        public String c() {
            if (i()) {
                return this.f1053a.getAuthority();
            }
            return null;
        }

        public int d() {
            return this.f1054b;
        }

        public Uri e() {
            return this.f1053a;
        }

        public String f() {
            return this.f1057e;
        }

        public int g() {
            return this.f1055c;
        }

        public boolean h() {
            return this.f1056d;
        }

        public boolean i() {
            return Objects.equals(this.f1053a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f1053a = (Uri) H0.g.g(uri);
            this.f1054b = i10;
            this.f1055c = i11;
            this.f1056d = z10;
            this.f1057e = str;
            this.f1058f = i12;
        }

        public b(String str, String str2) {
            this.f1053a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f1054b = 0;
            this.f1055c = ReactFontManager.TypefaceStyle.NORMAL;
            this.f1056d = false;
            this.f1057e = str2;
            this.f1058f = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return v.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, f fVar) {
        return e.e(context, AbstractC3567L.a(new Object[]{fVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        E0.a aVar = new E0.a(cVar, i.b(handler));
        if (!z10) {
            return g.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return g.e(context, (f) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f1052b;

        public a(int i10, b[] bVarArr) {
            this.f1051a = i10;
            this.f1052b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f1052b.get(0);
        }

        public List d() {
            return this.f1052b;
        }

        public int e() {
            return this.f1051a;
        }

        boolean f() {
            return this.f1052b.size() > 1;
        }

        a(int i10, List list) {
            this.f1051a = i10;
            this.f1052b = list;
        }
    }
}
