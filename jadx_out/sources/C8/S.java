package C8;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class S implements M7.a, G8.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f607g;

    public /* synthetic */ S(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int H0() {
        return W.a(this) ? super.hashCode() : (((K0().hashCode() * 31) + I0().hashCode()) * 31) + (L0() ? 1 : 0);
    }

    public abstract List I0();

    public abstract r0 J0();

    public abstract v0 K0();

    public abstract boolean L0();

    public abstract S M0(D8.g gVar);

    public abstract M0 N0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return L0() == s10.L0() && D8.t.f847a.a(N0(), s10.N0());
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        return AbstractC0433t.a(J0());
    }

    public final int hashCode() {
        int i10 = this.f607g;
        if (i10 != 0) {
            return i10;
        }
        int iH0 = H0();
        this.f607g = iH0;
        return iH0;
    }

    public abstract InterfaceC3442k o();

    private S() {
    }
}
