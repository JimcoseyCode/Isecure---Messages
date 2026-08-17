package J1;

import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1770q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class k implements j, InterfaceC1770q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f5335g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC1764k f5336h;

    k(AbstractC1764k abstractC1764k) {
        this.f5336h = abstractC1764k;
        abstractC1764k.a(this);
    }

    @Override // J1.j
    public void a(l lVar) {
        this.f5335g.remove(lVar);
    }

    @Override // J1.j
    public void b(l lVar) {
        this.f5335g.add(lVar);
        if (this.f5336h.b() == AbstractC1764k.b.f17590g) {
            lVar.onDestroy();
        } else if (this.f5336h.b().j(AbstractC1764k.b.f17593j)) {
            lVar.onStart();
        } else {
            lVar.onStop();
        }
    }

    @C(AbstractC1764k.a.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.r rVar) {
        Iterator it = Q1.l.k(this.f5335g).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
        rVar.getLifecycle().d(this);
    }

    @C(AbstractC1764k.a.ON_START)
    public void onStart(androidx.lifecycle.r rVar) {
        Iterator it = Q1.l.k(this.f5335g).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @C(AbstractC1764k.a.ON_STOP)
    public void onStop(androidx.lifecycle.r rVar) {
        Iterator it = Q1.l.k(this.f5335g).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }
}
