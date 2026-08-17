package O7;

import C8.AbstractC0407d0;
import C8.J0;
import C8.M0;
import C8.v0;
import L7.AbstractC1295u;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.InterfaceC1291p;
import L7.h0;
import L7.l0;
import L7.m0;
import O7.T;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: O7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1328g extends AbstractC1335n implements l0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f8444p = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(AbstractC1328g.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final B8.n f8445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AbstractC1295u f8446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final B8.i f8447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f8448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f8449o;

    /* JADX INFO: renamed from: O7.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements v0 {
        a() {
        }

        @Override // C8.v0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 p() {
            return AbstractC1328g.this;
        }

        @Override // C8.v0
        public Collection g() {
            Collection collectionG = p().b0().K0().g();
            AbstractC2855l.f(collectionG, "getSupertypes(...)");
            return collectionG;
        }

        @Override // C8.v0
        public List getParameters() {
            return AbstractC1328g.this.O0();
        }

        @Override // C8.v0
        public I7.i n() {
            return AbstractC3340e.m(p());
        }

        @Override // C8.v0
        public v0 o(D8.g kotlinTypeRefiner) {
            AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // C8.v0
        public boolean q() {
            return true;
        }

        public String toString() {
            return "[typealias " + p().getName().j() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1328g(B8.n storageManager, InterfaceC1288m containingDeclaration, M7.h annotations, k8.f name, h0 sourceElement, AbstractC1295u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(sourceElement, "sourceElement");
        AbstractC2855l.g(visibilityImpl, "visibilityImpl");
        this.f8445k = storageManager;
        this.f8446l = visibilityImpl;
        this.f8447m = storageManager.e(new C1325d(this));
        this.f8449o = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 K0(AbstractC1328g abstractC1328g, D8.g gVar) {
        InterfaceC1283h interfaceC1283hF = gVar.f(abstractC1328g);
        if (interfaceC1283hF != null) {
            return interfaceC1283hF.r();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection L0(AbstractC1328g abstractC1328g) {
        return abstractC1328g.N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Boolean Q0(AbstractC1328g abstractC1328g, M0 m02) {
        boolean z10;
        AbstractC2855l.d(m02);
        if (!C8.W.a(m02)) {
            InterfaceC1283h interfaceC1283hP = m02.K0().p();
            z10 = (interfaceC1283hP instanceof m0) && !AbstractC2855l.b(((m0) interfaceC1283hP).b(), abstractC1328g);
        }
        return Boolean.valueOf(z10);
    }

    @Override // L7.D
    public boolean B0() {
        return false;
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o visitor, Object obj) {
        AbstractC2855l.g(visitor, "visitor");
        return visitor.j(this, obj);
    }

    @Override // L7.D
    public boolean J() {
        return false;
    }

    protected final AbstractC0407d0 J0() {
        InterfaceC3442k interfaceC3442kA0;
        InterfaceC1280e interfaceC1280eQ = q();
        if (interfaceC1280eQ == null || (interfaceC3442kA0 = interfaceC1280eQ.A0()) == null) {
            interfaceC3442kA0 = InterfaceC3442k.b.f32996b;
        }
        AbstractC0407d0 abstractC0407d0V = J0.v(this, interfaceC3442kA0, new C1327f(this));
        AbstractC2855l.f(abstractC0407d0V, "makeUnsubstitutedType(...)");
        return abstractC0407d0V;
    }

    @Override // L7.InterfaceC1284i
    public boolean K() {
        return J0.c(b0(), new C1326e(this));
    }

    @Override // O7.AbstractC1335n
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public l0 a() {
        InterfaceC1291p interfaceC1291pA = super.a();
        AbstractC2855l.e(interfaceC1291pA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (l0) interfaceC1291pA;
    }

    public final Collection N0() {
        InterfaceC1280e interfaceC1280eQ = q();
        if (interfaceC1280eQ == null) {
            return AbstractC2800q.j();
        }
        Collection<InterfaceC1279d> collectionF = interfaceC1280eQ.f();
        AbstractC2855l.f(collectionF, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1279d interfaceC1279d : collectionF) {
            T.a aVar = T.f8411O;
            B8.n nVar = this.f8445k;
            AbstractC2855l.d(interfaceC1279d);
            Q qB = aVar.b(nVar, this, interfaceC1279d);
            if (qB != null) {
                arrayList.add(qB);
            }
        }
        return arrayList;
    }

    protected abstract List O0();

    public final void P0(List declaredTypeParameters) {
        AbstractC2855l.g(declaredTypeParameters, "declaredTypeParameters");
        this.f8448n = declaredTypeParameters;
    }

    protected final B8.n c0() {
        return this.f8445k;
    }

    @Override // L7.D, L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        return this.f8446l;
    }

    @Override // L7.D
    public boolean isExternal() {
        return false;
    }

    @Override // L7.InterfaceC1283h
    public v0 j() {
        return this.f8449o;
    }

    @Override // L7.InterfaceC1284i
    public List t() {
        List list = this.f8448n;
        if (list != null) {
            return list;
        }
        AbstractC2855l.y("declaredTypeParametersImpl");
        return null;
    }

    @Override // O7.AbstractC1334m
    public String toString() {
        return "typealias " + getName().j();
    }
}
