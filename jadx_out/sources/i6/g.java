package I6;

import I6.g;
import O8.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC1670g0;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5050a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SvgView b(View view) {
            SvgView svgView;
            if (view instanceof VirtualView) {
                svgView = ((VirtualView) view).getSvgView();
                AbstractC2855l.d(svgView);
            } else {
                AbstractC2855l.e(view, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                svgView = (SvgView) view;
            }
            while (true) {
                ViewParent parent = svgView.getParent();
                AbstractC2855l.f(parent, "getParent(...)");
                if (!e(parent)) {
                    return svgView;
                }
                if (svgView.getParent() instanceof VirtualView) {
                    ViewParent parent2 = svgView.getParent();
                    AbstractC2855l.e(parent2, "null cannot be cast to non-null type com.horcrux.svg.VirtualView");
                    svgView = ((VirtualView) parent2).getSvgView();
                    AbstractC2855l.d(svgView);
                } else {
                    ViewParent parent3 = svgView.getParent();
                    AbstractC2855l.e(parent3, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                    svgView = (SvgView) parent3;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(View it) {
            AbstractC2855l.g(it, "it");
            return it.getId();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean c(View view, float f10, float f11) {
            boolean z10;
            AbstractC2855l.g(view, "view");
            SvgView svgViewB = b(view);
            view.getLocationOnScreen(new int[]{0, 0});
            svgViewB.getLocationOnScreen(new int[]{0, 0});
            int iReactTagForTouch = svgViewB.reactTagForTouch((r2[0] + f10) - r3[0], (r2[1] + f11) - r3[1]);
            boolean z11 = view.getId() == iReactTagForTouch;
            double width = view.getWidth();
            double d10 = f10;
            if (0.0d > d10 || d10 > width) {
                z10 = false;
            } else {
                double height = view.getHeight();
                double d11 = f11;
                if (0.0d <= d11 && d11 <= height) {
                    z10 = true;
                }
            }
            if (view instanceof SvgView) {
                return (z11 || l.u(l.J(AbstractC1670g0.a((ViewGroup) view), new Function1() { // from class: I6.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(g.a.d((View) obj));
                    }
                }), Integer.valueOf(iReactTagForTouch))) && z10;
            }
            return z11 && z10;
        }

        public final boolean e(Object view) {
            AbstractC2855l.g(view, "view");
            return (view instanceof VirtualView) || (view instanceof SvgView);
        }

        private a() {
        }
    }
}
