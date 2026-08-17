package B6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.AbstractC2855l;
import r6.AbstractC3277f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ReactViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f365j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f362g = reactContext;
    }

    private final void c() {
        ScrollView scrollViewD = d(this);
        if (scrollViewD == null) {
            return;
        }
        scrollViewD.setClipToPadding(false);
        int iB = (int) AbstractC3277f.b((float) this.f364i);
        View childAt = scrollViewD.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTranslationY(iB);
        scrollViewD.setPadding(scrollViewD.getPaddingLeft(), scrollViewD.getPaddingTop(), scrollViewD.getPaddingRight(), (int) AbstractC3277f.b((float) (this.f363h + this.f364i)));
        int i10 = iB - this.f365j;
        if (i10 != 0) {
            scrollViewD.scrollBy(0, i10);
        }
        this.f365j = iB;
    }

    private final ScrollView d(View view) {
        if (view instanceof ScrollView) {
            return (ScrollView) view;
        }
        ScrollView scrollViewD = null;
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount() || scrollViewD != null) {
                    break;
                }
                scrollViewD = d(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        return scrollViewD;
    }

    public final ThemedReactContext getReactContext() {
        return this.f362g;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    public final void setContentInsetBottom(double d10) {
        this.f363h = d10;
        c();
    }

    public final void setContentInsetTop(double d10) {
        this.f364i = d10;
        c();
    }

    public final void setApplyWorkaroundForContentInsetHitTestBug(boolean z10) {
    }
}
