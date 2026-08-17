package com.facebook.react.modules.core;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/WritableArray;", "timerIDs", "Li7/B;", "callTimers", "(Lcom/facebook/react/bridge/WritableArray;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "frameTime", "callIdleCallbacks", "(D)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "warningMessage", "emitTimeDriftWarning", "(Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface JavaScriptTimerExecutor {
    void callIdleCallbacks(double frameTime);

    void callTimers(WritableArray timerIDs);

    void emitTimeDriftWarning(String warningMessage);
}
