package com.facebook.react.packagerconnection;

import android.net.Uri;
import com.facebook.react.devsupport.inspector.DevSupportHttpClient;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import d2.AbstractC2325a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0002! B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/facebook/react/packagerconnection/JSPackagerClient;", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "clientId", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "settings", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/RequestHandler;", "requestHandlers", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;", "connectionCallback", "<init>", "(Ljava/lang/String;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;Ljava/util/Map;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "reason", "Li7/B;", "abortOnMessage", "(Ljava/lang/Object;Ljava/lang/String;)V", "init", "()V", "close", ReactTextInputShadowNode.PROP_TEXT, "onMessage", "(Ljava/lang/String;)V", "Lt9/k;", "bytes", "(Lt9/k;)V", "Ljava/util/Map;", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;", "webSocket", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;", "Companion", "ResponderImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSPackagerClient implements ReconnectingWebSocket.MessageCallback {
    private static final Companion Companion = new Companion(null);
    private static final int PROTOCOL_VERSION = 2;
    private static final String TAG;
    private final Map<String, RequestHandler> requestHandlers;
    private final ReconnectingWebSocket webSocket;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/packagerconnection/JSPackagerClient$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "PROTOCOL_VERSION", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/packagerconnection/JSPackagerClient$ResponderImpl;", "Lcom/facebook/react/packagerconnection/Responder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "<init>", "(Lcom/facebook/react/packagerconnection/JSPackagerClient;Ljava/lang/Object;)V", "result", "Li7/B;", "respond", "(Ljava/lang/Object;)V", "error", "Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class ResponderImpl implements Responder {
        private final Object id;
        final /* synthetic */ JSPackagerClient this$0;

        public ResponderImpl(JSPackagerClient jSPackagerClient, Object id) {
            AbstractC2855l.g(id, "id");
            this.this$0 = jSPackagerClient;
            this.id = id;
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void error(Object error) {
            AbstractC2855l.g(error, "error");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.id);
                jSONObject.put("error", error);
                ReconnectingWebSocket reconnectingWebSocket = this.this$0.webSocket;
                String string = jSONObject.toString();
                AbstractC2855l.f(string, "toString(...)");
                reconnectingWebSocket.sendMessage(string);
            } catch (Exception e10) {
                AbstractC2325a.n(JSPackagerClient.TAG, "Responding with error failed", e10);
            }
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void respond(Object result) {
            AbstractC2855l.g(result, "result");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.id);
                jSONObject.put("result", result);
                ReconnectingWebSocket reconnectingWebSocket = this.this$0.webSocket;
                String string = jSONObject.toString();
                AbstractC2855l.f(string, "toString(...)");
                reconnectingWebSocket.sendMessage(string);
            } catch (Exception e10) {
                AbstractC2325a.n(JSPackagerClient.TAG, "Responding failed", e10);
            }
        }
    }

    static {
        String simpleName = JSPackagerClient.class.getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        TAG = simpleName;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JSPackagerClient(String clientId, PackagerConnectionSettings settings, Map<String, ? extends RequestHandler> requestHandlers) {
        this(clientId, settings, requestHandlers, null, 8, null);
        AbstractC2855l.g(clientId, "clientId");
        AbstractC2855l.g(settings, "settings");
        AbstractC2855l.g(requestHandlers, "requestHandlers");
    }

    private final void abortOnMessage(Object id, String reason) {
        if (id != null) {
            new ResponderImpl(this, id).error(reason);
        }
        AbstractC2325a.m(TAG, "Handling the message failed with reason: " + reason);
    }

    public final void close() {
        this.webSocket.closeQuietly();
    }

    public final void init() {
        this.webSocket.connect();
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(String text) {
        AbstractC2855l.g(text, "text");
        try {
            JSONObject jSONObject = new JSONObject(text);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString("method");
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                AbstractC2325a.m(TAG, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                abortOnMessage(objOpt, "No method provided");
                return;
            }
            RequestHandler requestHandler = this.requestHandlers.get(strOptString);
            if (requestHandler == null) {
                abortOnMessage(objOpt, "No request handler for method: " + strOptString);
                return;
            }
            if (objOpt == null) {
                requestHandler.onNotification(objOpt2);
            } else {
                requestHandler.onRequest(objOpt2, new ResponderImpl(this, objOpt));
            }
        } catch (Exception e10) {
            AbstractC2325a.n(TAG, "Handling the message failed", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSPackagerClient(String clientId, PackagerConnectionSettings settings, Map<String, ? extends RequestHandler> requestHandlers, ReconnectingWebSocket.ConnectionCallback connectionCallback) {
        AbstractC2855l.g(clientId, "clientId");
        AbstractC2855l.g(settings, "settings");
        AbstractC2855l.g(requestHandlers, "requestHandlers");
        this.requestHandlers = requestHandlers;
        String string = new Uri.Builder().scheme(DevSupportHttpClient.INSTANCE.wsScheme$ReactAndroid_release(settings.getDebugServerHost())).encodedAuthority(settings.getDebugServerHost()).appendPath("message").appendQueryParameter("device", AndroidInfoHelpers.getFriendlyDeviceName()).appendQueryParameter("app", settings.getPackageName()).appendQueryParameter("clientid", clientId).build().toString();
        AbstractC2855l.f(string, "toString(...)");
        this.webSocket = new ReconnectingWebSocket(string, this, connectionCallback);
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(k bytes) {
        AbstractC2855l.g(bytes, "bytes");
        AbstractC2325a.I(TAG, "Websocket received message with payload of unexpected type binary");
    }

    public /* synthetic */ JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map map, ReconnectingWebSocket.ConnectionCallback connectionCallback, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, packagerConnectionSettings, map, (i10 & 8) != 0 ? null : connectionCallback);
    }
}
