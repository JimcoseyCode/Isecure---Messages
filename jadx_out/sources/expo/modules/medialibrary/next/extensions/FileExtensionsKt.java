package expo.modules.medialibrary.next.extensions;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.MediaLibraryUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"safeMove", "Ljava/io/File;", "destinationDirectory", "safeCopy", "createUniqueFileIn", "directory", "newFileName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FileExtensionsKt {
    private static final File createUniqueFileIn(File file, String str) throws IOException {
        File file2 = new File(file, str);
        Pair<String, String> fileNameAndExtension = MediaLibraryUtils.INSTANCE.getFileNameAndExtension(str);
        String str2 = (String) fileNameAndExtension.getFirst();
        String str3 = (String) fileNameAndExtension.getSecond();
        int i10 = 2;
        while (file2.exists()) {
            file2 = new File(file, str2 + "_" + i10 + str3);
            i10++;
            if (i10 > 32767) {
                throw new IOException("File name suffix limit reached (32767)");
            }
        }
        return file2;
    }

    public static final File safeCopy(File file, File destinationDirectory) throws IOException {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(destinationDirectory, "destinationDirectory");
        String name = file.getName();
        AbstractC2855l.f(name, "getName(...)");
        File fileCreateUniqueFileIn = createUniqueFileIn(destinationDirectory, name);
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(fileCreateUniqueFileIn).getChannel();
            try {
                if (channel.transferTo(0L, channel.size(), channel2) == channel.size()) {
                    AbstractC3376c.a(channel2, null);
                    AbstractC3376c.a(channel, null);
                    return fileCreateUniqueFileIn;
                }
                fileCreateUniqueFileIn.delete();
                throw new IOException("Could not save file to " + destinationDirectory + " Not enough space.");
            } finally {
            }
        } finally {
        }
    }

    public static final File safeMove(File file, File destinationDirectory) throws IOException {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(destinationDirectory, "destinationDirectory");
        File fileSafeCopy = safeCopy(file, destinationDirectory);
        file.delete();
        return fileSafeCopy;
    }
}
