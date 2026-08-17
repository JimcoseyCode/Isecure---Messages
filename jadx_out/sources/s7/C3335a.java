package s7;

import r7.AbstractC3278a;
import z7.AbstractC3691c;

/* JADX INFO: renamed from: s7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3335a extends AbstractC3278a {

    /* JADX INFO: renamed from: s7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0359a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0359a f32324a = new C0359a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f32325b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f32325b = num;
        }

        private C0359a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0359a.f32325b;
        return num == null || num.intValue() >= i10;
    }

    @Override // q7.AbstractC3128a
    public AbstractC3691c b() {
        return c(34) ? new A7.a() : super.b();
    }
}
