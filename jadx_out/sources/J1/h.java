package J1;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.S;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f5329a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f5330b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f5331g;

        /* JADX INFO: renamed from: J1.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class RunnableC0055a implements Runnable {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f5333g;

            RunnableC0055a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f5333g = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                S.b().h();
                h.this.f5330b = true;
                h.b(a.this.f5331g, this.f5333g);
                h.this.f5329a.clear();
            }
        }

        a(View view) {
            this.f5331g = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Q1.l.w(new RunnableC0055a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // J1.i
    public void a(Activity activity) {
        if (!this.f5330b && this.f5329a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
