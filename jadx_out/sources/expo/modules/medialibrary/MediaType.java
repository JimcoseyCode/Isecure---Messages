package expo.modules.medialibrary;

import B7.d;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lexpo/modules/medialibrary/MediaType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "apiName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mediaColumn", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getApiName", "()Ljava/lang/String;", "getMediaColumn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "AUDIO", "PHOTO", "VIDEO", "UNKNOWN", "ALL", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String apiName;
    private final Integer mediaColumn;
    public static final MediaType AUDIO = new MediaType("AUDIO", 0, "audio", 2);
    public static final MediaType PHOTO = new MediaType("PHOTO", 1, "photo", 1);
    public static final MediaType VIDEO = new MediaType("VIDEO", 2, "video", 3);
    public static final MediaType UNKNOWN = new MediaType("UNKNOWN", 3, "unknown", 0);
    public static final MediaType ALL = new MediaType("ALL", 4, "all", null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lexpo/modules/medialibrary/MediaType$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getConstants", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "fromApiName", "Lexpo/modules/medialibrary/MediaType;", "constantName", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaType fromApiName(String constantName) {
            AbstractC2855l.g(constantName, "constantName");
            for (MediaType mediaType : MediaType.values()) {
                if (AbstractC2855l.b(mediaType.getApiName(), constantName)) {
                    return mediaType;
                }
            }
            return null;
        }

        public final Map<String, String> getConstants() {
            MediaType[] mediaTypeArrValues = MediaType.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.d(K.e(mediaTypeArrValues.length), 16));
            for (MediaType mediaType : mediaTypeArrValues) {
                Pair pair = new Pair(mediaType.getApiName(), mediaType.getApiName());
                linkedHashMap.put(pair.c(), pair.d());
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MediaType[] $values() {
        return new MediaType[]{AUDIO, PHOTO, VIDEO, UNKNOWN, ALL};
    }

    static {
        MediaType[] mediaTypeArr$values = $values();
        $VALUES = mediaTypeArr$values;
        $ENTRIES = AbstractC3083a.a(mediaTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private MediaType(String str, int i10, String str2, Integer num) {
        this.apiName = str2;
        this.mediaColumn = num;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }

    public final String getApiName() {
        return this.apiName;
    }

    public final Integer getMediaColumn() {
        return this.mediaColumn;
    }
}
