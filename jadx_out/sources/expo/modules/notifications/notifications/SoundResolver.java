package expo.modules.notifications.notifications;

import P8.q;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/notifications/notifications/SoundResolver;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "resolve", "Landroid/net/Uri;", "filename", PointerEventHelper.POINTER_TYPE_UNKNOWN, "resourceExists", PointerEventHelper.POINTER_TYPE_UNKNOWN, "filenameToBasename", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SoundResolver {
    private final Context context;

    public SoundResolver(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
    }

    private final String filenameToBasename(String filename) {
        if (!q.Q(filename, ".", false, 2, null)) {
            return filename;
        }
        String strSubstring = filename.substring(0, q.i0(filename, '.', 0, false, 6, null));
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final Uri resolve(String filename) {
        if (filename == null || filename.length() == 0) {
            return null;
        }
        String packageName = this.context.getPackageName();
        String strFilenameToBasename = filenameToBasename(filename);
        return this.context.getResources().getIdentifier(strFilenameToBasename, "raw", packageName) != 0 ? new Uri.Builder().scheme("android.resource").authority(packageName).appendPath("raw").appendPath(strFilenameToBasename).build() : Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final boolean resourceExists(String filename) {
        if (filename != null && filename.length() != 0) {
            String packageName = this.context.getPackageName();
            if (this.context.getResources().getIdentifier(filenameToBasename(filename), "raw", packageName) != 0) {
                return true;
            }
        }
        return false;
    }
}
