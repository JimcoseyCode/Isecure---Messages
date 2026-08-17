package L6;

import com.swmansion.rnscreens.C2311y;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7233b;

    private final void c(C2311y c2311y) {
        if (this.f7232a && this.f7233b) {
            c2311y.A();
            c2311y.F();
        }
    }

    public final void a(C2311y screen) {
        AbstractC2855l.g(screen, "screen");
        this.f7233b = true;
        c(screen);
    }

    public final void b(C2311y screen) {
        AbstractC2855l.g(screen, "screen");
        this.f7232a = true;
        c(screen);
    }
}
