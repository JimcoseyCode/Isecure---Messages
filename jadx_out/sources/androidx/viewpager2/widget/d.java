package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class d extends ViewPager2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f18590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewPager2.k f18591b;

    d(LinearLayoutManager linearLayoutManager) {
        this.f18590a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void b(int i10, float f10, int i11) {
        if (this.f18591b == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.f18590a.O(); i12++) {
            View viewN = this.f18590a.N(i12);
            if (viewN == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f18590a.O())));
            }
            this.f18591b.a(viewN, (this.f18590a.l0(viewN) - i10) + f11);
        }
    }

    ViewPager2.k d() {
        return this.f18591b;
    }

    void e(ViewPager2.k kVar) {
        this.f18591b = kVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void c(int i10) {
    }
}
