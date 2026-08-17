package expo.modules.medialibrary.next.records;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lexpo/modules/medialibrary/next/records/SortDescriptor;", "Lexpo/modules/kotlin/records/Record;", "key", "Lexpo/modules/medialibrary/next/records/AssetField;", "ascending", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)V", "getKey$annotations", "()V", "getKey", "()Lexpo/modules/medialibrary/next/records/AssetField;", "getAscending$annotations", "getAscending", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toMediaStoreQueryString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "component1", "component2", "copy", "(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)Lexpo/modules/medialibrary/next/records/SortDescriptor;", "equals", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SortDescriptor implements Record {
    private final Boolean ascending;
    private final AssetField key;

    public SortDescriptor(AssetField key, Boolean bool) {
        AbstractC2855l.g(key, "key");
        this.key = key;
        this.ascending = bool;
    }

    public static /* synthetic */ SortDescriptor copy$default(SortDescriptor sortDescriptor, AssetField assetField, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            assetField = sortDescriptor.key;
        }
        if ((i10 & 2) != 0) {
            bool = sortDescriptor.ascending;
        }
        return sortDescriptor.copy(assetField, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AssetField getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAscending() {
        return this.ascending;
    }

    public final SortDescriptor copy(AssetField key, Boolean ascending) {
        AbstractC2855l.g(key, "key");
        return new SortDescriptor(key, ascending);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortDescriptor)) {
            return false;
        }
        SortDescriptor sortDescriptor = (SortDescriptor) other;
        return this.key == sortDescriptor.key && AbstractC2855l.b(this.ascending, sortDescriptor.ascending);
    }

    public final Boolean getAscending() {
        return this.ascending;
    }

    public final AssetField getKey() {
        return this.key;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Boolean bool = this.ascending;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toMediaStoreQueryString() {
        Boolean bool = this.ascending;
        String str = bool != null ? bool.booleanValue() : true ? "ASC" : "DESC";
        return this.key.toMediaStoreColumn() + " " + str;
    }

    public String toString() {
        return "SortDescriptor(key=" + this.key + ", ascending=" + this.ascending + ")";
    }

    public /* synthetic */ SortDescriptor(AssetField assetField, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetField, (i10 & 2) != 0 ? Boolean.TRUE : bool);
    }

    @Field
    public static /* synthetic */ void getAscending$annotations() {
    }

    @Field
    public static /* synthetic */ void getKey$annotations() {
    }
}
