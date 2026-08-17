package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f24899d = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void n(k holder, int i10) {
        AbstractC2855l.g(holder, "holder");
        FrameLayout frameLayoutM = holder.M();
        View viewZ = z(i10);
        holder.G(false);
        if (frameLayoutM.getChildCount() > 0) {
            frameLayoutM.removeAllViews();
        }
        if (viewZ.getParent() != null) {
            ViewParent parent = viewZ.getParent();
            AbstractC2855l.e(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(viewZ);
        }
        frameLayoutM.addView(viewZ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public k p(ViewGroup parent, int i10) {
        AbstractC2855l.g(parent, "parent");
        return k.f24900u.a(parent);
    }

    public final void C() {
        int size = this.f24899d.size();
        int i10 = 1;
        if (1 <= size) {
            while (true) {
                Object obj = this.f24899d.get(i10 - 1);
                AbstractC2855l.f(obj, "get(...)");
                View view = (View) obj;
                ViewParent parent = view.getParent();
                if ((parent != null ? parent.getParent() : null) != null) {
                    ViewParent parent2 = view.getParent().getParent();
                    AbstractC2855l.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    Object parent3 = view.getParent();
                    AbstractC2855l.e(parent3, "null cannot be cast to non-null type android.view.View");
                    ((ViewGroup) parent2).removeView((View) parent3);
                }
                if (i10 == size) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        int size2 = this.f24899d.size();
        this.f24899d.clear();
        k(0, size2);
    }

    public final void D(View child) {
        AbstractC2855l.g(child, "child");
        int iIndexOf = this.f24899d.indexOf(child);
        if (iIndexOf > -1) {
            E(iIndexOf);
        }
    }

    public final void E(int i10) {
        if (i10 < 0 || i10 >= this.f24899d.size()) {
            return;
        }
        this.f24899d.remove(i10);
        l(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int d() {
        return this.f24899d.size();
    }

    public final void y(View child, int i10) {
        AbstractC2855l.g(child, "child");
        this.f24899d.add(i10, child);
        j(i10);
    }

    public final View z(int i10) {
        Object obj = this.f24899d.get(i10);
        AbstractC2855l.f(obj, "get(...)");
        return (View) obj;
    }
}
