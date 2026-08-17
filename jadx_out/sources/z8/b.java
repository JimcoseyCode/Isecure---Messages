package z8;

import B8.n;
import C7.f;
import I7.o;
import L7.H;
import L7.M;
import L7.O;
import L7.S;
import T7.c;
import j7.AbstractC2800q;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import u8.C3408b;
import y8.C3644f;
import y8.C3652n;
import y8.C3655q;
import y8.InterfaceC3628B;
import y8.InterfaceC3651m;
import y8.InterfaceC3653o;
import y8.InterfaceC3660w;
import y8.InterfaceC3661x;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements I7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f34293b = new d();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2852i implements Function1 {
        a(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final f getOwner() {
            return D.b(d.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p02) {
            AbstractC2855l.g(p02, "p0");
            return ((d) this.receiver).a(p02);
        }
    }

    @Override // I7.b
    public O a(n storageManager, H builtInsModule, Iterable classDescriptorFactories, N7.c platformDependentDeclarationFilter, N7.a additionalClassPartsProvider, boolean z10) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(builtInsModule, "builtInsModule");
        AbstractC2855l.g(classDescriptorFactories, "classDescriptorFactories");
        AbstractC2855l.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC2855l.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, o.f5115H, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z10, new a(this.f34293b));
    }

    public final O b(n nVar, H h10, Set packageFqNames, Iterable classDescriptorFactories, N7.c platformDependentDeclarationFilter, N7.a additionalClassPartsProvider, boolean z10, Function1 loadResource) {
        n storageManager = nVar;
        H module = h10;
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(packageFqNames, "packageFqNames");
        AbstractC2855l.g(classDescriptorFactories, "classDescriptorFactories");
        AbstractC2855l.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC2855l.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC2855l.g(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(packageFqNames, 10));
        Iterator it = packageFqNames.iterator();
        while (it.hasNext()) {
            k8.c cVar = (k8.c) it.next();
            String strR = C3692a.f34292r.r(cVar);
            InputStream inputStream = (InputStream) loadResource.invoke(strR);
            if (inputStream == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strR);
            }
            H h11 = module;
            storageManager = nVar;
            module = h11;
            arrayList.add(c.f34294u.a(cVar, nVar, h11, inputStream, z10));
        }
        S s10 = new S(arrayList);
        M m10 = new M(storageManager, module);
        InterfaceC3653o.a aVar = InterfaceC3653o.a.f34128a;
        C3655q c3655q = new C3655q(s10);
        C3692a c3692a = C3692a.f34292r;
        C3644f c3644f = new C3644f(module, m10, c3692a);
        InterfaceC3628B.a aVar2 = InterfaceC3628B.a.f34003a;
        InterfaceC3660w DO_NOTHING = InterfaceC3660w.f34149a;
        AbstractC2855l.f(DO_NOTHING, "DO_NOTHING");
        C3652n c3652n = new C3652n(storageManager, h10, aVar, c3655q, c3644f, s10, aVar2, DO_NOTHING, c.a.f10620a, InterfaceC3661x.a.f34150a, classDescriptorFactories, m10, InterfaceC3651m.f34104a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c3692a.e(), null, new C3408b(storageManager, AbstractC2800q.j()), null, null, 851968, null);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).I0(c3652n);
        }
        return s10;
    }
}
