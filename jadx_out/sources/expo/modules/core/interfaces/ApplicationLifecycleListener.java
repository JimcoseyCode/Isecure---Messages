package expo.modules.core.interfaces;

import android.app.Application;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface ApplicationLifecycleListener {
    default void onConfigurationChanged(Configuration configuration) {
    }

    default void onCreate(Application application) {
    }
}
