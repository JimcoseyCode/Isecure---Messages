package R8;

import i7.C2735B;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2853j;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class E0 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2853j implements Function1 {
        a(Object obj) {
            super(1, obj, F0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            j((Throwable) obj);
            return C2735B.f28704a;
        }

        public final void j(Throwable th) {
            ((F0) this.receiver).w(th);
        }
    }

    public static final InterfaceC1446z a(A0 a02) {
        return new C0(a02);
    }

    public static /* synthetic */ InterfaceC1446z b(A0 a02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a02 = null;
        }
        return D0.a(a02);
    }

    public static final void c(n7.j jVar, CancellationException cancellationException) {
        A0 a02 = (A0) jVar.e(A0.f10112c);
        if (a02 != null) {
            a02.k(cancellationException);
        }
    }

    public static /* synthetic */ void d(n7.j jVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        D0.c(jVar, cancellationException);
    }

    public static final InterfaceC1408f0 e(A0 a02, InterfaceC1408f0 interfaceC1408f0) {
        return j(a02, false, new C1412h0(interfaceC1408f0), 1, null);
    }

    public static final void f(A0 a02) {
        if (!a02.d()) {
            throw a02.M();
        }
    }

    public static final void g(n7.j jVar) {
        A0 a02 = (A0) jVar.e(A0.f10112c);
        if (a02 != null) {
            D0.f(a02);
        }
    }

    public static final A0 h(n7.j jVar) {
        A0 a02 = (A0) jVar.e(A0.f10112c);
        if (a02 != null) {
            return a02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + jVar).toString());
    }

    public static final InterfaceC1408f0 i(A0 a02, boolean z10, F0 f02) {
        return a02 instanceof G0 ? ((G0) a02).e0(z10, f02) : a02.J(f02.v(), z10, new a(f02));
    }

    public static /* synthetic */ InterfaceC1408f0 j(A0 a02, boolean z10, F0 f02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return D0.i(a02, z10, f02);
    }
}
