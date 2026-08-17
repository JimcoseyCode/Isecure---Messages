package com.facebook.react.devsupport;

import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "Li7/B;", "onSuccess", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PermissionsResponse.STATUS_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "done", "total", "onProgress", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "onFailure", "(Ljava/lang/Exception;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1 implements DevBundleDownloadListener {
    final /* synthetic */ File $bundleFile;
    final /* synthetic */ String $bundleUrl;
    final /* synthetic */ DevSupportManagerBase.CallbackWithBundleLoader $callback;
    final /* synthetic */ DevSupportManagerBase this$0;

    DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1(DevSupportManagerBase devSupportManagerBase, String str, File file, DevSupportManagerBase.CallbackWithBundleLoader callbackWithBundleLoader) {
        this.this$0 = devSupportManagerBase;
        this.$bundleUrl = str;
        this.$bundleFile = file;
        this.$callback = callbackWithBundleLoader;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
    public void onFailure(Exception cause) {
        AbstractC2855l.g(cause, "cause");
        final DevSupportManagerBase devSupportManagerBase = this.this$0;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.T
            @Override // java.lang.Runnable
            public final void run() {
                DevSupportManagerBase.access$hideSplitBundleDevLoadingView(devSupportManagerBase);
            }
        });
        this.$callback.onError(this.$bundleUrl, cause);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
    public void onProgress(String status, Integer done, Integer total) {
        DevLoadingViewManager devLoadingViewManager = this.this$0.getDevLoadingViewManager();
        if (devLoadingViewManager != null) {
            devLoadingViewManager.updateProgress(status, done, total);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
    public void onSuccess() {
        final DevSupportManagerBase devSupportManagerBase = this.this$0;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.S
            @Override // java.lang.Runnable
            public final void run() {
                DevSupportManagerBase.access$hideSplitBundleDevLoadingView(devSupportManagerBase);
            }
        });
        ReactContext currentReactContext = this.this$0.getCurrentReactContext();
        if (currentReactContext == null || !currentReactContext.hasActiveReactInstance()) {
            return;
        }
        JSBundleLoader.Companion companion = JSBundleLoader.INSTANCE;
        String str = this.$bundleUrl;
        String absolutePath = this.$bundleFile.getAbsolutePath();
        AbstractC2855l.f(absolutePath, "getAbsolutePath(...)");
        this.$callback.onSuccess(companion.createCachedSplitBundleFromNetworkLoader(str, absolutePath));
    }
}
