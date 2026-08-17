package F;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: F.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0506s {

    /* JADX INFO: renamed from: F.s$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f1684a = new ArrayList();

        a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                if (!(rVar instanceof b)) {
                    this.f1684a.add(rVar);
                }
            }
        }

        @Override // F.r
        public void a(int i10) {
            Iterator it = this.f1684a.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a(i10);
            }
        }

        @Override // F.r
        public void b(int i10, B b10) {
            Iterator it = this.f1684a.iterator();
            while (it.hasNext()) {
                ((r) it.next()).b(i10, b10);
            }
        }

        @Override // F.r
        public void c(int i10, C0508t c0508t) {
            Iterator it = this.f1684a.iterator();
            while (it.hasNext()) {
                ((r) it.next()).c(i10, c0508t);
            }
        }

        @Override // F.r
        public void d(int i10) {
            Iterator it = this.f1684a.iterator();
            while (it.hasNext()) {
                ((r) it.next()).d(i10);
            }
        }

        public List e() {
            return this.f1684a;
        }
    }

    static r a(List list) {
        return list.isEmpty() ? c() : list.size() == 1 ? (r) list.get(0) : new a(list);
    }

    public static r b(r... rVarArr) {
        return a(Arrays.asList(rVarArr));
    }

    public static r c() {
        return new b();
    }

    /* JADX INFO: renamed from: F.s$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends r {
        b() {
        }

        @Override // F.r
        public void d(int i10) {
        }

        @Override // F.r
        public void b(int i10, B b10) {
        }

        @Override // F.r
        public void c(int i10, C0508t c0508t) {
        }
    }
}
