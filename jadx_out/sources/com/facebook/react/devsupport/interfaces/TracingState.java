package com.facebook.react.devsupport.interfaces;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/devsupport/interfaces/TracingState;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "DISABLED", "ENABLEDINBACKGROUNDMODE", "ENABLEDINCDPMODE", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TracingState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TracingState[] $VALUES;
    public static final TracingState DISABLED = new TracingState("DISABLED", 0);
    public static final TracingState ENABLEDINBACKGROUNDMODE = new TracingState("ENABLEDINBACKGROUNDMODE", 1);
    public static final TracingState ENABLEDINCDPMODE = new TracingState("ENABLEDINCDPMODE", 2);

    private static final /* synthetic */ TracingState[] $values() {
        return new TracingState[]{DISABLED, ENABLEDINBACKGROUNDMODE, ENABLEDINCDPMODE};
    }

    static {
        TracingState[] tracingStateArr$values = $values();
        $VALUES = tracingStateArr$values;
        $ENTRIES = AbstractC3083a.a(tracingStateArr$values);
    }

    private TracingState(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TracingState valueOf(String str) {
        return (TracingState) Enum.valueOf(TracingState.class, str);
    }

    public static TracingState[] values() {
        return (TracingState[]) $VALUES.clone();
    }
}
