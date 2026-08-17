package expo.modules.updatesinterface;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.updatesinterface.UpdatesInterface;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J;\u0010\f\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000f\u001a\u00020\u000e2\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH&¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface;", "Lexpo/modules/updatesinterface/UpdatesInterface;", "Li7/B;", "reset", "()V", "Ljava/util/HashMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/collections/HashMap;", "configuration", "Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$UpdateCallback;", "callback", "fetchUpdateWithConfiguration", "(Ljava/util/HashMap;Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$UpdateCallback;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isValidUpdatesConfiguration", "(Ljava/util/HashMap;)Z", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/updatesinterface/UpdatesInterfaceCallbacks;", "getUpdatesInterfaceCallbacks", "()Ljava/lang/ref/WeakReference;", "setUpdatesInterfaceCallbacks", "(Ljava/lang/ref/WeakReference;)V", "updatesInterfaceCallbacks", "UpdateCallback", "Update", "expo-updates-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UpdatesDevLauncherInterface extends UpdatesInterface {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static UUID getEmbeddedUpdateId(UpdatesDevLauncherInterface updatesDevLauncherInterface) {
            return UpdatesInterface.DefaultImpls.getEmbeddedUpdateId(updatesDevLauncherInterface);
        }

        public static String getLaunchAssetPath(UpdatesDevLauncherInterface updatesDevLauncherInterface) {
            return UpdatesInterface.DefaultImpls.getLaunchAssetPath(updatesDevLauncherInterface);
        }

        public static UUID getLaunchedUpdateId(UpdatesDevLauncherInterface updatesDevLauncherInterface) {
            return UpdatesInterface.DefaultImpls.getLaunchedUpdateId(updatesDevLauncherInterface);
        }

        public static boolean isEnabled(UpdatesDevLauncherInterface updatesDevLauncherInterface) {
            return UpdatesInterface.DefaultImpls.isEnabled(updatesDevLauncherInterface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$Update;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "manifest", "Lorg/json/JSONObject;", "getManifest", "()Lorg/json/JSONObject;", "launchAssetPath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getLaunchAssetPath", "()Ljava/lang/String;", "expo-updates-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Update {
        String getLaunchAssetPath();

        JSONObject getManifest();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$UpdateCallback;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Li7/B;", "onFailure", "(Ljava/lang/Exception;)V", "Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$Update;", "update", "onSuccess", "(Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$Update;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "successfulAssetCount", "failedAssetCount", "totalAssetCount", "onProgress", "(III)V", "Lorg/json/JSONObject;", "manifest", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onManifestLoaded", "(Lorg/json/JSONObject;)Z", "expo-updates-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UpdateCallback {
        void onFailure(Exception e10);

        boolean onManifestLoaded(JSONObject manifest);

        void onProgress(int successfulAssetCount, int failedAssetCount, int totalAssetCount);

        void onSuccess(Update update);
    }

    void fetchUpdateWithConfiguration(HashMap<String, Object> configuration, UpdateCallback callback);

    WeakReference<UpdatesInterfaceCallbacks> getUpdatesInterfaceCallbacks();

    boolean isValidUpdatesConfiguration(HashMap<String, Object> configuration);

    void reset();

    void setUpdatesInterfaceCallbacks(WeakReference<UpdatesInterfaceCallbacks> weakReference);
}
