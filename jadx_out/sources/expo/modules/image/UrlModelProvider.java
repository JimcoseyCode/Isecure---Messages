package expo.modules.image;

import B1.h;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.okhttp.GlideUrlWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"Lexpo/modules/image/UrlModelProvider;", "Lexpo/modules/image/GlideModelProvider;", "LB1/h;", "glideUrl", "<init>", "(LB1/h;)V", "component1", "()LB1/h;", "Lexpo/modules/image/okhttp/GlideUrlWrapper;", "getGlideModel", "()Lexpo/modules/image/okhttp/GlideUrlWrapper;", "copy", "(LB1/h;)Lexpo/modules/image/UrlModelProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "LB1/h;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UrlModelProvider implements GlideModelProvider {
    private final h glideUrl;

    public UrlModelProvider(h glideUrl) {
        AbstractC2855l.g(glideUrl, "glideUrl");
        this.glideUrl = glideUrl;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final h getGlideUrl() {
        return this.glideUrl;
    }

    public static /* synthetic */ UrlModelProvider copy$default(UrlModelProvider urlModelProvider, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = urlModelProvider.glideUrl;
        }
        return urlModelProvider.copy(hVar);
    }

    public final UrlModelProvider copy(h glideUrl) {
        AbstractC2855l.g(glideUrl, "glideUrl");
        return new UrlModelProvider(glideUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UrlModelProvider) && AbstractC2855l.b(this.glideUrl, ((UrlModelProvider) other).glideUrl);
    }

    public int hashCode() {
        return this.glideUrl.hashCode();
    }

    public String toString() {
        return "UrlModelProvider(glideUrl=" + this.glideUrl + ")";
    }

    @Override // expo.modules.image.GlideModelProvider
    public GlideUrlWrapper getGlideModel() {
        return new GlideUrlWrapper(this.glideUrl);
    }
}
