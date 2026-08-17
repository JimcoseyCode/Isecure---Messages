package O7;

import C8.E0;
import L7.InterfaceC1280e;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z implements InterfaceC1280e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f8569g = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC3442k a(InterfaceC1280e interfaceC1280e, E0 typeSubstitution, D8.g kotlinTypeRefiner) {
            InterfaceC3442k interfaceC3442kG;
            AbstractC2855l.g(interfaceC1280e, "<this>");
            AbstractC2855l.g(typeSubstitution, "typeSubstitution");
            AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC1280e instanceof z ? (z) interfaceC1280e : null;
            if (zVar != null && (interfaceC3442kG = zVar.G(typeSubstitution, kotlinTypeRefiner)) != null) {
                return interfaceC3442kG;
            }
            InterfaceC3442k interfaceC3442kN0 = interfaceC1280e.n0(typeSubstitution);
            AbstractC2855l.f(interfaceC3442kN0, "getMemberScope(...)");
            return interfaceC3442kN0;
        }

        public final InterfaceC3442k b(InterfaceC1280e interfaceC1280e, D8.g kotlinTypeRefiner) {
            InterfaceC3442k interfaceC3442kL;
            AbstractC2855l.g(interfaceC1280e, "<this>");
            AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC1280e instanceof z ? (z) interfaceC1280e : null;
            if (zVar != null && (interfaceC3442kL = zVar.L(kotlinTypeRefiner)) != null) {
                return interfaceC3442kL;
            }
            InterfaceC3442k interfaceC3442kA0 = interfaceC1280e.A0();
            AbstractC2855l.f(interfaceC3442kA0, "getUnsubstitutedMemberScope(...)");
            return interfaceC3442kA0;
        }

        private a() {
        }
    }

    protected abstract InterfaceC3442k G(E0 e02, D8.g gVar);

    protected abstract InterfaceC3442k L(D8.g gVar);
}
