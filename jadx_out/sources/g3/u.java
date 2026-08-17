package g3;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements InterfaceC2665A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f28208a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f28209b = new k();

    private Object b(Object obj) {
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            this.f28208a.remove(obj);
        }
        return obj;
    }

    @Override // g3.InterfaceC2665A
    public Object get(int i10) {
        return b(this.f28209b.a(i10));
    }

    @Override // g3.InterfaceC2665A
    public Object pop() {
        return b(this.f28209b.f());
    }

    @Override // g3.InterfaceC2665A
    public void put(Object obj) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f28208a.add(obj);
        }
        if (zAdd) {
            this.f28209b.e(a(obj), obj);
        }
    }
}
