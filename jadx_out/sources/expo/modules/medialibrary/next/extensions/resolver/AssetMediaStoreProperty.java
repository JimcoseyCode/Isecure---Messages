package expo.modules.medialibrary.next.extensions.resolver;

import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0012J\f\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u0012¢\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0012¢\u0006\u0002\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u001a"}, d2 = {"Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "column", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getColumn", "()Ljava/lang/String;", "DisplayName", "Height", "Width", "DateTaken", "DateModified", "Duration", "Data", "BucketId", "columnIndex", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/database/Cursor;", "getString", "getInt", "(Landroid/database/Cursor;)Ljava/lang/Integer;", "getLong", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Landroid/database/Cursor;)Ljava/lang/Long;", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetMediaStoreProperty {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetMediaStoreProperty[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String column;
    public static final AssetMediaStoreProperty DisplayName = new AssetMediaStoreProperty("DisplayName", 0, "_display_name");
    public static final AssetMediaStoreProperty Height = new AssetMediaStoreProperty("Height", 1, "height");
    public static final AssetMediaStoreProperty Width = new AssetMediaStoreProperty("Width", 2, "width");
    public static final AssetMediaStoreProperty DateTaken = new AssetMediaStoreProperty("DateTaken", 3, "datetaken");
    public static final AssetMediaStoreProperty DateModified = new AssetMediaStoreProperty("DateModified", 4, "date_modified");
    public static final AssetMediaStoreProperty Duration = new AssetMediaStoreProperty("Duration", 5, "duration");
    public static final AssetMediaStoreProperty Data = new AssetMediaStoreProperty("Data", 6, "_data");
    public static final AssetMediaStoreProperty BucketId = new AssetMediaStoreProperty("BucketId", 7, "bucket_id");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "projection", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "includeDuration", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Z)[Ljava/lang/String;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String[] projection(boolean includeDuration) {
            AssetMediaStoreProperty[] assetMediaStorePropertyArrValues = AssetMediaStoreProperty.values();
            ArrayList arrayList = new ArrayList();
            for (AssetMediaStoreProperty assetMediaStoreProperty : assetMediaStorePropertyArrValues) {
                if (includeDuration || assetMediaStoreProperty != AssetMediaStoreProperty.Duration) {
                    arrayList.add(assetMediaStoreProperty);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AssetMediaStoreProperty) it.next()).getColumn());
            }
            return (String[]) arrayList2.toArray(new String[0]);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AssetMediaStoreProperty[] $values() {
        return new AssetMediaStoreProperty[]{DisplayName, Height, Width, DateTaken, DateModified, Duration, Data, BucketId};
    }

    static {
        AssetMediaStoreProperty[] assetMediaStorePropertyArr$values = $values();
        $VALUES = assetMediaStorePropertyArr$values;
        $ENTRIES = AbstractC3083a.a(assetMediaStorePropertyArr$values);
        INSTANCE = new Companion(null);
    }

    private AssetMediaStoreProperty(String str, int i10, String str2) {
        this.column = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AssetMediaStoreProperty valueOf(String str) {
        return (AssetMediaStoreProperty) Enum.valueOf(AssetMediaStoreProperty.class, str);
    }

    public static AssetMediaStoreProperty[] values() {
        return (AssetMediaStoreProperty[]) $VALUES.clone();
    }

    public final int columnIndex(Cursor cursor) {
        AbstractC2855l.g(cursor, "<this>");
        return cursor.getColumnIndexOrThrow(this.column);
    }

    public final String getColumn() {
        return this.column;
    }

    public final Integer getInt(Cursor cursor) {
        AbstractC2855l.g(cursor, "<this>");
        return Integer.valueOf(cursor.getInt(columnIndex(cursor)));
    }

    public final Long getLong(Cursor cursor) {
        AbstractC2855l.g(cursor, "<this>");
        return Long.valueOf(cursor.getLong(columnIndex(cursor)));
    }

    public final String getString(Cursor cursor) {
        AbstractC2855l.g(cursor, "<this>");
        return cursor.getString(columnIndex(cursor));
    }
}
