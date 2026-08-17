package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.runtime.cxxreactpackage.CxxReactPackage;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "packages", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/ReactPackage;", "cxxReactPackages", "Lcom/facebook/react/runtime/cxxreactpackage/CxxReactPackage;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "Builder", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultTurboModuleManagerDelegate extends ReactPackageTurboModuleManagerDelegate {
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u0007\u0010\u000bJ'\u0010\r\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\t¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R,\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$Builder;", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "<init>", "()V", "Lkotlin/Function0;", "Lcom/facebook/react/runtime/cxxreactpackage/CxxReactPackage;", "provider", "addCxxReactPackage", "(Lw7/a;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$Builder;", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$Builder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "addCxxReactPackages", "context", "Lcom/facebook/react/ReactPackage;", "packages", "Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "build", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cxxReactPackageProviders", "Ljava/util/List;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder extends ReactPackageTurboModuleManagerDelegate.Builder {
        private final List<Function1> cxxReactPackageProviders = new ArrayList();

        /* JADX INFO: Access modifiers changed from: private */
        public static final List addCxxReactPackage$lambda$1$lambda$0(InterfaceC3487a interfaceC3487a, ReactApplicationContext reactApplicationContext) {
            AbstractC2855l.g(reactApplicationContext, "<unused var>");
            return AbstractC2800q.e(interfaceC3487a.invoke());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List addCxxReactPackage$lambda$3$lambda$2(Function1 function1, ReactApplicationContext context) {
            AbstractC2855l.g(context, "context");
            return AbstractC2800q.e(function1.invoke(context));
        }

        public final Builder addCxxReactPackage(final InterfaceC3487a provider) {
            AbstractC2855l.g(provider, "provider");
            this.cxxReactPackageProviders.add(new Function1() { // from class: com.facebook.react.defaults.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultTurboModuleManagerDelegate.Builder.addCxxReactPackage$lambda$1$lambda$0(provider, (ReactApplicationContext) obj);
                }
            });
            return this;
        }

        public final Builder addCxxReactPackages(Function1 provider) {
            AbstractC2855l.g(provider, "provider");
            this.cxxReactPackageProviders.add(provider);
            return this;
        }

        @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.Builder
        public /* bridge */ /* synthetic */ ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext reactApplicationContext, List list) {
            return build(reactApplicationContext, (List<? extends ReactPackage>) list);
        }

        public final Builder addCxxReactPackage(final Function1 provider) {
            AbstractC2855l.g(provider, "provider");
            this.cxxReactPackageProviders.add(new Function1() { // from class: com.facebook.react.defaults.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultTurboModuleManagerDelegate.Builder.addCxxReactPackage$lambda$3$lambda$2(provider, (ReactApplicationContext) obj);
                }
            });
            return this;
        }

        @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.Builder
        protected DefaultTurboModuleManagerDelegate build(ReactApplicationContext context, List<? extends ReactPackage> packages) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(packages, "packages");
            List<Function1> list = this.cxxReactPackageProviders;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC2800q.A(arrayList, (Iterable) ((Function1) it.next()).invoke(context));
            }
            return new DefaultTurboModuleManagerDelegate(context, packages, arrayList, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0087 ¨\u0006\t"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "cxxReactPackages", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/runtime/cxxreactpackage/CxxReactPackage;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HybridData initHybrid(List<? extends CxxReactPackage> cxxReactPackages) {
            return DefaultTurboModuleManagerDelegate.initHybrid(cxxReactPackages);
        }

        private Companion() {
        }
    }

    static {
        DefaultSoLoader.maybeLoadSoLibrary();
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list, list2);
    }

    public static final native HybridData initHybrid(List<? extends CxxReactPackage> list);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    protected HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> list, List<? extends CxxReactPackage> list2) {
        super(reactApplicationContext, list, Companion.initHybrid(list2));
    }
}
