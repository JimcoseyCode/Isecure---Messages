package expo.modules.image.okhttp;

import B1.h;
import B1.i;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/image/okhttp/GlideUrlWithCustomCacheKey;", "LB1/h;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "uri", "LB1/i;", "headers", "cacheKey", "<init>", "(Ljava/lang/String;LB1/i;Ljava/lang/String;)V", "getBaseCacheKey", "()Ljava/lang/String;", "getCacheKey", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", "Ljava/lang/String;", "I", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GlideUrlWithCustomCacheKey extends h {
    private final String cacheKey;
    private int hashCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlideUrlWithCustomCacheKey(String str, i iVar, String cacheKey) {
        super(str, iVar);
        AbstractC2855l.g(cacheKey, "cacheKey");
        this.cacheKey = cacheKey;
    }

    private final String getBaseCacheKey() {
        String cacheKey = super.getCacheKey();
        AbstractC2855l.f(cacheKey, "getCacheKey(...)");
        return cacheKey;
    }

    @Override // B1.h, v1.f
    public boolean equals(Object other) {
        if (other instanceof GlideUrlWithCustomCacheKey) {
            GlideUrlWithCustomCacheKey glideUrlWithCustomCacheKey = (GlideUrlWithCustomCacheKey) other;
            return AbstractC2855l.b(getBaseCacheKey(), glideUrlWithCustomCacheKey.getBaseCacheKey()) && getHeaders().equals(glideUrlWithCustomCacheKey.getHeaders());
        }
        if (other instanceof h) {
            h hVar = (h) other;
            if (AbstractC2855l.b(getBaseCacheKey(), hVar.getCacheKey()) && getHeaders().equals(hVar.getHeaders())) {
                return true;
            }
        }
        return false;
    }

    @Override // B1.h
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // B1.h, v1.f
    public int hashCode() {
        if (this.hashCode == 0) {
            int iHashCode = getBaseCacheKey().hashCode();
            this.hashCode = iHashCode;
            this.hashCode = (iHashCode * 31) + getHeaders().hashCode();
        }
        return this.hashCode;
    }
}
