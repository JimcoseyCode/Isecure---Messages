package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/animated/ValueAnimatedNode;", "Lcom/facebook/react/animated/AnimatedNode;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getValue", "()D", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAnimatedObject", "()Ljava/lang/Object;", "Li7/B;", "flattenOffset", "()V", "extractOffset", "onValueUpdate", "Lcom/facebook/react/animated/AnimatedNodeValueListener;", "listener", "setValueListener", "(Lcom/facebook/react/animated/AnimatedNodeValueListener;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prettyPrint$ReactAndroid_release", "()Ljava/lang/String;", "prettyPrint", "nodeValue", "D", "offset", "valueListener", "Lcom/facebook/react/animated/AnimatedNodeValueListener;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ValueAnimatedNode extends AnimatedNode {
    public double nodeValue;
    public double offset;
    private AnimatedNodeValueListener valueListener;

    /* JADX WARN: Multi-variable type inference failed */
    public ValueAnimatedNode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void extractOffset() {
        this.offset += this.nodeValue;
        this.nodeValue = 0.0d;
    }

    public final void flattenOffset() {
        this.nodeValue += this.offset;
        this.offset = 0.0d;
    }

    public Object getAnimatedObject() {
        return null;
    }

    public final double getValue() {
        if (Double.isNaN(this.offset + this.nodeValue)) {
            update$ReactAndroid_release();
        }
        return this.offset + this.nodeValue;
    }

    public final void onValueUpdate() {
        AnimatedNodeValueListener animatedNodeValueListener = this.valueListener;
        if (animatedNodeValueListener != null) {
            double value = getValue();
            double d10 = this.offset;
            animatedNodeValueListener.onValueUpdate(value - d10, d10);
        }
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint$ReactAndroid_release() {
        return "ValueAnimatedNode[" + this.tag + "]: value: " + this.nodeValue + " offset: " + this.offset;
    }

    public final void setValueListener(AnimatedNodeValueListener listener) {
        this.valueListener = listener;
    }

    public ValueAnimatedNode(ReadableMap readableMap) {
        this.nodeValue = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.offset = readableMap != null ? readableMap.getDouble("offset") : 0.0d;
    }

    public /* synthetic */ ValueAnimatedNode(ReadableMap readableMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : readableMap);
    }
}
