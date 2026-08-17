package G4;

import android.content.Context;

/* JADX INFO: renamed from: G4.w6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0755w6 implements InterfaceC0628g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5.b f3437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5.b f3438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC0644i6 f3439c;

    public C0755w6(Context context, AbstractC0644i6 abstractC0644i6) {
        this.f3439c = abstractC0644i6;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f20905g;
        W3.t.f(context);
        final U3.i iVarG = W3.t.c().g(aVar);
        if (aVar.a().contains(U3.c.b("json"))) {
            this.f3437a = new q5.w(new C5.b() { // from class: G4.t6
                @Override // C5.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, U3.c.b("json"), new U3.g() { // from class: G4.v6
                        @Override // U3.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f3438b = new q5.w(new C5.b() { // from class: G4.u6
            @Override // C5.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, U3.c.b("proto"), new U3.g() { // from class: G4.s6
                    @Override // U3.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static U3.d b(AbstractC0644i6 abstractC0644i6, InterfaceC0620f6 interfaceC0620f6) {
        return U3.d.g(interfaceC0620f6.b(abstractC0644i6.a(), false));
    }

    @Override // G4.InterfaceC0628g6
    public final void a(InterfaceC0620f6 interfaceC0620f6) {
        if (this.f3439c.a() != 0) {
            ((U3.h) this.f3438b.get()).a(b(this.f3439c, interfaceC0620f6));
            return;
        }
        C5.b bVar = this.f3437a;
        if (bVar != null) {
            ((U3.h) bVar.get()).a(b(this.f3439c, interfaceC0620f6));
        }
    }
}
