package expo.modules.camera;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b8\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u000eHÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010@\u001a\u00020\u0011HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u0096\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010G\u001a\u00020\u0011HÖ\u0001J\t\u0010H\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001dR*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001dR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001dR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001dR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010/\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.R\u001c\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0018\u001a\u0004\b1\u00102R\u001c\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0018\u001a\u0004\b4\u0010\u001dR\u001c\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010\u001d¨\u0006I"}, d2 = {"Lexpo/modules/camera/PictureOptions;", "Lexpo/modules/kotlin/records/Record;", "quality", PointerEventHelper.POINTER_TYPE_UNKNOWN, "base64", PointerEventHelper.POINTER_TYPE_UNKNOWN, "exif", "additionalExif", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "mirror", "skipProcessing", "imageType", "Lexpo/modules/camera/PictureFormat;", "fastMode", "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, "maxDownsampling", "shutterSound", "pictureRef", "<init>", "(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)V", "getQuality$annotations", "()V", "getQuality", "()D", "getBase64$annotations", "getBase64", "()Z", "getExif$annotations", "getExif", "getAdditionalExif$annotations", "getAdditionalExif", "()Ljava/util/Map;", "getMirror$annotations", "getMirror", "getSkipProcessing$annotations", "getSkipProcessing", "getImageType$annotations", "getImageType", "()Lexpo/modules/camera/PictureFormat;", "getFastMode$annotations", "getFastMode", "getId$annotations", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxDownsampling$annotations", "getMaxDownsampling", "()I", "getShutterSound$annotations", "getShutterSound", "getPictureRef$annotations", "getPictureRef", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)Lexpo/modules/camera/PictureOptions;", "equals", "other", "hashCode", "toString", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PictureOptions implements Record {
    private final Map<String, Object> additionalExif;
    private final boolean base64;
    private final boolean exif;
    private final boolean fastMode;
    private final Integer id;
    private final PictureFormat imageType;
    private final int maxDownsampling;
    private final boolean mirror;
    private final boolean pictureRef;
    private final double quality;
    private final boolean shutterSound;
    private final boolean skipProcessing;

    public PictureOptions() {
        this(0.0d, false, false, null, false, false, null, false, null, 0, false, false, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMaxDownsampling() {
        return this.maxDownsampling;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getShutterSound() {
        return this.shutterSound;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getPictureRef() {
        return this.pictureRef;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBase64() {
        return this.base64;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getExif() {
        return this.exif;
    }

    public final Map<String, Object> component4() {
        return this.additionalExif;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMirror() {
        return this.mirror;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSkipProcessing() {
        return this.skipProcessing;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PictureFormat getImageType() {
        return this.imageType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getFastMode() {
        return this.fastMode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    public final PictureOptions copy(double quality, boolean base64, boolean exif, Map<String, ? extends Object> additionalExif, boolean mirror, boolean skipProcessing, PictureFormat imageType, boolean fastMode, Integer id, int maxDownsampling, boolean shutterSound, boolean pictureRef) {
        AbstractC2855l.g(imageType, "imageType");
        return new PictureOptions(quality, base64, exif, additionalExif, mirror, skipProcessing, imageType, fastMode, id, maxDownsampling, shutterSound, pictureRef);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PictureOptions)) {
            return false;
        }
        PictureOptions pictureOptions = (PictureOptions) other;
        return Double.compare(this.quality, pictureOptions.quality) == 0 && this.base64 == pictureOptions.base64 && this.exif == pictureOptions.exif && AbstractC2855l.b(this.additionalExif, pictureOptions.additionalExif) && this.mirror == pictureOptions.mirror && this.skipProcessing == pictureOptions.skipProcessing && this.imageType == pictureOptions.imageType && this.fastMode == pictureOptions.fastMode && AbstractC2855l.b(this.id, pictureOptions.id) && this.maxDownsampling == pictureOptions.maxDownsampling && this.shutterSound == pictureOptions.shutterSound && this.pictureRef == pictureOptions.pictureRef;
    }

    public final Map<String, Object> getAdditionalExif() {
        return this.additionalExif;
    }

    public final boolean getBase64() {
        return this.base64;
    }

    public final boolean getExif() {
        return this.exif;
    }

    public final boolean getFastMode() {
        return this.fastMode;
    }

    public final Integer getId() {
        return this.id;
    }

    public final PictureFormat getImageType() {
        return this.imageType;
    }

    public final int getMaxDownsampling() {
        return this.maxDownsampling;
    }

    public final boolean getMirror() {
        return this.mirror;
    }

    public final boolean getPictureRef() {
        return this.pictureRef;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final boolean getShutterSound() {
        return this.shutterSound;
    }

    public final boolean getSkipProcessing() {
        return this.skipProcessing;
    }

    public int hashCode() {
        int iHashCode = ((((Double.hashCode(this.quality) * 31) + Boolean.hashCode(this.base64)) * 31) + Boolean.hashCode(this.exif)) * 31;
        Map<String, Object> map = this.additionalExif;
        int iHashCode2 = (((((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.mirror)) * 31) + Boolean.hashCode(this.skipProcessing)) * 31) + this.imageType.hashCode()) * 31) + Boolean.hashCode(this.fastMode)) * 31;
        Integer num = this.id;
        return ((((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.maxDownsampling)) * 31) + Boolean.hashCode(this.shutterSound)) * 31) + Boolean.hashCode(this.pictureRef);
    }

    public String toString() {
        return "PictureOptions(quality=" + this.quality + ", base64=" + this.base64 + ", exif=" + this.exif + ", additionalExif=" + this.additionalExif + ", mirror=" + this.mirror + ", skipProcessing=" + this.skipProcessing + ", imageType=" + this.imageType + ", fastMode=" + this.fastMode + ", id=" + this.id + ", maxDownsampling=" + this.maxDownsampling + ", shutterSound=" + this.shutterSound + ", pictureRef=" + this.pictureRef + ")";
    }

    public PictureOptions(double d10, boolean z10, boolean z11, Map<String, ? extends Object> map, boolean z12, boolean z13, PictureFormat imageType, boolean z14, Integer num, int i10, boolean z15, boolean z16) {
        AbstractC2855l.g(imageType, "imageType");
        this.quality = d10;
        this.base64 = z10;
        this.exif = z11;
        this.additionalExif = map;
        this.mirror = z12;
        this.skipProcessing = z13;
        this.imageType = imageType;
        this.fastMode = z14;
        this.id = num;
        this.maxDownsampling = i10;
        this.shutterSound = z15;
        this.pictureRef = z16;
    }

    public /* synthetic */ PictureOptions(double d10, boolean z10, boolean z11, Map map, boolean z12, boolean z13, PictureFormat pictureFormat, boolean z14, Integer num, int i10, boolean z15, boolean z16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1.0d : d10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : map, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? PictureFormat.JPEG : pictureFormat, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z14, (i11 & 256) == 0 ? num : null, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 1 : i10, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0 ? z15 : true, (i11 & 2048) != 0 ? false : z16);
    }

    @Field
    public static /* synthetic */ void getAdditionalExif$annotations() {
    }

    @Field
    public static /* synthetic */ void getBase64$annotations() {
    }

    @Field
    public static /* synthetic */ void getExif$annotations() {
    }

    @Field
    public static /* synthetic */ void getFastMode$annotations() {
    }

    @Field
    public static /* synthetic */ void getId$annotations() {
    }

    @Field
    public static /* synthetic */ void getImageType$annotations() {
    }

    @Field
    public static /* synthetic */ void getMaxDownsampling$annotations() {
    }

    @Field
    public static /* synthetic */ void getMirror$annotations() {
    }

    @Field
    public static /* synthetic */ void getPictureRef$annotations() {
    }

    @Field
    public static /* synthetic */ void getQuality$annotations() {
    }

    @Field
    public static /* synthetic */ void getShutterSound$annotations() {
    }

    @Field
    public static /* synthetic */ void getSkipProcessing$annotations() {
    }
}
