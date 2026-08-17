package expo.modules.kotlin.devtools.cdp;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.D;
import e9.E;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.devtools.OkHttpExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J \u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\\\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0016R'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b/\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001e¨\u00062"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/Response;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", PointerEventHelper.POINTER_TYPE_UNKNOWN, PermissionsResponse.STATUS_KEY, "statusText", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/devtools/cdp/Headers;", "headers", "mimeType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "encodedDataLength", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;J)V", "Le9/D;", "response", "(Le9/D;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/util/Map;", "component5", "component6", "()J", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;J)Lexpo/modules/kotlin/devtools/cdp/Response;", "toString", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "I", "getStatus", "getStatusText", "Ljava/util/Map;", "getHeaders", "getMimeType", "J", "getEncodedDataLength", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Response implements JsonSerializable {
    private final long encodedDataLength;
    private final Map<String, String> headers;
    private final String mimeType;
    private final int status;
    private final String statusText;
    private final String url;

    public Response(String url, int i10, String statusText, Map<String, String> headers, String mimeType, long j10) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(statusText, "statusText");
        AbstractC2855l.g(headers, "headers");
        AbstractC2855l.g(mimeType, "mimeType");
        this.url = url;
        this.status = i10;
        this.statusText = statusText;
        this.headers = headers;
        this.mimeType = mimeType;
        this.encodedDataLength = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, String str, int i10, String str2, Map map, String str3, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = response.url;
        }
        if ((i11 & 2) != 0) {
            i10 = response.status;
        }
        if ((i11 & 4) != 0) {
            str2 = response.statusText;
        }
        if ((i11 & 8) != 0) {
            map = response.headers;
        }
        if ((i11 & 16) != 0) {
            str3 = response.mimeType;
        }
        if ((i11 & 32) != 0) {
            j10 = response.encodedDataLength;
        }
        long j11 = j10;
        String str4 = str3;
        String str5 = str2;
        return response.copy(str, i10, str5, map, str4, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getEncodedDataLength() {
        return this.encodedDataLength;
    }

    public final Response copy(String url, int status, String statusText, Map<String, String> headers, String mimeType, long encodedDataLength) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(statusText, "statusText");
        AbstractC2855l.g(headers, "headers");
        AbstractC2855l.g(mimeType, "mimeType");
        return new Response(url, status, statusText, headers, mimeType, encodedDataLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return AbstractC2855l.b(this.url, response.url) && this.status == response.status && AbstractC2855l.b(this.statusText, response.statusText) && AbstractC2855l.b(this.headers, response.headers) && AbstractC2855l.b(this.mimeType, response.mimeType) && this.encodedDataLength == response.encodedDataLength;
    }

    public final long getEncodedDataLength() {
        return this.encodedDataLength;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((this.url.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + this.statusText.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + Long.hashCode(this.encodedDataLength);
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", this.url);
        jSONObject.put(PermissionsResponse.STATUS_KEY, this.status);
        jSONObject.put("statusText", this.statusText);
        jSONObject.put("headers", new JSONObject(this.headers));
        jSONObject.put("mimeType", this.mimeType);
        jSONObject.put("encodedDataLength", this.encodedDataLength);
        return jSONObject;
    }

    public String toString() {
        return "Response(url=" + this.url + ", status=" + this.status + ", statusText=" + this.statusText + ", headers=" + this.headers + ", mimeType=" + this.mimeType + ", encodedDataLength=" + this.encodedDataLength + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Response(D response) {
        AbstractC2855l.g(response, "response");
        String string = response.D0().p().toString();
        int I9 = response.I();
        String strL0 = response.l0();
        Map<String, String> singleMap = OkHttpExtensionsKt.toSingleMap(response.g0());
        String strX = response.X("Content-Type", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        String str = strX == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : strX;
        E eR = response.r();
        this(string, I9, strL0, singleMap, str, eR != null ? eR.contentLength() : 0L);
    }
}
