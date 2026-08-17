package com.facebook.react.views.textinput;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputTextWatcher;", "Landroid/text/TextWatcher;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lcom/facebook/react/views/textinput/ReactEditText;", "editText", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "s", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.START, "count", "after", "Li7/B;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "surfaceId", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "previousText", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextInputTextWatcher implements TextWatcher {
    private final ReactEditText editText;
    private final EventDispatcher eventDispatcher;
    private String previousText;
    private final int surfaceId;

    public ReactTextInputTextWatcher(ReactContext reactContext, ReactEditText editText) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(editText, "editText");
        this.editText = editText;
        this.eventDispatcher = UIManagerHelper.getEventDispatcherForReactTag(reactContext, editText.getId());
        this.surfaceId = UIManagerHelper.getSurfaceId(reactContext);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s10) {
        AbstractC2855l.g(s10, "s");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s10, int start, int count, int after) {
        AbstractC2855l.g(s10, "s");
        this.previousText = s10.toString();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s10, int start, int before, int count) {
        AbstractC2855l.g(s10, "s");
        if (this.editText.getDisableTextDiffing()) {
            return;
        }
        if (count == 0 && before == 0) {
            return;
        }
        String strSubstring = s10.toString().substring(start, start + count);
        AbstractC2855l.f(strSubstring, "substring(...)");
        String str = this.previousText;
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strSubstring2 = str.substring(start, start + before);
        AbstractC2855l.f(strSubstring2, "substring(...)");
        if (count == before && AbstractC2855l.b(strSubstring, strSubstring2)) {
            return;
        }
        StateWrapper stateWrapper = this.editText.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("mostRecentEventCount", this.editText.incrementAndGetEventCounter());
            writableNativeMap.putInt("opaqueCacheId", this.editText.getId());
            stateWrapper.updateState(writableNativeMap);
        }
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.dispatchEvent(new ReactTextChangedEvent(this.surfaceId, this.editText.getId(), s10.toString(), this.editText.incrementAndGetEventCounter()));
        }
    }
}
