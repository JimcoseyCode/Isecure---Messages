package expo.modules.notifications.notifications.categories;

import C7.d;
import C7.o;
import C7.q;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.errors.InvalidArgumentException;
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
import expo.modules.notifications.UtilsKt;
import expo.modules.notifications.notifications.categories.NotificationActionRecord;
import expo.modules.notifications.notifications.categories.serializers.ExpoNotificationsCategoriesSerializer;
import expo.modules.notifications.notifications.model.NotificationAction;
import expo.modules.notifications.notifications.model.NotificationCategory;
import expo.modules.notifications.notifications.model.TextInputNotificationAction;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0014¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lkotlin/Function2;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/os/Bundle;", "Li7/B;", "Lexpo/modules/notifications/ResultReceiverBody;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Landroid/os/ResultReceiver;", "createResultReceiver", "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIER_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;", "actionArguments", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "categoryOptions", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "setNotificationCategoryAsync", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lexpo/modules/kotlin/Promise;)V", "deleteNotificationCategoryAsync", "(Ljava/lang/String;Lexpo/modules/kotlin/Promise;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/model/NotificationCategory;", "categories", "serializeCategories", "(Ljava/util/Collection;)Ljava/util/List;", "Lexpo/modules/notifications/notifications/categories/serializers/ExpoNotificationsCategoriesSerializer;", "serializer", "Lexpo/modules/notifications/notifications/categories/serializers/ExpoNotificationsCategoriesSerializer;", "getSerializer", "()Lexpo/modules/notifications/notifications/categories/serializers/ExpoNotificationsCategoriesSerializer;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExpoNotificationCategoriesModule extends Module {
    private final ExpoNotificationsCategoriesSerializer serializer = new ExpoNotificationsCategoriesSerializer();

    /* JADX INFO: Access modifiers changed from: private */
    public final ResultReceiver createResultReceiver(Function2 body) {
        return UtilsKt.createDefaultResultReceiver(null, body);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B deleteNotificationCategoryAsync$lambda$4(Promise promise, int i10, Bundle bundle) {
        if (i10 == 0) {
            promise.resolve(bundle != null ? Boolean.valueOf(bundle.getBoolean(NotificationsService.SUCCEEDED_KEY)) : null);
        } else {
            promise.reject("ERR_CATEGORY_DELETE_FAILED", "The category could not be deleted.", null);
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B setNotificationCategoryAsync$lambda$3(Promise promise, ExpoNotificationCategoriesModule expoNotificationCategoriesModule, int i10, Bundle bundle) {
        NotificationCategory notificationCategory = bundle != null ? (NotificationCategory) bundle.getParcelable(NotificationsService.NOTIFICATION_CATEGORY_KEY) : null;
        if (i10 != 0 || notificationCategory == null) {
            promise.reject("ERR_CATEGORY_SET_FAILED", "The provided category could not be set.", null);
        } else {
            promise.resolve(expoNotificationCategoriesModule.serializer.toBundle(notificationCategory));
        }
        return C2735B.f28704a;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoNotificationCategoriesModule");
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getNotificationCategoriesAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exceptions.ReactContextLost {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.ReactContextLost {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        NotificationsService.Companion companion = NotificationsService.INSTANCE;
                        Context context = this.this$0.getContext();
                        ExpoNotificationCategoriesModule expoNotificationCategoriesModule = this.this$0;
                        companion.getCategories(context, expoNotificationCategoriesModule.createResultReceiver(new ExpoNotificationCategoriesModule$definition$1$1$1(promise, expoNotificationCategoriesModule)));
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exceptions.ReactContextLost {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        NotificationsService.Companion companion = NotificationsService.INSTANCE;
                        Context context = this.this$0.getContext();
                        ExpoNotificationCategoriesModule expoNotificationCategoriesModule = this.this$0;
                        companion.getCategories(context, expoNotificationCategoriesModule.createResultReceiver(new ExpoNotificationCategoriesModule$definition$1$1$1(promise, expoNotificationCategoriesModule)));
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getNotificationCategoriesAsync", intAsyncFunctionComponent);
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(List.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(D.b(List.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(List.class, q.f518c.d(D.o(NotificationActionRecord.class)));
                    }
                }), converters2);
            }
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Map.class), Boolean.TRUE));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(Map.class), true, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.h(Map.class, aVar.d(D.o(String.class)), aVar.d(D.f(Object.class)));
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("setNotificationCategoryAsync", new AsyncFunctionWithPromiseComponent("setNotificationCategoryAsync", new AnyType[]{anyType2, anyType3, anyType4}, new Function2() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$4
                public final void invoke(Object[] objArr, Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    Map<String, ? extends Object> map = (Map) objArr[2];
                    ExpoNotificationCategoriesModule expoNotificationCategoriesModule = this.$receiver$inlined;
                    expoNotificationCategoriesModule.setNotificationCategoryAsync((String) obj, (List) obj2, map, promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteNotificationCategoryAsync", new AsyncFunctionWithPromiseComponent("deleteNotificationCategoryAsync", new AnyType[]{anyType5}, new Function2() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$6
                public final void invoke(Object[] objArr, Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    this.$receiver$inlined.deleteNotificationCategoryAsync((String) objArr[0], promise);
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

    public void deleteNotificationCategoryAsync(String identifier, final Promise promise) {
        AbstractC2855l.g(identifier, "identifier");
        AbstractC2855l.g(promise, "promise");
        NotificationsService.INSTANCE.deleteCategory(getContext(), identifier, createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.categories.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExpoNotificationCategoriesModule.deleteNotificationCategoryAsync$lambda$4(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    protected final ExpoNotificationsCategoriesSerializer getSerializer() {
        return this.serializer;
    }

    protected List<Bundle> serializeCategories(Collection<? extends NotificationCategory> categories) {
        AbstractC2855l.g(categories, "categories");
        ExpoNotificationsCategoriesSerializer expoNotificationsCategoriesSerializer = this.serializer;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(categories, 10));
        Iterator<T> it = categories.iterator();
        while (it.hasNext()) {
            arrayList.add(expoNotificationsCategoriesSerializer.toBundle((NotificationCategory) it.next()));
        }
        return arrayList;
    }

    public void setNotificationCategoryAsync(String identifier, List<NotificationActionRecord> actionArguments, Map<String, ? extends Object> categoryOptions, final Promise promise) {
        AbstractC2855l.g(identifier, "identifier");
        AbstractC2855l.g(actionArguments, "actionArguments");
        AbstractC2855l.g(promise, "promise");
        ArrayList arrayList = new ArrayList();
        for (NotificationActionRecord notificationActionRecord : actionArguments) {
            NotificationActionRecord.TextInput textInput = notificationActionRecord.getTextInput();
            if (textInput != null) {
                arrayList.add(new TextInputNotificationAction(notificationActionRecord.getIdentifier(), notificationActionRecord.getButtonTitle(), notificationActionRecord.getOptions().getOpensAppToForeground(), textInput.getPlaceholder()));
            } else {
                arrayList.add(new NotificationAction(notificationActionRecord.getIdentifier(), notificationActionRecord.getButtonTitle(), notificationActionRecord.getOptions().getOpensAppToForeground()));
            }
        }
        if (arrayList.isEmpty()) {
            throw new InvalidArgumentException("Invalid arguments provided for notification category. Must provide at least one action.");
        }
        NotificationsService.INSTANCE.setCategory(getContext(), new NotificationCategory(identifier, arrayList), createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.categories.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExpoNotificationCategoriesModule.setNotificationCategoryAsync$lambda$3(promise, this, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }
}
