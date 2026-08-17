package r4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: r4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3267h {

    /* JADX INFO: renamed from: r4.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f31928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f31929b;

        /* synthetic */ a(Object obj, AbstractC3257B abstractC3257B) {
            AbstractC3268i.k(obj);
            this.f31929b = obj;
            this.f31928a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC3268i.k(str);
            this.f31928a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f31929b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f31928a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) this.f31928a.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
