package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/animated/TrackingAnimatedNode;", "Lcom/facebook/react/animated/AnimatedNode;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "Li7/B;", "update$ReactAndroid_release", "()V", "update", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prettyPrint$ReactAndroid_release", "()Ljava/lang/String;", "prettyPrint", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "Lcom/facebook/react/bridge/JavaOnlyMap;", "animationConfig", "Lcom/facebook/react/bridge/JavaOnlyMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "animationId", "I", "toValueNode", "valueNode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrackingAnimatedNode extends AnimatedNode {
    private final JavaOnlyMap animationConfig;
    private final int animationId;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;
    private final int toValueNode;
    private final int valueNode;

    public TrackingAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        AbstractC2855l.g(config, "config");
        AbstractC2855l.g(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.animationConfig = JavaOnlyMap.INSTANCE.deepClone(config.getMap("animationConfig"));
        this.animationId = config.getInt("animationId");
        this.toValueNode = config.getInt("toValue");
        this.valueNode = config.getInt("value");
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint$ReactAndroid_release() {
        return "TrackingAnimatedNode[" + this.tag + "]: animationID: " + this.animationId + " toValueNode: " + this.toValueNode + " valueNode: " + this.valueNode + " animationConfig: " + this.animationConfig;
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update$ReactAndroid_release() {
        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(this.toValueNode);
        ValueAnimatedNode valueAnimatedNode = nodeById instanceof ValueAnimatedNode ? (ValueAnimatedNode) nodeById : null;
        if (valueAnimatedNode != null) {
            this.animationConfig.putDouble("toValue", valueAnimatedNode.getValue());
        } else {
            this.animationConfig.putNull("toValue");
        }
        this.nativeAnimatedNodesManager.startAnimatingNode(this.animationId, this.valueNode, this.animationConfig, null);
    }
}
