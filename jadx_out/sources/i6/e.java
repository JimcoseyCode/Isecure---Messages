package I6;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import i7.AbstractC2746i;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends BaseReactPackage implements ViewManagerOnDemandReactPackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f5049a = AbstractC2746i.b(new InterfaceC3487a() { // from class: I6.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return e.g();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map e() {
        Annotation annotation = RNGestureHandlerModule.class.getAnnotation(ReactModule.class);
        AbstractC2855l.d(annotation);
        ReactModule reactModule = (ReactModule) annotation;
        String strName = reactModule.name();
        String name = RNGestureHandlerModule.class.getName();
        AbstractC2855l.f(name, "getName(...)");
        return K.m(t.a("RNGestureHandlerModule", new ReactModuleInfo(strName, name, reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), true)));
    }

    private final Map f() {
        return (Map) this.f5049a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map g() {
        ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
        return K.l(t.a(RNGestureHandlerRootViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: I6.c
            @Override // javax.inject.Provider
            public final Object get() {
                return e.h();
            }
        })), t.a(RNGestureHandlerButtonViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: I6.d
            @Override // javax.inject.Provider
            public final Object get() {
                return e.i();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule h() {
        return new RNGestureHandlerRootViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule i() {
        return new RNGestureHandlerButtonViewManager();
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public ViewManager createViewManager(ReactApplicationContext reactContext, String viewManagerName) {
        Provider provider;
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) f().get(viewManagerName);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return AbstractC2800q.m(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(reactContext, "reactContext");
        if (AbstractC2855l.b(name, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() throws InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(null).newInstance(null);
            AbstractC2855l.e(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (ReactModuleInfoProvider) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new ReactModuleInfoProvider() { // from class: I6.b
                @Override // com.facebook.react.module.model.ReactModuleInfoProvider
                public final Map getReactModuleInfos() {
                    return e.e();
                }
            };
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    protected List getViewManagers(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return AbstractC2800q.R0(f().values());
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public List getViewManagerNames(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return AbstractC2800q.P0(f().keySet());
    }
}
