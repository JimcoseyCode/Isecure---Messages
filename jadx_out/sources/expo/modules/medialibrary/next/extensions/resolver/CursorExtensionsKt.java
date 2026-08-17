package expo.modules.medialibrary.next.extensions.resolver;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"extractAssetContentUri", "Landroid/net/Uri;", "Landroid/database/Cursor;", "idColumn", PointerEventHelper.POINTER_TYPE_UNKNOWN, "typeColumn", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CursorExtensionsKt {
    public static final Uri extractAssetContentUri(Cursor cursor, int i10, int i11) {
        AbstractC2855l.g(cursor, "<this>");
        long j10 = cursor.getLong(i10);
        int i12 = cursor.getInt(i11);
        Uri uriWithAppendedId = ContentUris.withAppendedId(Build.VERSION.SDK_INT == 29 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? MediaStore.Files.getContentUri("external_primary") : MediaStore.Video.Media.getContentUri("external_primary") : MediaStore.Audio.Media.getContentUri("external_primary") : MediaStore.Images.Media.getContentUri("external_primary") : i12 != 1 ? i12 != 2 ? i12 != 3 ? AlbumExtensionsKt.getEXTERNAL_CONTENT_URI() : MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10);
        AbstractC2855l.f(uriWithAppendedId, "withAppendedId(...)");
        return uriWithAppendedId;
    }
}
