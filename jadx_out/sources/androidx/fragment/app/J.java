package androidx.fragment.app;

import android.view.View;
import androidx.transition.C1787e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import m0.C2892a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f17376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f17377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L f17378c;

    static {
        J j10 = new J();
        f17376a = j10;
        f17377b = new K();
        f17378c = j10.b();
    }

    private J() {
    }

    public static final void a(Fragment inFragment, Fragment outFragment, boolean z10, C2892a sharedElements, boolean z11) {
        AbstractC2855l.g(inFragment, "inFragment");
        AbstractC2855l.g(outFragment, "outFragment");
        AbstractC2855l.g(sharedElements, "sharedElements");
        if (z10) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    private final L b() {
        try {
            AbstractC2855l.e(C1787e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (L) C1787e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(C2892a c2892a, C2892a namedViews) {
        AbstractC2855l.g(c2892a, "<this>");
        AbstractC2855l.g(namedViews, "namedViews");
        int size = c2892a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c2892a.j(size))) {
                c2892a.h(size);
            }
        }
    }

    public static final void d(List views, int i10) {
        AbstractC2855l.g(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
