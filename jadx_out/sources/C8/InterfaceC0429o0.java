package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0429o0 {

    /* JADX INFO: renamed from: C8.o0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC0429o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f674a = new a();

        private a() {
        }

        @Override // C8.InterfaceC0429o0
        public void a(M7.c annotation) {
            AbstractC2855l.g(annotation, "annotation");
        }

        @Override // C8.InterfaceC0429o0
        public void b(L7.l0 typeAlias, L7.m0 m0Var, S substitutedArgument) {
            AbstractC2855l.g(typeAlias, "typeAlias");
            AbstractC2855l.g(substitutedArgument, "substitutedArgument");
        }

        @Override // C8.InterfaceC0429o0
        public void c(L7.l0 typeAlias) {
            AbstractC2855l.g(typeAlias, "typeAlias");
        }

        @Override // C8.InterfaceC0429o0
        public void d(G0 substitutor, S unsubstitutedArgument, S argument, L7.m0 typeParameter) {
            AbstractC2855l.g(substitutor, "substitutor");
            AbstractC2855l.g(unsubstitutedArgument, "unsubstitutedArgument");
            AbstractC2855l.g(argument, "argument");
            AbstractC2855l.g(typeParameter, "typeParameter");
        }
    }

    void a(M7.c cVar);

    void b(L7.l0 l0Var, L7.m0 m0Var, S s10);

    void c(L7.l0 l0Var);

    void d(G0 g02, S s10, S s11, L7.m0 m0Var);
}
