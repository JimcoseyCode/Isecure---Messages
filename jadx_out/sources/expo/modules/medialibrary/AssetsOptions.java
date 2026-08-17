package expo.modules.medialibrary;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&Jt\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0016R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u001bR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010 R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010'\u0012\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lexpo/modules/medialibrary/AssetsOptions;", "Lexpo/modules/kotlin/records/Record;", "first", PointerEventHelper.POINTER_TYPE_UNKNOWN, "after", PointerEventHelper.POINTER_TYPE_UNKNOWN, "album", "sortBy", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mediaType", "createdAfter", "createdBefore", "resolveWithFullInfo", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V", "getFirst$annotations", "()V", "getFirst", "()D", "getAfter$annotations", "getAfter", "()Ljava/lang/String;", "getAlbum$annotations", "getAlbum", "getSortBy$annotations", "getSortBy", "()Ljava/util/List;", "getMediaType$annotations", "getMediaType", "getCreatedAfter$annotations", "getCreatedAfter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCreatedBefore$annotations", "getCreatedBefore", "getResolveWithFullInfo$annotations", "getResolveWithFullInfo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Lexpo/modules/medialibrary/AssetsOptions;", "equals", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AssetsOptions implements Record {
    private final String after;
    private final String album;
    private final Double createdAfter;
    private final Double createdBefore;
    private final double first;
    private final List<String> mediaType;
    private final Boolean resolveWithFullInfo;
    private final List<String> sortBy;

    public AssetsOptions(double d10, String str, String str2, List<String> sortBy, List<String> mediaType, Double d11, Double d12, Boolean bool) {
        AbstractC2855l.g(sortBy, "sortBy");
        AbstractC2855l.g(mediaType, "mediaType");
        this.first = d10;
        this.after = str;
        this.album = str2;
        this.sortBy = sortBy;
        this.mediaType = mediaType;
        this.createdAfter = d11;
        this.createdBefore = d12;
        this.resolveWithFullInfo = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetsOptions copy$default(AssetsOptions assetsOptions, double d10, String str, String str2, List list, List list2, Double d11, Double d12, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = assetsOptions.first;
        }
        double d13 = d10;
        if ((i10 & 2) != 0) {
            str = assetsOptions.after;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = assetsOptions.album;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            list = assetsOptions.sortBy;
        }
        return assetsOptions.copy(d13, str3, str4, list, (i10 & 16) != 0 ? assetsOptions.mediaType : list2, (i10 & 32) != 0 ? assetsOptions.createdAfter : d11, (i10 & 64) != 0 ? assetsOptions.createdBefore : d12, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? assetsOptions.resolveWithFullInfo : bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAlbum() {
        return this.album;
    }

    public final List<String> component4() {
        return this.sortBy;
    }

    public final List<String> component5() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getCreatedAfter() {
        return this.createdAfter;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCreatedBefore() {
        return this.createdBefore;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getResolveWithFullInfo() {
        return this.resolveWithFullInfo;
    }

    public final AssetsOptions copy(double first, String after, String album, List<String> sortBy, List<String> mediaType, Double createdAfter, Double createdBefore, Boolean resolveWithFullInfo) {
        AbstractC2855l.g(sortBy, "sortBy");
        AbstractC2855l.g(mediaType, "mediaType");
        return new AssetsOptions(first, after, album, sortBy, mediaType, createdAfter, createdBefore, resolveWithFullInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetsOptions)) {
            return false;
        }
        AssetsOptions assetsOptions = (AssetsOptions) other;
        return Double.compare(this.first, assetsOptions.first) == 0 && AbstractC2855l.b(this.after, assetsOptions.after) && AbstractC2855l.b(this.album, assetsOptions.album) && AbstractC2855l.b(this.sortBy, assetsOptions.sortBy) && AbstractC2855l.b(this.mediaType, assetsOptions.mediaType) && AbstractC2855l.b(this.createdAfter, assetsOptions.createdAfter) && AbstractC2855l.b(this.createdBefore, assetsOptions.createdBefore) && AbstractC2855l.b(this.resolveWithFullInfo, assetsOptions.resolveWithFullInfo);
    }

    public final String getAfter() {
        return this.after;
    }

    public final String getAlbum() {
        return this.album;
    }

    public final Double getCreatedAfter() {
        return this.createdAfter;
    }

    public final Double getCreatedBefore() {
        return this.createdBefore;
    }

    public final double getFirst() {
        return this.first;
    }

    public final List<String> getMediaType() {
        return this.mediaType;
    }

    public final Boolean getResolveWithFullInfo() {
        return this.resolveWithFullInfo;
    }

    public final List<String> getSortBy() {
        return this.sortBy;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.first) * 31;
        String str = this.after;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.album;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.sortBy.hashCode()) * 31) + this.mediaType.hashCode()) * 31;
        Double d10 = this.createdAfter;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.createdBefore;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Boolean bool = this.resolveWithFullInfo;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "AssetsOptions(first=" + this.first + ", after=" + this.after + ", album=" + this.album + ", sortBy=" + this.sortBy + ", mediaType=" + this.mediaType + ", createdAfter=" + this.createdAfter + ", createdBefore=" + this.createdBefore + ", resolveWithFullInfo=" + this.resolveWithFullInfo + ")";
    }

    @Field
    public static /* synthetic */ void getAfter$annotations() {
    }

    @Field
    public static /* synthetic */ void getAlbum$annotations() {
    }

    @Field
    public static /* synthetic */ void getCreatedAfter$annotations() {
    }

    @Field
    public static /* synthetic */ void getCreatedBefore$annotations() {
    }

    @Field
    public static /* synthetic */ void getFirst$annotations() {
    }

    @Field
    public static /* synthetic */ void getMediaType$annotations() {
    }

    @Field
    public static /* synthetic */ void getResolveWithFullInfo$annotations() {
    }

    @Field
    public static /* synthetic */ void getSortBy$annotations() {
    }
}
