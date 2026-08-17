package f3;

import d2.AbstractC2325a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: f3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2609c implements InterfaceC2611e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27236a;

    public C2609c(Set set) {
        this.f27236a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2611e interfaceC2611e = (InterfaceC2611e) it.next();
            if (interfaceC2611e != null) {
                this.f27236a.add(interfaceC2611e);
            }
        }
    }

    private void a(String str, Throwable th) {
        AbstractC2325a.n("ForwardingRequestListener", str, th);
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerEvent(String str, String str2, String str3) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onProducerEvent(str, str2, str3);
            } catch (Exception e10) {
                a("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithCancellation(String str, String str2, Map map) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithFailure(String str, String str2, Throwable th, Map map) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithSuccess(String str, String str2, Map map) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onProducerStart(String str, String str2) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onProducerStart(str, str2);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // f3.InterfaceC2611e
    public void onRequestCancellation(String str) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onRequestCancellation(str);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // f3.InterfaceC2611e
    public void onRequestFailure(com.facebook.imagepipeline.request.b bVar, String str, Throwable th, boolean z10) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onRequestFailure(bVar, str, th, z10);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // f3.InterfaceC2611e
    public void onRequestStart(com.facebook.imagepipeline.request.b bVar, Object obj, String str, boolean z10) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onRequestStart(bVar, obj, str, z10);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // f3.InterfaceC2611e
    public void onRequestSuccess(com.facebook.imagepipeline.request.b bVar, String str, boolean z10) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onRequestSuccess(bVar, str, z10);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void onUltimateProducerReached(String str, String str2, boolean z10) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((InterfaceC2611e) this.f27236a.get(i10)).onUltimateProducerReached(str, str2, z10);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean requiresExtraMap(String str) {
        int size = this.f27236a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((InterfaceC2611e) this.f27236a.get(i10)).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public C2609c(InterfaceC2611e... interfaceC2611eArr) {
        this.f27236a = new ArrayList(interfaceC2611eArr.length);
        for (InterfaceC2611e interfaceC2611e : interfaceC2611eArr) {
            if (interfaceC2611e != null) {
                this.f27236a.add(interfaceC2611e);
            }
        }
    }
}
