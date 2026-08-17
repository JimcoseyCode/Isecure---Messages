package L6;

import android.view.View;
import com.swmansion.rnscreens.C2311y;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static final boolean a(View view) {
        AbstractC2855l.g(view, "<this>");
        return view.isLaidOut() || view.getHeight() > 0 || view.getWidth() > 0;
    }

    public static final boolean b(C2311y c2311y) {
        AbstractC2855l.g(c2311y, "<this>");
        return c2311y.getStackPresentation() == C2311y.e.f25456j && c2311y.getSheetDetents().d() == 1 && c2311y.getSheetDetents().l() == -1.0d;
    }

    public static final boolean c(C2311y c2311y) {
        AbstractC2855l.g(c2311y, "<this>");
        return !c2311y.getSheetShouldOverflowTopInset() && d(c2311y);
    }

    public static final boolean d(C2311y c2311y) {
        AbstractC2855l.g(c2311y, "<this>");
        return c2311y.getStackPresentation() == C2311y.e.f25456j;
    }
}
