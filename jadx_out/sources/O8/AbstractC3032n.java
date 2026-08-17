package o8;

import L7.InterfaceC1277b;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: o8.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3032n {
    public abstract void a(InterfaceC1277b interfaceC1277b);

    public abstract void b(InterfaceC1277b interfaceC1277b, InterfaceC1277b interfaceC1277b2);

    public abstract void c(InterfaceC1277b interfaceC1277b, InterfaceC1277b interfaceC1277b2);

    public void d(InterfaceC1277b member, Collection overridden) {
        AbstractC2855l.g(member, "member");
        AbstractC2855l.g(overridden, "overridden");
        member.u0(overridden);
    }
}
