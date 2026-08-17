package expo.modules.fetch;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/fetch/ResponseState;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "intValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "INITIALIZED", "STARTED", "RESPONSE_RECEIVED", "BODY_COMPLETED", "BODY_STREAMING_STARTED", "BODY_STREAMING_CANCELED", "ERROR_RECEIVED", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResponseState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResponseState[] $VALUES;
    private final int intValue;
    public static final ResponseState INITIALIZED = new ResponseState("INITIALIZED", 0, 0);
    public static final ResponseState STARTED = new ResponseState("STARTED", 1, 1);
    public static final ResponseState RESPONSE_RECEIVED = new ResponseState("RESPONSE_RECEIVED", 2, 2);
    public static final ResponseState BODY_COMPLETED = new ResponseState("BODY_COMPLETED", 3, 3);
    public static final ResponseState BODY_STREAMING_STARTED = new ResponseState("BODY_STREAMING_STARTED", 4, 4);
    public static final ResponseState BODY_STREAMING_CANCELED = new ResponseState("BODY_STREAMING_CANCELED", 5, 5);
    public static final ResponseState ERROR_RECEIVED = new ResponseState("ERROR_RECEIVED", 6, 6);

    private static final /* synthetic */ ResponseState[] $values() {
        return new ResponseState[]{INITIALIZED, STARTED, RESPONSE_RECEIVED, BODY_COMPLETED, BODY_STREAMING_STARTED, BODY_STREAMING_CANCELED, ERROR_RECEIVED};
    }

    static {
        ResponseState[] responseStateArr$values = $values();
        $VALUES = responseStateArr$values;
        $ENTRIES = AbstractC3083a.a(responseStateArr$values);
    }

    private ResponseState(String str, int i10, int i11) {
        this.intValue = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ResponseState valueOf(String str) {
        return (ResponseState) Enum.valueOf(ResponseState.class, str);
    }

    public static ResponseState[] values() {
        return (ResponseState[]) $VALUES.clone();
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
