package j9;

import e9.F;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f29046a = new LinkedHashSet();

    public final synchronized void a(F route) {
        AbstractC2855l.g(route, "route");
        this.f29046a.remove(route);
    }

    public final synchronized void b(F failedRoute) {
        AbstractC2855l.g(failedRoute, "failedRoute");
        this.f29046a.add(failedRoute);
    }

    public final synchronized boolean c(F route) {
        AbstractC2855l.g(route, "route");
        return this.f29046a.contains(route);
    }
}
