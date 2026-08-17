package expo.modules.medialibrary;

import B7.d;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.K;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/medialibrary/SortBy;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "keyName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mediaColumnName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKeyName", "()Ljava/lang/String;", "getMediaColumnName", "DEFAULT", "CREATION_TIME", "MODIFICATION_TIME", "MEDIA_TYPE", "WIDTH", "HEIGHT", "DURATION", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SortBy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SortBy[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String keyName;
    private final String mediaColumnName;
    public static final SortBy DEFAULT = new SortBy("DEFAULT", 0, Constants.COLLATION_DEFAULT, "_id");
    public static final SortBy CREATION_TIME = new SortBy("CREATION_TIME", 1, "creationTime", "datetaken");
    public static final SortBy MODIFICATION_TIME = new SortBy("MODIFICATION_TIME", 2, "modificationTime", "date_modified");
    public static final SortBy MEDIA_TYPE = new SortBy("MEDIA_TYPE", 3, "mediaType", "media_type");
    public static final SortBy WIDTH = new SortBy("WIDTH", 4, "width", "width");
    public static final SortBy HEIGHT = new SortBy("HEIGHT", 5, "height", "height");
    public static final SortBy DURATION = new SortBy("DURATION", 6, "duration", "duration");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lexpo/modules/medialibrary/SortBy$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getConstants", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "fromKeyName", "Lexpo/modules/medialibrary/SortBy;", "keyName", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SortBy fromKeyName(String keyName) {
            AbstractC2855l.g(keyName, "keyName");
            for (SortBy sortBy : SortBy.values()) {
                if (AbstractC2855l.b(sortBy.getKeyName(), keyName)) {
                    return sortBy;
                }
            }
            return null;
        }

        public final Map<String, String> getConstants() {
            SortBy[] sortByArrValues = SortBy.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.d(K.e(sortByArrValues.length), 16));
            for (SortBy sortBy : sortByArrValues) {
                Pair pair = new Pair(sortBy.getKeyName(), sortBy.getKeyName());
                linkedHashMap.put(pair.c(), pair.d());
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SortBy[] $values() {
        return new SortBy[]{DEFAULT, CREATION_TIME, MODIFICATION_TIME, MEDIA_TYPE, WIDTH, HEIGHT, DURATION};
    }

    static {
        SortBy[] sortByArr$values = $values();
        $VALUES = sortByArr$values;
        $ENTRIES = AbstractC3083a.a(sortByArr$values);
        INSTANCE = new Companion(null);
    }

    private SortBy(String str, int i10, String str2, String str3) {
        this.keyName = str2;
        this.mediaColumnName = str3;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SortBy valueOf(String str) {
        return (SortBy) Enum.valueOf(SortBy.class, str);
    }

    public static SortBy[] values() {
        return (SortBy[]) $VALUES.clone();
    }

    public final String getKeyName() {
        return this.keyName;
    }

    public final String getMediaColumnName() {
        return this.mediaColumnName;
    }
}
