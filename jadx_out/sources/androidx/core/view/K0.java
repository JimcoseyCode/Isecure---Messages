package androidx.core.view;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f16457a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f16458a;

        a(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f16458a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.K0.b
        void a(boolean z10) {
            this.f16458a.finish(z10);
        }

        @Override // androidx.core.view.K0.b
        public float b() {
            return this.f16458a.getCurrentFraction();
        }

        @Override // androidx.core.view.K0.b
        public x0.e c() {
            return x0.e.f(this.f16458a.getCurrentInsets());
        }

        @Override // androidx.core.view.K0.b
        public x0.e d() {
            return x0.e.f(this.f16458a.getHiddenStateInsets());
        }

        @Override // androidx.core.view.K0.b
        public x0.e e() {
            return x0.e.f(this.f16458a.getShownStateInsets());
        }

        @Override // androidx.core.view.K0.b
        public void f(x0.e eVar, float f10, float f11) {
            this.f16458a.setInsetsAndAlpha(eVar == null ? null : eVar.g(), f10, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {
        b() {
        }

        abstract void a(boolean z10);

        public abstract float b();

        public abstract x0.e c();

        public abstract x0.e d();

        public abstract x0.e e();

        public abstract void f(x0.e eVar, float f10, float f11);
    }

    K0(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f16457a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z10) {
        this.f16457a.a(z10);
    }

    public float b() {
        return this.f16457a.b();
    }

    public x0.e c() {
        return this.f16457a.c();
    }

    public x0.e d() {
        return this.f16457a.d();
    }

    public x0.e e() {
        return this.f16457a.e();
    }

    public void f(x0.e eVar, float f10, float f11) {
        this.f16457a.f(eVar, f10, f11);
    }
}
