package com.facebook.react.animated;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.view.ColorUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/facebook/react/animated/ColorAnimatedNode;", "Lcom/facebook/react/animated/AnimatedNode;", "Lcom/facebook/react/animated/AnimatedNodeWithUpdateableConfig;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "nativeAnimatedNodesManager", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Li7/B;", "tryApplyNativeColor", "()V", "onUpdateConfig", "(Lcom/facebook/react/bridge/ReadableMap;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prettyPrint$ReactAndroid_release", "()Ljava/lang/String;", "prettyPrint", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "Lcom/facebook/react/bridge/ReactApplicationContext;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "rNodeId", "I", "gNodeId", "bNodeId", "aNodeId", "nativeColor", "Lcom/facebook/react/bridge/ReadableMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "nativeColorApplied", "Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "getColor", "()I", ViewProps.COLOR, "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorAnimatedNode extends AnimatedNode implements AnimatedNodeWithUpdateableConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int aNodeId;
    private int bNodeId;
    private int gNodeId;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;
    private ReadableMap nativeColor;
    private boolean nativeColorApplied;
    private int rNodeId;
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/react/animated/ColorAnimatedNode$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getContextHelper", "Landroid/content/Context;", "node", "Lcom/facebook/react/animated/AnimatedNode;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Context getContextHelper(AnimatedNode node) {
            List<AnimatedNode> list = node.children;
            if (list != null) {
                Iterator<AnimatedNode> it = list.iterator();
                if (it.hasNext()) {
                    AnimatedNode next = it.next();
                    if (!(next instanceof PropsAnimatedNode)) {
                        return ColorAnimatedNode.INSTANCE.getContextHelper(next);
                    }
                    View connectedView = ((PropsAnimatedNode) next).getConnectedView();
                    if (connectedView != null) {
                        return connectedView.getContext();
                    }
                    return null;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public ColorAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager, ReactApplicationContext reactApplicationContext) {
        AbstractC2855l.g(config, "config");
        AbstractC2855l.g(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.reactApplicationContext = reactApplicationContext;
        onUpdateConfig(config);
    }

    private final Context getContext() {
        Activity currentActivity = this.reactApplicationContext.getCurrentActivity();
        return currentActivity != null ? currentActivity : INSTANCE.getContextHelper(this);
    }

    private final void tryApplyNativeColor() {
        Context context;
        Integer color;
        if (this.nativeColor == null || this.nativeColorApplied || (context = getContext()) == null || (color = ColorPropConverter.getColor(this.nativeColor, context)) == null) {
            return;
        }
        int iIntValue = color.intValue();
        ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.rNodeId);
        ValueAnimatedNode valueAnimatedNode2 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.gNodeId);
        ValueAnimatedNode valueAnimatedNode3 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.bNodeId);
        ValueAnimatedNode valueAnimatedNode4 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.aNodeId);
        if (valueAnimatedNode != null) {
            valueAnimatedNode.nodeValue = Color.red(iIntValue);
        }
        if (valueAnimatedNode2 != null) {
            valueAnimatedNode2.nodeValue = Color.green(iIntValue);
        }
        if (valueAnimatedNode3 != null) {
            valueAnimatedNode3.nodeValue = Color.blue(iIntValue);
        }
        if (valueAnimatedNode4 != null) {
            valueAnimatedNode4.nodeValue = ((double) Color.alpha(iIntValue)) / 255.0d;
        }
        this.nativeColorApplied = true;
    }

    public final int getColor() {
        tryApplyNativeColor();
        ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.rNodeId);
        ValueAnimatedNode valueAnimatedNode2 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.gNodeId);
        ValueAnimatedNode valueAnimatedNode3 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.bNodeId);
        ValueAnimatedNode valueAnimatedNode4 = (ValueAnimatedNode) this.nativeAnimatedNodesManager.getNodeById(this.aNodeId);
        return ColorUtil.normalize(valueAnimatedNode != null ? valueAnimatedNode.nodeValue : 0.0d, valueAnimatedNode2 != null ? valueAnimatedNode2.nodeValue : 0.0d, valueAnimatedNode3 != null ? valueAnimatedNode3.nodeValue : 0.0d, valueAnimatedNode4 != null ? valueAnimatedNode4.nodeValue : 0.0d);
    }

    @Override // com.facebook.react.animated.AnimatedNodeWithUpdateableConfig
    public void onUpdateConfig(ReadableMap config) {
        if (config == null) {
            this.rNodeId = 0;
            this.gNodeId = 0;
            this.bNodeId = 0;
            this.aNodeId = 0;
            this.nativeColor = null;
            this.nativeColorApplied = false;
            return;
        }
        this.rNodeId = config.getInt("r");
        this.gNodeId = config.getInt("g");
        this.bNodeId = config.getInt("b");
        this.aNodeId = config.getInt("a");
        this.nativeColor = config.getMap("nativeColor");
        this.nativeColorApplied = false;
        tryApplyNativeColor();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint$ReactAndroid_release() {
        return "ColorAnimatedNode[" + this.tag + "]: r: " + this.rNodeId + "  g: " + this.gNodeId + " b: " + this.bNodeId + " a: " + this.aNodeId;
    }
}
