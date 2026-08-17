package expo.modules.medialibrary.next.objects.album.factories;

import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.objects.album.Album;
import expo.modules.medialibrary.next.objects.asset.Asset;
import java.util.List;
import kotlin.Metadata;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "Lexpo/modules/medialibrary/next/objects/album/Album;", "create", "(Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/album/Album;", "albumName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "assets", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deleteOriginalAssets", "createFromAssets", "(Ljava/lang/String;Ljava/util/List;ZLn7/f;)Ljava/lang/Object;", "Landroid/net/Uri;", "filePaths", "createFromFilePaths", "(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AlbumFactory {
    Album create(String id);

    Object createFromAssets(String str, List<Asset> list, boolean z10, f fVar);

    Object createFromFilePaths(String str, List<? extends Uri> list, f fVar);
}
