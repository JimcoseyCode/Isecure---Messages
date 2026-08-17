package K5;

import java.util.Iterator;
import java.util.Set;
import q5.C3119c;
import q5.InterfaceC3120d;
import q5.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f7061b;

    c(Set set, d dVar) {
        this.f7060a = d(set);
        this.f7061b = dVar;
    }

    public static /* synthetic */ i b(InterfaceC3120d interfaceC3120d) {
        return new c(interfaceC3120d.g(f.class), d.a());
    }

    public static C3119c c() {
        return C3119c.c(i.class).b(q.m(f.class)).e(new q5.g() { // from class: K5.b
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return c.b(interfaceC3120d);
            }
        }).d();
    }

    private static String d(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // K5.i
    public String a() {
        if (this.f7061b.b().isEmpty()) {
            return this.f7060a;
        }
        return this.f7060a + ' ' + d(this.f7061b.b());
    }
}
