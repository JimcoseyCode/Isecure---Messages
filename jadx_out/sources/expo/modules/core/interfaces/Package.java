package expo.modules.core.interfaces;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface Package {
    default List<? extends ApplicationLifecycleListener> createApplicationLifecycleListeners(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends InternalModule> createInternalModules(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends ReactActivityHandler> createReactActivityHandlers(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends ReactNativeHostHandler> createReactNativeHostHandlers(Context context) {
        return Collections.EMPTY_LIST;
    }

    default List<? extends SingletonModule> createSingletonModules(Context context) {
        return Collections.EMPTY_LIST;
    }
}
