package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.modules.fresco.ImageCacheControl;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/facebook/react/views/imagehelper/ImageSource;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "source", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "cacheControl", "Lcom/facebook/react/modules/fresco/ImageCacheControl;", "<init>", "(Landroid/content/Context;Ljava/lang/String;DDLcom/facebook/react/modules/fresco/ImageCacheControl;)V", "getSource", "()Ljava/lang/String;", "getCacheControl", "()Lcom/facebook/react/modules/fresco/ImageCacheControl;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "size", "getSize", "()D", "isResource", PointerEventHelper.POINTER_TYPE_UNKNOWN, "()Z", "_isResource", "equals", "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "computeUri", "computeLocalUri", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ImageSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TRANSPARENT_BITMAP_URI = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=";
    private boolean _isResource;
    private final ImageCacheControl cacheControl;
    private final double size;
    private final String source;
    private final Uri uri;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/views/imagehelper/ImageSource$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TRANSPARENT_BITMAP_URI", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getTransparentBitmapImageSource", "Lcom/facebook/react/views/imagehelper/ImageSource;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImageSource getTransparentBitmapImageSource(Context context) {
            AbstractC2855l.g(context, "context");
            return new ImageSource(context, ImageSource.TRANSPARENT_BITMAP_URI, 0.0d, 0.0d, ImageCacheControl.DEFAULT, 12, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageSource(Context context, String str) {
        this(context, str, 0.0d, 0.0d, null, 28, null);
        AbstractC2855l.g(context, "context");
    }

    private final Uri computeLocalUri(Context context) {
        this._isResource = true;
        return ResourceDrawableIdHelper.getResourceDrawableUri(context, this.source);
    }

    private final Uri computeUri(Context context) {
        try {
            Uri uriComputeLocalUri = Uri.parse(this.source);
            if (uriComputeLocalUri.getScheme() == null) {
                uriComputeLocalUri = computeLocalUri(context);
            }
            AbstractC2855l.d(uriComputeLocalUri);
            return uriComputeLocalUri;
        } catch (NullPointerException unused) {
            return computeLocalUri(context);
        }
    }

    public static final ImageSource getTransparentBitmapImageSource(Context context) {
        return INSTANCE.getTransparentBitmapImageSource(context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && AbstractC2855l.b(getClass(), other.getClass())) {
            ImageSource imageSource = (ImageSource) other;
            if (Double.compare(imageSource.size, this.size) == 0 && get_isResource() == imageSource.get_isResource() && AbstractC2855l.b(getUri(), imageSource.getUri()) && AbstractC2855l.b(this.source, imageSource.source) && this.cacheControl == imageSource.cacheControl) {
                return true;
            }
        }
        return false;
    }

    public final ImageCacheControl getCacheControl() {
        return this.cacheControl;
    }

    public final double getSize() {
        return this.size;
    }

    public final String getSource() {
        return this.source;
    }

    public Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Objects.hash(getUri(), this.source, Double.valueOf(this.size), Boolean.valueOf(get_isResource()), this.cacheControl);
    }

    /* JADX INFO: renamed from: isResource, reason: from getter */
    public boolean get_isResource() {
        return this._isResource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageSource(Context context, String str, double d10) {
        this(context, str, d10, 0.0d, null, 24, null);
        AbstractC2855l.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageSource(Context context, String str, double d10, double d11) {
        this(context, str, d10, d11, null, 16, null);
        AbstractC2855l.g(context, "context");
    }

    public ImageSource(Context context, String str, double d10, double d11, ImageCacheControl cacheControl) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(cacheControl, "cacheControl");
        this.source = str;
        this.cacheControl = cacheControl;
        this.uri = computeUri(context);
        this.size = d10 * d11;
    }

    public /* synthetic */ ImageSource(Context context, String str, double d10, double d11, ImageCacheControl imageCacheControl, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? 0.0d : d10, (i10 & 8) != 0 ? 0.0d : d11, (i10 & 16) != 0 ? ImageCacheControl.DEFAULT : imageCacheControl);
    }
}
