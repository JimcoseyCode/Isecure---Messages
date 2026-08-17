package com.facebook.react;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import j7.AbstractC2800q;
import j7.K;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0007H\u0016R'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/DebugCorePackage;", "Lcom/facebook/react/BaseReactPackage;", "Lcom/facebook/react/ViewManagerOnDemandReactPackage;", "<init>", "()V", "viewManagersMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ModuleSpec;", "getViewManagersMap", "()Ljava/util/Map;", "viewManagersMap$delegate", "Lkotlin/Lazy;", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "getModule", "Lcom/facebook/react/bridge/NativeModule;", "name", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getViewManagers", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getViewManagerNames", PointerEventHelper.POINTER_TYPE_UNKNOWN, "createViewManager", "Lcom/facebook/react/uimanager/ViewManager;", "viewManagerName", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugCorePackage extends BaseReactPackage implements ViewManagerOnDemandReactPackage {

    /* JADX INFO: renamed from: viewManagersMap$delegate, reason: from kotlin metadata */
    private final Lazy viewManagersMap = AbstractC2746i.a(EnumC2749l.f28718i, new InterfaceC3487a() { // from class: com.facebook.react.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return DebugCorePackage.viewManagersMap_delegate$lambda$1();
        }
    });

    private final Map<String, ModuleSpec> getViewManagersMap() {
        return (Map) this.viewManagersMap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map viewManagersMap_delegate$lambda$1() {
        return K.f(i7.t.a(DebuggingOverlayManager.REACT_CLASS, ModuleSpec.INSTANCE.viewManagerSpec(new Provider() { // from class: com.facebook.react.c
            @Override // javax.inject.Provider
            public final Object get() {
                return DebugCorePackage.viewManagersMap_delegate$lambda$1$lambda$0();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap_delegate$lambda$1$lambda$0() {
        return new DebuggingOverlayManager();
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public ViewManager<?, ?> createViewManager(ReactApplicationContext reactContext, String viewManagerName) {
        Provider provider;
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(viewManagerName, "viewManagerName");
        ModuleSpec orDefault = getViewManagersMap().getOrDefault(viewManagerName, null);
        NativeModule nativeModule = (orDefault == null || (provider = orDefault.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(reactContext, "reactContext");
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.facebook.react.b
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return K.i();
            }
        };
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public Collection<String> getViewManagerNames(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return getViewManagersMap().keySet();
    }

    @Override // com.facebook.react.BaseReactPackage
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return AbstractC2800q.P0(getViewManagersMap().values());
    }
}
