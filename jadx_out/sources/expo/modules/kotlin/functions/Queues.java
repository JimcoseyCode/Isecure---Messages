package expo.modules.kotlin.functions;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/functions/Queues;", "Lexpo/modules/kotlin/functions/FunctionQueue;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "MAIN", "DEFAULT", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Queues implements FunctionQueue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Queues[] $VALUES;
    public static final Queues MAIN = new Queues("MAIN", 0);
    public static final Queues DEFAULT = new Queues("DEFAULT", 1);

    private static final /* synthetic */ Queues[] $values() {
        return new Queues[]{MAIN, DEFAULT};
    }

    static {
        Queues[] queuesArr$values = $values();
        $VALUES = queuesArr$values;
        $ENTRIES = AbstractC3083a.a(queuesArr$values);
    }

    private Queues(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Queues valueOf(String str) {
        return (Queues) Enum.valueOf(Queues.class, str);
    }

    public static Queues[] values() {
        return (Queues[]) $VALUES.clone();
    }
}
