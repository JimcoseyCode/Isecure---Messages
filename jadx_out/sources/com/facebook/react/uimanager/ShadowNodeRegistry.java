package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u00060\u001dR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/facebook/react/uimanager/ShadowNodeRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/uimanager/ReactShadowNode;", "node", "Li7/B;", "addRootNode", "(Lcom/facebook/react/uimanager/ReactShadowNode;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tag", "removeRootNode", "(I)V", "addNode", "removeNode", "getNode", "(I)Lcom/facebook/react/uimanager/ReactShadowNode;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isRootNode", "(I)Z", "index", "getRootTag", "(I)I", "Landroid/util/SparseArray;", "tagsToCSSNodes", "Landroid/util/SparseArray;", "Landroid/util/SparseBooleanArray;", "rootTags", "Landroid/util/SparseBooleanArray;", "Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;", "threadAsserter", "Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;", "getRootNodeCount", "()I", "rootNodeCount", "Companion", "SingleThreadAsserter", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShadowNodeRegistry {
    private static final Companion Companion = new Companion(null);
    private final SparseArray<ReactShadowNode<?>> tagsToCSSNodes = new SparseArray<>();
    private final SparseBooleanArray rootTags = new SparseBooleanArray();
    private final SingleThreadAsserter threadAsserter = new SingleThreadAsserter();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/uimanager/ShadowNodeRegistry$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lcom/facebook/react/uimanager/ShadowNodeRegistry;)V", "Li7/B;", "assertNow", "()V", "Ljava/lang/Thread;", "thread", "Ljava/lang/Thread;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SingleThreadAsserter {
        private Thread thread;

        public SingleThreadAsserter() {
        }

        public final void assertNow() {
            Thread threadCurrentThread = Thread.currentThread();
            if (this.thread == null) {
                this.thread = threadCurrentThread;
            }
            AbstractC3007a.a(AbstractC2855l.b(this.thread, threadCurrentThread));
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ShadowNodeRegistry", LegacyArchitectureLogLevel.ERROR);
    }

    public final void addNode(ReactShadowNode<?> node) {
        AbstractC2855l.g(node, "node");
        this.threadAsserter.assertNow();
        this.tagsToCSSNodes.put(node.getReactTag(), node);
    }

    public final void addRootNode(ReactShadowNode<?> node) {
        AbstractC2855l.g(node, "node");
        this.threadAsserter.assertNow();
        int reactTag = node.getReactTag();
        this.tagsToCSSNodes.put(reactTag, node);
        this.rootTags.put(reactTag, true);
    }

    public final ReactShadowNode<?> getNode(int tag) {
        this.threadAsserter.assertNow();
        return this.tagsToCSSNodes.get(tag);
    }

    public final int getRootNodeCount() {
        this.threadAsserter.assertNow();
        return this.rootTags.size();
    }

    public final int getRootTag(int index) {
        this.threadAsserter.assertNow();
        return this.rootTags.keyAt(index);
    }

    public final boolean isRootNode(int tag) {
        this.threadAsserter.assertNow();
        return this.rootTags.get(tag);
    }

    public final void removeNode(int tag) {
        this.threadAsserter.assertNow();
        if (!this.rootTags.get(tag)) {
            this.tagsToCSSNodes.remove(tag);
            return;
        }
        throw new IllegalViewOperationException("Trying to remove root node " + tag + " without using removeRootNode!");
    }

    public final void removeRootNode(int tag) {
        this.threadAsserter.assertNow();
        if (tag == -1) {
            return;
        }
        if (this.rootTags.get(tag)) {
            this.tagsToCSSNodes.remove(tag);
            this.rootTags.delete(tag);
        } else {
            throw new IllegalViewOperationException("View with tag " + tag + " is not registered as a root view");
        }
    }
}
