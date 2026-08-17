package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f25204g;

    public e(a tabScreen) {
        AbstractC2855l.g(tabScreen, "tabScreen");
        this.f25204g = tabScreen;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC2855l.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.f25204g.c(this, newConfig);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC2855l.g(inflater, "inflater");
        return this.f25204g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f25204g.getEventEmitter$react_native_screens_release().d();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.f25204g.getEventEmitter$react_native_screens_release().b();
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        this.f25204g.getEventEmitter$react_native_screens_release().c();
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f25204g.getEventEmitter$react_native_screens_release().a();
        super.onStop();
    }

    public final a w() {
        return this.f25204g;
    }
}
