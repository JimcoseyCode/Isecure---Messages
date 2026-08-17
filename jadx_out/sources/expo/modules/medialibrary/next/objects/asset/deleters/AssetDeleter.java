package expo.modules.medialibrary.next.objects.asset.deleters;

import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import kotlin.Metadata;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H¦@¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/net/Uri;", "contentUri", "Li7/B;", "delete", "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentUris", "(Ljava/util/List;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AssetDeleter {
    Object delete(Uri uri, f fVar);

    Object delete(List<? extends Uri> list, f fVar);
}
