package J1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f5349a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f5350b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5351c;

    public boolean a(M1.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.f5349a.remove(cVar);
        if (!this.f5350b.remove(cVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = Q1.l.k(this.f5349a).iterator();
        while (it.hasNext()) {
            a((M1.c) it.next());
        }
        this.f5350b.clear();
    }

    public void c() {
        this.f5351c = true;
        for (M1.c cVar : Q1.l.k(this.f5349a)) {
            if (cVar.isRunning() || cVar.isComplete()) {
                cVar.clear();
                this.f5350b.add(cVar);
            }
        }
    }

    public void d() {
        this.f5351c = true;
        for (M1.c cVar : Q1.l.k(this.f5349a)) {
            if (cVar.isRunning()) {
                cVar.pause();
                this.f5350b.add(cVar);
            }
        }
    }

    public void e() {
        for (M1.c cVar : Q1.l.k(this.f5349a)) {
            if (!cVar.isComplete() && !cVar.isCleared()) {
                cVar.clear();
                if (this.f5351c) {
                    this.f5350b.add(cVar);
                } else {
                    cVar.begin();
                }
            }
        }
    }

    public void f() {
        this.f5351c = false;
        for (M1.c cVar : Q1.l.k(this.f5349a)) {
            if (!cVar.isComplete() && !cVar.isRunning()) {
                cVar.begin();
            }
        }
        this.f5350b.clear();
    }

    public void g(M1.c cVar) {
        this.f5349a.add(cVar);
        if (!this.f5351c) {
            cVar.begin();
        } else {
            cVar.clear();
            this.f5350b.add(cVar);
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f5349a.size() + ", isPaused=" + this.f5351c + "}";
    }
}
