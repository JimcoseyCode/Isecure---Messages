package J4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class D5 implements InterfaceC1210q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5.b f5476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5.b f5477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1223s5 f5478c;

    public D5(Context context, AbstractC1223s5 abstractC1223s5) {
        this.f5478c = abstractC1223s5;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f20905g;
        W3.t.f(context);
        final U3.i iVarG = W3.t.c().g(aVar);
        if (aVar.a().contains(U3.c.b("json"))) {
            this.f5476a = new q5.w(new C5.b() { // from class: J4.A5
                @Override // C5.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, U3.c.b("json"), new U3.g() { // from class: J4.C5
                        @Override // U3.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f5477b = new q5.w(new C5.b() { // from class: J4.B5
            @Override // C5.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, U3.c.b("proto"), new U3.g() { // from class: J4.z5
                    @Override // U3.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static U3.d b(AbstractC1223s5 abstractC1223s5, InterfaceC1203p5 interfaceC1203p5) {
        return U3.d.g(interfaceC1203p5.b(abstractC1223s5.a(), false));
    }

    @Override // J4.InterfaceC1210q5
    public final void a(InterfaceC1203p5 interfaceC1203p5) {
        if (this.f5478c.a() != 0) {
            ((U3.h) this.f5477b.get()).a(b(this.f5478c, interfaceC1203p5));
            return;
        }
        C5.b bVar = this.f5476a;
        if (bVar != null) {
            ((U3.h) bVar.get()).a(b(this.f5478c, interfaceC1203p5));
        }
    }
}
