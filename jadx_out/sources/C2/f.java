package c2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f extends ArrayList {
    private f(int i10) {
        super(i10);
    }

    public static f o(List list) {
        return new f(list);
    }

    public static f p(Object... objArr) {
        f fVar = new f(objArr.length);
        Collections.addAll(fVar, objArr);
        return fVar;
    }

    private f(List list) {
        super(list);
    }
}
