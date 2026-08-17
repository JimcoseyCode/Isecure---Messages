package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class K extends J {
    K() {
    }

    @Override // androidx.transition.B
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.H, androidx.transition.B
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.transition.B
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.J, androidx.transition.B
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.F, androidx.transition.B
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.F, androidx.transition.B
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
