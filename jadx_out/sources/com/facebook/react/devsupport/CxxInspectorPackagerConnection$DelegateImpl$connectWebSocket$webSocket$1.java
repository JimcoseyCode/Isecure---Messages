package com.facebook.react.devsupport;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1", "Le9/I;", "Le9/H;", "webSocket", PointerEventHelper.POINTER_TYPE_UNKNOWN, "t", "Le9/D;", "response", "Li7/B;", "onFailure", "(Le9/H;Ljava/lang/Throwable;Le9/D;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, "onMessage", "(Le9/H;Ljava/lang/String;)V", "onOpen", "(Le9/H;Le9/D;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "code", "reason", "onClosed", "(Le9/H;ILjava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1 extends e9.I {
    final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate $delegate;
    final /* synthetic */ CxxInspectorPackagerConnection.DelegateImpl this$0;

    CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1(CxxInspectorPackagerConnection.DelegateImpl delegateImpl, CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        this.this$0 = delegateImpl;
        this.$delegate = webSocketDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClosed$lambda$3(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        webSocketDelegate.didClose();
        webSocketDelegate.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailure$lambda$0(Throwable th, CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        String message = th.getMessage();
        if (message == null) {
            message = "<Unknown error>";
        }
        webSocketDelegate.didFailWithError(null, message);
        webSocketDelegate.close();
    }

    @Override // e9.I
    public void onClosed(e9.H webSocket, int code, String reason) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(reason, "reason");
        CxxInspectorPackagerConnection.DelegateImpl delegateImpl = this.this$0;
        final CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.$delegate;
        delegateImpl.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.h
            @Override // java.lang.Runnable
            public final void run() {
                CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1.onClosed$lambda$3(webSocketDelegate);
            }
        }, 0L);
    }

    @Override // e9.I
    public void onFailure(e9.H webSocket, final Throwable t10, e9.D response) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(t10, "t");
        CxxInspectorPackagerConnection.DelegateImpl delegateImpl = this.this$0;
        final CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.$delegate;
        delegateImpl.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.g
            @Override // java.lang.Runnable
            public final void run() {
                CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1.onFailure$lambda$0(t10, webSocketDelegate);
            }
        }, 0L);
    }

    @Override // e9.I
    public void onMessage(e9.H webSocket, final String text) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(text, "text");
        CxxInspectorPackagerConnection.DelegateImpl delegateImpl = this.this$0;
        final CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.$delegate;
        delegateImpl.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.j
            @Override // java.lang.Runnable
            public final void run() {
                webSocketDelegate.didReceiveMessage(text);
            }
        }, 0L);
    }

    @Override // e9.I
    public void onOpen(e9.H webSocket, e9.D response) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(response, "response");
        CxxInspectorPackagerConnection.DelegateImpl delegateImpl = this.this$0;
        final CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.$delegate;
        delegateImpl.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.i
            @Override // java.lang.Runnable
            public final void run() {
                webSocketDelegate.didOpen();
            }
        }, 0L);
    }
}
