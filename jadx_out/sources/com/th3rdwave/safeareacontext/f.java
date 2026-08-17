package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w7.o f25483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f25484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f25485i;

    public f(Context context) {
        super(context);
    }

    private final void c() {
        a aVarE;
        w7.o oVar = this.f25483g;
        if (oVar == null || (aVarE = h.e(this)) == null) {
            return;
        }
        View rootView = getRootView();
        AbstractC2855l.e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        c cVarA = h.a((ViewGroup) rootView, this);
        if (cVarA == null) {
            return;
        }
        if (AbstractC2855l.b(this.f25484h, aVarE) && AbstractC2855l.b(this.f25485i, cVarA)) {
            return;
        }
        oVar.invoke(this, aVarE, cVarA);
        this.f25484h = aVarE;
        this.f25485i = cVarA;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        c();
        return true;
    }

    public final void setOnInsetsChangeHandler(w7.o oVar) {
        this.f25483g = oVar;
        c();
    }
}
