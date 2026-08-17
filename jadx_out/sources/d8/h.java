package D8;

import C8.S;
import L7.G;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f822a = new G("KotlinTypeRefiner");

    public static final G a() {
        return f822a;
    }

    public static final List b(g gVar, Iterable types) {
        AbstractC2855l.g(gVar, "<this>");
        AbstractC2855l.g(types, "types");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a((S) it.next()));
        }
        return arrayList;
    }
}
