package expo.modules.camera.records;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/camera/records/VideoStabilizationMode;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OFF", "STANDARD", "CINEMATIC", "AUTO", "isEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoStabilizationMode implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoStabilizationMode[] $VALUES;
    private final String value;
    public static final VideoStabilizationMode OFF = new VideoStabilizationMode("OFF", 0, "off");
    public static final VideoStabilizationMode STANDARD = new VideoStabilizationMode("STANDARD", 1, Constants.COLLATION_STANDARD);
    public static final VideoStabilizationMode CINEMATIC = new VideoStabilizationMode("CINEMATIC", 2, "cinematic");
    public static final VideoStabilizationMode AUTO = new VideoStabilizationMode("AUTO", 3, "auto");

    private static final /* synthetic */ VideoStabilizationMode[] $values() {
        return new VideoStabilizationMode[]{OFF, STANDARD, CINEMATIC, AUTO};
    }

    static {
        VideoStabilizationMode[] videoStabilizationModeArr$values = $values();
        $VALUES = videoStabilizationModeArr$values;
        $ENTRIES = AbstractC3083a.a(videoStabilizationModeArr$values);
    }

    private VideoStabilizationMode(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static VideoStabilizationMode valueOf(String str) {
        return (VideoStabilizationMode) Enum.valueOf(VideoStabilizationMode.class, str);
    }

    public static VideoStabilizationMode[] values() {
        return (VideoStabilizationMode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isEnabled() {
        return this != OFF;
    }
}
