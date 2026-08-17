package com.swmansion.rnscreens;

import android.view.View;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: com.swmansion.rnscreens.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2298k implements androidx.core.view.I, LifecycleEventListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f25286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f25287k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2298k f25283g = new C2298k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashSet f25284h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static WeakReference f25285i = new WeakReference(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f25288l = true;

    private C2298k() {
    }

    private final boolean c() {
        return !f25286j || f25285i.get() == null;
    }

    private final View d() {
        return (View) f25285i.get();
    }

    @Override // androidx.core.view.I
    public L0 a(View v10, L0 insets) {
        AbstractC2855l.g(v10, "v");
        AbstractC2855l.g(insets, "insets");
        L0 l0W = f25288l ? AbstractC1658a0.W(v10, insets) : insets;
        AbstractC2855l.d(l0W);
        Iterator it = f25284h.iterator();
        while (it.hasNext()) {
            l0W = ((androidx.core.view.I) it.next()).a(v10, insets);
            AbstractC2855l.f(l0W, "onApplyWindowInsets(...)");
        }
        return l0W;
    }

    public final void b(androidx.core.view.I listener) {
        AbstractC2855l.g(listener, "listener");
        f25284h.add(listener);
    }

    public final boolean e(View view) {
        AbstractC2855l.g(view, "view");
        if (!c()) {
            return false;
        }
        AbstractC1658a0.w0(view, this);
        f25285i = new WeakReference(view);
        f25286j = true;
        return true;
    }

    public final void f(ReactApplicationContext context) {
        AbstractC2855l.g(context, "context");
        f25287k = true;
        context.addLifecycleEventListener(this);
    }

    public final void g(androidx.core.view.I listener) {
        AbstractC2855l.g(listener, "listener");
        f25284h.remove(listener);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        View viewD = d();
        if (f25286j && viewD != null) {
            AbstractC1658a0.w0(viewD, null);
            f25286j = false;
            f25285i.clear();
        }
        f25287k = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
