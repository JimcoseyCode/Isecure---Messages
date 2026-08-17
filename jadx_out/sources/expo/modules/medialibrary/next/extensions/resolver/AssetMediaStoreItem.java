package expo.modules.medialibrary.next.extensions.resolver;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006+"}, d2 = {"Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "displayName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "dateTaken", PointerEventHelper.POINTER_TYPE_UNKNOWN, "dateModified", "duration", "data", "bucketId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "getDateTaken", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDateModified", "getDuration", "getData", "getBucketId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", "toString", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AssetMediaStoreItem {
    private final String bucketId;
    private final String data;
    private final Long dateModified;
    private final Long dateTaken;
    private final String displayName;
    private final Long duration;
    private final Integer height;
    private final Integer width;

    public AssetMediaStoreItem(String str, Integer num, Integer num2, Long l10, Long l11, Long l12, String str2, String str3) {
        this.displayName = str;
        this.height = num;
        this.width = num2;
        this.dateTaken = l10;
        this.dateModified = l11;
        this.duration = l12;
        this.data = str2;
        this.bucketId = str3;
    }

    public static /* synthetic */ AssetMediaStoreItem copy$default(AssetMediaStoreItem assetMediaStoreItem, String str, Integer num, Integer num2, Long l10, Long l11, Long l12, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = assetMediaStoreItem.displayName;
        }
        if ((i10 & 2) != 0) {
            num = assetMediaStoreItem.height;
        }
        if ((i10 & 4) != 0) {
            num2 = assetMediaStoreItem.width;
        }
        if ((i10 & 8) != 0) {
            l10 = assetMediaStoreItem.dateTaken;
        }
        if ((i10 & 16) != 0) {
            l11 = assetMediaStoreItem.dateModified;
        }
        if ((i10 & 32) != 0) {
            l12 = assetMediaStoreItem.duration;
        }
        if ((i10 & 64) != 0) {
            str2 = assetMediaStoreItem.data;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str3 = assetMediaStoreItem.bucketId;
        }
        String str4 = str2;
        String str5 = str3;
        Long l13 = l11;
        Long l14 = l12;
        return assetMediaStoreItem.copy(str, num, num2, l10, l13, l14, str4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDateTaken() {
        return this.dateTaken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getDateModified() {
        return this.dateModified;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBucketId() {
        return this.bucketId;
    }

    public final AssetMediaStoreItem copy(String displayName, Integer height, Integer width, Long dateTaken, Long dateModified, Long duration, String data, String bucketId) {
        return new AssetMediaStoreItem(displayName, height, width, dateTaken, dateModified, duration, data, bucketId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetMediaStoreItem)) {
            return false;
        }
        AssetMediaStoreItem assetMediaStoreItem = (AssetMediaStoreItem) other;
        return AbstractC2855l.b(this.displayName, assetMediaStoreItem.displayName) && AbstractC2855l.b(this.height, assetMediaStoreItem.height) && AbstractC2855l.b(this.width, assetMediaStoreItem.width) && AbstractC2855l.b(this.dateTaken, assetMediaStoreItem.dateTaken) && AbstractC2855l.b(this.dateModified, assetMediaStoreItem.dateModified) && AbstractC2855l.b(this.duration, assetMediaStoreItem.duration) && AbstractC2855l.b(this.data, assetMediaStoreItem.data) && AbstractC2855l.b(this.bucketId, assetMediaStoreItem.bucketId);
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    public final String getData() {
        return this.data;
    }

    public final Long getDateModified() {
        return this.dateModified;
    }

    public final Long getDateTaken() {
        return this.dateTaken;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.dateTaken;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.dateModified;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.duration;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.data;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bucketId;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AssetMediaStoreItem(displayName=" + this.displayName + ", height=" + this.height + ", width=" + this.width + ", dateTaken=" + this.dateTaken + ", dateModified=" + this.dateModified + ", duration=" + this.duration + ", data=" + this.data + ", bucketId=" + this.bucketId + ")";
    }
}
