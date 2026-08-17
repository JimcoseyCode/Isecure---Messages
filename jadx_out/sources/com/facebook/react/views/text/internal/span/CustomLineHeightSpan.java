package com.facebook.react.views.text.internal.span;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "<init>", "(F)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.START, ViewProps.END, "spanstartv", "v", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "Li7/B;", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", ViewProps.LINE_HEIGHT, "I", "getLineHeight", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomLineHeightSpan implements LineHeightSpan, ReactSpan {
    private final int lineHeight;

    public CustomLineHeightSpan(float f10) {
        this.lineHeight = (int) Math.ceil(f10);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int v10, Paint.FontMetricsInt fm) {
        AbstractC2855l.g(text, "text");
        AbstractC2855l.g(fm, "fm");
        int i10 = this.lineHeight;
        double d10 = (i10 - ((-r9) + fm.descent)) / 2.0f;
        fm.ascent = fm.ascent - ((int) Math.ceil(d10));
        fm.descent += (int) Math.floor(d10);
        if (start == 0) {
            fm.top = fm.ascent;
        }
        if (end == text.length()) {
            fm.bottom = fm.descent;
        }
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }
}
