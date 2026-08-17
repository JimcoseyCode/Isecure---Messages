package com.facebook.react.animated;

import P8.q;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 k2\u00020\u0001:\u0001kB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b'\u0010\u001aJ!\u0010*\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b,\u0010\u001aJ\u001f\u0010/\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\u0006\u00101\u001a\u00020-H\u0007¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b3\u0010\u001aJ\u0017\u00104\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b4\u0010\u001aJ1\u0010:\u001a\u00020\b2\u0006\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0017H\u0007¢\u0006\u0004\b<\u0010\u001aJ\u001f\u0010?\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0017H\u0007¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0017¢\u0006\u0004\bA\u0010@J\u001f\u0010C\u001a\u00020\b2\u0006\u00106\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\u0017H\u0007¢\u0006\u0004\bC\u0010@J\u001f\u0010D\u001a\u00020\b2\u0006\u00106\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\u0017H\u0007¢\u0006\u0004\bD\u0010@J!\u0010F\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0017H\u0007¢\u0006\u0004\bH\u0010\u001aJ'\u0010J\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bJ\u0010KJ'\u0010M\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u0017H\u0007¢\u0006\u0004\bM\u0010NJ\u001b\u0010O\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\bO\u0010\u000eJ\u0017\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020PH\u0007¢\u0006\u0004\bR\u0010SJ%\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170U2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0013H\u0000¢\u0006\u0004\bV\u0010WR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010YR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00060Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\\R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00060`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010cR\u0016\u0010g\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010hR\u0016\u0010j\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010h¨\u0006l"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/animated/AnimatedNode;", "animatedNode", "Li7/B;", "stopAnimationsForNode", "(Lcom/facebook/react/animated/AnimatedNode;)V", "Lcom/facebook/react/uimanager/events/Event;", "event", "handleEvent", "(Lcom/facebook/react/uimanager/events/Event;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "nodes", "updateNodes", "(Ljava/util/List;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventHandlerName", "normalizeEventName", "(Ljava/lang/String;)Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "uiManagerType", "initializeEventListenerForUIManagerType", "(I)V", "id", "getNodeById", "(I)Lcom/facebook/react/animated/AnimatedNode;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasActiveAnimations", "()Z", "tag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "createAnimatedNode", "(ILcom/facebook/react/bridge/ReadableMap;)V", "updateAnimatedNodeConfig", "dropAnimatedNode", "Lcom/facebook/react/animated/AnimatedNodeValueListener;", "listener", "startListeningToAnimatedNodeValue", "(ILcom/facebook/react/animated/AnimatedNodeValueListener;)V", "stopListeningToAnimatedNodeValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "setAnimatedNodeValue", "(ID)V", "offset", "setAnimatedNodeOffset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "animationId", "animatedNodeTag", "animationConfig", "Lcom/facebook/react/bridge/Callback;", "endCallback", "startAnimatingNode", "(IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "stopAnimation", "parentNodeTag", "childNodeTag", "connectAnimatedNodes", "(II)V", "disconnectAnimatedNodes", "viewTag", "connectAnimatedNodeToView", "disconnectAnimatedNodeFromView", "callback", "getValue", "(ILcom/facebook/react/bridge/Callback;)V", "restoreDefaultValues", "eventMapping", "addAnimatedEventToView", "(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "animatedValueTag", "removeAnimatedEventFromView", "(ILjava/lang/String;I)V", "onEventDispatch", PointerEventHelper.POINTER_TYPE_UNKNOWN, "frameTimeNanos", "runUpdates", "(J)V", "eventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getTagsOfConnectedNodes$ReactAndroid_release", "(ILjava/lang/String;)Ljava/util/Set;", "getTagsOfConnectedNodes", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/util/SparseArray;", "animatedNodes", "Landroid/util/SparseArray;", "Lcom/facebook/react/animated/AnimationDriver;", "activeAnimations", "updatedNodes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/animated/EventAnimationDriver;", "eventDrivers", "Ljava/util/List;", "animatedGraphBFSColor", "I", "runUpdateNodeList", "eventListenerInitializedForFabric", "Z", "eventListenerInitializedForNonFabric", "warnedAboutGraphTraversal", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeAnimatedNodesManager implements EventDispatcherListener {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "NativeAnimatedNodesManager";
    private int animatedGraphBFSColor;
    private boolean eventListenerInitializedForFabric;
    private boolean eventListenerInitializedForNonFabric;
    private final ReactApplicationContext reactApplicationContext;
    private boolean warnedAboutGraphTraversal;
    private final SparseArray<AnimatedNode> animatedNodes = new SparseArray<>();
    private final SparseArray<AnimationDriver> activeAnimations = new SparseArray<>();
    private final SparseArray<AnimatedNode> updatedNodes = new SparseArray<>();
    private final List<EventAnimationDriver> eventDrivers = new ArrayList();
    private final List<AnimatedNode> runUpdateNodeList = new LinkedList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedNodesManager$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NativeAnimatedNodesManager(ReactApplicationContext reactApplicationContext) {
        this.reactApplicationContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(Event<?> event) {
        if (this.eventDrivers.isEmpty()) {
            return;
        }
        Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec = event.getEventAnimationDriverMatchSpec();
        boolean z10 = false;
        for (EventAnimationDriver eventAnimationDriver : this.eventDrivers) {
            if (eventAnimationDriverMatchSpec != null && eventAnimationDriverMatchSpec.match(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                stopAnimationsForNode(eventAnimationDriver.valueNode);
                event.dispatchModern(eventAnimationDriver);
                this.runUpdateNodeList.add(eventAnimationDriver.valueNode);
                z10 = true;
            }
        }
        if (z10) {
            updateNodes(this.runUpdateNodeList);
            this.runUpdateNodeList.clear();
        }
    }

    private final String normalizeEventName(String eventHandlerName) {
        if (!q.K(eventHandlerName, ViewProps.ON, false, 2, null)) {
            return eventHandlerName;
        }
        String strSubstring = eventHandlerName.substring(2);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return ViewProps.TOP + strSubstring;
    }

    private final void stopAnimationsForNode(AnimatedNode animatedNode) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray = null;
        int i10 = 0;
        while (i10 < this.activeAnimations.size()) {
            AnimationDriver animationDriverValueAt = this.activeAnimations.valueAt(i10);
            if (AbstractC2855l.b(animatedNode, animationDriverValueAt.animatedValue)) {
                ValueAnimatedNode valueAnimatedNode = animationDriverValueAt.animatedValue;
                if (valueAnimatedNode == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (animationDriverValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("finished", false);
                    readableMapBuilder.put("value", valueAnimatedNode.nodeValue);
                    readableMapBuilder.put("offset", valueAnimatedNode.offset);
                    Callback callback = animationDriverValueAt.endCallback;
                    if (callback != null) {
                        callback.invoke(writableMapCreateMap);
                    }
                } else if (this.reactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                    readableMapBuilder2.put("animationId", animationDriverValueAt.id);
                    readableMapBuilder2.put("finished", false);
                    readableMapBuilder2.put("value", valueAnimatedNode.nodeValue);
                    readableMapBuilder2.put("offset", valueAnimatedNode.offset);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.activeAnimations.removeAt(i10);
                i10--;
            }
            i10++;
        }
        if (writableArrayCreateArray == null || (reactApplicationContext = this.reactApplicationContext) == null) {
            return;
        }
        reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
    }

    private final void updateNodes(List<? extends AnimatedNode> nodes) {
        List<AnimatedNode> list;
        List<AnimatedNode> list2;
        int i10 = this.animatedGraphBFSColor;
        int i11 = i10 + 1;
        this.animatedGraphBFSColor = i11;
        if (i11 == 0) {
            this.animatedGraphBFSColor = i10 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i12 = 0;
        for (AnimatedNode animatedNode : nodes) {
            int i13 = animatedNode.BFSColor;
            int i14 = this.animatedGraphBFSColor;
            if (i13 != i14) {
                animatedNode.BFSColor = i14;
                i12++;
                arrayDeque.add(animatedNode);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode2 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode2 != null && (list2 = animatedNode2.children) != null) {
                for (AnimatedNode animatedNode3 : list2) {
                    animatedNode3.activeIncomingNodes++;
                    int i15 = animatedNode3.BFSColor;
                    int i16 = this.animatedGraphBFSColor;
                    if (i15 != i16) {
                        animatedNode3.BFSColor = i16;
                        i12++;
                        arrayDeque.add(animatedNode3);
                    }
                }
            }
        }
        int i17 = this.animatedGraphBFSColor;
        int i18 = i17 + 1;
        this.animatedGraphBFSColor = i18;
        if (i18 == 0) {
            this.animatedGraphBFSColor = i17 + 2;
        }
        int i19 = 0;
        for (AnimatedNode animatedNode4 : nodes) {
            if (animatedNode4.activeIncomingNodes == 0) {
                int i20 = animatedNode4.BFSColor;
                int i21 = this.animatedGraphBFSColor;
                if (i20 != i21) {
                    animatedNode4.BFSColor = i21;
                    i19++;
                    arrayDeque.add(animatedNode4);
                }
            }
        }
        int i22 = 0;
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode5 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode5 != null) {
                try {
                    animatedNode5.update$ReactAndroid_release();
                } catch (JSApplicationCausedNativeException e10) {
                    AbstractC2325a.n(TAG, "Native animation workaround, frame lost as result of race condition", e10);
                }
            }
            if (animatedNode5 instanceof PropsAnimatedNode) {
                ((PropsAnimatedNode) animatedNode5).updateView();
            }
            if (animatedNode5 instanceof ValueAnimatedNode) {
                ((ValueAnimatedNode) animatedNode5).onValueUpdate();
            }
            if (animatedNode5 != null && (list = animatedNode5.children) != null) {
                for (AnimatedNode animatedNode6 : list) {
                    int i23 = animatedNode6.activeIncomingNodes - 1;
                    animatedNode6.activeIncomingNodes = i23;
                    int i24 = animatedNode6.BFSColor;
                    int i25 = this.animatedGraphBFSColor;
                    if (i24 != i25 && i23 == 0) {
                        animatedNode6.BFSColor = i25;
                        i19++;
                        arrayDeque.add(animatedNode6);
                    } else if (i24 == i25) {
                        i22++;
                    }
                }
            }
        }
        if (i12 == i19) {
            this.warnedAboutGraphTraversal = false;
            return;
        }
        if (this.warnedAboutGraphTraversal) {
            return;
        }
        this.warnedAboutGraphTraversal = true;
        AbstractC2325a.m(TAG, "Detected animation cycle or disconnected graph. ");
        Iterator<? extends AnimatedNode> it = nodes.iterator();
        while (it.hasNext()) {
            AbstractC2325a.m(TAG, it.next().prettyPrintWithChildren$ReactAndroid_release());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i22 > 0 ? "cycles (" + i22 + ")" : "disconnected regions") + ", there are " + i12 + " but toposort visited only " + i19);
        boolean z10 = this.eventListenerInitializedForFabric;
        if (z10 && i22 == 0) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z10) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
        }
    }

    public final void addAnimatedEventToView(int viewTag, String eventHandlerName, ReadableMap eventMapping) {
        AbstractC2855l.g(eventHandlerName, "eventHandlerName");
        AbstractC2855l.g(eventMapping, "eventMapping");
        int i10 = eventMapping.getInt("animatedValueTag");
        AnimatedNode animatedNode = this.animatedNodes.get(i10);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i10 + "] does not exist");
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + viewTag + "] connected to event handler (" + eventHandlerName + ") should be of type " + ValueAnimatedNode.class.getName());
        }
        ReadableArray array = eventMapping.getArray("nativeEventPath");
        if (array == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ArrayList arrayList = new ArrayList(array.size());
        int size = array.size();
        for (int i11 = 0; i11 < size; i11++) {
            String string = array.getString(i11);
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(string);
        }
        String strNormalizeEventName = normalizeEventName(eventHandlerName);
        this.eventDrivers.add(new EventAnimationDriver(strNormalizeEventName, viewTag, arrayList, (ValueAnimatedNode) animatedNode));
        if (AbstractC2855l.b(strNormalizeEventName, "topScroll")) {
            addAnimatedEventToView(viewTag, "topScrollEnded", eventMapping);
        }
    }

    public final void connectAnimatedNodeToView(int animatedNodeTag, int viewTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + animatedNodeTag + "] does not exist");
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + viewTag + "] should be of type " + PropsAnimatedNode.class.getName());
        }
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext == null) {
            throw new IllegalStateException(("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + viewTag).toString());
        }
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(reactApplicationContext, viewTag);
        if (uIManagerForReactTag != null) {
            ((PropsAnimatedNode) animatedNode).connectToView(viewTag, uIManagerForReactTag);
            this.updatedNodes.put(animatedNodeTag, animatedNode);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + viewTag));
        }
    }

    public final void connectAnimatedNodes(int parentNodeTag, int childNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(parentNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + parentNodeTag + "] does not exist");
        }
        AnimatedNode animatedNode2 = this.animatedNodes.get(childNodeTag);
        if (animatedNode2 != null) {
            animatedNode.addChild$ReactAndroid_release(animatedNode2);
            this.updatedNodes.put(childNodeTag, animatedNode2);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + childNodeTag + "] does not exist");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void createAnimatedNode(int tag, ReadableMap config) {
        AnimatedNode subtractionAnimatedNode;
        AbstractC2855l.g(config, "config");
        if (this.animatedNodes.get(tag) != null) {
            throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + tag + "] already exists");
        }
        String string = config.getString(NotificationsService.EVENT_TYPE_KEY);
        if (string != null) {
            switch (string.hashCode()) {
                case -1774341004:
                    if (string.equals("subtraction")) {
                        subtractionAnimatedNode = new SubtractionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case -1226589444:
                    if (string.equals("addition")) {
                        subtractionAnimatedNode = new AdditionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case -1023368385:
                    if (string.equals("object")) {
                        subtractionAnimatedNode = new ObjectAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 94842723:
                    if (string.equals(ViewProps.COLOR)) {
                        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
                        if (reactApplicationContext == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        subtractionAnimatedNode = new ColorAnimatedNode(config, this, reactApplicationContext);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 106940784:
                    if (string.equals("props")) {
                        subtractionAnimatedNode = new PropsAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 109780401:
                    if (string.equals("style")) {
                        subtractionAnimatedNode = new StyleAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 111972721:
                    if (string.equals("value")) {
                        subtractionAnimatedNode = new ValueAnimatedNode(config);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 364720301:
                    if (string.equals("division")) {
                        subtractionAnimatedNode = new DivisionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 559331748:
                    if (string.equals("interpolation")) {
                        subtractionAnimatedNode = new InterpolationAnimatedNode(config);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 668845958:
                    if (string.equals("multiplication")) {
                        subtractionAnimatedNode = new MultiplicationAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1052666732:
                    if (string.equals(ViewProps.TRANSFORM)) {
                        subtractionAnimatedNode = new TransformAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1227434359:
                    if (string.equals("modulus")) {
                        subtractionAnimatedNode = new ModulusAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1270488759:
                    if (string.equals("tracking")) {
                        subtractionAnimatedNode = new TrackingAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1300649942:
                    if (string.equals("diffclamp")) {
                        subtractionAnimatedNode = new DiffClampAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
    }

    public final void disconnectAnimatedNodeFromView(int animatedNodeTag, int viewTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + animatedNodeTag + "] does not exist");
        }
        if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).disconnectFromView(viewTag);
            return;
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + viewTag + "] should be of type " + PropsAnimatedNode.class.getName());
    }

    public final void disconnectAnimatedNodes(int parentNodeTag, int childNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(parentNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + parentNodeTag + "] does not exist");
        }
        AnimatedNode animatedNode2 = this.animatedNodes.get(childNodeTag);
        if (animatedNode2 != null) {
            animatedNode.removeChild$ReactAndroid_release(animatedNode2);
            this.updatedNodes.put(childNodeTag, animatedNode2);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + childNodeTag + "] does not exist");
        }
    }

    public final void dropAnimatedNode(int tag) {
        this.animatedNodes.remove(tag);
        this.updatedNodes.remove(tag);
    }

    public final void extractAnimatedNodeOffset(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).extractOffset();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + tag + "] does not exist, or is not a 'value' node");
    }

    public final void flattenAnimatedNodeOffset(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).flattenOffset();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + tag + "] does not exist, or is not a 'value' node");
    }

    public final AnimatedNode getNodeById(int id) {
        return this.animatedNodes.get(id);
    }

    public final Set<Integer> getTagsOfConnectedNodes$ReactAndroid_release(int tag, String eventName) {
        int i10;
        AbstractC2855l.g(eventName, "eventName");
        HashSet hashSet = new HashSet();
        for (EventAnimationDriver eventAnimationDriver : this.eventDrivers) {
            if (AbstractC2855l.b(eventName, eventAnimationDriver.eventName) && tag == (i10 = eventAnimationDriver.viewTag)) {
                hashSet.add(Integer.valueOf(i10));
                List<AnimatedNode> list = eventAnimationDriver.valueNode.children;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(((AnimatedNode) it.next()).tag));
                    }
                }
            }
        }
        return hashSet;
    }

    public final void getValue(int tag, Callback callback) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + tag + "] does not exist or is not a 'value' node");
        }
        double value = ((ValueAnimatedNode) animatedNode).getValue();
        if (callback != null) {
            callback.invoke(Double.valueOf(value));
            return;
        }
        if (this.reactApplicationContext == null) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", tag);
        readableMapBuilder.put("value", value);
        this.reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
    }

    public final boolean hasActiveAnimations() {
        return this.activeAnimations.size() > 0 || this.updatedNodes.size() > 0;
    }

    public final void initializeEventListenerForUIManagerType(int uiManagerType) {
        if (uiManagerType == 2 ? this.eventListenerInitializedForFabric : this.eventListenerInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, uiManagerType);
        if (uIManager != null) {
            uIManager.getEventDispatcher().addListener(this);
            if (uiManagerType == 2) {
                this.eventListenerInitializedForFabric = true;
            } else {
                this.eventListenerInitializedForNonFabric = true;
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(final Event<?> event) {
        AbstractC2855l.g(event, "event");
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(event);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.animated.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20278g.handleEvent(event);
                }
            });
        }
    }

    public final void removeAnimatedEventFromView(int viewTag, String eventHandlerName, int animatedValueTag) {
        Object next;
        AbstractC2855l.g(eventHandlerName, "eventHandlerName");
        String strNormalizeEventName = normalizeEventName(eventHandlerName);
        Iterator<T> it = this.eventDrivers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) next;
            if (AbstractC2855l.b(strNormalizeEventName, eventAnimationDriver.eventName) && viewTag == eventAnimationDriver.viewTag && animatedValueTag == eventAnimationDriver.valueNode.tag) {
                break;
            }
        }
        EventAnimationDriver eventAnimationDriver2 = (EventAnimationDriver) next;
        if (eventAnimationDriver2 != null) {
            this.eventDrivers.remove(eventAnimationDriver2);
        }
        if (AbstractC2855l.b(strNormalizeEventName, "topScroll")) {
            removeAnimatedEventFromView(viewTag, "topScrollEnded", animatedValueTag);
        }
    }

    public final void restoreDefaultValues(int animatedNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            return;
        }
        if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).restoreDefaultValues();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + PropsAnimatedNode.class.getName());
    }

    public final void runUpdates(long frameTimeNanos) {
        ReactApplicationContext reactApplicationContext;
        UiThreadUtil.assertOnUiThread();
        int size = this.updatedNodes.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnimatedNode animatedNodeValueAt = this.updatedNodes.valueAt(i10);
            List<AnimatedNode> list = this.runUpdateNodeList;
            AbstractC2855l.d(animatedNodeValueAt);
            list.add(animatedNodeValueAt);
        }
        this.updatedNodes.clear();
        int size2 = this.activeAnimations.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size2; i11++) {
            AnimationDriver animationDriverValueAt = this.activeAnimations.valueAt(i11);
            animationDriverValueAt.runAnimationStep(frameTimeNanos);
            ValueAnimatedNode valueAnimatedNode = animationDriverValueAt.animatedValue;
            if (valueAnimatedNode != null) {
                this.runUpdateNodeList.add(valueAnimatedNode);
            }
            if (animationDriverValueAt.hasFinished) {
                z10 = true;
            }
        }
        updateNodes(this.runUpdateNodeList);
        this.runUpdateNodeList.clear();
        if (z10) {
            WritableArray writableArrayCreateArray = null;
            for (int size3 = this.activeAnimations.size() - 1; -1 < size3; size3--) {
                AnimationDriver animationDriverValueAt2 = this.activeAnimations.valueAt(size3);
                if (animationDriverValueAt2.hasFinished) {
                    ValueAnimatedNode valueAnimatedNode2 = animationDriverValueAt2.animatedValue;
                    if (valueAnimatedNode2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (animationDriverValueAt2.endCallback != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                        readableMapBuilder.put("finished", true);
                        readableMapBuilder.put("value", valueAnimatedNode2.nodeValue);
                        readableMapBuilder.put("offset", valueAnimatedNode2.offset);
                        Callback callback = animationDriverValueAt2.endCallback;
                        if (callback != null) {
                            callback.invoke(writableMapCreateMap);
                        }
                    } else if (this.reactApplicationContext != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                        readableMapBuilder2.put("animationId", animationDriverValueAt2.id);
                        readableMapBuilder2.put("finished", true);
                        readableMapBuilder2.put("value", valueAnimatedNode2.nodeValue);
                        readableMapBuilder2.put("offset", valueAnimatedNode2.offset);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    this.activeAnimations.removeAt(size3);
                }
            }
            if (writableArrayCreateArray == null || (reactApplicationContext = this.reactApplicationContext) == null) {
                return;
            }
            reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    public final void setAnimatedNodeOffset(int tag, double offset) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).offset = offset;
            this.updatedNodes.put(tag, animatedNode);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + tag + "] does not exist, or is not a 'value' node");
        }
    }

    public final void setAnimatedNodeValue(int tag, double value) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            stopAnimationsForNode(animatedNode);
            ((ValueAnimatedNode) animatedNode).nodeValue = value;
            this.updatedNodes.put(tag, animatedNode);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + tag + "] does not exist, or is not a 'value' node");
        }
    }

    public final void startAnimatingNode(int animationId, int animatedNodeTag, ReadableMap animationConfig, Callback endCallback) {
        AnimationDriver frameBasedAnimationDriver;
        AbstractC2855l.g(animationConfig, "animationConfig");
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + animatedNodeTag + "] does not exist");
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + animatedNodeTag + "] should be of type " + ValueAnimatedNode.class.getName());
        }
        AnimationDriver animationDriver = this.activeAnimations.get(animationId);
        if (animationDriver != null) {
            animationDriver.resetConfig(animationConfig);
            return;
        }
        String string = animationConfig.getString(NotificationsService.EVENT_TYPE_KEY);
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1266514778) {
                if (iHashCode != -895679987) {
                    if (iHashCode == 95459258 && string.equals("decay")) {
                        frameBasedAnimationDriver = new DecayAnimation(animationConfig);
                        frameBasedAnimationDriver.id = animationId;
                        frameBasedAnimationDriver.endCallback = endCallback;
                        frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                        this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                        return;
                    }
                } else if (string.equals("spring")) {
                    frameBasedAnimationDriver = new SpringAnimation(animationConfig);
                    frameBasedAnimationDriver.id = animationId;
                    frameBasedAnimationDriver.endCallback = endCallback;
                    frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                    this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                    return;
                }
            } else if (string.equals("frames")) {
                frameBasedAnimationDriver = new FrameBasedAnimationDriver(animationConfig);
                frameBasedAnimationDriver.id = animationId;
                frameBasedAnimationDriver.endCallback = endCallback;
                frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + animatedNodeTag + "]: " + string);
    }

    public final void startListeningToAnimatedNodeValue(int tag, AnimatedNodeValueListener listener) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).setValueListener(listener);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + tag + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r3 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r12 = r11.reactApplicationContext;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r12 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        r12.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void stopAnimation(int animationId) {
        int size = this.activeAnimations.size();
        int i10 = 0;
        while (true) {
            WritableArray writableArrayCreateArray = null;
            if (i10 >= size) {
                break;
            }
            AnimationDriver animationDriverValueAt = this.activeAnimations.valueAt(i10);
            if (animationDriverValueAt.id == animationId) {
                if (animationDriverValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("finished", false);
                    ValueAnimatedNode valueAnimatedNode = animationDriverValueAt.animatedValue;
                    if (valueAnimatedNode == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder.put("value", valueAnimatedNode.nodeValue);
                    ValueAnimatedNode valueAnimatedNode2 = animationDriverValueAt.animatedValue;
                    if (valueAnimatedNode2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder.put("offset", valueAnimatedNode2.offset);
                    Callback callback = animationDriverValueAt.endCallback;
                    if (callback == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    callback.invoke(writableMapCreateMap);
                } else if (this.reactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                    readableMapBuilder2.put("animationId", animationDriverValueAt.id);
                    readableMapBuilder2.put("finished", false);
                    ValueAnimatedNode valueAnimatedNode3 = animationDriverValueAt.animatedValue;
                    if (valueAnimatedNode3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder2.put("value", valueAnimatedNode3.nodeValue);
                    ValueAnimatedNode valueAnimatedNode4 = animationDriverValueAt.animatedValue;
                    if (valueAnimatedNode4 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder2.put("offset", valueAnimatedNode4.offset);
                    writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.activeAnimations.removeAt(i10);
            } else {
                i10++;
            }
        }
    }

    public final void stopListeningToAnimatedNodeValue(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).setValueListener(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + tag + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateAnimatedNodeConfig(int tag, ReadableMap config) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == 0) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + tag + "] does not exist");
        }
        if (animatedNode instanceof AnimatedNodeWithUpdateableConfig) {
            stopAnimationsForNode(animatedNode);
            ((AnimatedNodeWithUpdateableConfig) animatedNode).onUpdateConfig(config);
            this.updatedNodes.put(tag, animatedNode);
        }
    }
}
