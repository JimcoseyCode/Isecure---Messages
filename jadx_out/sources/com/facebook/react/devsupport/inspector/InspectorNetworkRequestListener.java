package com.facebook.react.devsupport.inspector;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0086 ¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086 ¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "httpStatusCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "headers", "Li7/B;", "onHeaders", "(ILjava/util/Map;)V", "data", "onData", "(Ljava/lang/String;)V", "message", "onError", "onCompletion", "()V", "Lcom/facebook/jni/HybridData;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspectorNetworkRequestListener {
    private final HybridData mHybridData;

    static {
        SoLoader.t("reactnativejni");
    }

    public InspectorNetworkRequestListener(HybridData mHybridData) {
        AbstractC2855l.g(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }

    public final native void onCompletion();

    public final native void onData(String data);

    public final native void onError(String message);

    public final native void onHeaders(int httpStatusCode, Map<String, String> headers);
}
