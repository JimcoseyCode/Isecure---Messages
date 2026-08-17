package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1663d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f16534a;

    /* JADX INFO: renamed from: androidx.core.view.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f16535a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f16535a = new b(clipData, i10);
            } else {
                this.f16535a = new C0164d(clipData, i10);
            }
        }

        public C1663d a() {
            return this.f16535a.build();
        }

        public a b(Bundle bundle) {
            this.f16535a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f16535a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f16535a.a(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f16536a;

        b(ClipData clipData, int i10) {
            this.f16536a = AbstractC1673i.a(clipData, i10);
        }

        @Override // androidx.core.view.C1663d.c
        public void a(Uri uri) {
            this.f16536a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1663d.c
        public void b(int i10) {
            this.f16536a.setFlags(i10);
        }

        @Override // androidx.core.view.C1663d.c
        public C1663d build() {
            return new C1663d(new e(this.f16536a.build()));
        }

        @Override // androidx.core.view.C1663d.c
        public void setExtras(Bundle bundle) {
            this.f16536a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface c {
        void a(Uri uri);

        void b(int i10);

        C1663d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0164d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f16537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f16538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f16539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f16540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f16541e;

        C0164d(ClipData clipData, int i10) {
            this.f16537a = clipData;
            this.f16538b = i10;
        }

        @Override // androidx.core.view.C1663d.c
        public void a(Uri uri) {
            this.f16540d = uri;
        }

        @Override // androidx.core.view.C1663d.c
        public void b(int i10) {
            this.f16539c = i10;
        }

        @Override // androidx.core.view.C1663d.c
        public C1663d build() {
            return new C1663d(new g(this));
        }

        @Override // androidx.core.view.C1663d.c
        public void setExtras(Bundle bundle) {
            this.f16541e = bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f16542a;

        e(ContentInfo contentInfo) {
            this.f16542a = AbstractC1661c.a(H0.g.g(contentInfo));
        }

        @Override // androidx.core.view.C1663d.f
        public ClipData a() {
            return this.f16542a.getClip();
        }

        @Override // androidx.core.view.C1663d.f
        public int b() {
            return this.f16542a.getFlags();
        }

        @Override // androidx.core.view.C1663d.f
        public ContentInfo c() {
            return this.f16542a;
        }

        @Override // androidx.core.view.C1663d.f
        public int g() {
            return this.f16542a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f16542a + "}";
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int g();
    }

    /* JADX INFO: renamed from: androidx.core.view.d$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f16543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f16546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f16547e;

        g(C0164d c0164d) {
            this.f16543a = (ClipData) H0.g.g(c0164d.f16537a);
            this.f16544b = H0.g.c(c0164d.f16538b, 0, 5, "source");
            this.f16545c = H0.g.f(c0164d.f16539c, 1);
            this.f16546d = c0164d.f16540d;
            this.f16547e = c0164d.f16541e;
        }

        @Override // androidx.core.view.C1663d.f
        public ClipData a() {
            return this.f16543a;
        }

        @Override // androidx.core.view.C1663d.f
        public int b() {
            return this.f16545c;
        }

        @Override // androidx.core.view.C1663d.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.C1663d.f
        public int g() {
            return this.f16544b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f16543a.getDescription());
            sb.append(", source=");
            sb.append(C1663d.e(this.f16544b));
            sb.append(", flags=");
            sb.append(C1663d.a(this.f16545c));
            Uri uri = this.f16546d;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (uri == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            } else {
                str = ", hasLinkUri(" + this.f16546d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f16547e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    C1663d(f fVar) {
        this.f16534a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C1663d g(ContentInfo contentInfo) {
        return new C1663d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f16534a.a();
    }

    public int c() {
        return this.f16534a.b();
    }

    public int d() {
        return this.f16534a.g();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f16534a.c();
        Objects.requireNonNull(contentInfoC);
        return AbstractC1661c.a(contentInfoC);
    }

    public String toString() {
        return this.f16534a.toString();
    }
}
