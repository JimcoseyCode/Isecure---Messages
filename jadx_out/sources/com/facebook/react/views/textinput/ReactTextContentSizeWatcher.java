package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;", "Lcom/facebook/react/views/textinput/ContentSizeWatcher;", "Lcom/facebook/react/views/textinput/ReactEditText;", "editText", "<init>", "(Lcom/facebook/react/views/textinput/ReactEditText;)V", "Li7/B;", "onLayout", "()V", "Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "surfaceId", "I", "previousContentWidth", "previousContentHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextContentSizeWatcher implements ContentSizeWatcher {
    private final ReactEditText editText;
    private final EventDispatcher eventDispatcher;
    private int previousContentHeight;
    private int previousContentWidth;
    private final int surfaceId;

    public ReactTextContentSizeWatcher(ReactEditText editText) {
        AbstractC2855l.g(editText, "editText");
        this.editText = editText;
        ReactContext reactContext = UIManagerHelper.getReactContext(editText);
        this.eventDispatcher = UIManagerHelper.getEventDispatcherForReactTag(reactContext, editText.getId());
        this.surfaceId = UIManagerHelper.getSurfaceId(reactContext);
    }

    @Override // com.facebook.react.views.textinput.ContentSizeWatcher
    public void onLayout() {
        int width = this.editText.getWidth();
        int height = this.editText.getHeight();
        if (this.editText.getLayout() != null) {
            width = this.editText.getCompoundPaddingLeft() + this.editText.getLayout().getWidth() + this.editText.getCompoundPaddingRight();
            height = this.editText.getCompoundPaddingTop() + this.editText.getLayout().getHeight() + this.editText.getCompoundPaddingBottom();
        }
        if (width == this.previousContentWidth && height == this.previousContentHeight) {
            return;
        }
        this.previousContentHeight = height;
        this.previousContentWidth = width;
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.dispatchEvent(new ReactContentSizeChangedEvent(this.surfaceId, this.editText.getId(), PixelUtil.toDIPFromPixel(width), PixelUtil.toDIPFromPixel(height)));
        }
    }
}
