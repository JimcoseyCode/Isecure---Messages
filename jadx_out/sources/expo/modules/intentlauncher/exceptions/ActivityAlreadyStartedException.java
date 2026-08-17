package expo.modules.intentlauncher.exceptions;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.errors.CodedException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/intentlauncher/exceptions/ActivityAlreadyStartedException;", "Lexpo/modules/core/errors/CodedException;", "<init>", "()V", "getCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-intent-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityAlreadyStartedException extends CodedException {
    public ActivityAlreadyStartedException() {
        super("IntentLauncher activity is already started. You need to wait for its result before starting another activity.");
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_ACTIVITY_ALREADY_STARTED";
    }
}
