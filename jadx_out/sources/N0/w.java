package N0;

import R8.InterfaceC1440w;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function2 f7942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1440w f7943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D f7944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final n7.j f7945d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 transform, InterfaceC1440w ack, D d10, n7.j callerContext) {
            super(null);
            AbstractC2855l.g(transform, "transform");
            AbstractC2855l.g(ack, "ack");
            AbstractC2855l.g(callerContext, "callerContext");
            this.f7942a = transform;
            this.f7943b = ack;
            this.f7944c = d10;
            this.f7945d = callerContext;
        }

        public final InterfaceC1440w a() {
            return this.f7943b;
        }

        public final n7.j b() {
            return this.f7945d;
        }

        public D c() {
            return this.f7944c;
        }

        public final Function2 d() {
            return this.f7942a;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w() {
    }
}
