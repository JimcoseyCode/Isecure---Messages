package g3;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SparseArray f28186a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f28187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f28188c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f28189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinkedList f28191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f28192d;

        public String toString() {
            return "LinkedEntry(key: " + this.f28190b + ")";
        }

        private a(a aVar, int i10, LinkedList linkedList, a aVar2) {
            this.f28189a = aVar;
            this.f28190b = i10;
            this.f28191c = linkedList;
            this.f28192d = aVar2;
        }
    }

    private void b(a aVar) {
        if (aVar == null || !aVar.f28191c.isEmpty()) {
            return;
        }
        d(aVar);
        this.f28186a.remove(aVar.f28190b);
    }

    private void c(a aVar) {
        if (this.f28187b == aVar) {
            return;
        }
        d(aVar);
        a aVar2 = this.f28187b;
        if (aVar2 == null) {
            this.f28187b = aVar;
            this.f28188c = aVar;
        } else {
            aVar.f28192d = aVar2;
            aVar2.f28189a = aVar;
            this.f28187b = aVar;
        }
    }

    private synchronized void d(a aVar) {
        try {
            a aVar2 = aVar.f28189a;
            a aVar3 = aVar.f28192d;
            if (aVar2 != null) {
                aVar2.f28192d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f28189a = aVar2;
            }
            aVar.f28189a = null;
            aVar.f28192d = null;
            if (aVar == this.f28187b) {
                this.f28187b = aVar3;
            }
            if (aVar == this.f28188c) {
                this.f28188c = aVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object a(int i10) {
        a aVar = (a) this.f28186a.get(i10);
        if (aVar == null) {
            return null;
        }
        Object objPollFirst = aVar.f28191c.pollFirst();
        c(aVar);
        return objPollFirst;
    }

    public synchronized void e(int i10, Object obj) {
        try {
            a aVar = (a) this.f28186a.get(i10);
            if (aVar == null) {
                a aVar2 = new a(null, i10, new LinkedList(), null);
                this.f28186a.put(i10, aVar2);
                aVar = aVar2;
            }
            aVar.f28191c.addLast(obj);
            c(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object f() {
        a aVar = this.f28188c;
        if (aVar == null) {
            return null;
        }
        Object objPollLast = aVar.f28191c.pollLast();
        b(aVar);
        return objPollLast;
    }
}
