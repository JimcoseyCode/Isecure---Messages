package expo.modules.camera.records;

import S.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/camera/records/CameraRatio;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "LS/a;", "mapToStrategy", "()LS/a;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FOUR_THREE", "SIXTEEN_NINE", "ONE_ONE", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraRatio implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraRatio[] $VALUES;
    private final String value;
    public static final CameraRatio FOUR_THREE = new CameraRatio("FOUR_THREE", 0, "4:3");
    public static final CameraRatio SIXTEEN_NINE = new CameraRatio("SIXTEEN_NINE", 1, "16:9");
    public static final CameraRatio ONE_ONE = new CameraRatio("ONE_ONE", 2, "1:1");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraRatio.values().length];
            try {
                iArr[CameraRatio.FOUR_THREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraRatio.SIXTEEN_NINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CameraRatio[] $values() {
        return new CameraRatio[]{FOUR_THREE, SIXTEEN_NINE, ONE_ONE};
    }

    static {
        CameraRatio[] cameraRatioArr$values = $values();
        $VALUES = cameraRatioArr$values;
        $ENTRIES = AbstractC3083a.a(cameraRatioArr$values);
    }

    private CameraRatio(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CameraRatio valueOf(String str) {
        return (CameraRatio) Enum.valueOf(CameraRatio.class, str);
    }

    public static CameraRatio[] values() {
        return (CameraRatio[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final a mapToStrategy() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        a aVar = (i10 == 1 || i10 != 2) ? a.f10229c : a.f10230d;
        AbstractC2855l.d(aVar);
        return aVar;
    }
}
