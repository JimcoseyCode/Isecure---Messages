package expo.modules.application;

import C7.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.ConstantComponentBuilder;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.z;
import l1.AbstractC2861a;
import p1.AbstractC3046a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/application/ApplicationModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "packageName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "kotlin.jvm.PlatformType", "getPackageName", "()Ljava/lang/String;", "packageManager", "Landroid/content/pm/PackageManager;", "getPackageManager", "()Landroid/content/pm/PackageManager;", "expo-application_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApplicationModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PackageManager getPackageManager() {
        return getContext().getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPackageName() {
        return getContext().getPackageName();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoApplication");
            ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder("applicationName");
            constantComponentBuilder.setGetter(new InterfaceC3487a() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$Constant$1
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return this.this$0.getContext().getApplicationInfo().loadLabel(this.this$0.getContext().getPackageManager()).toString();
                }
            });
            moduleDefinitionBuilder.getConstants().put("applicationName", constantComponentBuilder);
            ConstantComponentBuilder constantComponentBuilder2 = new ConstantComponentBuilder("applicationId");
            constantComponentBuilder2.setGetter(new InterfaceC3487a() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$Constant$2
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return this.this$0.getPackageName();
                }
            });
            moduleDefinitionBuilder.getConstants().put("applicationId", constantComponentBuilder2);
            ConstantComponentBuilder constantComponentBuilder3 = new ConstantComponentBuilder("nativeApplicationVersion");
            constantComponentBuilder3.setGetter(new InterfaceC3487a() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$Constant$3
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    PackageManager packageManager = this.this$0.getPackageManager();
                    AbstractC2855l.f(packageManager, "access$getPackageManager(...)");
                    String packageName = this.this$0.getPackageName();
                    AbstractC2855l.f(packageName, "access$getPackageName(...)");
                    return ApplicationModuleKt.getPackageInfoCompat(packageManager, packageName, 0).versionName;
                }
            });
            moduleDefinitionBuilder.getConstants().put("nativeApplicationVersion", constantComponentBuilder3);
            ConstantComponentBuilder constantComponentBuilder4 = new ConstantComponentBuilder("nativeBuildVersion");
            constantComponentBuilder4.setGetter(new InterfaceC3487a() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$Constant$4
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    PackageManager packageManager = this.this$0.getPackageManager();
                    AbstractC2855l.f(packageManager, "access$getPackageManager(...)");
                    String packageName = this.this$0.getPackageName();
                    AbstractC2855l.f(packageName, "access$getPackageName(...)");
                    return String.valueOf((int) ApplicationModuleKt.getLongVersionCode(ApplicationModuleKt.getPackageInfoCompat(packageManager, packageName, 0)));
                }
            });
            moduleDefinitionBuilder.getConstants().put("nativeBuildVersion", constantComponentBuilder4);
            ConstantComponentBuilder constantComponentBuilder5 = new ConstantComponentBuilder("androidId");
            constantComponentBuilder5.setGetter(new InterfaceC3487a() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$Constant$5
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return Settings.Secure.getString(this.this$0.getContext().getContentResolver(), "android_id");
                }
            });
            moduleDefinitionBuilder.getConstants().put("androidId", constantComponentBuilder5);
            AnyType[] anyTypeArr = new AnyType[0];
            Function1 function1 = new Function1() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final Double invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    PackageManager packageManager = this.this$0.getContext().getPackageManager();
                    String packageName = this.this$0.getContext().getPackageName();
                    AbstractC2855l.d(packageManager);
                    AbstractC2855l.d(packageName);
                    return Double.valueOf(ApplicationModuleKt.getPackageInfoCompat(packageManager, packageName, 0).firstInstallTime);
                }
            };
            Class cls = Integer.TYPE;
            boolean zB = AbstractC2855l.b(Double.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            moduleDefinitionBuilder.getAsyncFunctions().put("getInstallationTimeAsync", zB ? new IntAsyncFunctionComponent("getInstallationTimeAsync", anyTypeArr, function1) : AbstractC2855l.b(Double.class, cls4) ? new BoolAsyncFunctionComponent("getInstallationTimeAsync", anyTypeArr, function1) : AbstractC2855l.b(Double.class, cls3) ? new DoubleAsyncFunctionComponent("getInstallationTimeAsync", anyTypeArr, function1) : AbstractC2855l.b(Double.class, cls2) ? new FloatAsyncFunctionComponent("getInstallationTimeAsync", anyTypeArr, function1) : AbstractC2855l.b(Double.class, String.class) ? new StringAsyncFunctionComponent("getInstallationTimeAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getInstallationTimeAsync", anyTypeArr, function1));
            AnyType[] anyTypeArr2 = new AnyType[0];
            Function1 function12 = new Function1() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$2
                @Override // kotlin.jvm.functions.Function1
                public final Double invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    PackageManager packageManager = this.this$0.getContext().getPackageManager();
                    String packageName = this.this$0.getContext().getPackageName();
                    AbstractC2855l.d(packageManager);
                    AbstractC2855l.d(packageName);
                    return Double.valueOf(ApplicationModuleKt.getPackageInfoCompat(packageManager, packageName, 0).lastUpdateTime);
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("getLastUpdateTimeAsync", AbstractC2855l.b(Double.class, cls) ? new IntAsyncFunctionComponent("getLastUpdateTimeAsync", anyTypeArr2, function12) : AbstractC2855l.b(Double.class, cls4) ? new BoolAsyncFunctionComponent("getLastUpdateTimeAsync", anyTypeArr2, function12) : AbstractC2855l.b(Double.class, cls3) ? new DoubleAsyncFunctionComponent("getLastUpdateTimeAsync", anyTypeArr2, function12) : AbstractC2855l.b(Double.class, cls2) ? new FloatAsyncFunctionComponent("getLastUpdateTimeAsync", anyTypeArr2, function12) : AbstractC2855l.b(Double.class, String.class) ? new StringAsyncFunctionComponent("getLastUpdateTimeAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("getLastUpdateTimeAsync", anyTypeArr2, function12));
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getInstallReferrerAsync", new AnyType[0], new Function2() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        StringBuilder sb = new StringBuilder();
                        z zVar = new z();
                        AbstractC3046a abstractC3046aA = AbstractC3046a.c(this.this$0.getContext()).a();
                        abstractC3046aA.d(new ApplicationModule$definition$1$8$1(zVar, abstractC3046aA, sb, promise));
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$4
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr3 = {anyType};
                Function1 function13 = new Function1() { // from class: expo.modules.application.ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$5
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        StringBuilder sb = new StringBuilder();
                        z zVar = new z();
                        AbstractC3046a abstractC3046aA = AbstractC3046a.c(this.this$0.getContext()).a();
                        abstractC3046aA.d(new ApplicationModule$definition$1$8$1(zVar, abstractC3046aA, sb, promise));
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls) ? new IntAsyncFunctionComponent("getInstallReferrerAsync", anyTypeArr3, function13) : AbstractC2855l.b(C2735B.class, cls4) ? new BoolAsyncFunctionComponent("getInstallReferrerAsync", anyTypeArr3, function13) : AbstractC2855l.b(C2735B.class, cls3) ? new DoubleAsyncFunctionComponent("getInstallReferrerAsync", anyTypeArr3, function13) : AbstractC2855l.b(C2735B.class, cls2) ? new FloatAsyncFunctionComponent("getInstallReferrerAsync", anyTypeArr3, function13) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getInstallReferrerAsync", anyTypeArr3, function13) : new UntypedAsyncFunctionComponent("getInstallReferrerAsync", anyTypeArr3, function13);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getInstallReferrerAsync", intAsyncFunctionComponent);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
