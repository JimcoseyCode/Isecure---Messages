package expo.modules.medialibrary;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lexpo/modules/medialibrary/GranularPermission;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUDIO", "PHOTO", "VIDEO", "toManifestPermission", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GranularPermission implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GranularPermission[] $VALUES;
    public static final GranularPermission AUDIO = new GranularPermission("AUDIO", 0, "audio");
    public static final GranularPermission PHOTO = new GranularPermission("PHOTO", 1, "photo");
    public static final GranularPermission VIDEO = new GranularPermission("VIDEO", 2, "video");
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GranularPermission.values().length];
            try {
                iArr[GranularPermission.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GranularPermission.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GranularPermission.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ GranularPermission[] $values() {
        return new GranularPermission[]{AUDIO, PHOTO, VIDEO};
    }

    static {
        GranularPermission[] granularPermissionArr$values = $values();
        $VALUES = granularPermissionArr$values;
        $ENTRIES = AbstractC3083a.a(granularPermissionArr$values);
    }

    private GranularPermission(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static GranularPermission valueOf(String str) {
        return (GranularPermission) Enum.valueOf(GranularPermission.class, str);
    }

    public static GranularPermission[] values() {
        return (GranularPermission[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final String toManifestPermission() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return "android.permission.READ_MEDIA_AUDIO";
        }
        if (i10 == 2) {
            return "android.permission.READ_MEDIA_IMAGES";
        }
        if (i10 == 3) {
            return "android.permission.READ_MEDIA_VIDEO";
        }
        throw new C2750m();
    }
}
