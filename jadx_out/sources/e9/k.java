package e9;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j9.h f26259a;

    public k(j9.h delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f26259a = delegate;
    }

    public final j9.h a() {
        return this.f26259a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new j9.h(i9.e.f28848h, i10, j10, timeUnit));
        AbstractC2855l.g(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
