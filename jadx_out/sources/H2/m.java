package H2;

import java.util.Date;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f3732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f3733b;

    public m(j frameLoader, Date insertedTime) {
        AbstractC2855l.g(frameLoader, "frameLoader");
        AbstractC2855l.g(insertedTime, "insertedTime");
        this.f3732a = frameLoader;
        this.f3733b = insertedTime;
    }

    public final j a() {
        return this.f3732a;
    }

    public final Date b() {
        return this.f3733b;
    }
}
