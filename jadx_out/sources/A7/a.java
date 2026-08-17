package A7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC2855l;
import z7.AbstractC3689a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractC3689a {
    @Override // z7.AbstractC3689a
    public Random c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC2855l.f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
