package d8;

import K7.k;
import L7.M;
import N7.a;
import N7.c;
import O7.C1333l;
import U7.InterfaceC1492u;
import a8.InterfaceC1600b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import d8.InterfaceC2346D;
import j7.AbstractC2800q;
import j8.C2810e;
import j8.C2814i;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t8.C3380c;
import u8.C3408b;
import y8.C3652n;
import y8.C3663z;
import y8.InterfaceC3628B;
import y8.InterfaceC3651m;
import y8.InterfaceC3653o;
import y8.InterfaceC3660w;

/* JADX INFO: renamed from: d8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2363k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25755b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3652n f25756a;

    /* JADX INFO: renamed from: d8.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: d8.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0251a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C2363k f25757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C2366n f25758b;

            public C0251a(C2363k deserializationComponentsForJava, C2366n deserializedDescriptorResolver) {
                AbstractC2855l.g(deserializationComponentsForJava, "deserializationComponentsForJava");
                AbstractC2855l.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f25757a = deserializationComponentsForJava;
                this.f25758b = deserializedDescriptorResolver;
            }

            public final C2363k a() {
                return this.f25757a;
            }

            public final C2366n b() {
                return this.f25758b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0251a a(InterfaceC2374v kotlinClassFinder, InterfaceC2374v jvmBuiltInsKotlinClassFinder, InterfaceC1492u javaClassFinder, String moduleName, InterfaceC3660w errorReporter, InterfaceC1600b javaSourceElementFactory) {
            AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
            AbstractC2855l.g(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            AbstractC2855l.g(javaClassFinder, "javaClassFinder");
            AbstractC2855l.g(moduleName, "moduleName");
            AbstractC2855l.g(errorReporter, "errorReporter");
            AbstractC2855l.g(javaSourceElementFactory, "javaSourceElementFactory");
            B8.f fVar = new B8.f("DeserializationComponentsForJava.ModuleData");
            K7.k kVar = new K7.k(fVar, k.a.f7151g);
            k8.f fVarT = k8.f.t('<' + moduleName + '>');
            AbstractC2855l.f(fVarT, "special(...)");
            O7.F f10 = new O7.F(fVarT, fVar, kVar, null, null, null, 56, null);
            kVar.E0(f10);
            kVar.M0(f10, true);
            C2366n c2366n = new C2366n();
            X7.o oVar = new X7.o();
            M m10 = new M(fVar, f10);
            X7.j jVarB = AbstractC2364l.b(javaClassFinder, f10, fVar, m10, kotlinClassFinder, c2366n, errorReporter, javaSourceElementFactory, oVar, (IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? InterfaceC2346D.a.f25680a : null);
            C2363k c2363kA = AbstractC2364l.a(f10, fVar, m10, jVarB, kotlinClassFinder, c2366n, errorReporter, C2810e.f28943i);
            c2366n.o(c2363kA);
            V7.j EMPTY = V7.j.f11830a;
            AbstractC2855l.f(EMPTY, "EMPTY");
            C3380c c3380c = new C3380c(jVarB, EMPTY);
            oVar.c(c3380c);
            K7.w wVar = new K7.w(fVar, jvmBuiltInsKotlinClassFinder, f10, m10, kVar.L0(), kVar.L0(), InterfaceC3653o.a.f34128a, D8.p.f839b.a(), new C3408b(fVar, AbstractC2800q.j()));
            f10.T0(f10);
            f10.L0(new C1333l(AbstractC2800q.m(c3380c.a(), wVar), "CompositeProvider@RuntimeModuleData for " + f10));
            return new C0251a(c2363kA, c2366n);
        }

        private a() {
        }
    }

    public C2363k(B8.n storageManager, L7.H moduleDescriptor, InterfaceC3653o configuration, C2367o classDataFinder, C2360h annotationAndConstantLoader, X7.j packageFragmentProvider, M notFoundClasses, InterfaceC3660w errorReporter, T7.c lookupTracker, InterfaceC3651m contractDeserializer, D8.p kotlinTypeChecker, F8.a typeAttributeTranslators) {
        N7.c cVarL0;
        N7.a aVarL0;
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
        AbstractC2855l.g(configuration, "configuration");
        AbstractC2855l.g(classDataFinder, "classDataFinder");
        AbstractC2855l.g(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC2855l.g(packageFragmentProvider, "packageFragmentProvider");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        AbstractC2855l.g(errorReporter, "errorReporter");
        AbstractC2855l.g(lookupTracker, "lookupTracker");
        AbstractC2855l.g(contractDeserializer, "contractDeserializer");
        AbstractC2855l.g(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC2855l.g(typeAttributeTranslators, "typeAttributeTranslators");
        I7.i iVarN = moduleDescriptor.n();
        K7.k kVar = iVarN instanceof K7.k ? (K7.k) iVarN : null;
        this.f25756a = new C3652n(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, InterfaceC3628B.a.f34003a, errorReporter, lookupTracker, C2368p.f25769a, AbstractC2800q.j(), notFoundClasses, contractDeserializer, (kVar == null || (aVarL0 = kVar.L0()) == null) ? a.C0085a.f8152a : aVarL0, (kVar == null || (cVarL0 = kVar.L0()) == null) ? c.b.f8154a : cVarL0, C2814i.f28956a.a(), kotlinTypeChecker, new C3408b(storageManager, AbstractC2800q.j()), typeAttributeTranslators.a(), C3663z.f34157a);
    }

    public final C3652n a() {
        return this.f25756a;
    }
}
