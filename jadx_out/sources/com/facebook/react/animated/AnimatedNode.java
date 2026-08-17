package com.facebook.react.animated;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0012H ¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lcom/facebook/react/animated/AnimatedNode;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "child", "Li7/B;", "addChild$ReactAndroid_release", "(Lcom/facebook/react/animated/AnimatedNode;)V", "addChild", "removeChild$ReactAndroid_release", "removeChild", "parent", "onAttachedToNode$ReactAndroid_release", "onAttachedToNode", "onDetachedFromNode$ReactAndroid_release", "onDetachedFromNode", "update$ReactAndroid_release", "update", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prettyPrint$ReactAndroid_release", "()Ljava/lang/String;", "prettyPrint", "prettyPrintWithChildren$ReactAndroid_release", "prettyPrintWithChildren", PointerEventHelper.POINTER_TYPE_UNKNOWN, "children", "Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "activeIncomingNodes", "I", "BFSColor", "tag", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AnimatedNode {
    public static final int DEFAULT_ANIMATED_NODE_CHILD_COUNT = 1;
    public static final int INITIAL_BFS_COLOR = 0;
    public int BFSColor;
    public int activeIncomingNodes;
    public List<AnimatedNode> children;
    public int tag = -1;

    public final void addChild$ReactAndroid_release(AnimatedNode child) {
        AbstractC2855l.g(child, "child");
        List arrayList = this.children;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.children = arrayList;
        }
        arrayList.add(child);
        child.onAttachedToNode$ReactAndroid_release(this);
    }

    public void onAttachedToNode$ReactAndroid_release(AnimatedNode parent) {
        AbstractC2855l.g(parent, "parent");
    }

    public void onDetachedFromNode$ReactAndroid_release(AnimatedNode parent) {
        AbstractC2855l.g(parent, "parent");
    }

    public abstract String prettyPrint$ReactAndroid_release();

    public final String prettyPrintWithChildren$ReactAndroid_release() {
        String str;
        List<AnimatedNode> list = this.children;
        String strO0 = list != null ? AbstractC2800q.o0(list, " ", null, null, 0, null, null, 62, null) : null;
        String strPrettyPrint$ReactAndroid_release = prettyPrint$ReactAndroid_release();
        if (strO0 == null || q.f0(strO0)) {
            str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        } else {
            str = " children: " + strO0;
        }
        return strPrettyPrint$ReactAndroid_release + str;
    }

    public final void removeChild$ReactAndroid_release(AnimatedNode child) {
        AbstractC2855l.g(child, "child");
        List<AnimatedNode> list = this.children;
        if (list == null) {
            return;
        }
        child.onDetachedFromNode$ReactAndroid_release(this);
        list.remove(child);
    }

    public void update$ReactAndroid_release() {
    }
}
