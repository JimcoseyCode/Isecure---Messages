package k3;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29112a;

    public b(int i10) {
        this.f29112a = i10;
    }

    public final int a() {
        return this.f29112a;
    }

    public String toString() {
        H h10 = H.f29375a;
        String str = String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f29112a)}, 1));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }
}
