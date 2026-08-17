package expo.modules.fetch;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, d2 = {"Lexpo/modules/fetch/RequestHolder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Le9/B;", "request", "<init>", "(Le9/B;)V", "component1", "()Le9/B;", "copy", "(Le9/B;)Lexpo/modules/fetch/RequestHolder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Le9/B;", "getRequest", "setRequest", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class RequestHolder {
    private B request;

    public RequestHolder(B b10) {
        this.request = b10;
    }

    public static /* synthetic */ RequestHolder copy$default(RequestHolder requestHolder, B b10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b10 = requestHolder.request;
        }
        return requestHolder.copy(b10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final B getRequest() {
        return this.request;
    }

    public final RequestHolder copy(B request) {
        return new RequestHolder(request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestHolder) && AbstractC2855l.b(this.request, ((RequestHolder) other).request);
    }

    public final B getRequest() {
        return this.request;
    }

    public int hashCode() {
        B b10 = this.request;
        if (b10 == null) {
            return 0;
        }
        return b10.hashCode();
    }

    public final void setRequest(B b10) {
        this.request = b10;
    }

    public String toString() {
        return "RequestHolder(request=" + this.request + ")";
    }
}
