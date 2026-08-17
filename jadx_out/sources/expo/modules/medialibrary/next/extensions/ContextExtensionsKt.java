package expo.modules.medialibrary.next.extensions;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2752o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.h;
import n7.f;
import n7.l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "path", "mimeType", "Lkotlin/Pair;", "Landroid/net/Uri;", "scanFile", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContextExtensionsKt {
    public static final Object scanFile(Context context, String str, String str2, f fVar) {
        final l lVar = new l(AbstractC3016b.c(fVar));
        MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{str2}, new MediaScannerConnection.OnScanCompletedListener() { // from class: expo.modules.medialibrary.next.extensions.ContextExtensionsKt$scanFile$2$1
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str3, Uri uri) {
                f fVar2 = lVar;
                C2752o.a aVar = C2752o.f28721h;
                fVar2.resumeWith(C2752o.b(new Pair(str3, uri)));
            }
        });
        Object objA = lVar.a();
        if (objA == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objA;
    }

    public static /* synthetic */ Object scanFile$default(Context context, String str, String str2, f fVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return scanFile(context, str, str2, fVar);
    }
}
