package expo.modules;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.ExpoModulesPackageList;
import expo.modules.adapters.react.ModuleRegistryAdapter;
import expo.modules.core.ModulePriorities;
import expo.modules.core.interfaces.Package;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.AbstractC2884a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lexpo/modules/ExpoModulesPackage;", "Lcom/facebook/react/ReactPackage;", "<init>", "()V", "moduleRegistryAdapter", "Lexpo/modules/adapters/react/ModuleRegistryAdapter;", "getModuleRegistryAdapter", "()Lexpo/modules/adapters/react/ModuleRegistryAdapter;", "createNativeModules", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "Companion", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoModulesPackage implements ReactPackage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy packageList$delegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ExpoModulesPackage.packageList_delegate$lambda$1();
        }
    });
    private final ModuleRegistryAdapter moduleRegistryAdapter = new ModuleRegistryAdapter(INSTANCE.getPackageList());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lexpo/modules/ExpoModulesPackage$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "packageList", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/core/interfaces/Package;", "getPackageList$annotations", "getPackageList", "()Ljava/util/List;", "packageList$delegate", "Lkotlin/Lazy;", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Package> getPackageList() {
            return (List) ExpoModulesPackage.packageList$delegate.getValue();
        }

        private Companion() {
        }

        public static /* synthetic */ void getPackageList$annotations() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List packageList_delegate$lambda$1() {
        try {
            ExpoModulesPackageList.Companion companion = ExpoModulesPackageList.INSTANCE;
            Object objInvoke = ExpoModulesPackageList.class.getMethod("getPackageList", null).invoke(null, null);
            AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
            return AbstractC2800q.H0((List) objInvoke, new Comparator() { // from class: expo.modules.ExpoModulesPackage$packageList_delegate$lambda$1$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    ModulePriorities modulePriorities = ModulePriorities.INSTANCE;
                    return AbstractC2884a.a(Integer.valueOf(modulePriorities.get(D.b(((Package) t11).getClass()).n())), Integer.valueOf(modulePriorities.get(D.b(((Package) t10).getClass()).n())));
                }
            });
        } catch (Exception unused) {
            return AbstractC2800q.j();
        }
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        List<NativeModule> listCreateNativeModules = this.moduleRegistryAdapter.createNativeModules(reactContext);
        AbstractC2855l.f(listCreateNativeModules, "createNativeModules(...)");
        return listCreateNativeModules;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        List<ViewManager<?, ?>> listCreateViewManagers = this.moduleRegistryAdapter.createViewManagers(reactContext);
        AbstractC2855l.f(listCreateViewManagers, "createViewManagers(...)");
        return listCreateViewManagers;
    }

    public final ModuleRegistryAdapter getModuleRegistryAdapter() {
        return this.moduleRegistryAdapter;
    }
}
