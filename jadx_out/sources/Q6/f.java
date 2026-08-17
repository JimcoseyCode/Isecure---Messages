package Q6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.swmansion.rnscreens.S;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9856a = new f();

    private f() {
    }

    public final S a(View view) {
        AbstractC2855l.g(view, "view");
        while (view != null) {
            if (view instanceof S) {
                return (S) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return null;
            }
            view = viewGroup.getChildAt(0);
        }
        return null;
    }

    public final ScrollView b(View view) {
        AbstractC2855l.g(view, "view");
        while (view != null) {
            if (view instanceof ScrollView) {
                return (ScrollView) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return null;
            }
            view = viewGroup.getChildAt(0);
        }
        return null;
    }
}
