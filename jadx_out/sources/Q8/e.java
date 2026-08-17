package Q8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class e {
    public static final double a(double d10, d sourceUnit, d targetUnit) {
        AbstractC2855l.g(sourceUnit, "sourceUnit");
        AbstractC2855l.g(targetUnit, "targetUnit");
        long jConvert = targetUnit.j().convert(1L, sourceUnit.j());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.j().convert(1L, targetUnit.j());
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        AbstractC2855l.g(sourceUnit, "sourceUnit");
        AbstractC2855l.g(targetUnit, "targetUnit");
        return targetUnit.j().convert(j10, sourceUnit.j());
    }

    public static final long c(long j10, d sourceUnit, d targetUnit) {
        AbstractC2855l.g(sourceUnit, "sourceUnit");
        AbstractC2855l.g(targetUnit, "targetUnit");
        return targetUnit.j().convert(j10, sourceUnit.j());
    }
}
