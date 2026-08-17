package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import com.facebook.react.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/devsupport/LogBoxDialog;", "Landroid/app/Dialog;", "Landroid/app/Activity;", "context", "Landroid/view/View;", "reactRootView", "<init>", "(Landroid/app/Activity;Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "Li7/B;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogBoxDialog extends Dialog {
    private final View reactRootView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxDialog(Activity context, View view) {
        super(context, R.style.Theme_Catalyst_LogBox);
        AbstractC2855l.g(context, "context");
        this.reactRootView = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 onCreate$lambda$3$lambda$1(int i10, View view, L0 windowInsets) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(windowInsets, "windowInsets");
        x0.e eVarF = windowInsets.f(i10);
        AbstractC2855l.f(eVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC2855l.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(eVarF.f33237a, eVarF.f33238b, eVarF.f33239c, eVarF.f33240d);
        return L0.f16462b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 onCreate$lambda$3$lambda$2(Function2 function2, View p02, L0 p12) {
        AbstractC2855l.g(p02, "p0");
        AbstractC2855l.g(p12, "p1");
        return (L0) function2.invoke(p02, p12);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.reactRootView;
        if (view != null) {
            final int iG = L0.p.g() | L0.p.a();
            final Function2 function2 = new Function2() { // from class: com.facebook.react.devsupport.X
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LogBoxDialog.onCreate$lambda$3$lambda$1(iG, (View) obj, (L0) obj2);
                }
            };
            AbstractC1658a0.w0(view, new androidx.core.view.I() { // from class: com.facebook.react.devsupport.Y
                @Override // androidx.core.view.I
                public final L0 a(View view2, L0 l02) {
                    return LogBoxDialog.onCreate$lambda$3$lambda$2(function2, view2, l02);
                }
            });
        }
    }
}
