package o8;

import L7.InterfaceC1277b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: o8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3031m extends AbstractC3032n {
    @Override // o8.AbstractC3032n
    public void b(InterfaceC1277b first, InterfaceC1277b second) {
        AbstractC2855l.g(first, "first");
        AbstractC2855l.g(second, "second");
        e(first, second);
    }

    @Override // o8.AbstractC3032n
    public void c(InterfaceC1277b fromSuper, InterfaceC1277b fromCurrent) {
        AbstractC2855l.g(fromSuper, "fromSuper");
        AbstractC2855l.g(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    protected abstract void e(InterfaceC1277b interfaceC1277b, InterfaceC1277b interfaceC1277b2);
}
