package L6;

import com.swmansion.rnscreens.B;
import com.swmansion.rnscreens.C2311y;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7276b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7277a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(List rawDetents) {
        AbstractC2855l.g(rawDetents, "rawDetents");
        this.f7277a = AbstractC2800q.P0(rawDetents);
        if (rawDetents.isEmpty()) {
            throw new IllegalArgumentException("[RNScreens] At least one detent must be provided.");
        }
        if (rawDetents.size() > 3) {
            throw new IllegalArgumentException("[RNScreens] Maximum of 3 detents supported.");
        }
        if (rawDetents.size() == 1) {
            double dDoubleValue = ((Number) rawDetents.get(0)).doubleValue();
            if ((0.0d > dDoubleValue || dDoubleValue > 1.0d) && dDoubleValue != -1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent value must be within 0.0 and 1.0, or SHEET_FIT_TO_CONTENTS should be defined, got " + dDoubleValue + ".").toString());
            }
            return;
        }
        Iterator it = rawDetents.iterator();
        while (it.hasNext()) {
            double dDoubleValue2 = ((Number) it.next()).doubleValue();
            if (0.0d > dDoubleValue2 || dDoubleValue2 > 1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent values must be within 0.0 and 1.0, got " + dDoubleValue2 + ".").toString());
            }
        }
        if (!AbstractC2855l.b(rawDetents, AbstractC2800q.G0(rawDetents))) {
            throw new IllegalArgumentException("[RNScreens] Detents must be sorted in ascending order.");
        }
    }

    public final double a(int i10) {
        return ((Number) this.f7277a.get(i10)).doubleValue();
    }

    public final int b(int i10, int i11) {
        if (d() >= 3) {
            return ((int) ((((double) 1) - a(2)) * ((double) i10))) + i11;
        }
        throw new IllegalStateException("[RNScreens] At least 3 detents required for expandedOffsetFromTop.");
    }

    public final int c(int i10) {
        return f(0, i10);
    }

    public final int d() {
        return this.f7277a.size();
    }

    public final float e() {
        if (d() >= 3) {
            return (float) (a(1) / a(2));
        }
        throw new IllegalStateException("[RNScreens] At least 3 detents required for halfExpandedRatio.");
    }

    public final int f(int i10, int i11) {
        double dA = a(i10);
        if (dA == -1.0d) {
            throw new IllegalArgumentException("[RNScreens] FIT_TO_CONTENTS is not supported by heightAt.");
        }
        return (int) (dA * ((double) i11));
    }

    public final double g() {
        return ((Number) AbstractC2800q.q0(this.f7277a)).doubleValue();
    }

    public final int h(int i10) {
        return q.f7278a.a(i10, d());
    }

    public final int i(int i10) {
        return f(d() - 1, i10);
    }

    public final int j(C2311y screen) {
        AbstractC2855l.g(screen, "screen");
        B contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(contentWrapper.getHeight());
        if (!r.a(contentWrapper)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final int k(int i10) {
        return q.f7278a.c(i10, d());
    }

    public final double l() {
        return ((Number) AbstractC2800q.e0(this.f7277a)).doubleValue();
    }
}
