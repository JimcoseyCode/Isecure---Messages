package B1;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q1.h f293a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends Q1.h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Q1.h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue f295d = Q1.l.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f298c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f295d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f298c = obj;
            this.f297b = i10;
            this.f296a = i11;
        }

        public void c() {
            Queue queue = f295d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f297b == bVar.f297b && this.f296a == bVar.f296a && this.f298c.equals(bVar.f298c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f296a * 31) + this.f297b) * 31) + this.f298c.hashCode();
        }
    }

    public m(long j10) {
        this.f293a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b bVarA = b.a(obj, i10, i11);
        Object objG = this.f293a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f293a.k(b.a(obj, i10, i11), obj2);
    }
}
