package expo.modules.core;

import android.content.Context;
import expo.modules.core.interfaces.ApplicationLifecycleListener;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import expo.modules.core.interfaces.SingletonModule;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class BasePackage implements Package {
    @Override // expo.modules.core.interfaces.Package
    public List<ApplicationLifecycleListener> createApplicationLifecycleListeners(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override // expo.modules.core.interfaces.Package
    public List<InternalModule> createInternalModules(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override // expo.modules.core.interfaces.Package
    public List<ReactActivityHandler> createReactActivityHandlers(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override // expo.modules.core.interfaces.Package
    public List<ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override // expo.modules.core.interfaces.Package
    public List<? extends ReactNativeHostHandler> createReactNativeHostHandlers(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override // expo.modules.core.interfaces.Package
    public List<SingletonModule> createSingletonModules(Context context) {
        return Collections.EMPTY_LIST;
    }
}
