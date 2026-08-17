package y8;

import L7.h0;
import h8.AbstractC2708a;
import h8.InterfaceC2710c;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class M implements InterfaceC3648j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2710c f34033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2708a f34034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f34035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f34036d;

    public M(f8.m proto, InterfaceC2710c nameResolver, AbstractC2708a metadataVersion, Function1 classSource) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        AbstractC2855l.g(classSource, "classSource");
        this.f34033a = nameResolver;
        this.f34034b = metadataVersion;
        this.f34035c = classSource;
        List listI = proto.I();
        AbstractC2855l.f(listI, "getClass_List(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(listI, 10)), 16));
        for (Object obj : listI) {
            linkedHashMap.put(AbstractC3638L.a(this.f34033a, ((f8.c) obj).E0()), obj);
        }
        this.f34036d = linkedHashMap;
    }

    @Override // y8.InterfaceC3648j
    public C3647i a(k8.b classId) {
        AbstractC2855l.g(classId, "classId");
        f8.c cVar = (f8.c) this.f34036d.get(classId);
        if (cVar == null) {
            return null;
        }
        return new C3647i(this.f34033a, cVar, this.f34034b, (h0) this.f34035c.invoke(classId));
    }

    public final Collection b() {
        return this.f34036d.keySet();
    }
}
