package expo.modules.notifications.notifications.channels;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.errors.CodedRuntimeException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;", "Lexpo/modules/core/errors/CodedRuntimeException;", "invalidValueKey", PointerEventHelper.POINTER_TYPE_UNKNOWN, "invalidValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(ILjava/lang/Object;)V", "getCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InvalidVibrationPatternException extends CodedRuntimeException {
    public InvalidVibrationPatternException(int i10, Object obj) {
        super("Invalid value in vibration pattern, expected all elements to be numbers, got: " + obj + " under " + i10);
    }

    @Override // expo.modules.core.errors.CodedRuntimeException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "ERR_INVALID_VIBRATION_PATTERN";
    }
}
