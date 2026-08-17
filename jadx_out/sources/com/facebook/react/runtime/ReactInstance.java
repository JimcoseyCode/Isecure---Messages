package com.facebook.react.runtime;

import B3.b;
import android.content.res.AssetManager;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.jni.HybridData;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.FabricUIManagerBinding;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.internal.AndroidChoreographerProvider;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.ComponentNameResolver;
import com.facebook.react.uimanager.ComponentNameResolverBinding;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.UIManagerModuleConstantsHelper;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewManagerResolver;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.util.RNLog;
import com.facebook.soloader.SoLoader;
import d2.AbstractC2325a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u008b\u00012\u00020\u0001:\u0006\u008c\u0001\u008d\u0001\u008b\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\\\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0083 ¢\u0006\u0004\b!\u0010\"J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0082 ¢\u0006\u0004\b'\u0010(J \u0010,\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020#H\u0082 ¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.H\u0082 ¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201H\u0082 ¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204H\u0082 ¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207H\u0082 ¢\u0006\u0004\b8\u00109J \u0010=\u001a\u00020&2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020#H\u0082 ¢\u0006\u0004\b=\u0010>J\u0018\u0010@\u001a\u00020&2\u0006\u0010?\u001a\u00020:H\u0082 ¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020&¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020&2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ%\u0010L\u001a\u00020\f\"\b\b\u0000\u0010I*\u00020H2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J¢\u0006\u0004\bL\u0010MJ'\u0010N\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010I*\u00020H2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J¢\u0006\u0004\bN\u0010OJ!\u0010N\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010I*\u00020H2\u0006\u0010P\u001a\u00020#¢\u0006\u0004\bN\u0010QJ\u0017\u0010T\u001a\u00020&2\u0006\u0010S\u001a\u00020RH\u0007¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020&2\u0006\u0010S\u001a\u00020RH\u0007¢\u0006\u0004\bV\u0010UJ\u0017\u0010W\u001a\u00020&2\u0006\u0010S\u001a\u00020RH\u0007¢\u0006\u0004\bW\u0010UJ\u000f\u0010X\u001a\u00020&H\u0007¢\u0006\u0004\bX\u0010CJ\u0010\u0010Z\u001a\u00020YH\u0086 ¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u000201H\u0086 ¢\u0006\u0004\b\\\u00103J(\u0010a\u001a\u00020&2\u0006\u0010]\u001a\u00020#2\u0006\u0010^\u001a\u00020#2\u0006\u0010`\u001a\u00020_H\u0086 ¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020&H\u0087 ¢\u0006\u0004\bc\u0010CJ\u0015\u0010e\u001a\u00020&2\u0006\u0010d\u001a\u00020:¢\u0006\u0004\be\u0010AJ\u001d\u0010g\u001a\u00020&2\u0006\u0010;\u001a\u00020:2\u0006\u0010f\u001a\u00020#¢\u0006\u0004\bg\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010hR\u001a\u0010i\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bi\u0010j\u0012\u0004\bk\u0010CR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0017\u0010u\u001a\u00020t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010z\u001a\u00020y8\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001a\u0010\u007f\u001a\u00020~8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020H0\u0083\u00018F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0015\u0010\u008a\u0001\u001a\u00030\u0087\u00018F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008e\u0001"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/runtime/BridgelessReactContext;", "context", "Lcom/facebook/react/runtime/ReactHostDelegate;", "delegate", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "exceptionHandler", PointerEventHelper.POINTER_TYPE_UNKNOWN, "useDevSupport", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "reactHostInspectorTarget", "<init>", "(Lcom/facebook/react/runtime/BridgelessReactContext;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)V", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", "jsMessageQueueThread", "nativeModulesMessageQueueThread", "Lcom/facebook/react/modules/core/JavaTimerManager;", "timerManager", "Lcom/facebook/react/runtime/JSTimerExecutor;", "jsTimerExecutor", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;", "jReactExceptionsManager", "Lcom/facebook/react/runtime/BindingsInstaller;", "jBindingsInstaller", "isProfiling", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/runtime/JSTimerExecutor;Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;Lcom/facebook/react/runtime/BindingsInstaller;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)Lcom/facebook/jni/HybridData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fileName", "sourceURL", "Li7/B;", "loadJSBundleFromFile", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/res/AssetManager;", "assetManager", "assetURL", "loadJSBundleFromAssets", "(Landroid/content/res/AssetManager;Ljava/lang/String;)V", "Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "getNativeMethodCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getUnbufferedRuntimeExecutor", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "Lcom/facebook/react/bridge/RuntimeScheduler;", "getRuntimeScheduler", "()Lcom/facebook/react/bridge/RuntimeScheduler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getJavaScriptContext", "()J", PointerEventHelper.POINTER_TYPE_UNKNOWN, "segmentId", "segmentPath", "registerSegmentNative", "(ILjava/lang/String;)V", "pressureLevel", "handleMemoryPressureJs", "(I)V", "initializeEagerTurboModules", "()V", "Lcom/facebook/react/bridge/JSBundleLoader;", "bundleLoader", "loadJSBundle", "(Lcom/facebook/react/bridge/JSBundleLoader;)V", "Lcom/facebook/react/bridge/NativeModule;", "T", "Ljava/lang/Class;", "nativeModuleInterface", "hasNativeModule", "(Ljava/lang/Class;)Z", "getNativeModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "nativeModuleName", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "surface", "prerenderSurface", "(Lcom/facebook/react/runtime/ReactSurfaceImpl;)V", "startSurface", "stopSurface", "destroy", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "getJSCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "getBufferedRuntimeExecutor", "moduleName", "methodName", "Lcom/facebook/react/bridge/NativeArray;", "args", "callFunctionOnModule", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V", "unregisterFromInspector", "level", "handleMemoryPressure", "path", "registerSegment", "Lcom/facebook/react/runtime/BridgelessReactContext;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "turboModuleManager", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "javaTimerManager", "Lcom/facebook/react/modules/core/JavaTimerManager;", "Lcom/facebook/react/runtime/ReactInstance$BridgelessViewManagerResolver;", "viewManagerResolver", "Lcom/facebook/react/runtime/ReactInstance$BridgelessViewManagerResolver;", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "reactQueueConfiguration", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "Lcom/facebook/react/fabric/FabricUIManager;", "getFabricUIManager", "()Lcom/facebook/react/fabric/FabricUIManager;", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "javaScriptContextHolder", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeModules", "()Ljava/util/Collection;", "nativeModules", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Companion", "ReactJsExceptionHandlerImpl", "BridgelessViewManagerResolver", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@FrameworkAPI
@UnstableReactNativeAPI
public final class ReactInstance {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;
    private final BridgelessReactContext context;
    private final FabricUIManager fabricUIManager;
    private final JavaScriptContextHolder javaScriptContextHolder;
    private final JavaTimerManager javaTimerManager;
    private final HybridData mHybridData;
    private final ReactQueueConfiguration reactQueueConfiguration;
    private final TurboModuleManager turboModuleManager;
    private final BridgelessViewManagerResolver viewManagerResolver;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J\u0018\u0010\u0016\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u0012X\u0082.¢\u0006\u0002\n\u0000R%\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u00128F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance$BridgelessViewManagerResolver;", "Lcom/facebook/react/uimanager/ViewManagerResolver;", "reactPackages", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/ReactPackage;", "context", "Lcom/facebook/react/runtime/BridgelessReactContext;", "<init>", "(Ljava/util/List;Lcom/facebook/react/runtime/BridgelessReactContext;)V", "lazyViewManagerMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ViewManager;", "getViewManager", "viewManagerName", "getViewManagerNames", PointerEventHelper.POINTER_TYPE_UNKNOWN, "_eagerViewManagerMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eagerViewManagerMap", "getEagerViewManagerMap", "()Ljava/util/Map;", "getLazyViewManager", "lazyViewManagerNames", "getLazyViewManagerNames", "()Ljava/util/Collection;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class BridgelessViewManagerResolver implements ViewManagerResolver {
        private Map<String, ? extends ViewManager<?, ?>> _eagerViewManagerMap;
        private final BridgelessReactContext context;
        private final Map<String, ViewManager<?, ?>> lazyViewManagerMap;
        private final List<ReactPackage> reactPackages;

        /* JADX WARN: Multi-variable type inference failed */
        public BridgelessViewManagerResolver(List<? extends ReactPackage> reactPackages, BridgelessReactContext context) {
            AbstractC2855l.g(reactPackages, "reactPackages");
            AbstractC2855l.g(context, "context");
            this.reactPackages = reactPackages;
            this.context = context;
            this.lazyViewManagerMap = new HashMap();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final synchronized Map<String, ViewManager<?, ?>> getEagerViewManagerMap() {
            Map map = this._eagerViewManagerMap;
            Map map2 = map;
            if (map != null) {
                if (map == null) {
                    AbstractC2855l.y("_eagerViewManagerMap");
                    map2 = null;
                }
                return map2;
            }
            HashMap map3 = new HashMap();
            for (ReactPackage reactPackage : this.reactPackages) {
                if (!(reactPackage instanceof ViewManagerOnDemandReactPackage)) {
                    for (ViewManager viewManager : reactPackage.createViewManagers(this.context)) {
                        map3.put(viewManager.getName(), viewManager);
                    }
                }
            }
            this._eagerViewManagerMap = map3;
            return map3;
        }

        public final synchronized ViewManager<?, ?> getLazyViewManager(String viewManagerName) {
            ViewManager<?, ?> viewManagerCreateViewManager;
            AbstractC2855l.g(viewManagerName, "viewManagerName");
            if (this.lazyViewManagerMap.containsKey(viewManagerName)) {
                return this.lazyViewManagerMap.get(viewManagerName);
            }
            for (ReactPackage reactPackage : this.reactPackages) {
                if ((reactPackage instanceof ViewManagerOnDemandReactPackage) && (viewManagerCreateViewManager = ((ViewManagerOnDemandReactPackage) reactPackage).createViewManager(this.context, viewManagerName)) != null) {
                    this.lazyViewManagerMap.put(viewManagerName, viewManagerCreateViewManager);
                    return viewManagerCreateViewManager;
                }
            }
            return null;
        }

        public final synchronized Collection<String> getLazyViewManagerNames() {
            HashSet hashSet;
            try {
                hashSet = new HashSet();
                for (ReactPackage reactPackage : this.reactPackages) {
                    if (reactPackage instanceof ViewManagerOnDemandReactPackage) {
                        Collection<String> viewManagerNames = ((ViewManagerOnDemandReactPackage) reactPackage).getViewManagerNames(this.context);
                        if (viewManagerNames == null) {
                            RNLog.w(this.context, "The ReactPackage called: `" + reactPackage.getClass().getSimpleName() + "` is returning null for getViewManagerNames(). This is violating the signature of the method. That method should be updated to return an empty collection.");
                        } else {
                            hashSet.addAll(viewManagerNames);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return hashSet;
        }

        @Override // com.facebook.react.uimanager.ViewManagerResolver
        public ViewManager<?, ?> getViewManager(String viewManagerName) {
            AbstractC2855l.g(viewManagerName, "viewManagerName");
            ViewManager<?, ?> lazyViewManager = getLazyViewManager(viewManagerName);
            return lazyViewManager != null ? lazyViewManager : getEagerViewManagerMap().get(viewManagerName);
        }

        @Override // com.facebook.react.uimanager.ViewManagerResolver
        public Collection<String> getViewManagerNames() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(getLazyViewManagerNames());
            hashSet.addAll(getEagerViewManagerMap().keySet());
            return hashSet;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\u000b\u0012\u0006\b\u0000\u0012\u00020\u000b0\n0\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0002J,\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "createConstants", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagers", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ViewManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "customDirectEvents", "getConstantsForViewManager", "Lcom/facebook/react/bridge/NativeMap;", "viewManager", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Object> createConstants(List<? extends ViewManager> viewManagers, Map<String, Object> customDirectEvents) {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
            B3.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
            try {
                return UIManagerModuleConstantsHelper.internal_createConstants(viewManagers, null, customDirectEvents);
            } finally {
                B3.a.i(0L);
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NativeMap getConstantsForViewManager(ViewManager<?, ?> viewManager, Map<String, Object> customDirectEvents) {
            b.a aVarA = B3.b.a(0L, "ReactInstance.getConstantsForViewManager");
            String name = viewManager.getName();
            AbstractC2855l.f(name, "getName(...)");
            aVarA.b("ViewManager", name).b("Lazy", Boolean.TRUE).c();
            try {
                return Arguments.makeNativeMap((Map<String, ? extends Object>) UIManagerModuleConstantsHelper.internal_createConstantsForViewManager(viewManager, null, null, null, customDirectEvents));
            } finally {
                B3.b.b(0L).c();
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance$ReactJsExceptionHandlerImpl;", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "queueThreadExceptionHandler", "<init>", "(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)V", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;", "errorMap", "Li7/B;", "reportJsException", "(Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;)V", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class ReactJsExceptionHandlerImpl implements ReactJsExceptionHandler {
        private final QueueThreadExceptionHandler queueThreadExceptionHandler;
        final /* synthetic */ ReactInstance this$0;

        public ReactJsExceptionHandlerImpl(ReactInstance reactInstance, QueueThreadExceptionHandler queueThreadExceptionHandler) {
            AbstractC2855l.g(queueThreadExceptionHandler, "queueThreadExceptionHandler");
            this.this$0 = reactInstance;
            this.queueThreadExceptionHandler = queueThreadExceptionHandler;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
        public void reportJsException(ReactJsExceptionHandler.ProcessedError errorMap) {
            AbstractC2855l.g(errorMap, "errorMap");
            JavaOnlyMap javaOnlyMapConvertProcessedError$ReactAndroid_release = StackTraceHelper.convertProcessedError$ReactAndroid_release(errorMap);
            try {
                NativeModule nativeModule = this.this$0.getNativeModule("ExceptionsManager");
                if (nativeModule == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ((NativeExceptionsManagerSpec) nativeModule).reportException(javaOnlyMapConvertProcessedError$ReactAndroid_release);
            } catch (Exception e10) {
                this.queueThreadExceptionHandler.handleException(e10);
            }
        }
    }

    static {
        String simpleName = ReactInstance.class.getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        TAG = simpleName;
        SoLoader.t("rninstance");
    }

    public ReactInstance(BridgelessReactContext context, ReactHostDelegate delegate, ComponentFactory componentFactory, DevSupportManager devSupportManager, QueueThreadExceptionHandler exceptionHandler, boolean z10, ReactHostInspectorTarget reactHostInspectorTarget) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(componentFactory, "componentFactory");
        AbstractC2855l.g(devSupportManager, "devSupportManager");
        AbstractC2855l.g(exceptionHandler, "exceptionHandler");
        this.context = context;
        B3.a.c(0L, "ReactInstance.initialize");
        MessageQueueThreadSpec.Companion companion = MessageQueueThreadSpec.INSTANCE;
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.INSTANCE.create(new ReactQueueConfigurationSpec(companion.newBackgroundThreadSpec("v_native"), companion.newBackgroundThreadSpec("v_js")), exceptionHandler);
        this.reactQueueConfiguration = reactQueueConfigurationImplCreate;
        AbstractC2325a.b(TAG, "Calling initializeMessageQueueThreads()");
        context.initializeMessageQueueThreads(reactQueueConfigurationImplCreate);
        MessageQueueThread jSQueueThread = reactQueueConfigurationImplCreate.getJSQueueThread();
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        ReactChoreographer.Companion companion2 = ReactChoreographer.INSTANCE;
        companion2.initialize(AndroidChoreographerProvider.getInstance());
        devSupportManager.startInspector();
        JSTimerExecutor jSTimerExecutor = new JSTimerExecutor();
        JavaTimerManager javaTimerManager = new JavaTimerManager(context, jSTimerExecutor, companion2.getInstance(), devSupportManager);
        this.javaTimerManager = javaTimerManager;
        this.mHybridData = initHybrid(delegate.getJsRuntimeFactory(), jSQueueThread, nativeModulesQueueThread, javaTimerManager, jSTimerExecutor, new ReactJsExceptionHandlerImpl(this, exceptionHandler), delegate.getBindingsInstaller(), B3.a.j(0L) || InspectorFlags.getIsProfilingBuild(), reactHostInspectorTarget);
        this.javaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
        B3.a.c(0L, "ReactInstance.initialize#initTurboModules");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreReactPackage(context.getDevSupportManager(), context.getDefaultHardwareBackBtnHandler()));
        if (z10) {
            arrayList.add(new DebugCorePackage());
        }
        arrayList.addAll(delegate.getReactPackages());
        ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegateBuild = delegate.getTurboModuleManagerDelegateBuilder().setPackages(arrayList).setReactApplicationContext(context).build();
        RuntimeExecutor unbufferedRuntimeExecutor = getUnbufferedRuntimeExecutor();
        this.turboModuleManager = new TurboModuleManager(unbufferedRuntimeExecutor, reactPackageTurboModuleManagerDelegateBuild, getJSCallInvokerHolder(), getNativeMethodCallInvokerHolder());
        B3.a.i(0L);
        B3.a.c(0L, "ReactInstance.initialize#initFabric");
        BridgelessViewManagerResolver bridgelessViewManagerResolver = new BridgelessViewManagerResolver(arrayList, context);
        this.viewManagerResolver = bridgelessViewManagerResolver;
        ComponentNameResolverBinding.install(unbufferedRuntimeExecutor, new ComponentNameResolver() { // from class: com.facebook.react.runtime.ReactInstance.1
            @Override // com.facebook.react.uimanager.ComponentNameResolver
            public String[] getComponentNames() {
                Collection<String> viewManagerNames = ReactInstance.this.viewManagerResolver.getViewManagerNames();
                if (!viewManagerNames.isEmpty()) {
                    return (String[]) viewManagerNames.toArray(new String[0]);
                }
                AbstractC2325a.m(ReactInstance.TAG, "No ViewManager names found");
                return new String[0];
            }
        });
        if (ReactNativeFeatureFlags.useNativeViewConfigsInBridgelessMode()) {
            final HashMap map = new HashMap();
            UIConstantsProviderBinding.install(unbufferedRuntimeExecutor, new UIConstantsProviderBinding.DefaultEventTypesProvider() { // from class: com.facebook.react.runtime.V
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.DefaultEventTypesProvider
                public final NativeMap getDefaultEventTypes() {
                    return ReactInstance._init_$lambda$0();
                }
            }, new UIConstantsProviderBinding.ConstantsForViewManagerProvider() { // from class: com.facebook.react.runtime.W
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
                public final NativeMap getConstantsForViewManager(String str) {
                    return ReactInstance._init_$lambda$1(this.f20507a, map, str);
                }
            }, new UIConstantsProviderBinding.ConstantsProvider() { // from class: com.facebook.react.runtime.X
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
                public final NativeMap getConstants() {
                    return ReactInstance._init_$lambda$2(this.f20509a, map);
                }
            });
        }
        EventBeatManager eventBeatManager = new EventBeatManager();
        FabricUIManager fabricUIManager = new FabricUIManager(context, new ViewManagerRegistry(bridgelessViewManagerResolver), eventBeatManager);
        this.fabricUIManager = fabricUIManager;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        new FabricUIManagerBinding().register(getBufferedRuntimeExecutor(), getRuntimeScheduler(), fabricUIManager, eventBeatManager, componentFactory);
        fabricUIManager.initialize();
        B3.a.i(0L);
        B3.a.i(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeMap _init_$lambda$0() {
        return Arguments.makeNativeMap((Map<String, ? extends Object>) UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeMap _init_$lambda$1(ReactInstance reactInstance, Map map, String viewManagerName) {
        AbstractC2855l.g(viewManagerName, "viewManagerName");
        ViewManager<?, ?> viewManager = reactInstance.viewManagerResolver.getViewManager(viewManagerName);
        if (viewManager == null) {
            return null;
        }
        return INSTANCE.getConstantsForViewManager(viewManager, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeMap _init_$lambda$2(ReactInstance reactInstance, Map map) {
        Map mapCreateConstants = INSTANCE.createConstants(new ArrayList(reactInstance.viewManagerResolver.getEagerViewManagerMap().values()), map);
        Collection<String> lazyViewManagerNames = reactInstance.viewManagerResolver.getLazyViewManagerNames();
        if (!lazyViewManagerNames.isEmpty()) {
            mapCreateConstants.put("ViewManagerNames", new ArrayList(lazyViewManagerNames));
            mapCreateConstants.put("LazyViewManagersEnabled", Boolean.TRUE);
        }
        return Arguments.makeNativeMap((Map<String, ? extends Object>) mapCreateConstants);
    }

    private final native long getJavaScriptContext();

    private final native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    private final native RuntimeScheduler getRuntimeScheduler();

    private final native RuntimeExecutor getUnbufferedRuntimeExecutor();

    private final native void handleMemoryPressureJs(int pressureLevel);

    private final native HybridData initHybrid(JSRuntimeFactory jsRuntimeFactory, MessageQueueThread jsMessageQueueThread, MessageQueueThread nativeModulesMessageQueueThread, JavaTimerManager timerManager, JSTimerExecutor jsTimerExecutor, ReactJsExceptionHandler jReactExceptionsManager, BindingsInstaller jBindingsInstaller, boolean isProfiling, ReactHostInspectorTarget reactHostInspectorTarget);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeEagerTurboModules$lambda$3(ReactInstance reactInstance) {
        B3.a.c(0L, "initializeEagerTurboModules");
        Iterator<String> it = reactInstance.turboModuleManager.getEagerInitModuleNames().iterator();
        while (it.hasNext()) {
            reactInstance.turboModuleManager.getModule(it.next());
        }
        B3.a.i(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void loadJSBundleFromAssets(AssetManager assetManager, String assetURL);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void loadJSBundleFromFile(String fileName, String sourceURL);

    private final native void registerSegmentNative(int segmentId, String segmentPath);

    public final native void callFunctionOnModule(String moduleName, String methodName, NativeArray args);

    public final void destroy() {
        AbstractC2325a.b(TAG, "ReactInstance.destroy() is called.");
        this.reactQueueConfiguration.destroy();
        this.turboModuleManager.invalidate();
        this.fabricUIManager.invalidate();
        this.javaTimerManager.onInstanceDestroy();
        this.mHybridData.resetNative();
        this.javaScriptContextHolder.clear();
    }

    public final native RuntimeExecutor getBufferedRuntimeExecutor();

    public final EventDispatcher getEventDispatcher() {
        EventDispatcher eventDispatcher = this.fabricUIManager.getEventDispatcher();
        AbstractC2855l.f(eventDispatcher, "<get-eventDispatcher>(...)");
        return eventDispatcher;
    }

    public final FabricUIManager getFabricUIManager() {
        return this.fabricUIManager;
    }

    public final native CallInvokerHolderImpl getJSCallInvokerHolder();

    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.javaScriptContextHolder;
    }

    public final <T extends NativeModule> T getNativeModule(Class<T> nativeModuleInterface) {
        AbstractC2855l.g(nativeModuleInterface, "nativeModuleInterface");
        ReactModule reactModule = (ReactModule) nativeModuleInterface.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return (T) getNativeModule(reactModule.name());
        }
        return null;
    }

    public final Collection<NativeModule> getNativeModules() {
        return this.turboModuleManager.getModules();
    }

    public final ReactQueueConfiguration getReactQueueConfiguration() {
        return this.reactQueueConfiguration;
    }

    public final void handleMemoryPressure(int level) {
        try {
            handleMemoryPressureJs(level);
        } catch (NullPointerException unused) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."));
        }
    }

    public final <T extends NativeModule> boolean hasNativeModule(Class<T> nativeModuleInterface) {
        AbstractC2855l.g(nativeModuleInterface, "nativeModuleInterface");
        ReactModule reactModule = (ReactModule) nativeModuleInterface.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return this.turboModuleManager.hasModule(reactModule.name());
        }
        return false;
    }

    public final void initializeEagerTurboModules() {
        this.reactQueueConfiguration.getNativeModulesQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.react.runtime.U
            @Override // java.lang.Runnable
            public final void run() {
                ReactInstance.initializeEagerTurboModules$lambda$3(this.f20506g);
            }
        });
    }

    public final void loadJSBundle(JSBundleLoader bundleLoader) {
        AbstractC2855l.g(bundleLoader, "bundleLoader");
        B3.a.c(0L, "ReactInstance.loadJSBundle");
        bundleLoader.loadScript(new JSBundleLoaderDelegate() { // from class: com.facebook.react.runtime.ReactInstance.loadJSBundle.1
            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadScriptFromAssets(AssetManager assetManager, String assetURL, boolean loadSynchronously) {
                AbstractC2855l.g(assetManager, "assetManager");
                AbstractC2855l.g(assetURL, "assetURL");
                ReactInstance.this.context.setSourceURL(assetURL);
                ReactInstance.this.loadJSBundleFromAssets(assetManager, assetURL);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadScriptFromFile(String fileName, String sourceURL, boolean loadSynchronously) {
                AbstractC2855l.g(fileName, "fileName");
                AbstractC2855l.g(sourceURL, "sourceURL");
                ReactInstance.this.context.setSourceURL(sourceURL);
                ReactInstance.this.loadJSBundleFromFile(fileName, sourceURL);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadSplitBundleFromFile(String fileName, String sourceURL) {
                AbstractC2855l.g(fileName, "fileName");
                AbstractC2855l.g(sourceURL, "sourceURL");
                ReactInstance.this.loadJSBundleFromFile(fileName, sourceURL);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void setSourceURLs(String deviceURL, String remoteURL) {
                AbstractC2855l.g(deviceURL, "deviceURL");
                AbstractC2855l.g(remoteURL, "remoteURL");
                ReactInstance.this.context.setSourceURL(deviceURL);
            }
        });
        B3.a.i(0L);
    }

    public final void prerenderSurface(ReactSurfaceImpl surface) {
        AbstractC2855l.g(surface, "surface");
        B3.a.c(0L, "ReactInstance.prerenderSurface");
        AbstractC2325a.b(TAG, "call prerenderSurface with surface: " + surface.getModuleName());
        this.fabricUIManager.startSurface(surface.getSurfaceHandler(), surface.getContext(), null);
        B3.a.i(0L);
    }

    public final void registerSegment(int segmentId, String path) {
        AbstractC2855l.g(path, "path");
        registerSegmentNative(segmentId, path);
    }

    public final void startSurface(ReactSurfaceImpl surface) {
        AbstractC2855l.g(surface, "surface");
        String str = TAG;
        AbstractC2325a.b(str, "startSurface() is called with surface: " + surface.getSurfaceID());
        B3.a.c(0L, "ReactInstance.startSurface");
        ReactSurfaceView view = surface.getView();
        if (view == null) {
            throw new IllegalStateException("Starting surface without a view is not supported, use prerenderSurface instead.");
        }
        if (view.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("surfaceView's is NOT equal to View.NO_ID before calling startSurface."));
            view.setId(-1);
        }
        if (surface.isRunning()) {
            this.fabricUIManager.attachRootView(surface.getSurfaceHandler(), view);
        } else {
            this.fabricUIManager.startSurface(surface.getSurfaceHandler(), surface.getContext(), view);
        }
        B3.a.i(0L);
    }

    public final void stopSurface(ReactSurfaceImpl surface) {
        AbstractC2855l.g(surface, "surface");
        AbstractC2325a.b(TAG, "stopSurface() is called with surface: " + surface.getSurfaceID());
        this.fabricUIManager.stopSurface(surface.getSurfaceHandler());
    }

    public final native void unregisterFromInspector();

    public final <T extends NativeModule> T getNativeModule(String nativeModuleName) {
        T t10;
        AbstractC2855l.g(nativeModuleName, "nativeModuleName");
        synchronized (this.turboModuleManager) {
            t10 = (T) this.turboModuleManager.getModule(nativeModuleName);
        }
        return t10;
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }
}
