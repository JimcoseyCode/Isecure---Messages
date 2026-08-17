package K7;

import I7.o;
import L7.E;
import L7.EnumC1281f;
import L7.H;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.h0;
import O7.C1332k;
import j7.AbstractC2800q;
import j7.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k8.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements N7.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k8.f f7137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k8.b f7138h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f7139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f7140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.i f7141c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f7135e = {D.k(new kotlin.jvm.internal.v(D.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7134d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k8.c f7136f = I7.o.f5108A;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k8.b a() {
            return g.f7138h;
        }

        private a() {
        }
    }

    static {
        k8.d dVar = o.a.f5189d;
        k8.f fVarI = dVar.i();
        AbstractC2855l.f(fVarI, "shortName(...)");
        f7137g = fVarI;
        b.a aVar = k8.b.f29200d;
        k8.c cVarL = dVar.l();
        AbstractC2855l.f(cVarL, "toSafe(...)");
        f7138h = aVar.c(cVarL);
    }

    public g(B8.n storageManager, H moduleDescriptor, Function1 computeContainingDeclaration) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
        AbstractC2855l.g(computeContainingDeclaration, "computeContainingDeclaration");
        this.f7139a = moduleDescriptor;
        this.f7140b = computeContainingDeclaration;
        this.f7141c = storageManager.e(new e(this, storageManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I7.c d(H module) {
        AbstractC2855l.g(module, "module");
        List listH = module.e0(f7136f).H();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (obj instanceof I7.c) {
                arrayList.add(obj);
            }
        }
        return (I7.c) AbstractC2800q.e0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1332k h(g gVar, B8.n nVar) {
        C1332k c1332k = new C1332k((InterfaceC1288m) gVar.f7140b.invoke(gVar.f7139a), f7137g, E.f7286k, EnumC1281f.f7321i, AbstractC2800q.e(gVar.f7139a.n().i()), h0.f7335a, false, nVar);
        c1332k.H0(new K7.a(nVar, c1332k), T.e(), null);
        return c1332k;
    }

    private final C1332k i() {
        return (C1332k) B8.m.a(this.f7141c, this, f7135e[0]);
    }

    @Override // N7.b
    public Collection a(k8.c packageFqName) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        return AbstractC2855l.b(packageFqName, f7136f) ? T.d(i()) : T.e();
    }

    @Override // N7.b
    public boolean b(k8.c packageFqName, k8.f name) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        AbstractC2855l.g(name, "name");
        return AbstractC2855l.b(name, f7137g) && AbstractC2855l.b(packageFqName, f7136f);
    }

    @Override // N7.b
    public InterfaceC1280e c(k8.b classId) {
        AbstractC2855l.g(classId, "classId");
        if (AbstractC2855l.b(classId, f7138h)) {
            return i();
        }
        return null;
    }

    public /* synthetic */ g(B8.n nVar, H h10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, h10, (i10 & 4) != 0 ? f.f7133g : function1);
    }
}
