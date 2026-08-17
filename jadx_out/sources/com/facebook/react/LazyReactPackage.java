package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH$J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J&\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\u0013\u0012\u0006\b\u0000\u0012\u00020\u00130\u00120\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/LazyReactPackage;", "Lcom/facebook/react/ReactPackage;", "<init>", "()V", "getNativeModuleIterator", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ModuleHolder;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getNativeModules", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ModuleSpec;", "internal_getNativeModules", "internal_getNativeModules$ReactAndroid_release", "createNativeModules", "Lcom/facebook/react/bridge/NativeModule;", "getViewManagers", "createViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "reactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "getReactModuleInfoProvider", "()Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class LazyReactPackage implements ReactPackage {
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/LazyReactPackage$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.LazyReactPackage$getNativeModuleIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"com/facebook/react/LazyReactPackage$getNativeModuleIterator$1", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ModuleHolder;", "iterator", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterable<ModuleHolder>, InterfaceC3550a {
        final /* synthetic */ List<ModuleSpec> $nativeModules;
        final /* synthetic */ Map<String, ReactModuleInfo> $reactModuleInfoMap;

        AnonymousClass1(List<ModuleSpec> list, Map<String, ReactModuleInfo> map) {
            this.$nativeModules = list;
            this.$reactModuleInfoMap = map;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new LazyReactPackage$getNativeModuleIterator$1$iterator$1(new kotlin.jvm.internal.A(), this.$nativeModules, this.$reactModuleInfoMap);
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("LazyReactPackage", LegacyArchitectureLogLevel.ERROR);
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        List listC = AbstractC2800q.c();
        for (ModuleSpec moduleSpec : getNativeModules(reactContext)) {
            B3.b.a(0L, "createNativeModule").c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.moduleName());
            try {
                Object obj = moduleSpec.provider().get();
                AbstractC2855l.f(obj, "get(...)");
                NativeModule nativeModule = (NativeModule) obj;
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                B3.b.b(0L).c();
                listC.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                B3.b.b(0L).c();
                throw th;
            }
        }
        return AbstractC2800q.a(listC);
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        List<ModuleSpec> viewManagers = getViewManagers(reactContext);
        if (viewManagers.isEmpty()) {
            return AbstractC2800q.j();
        }
        List listC = AbstractC2800q.c();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            Object obj = it.next().provider().get();
            AbstractC2855l.e(obj, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<in kotlin.Nothing, in kotlin.Nothing>");
            listC.add((ViewManager) obj);
        }
        return AbstractC2800q.a(listC);
    }

    public final Iterable<ModuleHolder> getNativeModuleIterator(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return new AnonymousClass1(getNativeModules(reactContext), getReactModuleInfoProvider().getReactModuleInfos());
    }

    protected abstract List<ModuleSpec> getNativeModules(ReactApplicationContext reactContext);

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return AbstractC2800q.j();
    }

    public final List<ModuleSpec> internal_getNativeModules$ReactAndroid_release(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return getNativeModules(reactContext);
    }
}
