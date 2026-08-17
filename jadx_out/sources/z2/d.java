package Z2;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import f3.InterfaceC2610d;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Z2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f13562j = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m2.c a(d0 producer, l0 settableProducerContext, InterfaceC2610d listener) {
            AbstractC2855l.g(producer, "producer");
            AbstractC2855l.g(settableProducerContext, "settableProducerContext");
            AbstractC2855l.g(listener, "listener");
            return new d(producer, settableProducerContext, listener, null);
        }

        private a() {
        }
    }

    public /* synthetic */ d(d0 d0Var, l0 l0Var, InterfaceC2610d interfaceC2610d, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, l0Var, interfaceC2610d);
    }

    private d(d0 d0Var, l0 l0Var, InterfaceC2610d interfaceC2610d) {
        super(d0Var, l0Var, interfaceC2610d);
    }
}
