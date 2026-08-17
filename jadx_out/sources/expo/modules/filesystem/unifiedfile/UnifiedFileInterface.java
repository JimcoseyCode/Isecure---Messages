package expo.modules.filesystem.unifiedfile;

import O8.i;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.notifications.service.NotificationsService;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\n\u001a\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H&¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000$H&¢\u0006\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0015R\u0016\u00103\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.¨\u00064"}, d2 = {"Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "exists", "()Z", "isDirectory", "isFile", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mimeType", "displayName", "createFile", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "createDirectory", "(Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "delete", "deleteRecursively", PointerEventHelper.POINTER_TYPE_UNKNOWN, "listFilesAsUnified", "()Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "lastModified", "()Ljava/lang/Long;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Landroid/net/Uri;", "getContentUri", "(Lexpo/modules/kotlin/AppContext;)Landroid/net/Uri;", "append", "Ljava/io/OutputStream;", "outputStream", "(Z)Ljava/io/OutputStream;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "length", "()J", "LO8/i;", "walkTopDown", "()LO8/i;", "getParentFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "parentFile", "getUri", "()Landroid/net/Uri;", "uri", "getType", "()Ljava/lang/String;", NotificationsService.EVENT_TYPE_KEY, "getCreationTime", "creationTime", "getFileName", "fileName", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UnifiedFileInterface {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ OutputStream outputStream$default(UnifiedFileInterface unifiedFileInterface, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: outputStream");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return unifiedFileInterface.outputStream(z10);
        }
    }

    UnifiedFileInterface createDirectory(String displayName);

    UnifiedFileInterface createFile(String mimeType, String displayName);

    boolean delete();

    boolean deleteRecursively();

    boolean exists();

    Uri getContentUri(AppContext appContext);

    Long getCreationTime();

    String getFileName();

    UnifiedFileInterface getParentFile();

    String getType();

    Uri getUri();

    InputStream inputStream();

    boolean isDirectory();

    boolean isFile();

    Long lastModified();

    long length();

    List<UnifiedFileInterface> listFilesAsUnified();

    OutputStream outputStream(boolean append);

    i walkTopDown();
}
