package com.facebook.react.bridge;

import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o2.C3006c;
import p2.C3049a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8G¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0011\u0010*\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0011\u0010+\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0011\u0010,\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0011\u0010.\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0011\u0010\r\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b/\u0010\f¨\u00061"}, d2 = {"Lcom/facebook/react/bridge/ModuleHolder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/module/model/ReactModuleInfo;", "moduleInfo", "Ljavax/inject/Provider;", "Lcom/facebook/react/bridge/NativeModule;", "provider", "<init>", "(Lcom/facebook/react/module/model/ReactModuleInfo;Ljavax/inject/Provider;)V", "nativeModule", "(Lcom/facebook/react/bridge/NativeModule;)V", "create", "()Lcom/facebook/react/bridge/NativeModule;", "module", "Li7/B;", "doInitialize", "markInitializable$ReactAndroid_release", "()V", "markInitializable", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasInstance$ReactAndroid_release", "()Z", "hasInstance", "destroy", PointerEventHelper.POINTER_TYPE_UNKNOWN, "instanceKey", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "reactModuleInfo", "Lcom/facebook/react/module/model/ReactModuleInfo;", "Ljavax/inject/Provider;", "internalModule", "Lcom/facebook/react/bridge/NativeModule;", "initializable", "Z", "isCreating", "isInitializing", "getCanOverrideExistingModule", "canOverrideExistingModule", "isTurboModule", "isCxxModule", "getClassName", "className", "getModule", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModuleHolder {
    private static final Companion Companion = new Companion(null);
    private static final AtomicInteger instanceKeyCounter = new AtomicInteger(1);
    private boolean initializable;
    private final int instanceKey;
    private NativeModule internalModule;
    private boolean isCreating;
    private boolean isInitializing;
    private final String name;
    private Provider provider;
    private final ReactModuleInfo reactModuleInfo;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/bridge/ModuleHolder$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "instanceKeyCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ModuleHolder(ReactModuleInfo moduleInfo, Provider provider) {
        AbstractC2855l.g(moduleInfo, "moduleInfo");
        AbstractC2855l.g(provider, "provider");
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        this.name = moduleInfo.getName();
        this.provider = provider;
        this.reactModuleInfo = moduleInfo;
        if (moduleInfo.getNeedsEagerInit()) {
            this.internalModule = create();
        }
    }

    private final NativeModule create() {
        boolean z10 = false;
        SoftAssertions.assertCondition(this.internalModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.name, this.instanceKey);
        B3.b.a(0L, "ModuleHolder.createModule").b("name", this.name).c();
        C3006c.a().c(C3049a.f30619f, "NativeModule init: %s", this.name);
        try {
            Provider provider = this.provider;
            if (provider == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object obj = provider.get();
            AbstractC2855l.f(obj, "get(...)");
            NativeModule nativeModule = (NativeModule) obj;
            this.provider = null;
            synchronized (this) {
                try {
                    this.internalModule = nativeModule;
                    if (this.initializable && !this.isInitializing) {
                        z10 = true;
                    }
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                doInitialize(nativeModule);
            }
            return nativeModule;
        } finally {
        }
    }

    private final void doInitialize(NativeModule module) {
        boolean z10;
        B3.b.a(0L, "ModuleHolder.initialize").b("name", this.name).c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.name, this.instanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.initializable || this.isInitializing) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.isInitializing = true;
                    }
                    C2735B c2735b = C2735B.f28704a;
                } finally {
                }
            }
            if (z10) {
                if (module != null) {
                    module.initialize();
                }
                synchronized (this) {
                    this.isInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.name, this.instanceKey);
            B3.b.b(0L).c();
        }
    }

    public final synchronized void destroy() {
        NativeModule nativeModule = this.internalModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public final boolean getCanOverrideExistingModule() {
        return this.reactModuleInfo.getCanOverrideExistingModule();
    }

    public final String getClassName() {
        return this.reactModuleInfo.getClassName();
    }

    public final NativeModule getModule() {
        boolean z10;
        NativeModule nativeModule;
        synchronized (this) {
            try {
                NativeModule nativeModule2 = this.internalModule;
                if (nativeModule2 != null) {
                    return nativeModule2;
                }
                if (this.isCreating) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.isCreating = true;
                }
                C2735B c2735b = C2735B.f28704a;
                if (z10) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.isCreating = false;
                        AbstractC2855l.e(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.internalModule;
                        if (nativeModule != null || !this.isCreating) {
                            break;
                        }
                        try {
                            AbstractC2855l.e(this, "null cannot be cast to non-null type java.lang.Object");
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (nativeModule == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return nativeModule;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String getName() {
        return this.name;
    }

    public final synchronized boolean hasInstance$ReactAndroid_release() {
        return this.internalModule != null;
    }

    public final boolean isCxxModule() {
        return this.reactModuleInfo.getIsCxxModule();
    }

    public final boolean isTurboModule() {
        return this.reactModuleInfo.getIsTurboModule();
    }

    public final void markInitializable$ReactAndroid_release() {
        boolean z10;
        NativeModule nativeModule;
        synchronized (this) {
            z10 = true;
            try {
                this.initializable = true;
                nativeModule = this.internalModule;
                if (nativeModule == null) {
                    z10 = false;
                    nativeModule = null;
                } else if (this.isInitializing) {
                    throw new IllegalStateException("Check failed.");
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            if (nativeModule == null) {
                throw new IllegalStateException("Required value was null.");
            }
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        AbstractC2855l.g(nativeModule, "nativeModule");
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        String name = nativeModule.getName();
        AbstractC2855l.f(name, "getName(...)");
        this.name = name;
        String name2 = nativeModule.getName();
        AbstractC2855l.f(name2, "getName(...)");
        String simpleName = nativeModule.getClass().getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        this.reactModuleInfo = new ReactModuleInfo(name2, simpleName, nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), ReactModuleInfo.INSTANCE.classIsTurboModule(nativeModule.getClass()));
        this.internalModule = nativeModule;
        C3006c.a().c(C3049a.f30619f, "NativeModule init: %s", name);
    }
}
