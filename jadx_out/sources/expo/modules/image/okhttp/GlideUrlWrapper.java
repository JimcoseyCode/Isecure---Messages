package expo.modules.image.okhttp;

import B1.h;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.events.OkHttpProgressListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lexpo/modules/image/okhttp/GlideUrlWrapper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LB1/h;", "glideUrl", "<init>", "(LB1/h;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", "component1", "()LB1/h;", "copy", "(LB1/h;)Lexpo/modules/image/okhttp/GlideUrlWrapper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "LB1/h;", "getGlideUrl", "Lexpo/modules/image/events/OkHttpProgressListener;", "progressListener", "Lexpo/modules/image/events/OkHttpProgressListener;", "getProgressListener", "()Lexpo/modules/image/events/OkHttpProgressListener;", "setProgressListener", "(Lexpo/modules/image/events/OkHttpProgressListener;)V", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GlideUrlWrapper {
    private final h glideUrl;
    private OkHttpProgressListener progressListener;

    public GlideUrlWrapper(h glideUrl) {
        AbstractC2855l.g(glideUrl, "glideUrl");
        this.glideUrl = glideUrl;
    }

    public static /* synthetic */ GlideUrlWrapper copy$default(GlideUrlWrapper glideUrlWrapper, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = glideUrlWrapper.glideUrl;
        }
        return glideUrlWrapper.copy(hVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final h getGlideUrl() {
        return this.glideUrl;
    }

    public final GlideUrlWrapper copy(h glideUrl) {
        AbstractC2855l.g(glideUrl, "glideUrl");
        return new GlideUrlWrapper(glideUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GlideUrlWrapper) && AbstractC2855l.b(this.glideUrl, ((GlideUrlWrapper) other).glideUrl);
    }

    public final h getGlideUrl() {
        return this.glideUrl;
    }

    public final OkHttpProgressListener getProgressListener() {
        return this.progressListener;
    }

    public int hashCode() {
        return this.glideUrl.hashCode();
    }

    public final void setProgressListener(OkHttpProgressListener okHttpProgressListener) {
        this.progressListener = okHttpProgressListener;
    }

    public String toString() {
        String string = this.glideUrl.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }
}
