package d8;

import C8.S;
import L7.h0;
import d8.C2343A;
import d8.InterfaceC2376x;
import h8.AbstractC2709b;
import j8.C2814i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import q8.s;
import y8.EnumC3642d;
import y8.InterfaceC3643e;
import y8.N;

/* JADX INFO: renamed from: d8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2356d extends AbstractC2357e implements InterfaceC3643e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.g f25708c;

    /* JADX INFO: renamed from: d8.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC2376x.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f25710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2376x f25711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap f25712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap f25713e;

        /* JADX INFO: renamed from: d8.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public final class C0247a extends b implements InterfaceC2376x.e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f25714d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0247a(a aVar, C2343A signature) {
                super(aVar, signature);
                AbstractC2855l.g(signature, "signature");
                this.f25714d = aVar;
            }

            @Override // d8.InterfaceC2376x.e
            public InterfaceC2376x.a b(int i10, k8.b classId, h0 source) {
                AbstractC2855l.g(classId, "classId");
                AbstractC2855l.g(source, "source");
                C2343A c2343aE = C2343A.f25678b.e(d(), i10);
                List arrayList = (List) this.f25714d.f25710b.get(c2343aE);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f25714d.f25710b.put(c2343aE, arrayList);
                }
                return AbstractC2356d.this.y(classId, source, arrayList);
            }
        }

        /* JADX INFO: renamed from: d8.d$a$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public class b implements InterfaceC2376x.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C2343A f25715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ArrayList f25716b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f25717c;

            public b(a aVar, C2343A signature) {
                AbstractC2855l.g(signature, "signature");
                this.f25717c = aVar;
                this.f25715a = signature;
                this.f25716b = new ArrayList();
            }

            @Override // d8.InterfaceC2376x.c
            public void a() {
                if (this.f25716b.isEmpty()) {
                    return;
                }
                this.f25717c.f25710b.put(this.f25715a, this.f25716b);
            }

            @Override // d8.InterfaceC2376x.c
            public InterfaceC2376x.a c(k8.b classId, h0 source) {
                AbstractC2855l.g(classId, "classId");
                AbstractC2855l.g(source, "source");
                return AbstractC2356d.this.y(classId, source, this.f25716b);
            }

            protected final C2343A d() {
                return this.f25715a;
            }
        }

        a(HashMap map, InterfaceC2376x interfaceC2376x, HashMap map2, HashMap map3) {
            this.f25710b = map;
            this.f25711c = interfaceC2376x;
            this.f25712d = map2;
            this.f25713e = map3;
        }

        @Override // d8.InterfaceC2376x.d
        public InterfaceC2376x.e a(k8.f name, String desc) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(desc, "desc");
            C2343A.a aVar = C2343A.f25678b;
            String strJ = name.j();
            AbstractC2855l.f(strJ, "asString(...)");
            return new C0247a(this, aVar.d(strJ, desc));
        }

        @Override // d8.InterfaceC2376x.d
        public InterfaceC2376x.c b(k8.f name, String desc, Object obj) {
            Object objI;
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(desc, "desc");
            C2343A.a aVar = C2343A.f25678b;
            String strJ = name.j();
            AbstractC2855l.f(strJ, "asString(...)");
            C2343A c2343aA = aVar.a(strJ, desc);
            if (obj != null && (objI = AbstractC2356d.this.I(desc, obj)) != null) {
                this.f25713e.put(c2343aA, objI);
            }
            return new b(this, c2343aA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2356d(B8.n storageManager, InterfaceC2374v kotlinClassFinder) {
        super(kotlinClassFinder);
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
        this.f25708c = storageManager.h(new C2353a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(C2359g loadConstantFromProperty, C2343A it) {
        AbstractC2855l.g(loadConstantFromProperty, "$this$loadConstantFromProperty");
        AbstractC2855l.g(it, "it");
        return loadConstantFromProperty.b().get(it);
    }

    private final C2359g H(InterfaceC2376x interfaceC2376x) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        interfaceC2376x.b(new a(map, interfaceC2376x, map3, map2), r(interfaceC2376x));
        return new C2359g(map, map2, map3);
    }

    private final Object J(N n10, f8.n nVar, EnumC3642d enumC3642d, S s10, Function2 function2) {
        Object objInvoke;
        InterfaceC2376x interfaceC2376xP = p(n10, AbstractC2357e.f25718b.a(n10, true, true, AbstractC2709b.f28516B.d(nVar.Z()), C2814i.f(nVar), v(), u()));
        if (interfaceC2376xP == null) {
            return null;
        }
        C2343A c2343aS = s(nVar, n10.b(), n10.d(), enumC3642d, interfaceC2376xP.a().d().d(C2366n.f25760b.a()));
        if (c2343aS == null || (objInvoke = function2.invoke(this.f25708c.invoke(interfaceC2376xP), c2343aS)) == null) {
            return null;
        }
        return I7.s.d(s10) ? M(objInvoke) : objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(C2359g loadConstantFromProperty, C2343A it) {
        AbstractC2855l.g(loadConstantFromProperty, "$this$loadConstantFromProperty");
        AbstractC2855l.g(it, "it");
        return loadConstantFromProperty.c().get(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2359g L(AbstractC2356d abstractC2356d, InterfaceC2376x kotlinClass) {
        AbstractC2855l.g(kotlinClass, "kotlinClass");
        return abstractC2356d.H(kotlinClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d8.AbstractC2357e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C2359g q(InterfaceC2376x binaryClass) {
        AbstractC2855l.g(binaryClass, "binaryClass");
        return (C2359g) this.f25708c.invoke(binaryClass);
    }

    protected final boolean F(k8.b annotationClassId, Map arguments) {
        AbstractC2855l.g(annotationClassId, "annotationClassId");
        AbstractC2855l.g(arguments, "arguments");
        if (!AbstractC2855l.b(annotationClassId, H7.a.f3801a.a())) {
            return false;
        }
        Object obj = arguments.get(k8.f.q("value"));
        q8.s sVar = obj instanceof q8.s ? (q8.s) obj : null;
        if (sVar == null) {
            return false;
        }
        Object objB = sVar.b();
        s.b.C0350b c0350b = objB instanceof s.b.C0350b ? (s.b.C0350b) objB : null;
        if (c0350b == null) {
            return false;
        }
        return w(c0350b.b());
    }

    protected abstract Object I(String str, Object obj);

    protected abstract Object M(Object obj);

    @Override // y8.InterfaceC3643e
    public Object g(N container, f8.n proto, S expectedType) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(expectedType, "expectedType");
        return J(container, proto, EnumC3642d.PROPERTY, expectedType, C2355c.f25707g);
    }

    @Override // y8.InterfaceC3643e
    public Object l(N container, f8.n proto, S expectedType) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(expectedType, "expectedType");
        return J(container, proto, EnumC3642d.PROPERTY_GETTER, expectedType, C2354b.f25706g);
    }
}
