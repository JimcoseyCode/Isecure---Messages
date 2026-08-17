package expo.modules.medialibrary.albums;

import P8.q;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.MediaLibraryUtils;
import expo.modules.medialibrary.albums.AssetFileStrategy;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lexpo/modules/medialibrary/albums/AssetFileStrategy;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "apply", "Ljava/io/File;", "src", "dir", "context", "Landroid/content/Context;", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AssetFileStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "copyStrategy", "Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "getCopyStrategy", "()Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "moveStrategy", "getMoveStrategy", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AssetFileStrategy copyStrategy = new AssetFileStrategy() { // from class: expo.modules.medialibrary.albums.b
            @Override // expo.modules.medialibrary.albums.AssetFileStrategy
            public final File apply(File file, File file2, Context context) {
                return AssetFileStrategy.Companion.copyStrategy$lambda$0(file, file2, context);
            }
        };
        private static final AssetFileStrategy moveStrategy = new AssetFileStrategy() { // from class: expo.modules.medialibrary.albums.c
            @Override // expo.modules.medialibrary.albums.AssetFileStrategy
            public final File apply(File file, File file2, Context context) {
                return AssetFileStrategy.Companion.moveStrategy$lambda$1(file, file2, context);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File copyStrategy$lambda$0(File src, File dir, Context context) {
            AbstractC2855l.g(src, "src");
            AbstractC2855l.g(dir, "dir");
            AbstractC2855l.g(context, "<unused var>");
            return MediaLibraryUtils.INSTANCE.safeCopyFile(src, dir);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File moveStrategy$lambda$1(File src, File dir, Context context) throws IOException {
            AbstractC2855l.g(src, "src");
            AbstractC2855l.g(dir, "dir");
            AbstractC2855l.g(context, "context");
            if (Build.VERSION.SDK_INT < 30 || !(src instanceof MediaLibraryUtils.AssetFile)) {
                File fileSafeMoveFile = MediaLibraryUtils.INSTANCE.safeMoveFile(src, dir);
                context.getContentResolver().delete(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), "_data=?", new String[]{src.getPath()});
                return fileSafeMoveFile;
            }
            MediaLibraryUtils.AssetFile assetFile = (MediaLibraryUtils.AssetFile) src;
            String assetId = assetFile.getAssetId();
            Uri uriWithAppendedId = q.K(assetFile.getMimeType(), "video", false, 2, null) ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, Long.parseLong(assetId)) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(assetId));
            AbstractC2855l.d(uriWithAppendedId);
            File fileSafeCopyFile = MediaLibraryUtils.INSTANCE.safeCopyFile(src, dir);
            context.getContentResolver().delete(uriWithAppendedId, null);
            return fileSafeCopyFile;
        }

        public final AssetFileStrategy getCopyStrategy() {
            return copyStrategy;
        }

        public final AssetFileStrategy getMoveStrategy() {
            return moveStrategy;
        }
    }

    File apply(File src, File dir, Context context) throws IOException;
}
