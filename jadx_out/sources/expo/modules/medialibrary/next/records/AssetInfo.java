package expo.modules.medialibrary.next.records;

import android.net.Uri;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.medialibrary.next.objects.wrappers.MediaType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u00103\u001a\u00020\u0003HÆ\u0003Jn\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\nHÖ\u0001J\t\u0010;\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010!R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010&R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0013\u001a\u0004\b*\u0010\u0015¨\u0006<"}, d2 = {"Lexpo/modules/medialibrary/next/records/AssetInfo;", "Lexpo/modules/kotlin/records/Record;", "id", "Landroid/net/Uri;", "creationTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "duration", "filename", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "mediaType", "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", "modificationTime", "uri", "<init>", "(Landroid/net/Uri;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;IILexpo/modules/medialibrary/next/objects/wrappers/MediaType;Ljava/lang/Long;Landroid/net/Uri;)V", "getId$annotations", "()V", "getId", "()Landroid/net/Uri;", "getCreationTime$annotations", "getCreationTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDuration$annotations", "getDuration", "getFilename$annotations", "getFilename", "()Ljava/lang/String;", "getHeight$annotations", "getHeight", "()I", "getWidth$annotations", "getWidth", "getMediaType$annotations", "getMediaType", "()Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", "getModificationTime$annotations", "getModificationTime", "getUri$annotations", "getUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Landroid/net/Uri;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;IILexpo/modules/medialibrary/next/objects/wrappers/MediaType;Ljava/lang/Long;Landroid/net/Uri;)Lexpo/modules/medialibrary/next/records/AssetInfo;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "toString", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AssetInfo implements Record {
    private final Long creationTime;
    private final Long duration;
    private final String filename;
    private final int height;
    private final Uri id;
    private final MediaType mediaType;
    private final Long modificationTime;
    private final Uri uri;
    private final int width;

    public AssetInfo(Uri id, Long l10, Long l11, String filename, int i10, int i11, MediaType mediaType, Long l12, Uri uri) {
        AbstractC2855l.g(id, "id");
        AbstractC2855l.g(filename, "filename");
        AbstractC2855l.g(mediaType, "mediaType");
        AbstractC2855l.g(uri, "uri");
        this.id = id;
        this.creationTime = l10;
        this.duration = l11;
        this.filename = filename;
        this.height = i10;
        this.width = i11;
        this.mediaType = mediaType;
        this.modificationTime = l12;
        this.uri = uri;
    }

    public static /* synthetic */ AssetInfo copy$default(AssetInfo assetInfo, Uri uri, Long l10, Long l11, String str, int i10, int i11, MediaType mediaType, Long l12, Uri uri2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = assetInfo.id;
        }
        if ((i12 & 2) != 0) {
            l10 = assetInfo.creationTime;
        }
        if ((i12 & 4) != 0) {
            l11 = assetInfo.duration;
        }
        if ((i12 & 8) != 0) {
            str = assetInfo.filename;
        }
        if ((i12 & 16) != 0) {
            i10 = assetInfo.height;
        }
        if ((i12 & 32) != 0) {
            i11 = assetInfo.width;
        }
        if ((i12 & 64) != 0) {
            mediaType = assetInfo.mediaType;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            l12 = assetInfo.modificationTime;
        }
        if ((i12 & 256) != 0) {
            uri2 = assetInfo.uri;
        }
        Long l13 = l12;
        Uri uri3 = uri2;
        int i13 = i11;
        MediaType mediaType2 = mediaType;
        int i14 = i10;
        Long l14 = l11;
        return assetInfo.copy(uri, l10, l14, str, i14, i13, mediaType2, l13, uri3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MediaType getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getModificationTime() {
        return this.modificationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public final AssetInfo copy(Uri id, Long creationTime, Long duration, String filename, int height, int width, MediaType mediaType, Long modificationTime, Uri uri) {
        AbstractC2855l.g(id, "id");
        AbstractC2855l.g(filename, "filename");
        AbstractC2855l.g(mediaType, "mediaType");
        AbstractC2855l.g(uri, "uri");
        return new AssetInfo(id, creationTime, duration, filename, height, width, mediaType, modificationTime, uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetInfo)) {
            return false;
        }
        AssetInfo assetInfo = (AssetInfo) other;
        return AbstractC2855l.b(this.id, assetInfo.id) && AbstractC2855l.b(this.creationTime, assetInfo.creationTime) && AbstractC2855l.b(this.duration, assetInfo.duration) && AbstractC2855l.b(this.filename, assetInfo.filename) && this.height == assetInfo.height && this.width == assetInfo.width && this.mediaType == assetInfo.mediaType && AbstractC2855l.b(this.modificationTime, assetInfo.modificationTime) && AbstractC2855l.b(this.uri, assetInfo.uri);
    }

    public final Long getCreationTime() {
        return this.creationTime;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Uri getId() {
        return this.id;
    }

    public final MediaType getMediaType() {
        return this.mediaType;
    }

    public final Long getModificationTime() {
        return this.modificationTime;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Long l10 = this.creationTime;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.duration;
        int iHashCode3 = (((((((((iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31) + this.filename.hashCode()) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.width)) * 31) + this.mediaType.hashCode()) * 31;
        Long l12 = this.modificationTime;
        return ((iHashCode3 + (l12 != null ? l12.hashCode() : 0)) * 31) + this.uri.hashCode();
    }

    public String toString() {
        return "AssetInfo(id=" + this.id + ", creationTime=" + this.creationTime + ", duration=" + this.duration + ", filename=" + this.filename + ", height=" + this.height + ", width=" + this.width + ", mediaType=" + this.mediaType + ", modificationTime=" + this.modificationTime + ", uri=" + this.uri + ")";
    }

    @Field
    public static /* synthetic */ void getCreationTime$annotations() {
    }

    @Field
    public static /* synthetic */ void getDuration$annotations() {
    }

    @Field
    public static /* synthetic */ void getFilename$annotations() {
    }

    @Field
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Field
    public static /* synthetic */ void getId$annotations() {
    }

    @Field
    public static /* synthetic */ void getMediaType$annotations() {
    }

    @Field
    public static /* synthetic */ void getModificationTime$annotations() {
    }

    @Field
    public static /* synthetic */ void getUri$annotations() {
    }

    @Field
    public static /* synthetic */ void getWidth$annotations() {
    }
}
