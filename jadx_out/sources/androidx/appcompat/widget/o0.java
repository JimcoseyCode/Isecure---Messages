package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import f.AbstractC2571d;
import f.AbstractC2573f;
import f.AbstractC2574g;
import f.AbstractC2576i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f15059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f15060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f15061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f15062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f15063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f15064g;

    o0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f15061d = layoutParams;
        this.f15062e = new Rect();
        this.f15063f = new int[2];
        this.f15064g = new int[2];
        this.f15058a = context;
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC2574g.f26883s, (ViewGroup) null);
        this.f15059b = viewInflate;
        this.f15060c = (TextView) viewInflate.findViewById(AbstractC2573f.f26858t);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC2576i.f26899a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f15058a.getResources().getDimensionPixelOffset(AbstractC2571d.f26774k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f15058a.getResources().getDimensionPixelOffset(AbstractC2571d.f26773j);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f15058a.getResources().getDimensionPixelOffset(z10 ? AbstractC2571d.f26776m : AbstractC2571d.f26775l);
        View viewB = b(view);
        if (viewB == null) {
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f15062e);
        Rect rect = this.f15062e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f15058a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f15062e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f15064g);
        view.getLocationOnScreen(this.f15063f);
        int[] iArr = this.f15063f;
        int i13 = iArr[0];
        int[] iArr2 = this.f15064g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f15059b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f15059b.getMeasuredHeight();
        int i15 = this.f15063f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f15062e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f15058a.getSystemService("window")).removeView(this.f15059b);
        }
    }

    boolean d() {
        return this.f15059b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f15060c.setText(charSequence);
        a(view, i10, i11, z10, this.f15061d);
        ((WindowManager) this.f15058a.getSystemService("window")).addView(this.f15059b, this.f15061d);
    }
}
