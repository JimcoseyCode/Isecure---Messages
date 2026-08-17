package expo.modules.kotlin.devtools.cdp;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import expo.modules.kotlin.devtools.OkHttpExtensionsKt;
import j7.K;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0015\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJX\u0010\u001c\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0018R'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b+\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u001b¨\u0006."}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/devtools/cdp/RequestId;", "requestId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "associatedCookies", "Lexpo/modules/kotlin/devtools/cdp/Headers;", "headers", "Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;", "connectTiming", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)V", "Ljava/math/BigDecimal;", "now", "Le9/B;", "request", "(Ljava/math/BigDecimal;Ljava/lang/String;Le9/B;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "()Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "Ljava/util/Map;", "getAssociatedCookies", "getHeaders", "Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;", "getConnectTiming", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RequestWillBeSentExtraInfoParams implements JsonSerializable {
    private final Map<String, String> associatedCookies;
    private final ConnectTiming connectTiming;
    private final Map<String, String> headers;
    private final String requestId;

    public RequestWillBeSentExtraInfoParams(String requestId, Map<String, String> associatedCookies, Map<String, String> headers, ConnectTiming connectTiming) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(associatedCookies, "associatedCookies");
        AbstractC2855l.g(headers, "headers");
        AbstractC2855l.g(connectTiming, "connectTiming");
        this.requestId = requestId;
        this.associatedCookies = associatedCookies;
        this.headers = headers;
        this.connectTiming = connectTiming;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestWillBeSentExtraInfoParams copy$default(RequestWillBeSentExtraInfoParams requestWillBeSentExtraInfoParams, String str, Map map, Map map2, ConnectTiming connectTiming, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = requestWillBeSentExtraInfoParams.requestId;
        }
        if ((i10 & 2) != 0) {
            map = requestWillBeSentExtraInfoParams.associatedCookies;
        }
        if ((i10 & 4) != 0) {
            map2 = requestWillBeSentExtraInfoParams.headers;
        }
        if ((i10 & 8) != 0) {
            connectTiming = requestWillBeSentExtraInfoParams.connectTiming;
        }
        return requestWillBeSentExtraInfoParams.copy(str, map, map2, connectTiming);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final Map<String, String> component2() {
        return this.associatedCookies;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ConnectTiming getConnectTiming() {
        return this.connectTiming;
    }

    public final RequestWillBeSentExtraInfoParams copy(String requestId, Map<String, String> associatedCookies, Map<String, String> headers, ConnectTiming connectTiming) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(associatedCookies, "associatedCookies");
        AbstractC2855l.g(headers, "headers");
        AbstractC2855l.g(connectTiming, "connectTiming");
        return new RequestWillBeSentExtraInfoParams(requestId, associatedCookies, headers, connectTiming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestWillBeSentExtraInfoParams)) {
            return false;
        }
        RequestWillBeSentExtraInfoParams requestWillBeSentExtraInfoParams = (RequestWillBeSentExtraInfoParams) other;
        return AbstractC2855l.b(this.requestId, requestWillBeSentExtraInfoParams.requestId) && AbstractC2855l.b(this.associatedCookies, requestWillBeSentExtraInfoParams.associatedCookies) && AbstractC2855l.b(this.headers, requestWillBeSentExtraInfoParams.headers) && AbstractC2855l.b(this.connectTiming, requestWillBeSentExtraInfoParams.connectTiming);
    }

    public final Map<String, String> getAssociatedCookies() {
        return this.associatedCookies;
    }

    public final ConnectTiming getConnectTiming() {
        return this.connectTiming;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return (((((this.requestId.hashCode() * 31) + this.associatedCookies.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.connectTiming.hashCode();
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("associatedCookies", new JSONObject(this.associatedCookies));
        jSONObject.put("headers", new JSONObject(this.headers));
        jSONObject.put("connectTiming", this.connectTiming.toJSONObject());
        return jSONObject;
    }

    public String toString() {
        return "RequestWillBeSentExtraInfoParams(requestId=" + this.requestId + ", associatedCookies=" + this.associatedCookies + ", headers=" + this.headers + ", connectTiming=" + this.connectTiming + ")";
    }

    public /* synthetic */ RequestWillBeSentExtraInfoParams(String str, Map map, Map map2, ConnectTiming connectTiming, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? K.i() : map, map2, connectTiming);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RequestWillBeSentExtraInfoParams(BigDecimal now, String requestId, B request) {
        this(requestId, null, OkHttpExtensionsKt.toSingleMap(request.i()), new ConnectTiming(now), 2, null);
        AbstractC2855l.g(now, "now");
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(request, "request");
    }
}
