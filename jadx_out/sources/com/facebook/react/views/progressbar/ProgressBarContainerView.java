package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.R;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\t\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\"\u0010)\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010/¨\u00061"}, d2 = {"Lcom/facebook/react/views/progressbar/ProgressBarContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/widget/ProgressBar;", "progressBar", "Li7/B;", "setColor", "(Landroid/widget/ProgressBar;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "apply$ReactAndroid_release", "()V", "apply", PointerEventHelper.POINTER_TYPE_UNKNOWN, "styleName", "setStyle$ReactAndroid_release", "(Ljava/lang/String;)V", "setStyle", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.COLOR, "Ljava/lang/Integer;", "getColor$ReactAndroid_release", "()Ljava/lang/Integer;", "setColor$ReactAndroid_release", "(Ljava/lang/Integer;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactProgressBarViewManager.PROP_INDETERMINATE, "Z", "getIndeterminate$ReactAndroid_release", "()Z", "setIndeterminate$ReactAndroid_release", "(Z)V", ReactProgressBarViewManager.PROP_ANIMATING, "getAnimating$ReactAndroid_release", "setAnimating$ReactAndroid_release", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactProgressBarViewManager.PROP_PROGRESS, "D", "getProgress$ReactAndroid_release", "()D", "setProgress$ReactAndroid_release", "(D)V", "Landroid/widget/ProgressBar;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgressBarContainerView extends FrameLayout {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_PROGRESS = 1000;
    private boolean animating;
    private Integer color;
    private boolean indeterminate;
    private double progress;
    private ProgressBar progressBar;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/progressbar/ProgressBarContainerView$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "MAX_PROGRESS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarContainerView(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
        this.indeterminate = true;
        this.animating = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.color;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void apply$ReactAndroid_release() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(this.indeterminate);
        setColor(progressBar);
        progressBar.setProgress((int) (this.progress * ((double) MAX_PROGRESS)));
        progressBar.setVisibility(this.animating ? 0 : 4);
    }

    /* JADX INFO: renamed from: getAnimating$ReactAndroid_release, reason: from getter */
    public final boolean getAnimating() {
        return this.animating;
    }

    /* JADX INFO: renamed from: getColor$ReactAndroid_release, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getIndeterminate$ReactAndroid_release, reason: from getter */
    public final boolean getIndeterminate() {
        return this.indeterminate;
    }

    /* JADX INFO: renamed from: getProgress$ReactAndroid_release, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        AbstractC2855l.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            info.setViewIdResourceName(str);
        }
    }

    public final void setAnimating$ReactAndroid_release(boolean z10) {
        this.animating = z10;
    }

    public final void setColor$ReactAndroid_release(Integer num) {
        this.color = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z10) {
        this.indeterminate = z10;
    }

    public final void setProgress$ReactAndroid_release(double d10) {
        this.progress = d10;
    }

    public final void setStyle$ReactAndroid_release(String styleName) {
        ReactProgressBarViewManager.Companion companion = ReactProgressBarViewManager.INSTANCE;
        ProgressBar progressBarCreateProgressBar = companion.createProgressBar(getContext(), companion.getStyleFromString$ReactAndroid_release(styleName));
        progressBarCreateProgressBar.setMax(MAX_PROGRESS);
        this.progressBar = progressBarCreateProgressBar;
        removeAllViews();
        addView(this.progressBar, new ViewGroup.LayoutParams(-1, -1));
    }
}
