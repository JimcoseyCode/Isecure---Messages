package expo.modules.webview;

import android.webkit.JavascriptInterface;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/webview/RNCWebViewBridge;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/webview/DomWebView;", "webView", "<init>", "(Lexpo/modules/webview/DomWebView;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", "Li7/B;", "postMessage", "(Ljava/lang/String;)V", "Lexpo/modules/webview/DomWebView;", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNCWebViewBridge {
    private final DomWebView webView;

    public RNCWebViewBridge(DomWebView webView) {
        AbstractC2855l.g(webView, "webView");
        this.webView = webView;
    }

    @JavascriptInterface
    public final void postMessage(String message) {
        AbstractC2855l.g(message, "message");
        this.webView.dispatchMessageEvent(message);
    }
}
