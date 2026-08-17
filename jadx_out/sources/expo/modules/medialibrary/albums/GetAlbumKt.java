package expo.modules.medialibrary.albums;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "albumName", "Landroid/os/Bundle;", "getAlbum", "(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetAlbumKt {
    public static final Object getAlbum(Context context, String str, f fVar) {
        return AlbumUtilsKt.queryAlbum(context, "media_type != 0 AND bucket_display_name=?", new String[]{str}, fVar);
    }
}
