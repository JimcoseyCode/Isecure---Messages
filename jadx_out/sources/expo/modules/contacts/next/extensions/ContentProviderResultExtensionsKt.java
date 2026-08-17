package expo.modules.contacts.next.extensions;

import android.content.ContentProviderResult;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.UnableToExtractIdFromUriException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"extractId", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/ContentProviderResult;", "([Landroid/content/ContentProviderResult;)Ljava/lang/String;", "expo-contacts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContentProviderResultExtensionsKt {
    public static final String extractId(ContentProviderResult[] contentProviderResultArr) throws UnableToExtractIdFromUriException {
        AbstractC2855l.g(contentProviderResultArr, "<this>");
        Uri uri = contentProviderResultArr[0].uri;
        if (uri == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            return lastPathSegment;
        }
        throw new UnableToExtractIdFromUriException(uri, null, 2, null);
    }
}
