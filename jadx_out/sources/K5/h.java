package K5;

import android.content.Context;
import q5.C3119c;
import q5.InterfaceC3120d;
import q5.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        String a(Object obj);
    }

    public static C3119c b(String str, String str2) {
        return C3119c.l(f.a(str, str2), f.class);
    }

    public static C3119c c(final String str, final a aVar) {
        return C3119c.m(f.class).b(q.j(Context.class)).e(new q5.g() { // from class: K5.g
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return f.a(str, aVar.a((Context) interfaceC3120d.a(Context.class)));
            }
        }).d();
    }
}
