package expo.modules.core.logging;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lexpo/modules/core/logging/LogHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/core/logging/LogType;", NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "Li7/B;", "log$expo_modules_core_release", "(Lexpo/modules/core/logging/LogType;Ljava/lang/String;Ljava/lang/Throwable;)V", "log", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class LogHandler {
    public static /* synthetic */ void log$expo_modules_core_release$default(LogHandler logHandler, LogType logType, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        logHandler.log$expo_modules_core_release(logType, str, th);
    }

    public abstract void log$expo_modules_core_release(LogType type, String message, Throwable cause);
}
