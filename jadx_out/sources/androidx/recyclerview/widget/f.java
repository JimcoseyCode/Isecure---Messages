package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f18160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f18161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f18162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f18163e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f18166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f18167i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f18159a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f18164f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f18165g = 0;

    f() {
    }

    boolean a(RecyclerView.A a10) {
        int i10 = this.f18161c;
        return i10 >= 0 && i10 < a10.b();
    }

    View b(RecyclerView.w wVar) {
        View viewO = wVar.o(this.f18161c);
        this.f18161c += this.f18162d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f18160b + ", mCurrentPosition=" + this.f18161c + ", mItemDirection=" + this.f18162d + ", mLayoutDirection=" + this.f18163e + ", mStartLine=" + this.f18164f + ", mEndLine=" + this.f18165g + '}';
    }
}
