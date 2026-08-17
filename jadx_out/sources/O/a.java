package O;

import O.c;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f8158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c.a f8160d;

    public a(int i10) {
        this(i10, null);
    }

    @Override // O.c
    public Object a() {
        Object objRemoveLast;
        synchronized (this.f8159c) {
            objRemoveLast = this.f8158b.removeLast();
        }
        return objRemoveLast;
    }

    @Override // O.c
    public void b(Object obj) {
        Object objA;
        synchronized (this.f8159c) {
            try {
                objA = this.f8158b.size() >= this.f8157a ? a() : null;
                this.f8158b.addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        c.a aVar = this.f8160d;
        if (aVar == null || objA == null) {
            return;
        }
        aVar.a(objA);
    }

    @Override // O.c
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f8159c) {
            zIsEmpty = this.f8158b.isEmpty();
        }
        return zIsEmpty;
    }

    public a(int i10, c.a aVar) {
        this.f8159c = new Object();
        this.f8157a = i10;
        this.f8158b = new ArrayDeque(i10);
        this.f8160d = aVar;
    }
}
