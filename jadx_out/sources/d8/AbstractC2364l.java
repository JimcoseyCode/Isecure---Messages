package d8;

import C8.C0437x;
import L7.M;
import L7.k0;
import T7.c;
import U7.C1476d;
import U7.D;
import U7.InterfaceC1492u;
import U7.InterfaceC1493v;
import V7.i;
import X7.e;
import a8.InterfaceC1600b;
import c8.C1902e0;
import c8.C1905g;
import j7.AbstractC2800q;
import j8.C2810e;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import u8.C3408b;
import y8.InterfaceC3651m;
import y8.InterfaceC3653o;
import y8.InterfaceC3660w;

/* JADX INFO: renamed from: d8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2364l {

    /* JADX INFO: renamed from: d8.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements U7.A {
        a() {
        }

        @Override // U7.A
        public List a(k8.b classId) {
            AbstractC2855l.g(classId, "classId");
            return null;
        }
    }

    public static final C2363k a(L7.H module, B8.n storageManager, M notFoundClasses, X7.j lazyJavaPackageFragmentProvider, InterfaceC2374v reflectKotlinClassFinder, C2366n deserializedDescriptorResolver, InterfaceC3660w errorReporter, C2810e jvmMetadataVersion) {
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        AbstractC2855l.g(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        AbstractC2855l.g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC2855l.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC2855l.g(errorReporter, "errorReporter");
        AbstractC2855l.g(jvmMetadataVersion, "jvmMetadataVersion");
        return new C2363k(storageManager, module, InterfaceC3653o.a.f34128a, new C2367o(reflectKotlinClassFinder, deserializedDescriptorResolver), AbstractC2361i.a(module, notFoundClasses, storageManager, reflectKotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, c.a.f10620a, InterfaceC3651m.f34104a.a(), D8.p.f839b.a(), new F8.a(AbstractC2800q.e(C0437x.f713a)));
    }

    public static final X7.j b(InterfaceC1492u javaClassFinder, L7.H module, B8.n storageManager, M notFoundClasses, InterfaceC2374v reflectKotlinClassFinder, C2366n deserializedDescriptorResolver, InterfaceC3660w errorReporter, InterfaceC1600b javaSourceElementFactory, X7.n singleModuleClassResolver, InterfaceC2346D packagePartProvider) {
        AbstractC2855l.g(javaClassFinder, "javaClassFinder");
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        AbstractC2855l.g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC2855l.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC2855l.g(errorReporter, "errorReporter");
        AbstractC2855l.g(javaSourceElementFactory, "javaSourceElementFactory");
        AbstractC2855l.g(singleModuleClassResolver, "singleModuleClassResolver");
        AbstractC2855l.g(packagePartProvider, "packagePartProvider");
        V7.o DO_NOTHING = V7.o.f11837a;
        AbstractC2855l.f(DO_NOTHING, "DO_NOTHING");
        V7.j EMPTY = V7.j.f11830a;
        AbstractC2855l.f(EMPTY, "EMPTY");
        i.a aVar = i.a.f11829a;
        C3408b c3408b = new C3408b(storageManager, AbstractC2800q.j());
        k0.a aVar2 = k0.a.f7338a;
        c.a aVar3 = c.a.f10620a;
        I7.n nVar = new I7.n(module, notFoundClasses);
        D.b bVar = U7.D.f11378d;
        C1476d c1476d = new C1476d(bVar.a());
        e.a aVar4 = e.a.f12531a;
        return new X7.j(new X7.d(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, c3408b, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, nVar, c1476d, new C1902e0(new C1905g(aVar4)), InterfaceC1493v.a.f11530a, aVar4, D8.p.f839b.a(), bVar.a(), new a(), null, 8388608, null));
    }
}
