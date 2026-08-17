package com.facebook.react.views.scroll;

import android.graphics.Rect;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2849f;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3551b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u001aJ#\u0010&\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010#J/\u0010*\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010'\u001a\u00020\u000b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0(H\u0002¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\t0(2\u0006\u0010/\u001a\u00020\u0007¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0004\u0018\u00010\u00022\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020,¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0002H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\u00020\u00032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0013H\u0016¢\u0006\u0004\b>\u0010?J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0002H\u0016¢\u0006\u0004\bC\u00109J\u001d\u0010D\u001a\u00020\u00032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:H\u0016¢\u0006\u0004\bD\u0010=J\u001d\u0010E\u001a\u00020\u00032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:H\u0016¢\u0006\u0004\bE\u0010=J\u0018\u0010F\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bF\u00109J\u001d\u0010G\u001a\u00020\u00032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:H\u0016¢\u0006\u0004\bG\u0010=J\u000f\u0010H\u001a\u00020\u0003H\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/facebook/react/views/scroll/IntervalTree;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/views/scroll/VirtualView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "horizontal", "<init>", "(Z)V", "Landroid/graphics/Rect;", "rect", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "Lcom/facebook/react/views/scroll/Interval;", "rectToInterval", "(Landroid/graphics/Rect;Ljava/lang/String;)Lcom/facebook/react/views/scroll/Interval;", "Lcom/facebook/react/views/scroll/IntervalNode;", "node", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "(Lcom/facebook/react/views/scroll/IntervalNode;)I", "Li7/B;", "updateHeight", "(Lcom/facebook/react/views/scroll/IntervalNode;)V", "updateMax", "balanceFactor", "parent", "rotateRight", "(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;", "rotateLeft", "balance", "i1", "i2", "compareIntervals", "(Lcom/facebook/react/views/scroll/Interval;Lcom/facebook/react/views/scroll/Interval;)I", "intervalNode", "insert", "(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;", "findMin", "target", "delete", "interval", PointerEventHelper.POINTER_TYPE_UNKNOWN, "results", "queryHelper", "(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/Interval;Ljava/util/Set;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "inorderTraversal", "(Lcom/facebook/react/views/scroll/IntervalNode;Ljava/util/List;)V", "queryRect", "query", "(Landroid/graphics/Rect;)Ljava/util/Set;", "virtualViewID", "getVirtualView", "(Ljava/lang/String;)Lcom/facebook/react/views/scroll/VirtualView;", "traverse", "()Ljava/util/List;", "element", "add", "(Lcom/facebook/react/views/scroll/VirtualView;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "elements", "addAll", "(Ljava/util/Collection;)Z", "clear", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "Z", "root", "Lcom/facebook/react/views/scroll/IntervalNode;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "idToIntervalNode", "Ljava/util/Map;", "getSize", "()I", "size", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntervalTree implements Collection<VirtualView>, InterfaceC3551b {
    private final boolean horizontal;
    private final Map<String, IntervalNode> idToIntervalNode = new LinkedHashMap();
    private IntervalNode root;

    public IntervalTree(boolean z10) {
        this.horizontal = z10;
    }

    private final IntervalNode balance(IntervalNode node) {
        updateHeight(node);
        updateMax(node);
        int iBalanceFactor = balanceFactor(node);
        if (iBalanceFactor > 1) {
            if (balanceFactor(node.getLeft()) < 0) {
                IntervalNode left = node.getLeft();
                if (left == null) {
                    throw new IllegalArgumentException("[IntervalTree] node.left must not be null when performing left rotation around it");
                }
                node.setLeft(rotateLeft(left));
            }
            return rotateRight(node);
        }
        if (iBalanceFactor >= -1) {
            return node;
        }
        if (balanceFactor(node.getRight()) > 0) {
            IntervalNode right = node.getRight();
            if (right == null) {
                throw new IllegalArgumentException("[IntervalTree] node.right must not be null when performing right rotation around it");
            }
            node.setRight(rotateRight(right));
        }
        return rotateLeft(node);
    }

    private final int balanceFactor(IntervalNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    private final int compareIntervals(Interval i12, Interval i22) {
        return i12.getStart() != i22.getStart() ? AbstractC2855l.i(i12.getStart(), i22.getStart()) : i12.getEnd() != i22.getEnd() ? AbstractC2855l.i(i12.getEnd(), i22.getEnd()) : i12.getId().compareTo(i22.getId());
    }

    private final IntervalNode delete(IntervalNode node, IntervalNode target) {
        if (node == null) {
            return null;
        }
        if (compareIntervals(target.getInterval(), node.getInterval()) < 0) {
            node.setLeft(delete(node.getLeft(), target));
        } else if (compareIntervals(target.getInterval(), node.getInterval()) > 0) {
            node.setRight(delete(node.getRight(), target));
        } else if (node.getLeft() == null) {
            node = node.getRight();
        } else if (node.getRight() == null) {
            node = node.getLeft();
        } else {
            IntervalNode right = node.getRight();
            if (right == null) {
                throw new IllegalArgumentException("[IntervalTree] node.right must not be null when finding node's successor");
            }
            IntervalNode intervalNodeFindMin = findMin(right);
            node.setVirtualView(intervalNodeFindMin.getVirtualView());
            node.setInterval(intervalNodeFindMin.getInterval());
            node.setRight(delete(node.getRight(), intervalNodeFindMin));
        }
        if (node == null) {
            return null;
        }
        return balance(node);
    }

    private final IntervalNode findMin(IntervalNode node) {
        IntervalNode intervalNodeFindMin;
        IntervalNode left = node.getLeft();
        return (left == null || (intervalNodeFindMin = findMin(left)) == null) ? node : intervalNodeFindMin;
    }

    private final int height(IntervalNode node) {
        if (node != null) {
            return node.getHeight();
        }
        return 0;
    }

    private final void inorderTraversal(IntervalNode node, List<VirtualView> results) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.getLeft(), results);
        results.add(node.getVirtualView());
        inorderTraversal(node.getRight(), results);
    }

    private final IntervalNode insert(IntervalNode node, IntervalNode intervalNode) {
        if (node == null) {
            return intervalNode;
        }
        if (compareIntervals(intervalNode.getInterval(), node.getInterval()) < 0) {
            node.setLeft(insert(node.getLeft(), intervalNode));
        } else {
            node.setRight(insert(node.getRight(), intervalNode));
        }
        return balance(node);
    }

    private final void queryHelper(IntervalNode node, Interval interval, Set<String> results) {
        VirtualView virtualView;
        VirtualView virtualView2;
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            String str = "VirtualViewContainerStateExperimental:queryHelper";
            Rect containerRelativeRect = null;
            String virtualViewID = (node == null || (virtualView2 = node.getVirtualView()) == null) ? null : virtualView2.getVirtualViewID();
            if (node != null && (virtualView = node.getVirtualView()) != null) {
                containerRelativeRect = virtualView.getContainerRelativeRect();
            }
            AbstractC2325a.b(str, "Check node (" + virtualViewID + ", " + containerRelativeRect + ") against interval(" + interval.getStart() + ", " + interval.getEnd() + ")");
        }
        if (node == null || node.getMax() <= interval.getStart()) {
            return;
        }
        queryHelper(node.getLeft(), interval, results);
        if (node.getInterval().intersects(interval)) {
            results.add(node.getVirtualView().getVirtualViewID());
        }
        if (node.getInterval().getStart() < interval.getEnd()) {
            queryHelper(node.getRight(), interval, results);
        }
    }

    private final Interval rectToInterval(Rect rect, String id) {
        if (this.horizontal) {
            int i10 = rect.left;
            int i11 = rect.right;
            if (id == null) {
                id = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            return new Interval(i10, i11, id);
        }
        int i12 = rect.top;
        int i13 = rect.bottom;
        if (id == null) {
            id = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        return new Interval(i12, i13, id);
    }

    static /* synthetic */ Interval rectToInterval$default(IntervalTree intervalTree, Rect rect, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        return intervalTree.rectToInterval(rect, str);
    }

    private final IntervalNode rotateLeft(IntervalNode parent) {
        IntervalNode right = parent.getRight();
        if (right == null) {
            throw new IllegalArgumentException("[IntervalTree] AVL node's right must not be null when rotating left.");
        }
        IntervalNode left = right.getLeft();
        right.setLeft(parent);
        parent.setRight(left);
        updateHeight(parent);
        updateMax(parent);
        updateHeight(right);
        updateMax(right);
        return right;
    }

    private final IntervalNode rotateRight(IntervalNode parent) {
        IntervalNode left = parent.getLeft();
        if (left == null) {
            throw new IllegalArgumentException("[IntervalTree] AVL node's left must not be null when rotating right.");
        }
        IntervalNode right = left.getRight();
        left.setRight(parent);
        parent.setLeft(right);
        updateHeight(parent);
        updateMax(parent);
        updateHeight(left);
        updateMax(left);
        return left;
    }

    private final void updateHeight(IntervalNode node) {
        node.setHeight(Math.max(height(node.getLeft()), height(node.getRight())) + 1);
    }

    private final void updateMax(IntervalNode node) {
        int end = node.getInterval().getEnd();
        IntervalNode left = node.getLeft();
        int max = androidx.customview.widget.a.INVALID_ID;
        int max2 = left != null ? left.getMax() : Integer.MIN_VALUE;
        IntervalNode right = node.getRight();
        if (right != null) {
            max = right.getMax();
        }
        node.setMax(Math.max(end, Math.max(max2, max)));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends VirtualView> elements) {
        AbstractC2855l.g(elements, "elements");
        Iterator<T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (add((VirtualView) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public void clear() {
        this.root = null;
        this.idToIntervalNode.clear();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof VirtualView) {
            return contains((VirtualView) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        AbstractC2855l.g(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.idToIntervalNode.size();
    }

    public final VirtualView getVirtualView(String virtualViewID) {
        AbstractC2855l.g(virtualViewID, "virtualViewID");
        IntervalNode intervalNode = this.idToIntervalNode.get(virtualViewID);
        if (intervalNode != null) {
            return intervalNode.getVirtualView();
        }
        return null;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<VirtualView> iterator() {
        ArrayList arrayList = new ArrayList();
        inorderTraversal(this.root, arrayList);
        return arrayList.iterator();
    }

    public final Set<String> query(Rect queryRect) {
        AbstractC2855l.g(queryRect, "queryRect");
        Interval intervalRectToInterval$default = rectToInterval$default(this, queryRect, null, 2, null);
        HashSet hashSet = new HashSet();
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:query", "Querying tree for rect " + queryRect);
        }
        queryHelper(this.root, intervalRectToInterval$default, hashSet);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:query", "Query results: " + hashSet);
        }
        return hashSet;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof VirtualView) {
            return remove((VirtualView) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        AbstractC2855l.g(elements, "elements");
        Iterator<T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (remove(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        AbstractC2855l.g(elements, "elements");
        throw new Error("IntervalTree does not support retainAll yet");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC2849f.a(this);
    }

    public final List<VirtualView> traverse() {
        ArrayList arrayList = new ArrayList();
        inorderTraversal(this.root, arrayList);
        return arrayList;
    }

    @Override // java.util.Collection
    public boolean add(VirtualView element) {
        boolean z10;
        AbstractC2855l.g(element, "element");
        String virtualViewID = element.getVirtualViewID();
        IntervalNode intervalNode = this.idToIntervalNode.get(virtualViewID);
        if (intervalNode != null) {
            this.root = delete(this.root, intervalNode);
            z10 = false;
        } else {
            z10 = true;
        }
        IntervalNode intervalNode2 = new IntervalNode(rectToInterval(element.getContainerRelativeRect(), virtualViewID), element, 0, 0, null, null, 60, null);
        this.root = insert(this.root, intervalNode2);
        this.idToIntervalNode.put(virtualViewID, intervalNode2);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            AbstractC2325a.b("VirtualViewContainerStateExperimental:IntervalTree: add", "New VirtualView: (" + element.getVirtualViewID() + ", " + element.getContainerRelativeRect() + "). Node interval " + intervalNode2.getInterval().getId());
        }
        return z10;
    }

    public boolean contains(VirtualView element) {
        AbstractC2855l.g(element, "element");
        return this.idToIntervalNode.containsKey(element.getVirtualViewID());
    }

    public boolean remove(VirtualView element) {
        AbstractC2855l.g(element, "element");
        IntervalNode intervalNode = this.idToIntervalNode.get(element.getVirtualViewID());
        if (intervalNode == null) {
            return false;
        }
        this.root = delete(this.root, intervalNode);
        this.idToIntervalNode.remove(element.getVirtualViewID());
        return true;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC2855l.g(array, "array");
        return (T[]) AbstractC2849f.b(this, array);
    }
}
