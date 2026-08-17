package com.facebook.react.uimanager;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/PointerEvents;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "NONE", "BOX_NONE", "BOX_ONLY", "AUTO", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointerEvents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PointerEvents[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PointerEvents NONE = new PointerEvents("NONE", 0);
    public static final PointerEvents BOX_NONE = new PointerEvents("BOX_NONE", 1);
    public static final PointerEvents BOX_ONLY = new PointerEvents("BOX_ONLY", 2);
    public static final PointerEvents AUTO = new PointerEvents("AUTO", 3);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/PointerEvents$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parsePointerEvents", "Lcom/facebook/react/uimanager/PointerEvents;", "pointerEventsStr", PointerEventHelper.POINTER_TYPE_UNKNOWN, "canBeTouchTarget", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.POINTER_EVENTS, "canChildrenBeTouchTarget", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean canBeTouchTarget(PointerEvents pointerEvents) {
            AbstractC2855l.g(pointerEvents, "pointerEvents");
            return pointerEvents == PointerEvents.AUTO || pointerEvents == PointerEvents.BOX_ONLY;
        }

        public final boolean canChildrenBeTouchTarget(PointerEvents pointerEvents) {
            AbstractC2855l.g(pointerEvents, "pointerEvents");
            return pointerEvents == PointerEvents.AUTO || pointerEvents == PointerEvents.BOX_NONE;
        }

        public final PointerEvents parsePointerEvents(String pointerEventsStr) {
            if (pointerEventsStr == null) {
                return PointerEvents.AUTO;
            }
            Locale US = Locale.US;
            AbstractC2855l.f(US, "US");
            String upperCase = pointerEventsStr.toUpperCase(US);
            AbstractC2855l.f(upperCase, "toUpperCase(...)");
            return PointerEvents.valueOf(P8.q.E(upperCase, "-", "_", false, 4, null));
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PointerEvents[] $values() {
        return new PointerEvents[]{NONE, BOX_NONE, BOX_ONLY, AUTO};
    }

    static {
        PointerEvents[] pointerEventsArr$values = $values();
        $VALUES = pointerEventsArr$values;
        $ENTRIES = AbstractC3083a.a(pointerEventsArr$values);
        INSTANCE = new Companion(null);
    }

    private PointerEvents(String str, int i10) {
    }

    public static final boolean canBeTouchTarget(PointerEvents pointerEvents) {
        return INSTANCE.canBeTouchTarget(pointerEvents);
    }

    public static final boolean canChildrenBeTouchTarget(PointerEvents pointerEvents) {
        return INSTANCE.canChildrenBeTouchTarget(pointerEvents);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static final PointerEvents parsePointerEvents(String str) {
        return INSTANCE.parsePointerEvents(str);
    }

    public static PointerEvents valueOf(String str) {
        return (PointerEvents) Enum.valueOf(PointerEvents.class, str);
    }

    public static PointerEvents[] values() {
        return (PointerEvents[]) $VALUES.clone();
    }
}
