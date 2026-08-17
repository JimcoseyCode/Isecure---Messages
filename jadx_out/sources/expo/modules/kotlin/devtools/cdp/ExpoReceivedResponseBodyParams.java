package expo.modules.kotlin.devtools.cdp;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import e9.E;
import e9.x;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\"R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/ExpoReceivedResponseBodyParams;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/devtools/cdp/RequestId;", "requestId", ExpoNotificationBuilder.EXTRAS_BODY_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "base64Encoded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Le9/E;", "(Ljava/lang/String;Le9/E;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lexpo/modules/kotlin/devtools/cdp/ExpoReceivedResponseBodyParams;", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "getBody", "setBody", "(Ljava/lang/String;)V", "Z", "getBase64Encoded", "setBase64Encoded", "(Z)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ExpoReceivedResponseBodyParams implements JsonSerializable {
    private boolean base64Encoded;
    private String body;
    private final String requestId;

    public ExpoReceivedResponseBodyParams(String requestId, String body, boolean z10) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(body, "body");
        this.requestId = requestId;
        this.body = body;
        this.base64Encoded = z10;
    }

    public static /* synthetic */ ExpoReceivedResponseBodyParams copy$default(ExpoReceivedResponseBodyParams expoReceivedResponseBodyParams, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = expoReceivedResponseBodyParams.requestId;
        }
        if ((i10 & 2) != 0) {
            str2 = expoReceivedResponseBodyParams.body;
        }
        if ((i10 & 4) != 0) {
            z10 = expoReceivedResponseBodyParams.base64Encoded;
        }
        return expoReceivedResponseBodyParams.copy(str, str2, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getBase64Encoded() {
        return this.base64Encoded;
    }

    public final ExpoReceivedResponseBodyParams copy(String requestId, String body, boolean base64Encoded) {
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(body, "body");
        return new ExpoReceivedResponseBodyParams(requestId, body, base64Encoded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpoReceivedResponseBodyParams)) {
            return false;
        }
        ExpoReceivedResponseBodyParams expoReceivedResponseBodyParams = (ExpoReceivedResponseBodyParams) other;
        return AbstractC2855l.b(this.requestId, expoReceivedResponseBodyParams.requestId) && AbstractC2855l.b(this.body, expoReceivedResponseBodyParams.body) && this.base64Encoded == expoReceivedResponseBodyParams.base64Encoded;
    }

    public final boolean getBase64Encoded() {
        return this.base64Encoded;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return (((this.requestId.hashCode() * 31) + this.body.hashCode()) * 31) + Boolean.hashCode(this.base64Encoded);
    }

    public final void setBase64Encoded(boolean z10) {
        this.base64Encoded = z10;
    }

    public final void setBody(String str) {
        AbstractC2855l.g(str, "<set-?>");
        this.body = str;
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put(ExpoNotificationBuilder.EXTRAS_BODY_KEY, this.body);
        jSONObject.put("base64Encoded", this.base64Encoded);
        return jSONObject;
    }

    public String toString() {
        return "ExpoReceivedResponseBodyParams(requestId=" + this.requestId + ", body=" + this.body + ", base64Encoded=" + this.base64Encoded + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExpoReceivedResponseBodyParams(String requestId, E body) {
        this(requestId, PointerEventHelper.POINTER_TYPE_UNKNOWN, false);
        AbstractC2855l.g(requestId, "requestId");
        AbstractC2855l.g(body, "body");
        boolean z10 = false;
        x xVarContentType = body.contentType();
        if (AbstractC2855l.b(xVarContentType != null ? xVarContentType.g() : null, ReactTextInputShadowNode.PROP_TEXT)) {
            z10 = true;
        } else {
            if (AbstractC2855l.b(xVarContentType != null ? xVarContentType.g() : null, "application") && AbstractC2855l.b(xVarContentType.f(), "json")) {
            }
        }
        this.body = z10 ? body.string() : body.source().c0().j();
        this.base64Encoded = !z10;
    }
}
