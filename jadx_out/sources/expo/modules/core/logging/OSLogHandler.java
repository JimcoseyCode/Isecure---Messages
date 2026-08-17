package expo.modules.core.logging;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import expo.modules.notifications.service.NotificationsService;
import i7.AbstractC2738a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0010¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/core/logging/OSLogHandler;", "Lexpo/modules/core/logging/LogHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "category", "<init>", "(Ljava/lang/String;)V", "Lexpo/modules/core/logging/LogType;", NotificationsService.EVENT_TYPE_KEY, "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "Li7/B;", "log$expo_modules_core_release", "(Lexpo/modules/core/logging/LogType;Ljava/lang/String;Ljava/lang/Throwable;)V", "log", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OSLogHandler extends LogHandler {
    private final String category;

    public OSLogHandler(String category) {
        AbstractC2855l.g(category, "category");
        this.category = category;
    }

    public final String getCategory() {
        return this.category;
    }

    @Override // expo.modules.core.logging.LogHandler
    public void log$expo_modules_core_release(LogType type, String message, Throwable cause) {
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(message, "message");
        if (OSLogHandlerKt.isAndroid) {
            LogType.INSTANCE.toOSLogType(type);
            return;
        }
        System.out.println((Object) ("[" + type.getType() + "] " + this.category + "\t" + message));
        if (cause != null) {
            System.out.println((Object) (LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(cause) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + AbstractC2738a.b(cause)));
        }
    }
}
