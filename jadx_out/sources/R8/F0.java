package R8;

import W8.C1513p;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F0 extends C1513p implements InterfaceC1408f0, InterfaceC1439v0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public G0 f10120j;

    @Override // R8.InterfaceC1439v0
    public L0 a() {
        return null;
    }

    @Override // R8.InterfaceC1439v0
    public boolean d() {
        return true;
    }

    @Override // R8.InterfaceC1408f0
    public void dispose() {
        u().z0(this);
    }

    @Override // W8.C1513p
    public String toString() {
        return S.a(this) + '@' + S.b(this) + "[job@" + S.b(u()) + ']';
    }

    public final G0 u() {
        G0 g02 = this.f10120j;
        if (g02 != null) {
            return g02;
        }
        AbstractC2855l.y("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th);

    public final void x(G0 g02) {
        this.f10120j = g02;
    }
}
