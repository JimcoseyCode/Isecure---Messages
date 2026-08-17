package expo.modules.kotlin.devtools.cdp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.D;
import expo.modules.notifications.service.NotificationsService;
import i7.t;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\n\u0010\r\u001a\u00060\tj\u0002`\f\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B/\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\b\u001a\u00020\u001a\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0014\u0010&\u001a\u00060\tj\u0002`\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0014\u0010(\u001a\u00060\tj\u0002`\fHÆ\u0003¢\u0006\u0004\b(\u0010'J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b0\u00101J\u0098\u0001\u00102\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\f\b\u0002\u0010\u000b\u001a\u00060\tj\u0002`\n2\f\b\u0002\u0010\r\u001a\u00060\tj\u0002`\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010!J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b>\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b?\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010%R\u001b\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010'R\u001b\u0010\r\u001a\u00060\tj\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bD\u0010'R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010*R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010.R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bK\u0010!R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u00101¨\u0006N"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/devtools/cdp/RequestId;", "requestId", "loaderId", "documentURL", "Lexpo/modules/kotlin/devtools/cdp/Request;", "request", "Ljava/math/BigDecimal;", "Lexpo/modules/kotlin/devtools/cdp/MonotonicTime;", "timestamp", "Lexpo/modules/kotlin/devtools/cdp/TimeSinceEpoch;", "wallTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "initiator", PointerEventHelper.POINTER_TYPE_UNKNOWN, "redirectHasExtraInfo", "Lexpo/modules/kotlin/devtools/cdp/Response;", "redirectResponse", "referrerPolicy", "Lexpo/modules/kotlin/devtools/cdp/ResourceType;", NotificationsService.EVENT_TYPE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)V", "now", "Le9/B;", "Le9/D;", "(Ljava/math/BigDecimal;Ljava/lang/String;Le9/B;Le9/D;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lexpo/modules/kotlin/devtools/cdp/Request;", "component5", "()Ljava/math/BigDecimal;", "component6", "component7", "()Ljava/util/Map;", "component8", "()Z", "component9", "()Lexpo/modules/kotlin/devtools/cdp/Response;", "component10", "component11", "()Lexpo/modules/kotlin/devtools/cdp/ResourceType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "getLoaderId", "getDocumentURL", "Lexpo/modules/kotlin/devtools/cdp/Request;", "getRequest", "Ljava/math/BigDecimal;", "getTimestamp", "getWallTime", "Ljava/util/Map;", "getInitiator", "Z", "getRedirectHasExtraInfo", "Lexpo/modules/kotlin/devtools/cdp/Response;", "getRedirectResponse", "getReferrerPolicy", "Lexpo/modules/kotlin/devtools/cdp/ResourceType;", "getType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RequestWillBeSentParams implements JsonSerializable {
    private final String documentURL;
    private final Map<String, String> initiator;
    private final String loaderId;
    private final boolean redirectHasExtraInfo;
    private final Response redirectResponse;
    private final String referrerPolicy;
    private final Request request;
    private final String requestId;
    private final BigDecimal timestamp;
    private final ResourceType type;
    private final BigDecimal wallTime;

    public RequestWillBeSentParams(String requestId, String loaderId, String documentURL, Request request, BigDecimal timestamp, BigDecimal wallTime, Map<String, String> initiator, boolean z10, Response response, String referrerPolicy, ResourceType type) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(loaderId, "loaderId");
        AbstractC2855l.g(documentURL, "documentURL");
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(timestamp, "timestamp");
        AbstractC2855l.g(wallTime, "wallTime");
        AbstractC2855l.g(initiator, "initiator");
        AbstractC2855l.g(referrerPolicy, "referrerPolicy");
        AbstractC2855l.g(type, "type");
        this.requestId = requestId;
        this.loaderId = loaderId;
        this.documentURL = documentURL;
        this.request = request;
        this.timestamp = timestamp;
        this.wallTime = wallTime;
        this.initiator = initiator;
        this.redirectHasExtraInfo = z10;
        this.redirectResponse = response;
        this.referrerPolicy = referrerPolicy;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestWillBeSentParams copy$default(RequestWillBeSentParams requestWillBeSentParams, String str, String str2, String str3, Request request, BigDecimal bigDecimal, BigDecimal bigDecimal2, Map map, boolean z10, Response response, String str4, ResourceType resourceType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = requestWillBeSentParams.requestId;
        }
        if ((i10 & 2) != 0) {
            str2 = requestWillBeSentParams.loaderId;
        }
        if ((i10 & 4) != 0) {
            str3 = requestWillBeSentParams.documentURL;
        }
        if ((i10 & 8) != 0) {
            request = requestWillBeSentParams.request;
        }
        if ((i10 & 16) != 0) {
            bigDecimal = requestWillBeSentParams.timestamp;
        }
        if ((i10 & 32) != 0) {
            bigDecimal2 = requestWillBeSentParams.wallTime;
        }
        if ((i10 & 64) != 0) {
            map = requestWillBeSentParams.initiator;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            z10 = requestWillBeSentParams.redirectHasExtraInfo;
        }
        if ((i10 & 256) != 0) {
            response = requestWillBeSentParams.redirectResponse;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            str4 = requestWillBeSentParams.referrerPolicy;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            resourceType = requestWillBeSentParams.type;
        }
        String str5 = str4;
        ResourceType resourceType2 = resourceType;
        boolean z11 = z10;
        Response response2 = response;
        BigDecimal bigDecimal3 = bigDecimal2;
        Map map2 = map;
        BigDecimal bigDecimal4 = bigDecimal;
        String str6 = str3;
        return requestWillBeSentParams.copy(str, str2, str6, request, bigDecimal4, bigDecimal3, map2, z11, response2, str5, resourceType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReferrerPolicy() {
        return this.referrerPolicy;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ResourceType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLoaderId() {
        return this.loaderId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentURL() {
        return this.documentURL;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getWallTime() {
        return this.wallTime;
    }

    public final Map<String, String> component7() {
        return this.initiator;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getRedirectHasExtraInfo() {
        return this.redirectHasExtraInfo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Response getRedirectResponse() {
        return this.redirectResponse;
    }

    public final RequestWillBeSentParams copy(String requestId, String loaderId, String documentURL, Request request, BigDecimal timestamp, BigDecimal wallTime, Map<String, String> initiator, boolean redirectHasExtraInfo, Response redirectResponse, String referrerPolicy, ResourceType type) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(loaderId, "loaderId");
        AbstractC2855l.g(documentURL, "documentURL");
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(timestamp, "timestamp");
        AbstractC2855l.g(wallTime, "wallTime");
        AbstractC2855l.g(initiator, "initiator");
        AbstractC2855l.g(referrerPolicy, "referrerPolicy");
        AbstractC2855l.g(type, "type");
        return new RequestWillBeSentParams(requestId, loaderId, documentURL, request, timestamp, wallTime, initiator, redirectHasExtraInfo, redirectResponse, referrerPolicy, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestWillBeSentParams)) {
            return false;
        }
        RequestWillBeSentParams requestWillBeSentParams = (RequestWillBeSentParams) other;
        return AbstractC2855l.b(this.requestId, requestWillBeSentParams.requestId) && AbstractC2855l.b(this.loaderId, requestWillBeSentParams.loaderId) && AbstractC2855l.b(this.documentURL, requestWillBeSentParams.documentURL) && AbstractC2855l.b(this.request, requestWillBeSentParams.request) && AbstractC2855l.b(this.timestamp, requestWillBeSentParams.timestamp) && AbstractC2855l.b(this.wallTime, requestWillBeSentParams.wallTime) && AbstractC2855l.b(this.initiator, requestWillBeSentParams.initiator) && this.redirectHasExtraInfo == requestWillBeSentParams.redirectHasExtraInfo && AbstractC2855l.b(this.redirectResponse, requestWillBeSentParams.redirectResponse) && AbstractC2855l.b(this.referrerPolicy, requestWillBeSentParams.referrerPolicy) && this.type == requestWillBeSentParams.type;
    }

    public final String getDocumentURL() {
        return this.documentURL;
    }

    public final Map<String, String> getInitiator() {
        return this.initiator;
    }

    public final String getLoaderId() {
        return this.loaderId;
    }

    public final boolean getRedirectHasExtraInfo() {
        return this.redirectHasExtraInfo;
    }

    public final Response getRedirectResponse() {
        return this.redirectResponse;
    }

    public final String getReferrerPolicy() {
        return this.referrerPolicy;
    }

    public final Request getRequest() {
        return this.request;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final BigDecimal getTimestamp() {
        return this.timestamp;
    }

    public final ResourceType getType() {
        return this.type;
    }

    public final BigDecimal getWallTime() {
        return this.wallTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.requestId.hashCode() * 31) + this.loaderId.hashCode()) * 31) + this.documentURL.hashCode()) * 31) + this.request.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.wallTime.hashCode()) * 31) + this.initiator.hashCode()) * 31) + Boolean.hashCode(this.redirectHasExtraInfo)) * 31;
        Response response = this.redirectResponse;
        return ((((iHashCode + (response == null ? 0 : response.hashCode())) * 31) + this.referrerPolicy.hashCode()) * 31) + this.type.hashCode();
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("loaderId", this.loaderId);
        jSONObject.put("documentURL", this.documentURL);
        jSONObject.put("request", this.request.toJSONObject());
        jSONObject.put("timestamp", this.timestamp);
        jSONObject.put("wallTime", this.wallTime);
        jSONObject.put("initiator", new JSONObject(this.initiator));
        jSONObject.put("redirectHasExtraInfo", this.redirectHasExtraInfo);
        Response response = this.redirectResponse;
        if (response != null) {
            jSONObject.put("redirectResponse", response.toJSONObject());
        }
        jSONObject.put("referrerPolicy", this.referrerPolicy);
        jSONObject.put(NotificationsService.EVENT_TYPE_KEY, this.type.getValue());
        return jSONObject;
    }

    public String toString() {
        return "RequestWillBeSentParams(requestId=" + this.requestId + ", loaderId=" + this.loaderId + ", documentURL=" + this.documentURL + ", request=" + this.request + ", timestamp=" + this.timestamp + ", wallTime=" + this.wallTime + ", initiator=" + this.initiator + ", redirectHasExtraInfo=" + this.redirectHasExtraInfo + ", redirectResponse=" + this.redirectResponse + ", referrerPolicy=" + this.referrerPolicy + ", type=" + this.type + ")";
    }

    public /* synthetic */ RequestWillBeSentParams(String str, String str2, String str3, Request request, BigDecimal bigDecimal, BigDecimal bigDecimal2, Map map, boolean z10, Response response, String str4, ResourceType resourceType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : str2, (i10 & 4) != 0 ? "mobile" : str3, request, bigDecimal, bigDecimal2, (i10 & 64) != 0 ? K.f(t.a(NotificationsService.EVENT_TYPE_KEY, "script")) : map, z10, response, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? "no-referrer" : str4, resourceType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RequestWillBeSentParams(BigDecimal now, String requestId, B request, D d10) {
        this(requestId, null, null, new Request(request), now, now, null, d10 != null, d10 != null ? new Response(d10) : null, null, ResourceType.OTHER, 582, null);
        AbstractC2855l.g(now, "now");
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(request, "request");
    }
}
