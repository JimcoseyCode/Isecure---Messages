package com.facebook.react.shell;

import B7.d;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ClassFinder;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolsruntimesettings.ReactDevToolsRuntimeSettingsModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.reactdevtoolssettings.ReactDevToolsSettingsManagerModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.PreparedLayoutTextViewManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import i7.t;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.K;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u001a\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/shell/MainReactPackage;", "Lcom/facebook/react/BaseReactPackage;", "Lcom/facebook/react/ViewManagerOnDemandReactPackage;", "config", "Lcom/facebook/react/shell/MainPackageConfig;", "<init>", "(Lcom/facebook/react/shell/MainPackageConfig;)V", "getModule", "Lcom/facebook/react/bridge/NativeModule;", "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ViewManager;", "viewManagersMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ModuleSpec;", "getViewManagersMap$annotations", "()V", "getViewManagersMap", "()Ljava/util/Map;", "getViewManagers", "getViewManagerNames", PointerEventHelper.POINTER_TYPE_UNKNOWN, "createViewManager", "viewManagerName", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "fallbackForMissingClass", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainReactPackage extends BaseReactPackage implements ViewManagerOnDemandReactPackage {
    private final MainPackageConfig config;
    private final Map<String, ModuleSpec> viewManagersMap;

    /* JADX WARN: Multi-variable type inference failed */
    public MainReactPackage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ReactModuleInfoProvider fallbackForMissingClass() {
        Class[] clsArr = (Class[]) AbstractC2793j.D(new Class[]{AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, ReactNativeFeatureFlags.cxxNativeAnimatedEnabled() ? null : NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ReactDevToolsSettingsManagerModule.class, ReactDevToolsRuntimeSettingsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class}).toArray(new Class[0]);
        ArrayList<Class<?>> arrayList = new ArrayList();
        for (Class cls : clsArr) {
            if (cls.isAnnotationPresent(ReactModule.class)) {
                arrayList.add(cls);
            }
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(d.d(K.e(AbstractC2800q.u(arrayList, 10)), 16));
        for (Class<?> cls2 : arrayList) {
            Annotation annotation = cls2.getAnnotation(ReactModule.class);
            if (annotation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReactModule reactModule = (ReactModule) annotation;
            String strName = reactModule.name();
            String strName2 = reactModule.name();
            String name = cls2.getName();
            AbstractC2855l.f(name, "getName(...)");
            Pair pairA = t.a(strName, new ReactModuleInfo(strName2, name, reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), ReactModuleInfo.INSTANCE.classIsTurboModule(cls2)));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return new ReactModuleInfoProvider() { // from class: x3.a
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return MainReactPackage.fallbackForMissingClass$lambda$17(linkedHashMap);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$0() {
        return new ReactDrawerLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$1() {
        return new ReactHorizontalScrollViewManager(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$10() {
        return new ReactModalHostManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$11() {
        return new ReactTextInputManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NativeModule viewManagersMap$lambda$12() {
        return ReactNativeFeatureFlags.enablePreparedTextLayout() ? new PreparedLayoutTextViewManager(null, 1, null) : new ReactTextViewManager(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$13() {
        return new ReactViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$14() {
        return new ReactUnimplementedViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$2() {
        return new ReactHorizontalScrollContainerViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$3() {
        return new ReactProgressBarViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$4() {
        return new ReactSafeAreaViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$5() {
        return new ReactScrollViewManager(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$6() {
        return new ReactSwitchManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$7() {
        return new SwipeRefreshLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$8() {
        return new FrescoBasedReactTextInlineImageViewManager(null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$9() {
        return new ReactImageManager(null, null, null, 7, null);
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public ViewManager<?, ?> createViewManager(ReactApplicationContext reactContext, String viewManagerName) {
        Provider provider;
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = this.viewManagersMap.get(viewManagerName);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return AbstractC2800q.m(new ReactDrawerLayoutManager(), new ReactHorizontalScrollViewManager(null, 1, null), new ReactHorizontalScrollContainerViewManager(), new ReactProgressBarViewManager(), new ReactScrollViewManager(null, 1, null), new ReactSwitchManager(), new ReactSafeAreaViewManager(), new SwipeRefreshLayoutManager(), new FrescoBasedReactTextInlineImageViewManager(null, null, 3, null), new ReactImageManager(null, null, null, 7, null), new ReactModalHostManager(), new ReactTextInputManager(), ReactNativeFeatureFlags.enablePreparedTextLayout() ? new PreparedLayoutTextViewManager(null, 1, null) : new ReactTextViewManager(null, 1, 0 == true ? 1 : 0), new ReactViewManager(), new ReactUnimplementedViewManager());
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(reactContext, "reactContext");
        if (AbstractC2855l.b(name, "AccessibilityInfo")) {
            return new AccessibilityInfoModule(reactContext);
        }
        if (AbstractC2855l.b(name, "Appearance")) {
            return new AppearanceModule(reactContext, null, 2, null);
        }
        if (AbstractC2855l.b(name, "AppState")) {
            return new AppStateModule(reactContext);
        }
        if (AbstractC2855l.b(name, "BlobModule")) {
            return new BlobModule(reactContext);
        }
        if (AbstractC2855l.b(name, "DevLoadingView")) {
            return new DevLoadingModule(reactContext);
        }
        if (AbstractC2855l.b(name, FileReaderModule.INSTANCE.getNAME())) {
            return new FileReaderModule(reactContext);
        }
        if (AbstractC2855l.b(name, "Clipboard")) {
            return new ClipboardModule(reactContext);
        }
        if (AbstractC2855l.b(name, "DialogManagerAndroid")) {
            return new DialogModule(reactContext);
        }
        if (AbstractC2855l.b(name, FrescoModule.NAME)) {
            MainPackageConfig mainPackageConfig = this.config;
            return new FrescoModule(reactContext, true, mainPackageConfig != null ? mainPackageConfig.getFrescoConfig() : null);
        }
        if (AbstractC2855l.b(name, "I18nManager")) {
            return new I18nManagerModule(reactContext);
        }
        if (AbstractC2855l.b(name, "ImageLoader")) {
            return new ImageLoaderModule(reactContext);
        }
        if (AbstractC2855l.b(name, "ImageStoreManager")) {
            return new ImageStoreManager(reactContext);
        }
        if (AbstractC2855l.b(name, "IntentAndroid")) {
            return new IntentModule(reactContext);
        }
        if (AbstractC2855l.b(name, "NativeAnimatedModule")) {
            if (ReactNativeFeatureFlags.cxxNativeAnimatedEnabled()) {
                return null;
            }
            return new NativeAnimatedModule(reactContext);
        }
        if (AbstractC2855l.b(name, "Networking")) {
            return new NetworkingModule(reactContext);
        }
        if (AbstractC2855l.b(name, "PermissionsAndroid")) {
            return new PermissionsModule(reactContext);
        }
        if (AbstractC2855l.b(name, "ShareModule")) {
            return new ShareModule(reactContext);
        }
        if (AbstractC2855l.b(name, "StatusBarManager")) {
            return new StatusBarModule(reactContext);
        }
        if (AbstractC2855l.b(name, "SoundManager")) {
            return new SoundManagerModule(reactContext);
        }
        if (AbstractC2855l.b(name, "ToastAndroid")) {
            return new ToastModule(reactContext);
        }
        if (AbstractC2855l.b(name, "Vibration")) {
            return new VibrationModule(reactContext);
        }
        if (AbstractC2855l.b(name, "WebSocketModule")) {
            return new WebSocketModule(reactContext);
        }
        if (AbstractC2855l.b(name, "ReactDevToolsSettingsManager")) {
            return new ReactDevToolsSettingsManagerModule(reactContext);
        }
        if (AbstractC2855l.b(name, "ReactDevToolsRuntimeSettingsModule")) {
            return new ReactDevToolsRuntimeSettingsModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        if (!ClassFinder.canLoadClassesFromAnnotationProcessors()) {
            return fallbackForMissingClass();
        }
        try {
            Class<?> clsFindClass = ClassFinder.findClass("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider");
            Object objNewInstance = clsFindClass != null ? clsFindClass.newInstance() : null;
            ReactModuleInfoProvider reactModuleInfoProvider = objNewInstance instanceof ReactModuleInfoProvider ? (ReactModuleInfoProvider) objNewInstance : null;
            return reactModuleInfoProvider == null ? fallbackForMissingClass() : reactModuleInfoProvider;
        } catch (ClassNotFoundException unused) {
            return fallbackForMissingClass();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public Collection<String> getViewManagerNames(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return this.viewManagersMap.keySet();
    }

    @Override // com.facebook.react.BaseReactPackage
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return AbstractC2800q.P0(this.viewManagersMap.values());
    }

    public final Map<String, ModuleSpec> getViewManagersMap() {
        return this.viewManagersMap;
    }

    public /* synthetic */ MainReactPackage(MainPackageConfig mainPackageConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : mainPackageConfig);
    }

    public MainReactPackage(MainPackageConfig mainPackageConfig) {
        this.config = mainPackageConfig;
        ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
        this.viewManagersMap = K.l(t.a(ReactDrawerLayoutManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.h
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$0();
            }
        })), t.a(ReactHorizontalScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.n
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$1();
            }
        })), t.a(ReactHorizontalScrollContainerViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.o
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$2();
            }
        })), t.a(ReactProgressBarViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.p
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$3();
            }
        })), t.a(ReactSafeAreaViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.b
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$4();
            }
        })), t.a(ReactScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.c
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$5();
            }
        })), t.a(ReactSwitchManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.d
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$6();
            }
        })), t.a(SwipeRefreshLayoutManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.e
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$7();
            }
        })), t.a(FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.f
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$8();
            }
        })), t.a(ReactImageManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.g
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$9();
            }
        })), t.a(ReactModalHostManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.i
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$10();
            }
        })), t.a(ReactTextInputManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.j
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$11();
            }
        })), t.a("RCTText", companion.viewManagerSpec(new Provider() { // from class: x3.k
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$12();
            }
        })), t.a("RCTView", companion.viewManagerSpec(new Provider() { // from class: x3.l
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$13();
            }
        })), t.a(ReactUnimplementedViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: x3.m
            @Override // javax.inject.Provider
            public final Object get() {
                return MainReactPackage.viewManagersMap$lambda$14();
            }
        })));
    }

    public static /* synthetic */ void getViewManagersMap$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map fallbackForMissingClass$lambda$17(Map map) {
        return map;
    }
}
