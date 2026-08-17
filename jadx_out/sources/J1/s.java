package J1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f5366g = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f5366g.clear();
    }

    public List b() {
        return Q1.l.k(this.f5366g);
    }

    public void c(N1.d dVar) {
        this.f5366g.add(dVar);
    }

    public void d(N1.d dVar) {
        this.f5366g.remove(dVar);
    }

    @Override // J1.l
    public void onDestroy() {
        Iterator it = Q1.l.k(this.f5366g).iterator();
        while (it.hasNext()) {
            ((N1.d) it.next()).onDestroy();
        }
    }

    @Override // J1.l
    public void onStart() {
        Iterator it = Q1.l.k(this.f5366g).iterator();
        while (it.hasNext()) {
            ((N1.d) it.next()).onStart();
        }
    }

    @Override // J1.l
    public void onStop() {
        Iterator it = Q1.l.k(this.f5366g).iterator();
        while (it.hasNext()) {
            ((N1.d) it.next()).onStop();
        }
    }
}
