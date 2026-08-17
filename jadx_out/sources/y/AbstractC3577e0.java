package y;

import F.u1;
import H.i;
import android.graphics.Matrix;

/* JADX INFO: renamed from: y.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3577e0 implements Y {
    public static Y f(u1 u1Var, long j10, int i10, Matrix matrix, int i11) {
        return new C3574d(u1Var, j10, i10, matrix, i11);
    }

    @Override // y.Y
    public abstract long a();

    @Override // y.Y
    public abstract u1 b();

    @Override // y.Y
    public abstract int c();

    @Override // y.Y
    public void d(i.b bVar) {
        bVar.m(e());
    }

    @Override // y.Y
    public abstract int e();

    public abstract Matrix g();
}
