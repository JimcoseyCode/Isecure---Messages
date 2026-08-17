package expo.modules.core.interfaces;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface ReactActivityLifecycleListener {
    default boolean onBackPressed() {
        return false;
    }

    default boolean onNewIntent(Intent intent) {
        return false;
    }

    default void onContentChanged(Activity activity) {
    }

    default void onDestroy(Activity activity) {
    }

    default void onPause(Activity activity) {
    }

    default void onResume(Activity activity) {
    }

    default void onUserLeaveHint(Activity activity) {
    }

    default void onCreate(Activity activity, Bundle bundle) {
    }
}
