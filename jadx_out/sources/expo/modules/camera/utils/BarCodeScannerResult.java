package expo.modules.camera.utils;

import android.os.Bundle;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001#BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lexpo/modules/camera/utils/BarCodeScannerResult;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "raw", "extra", "Landroid/os/Bundle;", "cornerPoints", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "width", "<init>", "(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;II)V", "getType", "()I", "getValue", "()Ljava/lang/String;", "getRaw", "getExtra", "()Landroid/os/Bundle;", "getCornerPoints", "()Ljava/util/List;", "setCornerPoints", "(Ljava/util/List;)V", "getHeight", "setHeight", "(I)V", "getWidth", "setWidth", "boundingBox", "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;", "getBoundingBox", "()Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;", "BoundingBox", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BarCodeScannerResult {
    private List<Integer> cornerPoints;
    private final Bundle extra;
    private int height;
    private final String raw;
    private final int type;
    private final String value;
    private int width;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "x", PointerEventHelper.POINTER_TYPE_UNKNOWN, "y", "width", "height", "<init>", "(IIII)V", "getX", "()I", "getY", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoundingBox {
        private final int height;
        private final int width;
        private final int x;
        private final int y;

        public BoundingBox(int i10, int i11, int i12, int i13) {
            this.x = i10;
            this.y = i11;
            this.width = i12;
            this.height = i13;
        }

        public static /* synthetic */ BoundingBox copy$default(BoundingBox boundingBox, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = boundingBox.x;
            }
            if ((i14 & 2) != 0) {
                i11 = boundingBox.y;
            }
            if ((i14 & 4) != 0) {
                i12 = boundingBox.width;
            }
            if ((i14 & 8) != 0) {
                i13 = boundingBox.height;
            }
            return boundingBox.copy(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final BoundingBox copy(int x10, int y10, int width, int height) {
            return new BoundingBox(x10, y10, width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BoundingBox)) {
                return false;
            }
            BoundingBox boundingBox = (BoundingBox) other;
            return this.x == boundingBox.x && this.y == boundingBox.y && this.width == boundingBox.width && this.height == boundingBox.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.x) * 31) + Integer.hashCode(this.y)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "BoundingBox(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ")";
        }
    }

    public BarCodeScannerResult(int i10, String str, String str2, Bundle extra, List<Integer> cornerPoints, int i11, int i12) {
        AbstractC2855l.g(extra, "extra");
        AbstractC2855l.g(cornerPoints, "cornerPoints");
        this.type = i10;
        this.value = str;
        this.raw = str2;
        this.extra = extra;
        this.cornerPoints = cornerPoints;
        this.height = i11;
        this.width = i12;
    }

    public final BoundingBox getBoundingBox() {
        if (this.cornerPoints.isEmpty()) {
            return new BoundingBox(0, 0, 0, 0);
        }
        int iMax = a.INVALID_ID;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < this.cornerPoints.size(); i10 += 2) {
            int iIntValue = this.cornerPoints.get(i10).intValue();
            int iIntValue2 = this.cornerPoints.get(i10 + 1).intValue();
            iMin = Integer.min(iMin, iIntValue);
            iMin2 = Integer.min(iMin2, iIntValue2);
            iMax = Integer.max(iMax, iIntValue);
            iMax2 = Integer.max(iMax2, iIntValue2);
        }
        return new BoundingBox(iMin, iMin2, iMax - iMin, iMax2 - iMin2);
    }

    public final List<Integer> getCornerPoints() {
        return this.cornerPoints;
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getRaw() {
        return this.raw;
    }

    public final int getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setCornerPoints(List<Integer> list) {
        AbstractC2855l.g(list, "<set-?>");
        this.cornerPoints = list;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }
}
