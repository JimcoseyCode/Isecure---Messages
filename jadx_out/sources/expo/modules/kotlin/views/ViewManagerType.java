package expo.modules.kotlin.views;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "SIMPLE", "GROUP", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewManagerType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ViewManagerType[] $VALUES;
    public static final ViewManagerType SIMPLE = new ViewManagerType("SIMPLE", 0);
    public static final ViewManagerType GROUP = new ViewManagerType("GROUP", 1);

    private static final /* synthetic */ ViewManagerType[] $values() {
        return new ViewManagerType[]{SIMPLE, GROUP};
    }

    static {
        ViewManagerType[] viewManagerTypeArr$values = $values();
        $VALUES = viewManagerTypeArr$values;
        $ENTRIES = AbstractC3083a.a(viewManagerTypeArr$values);
    }

    private ViewManagerType(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ViewManagerType valueOf(String str) {
        return (ViewManagerType) Enum.valueOf(ViewManagerType.class, str);
    }

    public static ViewManagerType[] values() {
        return (ViewManagerType[]) $VALUES.clone();
    }
}
