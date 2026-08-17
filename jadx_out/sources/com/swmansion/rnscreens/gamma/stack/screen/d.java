package com.swmansion.rnscreens.gamma.stack.screen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.r;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f25176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f25177h;

    public d(a stackScreen) {
        AbstractC2855l.g(stackScreen, "stackScreen");
        this.f25176g = stackScreen;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC2855l.g(inflater, "inflater");
        return this.f25176g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f25176g.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25177h = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC2855l.g(view, "view");
        super.onViewCreated(view, bundle);
        a aVar = this.f25176g;
        r viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC2855l.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f25177h = aVar.a(viewLifecycleOwner);
    }

    public final a w() {
        return this.f25176g;
    }
}
