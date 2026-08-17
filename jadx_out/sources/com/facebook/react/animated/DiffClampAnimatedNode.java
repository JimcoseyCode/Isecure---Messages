package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/animated/DiffClampAnimatedNode;", "Lcom/facebook/react/animated/ValueAnimatedNode;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "Li7/B;", "update$ReactAndroid_release", "()V", "update", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prettyPrint$ReactAndroid_release", "()Ljava/lang/String;", "prettyPrint", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "inputNodeTag", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "minValue", "D", "maxValue", "lastValue", "getInputNodeValue", "()D", "inputNodeValue", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiffClampAnimatedNode extends ValueAnimatedNode {
    private final int inputNodeTag;
    private double lastValue;
    private final double maxValue;
    private final double minValue;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiffClampAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        super(null, 1, null);
        AbstractC2855l.g(config, "config");
        AbstractC2855l.g(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.inputNodeTag = config.getInt("input");
        this.minValue = config.getDouble("min");
        this.maxValue = config.getDouble("max");
        this.nodeValue = this.lastValue;
    }

    private final double getInputNodeValue() {
        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(this.inputNodeTag);
        if (nodeById == null || !(nodeById instanceof ValueAnimatedNode)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((ValueAnimatedNode) nodeById).getValue();
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode, com.facebook.react.animated.AnimatedNode
    public String prettyPrint$ReactAndroid_release() {
        return "DiffClampAnimatedNode[" + this.tag + "]: InputNodeTag: " + this.inputNodeTag + " min: " + this.minValue + " max: " + this.maxValue + " lastValue: " + this.lastValue + " super: " + super.prettyPrint$ReactAndroid_release();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update$ReactAndroid_release() {
        double inputNodeValue = getInputNodeValue();
        double d10 = inputNodeValue - this.lastValue;
        this.lastValue = inputNodeValue;
        this.nodeValue = Math.min(Math.max(this.nodeValue + d10, this.minValue), this.maxValue);
    }
}
