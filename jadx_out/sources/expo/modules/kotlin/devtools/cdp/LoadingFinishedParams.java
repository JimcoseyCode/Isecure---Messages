package expo.modules.kotlin.devtools.cdp;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.D;
import e9.E;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0015\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u0019\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0014R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/LoadingFinishedParams;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/devtools/cdp/RequestId;", "requestId", "Ljava/math/BigDecimal;", "Lexpo/modules/kotlin/devtools/cdp/MonotonicTime;", "timestamp", PointerEventHelper.POINTER_TYPE_UNKNOWN, "encodedDataLength", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;J)V", "now", "Le9/D;", "response", "(Ljava/math/BigDecimal;Ljava/lang/String;Le9/D;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;J)Lexpo/modules/kotlin/devtools/cdp/LoadingFinishedParams;", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "Ljava/math/BigDecimal;", "getTimestamp", "J", "getEncodedDataLength", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoadingFinishedParams implements JsonSerializable {
    private final long encodedDataLength;
    private final String requestId;
    private final BigDecimal timestamp;

    public LoadingFinishedParams(String requestId, BigDecimal timestamp, long j10) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(timestamp, "timestamp");
        this.requestId = requestId;
        this.timestamp = timestamp;
        this.encodedDataLength = j10;
    }

    public static /* synthetic */ LoadingFinishedParams copy$default(LoadingFinishedParams loadingFinishedParams, String str, BigDecimal bigDecimal, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loadingFinishedParams.requestId;
        }
        if ((i10 & 2) != 0) {
            bigDecimal = loadingFinishedParams.timestamp;
        }
        if ((i10 & 4) != 0) {
            j10 = loadingFinishedParams.encodedDataLength;
        }
        return loadingFinishedParams.copy(str, bigDecimal, j10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEncodedDataLength() {
        return this.encodedDataLength;
    }

    public final LoadingFinishedParams copy(String requestId, BigDecimal timestamp, long encodedDataLength) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(timestamp, "timestamp");
        return new LoadingFinishedParams(requestId, timestamp, encodedDataLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingFinishedParams)) {
            return false;
        }
        LoadingFinishedParams loadingFinishedParams = (LoadingFinishedParams) other;
        return AbstractC2855l.b(this.requestId, loadingFinishedParams.requestId) && AbstractC2855l.b(this.timestamp, loadingFinishedParams.timestamp) && this.encodedDataLength == loadingFinishedParams.encodedDataLength;
    }

    public final long getEncodedDataLength() {
        return this.encodedDataLength;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final BigDecimal getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.requestId.hashCode() * 31) + this.timestamp.hashCode()) * 31) + Long.hashCode(this.encodedDataLength);
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("timestamp", this.timestamp);
        jSONObject.put("encodedDataLength", this.encodedDataLength);
        return jSONObject;
    }

    public String toString() {
        return "LoadingFinishedParams(requestId=" + this.requestId + ", timestamp=" + this.timestamp + ", encodedDataLength=" + this.encodedDataLength + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoadingFinishedParams(BigDecimal now, String requestId, D response) {
        AbstractC2855l.g(now, "now");
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(response, "response");
        E eR = response.r();
        this(requestId, now, eR != null ? eR.contentLength() : 0L);
    }
}
