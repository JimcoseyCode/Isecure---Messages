package H4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class N implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5.b f3751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5.b f3752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f3753c;

    public N(Context context, E e10) {
        this.f3753c = e10;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f20905g;
        W3.t.f(context);
        final U3.i iVarG = W3.t.c().g(aVar);
        if (aVar.a().contains(U3.c.b("json"))) {
            this.f3751a = new q5.w(new C5.b() { // from class: H4.K
                @Override // C5.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, U3.c.b("json"), new U3.g() { // from class: H4.M
                        @Override // U3.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f3752b = new q5.w(new C5.b() { // from class: H4.L
            @Override // C5.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, U3.c.b("proto"), new U3.g() { // from class: H4.J
                    @Override // U3.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
