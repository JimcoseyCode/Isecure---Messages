package expo.modules.core.interfaces;

import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface ReactNativeHostHandler {
    default String getBundleAssetName(boolean z10) {
        return null;
    }

    default Object getDevSupportManagerFactory() {
        return null;
    }

    default String getJSBundleFile(boolean z10) {
        return null;
    }

    default JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    default Boolean getUseDeveloperSupport() {
        return null;
    }

    default void onDidCreateDevSupportManager(DevSupportManager devSupportManager) {
    }

    default void onWillCreateReactInstance(boolean z10) {
    }

    default void onDidCreateReactHost(Context context, ReactHost reactHost) {
    }

    default void onDidCreateReactInstance(boolean z10, ReactContext reactContext) {
    }

    default void onReactInstanceException(boolean z10, Exception exc) {
    }
}
