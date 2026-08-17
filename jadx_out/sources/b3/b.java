package B3;

import F.f1;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f355a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f356b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        public abstract a a(String str, int i10);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* JADX INFO: renamed from: B3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0015b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f357a;

        public C0015b(long j10) {
            this.f357a = j10;
        }

        @Override // B3.b.a
        public a a(String key, int i10) {
            AbstractC2855l.g(key, "key");
            return this;
        }

        @Override // B3.b.a
        public a b(String key, Object value) {
            AbstractC2855l.g(key, "key");
            AbstractC2855l.g(value, "value");
            return this;
        }

        @Override // B3.b.a
        public void c() {
            B3.a.i(this.f357a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f360c;

        public c(long j10, String sectionName) {
            AbstractC2855l.g(sectionName, "sectionName");
            this.f358a = j10;
            this.f359b = sectionName;
            this.f360c = new ArrayList();
        }

        private final void d(String str, String str2) {
            this.f360c.add(str + ": " + str2);
        }

        @Override // B3.b.a
        public a a(String key, int i10) {
            AbstractC2855l.g(key, "key");
            d(key, String.valueOf(i10));
            return this;
        }

        @Override // B3.b.a
        public a b(String key, Object value) {
            AbstractC2855l.g(key, "key");
            AbstractC2855l.g(value, "value");
            d(key, value.toString());
            return this;
        }

        @Override // B3.b.a
        public void c() {
            String str;
            long j10 = this.f358a;
            String str2 = this.f359b;
            if (!b.f356b || this.f360c.isEmpty()) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            } else {
                str = " (" + f1.a(", ", this.f360c) + ")";
            }
            B3.a.c(j10, str2 + str);
        }
    }

    private b() {
    }

    public static final a a(long j10, String sectionName) {
        AbstractC2855l.g(sectionName, "sectionName");
        return new c(j10, sectionName);
    }

    public static final a b(long j10) {
        return new C0015b(j10);
    }
}
