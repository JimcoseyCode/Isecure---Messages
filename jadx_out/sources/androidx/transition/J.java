package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class J extends H {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f18269g = true;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    J() {
    }

    @Override // androidx.transition.B
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f18269g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f18269g = false;
            }
        }
    }
}
