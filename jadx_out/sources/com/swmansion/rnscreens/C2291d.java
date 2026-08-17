package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: com.swmansion.rnscreens.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2291d extends SearchView {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private SearchView.l f25091w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private View.OnClickListener f25092x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private androidx.activity.L f25093y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final C2296i f25094z0;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends androidx.activity.L {
        a() {
            super(true);
        }

        @Override // androidx.activity.L
        public void handleOnBackPressed() {
            C2291d.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2291d(Context context, Fragment fragment) {
        super(context);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(fragment, "fragment");
        a aVar = new a();
        this.f25093y0 = aVar;
        this.f25094z0 = new C2296i(fragment, aVar);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2291d.m0(this.f25087g, view);
            }
        });
        super.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.c
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                return C2291d.n0(this.f25089a);
            }
        });
        setMaxWidth(ViewDefaults.NUMBER_OF_LINES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(C2291d c2291d, View view) {
        View.OnClickListener onClickListener = c2291d.f25092x0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        c2291d.f25094z0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n0(C2291d c2291d) {
        SearchView.l lVar = c2291d.f25091w0;
        boolean zA = lVar != null ? lVar.a() : false;
        c2291d.f25094z0.c();
        return zA;
    }

    public final boolean getOverrideBackAction() {
        return this.f25094z0.a();
    }

    public final void o0() {
        p0();
        setIconified(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (J()) {
            return;
        }
        this.f25094z0.b();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25094z0.c();
    }

    public final void p0() {
        b0(PointerEventHelper.POINTER_TYPE_UNKNOWN, false);
    }

    public final void q0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.l lVar) {
        this.f25091w0 = lVar;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f25092x0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z10) {
        this.f25094z0.d(z10);
    }

    public final void setText(String text) {
        AbstractC2855l.g(text, "text");
        b0(text, false);
    }
}
