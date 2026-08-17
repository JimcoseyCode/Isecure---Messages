package T8;

import com.facebook.react.uimanager.ViewDefaults;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final g a(int i10, a aVar, Function1 function1) {
        if (i10 == -2) {
            return aVar == a.f10646g ? new e(g.f10691d.a(), function1) : new r(1, aVar, function1);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == a.f10646g ? new e(i10, function1) : new r(i10, aVar, function1) : new e(ViewDefaults.NUMBER_OF_LINES, function1) : aVar == a.f10646g ? new e(0, function1) : new r(1, aVar, function1);
        }
        if (aVar == a.f10646g) {
            return new r(1, a.f10647h, function1);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ g b(int i10, a aVar, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.f10646g;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return a(i10, aVar, function1);
    }
}
