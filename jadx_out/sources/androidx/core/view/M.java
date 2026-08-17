package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f16493a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f16494a;

        b(View view) {
            this.f16494a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.M.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f16494a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // androidx.core.view.M.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f16494a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    private M(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f16493a = new b(view);
        } else {
            this.f16493a = new c();
        }
    }

    public static M a(View view) {
        return new M(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f16493a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f16493a.onScrollProgress(i10, i11, i12, i13);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c implements d {
        private c() {
        }

        @Override // androidx.core.view.M.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // androidx.core.view.M.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }
}
