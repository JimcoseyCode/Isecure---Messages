package v8;

import L7.EnumC1281f;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.Z;
import L7.g0;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import o8.AbstractC3026h;

/* JADX INFO: renamed from: v8.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3448q extends AbstractC3443l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f32999f = {D.k(new kotlin.jvm.internal.v(D.b(C3448q.class), "functions", "getFunctions()Ljava/util/List;")), D.k(new kotlin.jvm.internal.v(D.b(C3448q.class), "properties", "getProperties()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1280e f33000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.i f33002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.i f33003e;

    public C3448q(B8.n storageManager, InterfaceC1280e containingClass, boolean z10) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(containingClass, "containingClass");
        this.f33000b = containingClass;
        this.f33001c = z10;
        containingClass.getKind();
        EnumC1281f enumC1281f = EnumC1281f.f7320h;
        this.f33002d = storageManager.e(new C3446o(this));
        this.f33003e = storageManager.e(new C3447p(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(C3448q c3448q) {
        return AbstractC2800q.m(AbstractC3026h.g(c3448q.f33000b), AbstractC3026h.h(c3448q.f33000b));
    }

    private final List n() {
        return (List) B8.m.a(this.f33002d, this, f32999f[0]);
    }

    private final List o() {
        return (List) B8.m.a(this.f33003e, this, f32999f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(C3448q c3448q) {
        return c3448q.f33001c ? AbstractC2800q.n(AbstractC3026h.f(c3448q.f33000b)) : AbstractC2800q.j();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        List listO = o();
        M8.k kVar = new M8.k();
        for (Object obj : listO) {
            if (AbstractC2855l.b(((Z) obj).getName(), name)) {
                kVar.add(obj);
            }
        }
        return kVar;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    public /* bridge */ /* synthetic */ InterfaceC1283h f(k8.f fVar, T7.b bVar) {
        return (InterfaceC1283h) k(fVar, bVar);
    }

    public Void k(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return null;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return AbstractC2800q.z0(n(), o());
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public M8.k b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        List listN = n();
        M8.k kVar = new M8.k();
        for (Object obj : listN) {
            if (AbstractC2855l.b(((g0) obj).getName(), name)) {
                kVar.add(obj);
            }
        }
        return kVar;
    }
}
