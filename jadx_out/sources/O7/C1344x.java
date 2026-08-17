package O7;

import L7.InterfaceC1290o;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import v8.C3433b;
import v8.C3440i;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: O7.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1344x extends AbstractC1334m implements L7.V {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f8555n = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C1344x.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C1344x.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F f8556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k8.c f8557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final B8.i f8558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final B8.i f8559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC3442k f8560m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344x(F module, k8.c fqName, B8.n storageManager) {
        super(M7.h.f7570a.b(), fqName.h());
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(storageManager, "storageManager");
        this.f8556i = module;
        this.f8557j = fqName;
        this.f8558k = storageManager.e(new C1341u(this));
        this.f8559l = storageManager.e(new C1342v(this));
        this.f8560m = new C3440i(storageManager, new C1343w(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I0(C1344x c1344x) {
        return L7.T.b(c1344x.r0().J0(), c1344x.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List J0(C1344x c1344x) {
        return L7.T.c(c1344x.r0().J0(), c1344x.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3442k N0(C1344x c1344x) {
        if (c1344x.isEmpty()) {
            return InterfaceC3442k.b.f32996b;
        }
        List listH = c1344x.H();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listH, 10));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(((L7.N) it.next()).o());
        }
        List listA0 = AbstractC2800q.A0(arrayList, new P(c1344x.r0(), c1344x.d()));
        return C3433b.f32949d.a("package view scope for " + c1344x.d() + " in " + c1344x.r0().getName(), listA0);
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o visitor, Object obj) {
        AbstractC2855l.g(visitor, "visitor");
        return visitor.b(this, obj);
    }

    @Override // L7.V
    public List H() {
        return (List) B8.m.a(this.f8558k, this, f8555n[0]);
    }

    @Override // L7.InterfaceC1288m
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public L7.V b() {
        if (d().d()) {
            return null;
        }
        F fR0 = r0();
        k8.c cVarE = d().e();
        AbstractC2855l.f(cVarE, "parent(...)");
        return fR0.e0(cVarE);
    }

    protected final boolean L0() {
        return ((Boolean) B8.m.a(this.f8559l, this, f8555n[1])).booleanValue();
    }

    @Override // L7.V
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public F r0() {
        return this.f8556i;
    }

    @Override // L7.V
    public k8.c d() {
        return this.f8557j;
    }

    public boolean equals(Object obj) {
        L7.V v10 = obj instanceof L7.V ? (L7.V) obj : null;
        return v10 != null && AbstractC2855l.b(d(), v10.d()) && AbstractC2855l.b(r0(), v10.r0());
    }

    public int hashCode() {
        return (r0().hashCode() * 31) + d().hashCode();
    }

    @Override // L7.V
    public boolean isEmpty() {
        return L0();
    }

    @Override // L7.V
    public InterfaceC3442k o() {
        return this.f8560m;
    }
}
