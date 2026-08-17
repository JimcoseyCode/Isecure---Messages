package F;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u1 f1703b = new u1(new ArrayMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map f1704a;

    protected u1(Map map) {
        this.f1704a = map;
    }

    public static u1 a(Pair pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new u1(arrayMap);
    }

    public static u1 b() {
        return f1703b;
    }

    public static u1 c(u1 u1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : u1Var.e()) {
            arrayMap.put(str, u1Var.d(str));
        }
        return new u1(arrayMap);
    }

    public Object d(String str) {
        return this.f1704a.get(str);
    }

    public Set e() {
        return this.f1704a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
