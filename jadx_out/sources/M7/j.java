package M7;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final h a(h first, h second) {
        AbstractC2855l.g(first, "first");
        AbstractC2855l.g(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new o(first, second);
    }
}
