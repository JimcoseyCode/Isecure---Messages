package androidx.coordinatorlayout.widget;

import H0.e;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import m0.i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f16264a = new Pools$SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f16265b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f16266c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f16267d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f16265b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f16264a.acquire();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void l(ArrayList arrayList) {
        arrayList.clear();
        this.f16264a.release(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f16265b.containsKey(obj) || !this.f16265b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f16265b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f16265b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f16265b.containsKey(obj)) {
            return;
        }
        this.f16265b.put(obj, null);
    }

    public void c() {
        int size = this.f16265b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f16265b.j(i10);
            if (arrayList != null) {
                l(arrayList);
            }
        }
        this.f16265b.clear();
    }

    public boolean d(Object obj) {
        return this.f16265b.containsKey(obj);
    }

    public List g(Object obj) {
        ArrayList arrayListH = h(obj);
        if (arrayListH == null) {
            return null;
        }
        return new ArrayList(arrayListH);
    }

    ArrayList h(Object obj) {
        return (ArrayList) this.f16265b.get(obj);
    }

    public List i(Object obj) {
        int size = this.f16265b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f16265b.j(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f16265b.f(i10));
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        this.f16266c.clear();
        this.f16267d.clear();
        int size = this.f16265b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f16265b.f(i10), this.f16266c, this.f16267d);
        }
        return this.f16266c;
    }

    public boolean k(Object obj) {
        int size = this.f16265b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f16265b.j(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
