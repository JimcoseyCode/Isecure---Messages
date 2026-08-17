package p1;

import android.content.Context;

/* JADX INFO: renamed from: p1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3046a {

    /* JADX INFO: renamed from: p1.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f30606a;

        private b(Context context) {
            this.f30606a = context;
        }

        public AbstractC3046a a() {
            Context context = this.f30606a;
            if (context != null) {
                return new C3047b(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b c(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract d b();

    public abstract void d(InterfaceC3048c interfaceC3048c);
}
