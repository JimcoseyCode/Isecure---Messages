package V8;

import i7.C2735B;
import i7.C2752o;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d[] f11845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11847i;

    protected final d d() {
        d dVarE;
        synchronized (this) {
            try {
                d[] dVarArrF = this.f11845g;
                if (dVarArrF == null) {
                    dVarArrF = f(2);
                    this.f11845g = dVarArrF;
                } else if (this.f11846h >= dVarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrF, dVarArrF.length * 2);
                    AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
                    this.f11845g = (d[]) objArrCopyOf;
                    dVarArrF = (d[]) objArrCopyOf;
                }
                int i10 = this.f11847i;
                do {
                    dVarE = dVarArrF[i10];
                    if (dVarE == null) {
                        dVarE = e();
                        dVarArrF[i10] = dVarE;
                    }
                    i10++;
                    if (i10 >= dVarArrF.length) {
                        i10 = 0;
                    }
                    AbstractC2855l.e(dVarE, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarE.a(this));
                this.f11847i = i10;
                this.f11846h++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarE;
    }

    protected abstract d e();

    protected abstract d[] f(int i10);

    protected final void g(d dVar) {
        int i10;
        n7.f[] fVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f11846h - 1;
                this.f11846h = i11;
                if (i11 == 0) {
                    this.f11847i = 0;
                }
                AbstractC2855l.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                fVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (n7.f fVar : fVarArrB) {
            if (fVar != null) {
                C2752o.a aVar = C2752o.f28721h;
                fVar.resumeWith(C2752o.b(C2735B.f28704a));
            }
        }
    }

    protected final d[] h() {
        return this.f11845g;
    }
}
