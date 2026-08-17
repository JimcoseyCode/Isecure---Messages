package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.B;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/unimplementedview/ReactUnimplementedView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Li7/B;", "setName$ReactAndroid_release", "(Ljava/lang/String;)V", "setName", "Landroidx/appcompat/widget/B;", "textView", "Landroidx/appcompat/widget/B;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactUnimplementedView extends LinearLayout {
    private final B textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactUnimplementedView(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
        B b10 = new B(context);
        this.textView = b10;
        b10.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        b10.setGravity(17);
        b10.setTextColor(-1);
        b10.setText(PointerEventHelper.POINTER_TYPE_UNKNOWN);
        if (ReactBuildConfig.DEBUG) {
            setBackgroundColor(1442775040);
        }
        setGravity(1);
        setOrientation(1);
        addView(b10);
    }

    public final void setName$ReactAndroid_release(String name) {
        AbstractC2855l.g(name, "name");
        if (ReactBuildConfig.DEBUG) {
            this.textView.setText("'" + name + "' is not registered.");
        }
    }
}
