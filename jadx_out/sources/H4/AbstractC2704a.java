package h4;

import U3.e;
import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: h4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2704a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f28291a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f28292b;

    static {
        HashMap map = new HashMap();
        f28292b = map;
        map.put(e.DEFAULT, 0);
        f28292b.put(e.VERY_LOW, 1);
        f28292b.put(e.HIGHEST, 2);
        for (e eVar : f28292b.keySet()) {
            f28291a.append(((Integer) f28292b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = (Integer) f28292b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i10) {
        e eVar = (e) f28291a.get(i10);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
