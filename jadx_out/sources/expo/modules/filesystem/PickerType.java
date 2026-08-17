package expo.modules.filesystem;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/filesystem/PickerType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "FILE", "DIRECTORY", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PickerType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PickerType[] $VALUES;
    public static final PickerType FILE = new PickerType("FILE", 0);
    public static final PickerType DIRECTORY = new PickerType("DIRECTORY", 1);

    private static final /* synthetic */ PickerType[] $values() {
        return new PickerType[]{FILE, DIRECTORY};
    }

    static {
        PickerType[] pickerTypeArr$values = $values();
        $VALUES = pickerTypeArr$values;
        $ENTRIES = AbstractC3083a.a(pickerTypeArr$values);
    }

    private PickerType(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PickerType valueOf(String str) {
        return (PickerType) Enum.valueOf(PickerType.class, str);
    }

    public static PickerType[] values() {
        return (PickerType[]) $VALUES.clone();
    }
}
