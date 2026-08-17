package expo.modules.kotlin.devtools.cdp;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.D;
import expo.modules.kotlin.devtools.cdp.ResourceType;
import expo.modules.notifications.service.NotificationsService;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0018\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0014\u0010\u001b\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"JT\u0010#\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\f\b\u0002\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b/\u0010\u0019R\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\"¨\u00068"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/ResponseReceivedParams;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/devtools/cdp/RequestId;", "requestId", "loaderId", "Ljava/math/BigDecimal;", "Lexpo/modules/kotlin/devtools/cdp/MonotonicTime;", "timestamp", "Lexpo/modules/kotlin/devtools/cdp/ResourceType;", NotificationsService.EVENT_TYPE_KEY, "Lexpo/modules/kotlin/devtools/cdp/Response;", "response", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasExtraInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lexpo/modules/kotlin/devtools/cdp/ResourceType;Lexpo/modules/kotlin/devtools/cdp/Response;Z)V", "now", "Le9/D;", "okhttpResponse", "(Ljava/math/BigDecimal;Ljava/lang/String;Le9/D;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/math/BigDecimal;", "component4", "()Lexpo/modules/kotlin/devtools/cdp/ResourceType;", "component5", "()Lexpo/modules/kotlin/devtools/cdp/Response;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lexpo/modules/kotlin/devtools/cdp/ResourceType;Lexpo/modules/kotlin/devtools/cdp/Response;Z)Lexpo/modules/kotlin/devtools/cdp/ResponseReceivedParams;", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "getLoaderId", "Ljava/math/BigDecimal;", "getTimestamp", "Lexpo/modules/kotlin/devtools/cdp/ResourceType;", "getType", "Lexpo/modules/kotlin/devtools/cdp/Response;", "getResponse", "Z", "getHasExtraInfo", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ResponseReceivedParams implements JsonSerializable {
    private final boolean hasExtraInfo;
    private final String loaderId;
    private final String requestId;
    private final Response response;
    private final BigDecimal timestamp;
    private final ResourceType type;

    public ResponseReceivedParams(String requestId, String loaderId, BigDecimal timestamp, ResourceType type, Response response, boolean z10) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(loaderId, "loaderId");
        AbstractC2855l.g(timestamp, "timestamp");
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(response, "response");
        this.requestId = requestId;
        this.loaderId = loaderId;
        this.timestamp = timestamp;
        this.type = type;
        this.response = response;
        this.hasExtraInfo = z10;
    }

    public static /* synthetic */ ResponseReceivedParams copy$default(ResponseReceivedParams responseReceivedParams, String str, String str2, BigDecimal bigDecimal, ResourceType resourceType, Response response, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responseReceivedParams.requestId;
        }
        if ((i10 & 2) != 0) {
            str2 = responseReceivedParams.loaderId;
        }
        if ((i10 & 4) != 0) {
            bigDecimal = responseReceivedParams.timestamp;
        }
        if ((i10 & 8) != 0) {
            resourceType = responseReceivedParams.type;
        }
        if ((i10 & 16) != 0) {
            response = responseReceivedParams.response;
        }
        if ((i10 & 32) != 0) {
            z10 = responseReceivedParams.hasExtraInfo;
        }
        Response response2 = response;
        boolean z11 = z10;
        return responseReceivedParams.copy(str, str2, bigDecimal, resourceType, response2, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLoaderId() {
        return this.loaderId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ResourceType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Response getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasExtraInfo() {
        return this.hasExtraInfo;
    }

    public final ResponseReceivedParams copy(String requestId, String loaderId, BigDecimal timestamp, ResourceType type, Response response, boolean hasExtraInfo) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(loaderId, "loaderId");
        AbstractC2855l.g(timestamp, "timestamp");
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(response, "response");
        return new ResponseReceivedParams(requestId, loaderId, timestamp, type, response, hasExtraInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseReceivedParams)) {
            return false;
        }
        ResponseReceivedParams responseReceivedParams = (ResponseReceivedParams) other;
        return AbstractC2855l.b(this.requestId, responseReceivedParams.requestId) && AbstractC2855l.b(this.loaderId, responseReceivedParams.loaderId) && AbstractC2855l.b(this.timestamp, responseReceivedParams.timestamp) && this.type == responseReceivedParams.type && AbstractC2855l.b(this.response, responseReceivedParams.response) && this.hasExtraInfo == responseReceivedParams.hasExtraInfo;
    }

    public final boolean getHasExtraInfo() {
        return this.hasExtraInfo;
    }

    public final String getLoaderId() {
        return this.loaderId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Response getResponse() {
        return this.response;
    }

    public final BigDecimal getTimestamp() {
        return this.timestamp;
    }

    public final ResourceType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.requestId.hashCode() * 31) + this.loaderId.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.type.hashCode()) * 31) + this.response.hashCode()) * 31) + Boolean.hashCode(this.hasExtraInfo);
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("loaderId", this.loaderId);
        jSONObject.put("timestamp", this.timestamp);
        jSONObject.put(NotificationsService.EVENT_TYPE_KEY, this.type.getValue());
        jSONObject.put("response", this.response.toJSONObject());
        jSONObject.put("hasExtraInfo", this.hasExtraInfo);
        return jSONObject;
    }

    public String toString() {
        return "ResponseReceivedParams(requestId=" + this.requestId + ", loaderId=" + this.loaderId + ", timestamp=" + this.timestamp + ", type=" + this.type + ", response=" + this.response + ", hasExtraInfo=" + this.hasExtraInfo + ")";
    }

    public /* synthetic */ ResponseReceivedParams(String str, String str2, BigDecimal bigDecimal, ResourceType resourceType, Response response, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : str2, bigDecimal, resourceType, response, (i10 & 32) != 0 ? false : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ResponseReceivedParams(BigDecimal now, String requestId, D okhttpResponse) {
        AbstractC2855l.g(now, "now");
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(okhttpResponse, "okhttpResponse");
        ResourceType.Companion companion = ResourceType.INSTANCE;
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        String strX = okhttpResponse.X("Content-Type", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        this(requestId, null, now, companion.fromMimeType(strX != null ? strX : str), new Response(okhttpResponse), false, 34, null);
    }
}
