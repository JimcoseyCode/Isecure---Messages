package expo.modules.medialibrary.next.objects.asset.delegates;

import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH¦@¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u0004J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0015\u0010\u0004J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017H¦@¢\u0006\u0004\b\u0018\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001a\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001c\u0010\u0004J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010$\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b#\u0010 R\u0014\u0010'\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCreationTime", "(Ln7/f;)Ljava/lang/Object;", "getDuration", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getFilename", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getHeight", "getWidth", "Lexpo/modules/medialibrary/next/records/Shape;", "getShape", "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;", "getMediaType", "getModificationTime", "Landroid/net/Uri;", "getUri", "Lexpo/modules/medialibrary/next/records/AssetInfo;", "getInfo", "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;", "getMimeType-dctPOJs", "getMimeType", "Lexpo/modules/medialibrary/next/records/Location;", "getLocation", "Landroid/os/Bundle;", "getExif", "Li7/B;", "delete", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", "move-dXLngQ8", "(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "move", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "copy-dXLngQ8", "copy", "getContentUri", "()Landroid/net/Uri;", "contentUri", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AssetDelegate {
    /* JADX INFO: renamed from: copy-dXLngQ8, reason: not valid java name */
    Object mo284copydXLngQ8(String str, f fVar);

    Object delete(f fVar);

    Uri getContentUri();

    Object getCreationTime(f fVar);

    Object getDuration(f fVar);

    Object getExif(f fVar);

    Object getFilename(f fVar);

    Object getHeight(f fVar);

    Object getInfo(f fVar);

    Object getLocation(f fVar);

    Object getMediaType(f fVar);

    /* JADX INFO: renamed from: getMimeType-dctPOJs, reason: not valid java name */
    Object mo285getMimeTypedctPOJs(f fVar);

    Object getModificationTime(f fVar);

    Object getShape(f fVar);

    Object getUri(f fVar);

    Object getWidth(f fVar);

    /* JADX INFO: renamed from: move-dXLngQ8, reason: not valid java name */
    Object mo286movedXLngQ8(String str, f fVar);
}
