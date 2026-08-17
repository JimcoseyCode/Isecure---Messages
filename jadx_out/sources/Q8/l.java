package q8;

import L7.H;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30876b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(String message) {
            AbstractC2855l.g(message, "message");
            return new b(message);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30877c;

        public b(String message) {
            AbstractC2855l.g(message, "message");
            this.f30877c = message;
        }

        @Override // q8.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public E8.i a(H module) {
            AbstractC2855l.g(module, "module");
            return E8.l.d(E8.k.f1230p0, this.f30877c);
        }

        @Override // q8.g
        public String toString() {
            return this.f30877c;
        }
    }

    public l() {
        super(C2735B.f28704a);
    }

    @Override // q8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C2735B b() {
        throw new UnsupportedOperationException();
    }
}
