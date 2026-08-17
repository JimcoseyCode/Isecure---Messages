package expo.modules.medialibrary.next.objects.wrappers;

import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import i7.C2750m;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0010"}, d2 = {"Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUDIO", "IMAGE", "VIDEO", "UNKNOWN", "toMediaStoreValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final MediaType AUDIO = new MediaType("AUDIO", 0, "audio");
    public static final MediaType IMAGE = new MediaType("IMAGE", 1, "image");
    public static final MediaType VIDEO = new MediaType("VIDEO", 2, "video");
    public static final MediaType UNKNOWN = new MediaType("UNKNOWN", 3, "unknown");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/medialibrary/next/objects/wrappers/MediaType$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromString", "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", "string", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fromMediaStoreValue", "mediaStoreValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fromContentUri", "contentUri", "Landroid/net/Uri;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaType fromContentUri(Uri contentUri) {
            AbstractC2855l.g(contentUri, "contentUri");
            List<String> pathSegments = contentUri.getPathSegments();
            return pathSegments.contains("images") ? MediaType.IMAGE : pathSegments.contains("video") ? MediaType.VIDEO : pathSegments.contains("audio") ? MediaType.AUDIO : MediaType.UNKNOWN;
        }

        public final MediaType fromMediaStoreValue(int mediaStoreValue) {
            return mediaStoreValue != 1 ? mediaStoreValue != 2 ? mediaStoreValue != 3 ? MediaType.UNKNOWN : MediaType.VIDEO : MediaType.AUDIO : MediaType.IMAGE;
        }

        public final MediaType fromString(String string) {
            AbstractC2855l.g(string, "string");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC2855l.f(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 93166550) {
                if (iHashCode != 100313435) {
                    if (iHashCode == 112202875 && lowerCase.equals("video")) {
                        return MediaType.VIDEO;
                    }
                } else if (lowerCase.equals("image")) {
                    return MediaType.IMAGE;
                }
            } else if (lowerCase.equals("audio")) {
                return MediaType.AUDIO;
            }
            return MediaType.UNKNOWN;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ MediaType[] $values() {
        return new MediaType[]{AUDIO, IMAGE, VIDEO, UNKNOWN};
    }

    static {
        MediaType[] mediaTypeArr$values = $values();
        $VALUES = mediaTypeArr$values;
        $ENTRIES = AbstractC3083a.a(mediaTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private MediaType(String str, int i10, String str2) {
        this.value = str2;
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

    public final String getValue() {
        return this.value;
    }

    public final int toMediaStoreValue() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 3;
        }
        if (i10 == 4) {
            return 0;
        }
        throw new C2750m();
    }
}
