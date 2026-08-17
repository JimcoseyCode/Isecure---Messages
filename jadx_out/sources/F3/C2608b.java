package f3;

import com.facebook.imagepipeline.producers.e0;
import d2.AbstractC2325a;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2608b implements InterfaceC2610d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27234b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27235a;

    /* JADX INFO: renamed from: f3.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2608b(Set set) {
        if (set == null) {
            this.f27235a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.f27235a = arrayList;
        AbstractC2800q.c0(set, arrayList);
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void a(e0 producerContext, String producerName, String producerEventName) {
        AbstractC2855l.g(producerContext, "producerContext");
        AbstractC2855l.g(producerName, "producerName");
        AbstractC2855l.g(producerEventName, "producerEventName");
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).a(producerContext, producerName, producerEventName);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // f3.InterfaceC2610d
    public void b(e0 producerContext) {
        AbstractC2855l.g(producerContext, "producerContext");
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).b(producerContext);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 producerContext, String producerName, boolean z10) {
        AbstractC2855l.g(producerContext, "producerContext");
        AbstractC2855l.g(producerName, "producerName");
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).c(producerContext, producerName, z10);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 e0Var, String str, Map map) {
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).d(e0Var, str, map);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void e(e0 producerContext, String producerName) {
        AbstractC2855l.g(producerContext, "producerContext");
        AbstractC2855l.g(producerName, "producerName");
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).e(producerContext, producerName);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // f3.InterfaceC2610d
    public void f(e0 producerContext) {
        AbstractC2855l.g(producerContext, "producerContext");
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).f(producerContext);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean g(e0 producerContext, String producerName) {
        AbstractC2855l.g(producerContext, "producerContext");
        AbstractC2855l.g(producerName, "producerName");
        List list = this.f27235a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2610d) it.next()).g(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override // f3.InterfaceC2610d
    public void h(e0 producerContext, Throwable throwable) {
        AbstractC2855l.g(producerContext, "producerContext");
        AbstractC2855l.g(throwable, "throwable");
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).h(producerContext, throwable);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // f3.InterfaceC2610d
    public void i(e0 producerContext) {
        AbstractC2855l.g(producerContext, "producerContext");
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).i(producerContext);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 e0Var, String str, Map map) {
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).j(e0Var, str, map);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 e0Var, String str, Throwable th, Map map) {
        Iterator it = this.f27235a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2610d) it.next()).k(e0Var, str, th, map);
            } catch (Exception e10) {
                AbstractC2325a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }
}
