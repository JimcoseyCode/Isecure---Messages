package expo.modules.camera.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lexpo/modules/camera/utils/CameraUtils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "GOOGLE_PLAY_STORE_PACKAGE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasGooglePlayServices", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "isMLKitBarcodeScannerAvailable", "isMLKitAvailable", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraUtils {
    private static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final CameraUtils INSTANCE = new CameraUtils();

    private CameraUtils() {
    }

    public final boolean hasGooglePlayServices(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(GOOGLE_PLAY_STORE_PACKAGE, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean isMLKitAvailable(Context context) {
        if (hasGooglePlayServices(context)) {
            return isMLKitBarcodeScannerAvailable();
        }
        return false;
    }

    public final boolean isMLKitBarcodeScannerAvailable() {
        return true;
    }
}
