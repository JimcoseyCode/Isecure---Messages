package y;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0 f33721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33723c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final List f33724d = Arrays.asList(1, 2, 4, 3, 7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private L0 f33725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f33726b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f33727c = new ArrayList();

        private void c() {
            Iterator it = this.f33727c.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        public a a(J0 j02) {
            this.f33726b.add(j02);
            return this;
        }

        public K0 b() {
            H0.g.b(!this.f33726b.isEmpty(), "UseCase must not be empty.");
            c();
            return new K0(this.f33725a, this.f33726b, this.f33727c);
        }
    }

    K0(L0 l02, List list, List list2) {
        this.f33721a = l02;
        this.f33722b = list;
        this.f33723c = list2;
    }

    public List a() {
        return this.f33723c;
    }

    public List b() {
        return this.f33722b;
    }

    public L0 c() {
        return this.f33721a;
    }
}
