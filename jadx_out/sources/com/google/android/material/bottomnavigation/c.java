package com.google.android.material.bottomnavigation;

import Q4.j;
import Q4.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.f0;
import androidx.core.view.L0;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class c extends NavigationBarView {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements o.c {
        a() {
        }

        @Override // com.google.android.material.internal.o.c
        public L0 a(View view, L0 l02, o.d dVar) {
            dVar.f23493d += l02.j();
            boolean z10 = view.getLayoutDirection() == 1;
            int iK = l02.k();
            int iL = l02.l();
            dVar.f23490a += z10 ? iL : iK;
            int i10 = dVar.f23492c;
            if (!z10) {
                iK = iL;
            }
            dVar.f23492c = i10 + iK;
            dVar.a(view);
            return l02;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b extends NavigationBarView.b {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0224c extends NavigationBarView.c {
    }

    public c(Context context) {
        this(context, null);
    }

    private void j() {
        o.b(this, new a());
    }

    private int k(int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), androidx.customview.widget.a.INVALID_ID);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected i c(Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, k(i11));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.v() != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().b(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC0224c interfaceC0224c) {
        setOnItemSelectedListener(interfaceC0224c);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Q4.a.f9134c);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, j.f9413l);
    }

    public c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0 f0VarJ = l.j(getContext(), attributeSet, k.f9588U, i10, i11, new int[0]);
        setItemHorizontalTranslationEnabled(f0VarJ.a(k.f9604W, true));
        if (f0VarJ.s(k.f9596V)) {
            setMinimumHeight(f0VarJ.f(k.f9596V, 0));
        }
        f0VarJ.x();
        j();
    }
}
