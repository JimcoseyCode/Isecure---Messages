package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/modules/blob/BlobCollector;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lcom/facebook/react/modules/blob/BlobModule;", "blobModule", "Li7/B;", "install", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/modules/blob/BlobModule;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsContext", "nativeInstall", "(Ljava/lang/Object;J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlobCollector {
    public static final BlobCollector INSTANCE = new BlobCollector();

    static {
        SoLoader.t("reactnativeblob");
    }

    private BlobCollector() {
    }

    public static final void install(final ReactContext reactContext, final BlobModule blobModule) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(blobModule, "blobModule");
        reactContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.modules.blob.a
            @Override // java.lang.Runnable
            public final void run() {
                BlobCollector.install$lambda$0(reactContext, blobModule);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$0(ReactContext reactContext, BlobModule blobModule) {
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        if (javaScriptContextHolder == null || javaScriptContextHolder.getContext() == 0) {
            return;
        }
        INSTANCE.nativeInstall(blobModule, javaScriptContextHolder.getContext());
    }

    private final native void nativeInstall(Object blobModule, long jsContext);
}
