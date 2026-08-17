package F;

import K.f;
import android.graphics.Rect;
import android.util.Range;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import y.AbstractC3583h0;
import y.InterfaceC3597q;
import y.InterfaceC3601v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface L extends InterfaceC3597q {
    Set A();

    Set b();

    Set d();

    boolean e();

    String f();

    List h(Range range);

    Rect i();

    boolean j();

    void l(r rVar);

    v1 m();

    List o(int i10);

    default boolean q(B.b bVar, y.v0 v0Var) {
        for (A.b bVar2 : bVar.a()) {
            if (!bVar2.d(this, v0Var)) {
                AbstractC3583h0.a("CameraInfoInternal", bVar2 + " is not supported.");
                return false;
            }
        }
        try {
            x1.c(this, v0Var, false, bVar);
            return true;
        } catch (f.a | IllegalArgumentException e10) {
            AbstractC3583h0.b("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e10);
            return false;
        }
    }

    Object r();

    default void t(InterfaceC3601v interfaceC3601v) {
        x1.b(interfaceC3601v);
    }

    InterfaceC0513v0 u();

    List v();

    g1 w();

    List x(int i10);

    void z(Executor executor, r rVar);

    default L g() {
        return this;
    }
}
