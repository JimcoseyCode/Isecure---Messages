package R8;

import R8.J;
import W8.AbstractC1507j;
import W8.AbstractC1510m;
import W8.C1506i;
import W8.C1509l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.AbstractC2981a;
import n7.AbstractC2982b;
import n7.g;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J extends AbstractC2981a implements n7.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f10140h = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC2982b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J d(j.b bVar) {
            if (bVar instanceof J) {
                return (J) bVar;
            }
            return null;
        }

        private a() {
            super(n7.g.f30066e, new Function1() { // from class: R8.I
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return J.a.d((j.b) obj);
                }
            });
        }
    }

    public J() {
        super(n7.g.f30066e);
    }

    public static /* synthetic */ J N0(J j10, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return j10.M0(i10, str);
    }

    @Override // n7.g
    public final void A0(n7.f fVar) {
        AbstractC2855l.e(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C1506i) fVar).v();
    }

    public abstract void J0(n7.j jVar, Runnable runnable);

    public void K0(n7.j jVar, Runnable runnable) {
        AbstractC1507j.c(this, jVar, runnable);
    }

    public boolean L0(n7.j jVar) {
        return true;
    }

    public J M0(int i10, String str) {
        AbstractC1510m.a(i10);
        return new C1509l(this, i10, str);
    }

    @Override // n7.AbstractC2981a, n7.j.b, n7.j
    public j.b e(j.c cVar) {
        return g.a.a(this, cVar);
    }

    public String toString() {
        return S.a(this) + '@' + S.b(this);
    }

    @Override // n7.g
    public final n7.f w0(n7.f fVar) {
        return new C1506i(this, fVar);
    }

    @Override // n7.AbstractC2981a, n7.j
    public n7.j y0(j.c cVar) {
        return g.a.b(this, cVar);
    }
}
