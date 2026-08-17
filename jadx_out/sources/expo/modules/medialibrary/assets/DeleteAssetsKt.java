package expo.modules.medialibrary.assets;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.MediaLibraryUtils;
import j7.AbstractC2793j;
import kotlin.Metadata;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "assetIds", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deleteAssets", "(Landroid/content/Context;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DeleteAssetsKt {
    public static final Object deleteAssets(Context context, String[] strArr, f fVar) {
        return MediaLibraryUtils.INSTANCE.deleteAssets(context, "_id IN (" + AbstractC2793j.a0(strArr, ",", null, null, 0, null, null, 62, null) + " )", null, fVar);
    }
}
