package com.facebook.react.bridge;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\b\u0010\tJ(\u0010\r\u001a\u00020\u00072\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/CxxCallbackImpl;", "Lcom/facebook/jni/HybridClassBase;", "Lcom/facebook/react/bridge/Callback;", "<init>", "()V", "Lcom/facebook/react/bridge/NativeArray;", "arguments", "Li7/B;", "nativeInvoke", "(Lcom/facebook/react/bridge/NativeArray;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "args", "invoke", "([Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CxxCallbackImpl extends HybridClassBase implements Callback {
    private CxxCallbackImpl() {
    }

    private final native void nativeInvoke(NativeArray arguments);

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... args) {
        AbstractC2855l.g(args, "args");
        nativeInvoke(Arguments.fromJavaArgs(args));
    }
}
