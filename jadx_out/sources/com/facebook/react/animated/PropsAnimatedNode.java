package com.facebook.react.animated;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2753p;
import i7.C2752o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0013\u0010&\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/facebook/react/animated/PropsAnimatedNode;", "Lcom/facebook/react/animated/AnimatedNode;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "nativeAnimatedNodesManager", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewTag", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "Li7/B;", "connectToView", "(ILcom/facebook/react/bridge/UIManager;)V", "disconnectFromView", "(I)V", "restoreDefaultValues", "()V", "updateView", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prettyPrint$ReactAndroid_release", "()Ljava/lang/String;", "prettyPrint", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "connectedViewTag", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "propNodeMapping", "Ljava/util/Map;", "Lcom/facebook/react/bridge/JavaOnlyMap;", "propMap", "Lcom/facebook/react/bridge/JavaOnlyMap;", "connectedViewUIManager", "Lcom/facebook/react/bridge/UIManager;", "Landroid/view/View;", "getConnectedView", "()Landroid/view/View;", "connectedView", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PropsAnimatedNode extends AnimatedNode {
    private int connectedViewTag;
    private UIManager connectedViewUIManager;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;
    private final JavaOnlyMap propMap;
    private final Map<String, Integer> propNodeMapping;

    public PropsAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        AbstractC2855l.g(config, "config");
        AbstractC2855l.g(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.connectedViewTag = -1;
        this.propMap = new JavaOnlyMap();
        ReadableMap map = config.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        this.propNodeMapping = new LinkedHashMap();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.propNodeMapping.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
    }

    public final void connectToView(int viewTag, UIManager uiManager) {
        if (this.connectedViewTag == -1) {
            this.connectedViewTag = viewTag;
            this.connectedViewUIManager = uiManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.tag + " is already attached to a view: " + this.connectedViewTag);
    }

    public final void disconnectFromView(int viewTag) {
        int i10 = this.connectedViewTag;
        if (i10 == viewTag || i10 == -1) {
            this.connectedViewTag = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + viewTag + " but is connected to view " + this.connectedViewTag);
    }

    public final View getConnectedView() {
        Object objB;
        try {
            C2752o.a aVar = C2752o.f28721h;
            UIManager uIManager = this.connectedViewUIManager;
            objB = C2752o.b(uIManager != null ? uIManager.resolveView(this.connectedViewTag) : null);
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        return (View) (C2752o.f(objB) ? null : objB);
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint$ReactAndroid_release() {
        return "PropsAnimatedNode[" + this.tag + "] connectedViewTag: " + this.connectedViewTag + " propNodeMapping: " + this.propNodeMapping + " propMap: " + this.propMap;
    }

    public final void restoreDefaultValues() {
        int i10 = this.connectedViewTag;
        if (i10 == -1 || ViewUtil.getUIManagerType(i10) == 2) {
            return;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.propMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            this.propMap.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        UIManager uIManager = this.connectedViewUIManager;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.connectedViewTag, this.propMap);
        }
    }

    public final void updateView() {
        if (this.connectedViewTag == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.propNodeMapping.entrySet()) {
            String key = entry.getKey();
            AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(entry.getValue().intValue());
            if (nodeById == null) {
                throw new IllegalArgumentException("Mapped property node does not exist");
            }
            if (nodeById instanceof StyleAnimatedNode) {
                ((StyleAnimatedNode) nodeById).collectViewUpdates(this.propMap);
            } else if (nodeById instanceof ValueAnimatedNode) {
                ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                Object objectValue = valueAnimatedNode.getObjectValue();
                if (objectValue instanceof Integer) {
                    this.propMap.putInt(key, ((Number) objectValue).intValue());
                } else if (objectValue instanceof String) {
                    this.propMap.putString(key, (String) objectValue);
                } else {
                    this.propMap.putDouble(key, valueAnimatedNode.getValue());
                }
            } else if (nodeById instanceof ColorAnimatedNode) {
                this.propMap.putInt(key, ((ColorAnimatedNode) nodeById).getColor());
            } else {
                if (!(nodeById instanceof ObjectAnimatedNode)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + nodeById.getClass());
                }
                ((ObjectAnimatedNode) nodeById).collectViewUpdates(key, this.propMap);
            }
        }
        UIManager uIManager = this.connectedViewUIManager;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.connectedViewTag, this.propMap);
        }
    }
}
