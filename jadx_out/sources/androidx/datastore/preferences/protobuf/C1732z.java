package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1727u;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1732z implements InterfaceC1731y {
    C1732z() {
    }

    static AbstractC1727u.b d(Object obj, long j10) {
        return (AbstractC1727u.b) i0.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1731y
    public void a(Object obj, Object obj2, long j10) {
        AbstractC1727u.b bVarD = d(obj, j10);
        AbstractC1727u.b bVarD2 = d(obj2, j10);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.n()) {
                bVarD = bVarD.f(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        i0.O(obj, j10, bVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1731y
    public void b(Object obj, long j10) {
        d(obj, j10).e();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1731y
    public List c(Object obj, long j10) {
        AbstractC1727u.b bVarD = d(obj, j10);
        if (bVarD.n()) {
            return bVarD;
        }
        int size = bVarD.size();
        AbstractC1727u.b bVarF = bVarD.f(size == 0 ? 10 : size * 2);
        i0.O(obj, j10, bVarF);
        return bVarF;
    }
}
