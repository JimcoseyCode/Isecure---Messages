package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputLocalData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/widget/EditText;", "editText", "<init>", "(Landroid/widget/EditText;)V", "Li7/B;", "apply", "Landroid/text/SpannableStringBuilder;", ReactTextInputShadowNode.PROP_TEXT, "Landroid/text/SpannableStringBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "textSize", "F", PointerEventHelper.POINTER_TYPE_UNKNOWN, "minLines", "I", "maxLines", "inputType", "breakStrategy", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_PLACEHOLDER, "Ljava/lang/CharSequence;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextInputLocalData {
    private final int breakStrategy;
    private final int inputType;
    private final int maxLines;
    private final int minLines;
    private final CharSequence placeholder;
    private final SpannableStringBuilder text;
    private final float textSize;

    public ReactTextInputLocalData(EditText editText) {
        AbstractC2855l.g(editText, "editText");
        this.text = new SpannableStringBuilder(editText.getText());
        this.textSize = editText.getTextSize();
        this.minLines = editText.getMinLines();
        this.maxLines = editText.getMaxLines();
        this.inputType = editText.getInputType();
        this.breakStrategy = editText.getBreakStrategy();
        this.placeholder = editText.getHint();
    }

    public final void apply(EditText editText) {
        AbstractC2855l.g(editText, "editText");
        editText.setText(this.text);
        editText.setTextSize(0, this.textSize);
        editText.setMinLines(this.minLines);
        editText.setMaxLines(this.maxLines);
        editText.setInputType(this.inputType);
        editText.setHint(this.placeholder);
        editText.setBreakStrategy(this.breakStrategy);
    }
}
