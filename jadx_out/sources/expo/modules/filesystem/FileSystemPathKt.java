package expo.modules.filesystem;

import P8.q;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\b"}, d2 = {"isContentUri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/net/Uri;", "(Landroid/net/Uri;)Z", "isAssetUri", "slashifyFilePath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "path", "expo-file-system_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FileSystemPathKt {
    public static final boolean isAssetUri(Uri uri) {
        AbstractC2855l.g(uri, "<this>");
        return AbstractC2855l.b(uri.getScheme(), "asset");
    }

    public static final boolean isContentUri(Uri uri) {
        AbstractC2855l.g(uri, "<this>");
        return AbstractC2855l.b(uri.getScheme(), "content");
    }

    public static final String slashifyFilePath(String str) {
        if (str == null) {
            return null;
        }
        return q.K(str, "file:///", false, 2, null) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}
