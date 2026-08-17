package com.facebook.react.views.text.internal.span;

import android.text.SpannableStringBuilder;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/text/internal/span/SetSpanOperation;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.START, ViewProps.END, "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "what", "<init>", "(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V", "Landroid/text/SpannableStringBuilder;", "builder", "priorityIndex", "Li7/B;", "execute", "(Landroid/text/SpannableStringBuilder;I)V", "I", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetSpanOperation {
    public static final int SPAN_MAX_PRIORITY = 255;
    private static final String TAG = "SetSpanOperation";
    private final int end;
    private final int start;
    public final ReactSpan what;

    public SetSpanOperation(int i10, int i11, ReactSpan what) {
        AbstractC2855l.g(what, "what");
        this.start = i10;
        this.end = i11;
        this.what = what;
    }

    public final void execute(SpannableStringBuilder builder, int priorityIndex) {
        AbstractC2855l.g(builder, "builder");
        if (priorityIndex < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i10 = this.start == 0 ? 18 : 34;
        int i11 = 255 - priorityIndex;
        if (i11 < 0) {
            AbstractC2325a.I(TAG, "Text tree size exceeded the limit, styling may become unpredictable");
        }
        builder.setSpan(this.what, this.start, this.end, ((Math.max(i11, 0) << 16) & 16711680) | (i10 & (-16711681)));
    }
}
