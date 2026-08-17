package expo.modules.medialibrary.next.objects.asset.factories;

import P8.q;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"buildUniqueDisplayName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "filePath", "Landroid/net/Uri;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BuildUniqueDisplayNameKt {
    public static final String buildUniqueDisplayName(Uri filePath) {
        AbstractC2855l.g(filePath, "filePath");
        String lastPathSegment = filePath.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "asset";
        }
        String strB1 = q.b1(lastPathSegment, ".", null, 2, null);
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        String strR0 = q.R0(lastPathSegment, ".", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        if (strR0.length() > 0) {
            str = "." + strR0;
        }
        String string = UUID.randomUUID().toString();
        AbstractC2855l.f(string, "toString(...)");
        return strB1 + "_" + q.h1(string, 8) + str;
    }
}
