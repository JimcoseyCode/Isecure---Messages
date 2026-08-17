package expo.modules.updatesinterface;

import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0019"}, d2 = {"Lexpo/modules/updatesinterface/UpdatesInterface;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "()Z", "runtimeVersion", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getRuntimeVersion", "()Ljava/lang/String;", "updateUrl", "Landroid/net/Uri;", "getUpdateUrl", "()Landroid/net/Uri;", "launchedUpdateId", "Ljava/util/UUID;", "getLaunchedUpdateId", "()Ljava/util/UUID;", "embeddedUpdateId", "getEmbeddedUpdateId", "launchAssetPath", "getLaunchAssetPath", "subscribeToUpdatesStateChanges", "Lexpo/modules/updatesinterface/UpdatesStateChangeSubscription;", "listener", "Lexpo/modules/updatesinterface/UpdatesStateChangeListener;", "expo-updates-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UpdatesInterface {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static UUID getEmbeddedUpdateId(UpdatesInterface updatesInterface) {
            return null;
        }

        public static String getLaunchAssetPath(UpdatesInterface updatesInterface) {
            return null;
        }

        public static UUID getLaunchedUpdateId(UpdatesInterface updatesInterface) {
            return null;
        }

        public static boolean isEnabled(UpdatesInterface updatesInterface) {
            return false;
        }
    }

    UUID getEmbeddedUpdateId();

    String getLaunchAssetPath();

    UUID getLaunchedUpdateId();

    String getRuntimeVersion();

    Uri getUpdateUrl();

    boolean isEnabled();

    UpdatesStateChangeSubscription subscribeToUpdatesStateChanges(UpdatesStateChangeListener listener);
}
