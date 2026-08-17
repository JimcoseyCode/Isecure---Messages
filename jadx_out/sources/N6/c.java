package N6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.V;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final Fragment a(View view) {
        AbstractC2855l.g(view, "<this>");
        try {
            return V.a(view);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static final ViewGroup b(View view) {
        AbstractC2855l.g(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final View c(View view) {
        AbstractC2855l.g(view, "<this>");
        ViewGroup viewGroupB = b(view);
        if (viewGroupB != null) {
            viewGroupB.endViewTransition(view);
            viewGroupB.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(0.0f);
        return view;
    }
}
