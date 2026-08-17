package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/imagepicker/exporters/ImageExporter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/net/Uri;", "source", "Ljava/io/File;", "output", "Landroid/content/ContentResolver;", "contentResolver", "Lexpo/modules/imagepicker/exporters/ImageExportResult;", "exportAsync", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ImageExporter {
    Object exportAsync(Uri uri, File file, ContentResolver contentResolver, n7.f fVar);
}
