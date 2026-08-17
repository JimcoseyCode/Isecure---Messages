package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/text/Spannable;", ReactTextInputShadowNode.PROP_TEXT, "Li7/B;", "onPostProcessSpannable", "(Landroid/text/Spannable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReactTextViewManagerCallback {
    void onPostProcessSpannable(Spannable text);
}
