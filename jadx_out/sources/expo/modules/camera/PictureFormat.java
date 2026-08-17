package expo.modules.camera;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lexpo/modules/camera/PictureFormat;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "JPEG", "PNG", "toExtension", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PictureFormat implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PictureFormat[] $VALUES;
    public static final PictureFormat JPEG = new PictureFormat("JPEG", 0, "jpg");
    public static final PictureFormat PNG = new PictureFormat("PNG", 1, "png");
    private final String value;

    private static final /* synthetic */ PictureFormat[] $values() {
        return new PictureFormat[]{JPEG, PNG};
    }

    static {
        PictureFormat[] pictureFormatArr$values = $values();
        $VALUES = pictureFormatArr$values;
        $ENTRIES = AbstractC3083a.a(pictureFormatArr$values);
    }

    private PictureFormat(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PictureFormat valueOf(String str) {
        return (PictureFormat) Enum.valueOf(PictureFormat.class, str);
    }

    public static PictureFormat[] values() {
        return (PictureFormat[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final String toExtension() {
        return "." + this.value;
    }
}
