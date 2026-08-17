package expo.modules.clipboard;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lexpo/modules/clipboard/ImageResult;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "base64Image", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "<init>", "(Ljava/lang/String;II)V", "getBase64Image", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "toBundle", "Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", "toString", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageResult {
    private final String base64Image;
    private final int height;
    private final int width;

    public ImageResult(String base64Image, int i10, int i11) {
        AbstractC2855l.g(base64Image, "base64Image");
        this.base64Image = base64Image;
        this.width = i10;
        this.height = i11;
    }

    public static /* synthetic */ ImageResult copy$default(ImageResult imageResult, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imageResult.base64Image;
        }
        if ((i12 & 2) != 0) {
            i10 = imageResult.width;
        }
        if ((i12 & 4) != 0) {
            i11 = imageResult.height;
        }
        return imageResult.copy(str, i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBase64Image() {
        return this.base64Image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final ImageResult copy(String base64Image, int width, int height) {
        AbstractC2855l.g(base64Image, "base64Image");
        return new ImageResult(base64Image, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageResult)) {
            return false;
        }
        ImageResult imageResult = (ImageResult) other;
        return AbstractC2855l.b(this.base64Image, imageResult.base64Image) && this.width == imageResult.width && this.height == imageResult.height;
    }

    public final String getBase64Image() {
        return this.base64Image;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.base64Image.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    public final Bundle toBundle() {
        return D0.c.a(t.a("data", this.base64Image), t.a("size", D0.c.a(t.a("width", Integer.valueOf(this.width)), t.a("height", Integer.valueOf(this.height)))));
    }

    public String toString() {
        return "ImageResult(base64Image=" + this.base64Image + ", width=" + this.width + ", height=" + this.height + ")";
    }
}
