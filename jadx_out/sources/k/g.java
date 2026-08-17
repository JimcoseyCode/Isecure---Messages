package K;

import F.AbstractC0504q0;
import F.C0486h0;
import F.k1;
import android.media.MediaCodec;
import android.util.Range;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f6994a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(C0486h0.a aVar) {
        Set<AbstractC0504q0> setM = aVar.m();
        AbstractC2855l.f(setM, "getSurfaces(...)");
        if (setM != null && setM.isEmpty()) {
            return false;
        }
        for (AbstractC0504q0 abstractC0504q0 : setM) {
            AbstractC2855l.d(abstractC0504q0);
            if (d(abstractC0504q0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(Collection collection) {
        if (collection != null && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC0504q0 abstractC0504q0F = ((k1.f) it.next()).f();
            AbstractC2855l.f(abstractC0504q0F, "getSurface(...)");
            if (d(abstractC0504q0F)) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(Range range) {
        return ((Number) range.getUpper()).intValue() >= 120 && AbstractC2855l.b(range.getLower(), range.getUpper());
    }

    private final boolean d(AbstractC0504q0 abstractC0504q0) {
        return AbstractC2855l.b(abstractC0504q0.g(), MediaCodec.class);
    }

    private final Range f(Range range) {
        Range range2 = new Range(30, range.getUpper());
        AbstractC3583h0.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
        return range2;
    }

    public final void e(Collection outputConfigs, C0486h0.a repeatingConfigBuilder) {
        Range rangeL;
        AbstractC2855l.g(outputConfigs, "outputConfigs");
        AbstractC2855l.g(repeatingConfigBuilder, "repeatingConfigBuilder");
        if (outputConfigs.size() != 2 || !b(outputConfigs) || a(repeatingConfigBuilder) || (rangeL = repeatingConfigBuilder.l()) == null) {
            return;
        }
        if (!c(rangeL)) {
            rangeL = null;
        }
        if (rangeL != null) {
            repeatingConfigBuilder.q(f(rangeL));
        }
    }
}
