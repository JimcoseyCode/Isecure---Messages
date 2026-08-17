package K7;

import L7.H;
import L7.M;
import T7.c;
import d8.InterfaceC2374v;
import j7.AbstractC2800q;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u8.InterfaceC3407a;
import y8.AbstractC3641c;
import y8.C3644f;
import y8.C3652n;
import y8.C3655q;
import y8.C3663z;
import y8.InterfaceC3628B;
import y8.InterfaceC3651m;
import y8.InterfaceC3653o;
import y8.InterfaceC3660w;
import y8.InterfaceC3661x;
import z8.C3692a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractC3641c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f7191f = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(B8.n storageManager, InterfaceC2374v finder, H moduleDescriptor, M notFoundClasses, N7.a additionalClassPartsProvider, N7.c platformDependentDeclarationFilter, InterfaceC3653o deserializationConfiguration, D8.p kotlinTypeChecker, InterfaceC3407a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(finder, "finder");
        AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        AbstractC2855l.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC2855l.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC2855l.g(deserializationConfiguration, "deserializationConfiguration");
        AbstractC2855l.g(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC2855l.g(samConversionResolver, "samConversionResolver");
        C3655q c3655q = new C3655q(this);
        C3692a c3692a = C3692a.f34292r;
        C3644f c3644f = new C3644f(moduleDescriptor, notFoundClasses, c3692a);
        InterfaceC3628B.a aVar = InterfaceC3628B.a.f34003a;
        InterfaceC3660w DO_NOTHING = InterfaceC3660w.f34149a;
        AbstractC2855l.f(DO_NOTHING, "DO_NOTHING");
        k(new C3652n(storageManager, moduleDescriptor, deserializationConfiguration, c3655q, c3644f, this, aVar, DO_NOTHING, c.a.f10620a, InterfaceC3661x.a.f34150a, AbstractC2800q.m(new J7.a(storageManager, moduleDescriptor), new g(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, InterfaceC3651m.f34104a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c3692a.e(), kotlinTypeChecker, samConversionResolver, null, C3663z.f34157a, 262144, null));
    }

    @Override // y8.AbstractC3641c
    protected y8.r e(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        InputStream inputStreamB = h().b(fqName);
        if (inputStreamB != null) {
            return z8.c.f34294u.a(fqName, j(), i(), inputStreamB, false);
        }
        return null;
    }
}
