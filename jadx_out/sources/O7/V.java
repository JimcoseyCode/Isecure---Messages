package O7;

import C8.G0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.h0;
import L7.t0;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class V extends X implements t0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f8420r = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f8421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f8422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f8423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f8424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C8.S f8425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final t0 f8426q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V a(InterfaceC1276a containingDeclaration, t0 t0Var, int i10, M7.h annotations, k8.f name, C8.S outType, boolean z10, boolean z11, boolean z12, C8.S s10, h0 source, InterfaceC3487a interfaceC3487a) {
            AbstractC2855l.g(containingDeclaration, "containingDeclaration");
            AbstractC2855l.g(annotations, "annotations");
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(outType, "outType");
            AbstractC2855l.g(source, "source");
            return interfaceC3487a == null ? new V(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source) : new b(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source, interfaceC3487a);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends V {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Lazy f8427s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1276a containingDeclaration, t0 t0Var, int i10, M7.h annotations, k8.f name, C8.S outType, boolean z10, boolean z11, boolean z12, C8.S s10, h0 source, InterfaceC3487a destructuringVariables) {
            super(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source);
            AbstractC2855l.g(containingDeclaration, "containingDeclaration");
            AbstractC2855l.g(annotations, "annotations");
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(outType, "outType");
            AbstractC2855l.g(source, "source");
            AbstractC2855l.g(destructuringVariables, "destructuringVariables");
            this.f8427s = AbstractC2746i.b(destructuringVariables);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List L0(b bVar) {
            return bVar.M0();
        }

        public final List M0() {
            return (List) this.f8427s.getValue();
        }

        @Override // O7.V, L7.t0
        public t0 z(InterfaceC1276a newOwner, k8.f newName, int i10) {
            AbstractC2855l.g(newOwner, "newOwner");
            AbstractC2855l.g(newName, "newName");
            M7.h annotations = getAnnotations();
            AbstractC2855l.f(annotations, "<get-annotations>(...)");
            C8.S type = getType();
            AbstractC2855l.f(type, "getType(...)");
            boolean zQ0 = q0();
            boolean zX = X();
            boolean zV = V();
            C8.S sF0 = f0();
            h0 NO_SOURCE = h0.f7335a;
            AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i10, annotations, newName, type, zQ0, zX, zV, sF0, NO_SOURCE, new W(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC1276a containingDeclaration, t0 t0Var, int i10, M7.h annotations, k8.f name, C8.S outType, boolean z10, boolean z11, boolean z12, C8.S s10, h0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(outType, "outType");
        AbstractC2855l.g(source, "source");
        this.f8421l = i10;
        this.f8422m = z10;
        this.f8423n = z11;
        this.f8424o = z12;
        this.f8425p = s10;
        this.f8426q = t0Var == null ? this : t0Var;
    }

    public static final V H0(InterfaceC1276a interfaceC1276a, t0 t0Var, int i10, M7.h hVar, k8.f fVar, C8.S s10, boolean z10, boolean z11, boolean z12, C8.S s11, h0 h0Var, InterfaceC3487a interfaceC3487a) {
        return f8420r.a(interfaceC1276a, t0Var, i10, hVar, fVar, s10, z10, z11, z12, s11, h0Var, interfaceC3487a);
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o visitor, Object obj) {
        AbstractC2855l.g(visitor, "visitor");
        return visitor.a(this, obj);
    }

    public Void I0() {
        return null;
    }

    @Override // L7.j0
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public t0 c(G0 substitutor) {
        AbstractC2855l.g(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // L7.u0
    public /* bridge */ /* synthetic */ q8.g U() {
        return (q8.g) I0();
    }

    @Override // L7.t0
    public boolean V() {
        return this.f8424o;
    }

    @Override // L7.t0
    public boolean X() {
        return this.f8423n;
    }

    @Override // L7.u0
    public boolean d0() {
        return false;
    }

    @Override // L7.InterfaceC1276a
    public Collection e() {
        Collection collectionE = b().e();
        AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add((t0) ((InterfaceC1276a) it.next()).i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // L7.t0
    public C8.S f0() {
        return this.f8425p;
    }

    @Override // L7.t0
    public int getIndex() {
        return this.f8421l;
    }

    @Override // L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u LOCAL = AbstractC1294t.f7348f;
        AbstractC2855l.f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // L7.t0
    public boolean q0() {
        if (!this.f8422m) {
            return false;
        }
        InterfaceC1276a interfaceC1276aB = b();
        AbstractC2855l.e(interfaceC1276aB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((InterfaceC1277b) interfaceC1276aB).getKind().h();
    }

    @Override // L7.t0
    public t0 z(InterfaceC1276a newOwner, k8.f newName, int i10) {
        AbstractC2855l.g(newOwner, "newOwner");
        AbstractC2855l.g(newName, "newName");
        M7.h annotations = getAnnotations();
        AbstractC2855l.f(annotations, "<get-annotations>(...)");
        C8.S type = getType();
        AbstractC2855l.f(type, "getType(...)");
        boolean zQ0 = q0();
        boolean zX = X();
        boolean zV = V();
        C8.S sF0 = f0();
        h0 NO_SOURCE = h0.f7335a;
        AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
        return new V(newOwner, null, i10, annotations, newName, type, zQ0, zX, zV, sF0, NO_SOURCE);
    }

    @Override // O7.AbstractC1335n, L7.InterfaceC1288m
    public InterfaceC1276a b() {
        InterfaceC1288m interfaceC1288mB = super.b();
        AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC1276a) interfaceC1288mB;
    }

    @Override // O7.AbstractC1335n
    public t0 a() {
        t0 t0Var = this.f8426q;
        return t0Var == this ? this : t0Var.a();
    }
}
