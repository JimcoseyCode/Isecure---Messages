package d8;

import C8.AbstractC0407d0;
import C8.S;
import C8.V;
import i8.AbstractC2757a;
import kotlin.jvm.internal.AbstractC2855l;
import y8.InterfaceC3661x;

/* JADX INFO: renamed from: d8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2368p implements InterfaceC3661x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2368p f25769a = new C2368p();

    private C2368p() {
    }

    @Override // y8.InterfaceC3661x
    public S a(f8.q proto, String flexibleId, AbstractC0407d0 lowerBound, AbstractC0407d0 upperBound) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(flexibleId, "flexibleId");
        AbstractC2855l.g(lowerBound, "lowerBound");
        AbstractC2855l.g(upperBound, "upperBound");
        return !AbstractC2855l.b(flexibleId, "kotlin.jvm.PlatformType") ? E8.l.d(E8.k.f1195P, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.w(AbstractC2757a.f28750g) ? new Z7.k(lowerBound, upperBound) : V.e(lowerBound, upperBound);
    }
}
