package expo.modules.kotlin.devtools.cdp;

import B7.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.C;
import expo.modules.kotlin.devtools.ExpoNetworkInspectOkHttpNetworkInterceptor;
import expo.modules.kotlin.devtools.OkHttpExtensionsKt;
import java.io.EOFException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import org.json.JSONException;
import org.json.JSONObject;
import t9.C3391h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J \u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0012R'\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b'\u0010\u0012¨\u0006("}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/Request;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "method", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/devtools/cdp/Headers;", "headers", "postData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "Le9/B;", "request", "(Le9/B;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lexpo/modules/kotlin/devtools/cdp/Request;", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getMethod", "Ljava/util/Map;", "getHeaders", "getPostData", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Request implements JsonSerializable {
    private final Map<String, String> headers;
    private final String method;
    private final String postData;
    private final String url;

    public Request(String url, String method, Map<String, String> headers, String str) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(headers, "headers");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.postData = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Request copy$default(Request request, String str, String str2, Map map, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = request.url;
        }
        if ((i10 & 2) != 0) {
            str2 = request.method;
        }
        if ((i10 & 4) != 0) {
            map = request.headers;
        }
        if ((i10 & 8) != 0) {
            str3 = request.postData;
        }
        return request.copy(str, str2, map, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPostData() {
        return this.postData;
    }

    public final Request copy(String url, String method, Map<String, String> headers, String postData) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(headers, "headers");
        return new Request(url, method, headers, postData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return AbstractC2855l.b(this.url, request.url) && AbstractC2855l.b(this.method, request.method) && AbstractC2855l.b(this.headers, request.headers) && AbstractC2855l.b(this.postData, request.postData);
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getPostData() {
        return this.postData;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((((this.url.hashCode() * 31) + this.method.hashCode()) * 31) + this.headers.hashCode()) * 31;
        String str = this.postData;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", this.url);
        jSONObject.put("method", this.method);
        jSONObject.put("headers", new JSONObject(this.headers));
        String str = this.postData;
        if (str != null) {
            jSONObject.put("postData", str);
        }
        return jSONObject;
    }

    public String toString() {
        return "Request(url=" + this.url + ", method=" + this.method + ", headers=" + this.headers + ", postData=" + this.postData + ")";
    }

    public Request(B request) throws EOFException {
        AbstractC2855l.g(request, "request");
        String string = request.p().toString();
        String strL = request.l();
        Map<String, String> singleMap = OkHttpExtensionsKt.toSingleMap(request.i());
        C cE = request.e();
        String strN0 = null;
        if (cE != null && cE.contentLength() < ExpoNetworkInspectOkHttpNetworkInterceptor.MAX_BODY_SIZE) {
            C3391h c3391h = new C3391h();
            cE.writeTo(c3391h);
            strN0 = c3391h.N0(d.i(c3391h.size(), ExpoNetworkInspectOkHttpNetworkInterceptor.MAX_BODY_SIZE));
        }
        this(string, strL, singleMap, strN0);
    }
}
