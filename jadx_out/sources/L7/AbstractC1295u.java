package L7;

import kotlin.jvm.internal.AbstractC2855l;
import w8.InterfaceC3501g;

/* JADX INFO: renamed from: L7.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1295u {
    protected AbstractC1295u() {
    }

    public final Integer a(AbstractC1295u visibility) {
        AbstractC2855l.g(visibility, "visibility");
        return b().a(visibility.b());
    }

    public abstract x0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10);

    public abstract AbstractC1295u f();

    public final String toString() {
        return b().toString();
    }
}
