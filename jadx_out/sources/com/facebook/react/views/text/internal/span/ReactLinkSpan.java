package com.facebook.react.views.text.internal.span;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.PreparedLayout;
import com.facebook.react.views.text.PreparedLayoutTextView;
import com.facebook.react.views.view.ViewGroupClickEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/text/internal/span/ReactLinkSpan;", "Landroid/text/style/ClickableSpan;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fragmentIndex", "<init>", "(I)V", "Landroid/view/View;", "view", "Li7/B;", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "I", "getFragmentIndex", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactLinkSpan extends ClickableSpan implements ReactSpan {
    private final int fragmentIndex;

    public ReactLinkSpan(int i10) {
        this.fragmentIndex = i10;
    }

    public final int getFragmentIndex() {
        return this.fragmentIndex;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        PreparedLayout preparedLayout;
        int i10;
        EventDispatcher eventDispatcherForReactTag;
        AbstractC2855l.g(view, "view");
        Context context = view.getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        PreparedLayoutTextView preparedLayoutTextView = view instanceof PreparedLayoutTextView ? (PreparedLayoutTextView) view : null;
        if (preparedLayoutTextView == null || (preparedLayout = preparedLayoutTextView.getPreparedLayout()) == null || (eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, (i10 = preparedLayout.getReactTags()[this.fragmentIndex]))) == null) {
            return;
        }
        eventDispatcherForReactTag.dispatchEvent(new ViewGroupClickEvent(UIManagerHelper.getSurfaceId(reactContext), i10));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        AbstractC2855l.g(ds, "ds");
    }
}
