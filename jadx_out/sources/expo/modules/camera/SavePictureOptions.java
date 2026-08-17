package expo.modules.camera;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lexpo/modules/camera/SavePictureOptions;", "Lexpo/modules/kotlin/records/Record;", "quality", PointerEventHelper.POINTER_TYPE_UNKNOWN, "base64", PointerEventHelper.POINTER_TYPE_UNKNOWN, "metadata", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(DZLjava/util/Map;)V", "getQuality$annotations", "()V", "getQuality", "()D", "getBase64$annotations", "getBase64", "()Z", "getMetadata$annotations", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SavePictureOptions implements Record {
    private final boolean base64;
    private final Map<String, Object> metadata;
    private final double quality;

    public SavePictureOptions() {
        this(0.0d, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavePictureOptions copy$default(SavePictureOptions savePictureOptions, double d10, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = savePictureOptions.quality;
        }
        if ((i10 & 2) != 0) {
            z10 = savePictureOptions.base64;
        }
        if ((i10 & 4) != 0) {
            map = savePictureOptions.metadata;
        }
        return savePictureOptions.copy(d10, z10, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBase64() {
        return this.base64;
    }

    public final Map<String, Object> component3() {
        return this.metadata;
    }

    public final SavePictureOptions copy(double quality, boolean base64, Map<String, ? extends Object> metadata) {
        return new SavePictureOptions(quality, base64, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavePictureOptions)) {
            return false;
        }
        SavePictureOptions savePictureOptions = (SavePictureOptions) other;
        return Double.compare(this.quality, savePictureOptions.quality) == 0 && this.base64 == savePictureOptions.base64 && AbstractC2855l.b(this.metadata, savePictureOptions.metadata);
    }

    public final boolean getBase64() {
        return this.base64;
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final double getQuality() {
        return this.quality;
    }

    public int hashCode() {
        int iHashCode = ((Double.hashCode(this.quality) * 31) + Boolean.hashCode(this.base64)) * 31;
        Map<String, Object> map = this.metadata;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "SavePictureOptions(quality=" + this.quality + ", base64=" + this.base64 + ", metadata=" + this.metadata + ")";
    }

    public SavePictureOptions(double d10, boolean z10, Map<String, ? extends Object> map) {
        this.quality = d10;
        this.base64 = z10;
        this.metadata = map;
    }

    public /* synthetic */ SavePictureOptions(double d10, boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0d : d10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? K.i() : map);
    }

    @Field
    public static /* synthetic */ void getBase64$annotations() {
    }

    @Field
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @Field
    public static /* synthetic */ void getQuality$annotations() {
    }
}
