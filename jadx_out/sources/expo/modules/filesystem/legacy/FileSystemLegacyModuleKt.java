package expo.modules.filesystem.legacy;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "kotlin.jvm.PlatformType", "EXDownloadProgressEventName", "EXUploadProgressEventName", "MIN_EVENT_DT_MS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "DIR_PERMISSIONS_REQUEST_CODE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "slashifyFilePath", "path", "expo-file-system_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FileSystemLegacyModuleKt {
    private static final int DIR_PERMISSIONS_REQUEST_CODE = 5394;
    private static final String EXDownloadProgressEventName = "expo-file-system.downloadProgress";
    private static final String EXUploadProgressEventName = "expo-file-system.uploadProgress";
    private static final long MIN_EVENT_DT_MS = 100;
    private static final String TAG = FileSystemLegacyModule.class.getSimpleName();

    public static final String slashifyFilePath(String str) {
        if (str == null) {
            return null;
        }
        return q.K(str, "file:///", false, 2, null) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}
