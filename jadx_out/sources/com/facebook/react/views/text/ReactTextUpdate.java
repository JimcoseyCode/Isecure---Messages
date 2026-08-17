package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001c\u0018\u0000 $2\u00020\u0001:\u0001$BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011BI\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0014B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0015J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u0006%"}, d2 = {"Lcom/facebook/react/views/text/ReactTextUpdate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, "Landroid/text/Spannable;", "jsEventCounter", PointerEventHelper.POINTER_TYPE_UNKNOWN, "containsImages", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.PADDING_LEFT, PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.PADDING_TOP, ViewProps.PADDING_RIGHT, ViewProps.PADDING_BOTTOM, ViewProps.TEXT_ALIGN, ViewProps.TEXT_BREAK_STRATEGY, "justificationMode", "<init>", "(Landroid/text/Spannable;IZFFFFIII)V", ViewProps.PADDING_START, ViewProps.PADDING_END, "(Landroid/text/Spannable;IZFFFFI)V", "(Landroid/text/Spannable;IZIII)V", "getText", "()Landroid/text/Spannable;", "getJsEventCounter", "()I", "getContainsImages", "()Z", "getPaddingLeft", "()F", "getPaddingTop", "getPaddingRight", "getPaddingBottom", "getTextAlign", "getTextBreakStrategy", "getJustificationMode", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean containsImages;
    private final int jsEventCounter;
    private final int justificationMode;
    private final float paddingBottom;
    private final float paddingLeft;
    private final float paddingRight;
    private final float paddingTop;
    private final Spannable text;
    private final int textAlign;
    private final int textBreakStrategy;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¨\u0006\r"}, d2 = {"Lcom/facebook/react/views/text/ReactTextUpdate$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "buildReactTextUpdateFromState", "Lcom/facebook/react/views/text/ReactTextUpdate;", ReactTextInputShadowNode.PROP_TEXT, "Landroid/text/Spannable;", "jsEventCounter", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.TEXT_ALIGN, ViewProps.TEXT_BREAK_STRATEGY, "justificationMode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReactTextUpdate buildReactTextUpdateFromState(Spannable text, int jsEventCounter, int textAlign, int textBreakStrategy, int justificationMode) {
            AbstractC2855l.g(text, "text");
            return new ReactTextUpdate(text, jsEventCounter, false, textAlign, textBreakStrategy, justificationMode);
        }

        private Companion() {
        }
    }

    public ReactTextUpdate(Spannable text, int i10, boolean z10, float f10, float f11, float f12, float f13, int i11, int i12, int i13) {
        AbstractC2855l.g(text, "text");
        this.text = text;
        this.jsEventCounter = i10;
        this.containsImages = z10;
        this.paddingLeft = f10;
        this.paddingTop = f11;
        this.paddingRight = f12;
        this.paddingBottom = f13;
        this.textAlign = i11;
        this.textBreakStrategy = i12;
        this.justificationMode = i13;
    }

    public static final ReactTextUpdate buildReactTextUpdateFromState(Spannable spannable, int i10, int i11, int i12, int i13) {
        return INSTANCE.buildReactTextUpdateFromState(spannable, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: containsImages, reason: from getter */
    public final boolean getContainsImages() {
        return this.containsImages;
    }

    public final boolean getContainsImages() {
        return this.containsImages;
    }

    public final int getJsEventCounter() {
        return this.jsEventCounter;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public final float getPaddingBottom() {
        return this.paddingBottom;
    }

    public final float getPaddingLeft() {
        return this.paddingLeft;
    }

    public final float getPaddingRight() {
        return this.paddingRight;
    }

    public final float getPaddingTop() {
        return this.paddingTop;
    }

    public final Spannable getText() {
        return this.text;
    }

    public final int getTextAlign() {
        return this.textAlign;
    }

    public final int getTextBreakStrategy() {
        return this.textBreakStrategy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactTextUpdate(Spannable text, int i10, boolean z10, float f10, float f11, float f12, float f13, int i11) {
        this(text, i10, z10, f10, f11, f12, f13, i11, 1, 0);
        AbstractC2855l.g(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactTextUpdate(Spannable text, int i10, boolean z10, int i11, int i12, int i13) {
        this(text, i10, z10, -1.0f, -1.0f, -1.0f, -1.0f, i11, i12, i13);
        AbstractC2855l.g(text, "text");
    }
}
