package I4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class F9 implements InterfaceC0960n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5.b f4104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5.b f4105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC0982p9 f4106c;

    public F9(Context context, AbstractC0982p9 abstractC0982p9) {
        this.f4106c = abstractC0982p9;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f20905g;
        W3.t.f(context);
        final U3.i iVarG = W3.t.c().g(aVar);
        if (aVar.a().contains(U3.c.b("json"))) {
            this.f4104a = new q5.w(new C5.b() { // from class: I4.C9
                @Override // C5.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, U3.c.b("json"), new U3.g() { // from class: I4.E9
                        @Override // U3.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f4105b = new q5.w(new C5.b() { // from class: I4.D9
            @Override // C5.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, U3.c.b("proto"), new U3.g() { // from class: I4.B9
                    @Override // U3.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static U3.d b(AbstractC0982p9 abstractC0982p9, InterfaceC0949m9 interfaceC0949m9) {
        int iA = abstractC0982p9.a();
        return interfaceC0949m9.zza() != 0 ? U3.d.e(interfaceC0949m9.d(iA, false)) : U3.d.g(interfaceC0949m9.d(iA, false));
    }

    @Override // I4.InterfaceC0960n9
    public final void a(InterfaceC0949m9 interfaceC0949m9) {
        if (this.f4106c.a() != 0) {
            ((U3.h) this.f4105b.get()).a(b(this.f4106c, interfaceC0949m9));
            return;
        }
        C5.b bVar = this.f4104a;
        if (bVar != null) {
            ((U3.h) bVar.get()).a(b(this.f4106c, interfaceC0949m9));
        }
    }
}
