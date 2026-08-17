package y8;

import A8.InterfaceC0398s;
import L7.h0;
import h8.AbstractC2708a;
import h8.C2711d;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: y8.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3658u extends r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC2708a f34142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC0398s f34143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C2711d f34144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final M f34145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private f8.m f34146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InterfaceC3442k f34147s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3658u(k8.c fqName, B8.n storageManager, L7.H module, f8.m proto, AbstractC2708a metadataVersion, InterfaceC0398s interfaceC0398s) {
        super(fqName, storageManager, module);
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        this.f34142n = metadataVersion;
        this.f34143o = interfaceC0398s;
        f8.p pVarN = proto.N();
        AbstractC2855l.f(pVarN, "getStrings(...)");
        f8.o oVarM = proto.M();
        AbstractC2855l.f(oVarM, "getQualifiedNames(...)");
        C2711d c2711d = new C2711d(pVarN, oVarM);
        this.f34144p = c2711d;
        this.f34145q = new M(proto, c2711d, metadataVersion, new C3656s(this));
        this.f34146r = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 L0(AbstractC3658u abstractC3658u, k8.b it) {
        AbstractC2855l.g(it, "it");
        InterfaceC0398s interfaceC0398s = abstractC3658u.f34143o;
        if (interfaceC0398s != null) {
            return interfaceC0398s;
        }
        h0 NO_SOURCE = h0.f7335a;
        AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection N0(AbstractC3658u abstractC3658u) {
        Collection collectionB = abstractC3658u.C0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            k8.b bVar = (k8.b) obj;
            if (!bVar.j() && !C3650l.f34098c.a().contains(bVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((k8.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // y8.r
    public void I0(C3652n components) {
        AbstractC2855l.g(components, "components");
        f8.m mVar = this.f34146r;
        if (mVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f34146r = null;
        f8.l lVarL = mVar.L();
        AbstractC2855l.f(lVarL, "getPackage(...)");
        this.f34147s = new A8.M(this, lVarL, this.f34144p, this.f34142n, this.f34143o, components, "scope of " + this, new C3657t(this));
    }

    @Override // y8.r
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public M C0() {
        return this.f34145q;
    }

    @Override // L7.N
    public InterfaceC3442k o() {
        InterfaceC3442k interfaceC3442k = this.f34147s;
        if (interfaceC3442k != null) {
            return interfaceC3442k;
        }
        AbstractC2855l.y("_memberScope");
        return null;
    }
}
