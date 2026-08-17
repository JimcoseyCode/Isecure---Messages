package I4;

import android.graphics.Point;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class N9 {
    public static N9 f(Iterable iterable, int i10, int i11, float f10) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i10;
        int iMin2 = i11;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f11 = i10;
        float f12 = i11;
        return new L9((iMin + 0.0f) / f11, (iMin2 + 0.0f) / f12, (iMax + 0.0f) / f11, (iMax2 + 0.0f) / f12, 0.0f);
    }

    abstract float a();

    abstract float b();

    abstract float c();

    abstract float d();

    abstract float e();
}
