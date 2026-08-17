package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextScrollWatcher;", "Lcom/facebook/react/views/textinput/ScrollWatcher;", "Lcom/facebook/react/views/textinput/ReactEditText;", "editText", "<init>", "(Lcom/facebook/react/views/textinput/ReactEditText;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "horiz", "vert", "oldHoriz", "oldVert", "Li7/B;", "onScrollChanged", "(IIII)V", "Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "surfaceId", "I", "previousHorizontal", "previousVert", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextScrollWatcher implements ScrollWatcher {
    private final ReactEditText editText;
    private final EventDispatcher eventDispatcher;
    private int previousHorizontal;
    private int previousVert;
    private final int surfaceId;

    public ReactTextScrollWatcher(ReactEditText editText) {
        AbstractC2855l.g(editText, "editText");
        this.editText = editText;
        ReactContext reactContext = UIManagerHelper.getReactContext(editText);
        this.eventDispatcher = UIManagerHelper.getEventDispatcherForReactTag(reactContext, editText.getId());
        this.surfaceId = UIManagerHelper.getSurfaceId(reactContext);
    }

    @Override // com.facebook.react.views.textinput.ScrollWatcher
    public void onScrollChanged(int horiz, int vert, int oldHoriz, int oldVert) {
        if (this.previousHorizontal == horiz && this.previousVert == vert) {
            return;
        }
        ScrollEvent scrollEventObtain = ScrollEvent.INSTANCE.obtain(this.surfaceId, this.editText.getId(), ScrollEventType.SCROLL, horiz, vert, 0.0f, 0.0f, 0, 0, this.editText.getWidth(), this.editText.getHeight());
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.dispatchEvent(scrollEventObtain);
        }
        this.previousHorizontal = horiz;
        this.previousVert = vert;
    }
}
