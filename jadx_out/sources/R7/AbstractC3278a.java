package r7;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC2855l;
import q7.AbstractC3128a;

/* JADX INFO: renamed from: r7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3278a extends AbstractC3128a {

    /* JADX INFO: renamed from: r7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0352a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0352a f31977a = new C0352a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f31978b;

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
            f31978b = num;
        }

        private C0352a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0352a.f31978b;
        return num == null || num.intValue() >= i10;
    }

    @Override // q7.AbstractC3128a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        AbstractC2855l.g(cause, "cause");
        AbstractC2855l.g(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
