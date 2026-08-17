package expo.modules.image;

import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lexpo/modules/image/UriModelProvider;", "Lexpo/modules/image/GlideModelProvider;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getGlideModel", "component1", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UriModelProvider implements GlideModelProvider {
    private final Uri uri;

    public UriModelProvider(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        this.uri = uri;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Uri getUri() {
        return this.uri;
    }

    public static /* synthetic */ UriModelProvider copy$default(UriModelProvider uriModelProvider, Uri uri, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = uriModelProvider.uri;
        }
        return uriModelProvider.copy(uri);
    }

    public final UriModelProvider copy(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        return new UriModelProvider(uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UriModelProvider) && AbstractC2855l.b(this.uri, ((UriModelProvider) other).uri);
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    public String toString() {
        return "UriModelProvider(uri=" + this.uri + ")";
    }

    @Override // expo.modules.image.GlideModelProvider
    public Uri getGlideModel() {
        return this.uri;
    }
}
