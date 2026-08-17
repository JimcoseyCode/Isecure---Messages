package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RecyclerView.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f18187g = true;

    public final void A(RecyclerView.E e10) {
        I(e10);
        h(e10);
    }

    public final void B(RecyclerView.E e10) {
        J(e10);
    }

    public final void C(RecyclerView.E e10, boolean z10) {
        K(e10, z10);
        h(e10);
    }

    public final void D(RecyclerView.E e10, boolean z10) {
        L(e10, z10);
    }

    public final void E(RecyclerView.E e10) {
        M(e10);
        h(e10);
    }

    public final void F(RecyclerView.E e10) {
        N(e10);
    }

    public final void G(RecyclerView.E e10) {
        O(e10);
        h(e10);
    }

    public final void H(RecyclerView.E e10) {
        P(e10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        return (bVar == null || ((i10 = bVar.f17920a) == (i11 = bVar2.f17920a) && bVar.f17921b == bVar2.f17921b)) ? w(e10) : y(e10, i10, bVar.f17921b, i11, bVar2.f17921b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.E e10, RecyclerView.E e11, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f17920a;
        int i13 = bVar.f17921b;
        if (e11.J()) {
            int i14 = bVar.f17920a;
            i11 = bVar.f17921b;
            i10 = i14;
        } else {
            i10 = bVar2.f17920a;
            i11 = bVar2.f17921b;
        }
        return x(e10, e11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10 = bVar.f17920a;
        int i11 = bVar.f17921b;
        View view = e10.f17881a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f17920a;
        int top = bVar2 == null ? view.getTop() : bVar2.f17921b;
        if (e10.v() || (i10 == left && i11 == top)) {
            return z(e10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(e10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10 = bVar.f17920a;
        int i11 = bVar2.f17920a;
        if (i10 != i11 || bVar.f17921b != bVar2.f17921b) {
            return y(e10, i10, bVar.f17921b, i11, bVar2.f17921b);
        }
        E(e10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.E e10) {
        return !this.f18187g || e10.t();
    }

    public abstract boolean w(RecyclerView.E e10);

    public abstract boolean x(RecyclerView.E e10, RecyclerView.E e11, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.E e10, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.E e10);

    public void I(RecyclerView.E e10) {
    }

    public void J(RecyclerView.E e10) {
    }

    public void M(RecyclerView.E e10) {
    }

    public void N(RecyclerView.E e10) {
    }

    public void O(RecyclerView.E e10) {
    }

    public void P(RecyclerView.E e10) {
    }

    public void K(RecyclerView.E e10, boolean z10) {
    }

    public void L(RecyclerView.E e10, boolean z10) {
    }
}
