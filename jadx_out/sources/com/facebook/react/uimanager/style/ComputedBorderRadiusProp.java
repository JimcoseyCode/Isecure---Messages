package com.facebook.react.uimanager.style;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/ComputedBorderRadiusProp;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "COMPUTED_BORDER_TOP_LEFT_RADIUS", "COMPUTED_BORDER_TOP_RIGHT_RADIUS", "COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS", "COMPUTED_BORDER_BOTTOM_LEFT_RADIUS", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComputedBorderRadiusProp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ComputedBorderRadiusProp[] $VALUES;
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_TOP_LEFT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_TOP_LEFT_RADIUS", 0);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_TOP_RIGHT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_TOP_RIGHT_RADIUS", 1);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS", 2);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_BOTTOM_LEFT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_BOTTOM_LEFT_RADIUS", 3);

    private static final /* synthetic */ ComputedBorderRadiusProp[] $values() {
        return new ComputedBorderRadiusProp[]{COMPUTED_BORDER_TOP_LEFT_RADIUS, COMPUTED_BORDER_TOP_RIGHT_RADIUS, COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS, COMPUTED_BORDER_BOTTOM_LEFT_RADIUS};
    }

    static {
        ComputedBorderRadiusProp[] computedBorderRadiusPropArr$values = $values();
        $VALUES = computedBorderRadiusPropArr$values;
        $ENTRIES = AbstractC3083a.a(computedBorderRadiusPropArr$values);
    }

    private ComputedBorderRadiusProp(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ComputedBorderRadiusProp valueOf(String str) {
        return (ComputedBorderRadiusProp) Enum.valueOf(ComputedBorderRadiusProp.class, str);
    }

    public static ComputedBorderRadiusProp[] values() {
        return (ComputedBorderRadiusProp[]) $VALUES.clone();
    }
}
