package androidx.transition;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class H extends F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f18268f = true;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    H() {
    }

    @Override // androidx.transition.B
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f18268f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f18268f = false;
            }
        }
    }
}
