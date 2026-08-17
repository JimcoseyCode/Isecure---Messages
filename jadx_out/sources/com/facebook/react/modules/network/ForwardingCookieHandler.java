package com.facebook.react.modules.network;

import P8.q;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0003J#\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "Ljava/net/CookieHandler;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "(Lcom/facebook/react/bridge/ReactContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "cookie", "Li7/B;", "addCookieAsync", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URI;", "uri", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "headers", "get", "(Ljava/net/URI;Ljava/util/Map;)Ljava/util/Map;", "put", "(Ljava/net/URI;Ljava/util/Map;)V", "Lcom/facebook/react/bridge/Callback;", "callback", "clearCookies", "(Lcom/facebook/react/bridge/Callback;)V", "destroy", "cookies", "addCookies", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/webkit/CookieManager;", "cookieManager", "Landroid/webkit/CookieManager;", "getCookieManager", "()Landroid/webkit/CookieManager;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ForwardingCookieHandler extends CookieHandler {
    private static final String COOKIE_HEADER = "Cookie";
    private static final Companion Companion = new Companion(null);
    private static final String VERSION_ONE_HEADER = "Set-cookie2";
    private static final String VERSION_ZERO_HEADER = "Set-cookie";
    private CookieManager cookieManager;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/modules/network/ForwardingCookieHandler$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "VERSION_ZERO_HEADER", PointerEventHelper.POINTER_TYPE_UNKNOWN, "VERSION_ONE_HEADER", "COOKIE_HEADER", "isCookieHeader", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isCookieHeader(String name) {
            return q.x(name, ForwardingCookieHandler.VERSION_ZERO_HEADER, true) || q.x(name, ForwardingCookieHandler.VERSION_ONE_HEADER, true);
        }

        private Companion() {
        }
    }

    public ForwardingCookieHandler() {
    }

    private final void addCookieAsync(String url, String cookie) {
        CookieManager cookieManager = getCookieManager();
        if (cookieManager != null) {
            cookieManager.setCookie(url, cookie, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearCookies$lambda$0(Callback callback, Boolean bool) {
        callback.invoke(bool);
    }

    private final CookieManager getCookieManager() {
        if (this.cookieManager == null) {
            try {
                this.cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.cookieManager;
    }

    public final void addCookies(String url, List<String> cookies) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(cookies, "cookies");
        Iterator<String> it = cookies.iterator();
        while (it.hasNext()) {
            addCookieAsync(url, it.next());
        }
        CookieManager cookieManager = getCookieManager();
        if (cookieManager != null) {
            cookieManager.flush();
        }
    }

    public final void clearCookies(final Callback callback) {
        AbstractC2855l.g(callback, "callback");
        CookieManager cookieManager = getCookieManager();
        if (cookieManager != null) {
            cookieManager.removeAllCookies(new ValueCallback() { // from class: com.facebook.react.modules.network.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    ForwardingCookieHandler.clearCookies$lambda$0(callback, (Boolean) obj);
                }
            });
        }
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, ? extends List<String>> headers) throws IOException {
        AbstractC2855l.g(uri, "uri");
        AbstractC2855l.g(headers, "headers");
        CookieManager cookieManager = getCookieManager();
        String cookie = cookieManager != null ? cookieManager.getCookie(uri.toString()) : null;
        return (cookie == null || cookie.length() == 0) ? K.i() : K.f(t.a(COOKIE_HEADER, AbstractC2800q.e(cookie)));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, ? extends List<String>> headers) throws IOException {
        AbstractC2855l.g(uri, "uri");
        AbstractC2855l.g(headers, "headers");
        String string = uri.toString();
        AbstractC2855l.f(string, "toString(...)");
        for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (Companion.isCookieHeader(key)) {
                addCookies(string, value);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForwardingCookieHandler(ReactContext reactContext) {
        this();
        AbstractC2855l.g(reactContext, "reactContext");
    }

    public final void destroy() {
    }
}
