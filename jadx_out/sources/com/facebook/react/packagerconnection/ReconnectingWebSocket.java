package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.devsupport.inspector.DevSupportHttpClient;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import d2.AbstractC2325a;
import e9.B;
import e9.D;
import e9.H;
import e9.I;
import e9.z;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 ;2\u00020\u0001:\u0003<=;B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\fJ\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b \u0010$J'\u0010(\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010*\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\"¢\u0006\u0004\b*\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010:¨\u0006>"}, d2 = {"Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;", "Le9/I;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;", "messageCallback", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;", "connectionCallback", "<init>", "(Ljava/lang/String;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;)V", "Li7/B;", "delayedReconnect", "()V", "reconnect", "closeWebSocketQuietly", "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "abort", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "connect", "closeQuietly", "Le9/H;", "webSocket", "Le9/D;", "response", "onOpen", "(Le9/H;Le9/D;)V", "t", "onFailure", "(Le9/H;Ljava/lang/Throwable;Le9/D;)V", ReactTextInputShadowNode.PROP_TEXT, "onMessage", "(Le9/H;Ljava/lang/String;)V", "Lt9/k;", "bytes", "(Le9/H;Lt9/k;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "code", "reason", "onClosed", "(Le9/H;ILjava/lang/String;)V", "sendMessage", "(Ljava/lang/String;)V", "(Lt9/k;)V", "Ljava/lang/String;", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Le9/z;", "okHttpClient", "Le9/z;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "closed", "Z", "suppressConnectionErrors", "Le9/H;", "Companion", "MessageCallback", "ConnectionCallback", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReconnectingWebSocket extends I {
    private static final Companion Companion = new Companion(null);
    private static final long RECONNECT_DELAY_MS = 2000;
    private static final String TAG;
    private boolean closed;
    private final ConnectionCallback connectionCallback;
    private final Handler handler;
    private MessageCallback messageCallback;
    private final z okHttpClient;
    private boolean suppressConnectionErrors;
    private final String url;
    private H webSocket;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "RECONNECT_DELAY_MS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "onConnected", "()V", "onDisconnected", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConnectionCallback {
        void onConnected();

        void onDisconnected();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, "Li7/B;", "onMessage", "(Ljava/lang/String;)V", "Lt9/k;", "bytes", "(Lt9/k;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MessageCallback {
        void onMessage(String text);

        void onMessage(k bytes);
    }

    static {
        String simpleName = ReconnectingWebSocket.class.getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        TAG = simpleName;
    }

    public ReconnectingWebSocket(String url, MessageCallback messageCallback, ConnectionCallback connectionCallback) {
        AbstractC2855l.g(url, "url");
        this.url = url;
        this.messageCallback = messageCallback;
        this.connectionCallback = connectionCallback;
        this.handler = new Handler(Looper.getMainLooper());
        this.okHttpClient = DevSupportHttpClient.INSTANCE.getWebsocketClient$ReactAndroid_release();
    }

    private final void abort(String message, Throwable cause) {
        AbstractC2325a.n(TAG, "Error occurred, shutting down websocket connection: " + message, cause);
        closeWebSocketQuietly();
    }

    private final void closeWebSocketQuietly() {
        try {
            H h10 = this.webSocket;
            if (h10 != null) {
                h10.d(ProgressBarContainerView.MAX_PROGRESS, "End of session");
            }
        } catch (Exception unused) {
        }
        this.webSocket = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void delayedReconnect() {
        if (!this.closed) {
            connect();
        }
    }

    private final void reconnect() {
        if (this.closed) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.suppressConnectionErrors) {
            AbstractC2325a.I(TAG, "Couldn't connect to \"" + this.url + "\", will silently retry");
            this.suppressConnectionErrors = true;
        }
        this.handler.postDelayed(new Runnable() { // from class: com.facebook.react.packagerconnection.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f20452g.delayedReconnect();
            }
        }, RECONNECT_DELAY_MS);
    }

    public final void closeQuietly() {
        this.closed = true;
        closeWebSocketQuietly();
        this.messageCallback = null;
        ConnectionCallback connectionCallback = this.connectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onDisconnected();
        }
    }

    public final void connect() {
        if (this.closed) {
            throw new IllegalStateException("Can't connect closed client");
        }
        this.okHttpClient.D(new B.a().m(this.url).b(), this);
    }

    @Override // e9.I
    public synchronized void onClosed(H webSocket, int code, String reason) {
        try {
            AbstractC2855l.g(webSocket, "webSocket");
            AbstractC2855l.g(reason, "reason");
            this.webSocket = null;
            if (!this.closed) {
                ConnectionCallback connectionCallback = this.connectionCallback;
                if (connectionCallback != null) {
                    connectionCallback.onDisconnected();
                }
                reconnect();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e9.I
    public synchronized void onFailure(H webSocket, Throwable t10, D response) {
        try {
            AbstractC2855l.g(webSocket, "webSocket");
            AbstractC2855l.g(t10, "t");
            if (this.webSocket != null) {
                abort("Websocket exception", t10);
            }
            if (!this.closed) {
                ConnectionCallback connectionCallback = this.connectionCallback;
                if (connectionCallback != null) {
                    connectionCallback.onDisconnected();
                }
                reconnect();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e9.I
    public synchronized void onMessage(H webSocket, String text) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(text, "text");
        MessageCallback messageCallback = this.messageCallback;
        if (messageCallback != null) {
            messageCallback.onMessage(text);
        }
    }

    @Override // e9.I
    public synchronized void onOpen(H webSocket, D response) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(response, "response");
        this.webSocket = webSocket;
        this.suppressConnectionErrors = false;
        ConnectionCallback connectionCallback = this.connectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onConnected();
        }
    }

    public final synchronized void sendMessage(String message) throws IOException {
        AbstractC2855l.g(message, "message");
        H h10 = this.webSocket;
        if (h10 == null) {
            throw new ClosedChannelException();
        }
        h10.send(message);
    }

    @Override // e9.I
    public synchronized void onMessage(H webSocket, k bytes) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(bytes, "bytes");
        MessageCallback messageCallback = this.messageCallback;
        if (messageCallback != null) {
            messageCallback.onMessage(bytes);
        }
    }

    public final synchronized void sendMessage(k message) throws IOException {
        AbstractC2855l.g(message, "message");
        H h10 = this.webSocket;
        if (h10 == null) {
            throw new ClosedChannelException();
        }
        h10.c(message);
    }
}
