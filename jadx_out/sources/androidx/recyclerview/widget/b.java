package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0185b f18052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f18053b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f18054c = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f18055a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f18056b;

        a() {
        }

        private void c() {
            if (this.f18056b == null) {
                this.f18056b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f18055a &= ~(1 << i10);
                return;
            }
            a aVar = this.f18056b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f18056b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f18055a) : Long.bitCount(this.f18055a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f18055a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f18055a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f18055a & (1 << i10)) != 0;
            }
            c();
            return this.f18056b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f18056b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f18055a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f18055a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f18056b != null) {
                c();
                this.f18056b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f18056b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f18055a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f18055a = j12;
            long j13 = j10 - 1;
            this.f18055a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f18056b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f18056b.f(0);
            }
            return z10;
        }

        void g() {
            this.f18055a = 0L;
            a aVar = this.f18056b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f18055a |= 1 << i10;
            } else {
                c();
                this.f18056b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f18056b == null) {
                return Long.toBinaryString(this.f18055a);
            }
            return this.f18056b.toString() + "xx" + Long.toBinaryString(this.f18055a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface InterfaceC0185b {
        void a(View view);

        void b();

        int c(View view);

        RecyclerView.E d(View view);

        void e(int i10);

        void f(View view);

        void g(View view, int i10);

        View getChildAt(int i10);

        int getChildCount();

        void h(int i10);

        void i(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0185b interfaceC0185b) {
        this.f18052a = interfaceC0185b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f18052a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int iB = i10 - (i11 - this.f18053b.b(i11));
            if (iB == 0) {
                while (this.f18053b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f18054c.add(view);
        this.f18052a.a(view);
    }

    private boolean t(View view) {
        if (!this.f18054c.remove(view)) {
            return false;
        }
        this.f18052a.f(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int childCount = i10 < 0 ? this.f18052a.getChildCount() : h(i10);
        this.f18053b.e(childCount, z10);
        if (z10) {
            l(view);
        }
        this.f18052a.g(view, childCount);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int childCount = i10 < 0 ? this.f18052a.getChildCount() : h(i10);
        this.f18053b.e(childCount, z10);
        if (z10) {
            l(view);
        }
        this.f18052a.i(view, childCount, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f18053b.f(iH);
        this.f18052a.e(iH);
    }

    View e(int i10) {
        int size = this.f18054c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f18054c.get(i11);
            RecyclerView.E eD = this.f18052a.d(view);
            if (eD.m() == i10 && !eD.t() && !eD.v()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f18052a.getChildAt(h(i10));
    }

    int g() {
        return this.f18052a.getChildCount() - this.f18054c.size();
    }

    View i(int i10) {
        return this.f18052a.getChildAt(i10);
    }

    int j() {
        return this.f18052a.getChildCount();
    }

    void k(View view) {
        int iC = this.f18052a.c(view);
        if (iC >= 0) {
            this.f18053b.h(iC);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iC = this.f18052a.c(view);
        if (iC == -1 || this.f18053b.d(iC)) {
            return -1;
        }
        return iC - this.f18053b.b(iC);
    }

    boolean n(View view) {
        return this.f18054c.contains(view);
    }

    void o() {
        this.f18053b.g();
        for (int size = this.f18054c.size() - 1; size >= 0; size--) {
            this.f18052a.f((View) this.f18054c.get(size));
            this.f18054c.remove(size);
        }
        this.f18052a.b();
    }

    void p(View view) {
        int iC = this.f18052a.c(view);
        if (iC < 0) {
            return;
        }
        if (this.f18053b.f(iC)) {
            t(view);
        }
        this.f18052a.h(iC);
    }

    void q(int i10) {
        int iH = h(i10);
        View childAt = this.f18052a.getChildAt(iH);
        if (childAt == null) {
            return;
        }
        if (this.f18053b.f(iH)) {
            t(childAt);
        }
        this.f18052a.h(iH);
    }

    boolean r(View view) {
        int iC = this.f18052a.c(view);
        if (iC == -1) {
            t(view);
            return true;
        }
        if (!this.f18053b.d(iC)) {
            return false;
        }
        this.f18053b.f(iC);
        t(view);
        this.f18052a.h(iC);
        return true;
    }

    void s(View view) {
        int iC = this.f18052a.c(view);
        if (iC < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f18053b.d(iC)) {
            this.f18053b.a(iC);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f18053b.toString() + ", hidden list:" + this.f18054c.size();
    }
}
