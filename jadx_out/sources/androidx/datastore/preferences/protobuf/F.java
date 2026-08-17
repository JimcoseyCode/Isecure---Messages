package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class F implements E {
    F() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        D d10 = (D) obj;
        C c10 = (C) obj2;
        int iA = 0;
        if (d10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : d10.entrySet()) {
            iA += c10.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static D j(Object obj, Object obj2) {
        D dL = (D) obj;
        D d10 = (D) obj2;
        if (!d10.isEmpty()) {
            if (!dL.i()) {
                dL = dL.l();
            }
            dL.k(d10);
        }
        return dL;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object b(Object obj) {
        ((D) obj).j();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public C.a c(Object obj) {
        return ((C) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map d(Object obj) {
        return (D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object e(Object obj) {
        return D.e().l();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public boolean g(Object obj) {
        return !((D) obj).i();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map h(Object obj) {
        return (D) obj;
    }
}
