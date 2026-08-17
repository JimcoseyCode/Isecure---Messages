package F;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class U0 extends u1 {
    private U0(Map map) {
        super(map);
    }

    public static U0 g() {
        return new U0(new ArrayMap());
    }

    public static U0 h(u1 u1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : u1Var.e()) {
            arrayMap.put(str, u1Var.d(str));
        }
        return new U0(arrayMap);
    }

    public void f(u1 u1Var) {
        Map map;
        Map map2 = this.f1704a;
        if (map2 == null || (map = u1Var.f1704a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(String str, Object obj) {
        this.f1704a.put(str, obj);
    }
}
