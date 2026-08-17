package z7;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q7.AbstractC3129b;

/* JADX INFO: renamed from: z7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3691c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f34289g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC3691c f34290h = AbstractC3129b.f30867a.b();

    /* JADX INFO: renamed from: z7.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC3691c implements Serializable {

        /* JADX INFO: renamed from: z7.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static final class C0380a implements Serializable {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final C0380a f34291g = new C0380a();
            private static final long serialVersionUID = 0;

            private C0380a() {
            }

            private final Object readResolve() {
                return AbstractC3691c.f34289g;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C0380a.f34291g;
        }

        @Override // z7.AbstractC3691c
        public int b(int i10) {
            return AbstractC3691c.f34290h.b(i10);
        }

        private a() {
        }
    }

    public abstract int b(int i10);
}
