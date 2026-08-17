package G6;

import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static void a(ReactApplicationContext reactApplicationContext) {
        try {
            Intent launchIntentForPackage = reactApplicationContext.getPackageManager().getLaunchIntentForPackage(reactApplicationContext.getPackageName());
            if (launchIntentForPackage == null) {
                reactApplicationContext.getPackageName();
            } else {
                reactApplicationContext.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
                Runtime.getRuntime().exit(0);
            }
        } catch (Exception unused) {
        }
    }
}
