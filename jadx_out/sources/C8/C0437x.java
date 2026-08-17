package C8;

import L7.InterfaceC1288m;
import j7.AbstractC2800q;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0437x implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0437x f713a = new C0437x();

    private C0437x() {
    }

    @Override // C8.q0
    public r0 a(M7.h annotations, v0 v0Var, InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(annotations, "annotations");
        return annotations.isEmpty() ? r0.f682h.j() : r0.f682h.i(AbstractC2800q.e(new C0432s(annotations)));
    }
}
