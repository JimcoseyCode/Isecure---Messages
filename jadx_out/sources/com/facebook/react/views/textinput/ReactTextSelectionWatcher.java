package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextSelectionWatcher;", "Lcom/facebook/react/views/textinput/SelectionWatcher;", "Lcom/facebook/react/views/textinput/ReactEditText;", "editText", "<init>", "(Lcom/facebook/react/views/textinput/ReactEditText;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.START, ViewProps.END, "Li7/B;", "onSelectionChanged", "(II)V", "Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "surfaceId", "I", "previousSelectionStart", "previousSelectionEnd", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextSelectionWatcher implements SelectionWatcher {
    private final ReactEditText editText;
    private final EventDispatcher eventDispatcher;
    private int previousSelectionEnd;
    private int previousSelectionStart;
    private final int surfaceId;

    public ReactTextSelectionWatcher(ReactEditText editText) {
        AbstractC2855l.g(editText, "editText");
        this.editText = editText;
        ReactContext reactContext = UIManagerHelper.getReactContext(editText);
        this.eventDispatcher = UIManagerHelper.getEventDispatcherForReactTag(reactContext, editText.getId());
        this.surfaceId = UIManagerHelper.getSurfaceId(reactContext);
    }

    @Override // com.facebook.react.views.textinput.SelectionWatcher
    public void onSelectionChanged(int start, int end) {
        double d10 = start;
        double d11 = end;
        int iMin = (int) Math.min(d10, d11);
        int iMax = (int) Math.max(d10, d11);
        if (this.previousSelectionStart == iMin && this.previousSelectionEnd == iMax) {
            return;
        }
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.dispatchEvent(new ReactTextInputSelectionEvent(this.surfaceId, this.editText.getId(), iMin, iMax));
        }
        this.previousSelectionStart = iMin;
        this.previousSelectionEnd = iMax;
    }
}
