package expo.modules.notifications.topics;

import C7.d;
import C7.o;
import P4.AbstractC1378l;
import P4.InterfaceC1372f;
import com.google.firebase.messaging.FirebaseMessaging;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/notifications/topics/TopicSubscriptionModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TopicSubscriptionModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoTopicSubscriptionModule");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.topics.TopicSubscriptionModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("subscribeToTopicAsync", new AsyncFunctionWithPromiseComponent("subscribeToTopicAsync", new AnyType[]{anyType}, new Function2() { // from class: expo.modules.notifications.topics.TopicSubscriptionModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$2
                public final void invoke(Object[] objArr, final Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    final String str = (String) objArr[0];
                    FirebaseMessaging.r().G(str).c(new InterfaceC1372f() { // from class: expo.modules.notifications.topics.TopicSubscriptionModule$definition$1$1$1
                        @Override // P4.InterfaceC1372f
                        public final void onComplete(AbstractC1378l task) {
                            String message;
                            AbstractC2855l.g(task, "task");
                            if (task.p()) {
                                promise.resolve((Object) null);
                                return;
                            }
                            Exception excK = task.k();
                            Promise promise2 = promise;
                            String str2 = str;
                            if (excK == null || (message = excK.getMessage()) == null) {
                                message = "unknown";
                            }
                            promise2.reject("E_TOPIC_SUBSCRIBE_FAILED", "Subscribing to the topic '" + str2 + "' failed: " + message, excK);
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.topics.TopicSubscriptionModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("unsubscribeFromTopicAsync", new AsyncFunctionWithPromiseComponent("unsubscribeFromTopicAsync", new AnyType[]{anyType2}, new Function2() { // from class: expo.modules.notifications.topics.TopicSubscriptionModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$4
                public final void invoke(Object[] objArr, final Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    final String str = (String) objArr[0];
                    FirebaseMessaging.r().J(str).c(new InterfaceC1372f() { // from class: expo.modules.notifications.topics.TopicSubscriptionModule$definition$1$2$1
                        @Override // P4.InterfaceC1372f
                        public final void onComplete(AbstractC1378l task) {
                            String message;
                            AbstractC2855l.g(task, "task");
                            if (task.p()) {
                                promise.resolve((Object) null);
                                return;
                            }
                            Exception excK = task.k();
                            Promise promise2 = promise;
                            String str2 = str;
                            if (excK == null || (message = excK.getMessage()) == null) {
                                message = "unknown";
                            }
                            promise2.reject("E_TOPIC_UNSUBSCRIBE_FAILED", "Unsubscribing from the topic '" + str2 + "' failed: " + message, excK);
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
