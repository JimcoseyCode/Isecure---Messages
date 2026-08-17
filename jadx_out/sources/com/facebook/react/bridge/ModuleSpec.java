package com.facebook.react.bridge;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import expo.modules.notifications.service.NotificationsService;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\b\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00068G¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/ModuleSpec;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "provider", "Ljavax/inject/Provider;", "Lcom/facebook/react/bridge/NativeModule;", "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljavax/inject/Provider;Ljava/lang/String;)V", "()Ljavax/inject/Provider;", "moduleName", "()Ljava/lang/String;", "getProvider", "getName", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "ModuleSpec";
    private final String name;
    private final Provider provider;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0007J(\u0010\u000b\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\r2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0007J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/ModuleSpec$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagerSpec", "Lcom/facebook/react/bridge/ModuleSpec;", "provider", "Ljavax/inject/Provider;", "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleSpec", NotificationsService.EVENT_TYPE_KEY, "Ljava/lang/Class;", "className", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ModuleSpec nativeModuleSpec(Class<? extends NativeModule> type, Provider provider) {
            AbstractC2855l.g(type, "type");
            AbstractC2855l.g(provider, "provider");
            ReactModule reactModule = (ReactModule) type.getAnnotation(ReactModule.class);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (reactModule != null) {
                return new ModuleSpec(provider, reactModule.name(), defaultConstructorMarker);
            }
            AbstractC2325a.I(ModuleSpec.TAG, "Could not find @ReactModule annotation on " + type.getName() + ". Creating the module eagerly to get the name. Consider adding the annotation.");
            Object obj = provider.get();
            AbstractC2855l.f(obj, "get(...)");
            return new ModuleSpec(provider, ((NativeModule) obj).getName(), defaultConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ModuleSpec viewManagerSpec(Provider provider) {
            AbstractC2855l.g(provider, "provider");
            return new ModuleSpec(provider, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }

        public final ModuleSpec nativeModuleSpec(String className, Provider provider) {
            AbstractC2855l.g(className, "className");
            AbstractC2855l.g(provider, "provider");
            return new ModuleSpec(provider, className, null);
        }
    }

    public /* synthetic */ ModuleSpec(Provider provider, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, str);
    }

    public static final ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, Provider provider) {
        return INSTANCE.nativeModuleSpec(cls, provider);
    }

    public static final ModuleSpec viewManagerSpec(Provider provider) {
        return INSTANCE.viewManagerSpec(provider);
    }

    public final String getName() {
        return this.name;
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public final String moduleName() {
        return this.name;
    }

    public final Provider provider() {
        return this.provider;
    }

    private ModuleSpec(Provider provider, String str) {
        this.provider = provider;
        this.name = str;
    }

    public static final ModuleSpec nativeModuleSpec(String str, Provider provider) {
        return INSTANCE.nativeModuleSpec(str, provider);
    }

    /* synthetic */ ModuleSpec(Provider provider, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, (i10 & 2) != 0 ? null : str);
    }
}
