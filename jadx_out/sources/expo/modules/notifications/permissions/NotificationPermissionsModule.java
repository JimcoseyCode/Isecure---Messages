package expo.modules.notifications.permissions;

import C7.o;
import D0.c;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.p;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
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
import expo.modules.notifications.ModuleNotFoundException;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import i7.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lexpo/modules/notifications/permissions/NotificationPermissionsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Li7/B;", "getPermissionsWithPromiseImplApi33", "(Lexpo/modules/kotlin/Promise;)V", "getPermissionsWithPromiseImplClassic", "requestPermissionsWithPromiseImplApi33", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissions", "()Lexpo/modules/interfaces/permissions/Permissions;", "permissions", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationPermissionsModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    private final Permissions getPermissions() throws ModuleNotFoundException {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions;
        }
        throw new ModuleNotFoundException(D.b(Permissions.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getPermissionsWithPromiseImplApi33(final Promise promise) throws ModuleNotFoundException {
        Permissions permissions = getPermissions();
        PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.notifications.permissions.a
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                NotificationPermissionsModule.getPermissionsWithPromiseImplApi33$lambda$7(this.f26692a, promise, map);
            }
        };
        String[] strArr = NotificationPermissionsModuleKt.PERMISSIONS;
        permissions.getPermissions(permissionsResponseListener, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPermissionsWithPromiseImplApi33$lambda$7(NotificationPermissionsModule notificationPermissionsModule, Promise promise, Map permissionsMap) {
        boolean z10;
        boolean z11;
        AbstractC2855l.g(permissionsMap, "permissionsMap");
        p pVarH = p.h(notificationPermissionsModule.getContext());
        AbstractC2855l.f(pVarH, "from(...)");
        boolean zA = pVarH.a();
        Bundle bundleA = c.a(t.a("importance", Integer.valueOf(pVarH.j())));
        Object systemService = notificationPermissionsModule.getContext().getSystemService(NotificationsService.NOTIFICATION_KEY);
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            bundleA.putInt("interruptionFilter", notificationManager.getCurrentInterruptionFilter());
        }
        boolean z12 = false;
        if (permissionsMap.isEmpty()) {
            z10 = true;
        } else {
            Iterator it = permissionsMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it.next()).getValue()).getStatus() != PermissionsStatus.GRANTED) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        if (permissionsMap.isEmpty()) {
            z11 = true;
        } else {
            Iterator it2 = permissionsMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it2.next()).getValue()).getStatus() != PermissionsStatus.DENIED) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
        }
        if (permissionsMap.isEmpty()) {
            z12 = true;
        } else {
            Iterator it3 = permissionsMap.entrySet().iterator();
            while (it3.hasNext()) {
                if (!((PermissionsResponse) ((Map.Entry) it3.next()).getValue()).getCanAskAgain()) {
                    break;
                }
            }
            z12 = true;
        }
        String status = (!z11 && zA) ? z10 ? PermissionsStatus.GRANTED.getStatus() : PermissionsStatus.UNDETERMINED.getStatus() : PermissionsStatus.DENIED.getStatus();
        promise.resolve(c.a(t.a(PermissionsResponse.EXPIRES_KEY, "never"), t.a(PermissionsResponse.STATUS_KEY, status), t.a(PermissionsResponse.CAN_ASK_AGAIN_KEY, Boolean.valueOf(z12)), t.a(PermissionsResponse.GRANTED_KEY, Boolean.valueOf(z10)), t.a("android", bundleA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getPermissionsWithPromiseImplClassic(Promise promise) {
        p pVarH = p.h(getContext());
        AbstractC2855l.f(pVarH, "from(...)");
        boolean zA = pVarH.a();
        PermissionsStatus permissionsStatus = zA ? PermissionsStatus.GRANTED : PermissionsStatus.DENIED;
        Bundle bundleA = c.a(t.a("importance", Integer.valueOf(pVarH.j())));
        Object systemService = getContext().getSystemService(NotificationsService.NOTIFICATION_KEY);
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            bundleA.putInt("interruptionFilter", notificationManager.getCurrentInterruptionFilter());
        }
        promise.resolve(c.a(t.a(PermissionsResponse.EXPIRES_KEY, "never"), t.a(PermissionsResponse.STATUS_KEY, permissionsStatus.getStatus()), t.a(PermissionsResponse.CAN_ASK_AGAIN_KEY, Boolean.valueOf(zA)), t.a(PermissionsResponse.GRANTED_KEY, Boolean.valueOf(permissionsStatus == PermissionsStatus.GRANTED)), t.a("android", bundleA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermissionsWithPromiseImplApi33(final Promise promise) throws ModuleNotFoundException {
        Permissions permissions = getPermissions();
        PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.notifications.permissions.b
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) throws ModuleNotFoundException {
                this.f26694a.getPermissionsWithPromiseImplApi33(promise);
            }
        };
        String[] strArr = NotificationPermissionsModuleKt.PERMISSIONS;
        permissions.askForPermissions(permissionsResponseListener, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoNotificationPermissionsModule");
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws ModuleNotFoundException {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) throws ModuleNotFoundException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        if (this.this$0.getContext().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                            this.this$0.getPermissionsWithPromiseImplClassic(promise);
                        } else {
                            this.this$0.getPermissionsWithPromiseImplApi33(promise);
                        }
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws ModuleNotFoundException {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (this.this$0.getContext().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                            this.this$0.getPermissionsWithPromiseImplClassic(promise);
                        } else {
                            this.this$0.getPermissionsWithPromiseImplApi33(promise);
                        }
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPermissionsAsync", intAsyncFunctionComponent);
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(ReadableArguments.class), Boolean.TRUE));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(ReadableArguments.class), true, new InterfaceC3487a() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ReadableArguments.class);
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestPermissionsAsync", new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[]{anyType2}, new Function2() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$2
                public final void invoke(Object[] objArr, Promise promise) throws ModuleNotFoundException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    if (this.this$0.getContext().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                        this.this$0.getPermissionsWithPromiseImplClassic(promise);
                    } else {
                        this.this$0.requestPermissionsWithPromiseImplApi33(promise);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws ModuleNotFoundException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
