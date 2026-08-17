package h8;

import f8.q;
import f8.t;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f28563a;

    public g(t typeTable) {
        AbstractC2855l.g(typeTable, "typeTable");
        List listZ = typeTable.z();
        if (typeTable.A()) {
            int iW = typeTable.w();
            List listZ2 = typeTable.z();
            AbstractC2855l.f(listZ2, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listZ2, 10));
            int i10 = 0;
            for (Object obj : listZ2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2800q.t();
                }
                q qVarQ = (q) obj;
                if (i10 >= iW) {
                    qVarQ = qVarQ.f().H(true).build();
                }
                arrayList.add(qVarQ);
                i10 = i11;
            }
            listZ = arrayList;
        }
        AbstractC2855l.f(listZ, "run(...)");
        this.f28563a = listZ;
    }

    public final q a(int i10) {
        return (q) this.f28563a.get(i10);
    }
}
