package u8;

import B8.n;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: u8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3408b implements InterfaceC3407a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f32731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.b f32732b;

    public C3408b(n storageManager, Iterable samWithReceiverResolvers) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f32731a = samWithReceiverResolvers;
        this.f32732b = storageManager.a();
    }
}
