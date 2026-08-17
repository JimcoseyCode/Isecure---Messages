package c2;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0200a f18793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0200a f18794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18795d;

        /* JADX INFO: renamed from: c2.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static final class C0200a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f18796a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f18797b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C0200a f18798c;

            private C0200a() {
            }
        }

        private C0200a d() {
            C0200a c0200a = new C0200a();
            this.f18794c.f18798c = c0200a;
            this.f18794c = c0200a;
            return c0200a;
        }

        private a e(String str, Object obj) {
            C0200a c0200aD = d();
            c0200aD.f18797b = obj;
            c0200aD.f18796a = (String) k.g(str);
            return this;
        }

        public a a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z10) {
            return e(str, String.valueOf(z10));
        }

        public String toString() {
            boolean z10 = this.f18795d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f18792a);
            sb.append('{');
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            for (C0200a c0200a = this.f18793b.f18798c; c0200a != null; c0200a = c0200a.f18798c) {
                Object obj = c0200a.f18797b;
                if (!z10 || obj != null) {
                    sb.append(str);
                    String str2 = c0200a.f18796a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private a(String str) {
            C0200a c0200a = new C0200a();
            this.f18793b = c0200a;
            this.f18794c = c0200a;
            this.f18795d = false;
            this.f18792a = (String) k.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
