package expo.modules.camera.utils;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.camera.records.CameraType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001f"}, d2 = {"Lexpo/modules/camera/utils/ImageDimensions;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mWidth", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mHeight", ViewProps.ROTATION, "facing", "Lexpo/modules/camera/records/CameraType;", "<init>", "(IIILexpo/modules/camera/records/CameraType;)V", "getRotation", "()I", "getFacing", "()Lexpo/modules/camera/records/CameraType;", "isLandscape", PointerEventHelper.POINTER_TYPE_UNKNOWN, "()Z", "width", "getWidth", "height", "getHeight", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageDimensions {
    private final CameraType facing;
    private final int mHeight;
    private final int mWidth;
    private final int rotation;

    public ImageDimensions(int i10, int i11) {
        this(i10, i11, 0, null, 12, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final int getMWidth() {
        return this.mWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final int getMHeight() {
        return this.mHeight;
    }

    public static /* synthetic */ ImageDimensions copy$default(ImageDimensions imageDimensions, int i10, int i11, int i12, CameraType cameraType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = imageDimensions.mWidth;
        }
        if ((i13 & 2) != 0) {
            i11 = imageDimensions.mHeight;
        }
        if ((i13 & 4) != 0) {
            i12 = imageDimensions.rotation;
        }
        if ((i13 & 8) != 0) {
            cameraType = imageDimensions.facing;
        }
        return imageDimensions.copy(i10, i11, i12, cameraType);
    }

    private final boolean isLandscape() {
        return this.rotation % 180 == 90;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CameraType getFacing() {
        return this.facing;
    }

    public final ImageDimensions copy(int mWidth, int mHeight, int rotation, CameraType facing) {
        AbstractC2855l.g(facing, "facing");
        return new ImageDimensions(mWidth, mHeight, rotation, facing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDimensions)) {
            return false;
        }
        ImageDimensions imageDimensions = (ImageDimensions) other;
        return this.mWidth == imageDimensions.mWidth && this.mHeight == imageDimensions.mHeight && this.rotation == imageDimensions.rotation && this.facing == imageDimensions.facing;
    }

    public final CameraType getFacing() {
        return this.facing;
    }

    public final int getHeight() {
        return isLandscape() ? this.mWidth : this.mHeight;
    }

    public final int getRotation() {
        return this.rotation;
    }

    public final int getWidth() {
        return isLandscape() ? this.mHeight : this.mWidth;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mWidth) * 31) + Integer.hashCode(this.mHeight)) * 31) + Integer.hashCode(this.rotation)) * 31) + this.facing.hashCode();
    }

    public String toString() {
        return "ImageDimensions(mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", rotation=" + this.rotation + ", facing=" + this.facing + ")";
    }

    public ImageDimensions(int i10, int i11, int i12) {
        this(i10, i11, i12, null, 8, null);
    }

    public ImageDimensions(int i10, int i11, int i12, CameraType facing) {
        AbstractC2855l.g(facing, "facing");
        this.mWidth = i10;
        this.mHeight = i11;
        this.rotation = i12;
        this.facing = facing;
    }

    public /* synthetic */ ImageDimensions(int i10, int i11, int i12, CameraType cameraType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? CameraType.BACK : cameraType);
    }
}
