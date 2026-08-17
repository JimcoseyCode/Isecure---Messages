package com.facebook.react.animated;

import androidx.camera.view.i;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import i7.C2735B;
import i7.C2750m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "NativeAnimatedModule")
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\b\r*\u0001v\b\u0007\u0018\u0000 ~2\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u007f\u0080\u0001\u0081\u0001~B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0010J\u001f\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b5\u0010.J\u0017\u00106\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b6\u0010.J/\u0010<\u001a\u00020\n2\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020(2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\n2\u0006\u00107\u001a\u00020&H\u0016¢\u0006\u0004\b>\u0010.J\u001f\u0010A\u001a\u00020\n2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&H\u0016¢\u0006\u0004\bA\u00103J\u001f\u0010B\u001a\u00020\n2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&H\u0016¢\u0006\u0004\bB\u00103J\u001f\u0010D\u001a\u00020\n2\u0006\u00108\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0016¢\u0006\u0004\bD\u00103J\u001f\u0010E\u001a\u00020\n2\u0006\u00108\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0016¢\u0006\u0004\bE\u00103J\u0017\u0010F\u001a\u00020\n2\u0006\u00108\u001a\u00020&H\u0016¢\u0006\u0004\bF\u0010.J'\u0010J\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020(H\u0016¢\u0006\u0004\bJ\u0010KJ'\u0010M\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020&H\u0016¢\u0006\u0004\bR\u0010.J\u001f\u0010U\u001a\u00020\n2\u0006\u0010S\u001a\u00020&2\u0006\u0010T\u001a\u00020:H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010\u0010J\u0017\u0010Z\u001a\u00020\n2\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0016\u0010n\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010iR\u0016\u0010o\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u001c\u0010p\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bp\u0010q\u0012\u0004\br\u0010\u0010R\u0016\u0010s\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010t\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010qR\u0016\u0010u\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010iR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR(\u0010y\u001a\u0004\u0018\u00010d2\b\u0010y\u001a\u0004\u0018\u00010d8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}¨\u0006\u0082\u0001"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule;", "Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "operation", "Li7/B;", "addOperation", "(Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;)V", "addUnbatchedOperation", "addPreOperation", "clearFrameCallback", "()V", "enqueueFrameCallback", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewTag", "initializeLifecycleEventListenersForViewTag", "(I)V", "decrementInFlightAnimationsForViewTag", "userDrivenScrollEnded", "initialize", "onHostResume", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "didScheduleMountItems", "(Lcom/facebook/react/bridge/UIManager;)V", "willMountItems", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "onHostPause", "onHostDestroy", "startOperationBatch", "finishOperationBatch", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tagDouble", "Lcom/facebook/react/bridge/ReadableMap;", "config", "createAnimatedNode", "(DLcom/facebook/react/bridge/ReadableMap;)V", "updateAnimatedNodeConfig", "startListeningToAnimatedNodeValue", "(D)V", "stopListeningToAnimatedNodeValue", "dropAnimatedNode", "value", "setAnimatedNodeValue", "(DD)V", "setAnimatedNodeOffset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "animationIdDouble", "animatedNodeTagDouble", "animationConfig", "Lcom/facebook/react/bridge/Callback;", "endCallback", "startAnimatingNode", "(DDLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "stopAnimation", "parentNodeTagDouble", "childNodeTagDouble", "connectAnimatedNodes", "disconnectAnimatedNodes", "viewTagDouble", "connectAnimatedNodeToView", "disconnectAnimatedNodeFromView", "restoreDefaultValues", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventName", "eventMapping", "addAnimatedEventToView", "(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "animatedValueTagDouble", "removeAnimatedEventFromView", "(DLjava/lang/String;D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "animatedValueNodeTagDouble", "callback", "getValue", "(DLcom/facebook/react/bridge/Callback;)V", "invalidate", "Lcom/facebook/react/bridge/ReadableArray;", "opsAndArgs", "queueAndExecuteBatchedOperations", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/modules/core/ReactChoreographer;", "reactChoreographer", "Lcom/facebook/react/modules/core/ReactChoreographer;", "Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;", "operations", "Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;", "preOperations", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "nodesManagerRef", "Ljava/util/concurrent/atomic/AtomicReference;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "batchingControlledByJS", "Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "currentFrameNumber", "J", "currentBatchNumber", "initializedForFabric", "initializedForNonFabric", "uiManagerType", "I", "getUiManagerType$annotations", "numFabricAnimations", "numNonFabricAnimations", "enqueuedAnimationOnFrame", "com/facebook/react/animated/NativeAnimatedModule$animatedFrameCallback$1", "animatedFrameCallback", "Lcom/facebook/react/animated/NativeAnimatedModule$animatedFrameCallback$1;", "nodesManager", "getNodesManager", "()Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "setNodesManager", "(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "Companion", "BatchExecutionOpCodes", "UIThreadOperation", "ConcurrentOperationQueue", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public static final String NAME = "NativeAnimatedModule";
    private final NativeAnimatedModule$animatedFrameCallback$1 animatedFrameCallback;
    private boolean batchingControlledByJS;
    private volatile long currentBatchNumber;
    private volatile long currentFrameNumber;
    private boolean enqueuedAnimationOnFrame;
    private boolean initializedForFabric;
    private boolean initializedForNonFabric;
    private final AtomicReference<NativeAnimatedNodesManager> nodesManagerRef;
    private int numFabricAnimations;
    private int numNonFabricAnimations;
    private final ConcurrentOperationQueue operations;
    private final ConcurrentOperationQueue preOperations;
    private final ReactChoreographer reactChoreographer;
    private int uiManagerType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0082\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;II)V", "OP_CODE_CREATE_ANIMATED_NODE", "OP_CODE_UPDATE_ANIMATED_NODE_CONFIG", "OP_CODE_GET_VALUE", "OP_START_LISTENING_TO_ANIMATED_NODE_VALUE", "OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE", "OP_CODE_CONNECT_ANIMATED_NODES", "OP_CODE_DISCONNECT_ANIMATED_NODES", "OP_CODE_START_ANIMATING_NODE", "OP_CODE_STOP_ANIMATION", "OP_CODE_SET_ANIMATED_NODE_VALUE", "OP_CODE_SET_ANIMATED_NODE_OFFSET", "OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET", "OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET", "OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW", "OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW", "OP_CODE_RESTORE_DEFAULT_VALUES", "OP_CODE_DROP_ANIMATED_NODE", "OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW", "OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW", "OP_CODE_ADD_LISTENER", "OP_CODE_REMOVE_LISTENERS", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class BatchExecutionOpCodes {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BatchExecutionOpCodes[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static BatchExecutionOpCodes[] valueMap;
        public static final BatchExecutionOpCodes OP_CODE_CREATE_ANIMATED_NODE = new BatchExecutionOpCodes("OP_CODE_CREATE_ANIMATED_NODE", 0, 1);
        public static final BatchExecutionOpCodes OP_CODE_UPDATE_ANIMATED_NODE_CONFIG = new BatchExecutionOpCodes("OP_CODE_UPDATE_ANIMATED_NODE_CONFIG", 1, 2);
        public static final BatchExecutionOpCodes OP_CODE_GET_VALUE = new BatchExecutionOpCodes("OP_CODE_GET_VALUE", 2, 3);
        public static final BatchExecutionOpCodes OP_START_LISTENING_TO_ANIMATED_NODE_VALUE = new BatchExecutionOpCodes("OP_START_LISTENING_TO_ANIMATED_NODE_VALUE", 3, 4);
        public static final BatchExecutionOpCodes OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE = new BatchExecutionOpCodes("OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE", 4, 5);
        public static final BatchExecutionOpCodes OP_CODE_CONNECT_ANIMATED_NODES = new BatchExecutionOpCodes("OP_CODE_CONNECT_ANIMATED_NODES", 5, 6);
        public static final BatchExecutionOpCodes OP_CODE_DISCONNECT_ANIMATED_NODES = new BatchExecutionOpCodes("OP_CODE_DISCONNECT_ANIMATED_NODES", 6, 7);
        public static final BatchExecutionOpCodes OP_CODE_START_ANIMATING_NODE = new BatchExecutionOpCodes("OP_CODE_START_ANIMATING_NODE", 7, 8);
        public static final BatchExecutionOpCodes OP_CODE_STOP_ANIMATION = new BatchExecutionOpCodes("OP_CODE_STOP_ANIMATION", 8, 9);
        public static final BatchExecutionOpCodes OP_CODE_SET_ANIMATED_NODE_VALUE = new BatchExecutionOpCodes("OP_CODE_SET_ANIMATED_NODE_VALUE", 9, 10);
        public static final BatchExecutionOpCodes OP_CODE_SET_ANIMATED_NODE_OFFSET = new BatchExecutionOpCodes("OP_CODE_SET_ANIMATED_NODE_OFFSET", 10, 11);
        public static final BatchExecutionOpCodes OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET = new BatchExecutionOpCodes("OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET", 11, 12);
        public static final BatchExecutionOpCodes OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET = new BatchExecutionOpCodes("OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET", 12, 13);
        public static final BatchExecutionOpCodes OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW = new BatchExecutionOpCodes("OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW", 13, 14);
        public static final BatchExecutionOpCodes OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW = new BatchExecutionOpCodes("OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW", 14, 15);
        public static final BatchExecutionOpCodes OP_CODE_RESTORE_DEFAULT_VALUES = new BatchExecutionOpCodes("OP_CODE_RESTORE_DEFAULT_VALUES", 15, 16);
        public static final BatchExecutionOpCodes OP_CODE_DROP_ANIMATED_NODE = new BatchExecutionOpCodes("OP_CODE_DROP_ANIMATED_NODE", 16, 17);
        public static final BatchExecutionOpCodes OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW = new BatchExecutionOpCodes("OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW", 17, 18);
        public static final BatchExecutionOpCodes OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW = new BatchExecutionOpCodes("OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW", 18, 19);
        public static final BatchExecutionOpCodes OP_CODE_ADD_LISTENER = new BatchExecutionOpCodes("OP_CODE_ADD_LISTENER", 19, 20);
        public static final BatchExecutionOpCodes OP_CODE_REMOVE_LISTENERS = new BatchExecutionOpCodes("OP_CODE_REMOVE_LISTENERS", 20, 21);

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "valueMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", "[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", "fromId", "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BatchExecutionOpCodes fromId(int id) {
                BatchExecutionOpCodes[] batchExecutionOpCodesArrValues = BatchExecutionOpCodes.valueMap;
                if (batchExecutionOpCodesArrValues == null) {
                    batchExecutionOpCodesArrValues = BatchExecutionOpCodes.values();
                }
                if (BatchExecutionOpCodes.valueMap == null) {
                    BatchExecutionOpCodes.valueMap = batchExecutionOpCodesArrValues;
                }
                return batchExecutionOpCodesArrValues[id - 1];
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ BatchExecutionOpCodes[] $values() {
            return new BatchExecutionOpCodes[]{OP_CODE_CREATE_ANIMATED_NODE, OP_CODE_UPDATE_ANIMATED_NODE_CONFIG, OP_CODE_GET_VALUE, OP_START_LISTENING_TO_ANIMATED_NODE_VALUE, OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE, OP_CODE_CONNECT_ANIMATED_NODES, OP_CODE_DISCONNECT_ANIMATED_NODES, OP_CODE_START_ANIMATING_NODE, OP_CODE_STOP_ANIMATION, OP_CODE_SET_ANIMATED_NODE_VALUE, OP_CODE_SET_ANIMATED_NODE_OFFSET, OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET, OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET, OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW, OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW, OP_CODE_RESTORE_DEFAULT_VALUES, OP_CODE_DROP_ANIMATED_NODE, OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW, OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW, OP_CODE_ADD_LISTENER, OP_CODE_REMOVE_LISTENERS};
        }

        static {
            BatchExecutionOpCodes[] batchExecutionOpCodesArr$values = $values();
            $VALUES = batchExecutionOpCodesArr$values;
            $ENTRIES = AbstractC3083a.a(batchExecutionOpCodesArr$values);
            INSTANCE = new Companion(null);
        }

        private BatchExecutionOpCodes(String str, int i10, int i11) {
        }

        public static final BatchExecutionOpCodes fromId(int i10) {
            return INSTANCE.fromId(i10);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BatchExecutionOpCodes valueOf(String str) {
            return (BatchExecutionOpCodes) Enum.valueOf(BatchExecutionOpCodes.class, str);
        }

        public static BatchExecutionOpCodes[] values() {
            return (BatchExecutionOpCodes[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u000e\u0012\b\u0012\u00060\u0004R\u00020\u0005\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lcom/facebook/react/animated/NativeAnimatedModule;)V", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "Lcom/facebook/react/animated/NativeAnimatedModule;", "operation", "Li7/B;", "add", "(Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "maxBatchNumber", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "nodesManager", "executeBatch", "(JLcom/facebook/react/animated/NativeAnimatedNodesManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "drainQueueIntoList", "(J)Ljava/util/List;", "Ljava/util/Queue;", "queue", "Ljava/util/Queue;", "peekedOperation", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isEmpty", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class ConcurrentOperationQueue {
        private UIThreadOperation peekedOperation;
        private final Queue<UIThreadOperation> queue = new ConcurrentLinkedQueue();

        public ConcurrentOperationQueue() {
        }

        public final void add(UIThreadOperation operation) {
            AbstractC2855l.g(operation, "operation");
            this.queue.add(operation);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029 A[EDGE_INSN: B:22:0x0029->B:14:0x0029 BREAK  A[LOOP:0: B:6:0x000d->B:19:0x0035], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<UIThreadOperation> drainQueueIntoList(long maxBatchNumber) {
            UIThreadOperation uIThreadOperationPoll;
            if (isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                UIThreadOperation uIThreadOperation = this.peekedOperation;
                if (uIThreadOperation == null) {
                    uIThreadOperationPoll = this.queue.poll();
                    if (uIThreadOperationPoll != null) {
                        break;
                    }
                    if (uIThreadOperationPoll.getBatchNumber() > maxBatchNumber) {
                        this.peekedOperation = uIThreadOperationPoll;
                        return arrayList;
                    }
                    arrayList.add(uIThreadOperationPoll);
                } else {
                    if (uIThreadOperation.getBatchNumber() > maxBatchNumber) {
                        break;
                    }
                    arrayList.add(uIThreadOperation);
                    this.peekedOperation = null;
                    uIThreadOperationPoll = this.queue.poll();
                    if (uIThreadOperationPoll != null) {
                    }
                }
            }
            return arrayList;
        }

        public final void executeBatch(long maxBatchNumber, NativeAnimatedNodesManager nodesManager) {
            List<UIThreadOperation> listDrainQueueIntoList = drainQueueIntoList(maxBatchNumber);
            if (listDrainQueueIntoList != null) {
                for (UIThreadOperation uIThreadOperation : listDrainQueueIntoList) {
                    if (nodesManager == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    uIThreadOperation.execute(nodesManager);
                }
            }
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty() && this.peekedOperation == null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lcom/facebook/react/animated/NativeAnimatedModule;)V", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "animatedNodesManager", "Li7/B;", "execute", "(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "batchNumber", "J", "getBatchNumber", "()J", "setBatchNumber", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private abstract class UIThreadOperation {
        private long batchNumber = -1;

        public UIThreadOperation() {
        }

        public abstract void execute(NativeAnimatedNodesManager animatedNodesManager);

        public final long getBatchNumber() {
            return this.batchNumber;
        }

        public final void setBatchNumber(long j10) {
            this.batchNumber = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BatchExecutionOpCodes.values().length];
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$queueAndExecuteBatchedOperations$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "Lcom/facebook/react/animated/NativeAnimatedModule;", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "animatedNodesManager", "Li7/B;", "execute", "(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C20001 extends UIThreadOperation {
        final /* synthetic */ int $opBufferSize;
        final /* synthetic */ ReadableArray $opsAndArgs;

        /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$queueAndExecuteBatchedOperations$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BatchExecutionOpCodes.values().length];
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_GET_VALUE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_START_ANIMATING_NODE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_STOP_ANIMATION.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_ADD_LISTENER.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_LISTENERS.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C20001(int i10, ReadableArray readableArray) {
            super();
            this.$opBufferSize = i10;
            this.$opsAndArgs = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$1(NativeAnimatedModule nativeAnimatedModule, int i10, double d10, double d11) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("tag", i10);
            readableMapBuilder.put("value", d10);
            readableMapBuilder.put("offset", d11);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
            }
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager animatedNodesManager) {
            AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i10 = 0;
            while (i10 < this.$opBufferSize) {
                int i11 = i10 + 1;
                switch (WhenMappings.$EnumSwitchMapping$0[BatchExecutionOpCodes.INSTANCE.fromId(this.$opsAndArgs.getInt(i10)).ordinal()]) {
                    case 1:
                        int i12 = i10 + 2;
                        int i13 = this.$opsAndArgs.getInt(i11);
                        i10 += 3;
                        ReadableMap map = this.$opsAndArgs.getMap(i12);
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.createAnimatedNode(i13, map);
                        break;
                        break;
                    case 2:
                        int i14 = i10 + 2;
                        int i15 = this.$opsAndArgs.getInt(i11);
                        i10 += 3;
                        ReadableMap map2 = this.$opsAndArgs.getMap(i14);
                        if (map2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.updateAnimatedNodeConfig(i15, map2);
                        break;
                        break;
                    case 3:
                        i10 += 2;
                        animatedNodesManager.getValue(this.$opsAndArgs.getInt(i11), null);
                        break;
                    case 4:
                        i10 += 2;
                        final int i16 = this.$opsAndArgs.getInt(i11);
                        final NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
                        animatedNodesManager.startListeningToAnimatedNodeValue(i16, new AnimatedNodeValueListener() { // from class: com.facebook.react.animated.e
                            @Override // com.facebook.react.animated.AnimatedNodeValueListener
                            public final void onValueUpdate(double d10, double d11) {
                                NativeAnimatedModule.C20001.execute$lambda$1(nativeAnimatedModule, i16, d10, d11);
                            }
                        });
                        break;
                    case 5:
                        i10 += 2;
                        animatedNodesManager.stopListeningToAnimatedNodeValue(this.$opsAndArgs.getInt(i11));
                        break;
                    case 6:
                        int i17 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.connectAnimatedNodes(this.$opsAndArgs.getInt(i11), this.$opsAndArgs.getInt(i17));
                        break;
                    case 7:
                        int i18 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.disconnectAnimatedNodes(this.$opsAndArgs.getInt(i11), this.$opsAndArgs.getInt(i18));
                        break;
                    case 8:
                        int i19 = this.$opsAndArgs.getInt(i11);
                        int i20 = i10 + 3;
                        int i21 = this.$opsAndArgs.getInt(i10 + 2);
                        i10 += 4;
                        ReadableMap map3 = this.$opsAndArgs.getMap(i20);
                        if (map3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.startAnimatingNode(i19, i21, map3, null);
                        break;
                        break;
                    case 9:
                        i10 += 2;
                        animatedNodesManager.stopAnimation(this.$opsAndArgs.getInt(i11));
                        break;
                    case 10:
                        int i22 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.setAnimatedNodeValue(this.$opsAndArgs.getInt(i11), this.$opsAndArgs.getDouble(i22));
                        break;
                    case 11:
                        int i23 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.setAnimatedNodeOffset(this.$opsAndArgs.getInt(i11), this.$opsAndArgs.getDouble(i23));
                        break;
                    case 12:
                        i10 += 2;
                        animatedNodesManager.flattenAnimatedNodeOffset(this.$opsAndArgs.getInt(i11));
                        break;
                    case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                        i10 += 2;
                        animatedNodesManager.extractAnimatedNodeOffset(this.$opsAndArgs.getInt(i11));
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                        int i24 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.connectAnimatedNodeToView(this.$opsAndArgs.getInt(i11), this.$opsAndArgs.getInt(i24));
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                        int i25 = i10 + 2;
                        int i26 = this.$opsAndArgs.getInt(i11);
                        i10 += 3;
                        int i27 = this.$opsAndArgs.getInt(i25);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i27);
                        animatedNodesManager.disconnectAnimatedNodeFromView(i26, i27);
                        break;
                    case 16:
                        i10 += 2;
                        animatedNodesManager.restoreDefaultValues(this.$opsAndArgs.getInt(i11));
                        break;
                    case 17:
                        i10 += 2;
                        animatedNodesManager.dropAnimatedNode(this.$opsAndArgs.getInt(i11));
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                        int i28 = this.$opsAndArgs.getInt(i11);
                        int i29 = i10 + 3;
                        String string = this.$opsAndArgs.getString(i10 + 2);
                        if (string == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i10 += 4;
                        ReadableMap map4 = this.$opsAndArgs.getMap(i29);
                        if (map4 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.addAnimatedEventToView(i28, string, map4);
                        break;
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        int i30 = this.$opsAndArgs.getInt(i11);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i30);
                        int i31 = i10 + 3;
                        String string2 = this.$opsAndArgs.getString(i10 + 2);
                        if (string2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i10 += 4;
                        animatedNodesManager.removeAnimatedEventFromView(i30, string2, this.$opsAndArgs.getInt(i31));
                        break;
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        i10 += 2;
                        break;
                    default:
                        throw new C2750m();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.react.animated.NativeAnimatedModule$animatedFrameCallback$1] */
    public NativeAnimatedModule(final ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.reactChoreographer = ReactChoreographer.INSTANCE.getInstance();
        this.operations = new ConcurrentOperationQueue();
        this.preOperations = new ConcurrentOperationQueue();
        this.nodesManagerRef = new AtomicReference<>();
        this.uiManagerType = 1;
        this.animatedFrameCallback = new GuardedFrameCallback(reactContext) { // from class: com.facebook.react.animated.NativeAnimatedModule$animatedFrameCallback$1
            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            protected void doFrameGuarded(long frameTimeNanos) {
                try {
                    this.enqueuedAnimationOnFrame = false;
                    NativeAnimatedNodesManager nodesManager = this.getNodesManager();
                    if (nodesManager == null) {
                        return;
                    }
                    if (nodesManager.hasActiveAnimations()) {
                        nodesManager.runUpdates(frameTimeNanos);
                    }
                    this.enqueueFrameCallback();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        };
    }

    private final void addOperation(UIThreadOperation operation) {
        operation.setBatchNumber(this.currentBatchNumber);
        this.operations.add(operation);
    }

    private final void addPreOperation(UIThreadOperation operation) {
        operation.setBatchNumber(this.currentBatchNumber);
        this.preOperations.add(operation);
    }

    private final void addUnbatchedOperation(UIThreadOperation operation) {
        operation.setBatchNumber(-1L);
        this.operations.add(operation);
    }

    private final void clearFrameCallback() {
        this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementInFlightAnimationsForViewTag(int viewTag) {
        if (ViewUtil.getUIManagerType(viewTag) == 2) {
            this.numFabricAnimations--;
        } else {
            this.numNonFabricAnimations--;
        }
        int i10 = this.numNonFabricAnimations;
        if (i10 == 0 && this.numFabricAnimations > 0 && this.uiManagerType != 2) {
            this.uiManagerType = 2;
        } else {
            if (this.numFabricAnimations != 0 || i10 <= 0 || this.uiManagerType == 1) {
                return;
            }
            this.uiManagerType = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueFrameCallback() {
        if (this.enqueuedAnimationOnFrame) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = true;
    }

    private final void initializeLifecycleEventListenersForViewTag(int viewTag) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        UIManager uIManager;
        int uIManagerType = ViewUtil.getUIManagerType(viewTag);
        this.uiManagerType = uIManagerType;
        if (uIManagerType == 2) {
            this.numFabricAnimations++;
        } else {
            this.numNonFabricAnimations++;
        }
        NativeAnimatedNodesManager nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.initializeEventListenerForUIManagerType(this.uiManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedModule", new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if ((this.uiManagerType == 2 ? this.initializedForFabric : this.initializedForNonFabric) || (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) == null || (uIManager = UIManagerHelper.getUIManager(reactApplicationContextIfActiveOrWarn, this.uiManagerType)) == null) {
            return;
        }
        uIManager.addUIManagerEventListener(this);
        if (this.uiManagerType == 2) {
            this.initializedForFabric = true;
        } else {
            this.initializedForNonFabric = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startListeningToAnimatedNodeValue$lambda$6(NativeAnimatedModule nativeAnimatedModule, int i10, double d10, double d11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", i10);
        readableMapBuilder.put("value", d10);
        readableMapBuilder.put("offset", d11);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B userDrivenScrollEnded$lambda$2$lambda$1(Set set, ReadableArrayBuilder putArray) {
        AbstractC2855l.g(putArray, "$this$putArray");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            putArray.add(((Number) it.next()).intValue());
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void willDispatchViewUpdates$lambda$3(NativeAnimatedModule nativeAnimatedModule, long j10, NativeViewHierarchyManager it) {
        AbstractC2855l.g(it, "it");
        nativeAnimatedModule.preOperations.executeBatch(j10, nativeAnimatedModule.getNodesManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void willDispatchViewUpdates$lambda$4(NativeAnimatedModule nativeAnimatedModule, long j10, NativeViewHierarchyManager it) {
        AbstractC2855l.g(it, "it");
        nativeAnimatedModule.operations.executeBatch(j10, nativeAnimatedModule.getNodesManager());
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double viewTagDouble, final String eventName, final ReadableMap eventMapping) {
        AbstractC2855l.g(eventName, "eventName");
        AbstractC2855l.g(eventMapping, "eventMapping");
        final int i10 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.addAnimatedEventToView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.addAnimatedEventToView(i10, eventName, eventMapping);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String eventName) {
        AbstractC2855l.g(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double animatedNodeTagDouble, double viewTagDouble) {
        final int i10 = (int) animatedNodeTagDouble;
        final int i11 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i11);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.connectAnimatedNodeToView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.connectAnimatedNodeToView(i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        final int i10 = (int) parentNodeTagDouble;
        final int i11 = (int) childNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.connectAnimatedNodes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.connectAnimatedNodes(i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double tagDouble, final ReadableMap config) {
        AbstractC2855l.g(config, "config");
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.createAnimatedNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.createAnimatedNode(i10, config);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        if (this.uiManagerType != 2) {
            return;
        }
        long j10 = this.currentBatchNumber - 1;
        if (!this.batchingControlledByJS) {
            this.currentFrameNumber++;
            if (this.currentFrameNumber - this.currentBatchNumber > 2) {
                this.currentBatchNumber = this.currentFrameNumber;
                j10 = this.currentBatchNumber;
            }
        }
        this.preOperations.executeBatch(j10, getNodesManager());
        this.operations.executeBatch(j10, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        this.currentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double animatedNodeTagDouble, double viewTagDouble) {
        final int i10 = (int) animatedNodeTagDouble;
        final int i11 = (int) viewTagDouble;
        decrementInFlightAnimationsForViewTag(i11);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.disconnectAnimatedNodeFromView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.disconnectAnimatedNodeFromView(i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        final int i10 = (int) parentNodeTagDouble;
        final int i11 = (int) childNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.disconnectAnimatedNodes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.disconnectAnimatedNodes(i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.dropAnimatedNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.dropAnimatedNode(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.extractAnimatedNodeOffset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.extractAnimatedNodeOffset(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.batchingControlledByJS = false;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.flattenAnimatedNodeOffset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.flattenAnimatedNodeOffset(i10);
            }
        });
    }

    public final NativeAnimatedNodesManager getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.nodesManagerRef.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            i.a(this.nodesManagerRef, null, new NativeAnimatedNodesManager(reactApplicationContextIfActiveOrWarn));
        }
        return this.nodesManagerRef.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double animatedValueNodeTagDouble, final Callback callback) {
        AbstractC2855l.g(callback, "callback");
        final int i10 = (int) animatedValueNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.getValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.getValue(i10, callback);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray opsAndArgs) {
        AbstractC2855l.g(opsAndArgs, "opsAndArgs");
        int size = opsAndArgs.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            switch (WhenMappings.$EnumSwitchMapping$0[BatchExecutionOpCodes.INSTANCE.fromId(opsAndArgs.getInt(i10)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i10 += 2;
                    continue;
                case 11:
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case 17:
                    i10 += 3;
                    continue;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    int i12 = i10 + 2;
                    i10 += 3;
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i12));
                    continue;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i11));
                    break;
                default:
                    throw new C2750m();
            }
            i10 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new C20001(size, opsAndArgs));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double viewTagDouble, final String eventName, double animatedValueTagDouble) {
        AbstractC2855l.g(eventName, "eventName");
        final int i10 = (int) viewTagDouble;
        final int i11 = (int) animatedValueTagDouble;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.removeAnimatedEventFromView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.removeAnimatedEventFromView(i10, eventName, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double animatedNodeTagDouble) {
        final int i10 = (int) animatedNodeTagDouble;
        addPreOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.restoreDefaultValues.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.restoreDefaultValues(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double tagDouble, final double value) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.setAnimatedNodeOffset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.setAnimatedNodeOffset(i10, value);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double tagDouble, final double value) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.setAnimatedNodeValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.setAnimatedNodeValue(i10, value);
            }
        });
    }

    @VisibleForTesting
    public final void setNodesManager(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.nodesManagerRef.set(nativeAnimatedNodesManager);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double animationIdDouble, double animatedNodeTagDouble, final ReadableMap animationConfig, final Callback endCallback) {
        AbstractC2855l.g(animationConfig, "animationConfig");
        AbstractC2855l.g(endCallback, "endCallback");
        final int i10 = (int) animationIdDouble;
        final int i11 = (int) animatedNodeTagDouble;
        addUnbatchedOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.startAnimatingNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.startAnimatingNode(i10, i11, animationConfig, endCallback);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double tagDouble) {
        final int i10 = (int) tagDouble;
        final AnimatedNodeValueListener animatedNodeValueListener = new AnimatedNodeValueListener() { // from class: com.facebook.react.animated.a
            @Override // com.facebook.react.animated.AnimatedNodeValueListener
            public final void onValueUpdate(double d10, double d11) {
                NativeAnimatedModule.startListeningToAnimatedNodeValue$lambda$6(this.f20269a, i10, d10, d11);
            }
        };
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.startListeningToAnimatedNodeValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.startListeningToAnimatedNodeValue(i10, animatedNodeValueListener);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.batchingControlledByJS = true;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double animationIdDouble) {
        final int i10 = (int) animationIdDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.stopAnimation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.stopAnimation(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double tagDouble) {
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.stopListeningToAnimatedNodeValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.stopListeningToAnimatedNodeValue(i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double tagDouble, final ReadableMap config) {
        AbstractC2855l.g(config, "config");
        final int i10 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.updateAnimatedNodeConfig.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                AbstractC2855l.g(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.updateAnimatedNodeConfig(i10, config);
            }
        });
    }

    public final void userDrivenScrollEnded(int viewTag) {
        NativeAnimatedNodesManager nativeAnimatedNodesManager = this.nodesManagerRef.get();
        if (nativeAnimatedNodesManager == null) {
            return;
        }
        final Set<Integer> tagsOfConnectedNodes$ReactAndroid_release = nativeAnimatedNodesManager.getTagsOfConnectedNodes$ReactAndroid_release(viewTag, "topScrollEnded");
        if (tagsOfConnectedNodes$ReactAndroid_release.isEmpty()) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        new ReadableMapBuilder(writableMapCreateMap).putArray("tags", new Function1() { // from class: com.facebook.react.animated.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAnimatedModule.userDrivenScrollEnded$lambda$2$lambda$1(tagsOfConnectedNodes$ReactAndroid_release, (ReadableArrayBuilder) obj);
            }
        });
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
        if ((this.operations.isEmpty() && this.preOperations.isEmpty()) || this.uiManagerType == 2 || ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return;
        }
        final long j10 = this.currentBatchNumber;
        this.currentBatchNumber = 1 + j10;
        UIBlock uIBlock = new UIBlock() { // from class: com.facebook.react.animated.c
            @Override // com.facebook.react.uimanager.UIBlock
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NativeAnimatedModule.willDispatchViewUpdates$lambda$3(this.f20272a, j10, nativeViewHierarchyManager);
            }
        };
        UIBlock uIBlock2 = new UIBlock() { // from class: com.facebook.react.animated.d
            @Override // com.facebook.react.uimanager.UIBlock
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NativeAnimatedModule.willDispatchViewUpdates$lambda$4(this.f20274a, j10, nativeViewHierarchyManager);
            }
        };
        UIManagerModule uIManagerModule = (UIManagerModule) uiManager;
        uIManagerModule.prependUIBlock(uIBlock);
        uIManagerModule.addUIBlock(uIBlock2);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        AbstractC2855l.g(uiManager, "uiManager");
    }

    private static /* synthetic */ void getUiManagerType$annotations() {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double count) {
    }
}
