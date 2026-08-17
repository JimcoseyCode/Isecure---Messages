package com.facebook.react.views.textinput;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;", "Landroid/view/inputmethod/InputConnectionWrapper;", "Landroid/view/inputmethod/InputConnection;", "target", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lcom/facebook/react/views/textinput/ReactEditText;", "editText", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "<init>", "(Landroid/view/inputmethod/InputConnection;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/uimanager/events/EventDispatcher;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "inputKey", "Li7/B;", "dispatchKeyEventOrEnqueue", "(Ljava/lang/String;)V", "dispatchKeyEvent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "beginBatchEdit", "()Z", "endBatchEdit", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, PointerEventHelper.POINTER_TYPE_UNKNOWN, "newCursorPosition", "setComposingText", "(Ljava/lang/CharSequence;I)Z", "commitText", "beforeLength", "afterLength", "deleteSurroundingText", "(II)Z", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "isBatchEdit", "Z", "key", "Ljava/lang/String;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactEditTextInputConnectionWrapper extends InputConnectionWrapper {
    public static final String BACKSPACE_KEY_VALUE = "Backspace";
    public static final String ENTER_KEY_VALUE = "Enter";
    public static final String NEWLINE_RAW_VALUE = "\n";
    private final ReactEditText editText;
    private final EventDispatcher eventDispatcher;
    private boolean isBatchEdit;
    private String key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactEditTextInputConnectionWrapper(InputConnection target, ReactContext reactContext, ReactEditText editText, EventDispatcher eventDispatcher) {
        super(target, false);
        AbstractC2855l.g(target, "target");
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(editText, "editText");
        AbstractC2855l.g(eventDispatcher, "eventDispatcher");
        this.editText = editText;
        this.eventDispatcher = eventDispatcher;
    }

    private final void dispatchKeyEvent(String inputKey) {
        if (AbstractC2855l.b(inputKey, NEWLINE_RAW_VALUE)) {
            inputKey = ENTER_KEY_VALUE;
        }
        this.eventDispatcher.dispatchEvent(new ReactTextInputKeyPressEvent(UIManagerHelper.getSurfaceId(this.editText), this.editText.getId(), inputKey));
    }

    private final void dispatchKeyEventOrEnqueue(String inputKey) {
        if (this.isBatchEdit) {
            this.key = inputKey;
        } else {
            dispatchKeyEvent(inputKey);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.isBatchEdit = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        AbstractC2855l.g(text, "text");
        String string = text.toString();
        if (string.length() <= 2) {
            if (string.length() == 0) {
                string = BACKSPACE_KEY_VALUE;
            }
            dispatchKeyEventOrEnqueue(string);
        }
        return super.commitText(text, newCursorPosition);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        dispatchKeyEvent(BACKSPACE_KEY_VALUE);
        return super.deleteSurroundingText(beforeLength, afterLength);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.isBatchEdit = false;
        String str = this.key;
        if (str != null) {
            dispatchKeyEvent(str);
            this.key = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        AbstractC2855l.g(event, "event");
        if (event.getAction() == 0) {
            int unicodeChar = event.getUnicodeChar();
            boolean z10 = false;
            if (48 <= unicodeChar && unicodeChar < 58) {
                z10 = true;
            }
            int keyCode = event.getKeyCode();
            if (keyCode == 66) {
                dispatchKeyEvent(ENTER_KEY_VALUE);
            } else if (keyCode == 67) {
                dispatchKeyEvent(BACKSPACE_KEY_VALUE);
            } else if (z10) {
                dispatchKeyEvent(String.valueOf(event.getNumber()));
            }
        }
        return super.sendKeyEvent(event);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        String strValueOf;
        AbstractC2855l.g(text, "text");
        int selectionStart = this.editText.getSelectionStart();
        int selectionEnd = this.editText.getSelectionEnd();
        boolean composingText = super.setComposingText(text, newCursorPosition);
        int selectionStart2 = this.editText.getSelectionStart();
        boolean z10 = selectionStart == selectionEnd;
        boolean z11 = selectionStart2 == selectionStart;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0 || (!z10 && z11)) {
            strValueOf = BACKSPACE_KEY_VALUE;
        } else {
            Editable text2 = this.editText.getText();
            strValueOf = String.valueOf(text2 != null ? Character.valueOf(text2.charAt(selectionStart2 - 1)) : null);
        }
        dispatchKeyEventOrEnqueue(strValueOf);
        return composingText;
    }
}
