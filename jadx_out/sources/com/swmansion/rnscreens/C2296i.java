package com.swmansion.rnscreens;

import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: com.swmansion.rnscreens.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2296i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fragment f25277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.activity.L f25278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25280d;

    public C2296i(Fragment fragment, androidx.activity.L onBackPressedCallback) {
        AbstractC2855l.g(fragment, "fragment");
        AbstractC2855l.g(onBackPressedCallback, "onBackPressedCallback");
        this.f25277a = fragment;
        this.f25278b = onBackPressedCallback;
        this.f25280d = true;
    }

    public final boolean a() {
        return this.f25280d;
    }

    public final void b() {
        androidx.activity.T onBackPressedDispatcher;
        if (this.f25279c || !this.f25280d) {
            return;
        }
        AbstractActivityC1749q activity = this.f25277a.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.p(this.f25277a, this.f25278b);
        }
        this.f25279c = true;
    }

    public final void c() {
        if (this.f25279c) {
            this.f25278b.remove();
            this.f25279c = false;
        }
    }

    public final void d(boolean z10) {
        this.f25280d = z10;
    }
}
