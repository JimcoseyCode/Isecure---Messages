package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22978a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f22979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f22979b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.b
        int d() {
            return this.f22979b.b0();
        }

        @Override // com.google.android.material.carousel.b
        int e() {
            return this.f22979b.i0();
        }

        @Override // com.google.android.material.carousel.b
        int f() {
            return this.f22979b.s0() - this.f22979b.j0();
        }

        @Override // com.google.android.material.carousel.b
        int g() {
            return h();
        }

        @Override // com.google.android.material.carousel.b
        int h() {
            return 0;
        }

        @Override // com.google.android.material.carousel.b
        public void i(View view, int i10, int i11) {
            int iE = e();
            this.f22979b.D0(view, iE, i10, iE + k(view), i11);
        }

        @Override // com.google.android.material.carousel.b
        public void j(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        int k(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f22979b.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0225b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f22980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0225b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f22980b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.b
        int d() {
            return this.f22980b.b0() - this.f22980b.h0();
        }

        @Override // com.google.android.material.carousel.b
        int e() {
            return 0;
        }

        @Override // com.google.android.material.carousel.b
        int f() {
            return this.f22980b.s0();
        }

        @Override // com.google.android.material.carousel.b
        int g() {
            return this.f22980b.F2() ? f() : e();
        }

        @Override // com.google.android.material.carousel.b
        int h() {
            return this.f22980b.k0();
        }

        @Override // com.google.android.material.carousel.b
        public void i(View view, int i10, int i11) {
            int iH = h();
            this.f22980b.D0(view, i10, iH, i11, iH + k(view));
        }

        @Override // com.google.android.material.carousel.b
        public void j(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        int k(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f22980b.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
    }

    /* synthetic */ b(int i10, a aVar) {
        this(i10);
    }

    private static b a(CarouselLayoutManager carouselLayoutManager) {
        return new C0225b(0, carouselLayoutManager);
    }

    static b b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static b c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract int d();

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract void i(View view, int i10, int i11);

    abstract void j(View view, Rect rect, float f10, float f11);

    private b(int i10) {
        this.f22978a = i10;
    }
}
