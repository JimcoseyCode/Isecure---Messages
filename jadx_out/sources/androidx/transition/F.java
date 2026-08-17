package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class F extends B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f18266d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f18267e = true;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    F() {
    }

    @Override // androidx.transition.B
    public void g(View view, Matrix matrix) {
        if (f18266d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f18266d = false;
            }
        }
    }

    @Override // androidx.transition.B
    public void h(View view, Matrix matrix) {
        if (f18267e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f18267e = false;
            }
        }
    }
}
