package com.facebook.react.devsupport.perfmonitor;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.R;
import com.facebook.react.devsupport.interfaces.TracingState;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010(¨\u0006/"}, d2 = {"Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Li7/B;", "onButtonPress", "<init>", "(Landroid/content/Context;Lw7/a;)V", "Landroid/app/Dialog;", "createToolbarDialog", "()Landroid/app/Dialog;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "offsetX", "offsetY", "createAnchoredDialog", "(FF)Landroid/app/Dialog;", "Landroid/widget/LinearLayout;", "createInnerLayout", "()Landroid/widget/LinearLayout;", "dp", "dpToPx", "(F)F", "show", "()V", "hide", "Lcom/facebook/react/devsupport/interfaces/TracingState;", "state", "updateRecordingState", "(Lcom/facebook/react/devsupport/interfaces/TracingState;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "count", "updatePerfIssueCount", "(I)V", "Landroid/content/Context;", "Lw7/a;", "dialog", "Landroid/app/Dialog;", "Landroid/widget/TextView;", "statusIndicator", "Landroid/widget/TextView;", "statusLabel", "tooltipLabel", "issuesContainer", "Landroid/widget/LinearLayout;", "issueCountLabel", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PerfMonitorOverlayView {
    private final Context context;
    private final Dialog dialog;
    private TextView issueCountLabel;
    private LinearLayout issuesContainer;
    private final InterfaceC3487a onButtonPress;
    private TextView statusIndicator;
    private TextView statusLabel;
    private TextView tooltipLabel;
    private static final int COLOR_OVERLAY_BORDER = Color.parseColor("#6C6C6C");
    private static final float TEXT_SIZE_PRIMARY = 12.0f;
    private static final float TEXT_SIZE_ACCESSORY = 10.0f;
    private static final Typeface TYPEFACE_BOLD = Typeface.create("sans-serif", 1);

    public PerfMonitorOverlayView(Context context, InterfaceC3487a onButtonPress) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(onButtonPress, "onButtonPress");
        this.context = context;
        this.onButtonPress = onButtonPress;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        this.dialog = createToolbarDialog();
    }

    private final Dialog createAnchoredDialog(float offsetX, final float offsetY) {
        View decorView;
        final Dialog dialog = new Dialog(this.context, R.style.NoAnimationDialog);
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        dialog.setCancelable(false);
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            WindowManager.LayoutParams attributes = window3.getAttributes();
            if (attributes != null) {
                attributes.width = -2;
                attributes.height = -2;
                attributes.gravity = 8388661;
                attributes.x = (int) offsetX;
                attributes.y = (int) offsetY;
            } else {
                attributes = null;
            }
            window3.setAttributes(attributes);
        }
        Window window4 = dialog.getWindow();
        if (window4 != null && (decorView = window4.getDecorView()) != null) {
            AbstractC1658a0.w0(decorView, new I() { // from class: com.facebook.react.devsupport.perfmonitor.e
                @Override // androidx.core.view.I
                public final L0 a(View view, L0 l02) {
                    return PerfMonitorOverlayView.createAnchoredDialog$lambda$16$lambda$15(offsetY, dialog, view, l02);
                }
            });
        }
        return dialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 createAnchoredDialog$lambda$16$lambda$15(float f10, Dialog dialog, View view, L0 windowInsets) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(windowInsets, "windowInsets");
        x0.e eVarF = windowInsets.f(L0.p.g());
        AbstractC2855l.f(eVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC2855l.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        layoutParams2.y = eVarF.f33238b + ((int) f10);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setAttributes(layoutParams2);
        }
        return L0.f16462b;
    }

    private final LinearLayout createInnerLayout() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int iDpToPx = (int) dpToPx(14.0f);
        int iDpToPx2 = (int) dpToPx(7.0f);
        linearLayout.setPadding(iDpToPx, iDpToPx2, iDpToPx, iDpToPx2);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-16777216);
        gradientDrawable.setCornerRadius(dpToPx(14.5f));
        gradientDrawable.setAlpha(102);
        gradientDrawable.setStroke((int) dpToPx(1.0f), COLOR_OVERLAY_BORDER);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(new ColorDrawable() { // from class: com.facebook.react.devsupport.perfmonitor.PerfMonitorOverlayView$createInnerLayout$1$2
            {
                super(0);
            }

            @Override // android.graphics.drawable.Drawable
            public int getIntrinsicWidth() {
                return (int) this.this$0.dpToPx(10.0f);
            }
        });
        return linearLayout;
    }

    private final Dialog createToolbarDialog() {
        TextView textView = new TextView(this.context);
        textView.setWidth((int) dpToPx(12.0f));
        textView.setHeight((int) dpToPx(12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-65536);
        textView.setBackground(gradientDrawable);
        this.statusIndicator = textView;
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) dpToPx(2.0f), 0, 0, 0);
        TextView textView2 = new TextView(this.context);
        float f10 = TEXT_SIZE_PRIMARY;
        textView2.setTextSize(f10);
        textView2.setTextColor(-1);
        Typeface typeface = TYPEFACE_BOLD;
        textView2.setTypeface(typeface);
        this.statusLabel = textView2;
        TextView textView3 = new TextView(this.context);
        textView3.setTextSize(TEXT_SIZE_ACCESSORY);
        textView3.setTextColor(-1);
        textView3.setTypeface(typeface);
        this.tooltipLabel = textView3;
        TextView textView4 = this.statusLabel;
        WindowManager.LayoutParams layoutParams = null;
        if (textView4 == null) {
            AbstractC2855l.y("statusLabel");
            textView4 = null;
        }
        linearLayout.addView(textView4);
        TextView textView5 = this.tooltipLabel;
        if (textView5 == null) {
            AbstractC2855l.y("tooltipLabel");
            textView5 = null;
        }
        linearLayout.addView(textView5);
        LinearLayout linearLayout2 = new LinearLayout(this.context);
        linearLayout2.setPadding((int) dpToPx(8.0f), 0, 0, 0);
        linearLayout2.setVisibility(8);
        this.issuesContainer = linearLayout2;
        TextView textView6 = new TextView(this.context);
        textView6.setTextSize(f10);
        textView6.setTextColor(-1);
        textView6.setTypeface(typeface);
        Drawable drawable = textView6.getContext().getDrawable(android.R.drawable.ic_dialog_alert);
        if (drawable != null) {
            drawable.setBounds(0, 1, (int) dpToPx(f10), ((int) dpToPx(f10)) + 1);
        } else {
            drawable = null;
        }
        textView6.setCompoundDrawables(drawable, null, null, null);
        textView6.setCompoundDrawablePadding((int) dpToPx(6.0f));
        this.issueCountLabel = textView6;
        LinearLayout linearLayout3 = this.issuesContainer;
        if (linearLayout3 == null) {
            AbstractC2855l.y("issuesContainer");
            linearLayout3 = null;
        }
        TextView textView7 = this.issueCountLabel;
        if (textView7 == null) {
            AbstractC2855l.y("issueCountLabel");
            textView7 = null;
        }
        linearLayout3.addView(textView7);
        LinearLayout linearLayoutCreateInnerLayout = createInnerLayout();
        linearLayoutCreateInnerLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.perfmonitor.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PerfMonitorOverlayView.createToolbarDialog$lambda$8(this.f20381g, view);
            }
        });
        TextView textView8 = this.statusIndicator;
        if (textView8 == null) {
            AbstractC2855l.y("statusIndicator");
            textView8 = null;
        }
        linearLayoutCreateInnerLayout.addView(textView8);
        linearLayoutCreateInnerLayout.addView(linearLayout);
        LinearLayout linearLayout4 = this.issuesContainer;
        if (linearLayout4 == null) {
            AbstractC2855l.y("issuesContainer");
            linearLayout4 = null;
        }
        linearLayoutCreateInnerLayout.addView(linearLayout4);
        Dialog dialogCreateAnchoredDialog = createAnchoredDialog(dpToPx(12.0f), dpToPx(12.0f));
        dialogCreateAnchoredDialog.setContentView(linearLayoutCreateInnerLayout);
        Window window = dialogCreateAnchoredDialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.flags |= 8;
                layoutParams = attributes;
            }
            window.setAttributes(layoutParams);
        }
        return dialogCreateAnchoredDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createToolbarDialog$lambda$8(PerfMonitorOverlayView perfMonitorOverlayView, View view) {
        perfMonitorOverlayView.onButtonPress.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dpToPx(float dp) {
        return PixelUtil.toPixelFromDIP(dp);
    }

    public final void hide() {
        this.dialog.hide();
    }

    public final void show() {
        this.dialog.show();
    }

    public final void updatePerfIssueCount(int count) {
        TextView textView = this.issueCountLabel;
        LinearLayout linearLayout = null;
        if (textView == null) {
            AbstractC2855l.y("issueCountLabel");
            textView = null;
        }
        textView.setText(String.valueOf(count));
        LinearLayout linearLayout2 = this.issuesContainer;
        if (linearLayout2 == null) {
            AbstractC2855l.y("issuesContainer");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(count == 0 ? 8 : 0);
    }

    public final void updateRecordingState(TracingState state) {
        AbstractC2855l.g(state, "state");
        if (state == TracingState.ENABLEDINCDPMODE) {
            this.dialog.hide();
            return;
        }
        TextView textView = null;
        if (state == TracingState.ENABLEDINBACKGROUNDMODE) {
            TextView textView2 = this.statusIndicator;
            if (textView2 == null) {
                AbstractC2855l.y("statusIndicator");
                textView2 = null;
            }
            Drawable background = textView2.getBackground();
            AbstractC2855l.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setColor(-65536);
            TextView textView3 = this.statusLabel;
            if (textView3 == null) {
                AbstractC2855l.y("statusLabel");
                textView3 = null;
            }
            textView3.setText("Profiling Active");
            TextView textView4 = this.tooltipLabel;
            if (textView4 == null) {
                AbstractC2855l.y("tooltipLabel");
            } else {
                textView = textView4;
            }
            textView.setText(this.context.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? "Tap to open" : "Press ☰ to open");
        } else {
            TextView textView5 = this.statusIndicator;
            if (textView5 == null) {
                AbstractC2855l.y("statusIndicator");
                textView5 = null;
            }
            Drawable background2 = textView5.getBackground();
            AbstractC2855l.e(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background2).setColor(-7829368);
            TextView textView6 = this.statusLabel;
            if (textView6 == null) {
                AbstractC2855l.y("statusLabel");
                textView6 = null;
            }
            textView6.setText("Profiling Stopped");
            TextView textView7 = this.tooltipLabel;
            if (textView7 == null) {
                AbstractC2855l.y("tooltipLabel");
            } else {
                textView = textView7;
            }
            textView.setText(this.context.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? "Tap to restart" : "Press ☰ to restart");
        }
        this.dialog.show();
    }
}
