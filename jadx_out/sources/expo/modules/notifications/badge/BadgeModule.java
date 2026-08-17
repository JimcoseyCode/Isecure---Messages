package expo.modules.notifications.badge;

import C7.o;
import android.content.Context;
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
import i7.C2735B;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/notifications/badge/BadgeModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BadgeModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoBadgeModule");
            AnyType[] anyTypeArr = new AnyType[0];
            Function1 function1 = new Function1() { // from class: expo.modules.notifications.badge.BadgeModule$definition$lambda$2$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Integer.valueOf(BadgeHelper.INSTANCE.getBadgeCount());
                }
            };
            Class cls = Integer.TYPE;
            boolean zB = AbstractC2855l.b(Integer.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            moduleDefinitionBuilder.getAsyncFunctions().put("getBadgeCountAsync", zB ? new IntAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1) : AbstractC2855l.b(Integer.class, cls4) ? new BoolAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1) : AbstractC2855l.b(Integer.class, cls3) ? new DoubleAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1) : AbstractC2855l.b(Integer.class, cls2) ? new FloatAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1) : AbstractC2855l.b(Integer.class, String.class) ? new StringAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1));
            if (AbstractC2855l.b(Integer.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("setBadgeCountAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.badge.BadgeModule$definition$lambda$2$$inlined$AsyncFunction$2
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.ReactContextLost {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        int iIntValue = ((Integer) promise).intValue();
                        BadgeHelper badgeHelper = BadgeHelper.INSTANCE;
                        Context reactContext = this.this$0.getAppContext().getReactContext();
                        if (reactContext == null) {
                            throw new Exceptions.ReactContextLost();
                        }
                        badgeHelper.setBadgeCount(reactContext, iIntValue);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exceptions.ReactContextLost {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Integer.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(Integer.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.badge.BadgeModule$definition$lambda$2$$inlined$AsyncFunction$3
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Integer.TYPE);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr2 = {anyType};
                Function1 function12 = new Function1() { // from class: expo.modules.notifications.badge.BadgeModule$definition$lambda$2$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object[] objArr) throws Exceptions.ReactContextLost {
                        AbstractC2855l.g(objArr, "<destruct>");
                        int iIntValue = ((Number) objArr[0]).intValue();
                        BadgeHelper badgeHelper = BadgeHelper.INSTANCE;
                        Context reactContext = this.this$0.getAppContext().getReactContext();
                        if (reactContext != null) {
                            return Boolean.valueOf(badgeHelper.setBadgeCount(reactContext, iIntValue));
                        }
                        throw new Exceptions.ReactContextLost();
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(Boolean.class, cls) ? new IntAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12) : AbstractC2855l.b(Boolean.class, cls4) ? new BoolAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12) : AbstractC2855l.b(Boolean.class, cls3) ? new DoubleAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12) : AbstractC2855l.b(Boolean.class, cls2) ? new FloatAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12) : AbstractC2855l.b(Boolean.class, String.class) ? new StringAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("setBadgeCountAsync", intAsyncFunctionComponent);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
