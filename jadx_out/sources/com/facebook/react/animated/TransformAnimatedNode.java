package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/animated/TransformAnimatedNode;", "Lcom/facebook/react/animated/AnimatedNode;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "Lcom/facebook/react/bridge/JavaOnlyMap;", "propsMap", "Li7/B;", "collectViewUpdates", "(Lcom/facebook/react/bridge/JavaOnlyMap;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prettyPrint$ReactAndroid_release", "()Ljava/lang/String;", "prettyPrint", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/animated/TransformAnimatedNode$TransformConfig;", "transformConfigs", "Ljava/util/List;", "TransformConfig", "AnimatedTransformConfig", "StaticTransformConfig", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransformAnimatedNode extends AnimatedNode {
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;
    private final List<TransformConfig> transformConfigs;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/animated/TransformAnimatedNode$AnimatedTransformConfig;", "Lcom/facebook/react/animated/TransformAnimatedNode$TransformConfig;", "Lcom/facebook/react/animated/TransformAnimatedNode;", "<init>", "(Lcom/facebook/react/animated/TransformAnimatedNode;)V", "nodeTag", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNodeTag", "()I", "setNodeTag", "(I)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class AnimatedTransformConfig extends TransformConfig {
        private int nodeTag;

        public AnimatedTransformConfig() {
            super();
        }

        public final int getNodeTag() {
            return this.nodeTag;
        }

        public final void setNodeTag(int i10) {
            this.nodeTag = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/animated/TransformAnimatedNode$StaticTransformConfig;", "Lcom/facebook/react/animated/TransformAnimatedNode$TransformConfig;", "Lcom/facebook/react/animated/TransformAnimatedNode;", "<init>", "(Lcom/facebook/react/animated/TransformAnimatedNode;)V", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getValue", "()D", "setValue", "(D)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class StaticTransformConfig extends TransformConfig {
        private double value;

        public StaticTransformConfig() {
            super();
        }

        public final double getValue() {
            return this.value;
        }

        public final void setValue(double d10) {
            this.value = d10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/animated/TransformAnimatedNode$TransformConfig;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lcom/facebook/react/animated/TransformAnimatedNode;)V", "property", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getProperty", "()Ljava/lang/String;", "setProperty", "(Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private class TransformConfig {
        private String property;

        public TransformConfig() {
        }

        public final String getProperty() {
            return this.property;
        }

        public final void setProperty(String str) {
            this.property = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.facebook.react.animated.TransformAnimatedNode$StaticTransformConfig, com.facebook.react.animated.TransformAnimatedNode$TransformConfig] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.facebook.react.animated.TransformAnimatedNode$AnimatedTransformConfig, com.facebook.react.animated.TransformAnimatedNode$TransformConfig] */
    public TransformAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        List<TransformConfig> listJ;
        ?? staticTransformConfig;
        AbstractC2855l.g(config, "config");
        AbstractC2855l.g(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("transforms");
        if (array == null) {
            listJ = AbstractC2800q.j();
        } else {
            int size = array.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = array.getMap(i10);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String string = map.getString("property");
                if (AbstractC2855l.b(map.getString(NotificationsService.EVENT_TYPE_KEY), "animated")) {
                    staticTransformConfig = new AnimatedTransformConfig();
                    staticTransformConfig.setProperty(string);
                    staticTransformConfig.setNodeTag(map.getInt("nodeTag"));
                } else {
                    staticTransformConfig = new StaticTransformConfig();
                    staticTransformConfig.setProperty(string);
                    staticTransformConfig.setValue(map.getDouble("value"));
                }
                arrayList.add(staticTransformConfig);
            }
            listJ = arrayList;
        }
        this.transformConfigs = listJ;
    }

    public final void collectViewUpdates(JavaOnlyMap propsMap) {
        double value;
        AbstractC2855l.g(propsMap, "propsMap");
        int size = this.transformConfigs.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            TransformConfig transformConfig = this.transformConfigs.get(i10);
            if (transformConfig instanceof AnimatedTransformConfig) {
                AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(((AnimatedTransformConfig) transformConfig).getNodeTag());
                if (nodeById == null) {
                    throw new IllegalArgumentException("Mapped style node does not exist");
                }
                if (!(nodeById instanceof ValueAnimatedNode)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + nodeById.getClass());
                }
                value = ((ValueAnimatedNode) nodeById).getValue();
            } else {
                AbstractC2855l.e(transformConfig, "null cannot be cast to non-null type com.facebook.react.animated.TransformAnimatedNode.StaticTransformConfig");
                value = ((StaticTransformConfig) transformConfig).getValue();
            }
            arrayList.add(JavaOnlyMap.INSTANCE.of(transformConfig.getProperty(), Double.valueOf(value)));
        }
        propsMap.putArray(ViewProps.TRANSFORM, JavaOnlyArray.INSTANCE.from(arrayList));
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint$ReactAndroid_release() {
        return "TransformAnimatedNode[" + this.tag + "]: transformConfigs: " + this.transformConfigs;
    }
}
