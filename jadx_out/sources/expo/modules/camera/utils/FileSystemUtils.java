package expo.modules.camera.utils;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\r"}, d2 = {"Lexpo/modules/camera/utils/FileSystemUtils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ensureDirExists", "Ljava/io/File;", "dir", "generateOutputPath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "internalDirectory", "dirName", "extension", "generateOutputFile", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemUtils {
    public static final FileSystemUtils INSTANCE = new FileSystemUtils();

    private FileSystemUtils() {
    }

    public final File ensureDirExists(File dir) throws IOException {
        AbstractC2855l.g(dir, "dir");
        if (dir.isDirectory() || dir.mkdirs()) {
            return dir;
        }
        throw new IOException("Couldn't create directory '" + dir + "'");
    }

    public final File generateOutputFile(File internalDirectory, String dirName, String extension) throws IOException {
        AbstractC2855l.g(internalDirectory, "internalDirectory");
        AbstractC2855l.g(dirName, "dirName");
        AbstractC2855l.g(extension, "extension");
        String str = File.separator;
        File file = new File(internalDirectory + str + dirName);
        ensureDirExists(file);
        String string = UUID.randomUUID().toString();
        AbstractC2855l.f(string, "toString(...)");
        return new File(file + str + string + extension);
    }

    public final String generateOutputPath(File internalDirectory, String dirName, String extension) throws IOException {
        AbstractC2855l.g(internalDirectory, "internalDirectory");
        AbstractC2855l.g(dirName, "dirName");
        AbstractC2855l.g(extension, "extension");
        String str = File.separator;
        File file = new File(internalDirectory + str + dirName);
        ensureDirExists(file);
        String string = UUID.randomUUID().toString();
        AbstractC2855l.f(string, "toString(...)");
        return file + str + string + extension;
    }
}
