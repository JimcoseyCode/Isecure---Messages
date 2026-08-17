package expo.modules.haptics;

import C7.o;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import expo.modules.haptics.arguments.HapticsImpactType;
import expo.modules.haptics.arguments.HapticsNotificationType;
import expo.modules.haptics.arguments.HapticsSelectionTypeKt;
import expo.modules.haptics.arguments.HapticsVibrationType;
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
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w3.AbstractC3477d;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lexpo/modules/haptics/HapticsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/haptics/arguments/HapticsVibrationType;", NotificationsService.EVENT_TYPE_KEY, "Li7/B;", "vibrate", "(Lexpo/modules/haptics/arguments/HapticsVibrationType;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Landroid/os/Vibrator;", "getVibrator", "()Landroid/os/Vibrator;", "vibrator", "expo-haptics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HapticsModule extends Module {
    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    private final Vibrator getVibrator() {
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = getContext().getSystemService("vibrator");
            AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
        Object systemService2 = getContext().getSystemService("vibrator_manager");
        AbstractC2855l.e(systemService2, "null cannot be cast to non-null type android.os.VibratorManager");
        Vibrator defaultVibrator = AbstractC3477d.a(systemService2).getDefaultVibrator();
        AbstractC2855l.d(defaultVibrator);
        return defaultVibrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vibrate(HapticsVibrationType type) {
        if (Build.VERSION.SDK_INT >= 26) {
            getVibrator().vibrate(VibrationEffect.createWaveform(type.getTimings(), type.getAmplitudes(), -1));
        } else {
            getVibrator().vibrate(type.getOldSDKPattern(), -1);
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoHaptics");
            boolean zB = AbstractC2855l.b(String.class, Promise.class);
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("notificationAsync", new AnyType[0], new Function2() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.vibrate(HapticsNotificationType.INSTANCE.fromString((String) promise));
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType == null) {
                    moduleDefinitionBuilder = moduleDefinitionBuilder2;
                    anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters);
                } else {
                    moduleDefinitionBuilder = moduleDefinitionBuilder2;
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.this$0.vibrate(HapticsNotificationType.INSTANCE.fromString((String) objArr[0]));
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls) ? new IntAsyncFunctionComponent("notificationAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls4) ? new BoolAsyncFunctionComponent("notificationAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls3) ? new DoubleAsyncFunctionComponent("notificationAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls2) ? new FloatAsyncFunctionComponent("notificationAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("notificationAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("notificationAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("notificationAsync", intAsyncFunctionComponent);
            AnyType[] anyTypeArr2 = new AnyType[0];
            Function1 function12 = new Function1() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$4
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    this.this$0.vibrate(HapticsSelectionTypeKt.getHapticsSelectionType());
                    return C2735B.f28704a;
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("selectionAsync", AbstractC2855l.b(C2735B.class, cls) ? new IntAsyncFunctionComponent("selectionAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls4) ? new BoolAsyncFunctionComponent("selectionAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new DoubleAsyncFunctionComponent("selectionAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new FloatAsyncFunctionComponent("selectionAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("selectionAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("selectionAsync", anyTypeArr2, function12));
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("impactAsync", new AnyType[0], new Function2() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$5
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.vibrate(HapticsImpactType.INSTANCE.fromString((String) promise));
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$6
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr3 = {anyType2};
                Function1 function13 = new Function1() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$7
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.this$0.vibrate(HapticsImpactType.INSTANCE.fromString((String) objArr[0]));
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls) ? new IntAsyncFunctionComponent("impactAsync", anyTypeArr3, function13) : AbstractC2855l.b(C2735B.class, cls4) ? new BoolAsyncFunctionComponent("impactAsync", anyTypeArr3, function13) : AbstractC2855l.b(C2735B.class, cls3) ? new DoubleAsyncFunctionComponent("impactAsync", anyTypeArr3, function13) : AbstractC2855l.b(C2735B.class, cls2) ? new FloatAsyncFunctionComponent("impactAsync", anyTypeArr3, function13) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("impactAsync", anyTypeArr3, function13) : new UntypedAsyncFunctionComponent("impactAsync", anyTypeArr3, function13);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("impactAsync", intAsyncFunctionComponent2);
            if (AbstractC2855l.b(HapticType.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("performHapticsAsync", new AnyType[0], new Function2() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$8
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        HapticType hapticType = (HapticType) promise;
                        Activity currentActivity = this.this$0.getAppContext().getCurrentActivity();
                        View viewFindViewById = currentActivity != null ? currentActivity.findViewById(android.R.id.content) : null;
                        if (viewFindViewById != null) {
                            viewFindViewById.performHapticFeedback(hapticType.toHapticFeedbackType());
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(HapticType.class), Boolean.FALSE));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(D.b(HapticType.class), false, new InterfaceC3487a() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$9
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(HapticType.class);
                        }
                    }), converters3);
                }
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("performHapticsAsync", new AnyType[]{anyType3}, new Function1() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$10
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        HapticType hapticType = (HapticType) objArr[0];
                        Activity currentActivity = this.this$0.getAppContext().getCurrentActivity();
                        View viewFindViewById = currentActivity != null ? currentActivity.findViewById(android.R.id.content) : null;
                        if (viewFindViewById != null) {
                            return Boolean.valueOf(viewFindViewById.performHapticFeedback(hapticType.toHapticFeedbackType()));
                        }
                        return null;
                    }
                });
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("performHapticsAsync", untypedAsyncFunctionComponent);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
