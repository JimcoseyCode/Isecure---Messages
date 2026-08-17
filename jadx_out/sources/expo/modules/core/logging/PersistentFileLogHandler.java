package expo.modules.core.logging;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import expo.modules.notifications.service.NotificationsService;
import i7.AbstractC2738a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/core/logging/PersistentFileLogHandler;", "Lexpo/modules/core/logging/LogHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "category", "Ljava/io/File;", "filesDirectory", "<init>", "(Ljava/lang/String;Ljava/io/File;)V", "Lexpo/modules/core/logging/LogType;", NotificationsService.EVENT_TYPE_KEY, "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "Li7/B;", "log$expo_modules_core_release", "(Lexpo/modules/core/logging/LogType;Ljava/lang/String;Ljava/lang/Throwable;)V", "log", "Lexpo/modules/core/logging/PersistentFileLog;", "persistentFileLog", "Lexpo/modules/core/logging/PersistentFileLog;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PersistentFileLogHandler extends LogHandler {
    private final PersistentFileLog persistentFileLog;

    public PersistentFileLogHandler(String category, File filesDirectory) {
        AbstractC2855l.g(category, "category");
        AbstractC2855l.g(filesDirectory, "filesDirectory");
        this.persistentFileLog = new PersistentFileLog(category, filesDirectory);
    }

    @Override // expo.modules.core.logging.LogHandler
    public void log$expo_modules_core_release(LogType type, String message, Throwable cause) {
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(message, "message");
        PersistentFileLog.appendEntry$default(this.persistentFileLog, message, null, 2, null);
        if (cause != null) {
            PersistentFileLog.appendEntry$default(this.persistentFileLog, LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(cause) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + AbstractC2738a.b(cause), null, 2, null);
        }
    }
}
