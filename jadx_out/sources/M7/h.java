package M7;

import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface h extends Iterable, InterfaceC3550a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7570a = a.f7571a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f7571a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final h f7572b = new C0070a();

        /* JADX INFO: renamed from: M7.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0070a implements h {
            C0070a() {
            }

            @Override // M7.h
            public /* bridge */ /* synthetic */ c b(k8.c cVar) {
                return (c) d(cVar);
            }

            public Void d(k8.c fqName) {
                AbstractC2855l.g(fqName, "fqName");
                return null;
            }

            @Override // M7.h
            public boolean h(k8.c cVar) {
                return b.b(this, cVar);
            }

            @Override // M7.h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return AbstractC2800q.j().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final h a(List annotations) {
            AbstractC2855l.g(annotations, "annotations");
            return annotations.isEmpty() ? f7572b : new i(annotations);
        }

        public final h b() {
            return f7572b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public static c a(h hVar, k8.c fqName) {
            Object next;
            AbstractC2855l.g(fqName, "fqName");
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC2855l.b(((c) next).d(), fqName)) {
                    break;
                }
            }
            return (c) next;
        }

        public static boolean b(h hVar, k8.c fqName) {
            AbstractC2855l.g(fqName, "fqName");
            return hVar.b(fqName) != null;
        }
    }

    c b(k8.c cVar);

    boolean h(k8.c cVar);

    boolean isEmpty();
}
