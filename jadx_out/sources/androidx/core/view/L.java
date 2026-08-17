package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class L implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f16459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewTreeObserver f16460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f16461i;

    private L(View view, Runnable runnable) {
        this.f16459g = view;
        this.f16460h = view.getViewTreeObserver();
        this.f16461i = runnable;
    }

    public static L a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        L l10 = new L(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(l10);
        view.addOnAttachStateChangeListener(l10);
        return l10;
    }

    public void b() {
        if (this.f16460h.isAlive()) {
            this.f16460h.removeOnPreDrawListener(this);
        } else {
            this.f16459g.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f16459g.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f16461i.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f16460h = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
