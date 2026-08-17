package Q6;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.ReactRootView;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9854a = new b();

    private b() {
    }

    private final FragmentManager b(ReactRootView reactRootView) {
        boolean z10;
        Context context = reactRootView.getContext();
        while (true) {
            z10 = context instanceof AbstractActivityC1749q;
            if (z10 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z10) {
            throw new IllegalStateException("[RNScreens] In order to use react-native-screens components your app's activity need to extend ReactActivity");
        }
        AbstractActivityC1749q abstractActivityC1749q = (AbstractActivityC1749q) context;
        if (abstractActivityC1749q.getSupportFragmentManager().v0().isEmpty()) {
            return abstractActivityC1749q.getSupportFragmentManager();
        }
        try {
            return FragmentManager.h0(reactRootView).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            return abstractActivityC1749q.getSupportFragmentManager();
        }
    }

    public final FragmentManager a(ViewGroup view) {
        boolean z10;
        AbstractC2855l.g(view, "view");
        ViewParent viewParent = view;
        while (true) {
            z10 = viewParent instanceof ReactRootView;
            if (z10 || (viewParent instanceof O6.a) || viewParent.getParent() == null) {
                break;
            }
            ViewParent parent = viewParent.getParent();
            AbstractC2855l.f(parent, "getParent(...)");
            viewParent = parent;
        }
        if (!(viewParent instanceof O6.a)) {
            if (z10) {
                return b((ReactRootView) viewParent);
            }
            throw new IllegalStateException(("[RNScreens] Expected parent to be a ReactRootView, instead found: " + viewParent.getClass().getName()).toString());
        }
        Fragment associatedFragment = ((O6.a) viewParent).getAssociatedFragment();
        if (associatedFragment != null) {
            return associatedFragment.getChildFragmentManager();
        }
        throw new IllegalStateException(("[RNScreens] Parent fragment providing view " + viewParent + " returned nullish fragment").toString());
    }
}
