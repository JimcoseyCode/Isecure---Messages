package com.facebook.react.modules.websocket;

import P8.q;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.CustomClientBuilder;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import d2.AbstractC2325a;
import e9.B;
import e9.D;
import e9.H;
import e9.I;
import e9.z;
import expo.modules.notifications.service.NotificationsService;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "WebSocketModule")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010(J\u001d\u0010*\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b*\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u0010/R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule;", "Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventName", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Li7/B;", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "message", "notifyWebSocketFailed", "(ILjava/lang/String;)V", "uri", "getCookie", "(Ljava/lang/String;)Ljava/lang/String;", "invalidate", "()V", "Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "contentHandler", "setContentHandler", "(ILcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;)V", "url", "Lcom/facebook/react/bridge/ReadableArray;", "protocols", "options", PointerEventHelper.POINTER_TYPE_UNKNOWN, "socketID", "connect", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D)V", "code", "reason", "close", "(DLjava/lang/String;D)V", "send", "(Ljava/lang/String;D)V", "base64String", "sendBinary", "Lt9/k;", "byteString", "(Lt9/k;I)V", "ping", "(D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Le9/H;", "webSocketConnections", "Ljava/util/Map;", "contentHandlers", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieHandler", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "Companion", "ContentHandler", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebSocketModule extends NativeWebSocketModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "WebSocketModule";
    private static CustomClientBuilder customClientBuilder;
    private final Map<Integer, ContentHandler> contentHandlers;
    private final ForwardingCookieHandler cookieHandler;
    private final Map<Integer, H> webSocketConnections;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Le9/z$a;", "builder", "Li7/B;", "applyCustomBuilder", "(Le9/z$a;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "uri", "getDefaultOrigin", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ccb", "setCustomClientBuilder", "(Lcom/facebook/react/modules/network/CustomClientBuilder;)V", "NAME", "Ljava/lang/String;", "customClientBuilder", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomBuilder(z.a builder) {
            CustomClientBuilder customClientBuilder = WebSocketModule.customClientBuilder;
            if (customClientBuilder != null) {
                customClientBuilder.apply(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getDefaultOrigin(String uri) {
            String scheme;
            try {
                URI uri2 = new URI(uri);
                String scheme2 = uri2.getScheme();
                if (scheme2 != null) {
                    int iHashCode = scheme2.hashCode();
                    scheme = "http";
                    if (iHashCode != 3804) {
                        if (iHashCode != 118039) {
                            if (iHashCode != 3213448) {
                                scheme = (iHashCode == 99617003 && scheme2.equals("https")) ? uri2.getScheme() : PointerEventHelper.POINTER_TYPE_UNKNOWN;
                            } else {
                                if (!scheme2.equals("http")) {
                                }
                            }
                        } else if (scheme2.equals("wss")) {
                            scheme = "https";
                        }
                    } else if (!scheme2.equals("ws")) {
                    }
                }
                if (uri2.getPort() != -1) {
                    kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
                    String str = String.format("%s://%s:%s", Arrays.copyOf(new Object[]{scheme, uri2.getHost(), Integer.valueOf(uri2.getPort())}, 3));
                    AbstractC2855l.f(str, "format(...)");
                    return str;
                }
                kotlin.jvm.internal.H h11 = kotlin.jvm.internal.H.f29375a;
                String str2 = String.format("%s://%s", Arrays.copyOf(new Object[]{scheme, uri2.getHost()}, 2));
                AbstractC2855l.f(str2, "format(...)");
                return str2;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("Unable to set " + uri + " as default origin header");
            }
        }

        public final void setCustomClientBuilder(CustomClientBuilder ccb) {
            WebSocketModule.customClientBuilder = ccb;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, "Lcom/facebook/react/bridge/WritableMap;", "params", "Li7/B;", "onMessage", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lt9/k;", "byteString", "(Lt9/k;Lcom/facebook/react/bridge/WritableMap;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ContentHandler {
        void onMessage(String text, WritableMap params);

        void onMessage(k byteString, WritableMap params);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketModule(ReactApplicationContext context) {
        super(context);
        AbstractC2855l.g(context, "context");
        this.webSocketConnections = new ConcurrentHashMap();
        this.contentHandlers = new ConcurrentHashMap();
        this.cookieHandler = new ForwardingCookieHandler();
    }

    private final String getCookie(String uri) {
        try {
            List<String> list = this.cookieHandler.get(new URI(INSTANCE.getDefaultOrigin(uri)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + uri);
        } catch (URISyntaxException unused2) {
            throw new IllegalArgumentException("Unable to get cookie from " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyWebSocketFailed(int id, String message) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", id);
        readableMapBuilder.put("message", message);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String eventName, ReadableMap params) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC2855l.f(reactApplicationContext, "getReactApplicationContext(...)");
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, params);
        }
    }

    public static final void setCustomClientBuilder(CustomClientBuilder customClientBuilder2) {
        INSTANCE.setCustomClientBuilder(customClientBuilder2);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String eventName) {
        AbstractC2855l.g(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double code, String reason, double socketID) {
        int i10 = (int) socketID;
        H h10 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (h10 == null) {
            return;
        }
        try {
            h10.d((int) code, reason);
            this.webSocketConnections.remove(Integer.valueOf(i10));
            this.contentHandlers.remove(Integer.valueOf(i10));
        } catch (Exception e10) {
            AbstractC2325a.n(ReactConstants.TAG, "Could not close WebSocket connection for id " + i10, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String url, ReadableArray protocols, ReadableMap options, double socketID) {
        boolean z10;
        AbstractC2855l.g(url, "url");
        final int i10 = (int) socketID;
        z.a aVarC = OkHttpClientProvider.getOkHttpClient().C();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        z.a aVarP = aVarC.f(10L, timeUnit).Q(10L, timeUnit).P(0L, TimeUnit.MINUTES);
        INSTANCE.applyCustomBuilder(aVarP);
        z zVarC = aVarP.c();
        B.a aVarM = new B.a().k(Integer.valueOf(i10)).m(url);
        String cookie = getCookie(url);
        if (cookie != null) {
            aVarM.a("Cookie", cookie);
        }
        if (options != null && options.hasKey("headers") && options.getType("headers") == ReadableType.Map) {
            ReadableMap map = options.getMap("headers");
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z10 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String == map.getType(strNextKey)) {
                    if (q.x(strNextKey, "origin", true)) {
                        z10 = true;
                    }
                    String string = map.getString(strNextKey);
                    if (string == null) {
                        throw new IllegalStateException(("value for name " + strNextKey + " == null").toString());
                    }
                    aVarM.a(strNextKey, string);
                } else {
                    AbstractC2325a.I(ReactConstants.TAG, "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            aVarM.a("origin", INSTANCE.getDefaultOrigin(url));
        }
        if (protocols != null && protocols.size() > 0) {
            StringBuilder sb = new StringBuilder(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            int size = protocols.size();
            for (int i11 = 0; i11 < size; i11++) {
                String string2 = protocols.getString(i11);
                String string3 = string2 != null ? q.c1(string2).toString() : null;
                if (!(string3 == null || string3.length() == 0) && !q.Q(string3, ",", false, 2, null)) {
                    sb.append(string3);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), PointerEventHelper.POINTER_TYPE_UNKNOWN);
                String string4 = sb.toString();
                AbstractC2855l.f(string4, "toString(...)");
                aVarM.a("Sec-WebSocket-Protocol", string4);
            }
        }
        zVarC.D(aVarM.b(), new I() { // from class: com.facebook.react.modules.websocket.WebSocketModule.connect.2
            @Override // e9.I
            public void onClosed(H webSocket, int code, String reason) {
                AbstractC2855l.g(webSocket, "webSocket");
                AbstractC2855l.g(reason, "reason");
                int i12 = i10;
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                readableMapBuilder.put("id", i12);
                readableMapBuilder.put("code", code);
                readableMapBuilder.put("reason", reason);
                WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
            }

            @Override // e9.I
            public void onClosing(H websocket, int code, String reason) {
                AbstractC2855l.g(websocket, "websocket");
                AbstractC2855l.g(reason, "reason");
                websocket.d(code, reason);
            }

            @Override // e9.I
            public void onFailure(H webSocket, Throwable t10, D response) {
                AbstractC2855l.g(webSocket, "webSocket");
                AbstractC2855l.g(t10, "t");
                WebSocketModule.this.notifyWebSocketFailed(i10, t10.getMessage());
            }

            @Override // e9.I
            public void onMessage(H webSocket, String text) {
                AbstractC2855l.g(webSocket, "webSocket");
                AbstractC2855l.g(text, "text");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i10);
                writableMapCreateMap.putString(NotificationsService.EVENT_TYPE_KEY, ReactTextInputShadowNode.PROP_TEXT);
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.contentHandlers.get(Integer.valueOf(i10));
                if (contentHandler != null) {
                    contentHandler.onMessage(text, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString("data", text);
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }

            @Override // e9.I
            public void onOpen(H webSocket, D response) {
                AbstractC2855l.g(webSocket, "webSocket");
                AbstractC2855l.g(response, "response");
                WebSocketModule.this.webSocketConnections.put(Integer.valueOf(i10), webSocket);
                int i12 = i10;
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                readableMapBuilder.put("id", i12);
                readableMapBuilder.put("protocol", response.X("Sec-WebSocket-Protocol", PointerEventHelper.POINTER_TYPE_UNKNOWN));
                WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
            }

            @Override // e9.I
            public void onMessage(H webSocket, k bytes) {
                AbstractC2855l.g(webSocket, "webSocket");
                AbstractC2855l.g(bytes, "bytes");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i10);
                writableMapCreateMap.putString(NotificationsService.EVENT_TYPE_KEY, "binary");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.contentHandlers.get(Integer.valueOf(i10));
                if (contentHandler != null) {
                    contentHandler.onMessage(bytes, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString("data", bytes.j());
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<H> it = this.webSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().d(1001, null);
        }
        this.webSocketConnections.clear();
        this.contentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double socketID) {
        int i10 = (int) socketID;
        H h10 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (h10 != null) {
            try {
                h10.c(k.f32604k);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i10);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String message, double socketID) {
        AbstractC2855l.g(message, "message");
        int i10 = (int) socketID;
        H h10 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (h10 != null) {
            try {
                h10.send(message);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i10);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String base64String, double socketID) {
        AbstractC2855l.g(base64String, "base64String");
        int i10 = (int) socketID;
        H h10 = this.webSocketConnections.get(Integer.valueOf(i10));
        if (h10 != null) {
            try {
                k kVarA = k.f32603j.a(base64String);
                if (kVarA == null) {
                    throw new IllegalStateException("bytes == null");
                }
                h10.c(kVarA);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i10);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    public final void setContentHandler(int id, ContentHandler contentHandler) {
        if (contentHandler == null) {
            this.contentHandlers.remove(Integer.valueOf(id));
        } else {
            this.contentHandlers.put(Integer.valueOf(id), contentHandler);
        }
    }

    public final void sendBinary(k byteString, int id) {
        AbstractC2855l.g(byteString, "byteString");
        H h10 = this.webSocketConnections.get(Integer.valueOf(id));
        if (h10 == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("id", id);
            readableMapBuilder.put("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
            readableMapBuilder2.put("id", id);
            readableMapBuilder2.put("code", 0);
            readableMapBuilder2.put("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.webSocketConnections.remove(Integer.valueOf(id));
            this.contentHandlers.remove(Integer.valueOf(id));
            return;
        }
        try {
            h10.c(byteString);
        } catch (Exception e10) {
            notifyWebSocketFailed(id, e10.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double count) {
    }
}
