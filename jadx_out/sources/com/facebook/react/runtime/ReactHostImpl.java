package com.facebook.react.runtime;

import R8.AbstractC1417k;
import R8.C1404d0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.MemoryPressureRouter;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.DefaultDevSupportManagerFactory;
import com.facebook.react.devsupport.DevMenuConfiguration;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkHelper;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.runtime.BridgelessAtomicRef;
import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.BlackHoleEventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import d2.AbstractC2325a;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 º\u00022\u00020\u0001:\u0004»\u0002º\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010*H\u0003¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J;\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010.\u001a\u00020\u00182\b\b\u0002\u00103\u001a\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001504H\u0002¢\u0006\u0004\b6\u00107J;\u00108\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010.\u001a\u00020\u00182\b\b\u0002\u00103\u001a\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001504H\u0002¢\u0006\u0004\b8\u00107J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020!0&H\u0002¢\u0006\u0004\b9\u0010)J\u0015\u0010:\u001a\b\u0012\u0004\u0012\u00020!0&H\u0003¢\u0006\u0004\b:\u0010)J%\u0010>\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;H\u0003¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020!0&H\u0003¢\u0006\u0004\b@\u0010)J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00020A0&H\u0002¢\u0006\u0004\bB\u0010)J\u001f\u0010D\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bF\u0010EJA\u0010J\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0&\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010!0I2\u0006\u0010G\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u0018H\u0002¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010H\u001a\u00020\u0018H\u0003¢\u0006\u0004\bL\u0010MJ-\u0010Q\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010H\u001a\u00020\u00182\u000e\u0010P\u001a\n\u0018\u00010Nj\u0004\u0018\u0001`OH\u0003¢\u0006\u0004\bQ\u0010RJ\u0015\u0010T\u001a\b\u0012\u0004\u0012\u00020'0SH\u0016¢\u0006\u0004\bT\u0010UJ\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020'0S2\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0004\bX\u0010YJ\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020'0S2\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0004\b[\u0010YJ\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020'0S2\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0004\b]\u0010YJ#\u0010c\u001a\u00020\u00152\b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010b\u001a\u0004\u0018\u00010aH\u0017¢\u0006\u0004\bc\u0010dJ\u0019\u0010c\u001a\u00020\u00152\b\u0010`\u001a\u0004\u0018\u00010_H\u0017¢\u0006\u0004\bc\u0010eJ\u0019\u0010f\u001a\u00020\u00152\b\u0010`\u001a\u0004\u0018\u00010_H\u0017¢\u0006\u0004\bf\u0010eJ\u0019\u0010g\u001a\u00020\u00152\b\u0010`\u001a\u0004\u0018\u00010_H\u0017¢\u0006\u0004\bg\u0010eJ\u000f\u0010g\u001a\u00020\u0015H\u0017¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0015H\u0017¢\u0006\u0004\bi\u0010hJ\u0019\u0010i\u001a\u00020\u00152\b\u0010`\u001a\u0004\u0018\u00010_H\u0017¢\u0006\u0004\bi\u0010eJ)\u0010n\u001a\u00020m2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010j\u001a\u00020\u00182\b\u0010l\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\u000bH\u0017¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020rH\u0016¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020rH\u0016¢\u0006\u0004\bu\u0010tJ\u0017\u0010x\u001a\u00020\u00152\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yJ\u001d\u0010z\u001a\b\u0012\u0004\u0012\u00020'0S2\u0006\u0010H\u001a\u00020\u0018H\u0016¢\u0006\u0004\bz\u0010{JA\u0010}\u001a\b\u0012\u0004\u0012\u00020'0S2\u0006\u0010H\u001a\u00020\u00182\u000e\u0010P\u001a\n\u0018\u00010Nj\u0004\u0018\u0001`O2\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001504H\u0016¢\u0006\u0004\b}\u0010~J-\u0010}\u001a\b\u0012\u0004\u0012\u00020'0S2\u0006\u0010H\u001a\u00020\u00182\u000e\u0010P\u001a\n\u0018\u00010Nj\u0004\u0018\u0001`OH\u0016¢\u0006\u0004\b}\u0010\u007fJ.\u0010\u0086\u0001\u001a\u00020\u000b\"\n\b\u0000\u0010\u0081\u0001*\u00030\u0080\u00012\u000e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J0\u0010\u0089\u0001\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0081\u0001*\u00030\u0080\u00012\u000e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001e\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0080\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u008b\u0001J8\u0010\u0090\u0001\u001a\u00020\u00152\u0006\u0010`\u001a\u00020_2\u0007\u0010\u008c\u0001\u001a\u00020;2\u0007\u0010\u008d\u0001\u001a\u00020;2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0017¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00152\u0007\u0010\u0092\u0001\u001a\u00020\u000bH\u0017¢\u0006\u0005\b\u0093\u0001\u0010\u0017J\u001c\u0010\u0095\u0001\u001a\u00020\u00152\b\u0010\u0094\u0001\u001a\u00030\u008e\u0001H\u0017¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001a\u0010\u0098\u0001\u001a\u00020\u00152\u0007\u0010\u0097\u0001\u001a\u00020\u0018H\u0017¢\u0006\u0005\b\u0098\u0001\u0010\u001bJR\u0010\u0098\u0001\u001a\u00020\u00152\u0007\u0010\u0099\u0001\u001a\u00020\u00182\u0006\u0010j\u001a\u00020\u00182-\u0010\u009b\u0001\u001a(\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u009a\u0001\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u009a\u000104H\u0017¢\u0006\u0006\b\u0098\u0001\u0010\u009c\u0001J\u001a\u0010\u009d\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J!\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0007\u0010\u009f\u0001\u001a\u00020AH\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001J6\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0007\u0010£\u0001\u001a\u00020;2\u0007\u0010¤\u0001\u001a\u00020\u00182\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001f\u0010\u00ad\u0001\u001a\u00020\u00152\u000b\u0010ª\u0001\u001a\u00060Nj\u0002`OH\u0000¢\u0006\u0006\b«\u0001\u0010¬\u0001J3\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010j\u001a\u00020\u00182\u0007\u0010®\u0001\u001a\u00020\u00182\b\u0010°\u0001\u001a\u00030¯\u0001H\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001a\u0010¶\u0001\u001a\u00020\u00152\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001a\u0010¸\u0001\u001a\u00020\u00152\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0006\b·\u0001\u0010µ\u0001J\u001a\u0010»\u0001\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001a\u0010¾\u0001\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u0018H\u0000¢\u0006\u0006\b¼\u0001\u0010½\u0001J\"\u0010Á\u0001\u001a\u00020\u00152\u000e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150¿\u0001H\u0016¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\"\u0010Ã\u0001\u001a\u00020\u00152\u000e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150¿\u0001H\u0016¢\u0006\u0006\bÃ\u0001\u0010Â\u0001J\u0015\u0010Ç\u0001\u001a\u0005\u0018\u00010Ä\u0001H\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001c\u0010Ê\u0001\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0011\u0010Ë\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bË\u0001\u0010hR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Ì\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010Í\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Î\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Ï\u0001R\u0015\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Ï\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ð\u0001R\u0015\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010Ð\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R \u0010Õ\u0001\u001a\u00030Ô\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R \u0010Ú\u0001\u001a\u00030Ù\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u001e\u0010ß\u0001\u001a\t\u0012\u0004\u0012\u00020V0Þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R$\u0010â\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0&0á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010ä\u0001R\u001f\u0010æ\u0001\u001a\n\u0012\u0005\u0012\u00030å\u00010á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ã\u0001R\u0017\u0010ç\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u001e\u0010`\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010_0é\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b`\u0010ê\u0001R9\u0010í\u0001\u001a$\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010_ ì\u0001*\r\u0012\u0006\u0012\u0004\u0018\u00010_\u0018\u00010ë\u00010ë\u00010é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010ê\u0001R\u0018\u0010ï\u0001\u001a\u00030î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u0018\u0010ò\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u001b\u0010ô\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u001b\u0010ö\u0001\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u001e\u0010ù\u0001\u001a\t\u0012\u0004\u0012\u00020r0ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R%\u0010û\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00150¿\u00010ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ú\u0001R,\u0010ü\u0001\u001a\u0005\u0018\u00010Ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010Æ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R\u0019\u0010\u0081\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010Ð\u0001R!\u0010\u0082\u0002\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R!\u0010\u0084\u0002\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0083\u0002R!\u0010\u0085\u0002\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0083\u0002R&\u0010\u0088\u0002\u001a\u0011\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u009a\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R,\u0010\u008c\u0002\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010_8@@BX\u0080\u000e¢\u0006\u000f\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0005\b\u008b\u0002\u0010eR\u001c\u0010\u008e\u0002\u001a\b\u0012\u0004\u0012\u00020A0&8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0002\u0010)R\u001c\u0010\u008f\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0&8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0002\u0010)R\u0018\u0010\u0093\u0002\u001a\u00030\u0090\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0019\u0010\u0096\u0002\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0016\u0010\u0098\u0002\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0002\u0010qR\u001a\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u0099\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0019\u0010\u009e\u0002\u001a\u0004\u0018\u00010_8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010\u008a\u0002R\u0018\u0010¢\u0002\u001a\u00030\u009f\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010¡\u0002R\u001a\u0010¦\u0002\u001a\u0005\u0018\u00010£\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¤\u0002\u0010¥\u0002R\u001f\u0010ª\u0002\u001a\n\u0012\u0005\u0012\u00030\u0080\u00010§\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R\u001a\u0010®\u0002\u001a\u0005\u0018\u00010«\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010\u00ad\u0002R\u001a\u0010²\u0002\u001a\u0005\u0018\u00010¯\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b°\u0002\u0010±\u0002R\u001a\u0010¶\u0002\u001a\u0005\u0018\u00010³\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010µ\u0002R\u0017\u0010¹\u0002\u001a\u00020a8@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0002\u0010¸\u0002¨\u0006¼\u0002"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl;", "Lcom/facebook/react/ReactHost;", "Landroid/content/Context;", "context", "Lcom/facebook/react/runtime/ReactHostDelegate;", "reactHostDelegate", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "Ljava/util/concurrent/Executor;", "bgExecutor", "uiExecutor", PointerEventHelper.POINTER_TYPE_UNKNOWN, "allowPackagerServerAccess", "useDevSupport", "Lcom/facebook/react/devsupport/DevSupportManagerFactory;", "devSupportManagerFactory", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLcom/facebook/react/devsupport/DevSupportManagerFactory;)V", "delegate", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;ZZ)V", ViewProps.ENABLED, "Li7/B;", "maybeEnableDevSupport", "(Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", "setPausedInDebuggerMessage", "(Ljava/lang/String;)V", "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "listener", "loadNetworkResource", "(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V", "Lcom/facebook/react/runtime/ReactInstance;", "reactInstance", "Lcom/facebook/react/bridge/MemoryPressureListener;", "createMemoryPressureListener", "(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/bridge/MemoryPressureListener;", "Lcom/facebook/react/runtime/internal/bolts/Task;", "Ljava/lang/Void;", "getOrCreateStartTask", "()Lcom/facebook/react/runtime/internal/bolts/Task;", "Lcom/facebook/react/bridge/ReactContext;", "currentContext", "moveToHostDestroy", "(Lcom/facebook/react/bridge/ReactContext;)V", "callingMethod", PointerEventHelper.POINTER_TYPE_UNKNOWN, "throwable", "raiseSoftException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "executor", "Lkotlin/Function1;", "runnable", "callWithExistingReactInstance", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/runtime/internal/bolts/Task;", "callAfterGetOrCreateReactInstance", "getOrCreateReactInstance", "waitThenCallGetOrCreateReactInstanceTask", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tryNum", "maxTries", "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "(II)Lcom/facebook/react/runtime/internal/bolts/Task;", "getOrCreateReactInstanceTask", "Lcom/facebook/react/bridge/JSBundleLoader;", "loadJSBundleFromMetro", "method", "stopAttachedSurfaces", "(Ljava/lang/String;Lcom/facebook/react/runtime/ReactInstance;)V", "startAttachedSurfaces", "tag", "reason", "Lkotlin/Function2;", "createReactInstanceUnwrapper", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/jvm/functions/Function2;", "getOrCreateReloadTask", "(Ljava/lang/String;)Lcom/facebook/react/runtime/internal/bolts/Task;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "getOrCreateDestroyTask", "(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/runtime/internal/bolts/Task;", "Lcom/facebook/react/interfaces/TaskInterface;", ViewProps.START, "()Lcom/facebook/react/interfaces/TaskInterface;", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "surface", "prerenderSurface$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactSurfaceImpl;)Lcom/facebook/react/interfaces/TaskInterface;", "prerenderSurface", "startSurface$ReactAndroid_release", "startSurface", "stopSurface$ReactAndroid_release", "stopSurface", "Landroid/app/Activity;", "activity", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "defaultBackButtonImpl", "onHostResume", "(Landroid/app/Activity;Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;)V", "(Landroid/app/Activity;)V", "onHostLeaveHint", "onHostPause", "()V", "onHostDestroy", "moduleName", "Landroid/os/Bundle;", "initialProps", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "createSurface", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lcom/facebook/react/interfaces/fabric/ReactSurface;", "onBackPressed", "()Z", "Lcom/facebook/react/ReactInstanceEventListener;", "addReactInstanceEventListener", "(Lcom/facebook/react/ReactInstanceEventListener;)V", "removeReactInstanceEventListener", "Lcom/facebook/react/devsupport/DevMenuConfiguration;", "config", "setDevMenuConfiguration", "(Lcom/facebook/react/devsupport/DevMenuConfiguration;)V", "reload", "(Ljava/lang/String;)Lcom/facebook/react/interfaces/TaskInterface;", "onDestroyFinished", "destroy", "(Ljava/lang/String;Ljava/lang/Exception;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/interfaces/TaskInterface;", "(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/interfaces/TaskInterface;", "Lcom/facebook/react/bridge/NativeModule;", "T", "Ljava/lang/Class;", "nativeModuleInterface", "hasNativeModule$ReactAndroid_release", "(Ljava/lang/Class;)Z", "hasNativeModule", "getNativeModule$ReactAndroid_release", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "getNativeModule", "nativeModuleName", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "hasFocus", "onWindowFocusChange", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "filePath", "setBundleSource", "debugServerHost", PointerEventHelper.POINTER_TYPE_UNKNOWN, "queryMapper", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onConfigurationChanged", "(Landroid/content/Context;)V", "bundleLoader", "loadBundle$ReactAndroid_release", "(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/runtime/internal/bolts/Task;", "loadBundle", "segmentId", "path", "Lcom/facebook/react/bridge/Callback;", "callback", "registerSegment$ReactAndroid_release", "(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)Lcom/facebook/react/runtime/internal/bolts/Task;", "registerSegment", "e", "handleHostException$ReactAndroid_release", "(Ljava/lang/Exception;)V", "handleHostException", "methodName", "Lcom/facebook/react/bridge/NativeArray;", "args", "callFunctionOnModule$ReactAndroid_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)Lcom/facebook/react/runtime/internal/bolts/Task;", "callFunctionOnModule", "attachSurface$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactSurfaceImpl;)V", "attachSurface", "detachSurface$ReactAndroid_release", "detachSurface", "isSurfaceAttached$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactSurfaceImpl;)Z", "isSurfaceAttached", "isSurfaceWithModuleNameAttached$ReactAndroid_release", "(Ljava/lang/String;)Z", "isSurfaceWithModuleNameAttached", "Lkotlin/Function0;", "onBeforeDestroy", "addBeforeDestroyListener", "(Lw7/a;)V", "removeBeforeDestroyListener", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "getOrCreateReactHostInspectorTarget$ReactAndroid_release", "()Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "getOrCreateReactHostInspectorTarget", "unregisterInstanceFromInspector$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactInstance;)V", "unregisterInstanceFromInspector", "invalidate", "Landroid/content/Context;", "Lcom/facebook/react/runtime/ReactHostDelegate;", "Lcom/facebook/react/fabric/ComponentFactory;", "Ljava/util/concurrent/Executor;", "Z", "Lcom/facebook/react/runtime/ReactHostImplDevHelper;", "reactHostImplDevHelper", "Lcom/facebook/react/runtime/ReactHostImplDevHelper;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "Lcom/facebook/react/MemoryPressureRouter;", "memoryPressureRouter", "Lcom/facebook/react/MemoryPressureRouter;", "getMemoryPressureRouter", "()Lcom/facebook/react/MemoryPressureRouter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "attachedSurfaces", "Ljava/util/Set;", "Lcom/facebook/react/runtime/BridgelessAtomicRef;", "createReactInstanceTaskRef", "Lcom/facebook/react/runtime/BridgelessAtomicRef;", "Lcom/facebook/react/runtime/ReactInstance;", "Lcom/facebook/react/runtime/BridgelessReactContext;", "bridgelessReactContextRef", "id", "I", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "lastUsedActivityRef", "Lcom/facebook/react/runtime/ReactHostStateTracker;", "stateTracker", "Lcom/facebook/react/runtime/ReactHostStateTracker;", "Lcom/facebook/react/runtime/ReactLifecycleStateManager;", "reactLifecycleStateManager", "Lcom/facebook/react/runtime/ReactLifecycleStateManager;", "memoryPressureListener", "Lcom/facebook/react/bridge/MemoryPressureListener;", "defaultHardwareBackBtnHandler", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "reactInstanceEventListeners", "Ljava/util/List;", "beforeDestroyListeners", "reactHostInspectorTarget", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "getReactHostInspectorTarget$ReactAndroid_release", "setReactHostInspectorTarget$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactHostInspectorTarget;)V", "hostInvalidated", "startTask", "Lcom/facebook/react/runtime/internal/bolts/Task;", "reloadTask", "destroyTask", "getHostMetadata", "()Ljava/util/Map;", "hostMetadata", "getCurrentActivity$ReactAndroid_release", "()Landroid/app/Activity;", "setCurrentActivity", "currentActivity", "getJsBundleLoader", "jsBundleLoader", "isMetroRunning", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", "lifecycleState", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "isInstanceInitialized$ReactAndroid_release", "isInstanceInitialized", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "reactQueueConfiguration", "getLastUsedActivity$ReactAndroid_release", "lastUsedActivity", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/fabric/FabricUIManager;", "getUiManager$ReactAndroid_release", "()Lcom/facebook/react/fabric/FabricUIManager;", "uiManager", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeModules$ReactAndroid_release", "()Ljava/util/Collection;", "nativeModules", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getRuntimeExecutor$ReactAndroid_release", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJsCallInvokerHolder$ReactAndroid_release", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "jsCallInvokerHolder", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder$ReactAndroid_release", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "javaScriptContextHolder", "getDefaultBackButtonHandler$ReactAndroid_release", "()Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "defaultBackButtonHandler", "Companion", "CreationResult", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactHostImpl implements ReactHost {
    private static final int BRIDGELESS_MARKER_INSTANCE_KEY = 1;
    private static final String TAG = "ReactHost";
    private final AtomicReference<Activity> activity;
    private final boolean allowPackagerServerAccess;
    private final Set<ReactSurfaceImpl> attachedSurfaces;
    private final List<InterfaceC3487a> beforeDestroyListeners;
    private final Executor bgExecutor;
    private final BridgelessAtomicRef<BridgelessReactContext> bridgelessReactContextRef;
    private final ComponentFactory componentFactory;
    private final Context context;
    private final BridgelessAtomicRef<Task<ReactInstance>> createReactInstanceTaskRef;
    private DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler;
    private Task<Void> destroyTask;
    private final DevSupportManager devSupportManager;
    private volatile boolean hostInvalidated;
    private final int id;
    private final AtomicReference<WeakReference<Activity>> lastUsedActivityRef;
    private MemoryPressureListener memoryPressureListener;
    private final MemoryPressureRouter memoryPressureRouter;
    private final ReactHostDelegate reactHostDelegate;
    private final ReactHostImplDevHelper reactHostImplDevHelper;
    private ReactHostInspectorTarget reactHostInspectorTarget;
    private ReactInstance reactInstance;
    private final List<ReactInstanceEventListener> reactInstanceEventListeners;
    private final ReactLifecycleStateManager reactLifecycleStateManager;
    private Task<ReactInstance> reloadTask;
    private Task<Void> startTask;
    private final ReactHostStateTracker stateTracker;
    private final Executor uiExecutor;
    private final boolean useDevSupport;
    private static final Companion Companion = new Companion(null);
    private static final AtomicInteger counter = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "BRIDGELESS_MARKER_INSTANCE_KEY", PointerEventHelper.POINTER_TYPE_UNKNOWN, "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "instance", "Lcom/facebook/react/runtime/ReactInstance;", "context", "Lcom/facebook/react/bridge/ReactContext;", "isReloading", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/ReactContext;Z)V", "getInstance", "()Lcom/facebook/react/runtime/ReactInstance;", "getContext", "()Lcom/facebook/react/bridge/ReactContext;", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class CreationResult {
        private final ReactContext context;
        private final ReactInstance instance;
        private final boolean isReloading;

        public CreationResult(ReactInstance instance, ReactContext context, boolean z10) {
            AbstractC2855l.g(instance, "instance");
            AbstractC2855l.g(context, "context");
            this.instance = instance;
            this.context = context;
            this.isReloading = z10;
        }

        public final ReactContext getContext() {
            return this.context;
        }

        public final ReactInstance getInstance() {
            return this.instance;
        }

        /* JADX INFO: renamed from: isReloading, reason: from getter */
        public final boolean getIsReloading() {
            return this.isReloading;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.runtime.ReactHostImpl$setBundleSource$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "com.facebook.react.runtime.ReactHostImpl$setBundleSource$1", f = "ReactHostImpl.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C20431 extends kotlin.coroutines.jvm.internal.l implements Function2 {
        final /* synthetic */ String $debugServerHost;
        final /* synthetic */ String $moduleName;
        final /* synthetic */ Function1 $queryMapper;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C20431(Function1 function1, String str, String str2, n7.f fVar) {
            super(2, fVar);
            this.$queryMapper = function1;
            this.$debugServerHost = str;
            this.$moduleName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactHostImpl.this.new C20431(this.$queryMapper, this.$debugServerHost, this.$moduleName, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(R8.N n10, n7.f fVar) {
            return ((C20431) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            DevSupportManager devSupportManager = ReactHostImpl.this.getDevSupportManager();
            AbstractC2855l.e(devSupportManager, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase");
            ((DevSupportManagerBase) devSupportManager).getDevServerHelper().closePackagerConnection();
            PackagerConnectionSettings packagerConnectionSettings = ((DevSupportManagerBase) ReactHostImpl.this.getDevSupportManager()).getDevSettings().getPackagerConnectionSettings();
            packagerConnectionSettings.setPackagerOptionsUpdater(this.$queryMapper);
            packagerConnectionSettings.setDebugServerHost(this.$debugServerHost);
            ((DevSupportManagerBase) ReactHostImpl.this.getDevSupportManager()).setJsAppBundleName(this.$moduleName);
            ReactHostImpl.this.reload("Changed bundle source");
            return C2735B.f28704a;
        }
    }

    public ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, Executor bgExecutor, Executor uiExecutor, boolean z10, boolean z11, DevSupportManagerFactory devSupportManagerFactory) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(reactHostDelegate, "reactHostDelegate");
        AbstractC2855l.g(componentFactory, "componentFactory");
        AbstractC2855l.g(bgExecutor, "bgExecutor");
        AbstractC2855l.g(uiExecutor, "uiExecutor");
        this.context = context;
        this.reactHostDelegate = reactHostDelegate;
        this.componentFactory = componentFactory;
        this.bgExecutor = bgExecutor;
        this.uiExecutor = uiExecutor;
        this.allowPackagerServerAccess = z10;
        this.useDevSupport = z11;
        ReactHostImplDevHelper reactHostImplDevHelper = new ReactHostImplDevHelper(this);
        this.reactHostImplDevHelper = reactHostImplDevHelper;
        DevSupportManagerFactory defaultDevSupportManagerFactory = devSupportManagerFactory == null ? new DefaultDevSupportManagerFactory() : devSupportManagerFactory;
        Context applicationContext = context.getApplicationContext();
        AbstractC2855l.f(applicationContext, "getApplicationContext(...)");
        DevSupportManager devSupportManagerCreate = defaultDevSupportManagerFactory.create(applicationContext, reactHostImplDevHelper, reactHostDelegate.getJsMainModulePath(), true, null, null, 2, null, null, null, null, z11);
        if (devSupportManagerCreate instanceof DevSupportManagerBase) {
            ((DevSupportManagerBase) devSupportManagerCreate).setTracingStateProvider$ReactAndroid_release(reactHostImplDevHelper);
        }
        this.devSupportManager = devSupportManagerCreate;
        this.memoryPressureRouter = new MemoryPressureRouter(context);
        this.attachedSurfaces = new HashSet();
        this.createReactInstanceTaskRef = new BridgelessAtomicRef<>(Task.INSTANCE.forResult(null));
        this.bridgelessReactContextRef = new BridgelessAtomicRef<>(null, 1, null);
        int andIncrement = counter.getAndIncrement();
        this.id = andIncrement;
        this.activity = new AtomicReference<>();
        this.lastUsedActivityRef = new AtomicReference<>(new WeakReference(null));
        ReactHostStateTracker reactHostStateTracker = new ReactHostStateTracker(andIncrement);
        this.stateTracker = reactHostStateTracker;
        this.reactLifecycleStateManager = new ReactLifecycleStateManager(reactHostStateTracker);
        this.reactInstanceEventListeners = new CopyOnWriteArrayList();
        this.beforeDestroyListeners = new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_defaultBackButtonHandler_$lambda$18(ReactHostImpl reactHostImpl) {
        UiThreadUtil.assertOnUiThread();
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = reactHostImpl.defaultHardwareBackBtnHandler;
        if (defaultHardwareBackBtnHandler != null) {
            defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_isMetroRunning_$lambda$46(ReactHostImpl reactHostImpl, String str, TaskCompletionSource taskCompletionSource, boolean z10) {
        reactHostImpl.stateTracker.enterState(str, "Async result = " + z10);
        taskCompletionSource.setResult(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task _get_jsBundleLoader_$lambda$45(ReactHostImpl reactHostImpl, Task task) {
        AbstractC2855l.g(task, "task");
        Object result = task.getResult();
        if (result != null) {
            return ((Boolean) result).booleanValue() ? reactHostImpl.loadJSBundleFromMetro() : Task.INSTANCE.forResult(reactHostImpl.reactHostDelegate.getJsBundleLoader());
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Task<Void> callAfterGetOrCreateReactInstance(final String callingMethod, Executor executor, final Function1 runnable) {
        return getOrCreateReactInstance().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.N
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return ReactHostImpl.callAfterGetOrCreateReactInstance$lambda$32(this.f20492a, callingMethod, runnable, task);
            }
        }, executor);
    }

    static /* synthetic */ Task callAfterGetOrCreateReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = Task.IMMEDIATE_EXECUTOR;
        }
        return reactHostImpl.callAfterGetOrCreateReactInstance(str, executor, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void callAfterGetOrCreateReactInstance$lambda$32(ReactHostImpl reactHostImpl, String str, Function1 function1, Task task) {
        AbstractC2855l.g(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        if (reactInstance != null) {
            function1.invoke(reactInstance);
            return null;
        }
        raiseSoftException$default(reactHostImpl, "callAfterGetOrCreateReactInstance(" + str + ")", "Execute: reactInstance is null. Dropping work.", null, 4, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B callFunctionOnModule$lambda$21(String str, String str2, NativeArray nativeArray, ReactInstance reactInstance) {
        AbstractC2855l.g(reactInstance, "reactInstance");
        reactInstance.callFunctionOnModule(str, str2, nativeArray);
        return C2735B.f28704a;
    }

    private final Task<Boolean> callWithExistingReactInstance(final String callingMethod, Executor executor, final Function1 runnable) {
        return this.createReactInstanceTaskRef.get().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.F
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return ReactHostImpl.callWithExistingReactInstance$lambda$31(this.f20471a, callingMethod, runnable, task);
            }
        }, executor);
    }

    static /* synthetic */ Task callWithExistingReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = Task.IMMEDIATE_EXECUTOR;
        }
        return reactHostImpl.callWithExistingReactInstance(str, executor, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean callWithExistingReactInstance$lambda$31(ReactHostImpl reactHostImpl, String str, Function1 function1, Task task) {
        boolean z10;
        AbstractC2855l.g(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, "callWithExistingReactInstance(" + str + ")", "Execute: reactInstance is null. Dropping work.", null, 4, null);
            z10 = false;
        } else {
            function1.invoke(reactInstance);
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    private final MemoryPressureListener createMemoryPressureListener(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.o
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i10) {
                ReactHostImpl.createMemoryPressureListener$lambda$13(this.f20566a, weakReference, i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$13(ReactHostImpl reactHostImpl, final WeakReference weakReference, final int i10) {
        reactHostImpl.bgExecutor.execute(new Runnable() { // from class: com.facebook.react.runtime.m
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.createMemoryPressureListener$lambda$13$lambda$12(weakReference, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$13$lambda$12(WeakReference weakReference, int i10) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.handleMemoryPressure(i10);
        }
    }

    private final Function2 createReactInstanceUnwrapper(final String tag, final String method, final String reason) {
        return new Function2() { // from class: com.facebook.react.runtime.L
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReactHostImpl.createReactInstanceUnwrapper$lambda$49(this.f20487g, tag, reason, method, (Task) obj, (String) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance createReactInstanceUnwrapper$lambda$49(ReactHostImpl reactHostImpl, String str, String str2, String str3, Task task, String stage) {
        AbstractC2855l.g(task, "task");
        AbstractC2855l.g(stage, "stage");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        ReactInstance reactInstance2 = reactHostImpl.reactInstance;
        String str4 = "Stage: " + stage;
        String str5 = str + " reason: " + str2;
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.");
            }
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task faulted. " + str4 + ". " + ("Fault reason: " + error.getMessage()) + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (task.isCancelled()) {
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task cancelled. " + str4 + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task returned null. " + str4 + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (reactInstance2 != null && !AbstractC2855l.b(reactInstance, reactInstance2)) {
            raiseSoftException$default(reactHostImpl, str3, str + ": Detected two different ReactInstances. Returning old. " + str4 + ". " + str5, null, 4, null);
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task destroy$lambda$11(final ReactHostImpl reactHostImpl, final String str, final Exception exc) {
        Task<ReactInstance> task = reactHostImpl.reloadTask;
        if (task == null) {
            return reactHostImpl.getOrCreateDestroyTask(str, exc);
        }
        reactHostImpl.stateTracker.enterState("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return task.continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.O
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.destroy$lambda$11$lambda$10(this.f20495a, str, exc, task2);
            }
        }, reactHostImpl.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task destroy$lambda$11$lambda$10(ReactHostImpl reactHostImpl, String str, Exception exc, Task it) {
        AbstractC2855l.g(it, "it");
        return reactHostImpl.getOrCreateDestroyTask(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void destroy$lambda$9(Function1 function1, Task task) {
        AbstractC2855l.g(task, "task");
        function1.invoke(Boolean.valueOf(task.isCompleted() && !task.isFaulted()));
        return null;
    }

    private final Map<String, String> getHostMetadata() {
        return AndroidInfoHelpers.getInspectorHostMetadata(this.context);
    }

    private final Task<JSBundleLoader> getJsBundleLoader() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "getJSBundleLoader()", null, 2, null);
        if (getDevSupportManager().getBundleFilePath() != null) {
            try {
                Task.Companion companion = Task.INSTANCE;
                JSBundleLoader.Companion companion2 = JSBundleLoader.INSTANCE;
                String bundleFilePath = getDevSupportManager().getBundleFilePath();
                if (bundleFilePath != null) {
                    return companion.forResult(companion2.createFileLoader(bundleFilePath));
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Exception e10) {
                return Task.INSTANCE.forError(e10);
            }
        }
        if (this.useDevSupport && this.allowPackagerServerAccess) {
            return isMetroRunning().onSuccessTask(new Continuation() { // from class: com.facebook.react.runtime.Q
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return ReactHostImpl._get_jsBundleLoader_$lambda$45(this.f20501a, task);
                }
            }, this.bgExecutor);
        }
        if (ReactBuildConfig.DEBUG) {
            AbstractC2325a.b(TAG, "Packager server access is disabled in this environment");
        }
        try {
            return Task.INSTANCE.forResult(this.reactHostDelegate.getJsBundleLoader());
        } catch (Exception e11) {
            return Task.INSTANCE.forError(e11);
        }
    }

    private final Task<Void> getOrCreateDestroyTask(final String reason, Exception ex) {
        final String str = "getOrCreateDestroyTask()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateDestroyTask()", null, 2, null);
        raiseSoftException("getOrCreateDestroyTask()", reason, ex);
        Task<Void> task = this.destroyTask;
        if (task != null) {
            return task;
        }
        final Function2 function2CreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Destroy", "getOrCreateDestroyTask()", reason);
        this.stateTracker.enterState("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
        Task<Void> taskContinueWith$default = Task.continueWith$default(this.createReactInstanceTaskRef.getAndReset().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.z
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$60(this.f20581a, str, function2CreateReactInstanceUnwrapper, reason, task2);
            }
        }, this.uiExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.A
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$62(function2CreateReactInstanceUnwrapper, this, str, task2);
            }
        }, this.bgExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.B
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$63(function2CreateReactInstanceUnwrapper, this, str, reason, task2);
            }
        }, this.uiExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.C
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$64(function2CreateReactInstanceUnwrapper, this, str, task2);
            }
        }, this.bgExecutor), new Continuation() { // from class: com.facebook.react.runtime.D
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$65(this.f20465a, str, reason, task2);
            }
        }, null, 2, null);
        this.destroyTask = taskContinueWith$default;
        return taskContinueWith$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$60(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        AbstractC2855l.g(task, "task");
        reactHostImpl.stateTracker.enterState(str, "Starting React Native destruction");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting destroy");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        if (reactHostImpl.hostInvalidated) {
            ReactHostInspectorTarget reactHostInspectorTarget = reactHostImpl.reactHostInspectorTarget;
            if (reactHostInspectorTarget != null) {
                reactHostInspectorTarget.close();
            }
            reactHostImpl.reactHostInspectorTarget = null;
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.stateTracker.enterState(str, "DevSupportManager cleanup");
            reactHostImpl.getDevSupportManager().stopInspector();
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Destroy reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Move ReactHost to onHostDestroy()");
        reactHostImpl2.reactLifecycleStateManager.moveToOnHostDestroy(nullable);
        return Task.INSTANCE.forResult(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$62(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        AbstractC2855l.g(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Stopping surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        synchronized (reactHostImpl.attachedSurfaces) {
            reactHostImpl.attachedSurfaces.clear();
            C2735B c2735b = C2735B.f28704a;
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$63(Function2 function2, ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        AbstractC2855l.g(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<InterfaceC3487a> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Destroy reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Destroying MemoryPressureRouter");
        reactHostImpl2.getMemoryPressureRouter().destroy(reactHostImpl2.context);
        if (nullable != null) {
            reactHostImpl2.stateTracker.enterState(str3, "Resetting ReactContext ref");
            reactHostImpl2.bridgelessReactContextRef.reset();
            reactHostImpl2.stateTracker.enterState(str3, "Destroying ReactContext");
            nullable.destroy();
        }
        reactHostImpl2.setCurrentActivity(null);
        ResourceDrawableIdHelper.clear();
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$64(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        AbstractC2855l.g(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.stateTracker.enterState(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.stateTracker.enterState(str2, "Destroying ReactInstance");
            reactInstance.destroy();
        }
        reactHostImpl2.stateTracker.enterState(str2, "Resetting start/destroy task ref");
        reactHostImpl2.startTask = null;
        reactHostImpl2.destroyTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void getOrCreateDestroyTask$lambda$65(ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        AbstractC2855l.g(task, "task");
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.");
            }
            reactHostImpl.raiseSoftException(str, "React destruction failed. ReactInstance task faulted. Fault reason: " + error.getMessage() + ". Destroy reason: " + str2, task.getError());
        }
        if (!task.isCancelled()) {
            return null;
        }
        raiseSoftException$default(reactHostImpl, str, "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str2, null, 4, null);
        return null;
    }

    private final Task<ReactInstance> getOrCreateReactInstance() {
        return Task.INSTANCE.call(new Callable() { // from class: com.facebook.react.runtime.S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20502a.waitThenCallGetOrCreateReactInstanceTask();
            }
        }, this.bgExecutor);
    }

    private final Task<ReactInstance> getOrCreateReactInstanceTask() {
        final String str = "getOrCreateReactInstanceTask()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateReactInstanceTask()", null, 2, null);
        return this.createReactInstanceTaskRef.getOrCreate(new BridgelessAtomicRef.Provider() { // from class: com.facebook.react.runtime.n
            @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
            public final Object get() {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44(this.f20564a, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReactInstanceTask$lambda$44(final ReactHostImpl reactHostImpl, final String str) {
        reactHostImpl.stateTracker.enterState(str, "Start");
        AbstractC3007a.b(!reactHostImpl.hostInvalidated, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        Task<TContinuationResult> taskOnSuccess = reactHostImpl.getJsBundleLoader().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.v
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40(this.f20575a, str, task);
            }
        }, reactHostImpl.bgExecutor);
        taskOnSuccess.continueWith(new ReactHostImpl$sam$com_facebook_react_runtime_internal_bolts_Continuation$0(new Function1() { // from class: com.facebook.react.runtime.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$42(this.f20577g, str, (Task) obj);
            }
        }), reactHostImpl.uiExecutor);
        return Task.onSuccess$default(taskOnSuccess, new Continuation() { // from class: com.facebook.react.runtime.y
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$43(task);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreationResult getOrCreateReactInstanceTask$lambda$44$lambda$40(final ReactHostImpl reactHostImpl, final String str, Task task) {
        AbstractC2855l.g(task, "task");
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BridgelessReactContext orCreate = reactHostImpl.bridgelessReactContextRef.getOrCreate(new BridgelessAtomicRef.Provider() { // from class: com.facebook.react.runtime.r
            @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
            public final Object get() {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$37(this.f20571a, str);
            }
        });
        orCreate.setJSExceptionHandler(reactHostImpl.getDevSupportManager());
        reactHostImpl.stateTracker.enterState(str, "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(orCreate, reactHostImpl.reactHostDelegate, reactHostImpl.componentFactory, reactHostImpl.getDevSupportManager(), new QueueThreadExceptionHandler() { // from class: com.facebook.react.runtime.s
            @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
            public final void handleException(Exception exc) {
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$38(this.f20573a, exc);
            }
        }, reactHostImpl.useDevSupport, reactHostImpl.getOrCreateReactHostInspectorTarget$ReactAndroid_release());
        reactHostImpl.reactInstance = reactInstance;
        MemoryPressureListener memoryPressureListenerCreateMemoryPressureListener = reactHostImpl.createMemoryPressureListener(reactInstance);
        reactHostImpl.memoryPressureListener = memoryPressureListenerCreateMemoryPressureListener;
        reactHostImpl.getMemoryPressureRouter().addMemoryPressureListener(memoryPressureListenerCreateMemoryPressureListener);
        reactInstance.initializeEagerTurboModules();
        reactHostImpl.stateTracker.enterState(str, "Loading JS Bundle");
        reactInstance.loadJSBundle((JSBundleLoader) result);
        reactHostImpl.stateTracker.enterState(str, "DevSupportManager.onNewReactContextCreated()");
        reactHostImpl.getDevSupportManager().onNewReactContextCreated(orCreate);
        orCreate.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.runtime.t
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$39();
            }
        });
        return new CreationResult(reactInstance, orCreate, reactHostImpl.reloadTask != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BridgelessReactContext getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$37(ReactHostImpl reactHostImpl, String str) {
        reactHostImpl.stateTracker.enterState(str, "Creating BridgelessReactContext");
        return new BridgelessReactContext(reactHostImpl.context, reactHostImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$38(ReactHostImpl reactHostImpl, Exception e10) {
        AbstractC2855l.g(e10, "e");
        reactHostImpl.handleHostException$ReactAndroid_release(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$39() {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B getOrCreateReactInstanceTask$lambda$44$lambda$42(final ReactHostImpl reactHostImpl, String str, final Task task) {
        AbstractC2855l.g(task, "task");
        if (task.isFaulted()) {
            reactHostImpl.uiExecutor.execute(new Runnable() { // from class: com.facebook.react.runtime.b
                @Override // java.lang.Runnable
                public final void run() {
                    ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$42$lambda$41(this.f20513g, task);
                }
            });
            return C2735B.f28704a;
        }
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.");
        }
        CreationResult creationResult = (CreationResult) result;
        ReactContext context = creationResult.getContext();
        boolean isReloading = creationResult.getIsReloading();
        boolean z10 = reactHostImpl.reactLifecycleStateManager.getState() == LifecycleState.RESUMED;
        if (!isReloading || z10) {
            reactHostImpl.reactLifecycleStateManager.resumeReactContextIfHostResumed(context, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        } else {
            reactHostImpl.reactLifecycleStateManager.moveToOnHostResume(context, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        }
        reactHostImpl.stateTracker.enterState(str, "Executing ReactInstanceEventListeners");
        Iterator<ReactInstanceEventListener> it = reactHostImpl.reactInstanceEventListeners.iterator();
        while (it.hasNext()) {
            it.next().onReactContextInitialized(context);
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$42$lambda$41(ReactHostImpl reactHostImpl, Task task) {
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        reactHostImpl.handleHostException$ReactAndroid_release(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance getOrCreateReactInstanceTask$lambda$44$lambda$43(Task task) {
        AbstractC2855l.g(task, "task");
        Object result = task.getResult();
        if (result != null) {
            return ((CreationResult) result).getInstance();
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Task<ReactInstance> getOrCreateReloadTask(final String reason) {
        final String str = "getOrCreateReloadTask()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateReloadTask()", null, 2, null);
        raiseSoftException$default(this, "getOrCreateReloadTask()", reason, null, 4, null);
        Task<ReactInstance> task = this.reloadTask;
        if (task != null) {
            return task;
        }
        final Function2 function2CreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Reload", "getOrCreateReloadTask()", reason);
        this.stateTracker.enterState("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
        Task<ReactInstance> taskContinueWithTask = this.createReactInstanceTaskRef.getAndReset().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.d
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$51(this.f20516a, str, function2CreateReactInstanceUnwrapper, reason, task2);
            }
        }, this.uiExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.e
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$52(function2CreateReactInstanceUnwrapper, this, str, task2);
            }
        }, this.bgExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.f
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$54(function2CreateReactInstanceUnwrapper, this, str, task2);
            }
        }, this.uiExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.g
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$55(function2CreateReactInstanceUnwrapper, this, str, task2);
            }
        }, this.bgExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.h
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$56(function2CreateReactInstanceUnwrapper, this, str, task2);
            }
        }, this.bgExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.i
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$57(this.f20532a, str, reason, task2);
            }
        }, this.bgExecutor);
        this.reloadTask = taskContinueWithTask;
        return taskContinueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$51(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        AbstractC2855l.g(task, "task");
        reactHostImpl.stateTracker.enterState(str, "Starting React Native reload");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting reload");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Reload reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        if (nullable != null && reactHostImpl2.reactLifecycleStateManager.getState() == LifecycleState.RESUMED) {
            reactHostImpl2.stateTracker.enterState(str3, "Calling ReactContext.onHostPause()");
            nullable.onHostPause();
        }
        return Task.INSTANCE.forResult(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$52(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        AbstractC2855l.g(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Surface shutdown");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$54(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        AbstractC2855l.g(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<InterfaceC3487a> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        MemoryPressureListener memoryPressureListener = reactHostImpl.memoryPressureListener;
        if (memoryPressureListener != null) {
            reactHostImpl.stateTracker.enterState(str, "Removing memory pressure listener");
            reactHostImpl.getMemoryPressureRouter().removeMemoryPressureListener(memoryPressureListener);
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable != null) {
            reactHostImpl.stateTracker.enterState(str, "Resetting ReactContext ref");
            reactHostImpl.bridgelessReactContextRef.reset();
            reactHostImpl.stateTracker.enterState(str, "Destroying ReactContext");
            nullable.destroy();
        }
        if (reactHostImpl.useDevSupport && nullable != null) {
            reactHostImpl.stateTracker.enterState(str, "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            reactHostImpl.getDevSupportManager().onReactInstanceDestroyed(nullable);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$55(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        AbstractC2855l.g(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.stateTracker.enterState(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.stateTracker.enterState(str2, "Destroying ReactInstance");
            reactInstance.destroy();
        }
        reactHostImpl2.stateTracker.enterState(str2, "Resetting start task ref");
        reactHostImpl2.startTask = null;
        return reactHostImpl2.getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$56(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        AbstractC2855l.g(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "5: Restarting surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface restart: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.startAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$57(ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        AbstractC2855l.g(task, "task");
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.");
            }
            reactHostImpl.raiseSoftException(str, "Error during reload. ReactInstance task faulted. Fault reason: " + error.getMessage() + ". Reload reason: " + str2, task.getError());
        }
        if (task.isCancelled()) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "Error during reload. ReactInstance task cancelled. Reload reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Resetting reload task ref");
        reactHostImpl2.reloadTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task<Void> getOrCreateStartTask() {
        Task<Void> task = this.startTask;
        if (task != null) {
            return task;
        }
        this.stateTracker.enterState("getOrCreateStartTask()", "Schedule");
        if (ReactBuildConfig.DEBUG) {
            AbstractC3007a.b(ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture(), "enableBridgelessArchitecture FeatureFlag must be set to start ReactNative.");
            AbstractC3007a.b(ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer(), "enableFabricRenderer FeatureFlag must be set to start ReactNative.");
            AbstractC3007a.b(ReactNativeNewArchitectureFeatureFlags.useTurboModules(), "useTurboModules FeatureFlag must be set to start ReactNative.");
        }
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            AbstractC3007a.b(!ReactNativeNewArchitectureFeatureFlags.useFabricInterop(), "useFabricInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
            AbstractC3007a.b(!ReactNativeNewArchitectureFeatureFlags.useTurboModuleInterop(), "useTurboModuleInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
        }
        Task taskContinueWithTask = waitThenCallGetOrCreateReactInstanceTask().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.u
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateStartTask$lambda$29(this.f20574a, task2);
            }
        }, this.bgExecutor);
        this.startTask = taskContinueWithTask;
        return taskContinueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateStartTask$lambda$29(ReactHostImpl reactHostImpl, Task task) {
        AbstractC2855l.g(task, "task");
        if (!task.isFaulted()) {
            return task.makeVoid();
        }
        final Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(error);
        } else {
            reactHostImpl.reactHostDelegate.handleInstanceException(error);
        }
        return Task.continueWithTask$default(reactHostImpl.getOrCreateDestroyTask("getOrCreateStartTask() failure: " + error.getMessage(), error), new Continuation() { // from class: com.facebook.react.runtime.c
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.getOrCreateStartTask$lambda$29$lambda$28(error, task2);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateStartTask$lambda$29$lambda$28(Exception exc, Task it) {
        AbstractC2855l.g(it, "it");
        return Task.INSTANCE.forError(exc);
    }

    private final Task<Boolean> isMetroRunning() {
        final String str = "isMetroRunning()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "isMetroRunning()", null, 2, null);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        getDevSupportManager().isPackagerRunning(new PackagerStatusCallback() { // from class: com.facebook.react.runtime.H
            @Override // com.facebook.react.devsupport.interfaces.PackagerStatusCallback
            public final void onPackagerStatusFetched(boolean z10) {
                ReactHostImpl._get_isMetroRunning_$lambda$46(this.f20475a, str, taskCompletionSource, z10);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B loadBundle$lambda$19(ReactHostImpl reactHostImpl, String str, JSBundleLoader jSBundleLoader, ReactInstance reactInstance) {
        AbstractC2855l.g(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.loadJSBundle(jSBundleLoader);
        return C2735B.f28704a;
    }

    private final Task<JSBundleLoader> loadJSBundleFromMetro() {
        final String str = "loadJSBundleFromMetro()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "loadJSBundleFromMetro()", null, 2, null);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        DevSupportManager devSupportManager = getDevSupportManager();
        AbstractC2855l.e(devSupportManager, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase");
        final DevSupportManagerBase devSupportManagerBase = (DevSupportManagerBase) devSupportManager;
        DevServerHelper devServerHelper = devSupportManagerBase.getDevServerHelper();
        String jsAppBundleName = devSupportManagerBase.getJsAppBundleName();
        if (jsAppBundleName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        final String devServerBundleURL = devServerHelper.getDevServerBundleURL(jsAppBundleName);
        devSupportManagerBase.reloadJSFromServer(devServerBundleURL, new BundleLoadCallback() { // from class: com.facebook.react.runtime.ReactHostImpl.loadJSBundleFromMetro.1
            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onError(Exception cause) {
                AbstractC2855l.g(cause, "cause");
                taskCompletionSource.setError(cause);
            }

            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onSuccess() {
                ReactHostImpl.this.stateTracker.enterState(str, "Creating BundleLoader");
                taskCompletionSource.setResult(JSBundleLoader.INSTANCE.createCachedBundleFromNetworkLoader(devServerBundleURL, devSupportManagerBase.getDownloadedJSBundleFile()));
            }
        });
        return taskCompletionSource.getTask();
    }

    private final void loadNetworkResource(String url, InspectorNetworkRequestListener listener) {
        InspectorNetworkHelper.loadNetworkResource(url, listener);
    }

    private final void maybeEnableDevSupport(boolean enabled) {
        if (this.useDevSupport) {
            getDevSupportManager().setDevSupportEnabled(enabled);
        }
    }

    private final void moveToHostDestroy(ReactContext currentContext) {
        this.reactLifecycleStateManager.moveToOnHostDestroy(currentContext);
        setCurrentActivity(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B prerenderSurface$lambda$2(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        AbstractC2855l.g(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.prerenderSurface(reactSurfaceImpl);
        return C2735B.f28704a;
    }

    private final void raiseSoftException(String callingMethod, String message, Throwable throwable) {
        String str = "raiseSoftException(" + callingMethod + ")";
        this.stateTracker.enterState(str, message);
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(str + ": " + message, throwable));
    }

    static /* synthetic */ void raiseSoftException$default(ReactHostImpl reactHostImpl, String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        reactHostImpl.raiseSoftException(str, str2, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B registerSegment$lambda$20(ReactHostImpl reactHostImpl, String str, int i10, String str2, Callback callback, ReactInstance reactInstance) {
        AbstractC2855l.g(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.registerSegment(i10, str2);
        if (callback == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callback.invoke(new Object[0]);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Task reload$lambda$8(final ReactHostImpl reactHostImpl, final String str) {
        Task<ReactInstance> orCreateReloadTask;
        Task<Void> task = reactHostImpl.destroyTask;
        if (task != null) {
            reactHostImpl.stateTracker.enterState("reload()", "Waiting for destroy to finish, before reloading React Native.");
            orCreateReloadTask = task.continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.p
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task2) {
                    return ReactHostImpl.reload$lambda$8$lambda$6$lambda$5(this.f20568a, str, task2);
                }
            }, reactHostImpl.bgExecutor);
            if (orCreateReloadTask == null) {
                orCreateReloadTask = reactHostImpl.getOrCreateReloadTask(str);
            }
        }
        return orCreateReloadTask.makeVoid().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.q
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                return ReactHostImpl.reload$lambda$8$lambda$7(this.f20570a, task2);
            }
        }, reactHostImpl.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task reload$lambda$8$lambda$6$lambda$5(ReactHostImpl reactHostImpl, String str, Task it) {
        AbstractC2855l.g(it, "it");
        return reactHostImpl.getOrCreateReloadTask(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task reload$lambda$8$lambda$7(ReactHostImpl reactHostImpl, Task task) {
        AbstractC2855l.g(task, "task");
        if (!task.isFaulted()) {
            return task;
        }
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(error);
        } else {
            reactHostImpl.reactHostDelegate.handleInstanceException(error);
        }
        return reactHostImpl.getOrCreateDestroyTask("Reload failed", error);
    }

    private final void setCurrentActivity(Activity activity) {
        this.activity.set(activity);
        if (activity != null) {
            this.lastUsedActivityRef.set(new WeakReference<>(activity));
        }
    }

    private final void setPausedInDebuggerMessage(String message) {
        if (message == null) {
            getDevSupportManager().hidePausedInDebuggerOverlay();
        } else {
            getDevSupportManager().showPausedInDebuggerOverlay(message, new DevSupportManager.PausedInDebuggerOverlayCommandListener() { // from class: com.facebook.react.runtime.ReactHostImpl.setPausedInDebuggerMessage.1
                @Override // com.facebook.react.devsupport.interfaces.DevSupportManager.PausedInDebuggerOverlayCommandListener
                public void onResume() {
                    UiThreadUtil.assertOnUiThread();
                    ReactHostInspectorTarget reactHostInspectorTarget = ReactHostImpl.this.getReactHostInspectorTarget();
                    if (reactHostInspectorTarget != null) {
                        reactHostInspectorTarget.sendDebuggerResumeCommand();
                    }
                }
            });
        }
    }

    private final void startAttachedSurfaces(String method, ReactInstance reactInstance) {
        this.stateTracker.enterState(method, "Restarting previously running React Native Surfaces");
        synchronized (this.attachedSurfaces) {
            try {
                Iterator<ReactSurfaceImpl> it = this.attachedSurfaces.iterator();
                while (it.hasNext()) {
                    reactInstance.startSurface(it.next());
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B startSurface$lambda$3(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        AbstractC2855l.g(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.startSurface(reactSurfaceImpl);
        return C2735B.f28704a;
    }

    private final void stopAttachedSurfaces(String method, ReactInstance reactInstance) {
        this.stateTracker.enterState(method, "Stopping all React Native surfaces");
        synchronized (this.attachedSurfaces) {
            try {
                for (ReactSurfaceImpl reactSurfaceImpl : this.attachedSurfaces) {
                    reactInstance.stopSurface(reactSurfaceImpl);
                    reactSurfaceImpl.clear();
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B stopSurface$lambda$4(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        AbstractC2855l.g(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.stopSurface(reactSurfaceImpl);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTask() {
        return waitThenCallGetOrCreateReactInstanceTaskWithRetries(0, 4);
    }

    private final Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTaskWithRetries(final int tryNum, final int maxTries) {
        Task<ReactInstance> task = this.reloadTask;
        if (task != null) {
            this.stateTracker.enterState("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return task;
        }
        Task<Void> task2 = this.destroyTask;
        if (task2 != null) {
            if (tryNum < maxTries) {
                this.stateTracker.enterState("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + tryNum + ").");
                return task2.onSuccessTask(new Continuation() { // from class: com.facebook.react.runtime.T
                    @Override // com.facebook.react.runtime.internal.bolts.Continuation
                    public final Object then(Task task3) {
                        return ReactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35(this.f20503a, tryNum, maxTries, task3);
                    }
                }, this.bgExecutor);
            }
            raiseSoftException$default(this, "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.", null, 4, null);
        }
        return getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35(ReactHostImpl reactHostImpl, int i10, int i11, Task it) {
        AbstractC2855l.g(it, "it");
        return reactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries(i10 + 1, i11);
    }

    @Override // com.facebook.react.ReactHost
    public void addBeforeDestroyListener(InterfaceC3487a onBeforeDestroy) {
        AbstractC2855l.g(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.add(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void addReactInstanceEventListener(ReactInstanceEventListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.reactInstanceEventListeners.add(listener);
    }

    public final void attachSurface$ReactAndroid_release(ReactSurfaceImpl surface) {
        AbstractC2855l.g(surface, "surface");
        ReactHostStateTracker.enterState$default(this.stateTracker, "attachSurface(surfaceId = " + surface.getSurfaceID() + ")", null, 2, null);
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.add(surface);
        }
    }

    public final Task<Boolean> callFunctionOnModule$ReactAndroid_release(final String moduleName, final String methodName, final NativeArray args) {
        AbstractC2855l.g(moduleName, "moduleName");
        AbstractC2855l.g(methodName, "methodName");
        AbstractC2855l.g(args, "args");
        return callWithExistingReactInstance$default(this, "callFunctionOnModule(\"" + moduleName + "\", \"" + methodName + "\")", null, new Function1() { // from class: com.facebook.react.runtime.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.callFunctionOnModule$lambda$21(moduleName, methodName, args, (ReactInstance) obj);
            }
        }, 2, null);
    }

    @Override // com.facebook.react.ReactHost
    public ReactSurface createSurface(Context context, String moduleName, Bundle initialProps) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(moduleName, "moduleName");
        ReactSurfaceImpl reactSurfaceImpl = new ReactSurfaceImpl(context, moduleName, initialProps);
        ReactSurfaceView reactSurfaceView = new ReactSurfaceView(context, reactSurfaceImpl);
        reactSurfaceView.setShouldLogContentAppeared(true);
        reactSurfaceImpl.attachView(reactSurfaceView);
        reactSurfaceImpl.attach(this);
        return reactSurfaceImpl;
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> destroy(String reason, Exception ex, final Function1 onDestroyFinished) {
        AbstractC2855l.g(reason, "reason");
        AbstractC2855l.g(onDestroyFinished, "onDestroyFinished");
        TaskInterface<Void> taskInterfaceDestroy = destroy(reason, ex);
        AbstractC2855l.e(taskInterfaceDestroy, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<java.lang.Void>");
        return Task.continueWith$default((Task) taskInterfaceDestroy, new Continuation() { // from class: com.facebook.react.runtime.k
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return ReactHostImpl.destroy$lambda$9(onDestroyFinished, task);
            }
        }, null, 2, null);
    }

    public final void detachSurface$ReactAndroid_release(ReactSurfaceImpl surface) {
        AbstractC2855l.g(surface, "surface");
        ReactHostStateTracker.enterState$default(this.stateTracker, "detachSurface(surfaceId = " + surface.getSurfaceID() + ")", null, 2, null);
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.remove(surface);
        }
    }

    public final Activity getCurrentActivity$ReactAndroid_release() {
        return this.activity.get();
    }

    @Override // com.facebook.react.ReactHost
    public ReactContext getCurrentReactContext() {
        return this.bridgelessReactContextRef.getNullable();
    }

    public final DefaultHardwareBackBtnHandler getDefaultBackButtonHandler$ReactAndroid_release() {
        return new DefaultHardwareBackBtnHandler() { // from class: com.facebook.react.runtime.G
            @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
            public final void invokeDefaultOnBackPressed() {
                ReactHostImpl._get_defaultBackButtonHandler_$lambda$18(this.f20474g);
            }
        };
    }

    @Override // com.facebook.react.ReactHost
    public DevSupportManager getDevSupportManager() {
        return this.devSupportManager;
    }

    public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
        EventDispatcher eventDispatcher;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (eventDispatcher = reactInstance.getEventDispatcher()) == null) ? BlackHoleEventDispatcher.INSTANCE : eventDispatcher;
    }

    public final JavaScriptContextHolder getJavaScriptContextHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    public final CallInvokerHolder getJsCallInvokerHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        raiseSoftException$default(this, "getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready", null, 4, null);
        return null;
    }

    public final Activity getLastUsedActivity$ReactAndroid_release() {
        WeakReference<Activity> weakReference = this.lastUsedActivityRef.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public LifecycleState getLifecycleState() {
        return this.reactLifecycleStateManager.getState();
    }

    @Override // com.facebook.react.ReactHost
    public MemoryPressureRouter getMemoryPressureRouter() {
        return this.memoryPressureRouter;
    }

    public final <T extends NativeModule> T getNativeModule$ReactAndroid_release(Class<T> nativeModuleInterface) {
        AbstractC2855l.g(nativeModuleInterface, "nativeModuleInterface");
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE && AbstractC2855l.b(nativeModuleInterface, UIManagerModule.class)) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose(TAG, new ReactNoCrashSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return (T) reactInstance.getNativeModule(nativeModuleInterface);
        }
        return null;
    }

    public final Collection<NativeModule> getNativeModules$ReactAndroid_release() {
        Collection<NativeModule> nativeModules;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (nativeModules = reactInstance.getNativeModules()) == null) ? AbstractC2800q.j() : nativeModules;
    }

    public final ReactHostInspectorTarget getOrCreateReactHostInspectorTarget$ReactAndroid_release() {
        if (this.reactHostInspectorTarget == null && InspectorFlags.getFuseboxEnabled()) {
            this.reactHostInspectorTarget = new ReactHostInspectorTarget(this);
        }
        return this.reactHostInspectorTarget;
    }

    /* JADX INFO: renamed from: getReactHostInspectorTarget$ReactAndroid_release, reason: from getter */
    public final ReactHostInspectorTarget getReactHostInspectorTarget() {
        return this.reactHostInspectorTarget;
    }

    @Override // com.facebook.react.ReactHost
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getReactQueueConfiguration();
        }
        return null;
    }

    public final RuntimeExecutor getRuntimeExecutor$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        raiseSoftException$default(this, "getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready", null, 4, null);
        return null;
    }

    public final FabricUIManager getUiManager$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getFabricUIManager();
        }
        return null;
    }

    public final void handleHostException$ReactAndroid_release(Exception e10) {
        AbstractC2855l.g(e10, "e");
        String str = "handleHostException(message = \"" + e10.getMessage() + "\")";
        ReactHostStateTracker.enterState$default(this.stateTracker, str, null, 2, null);
        if (this.useDevSupport) {
            getDevSupportManager().handleException(e10);
        } else {
            this.reactHostDelegate.handleInstanceException(e10);
        }
        destroy(str, e10);
    }

    public final <T extends NativeModule> boolean hasNativeModule$ReactAndroid_release(Class<T> nativeModuleInterface) {
        AbstractC2855l.g(nativeModuleInterface, "nativeModuleInterface");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.hasNativeModule(nativeModuleInterface);
        }
        return false;
    }

    @Override // com.facebook.react.ReactHost
    public void invalidate() {
        AbstractC2325a.b(TAG, "ReactHostImpl.invalidate()");
        this.hostInvalidated = true;
        destroy("ReactHostImpl.invalidate()", null);
    }

    public final boolean isInstanceInitialized$ReactAndroid_release() {
        return this.reactInstance != null;
    }

    public final boolean isSurfaceAttached$ReactAndroid_release(ReactSurfaceImpl surface) {
        boolean zContains;
        AbstractC2855l.g(surface, "surface");
        synchronized (this.attachedSurfaces) {
            zContains = this.attachedSurfaces.contains(surface);
        }
        return zContains;
    }

    public final boolean isSurfaceWithModuleNameAttached$ReactAndroid_release(String moduleName) {
        boolean z10;
        AbstractC2855l.g(moduleName, "moduleName");
        synchronized (this.attachedSurfaces) {
            try {
                Set<ReactSurfaceImpl> set = this.attachedSurfaces;
                z10 = false;
                if (set == null || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (AbstractC2855l.b(((ReactSurfaceImpl) it.next()).getModuleName(), moduleName)) {
                            z10 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final Task<Boolean> loadBundle$ReactAndroid_release(final JSBundleLoader bundleLoader) {
        AbstractC2855l.g(bundleLoader, "bundleLoader");
        final String str = "loadBundle()";
        this.stateTracker.enterState("loadBundle()", "Schedule");
        return callWithExistingReactInstance$default(this, "loadBundle()", null, new Function1() { // from class: com.facebook.react.runtime.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.loadBundle$lambda$19(this.f20481g, str, bundleLoader, (ReactInstance) obj);
            }
        }, 2, null);
    }

    @Override // com.facebook.react.ReactHost
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        AbstractC2855l.g(activity, "activity");
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + requestCode + "\", resultCode = \"" + resultCode + "\", data = \"" + data + "\")";
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, requestCode, resultCode, data);
        } else {
            raiseSoftException$default(this, str, "Tried to access onActivityResult while context is not ready", null, 4, null);
        }
    }

    @Override // com.facebook.react.ReactHost
    public boolean onBackPressed() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.getNativeModule(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // com.facebook.react.ReactHost
    public void onConfigurationChanged(Context context) {
        AbstractC2855l.g(context, "context");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (ReactNativeFeatureFlags.enableFontScaleChangesUpdatingLayout()) {
                float pixelFromSP = PixelUtil.toPixelFromSP(1.0d);
                DisplayMetricsHolder.initDisplayMetrics(currentReactContext);
                if (pixelFromSP != PixelUtil.toPixelFromSP(1.0d)) {
                    synchronized (this.attachedSurfaces) {
                        try {
                            Iterator<T> it = this.attachedSurfaces.iterator();
                            while (it.hasNext()) {
                                ReactSurfaceView view = ((ReactSurfaceImpl) it.next()).getView();
                                if (view != null) {
                                    view.requestLayout();
                                }
                            }
                            C2735B c2735b = C2735B.f28704a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            AppearanceModule appearanceModule = (AppearanceModule) currentReactContext.getNativeModule(AppearanceModule.class);
            if (appearanceModule != null) {
                appearanceModule.onConfigurationChanged(context);
            }
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostDestroy()", null, 2, null);
        maybeEnableDevSupport(false);
        moveToHostDestroy(getCurrentReactContext());
    }

    @Override // com.facebook.react.ReactHost
    public void onHostLeaveHint(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onUserLeaveHint(activity)", null, 2, null);
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onUserLeaveHint(activity);
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostPause(activity)", null, 2, null);
        Activity currentActivity$ReactAndroid_release = getCurrentActivity$ReactAndroid_release();
        if (currentActivity$ReactAndroid_release != null) {
            boolean z10 = activity == currentActivity$ReactAndroid_release;
            if (!z10) {
                String str = "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + currentActivity$ReactAndroid_release.getClass().getSimpleName() + " Paused activity: " + (activity == null ? "null" : activity.getClass().getSimpleName());
                if (ReactNativeFeatureFlags.skipActivityIdentityAssertionOnHostPause()) {
                    AbstractC2325a.K(TAG, "onHostPause(activity)", str);
                } else {
                    AbstractC3007a.b(z10, str);
                }
            }
        }
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.moveToOnHostPause(getCurrentReactContext(), currentActivity$ReactAndroid_release);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(Activity activity, DefaultHardwareBackBtnHandler defaultBackButtonImpl) {
        this.defaultHardwareBackBtnHandler = defaultBackButtonImpl;
        onHostResume(activity);
    }

    @Override // com.facebook.react.ReactHost
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        AbstractC2855l.g(intent, "intent");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            raiseSoftException$default(this, "onNewIntent(intent = \"" + intent + "\")", "Tried to access onNewIntent while context is not ready", null, 4, null);
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && ((AbstractC2855l.b("android.intent.action.VIEW", action) || AbstractC2855l.b("android.nfc.action.NDEF_DISCOVERED", action)) && (deviceEventManagerModule = (DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(getCurrentActivity$ReactAndroid_release(), intent);
    }

    @Override // com.facebook.react.ReactHost
    public void onWindowFocusChange(boolean hasFocus) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onWindowFocusChange(hasFocus);
            return;
        }
        raiseSoftException$default(this, "onWindowFocusChange(hasFocus = \"" + hasFocus + "\")", "Tried to access onWindowFocusChange while context is not ready", null, 4, null);
    }

    public final TaskInterface<Void> prerenderSurface$ReactAndroid_release(final ReactSurfaceImpl surface) {
        AbstractC2855l.g(surface, "surface");
        final String str = "prerenderSurface(surfaceId = " + surface.getSurfaceID() + ")";
        this.stateTracker.enterState(str, "Schedule");
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.prerenderSurface$lambda$2(this.f20559g, str, surface, (ReactInstance) obj);
            }
        });
    }

    public final Task<Boolean> registerSegment$ReactAndroid_release(final int segmentId, final String path, final Callback callback) {
        AbstractC2855l.g(path, "path");
        final String str = "registerSegment(segmentId = \"" + segmentId + "\", path = \"" + path + "\")";
        this.stateTracker.enterState(str, "Schedule");
        return callWithExistingReactInstance$default(this, str, null, new Function1() { // from class: com.facebook.react.runtime.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.registerSegment$lambda$20(this.f20553g, str, segmentId, path, callback, (ReactInstance) obj);
            }
        }, 2, null);
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> reload(final String reason) {
        AbstractC2855l.g(reason, "reason");
        return Task.INSTANCE.call(new Callable() { // from class: com.facebook.react.runtime.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactHostImpl.reload$lambda$8(this.f20579a, reason);
            }
        }, this.bgExecutor);
    }

    @Override // com.facebook.react.ReactHost
    public void removeBeforeDestroyListener(InterfaceC3487a onBeforeDestroy) {
        AbstractC2855l.g(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.remove(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void removeReactInstanceEventListener(ReactInstanceEventListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.reactInstanceEventListeners.remove(listener);
    }

    @Override // com.facebook.react.ReactHost
    public void setBundleSource(String filePath) {
        AbstractC2855l.g(filePath, "filePath");
        getDevSupportManager().setBundleFilePath(filePath);
        reload("Change bundle source");
    }

    @Override // com.facebook.react.ReactHost
    public void setDevMenuConfiguration(DevMenuConfiguration config) {
        AbstractC2855l.g(config, "config");
        getDevSupportManager().setDevMenuEnabled(config.getDevMenuEnabled());
        getDevSupportManager().setShakeGestureEnabled(config.getShakeGestureEnabled());
        getDevSupportManager().setKeyboardShortcutsEnabled(config.getKeyboardShortcutsEnabled());
    }

    public final void setReactHostInspectorTarget$ReactAndroid_release(ReactHostInspectorTarget reactHostInspectorTarget) {
        this.reactHostInspectorTarget = reactHostInspectorTarget;
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> start() {
        return Task.INSTANCE.call(new Callable() { // from class: com.facebook.react.runtime.M
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20491a.getOrCreateStartTask();
            }
        }, this.bgExecutor);
    }

    public final TaskInterface<Void> startSurface$ReactAndroid_release(final ReactSurfaceImpl surface) {
        AbstractC2855l.g(surface, "surface");
        final String str = "startSurface(surfaceId = " + surface.getSurfaceID() + ")";
        this.stateTracker.enterState(str, "Schedule");
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.startSurface$lambda$3(this.f20478g, str, surface, (ReactInstance) obj);
            }
        });
    }

    public final TaskInterface<Void> stopSurface$ReactAndroid_release(final ReactSurfaceImpl surface) {
        AbstractC2855l.g(surface, "surface");
        final String str = "stopSurface(surfaceId = " + surface.getSurfaceID() + ")";
        this.stateTracker.enterState(str, "Schedule");
        detachSurface$ReactAndroid_release(surface);
        return callWithExistingReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.stopSurface$lambda$4(this.f20468g, str, surface, (ReactInstance) obj);
            }
        }).makeVoid();
    }

    public final void unregisterInstanceFromInspector$ReactAndroid_release(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.reactHostInspectorTarget;
                boolean z10 = false;
                if (reactHostInspectorTarget != null && reactHostInspectorTarget.isValid()) {
                    z10 = true;
                }
                AbstractC3007a.b(z10, "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> destroy(final String reason, final Exception ex) {
        AbstractC2855l.g(reason, "reason");
        return Task.INSTANCE.call(new Callable() { // from class: com.facebook.react.runtime.K
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactHostImpl.destroy$lambda$11(this.f20484a, reason, ex);
            }
        }, this.bgExecutor);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostResume(activity)", null, 2, null);
        setCurrentActivity(activity);
        maybeEnableDevSupport(true);
        this.reactLifecycleStateManager.moveToOnHostResume(getCurrentReactContext(), activity);
    }

    @Override // com.facebook.react.ReactHost
    public void setBundleSource(String debugServerHost, String moduleName, Function1 queryMapper) {
        AbstractC2855l.g(debugServerHost, "debugServerHost");
        AbstractC2855l.g(moduleName, "moduleName");
        AbstractC2855l.g(queryMapper, "queryMapper");
        AbstractC1417k.d(R8.O.a(C1404d0.a()), null, null, new C20431(queryMapper, debugServerHost, moduleName, null), 3, null);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostDestroy(activity)", null, 2, null);
        if (getCurrentActivity$ReactAndroid_release() == activity) {
            maybeEnableDevSupport(false);
            moveToHostDestroy(getCurrentReactContext());
        }
    }

    public final NativeModule getNativeModule$ReactAndroid_release(String nativeModuleName) {
        AbstractC2855l.g(nativeModuleName, "nativeModuleName");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getNativeModule(nativeModuleName);
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostPause()", null, 2, null);
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.moveToOnHostPause(getCurrentReactContext(), getCurrentActivity$ReactAndroid_release());
    }

    public /* synthetic */ ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z10, boolean z11, DevSupportManagerFactory devSupportManagerFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, reactHostDelegate, componentFactory, (i10 & 8) != 0 ? Executors.newSingleThreadExecutor() : executor, (i10 & 16) != 0 ? Task.UI_THREAD_EXECUTOR : executor2, z10, z11, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : devSupportManagerFactory);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactHostImpl(Context context, ReactHostDelegate delegate, ComponentFactory componentFactory, boolean z10, boolean z11) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(componentFactory, "componentFactory");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC2855l.f(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this(context, delegate, componentFactory, executorServiceNewSingleThreadExecutor, Task.UI_THREAD_EXECUTOR, z10, z11, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null);
    }
}
