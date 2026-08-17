package expo.modules.fetch;

import C7.o;
import P8.C1385d;
import R8.M;
import R8.N;
import R8.O;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import e9.n;
import e9.w;
import e9.z;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.jni.NativeArrayBuffer;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.AbstractC2746i;
import i7.C2735B;
import j7.AbstractC2800q;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lexpo/modules/fetch/ExpoFetchModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Le9/z;", "client$delegate", "Lkotlin/Lazy;", "getClient", "()Le9/z;", "client", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieHandler$delegate", "getCookieHandler", "()Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieHandler", "Lcom/facebook/react/modules/network/CookieJarContainer;", "cookieJarContainer$delegate", "getCookieJarContainer", "()Lcom/facebook/react/modules/network/CookieJarContainer;", "cookieJarContainer", "LR8/N;", "moduleCoroutineScope$delegate", "getModuleCoroutineScope", "()LR8/N;", "moduleCoroutineScope", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Companion", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoFetchModule extends Module {
    private static final String TAG = ExpoFetchModule.class.getSimpleName();

    /* JADX INFO: renamed from: client$delegate, reason: from kotlin metadata */
    private final Lazy client = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.fetch.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ExpoFetchModule.client_delegate$lambda$0(this.f26519g);
        }
    });

    /* JADX INFO: renamed from: cookieHandler$delegate, reason: from kotlin metadata */
    private final Lazy cookieHandler = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.fetch.b
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ExpoFetchModule.cookieHandler_delegate$lambda$1(this.f26520g);
        }
    });

    /* JADX INFO: renamed from: cookieJarContainer$delegate, reason: from kotlin metadata */
    private final Lazy cookieJarContainer = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.fetch.c
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ExpoFetchModule.cookieJarContainer_delegate$lambda$2(this.f26521g);
        }
    });

    /* JADX INFO: renamed from: moduleCoroutineScope$delegate, reason: from kotlin metadata */
    private final Lazy moduleCoroutineScope = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.fetch.d
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ExpoFetchModule.moduleCoroutineScope_delegate$lambda$3(this.f26522g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final z client_delegate$lambda$0(ExpoFetchModule expoFetchModule) {
        return OkHttpClientProvider.createClient(expoFetchModule.getReactContext()).C().a(new OkHttpFileUrlInterceptor(expoFetchModule.getReactContext())).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForwardingCookieHandler cookieHandler_delegate$lambda$1(ExpoFetchModule expoFetchModule) {
        return new ForwardingCookieHandler(expoFetchModule.getReactContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CookieJarContainer cookieJarContainer_delegate$lambda$2(ExpoFetchModule expoFetchModule) {
        n nVarQ = expoFetchModule.getClient().q();
        AbstractC2855l.e(nVarQ, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
        return (CookieJarContainer) nVarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z getClient() {
        return (z) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ForwardingCookieHandler getCookieHandler() {
        return (ForwardingCookieHandler) this.cookieHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CookieJarContainer getCookieJarContainer() {
        return (CookieJarContainer) this.cookieJarContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N getModuleCoroutineScope() {
        return (N) this.moduleCoroutineScope.getValue();
    }

    private final ReactContext getReactContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        ReactContext reactContext2 = reactContext instanceof ReactContext ? (ReactContext) reactContext : null;
        if (reactContext2 != null) {
            return reactContext2;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N moduleCoroutineScope_delegate$lambda$3(ExpoFetchModule expoFetchModule) {
        return O.a(expoFetchModule.getAppContext().getModulesQueue().i().X(new M("expo.modules.fetch.CoroutineScope")));
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        String str;
        Class cls;
        Class cls2;
        AnyType anyType;
        Class cls3;
        ClassComponentBuilder classComponentBuilder;
        Class cls4;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        Object obj;
        ClassComponentBuilder classComponentBuilder2;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoFetchModule");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$$inlined$OnCreate$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m216invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m216invoke() {
                    this.this$0.getCookieJarContainer().setCookieJar(new w(this.this$0.getCookieHandler()));
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m217invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m217invoke() {
                    this.this$0.getCookieHandler().destroy();
                    this.this$0.getCookieJarContainer().removeCookieJar();
                    try {
                        O.b(this.this$0.getModuleCoroutineScope(), new ModuleDestroyedException(null, 1, null));
                    } catch (IllegalStateException unused) {
                        String unused2 = ExpoFetchModule.TAG;
                    }
                }
            }));
            C7.d dVarB = D.b(NativeResponse.class);
            Module module = moduleDefinitionBuilder.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext = module.getAppContext();
            String simpleName = AbstractC3430a.b(dVarB).getSimpleName();
            AbstractC2855l.f(simpleName, "getSimpleName(...)");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            C7.d dVarB2 = D.b(NativeResponse.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool));
            if (anyType2 == null) {
                cls = Boolean.class;
                cls2 = Object.class;
                str = "Required value was null.";
                anyType = new AnyType(new LazyKType(D.b(NativeResponse.class), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$$inlined$Class$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(NativeResponse.class);
                    }
                }), null);
            } else {
                str = "Required value was null.";
                cls = Boolean.class;
                cls2 = Object.class;
                anyType = anyType2;
            }
            ClassComponentBuilder classComponentBuilder3 = new ClassComponentBuilder(appContext, simpleName, dVarB, anyType, moduleDefinitionBuilder.getConverters());
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType == null) {
                returnType = new ReturnType(D.b(cls2));
                cls3 = NativeRequest.class;
                returnTypeProvider.getTypes().put(D.b(cls2), returnType);
            } else {
                cls3 = NativeRequest.class;
            }
            classComponentBuilder3.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Constructor$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return new NativeResponse(this.this$0.getAppContext(), this.this$0.getModuleCoroutineScope());
                }
            }));
            if (AbstractC2855l.b(NativeResponse.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("startStreaming", new AnyType[0], new Function2() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        ((NativeResponse) promise).startStreaming();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }
                });
                classComponentBuilder = classComponentBuilder3;
                cls4 = NativeResponse.class;
            } else {
                TypeConverterProvider converters = classComponentBuilder3.getConverters();
                AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(NativeResponse.class), bool));
                if (anyType3 == null) {
                    classComponentBuilder = classComponentBuilder3;
                    cls4 = NativeResponse.class;
                    anyType3 = new AnyType(new LazyKType(D.b(NativeResponse.class), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(NativeResponse.class);
                        }
                    }), converters);
                } else {
                    classComponentBuilder = classComponentBuilder3;
                    cls4 = NativeResponse.class;
                }
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("startStreaming", new AnyType[]{anyType3}, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final byte[] invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        return ((NativeResponse) objArr[0]).startStreaming();
                    }
                });
            }
            classComponentBuilder.getAsyncFunctions().put("startStreaming", untypedAsyncFunctionComponent);
            TypeConverterProvider converters2 = classComponentBuilder.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(NativeResponse.class);
                    }
                }), converters2);
            }
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType5 == null) {
                obj = Promise.class;
                anyType5 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            } else {
                obj = Promise.class;
            }
            AnyType[] anyTypeArr2 = {anyType4, anyType5};
            Function1 function1 = new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj2 = objArr[0];
                    ((NativeResponse) obj2).cancelStreaming();
                    return C2735B.f28704a;
                }
            };
            Class cls5 = Integer.TYPE;
            boolean zB = AbstractC2855l.b(C2735B.class, cls5);
            Class cls6 = Float.TYPE;
            Class cls7 = Double.TYPE;
            Class cls8 = Boolean.TYPE;
            classComponentBuilder.getAsyncFunctions().put("cancelStreaming", zB ? new IntAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : AbstractC2855l.b(C2735B.class, cls8) ? new BoolAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : AbstractC2855l.b(C2735B.class, cls7) ? new DoubleAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : AbstractC2855l.b(C2735B.class, cls6) ? new FloatAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : new UntypedAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "bodyUsed");
            AnyType[] anyTypeArr3 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(cls));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(cls));
                returnTypeProvider.getTypes().put(D.b(cls), returnType2);
            }
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr3, returnType2, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Boolean.valueOf(((NativeResponse) it[0]).getBodyUsed());
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder.getProperties().put("bodyUsed", propertyComponentBuilderWithThis);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "_rawHeaders");
            AnyType[] anyTypeArr4 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
            ReturnType returnType3 = returnTypeProvider.getTypes().get(D.b(List.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(D.b(List.class));
                returnTypeProvider.getTypes().put(D.b(List.class), returnType3);
            }
            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("get", anyTypeArr4, returnType3, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    List<Pair<String, String>> headers;
                    AbstractC2855l.g(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return (responseInit == null || (headers = responseInit.getHeaders()) == null) ? AbstractC2800q.j() : headers;
                }
            });
            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
            syncFunctionComponent2.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
            classComponentBuilder.getProperties().put("_rawHeaders", propertyComponentBuilderWithThis2);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis3 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), PermissionsResponse.STATUS_KEY);
            AnyType[] anyTypeArr5 = {new AnyType(propertyComponentBuilderWithThis3.getThisType(), null, 2, null)};
            ReturnType returnType4 = returnTypeProvider.getTypes().get(D.b(Integer.class));
            if (returnType4 == null) {
                returnType4 = new ReturnType(D.b(Integer.class));
                returnTypeProvider.getTypes().put(D.b(Integer.class), returnType4);
            }
            SyncFunctionComponent syncFunctionComponent3 = new SyncFunctionComponent("get", anyTypeArr5, returnType4, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return Integer.valueOf(responseInit != null ? responseInit.getStatus() : -1);
                }
            });
            syncFunctionComponent3.setOwnerType(propertyComponentBuilderWithThis3.getThisType());
            syncFunctionComponent3.setCanTakeOwner(true);
            propertyComponentBuilderWithThis3.setGetter(syncFunctionComponent3);
            classComponentBuilder.getProperties().put(PermissionsResponse.STATUS_KEY, propertyComponentBuilderWithThis3);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis4 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "statusText");
            AnyType[] anyTypeArr6 = {new AnyType(propertyComponentBuilderWithThis4.getThisType(), null, 2, null)};
            ReturnType returnType5 = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType5 == null) {
                returnType5 = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType5);
            }
            SyncFunctionComponent syncFunctionComponent4 = new SyncFunctionComponent("get", anyTypeArr6, returnType5, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    String statusText;
                    AbstractC2855l.g(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return (responseInit == null || (statusText = responseInit.getStatusText()) == null) ? PointerEventHelper.POINTER_TYPE_UNKNOWN : statusText;
                }
            });
            syncFunctionComponent4.setOwnerType(propertyComponentBuilderWithThis4.getThisType());
            syncFunctionComponent4.setCanTakeOwner(true);
            propertyComponentBuilderWithThis4.setGetter(syncFunctionComponent4);
            classComponentBuilder.getProperties().put("statusText", propertyComponentBuilderWithThis4);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis5 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "url");
            AnyType[] anyTypeArr7 = {new AnyType(propertyComponentBuilderWithThis5.getThisType(), null, 2, null)};
            ReturnType returnType6 = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType6 == null) {
                returnType6 = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType6);
            }
            SyncFunctionComponent syncFunctionComponent5 = new SyncFunctionComponent("get", anyTypeArr7, returnType6, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    String url;
                    AbstractC2855l.g(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return (responseInit == null || (url = responseInit.getUrl()) == null) ? PointerEventHelper.POINTER_TYPE_UNKNOWN : url;
                }
            });
            syncFunctionComponent5.setOwnerType(propertyComponentBuilderWithThis5.getThisType());
            syncFunctionComponent5.setCanTakeOwner(true);
            propertyComponentBuilderWithThis5.setGetter(syncFunctionComponent5);
            classComponentBuilder.getProperties().put("url", propertyComponentBuilderWithThis5);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis6 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "redirected");
            AnyType[] anyTypeArr8 = {new AnyType(propertyComponentBuilderWithThis6.getThisType(), null, 2, null)};
            ReturnType returnType7 = returnTypeProvider.getTypes().get(D.b(cls));
            if (returnType7 == null) {
                returnType7 = new ReturnType(D.b(cls));
                returnTypeProvider.getTypes().put(D.b(cls), returnType7);
            }
            SyncFunctionComponent syncFunctionComponent6 = new SyncFunctionComponent("get", anyTypeArr8, returnType7, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return Boolean.valueOf(responseInit != null ? responseInit.getRedirected() : false);
                }
            });
            syncFunctionComponent6.setOwnerType(propertyComponentBuilderWithThis6.getThisType());
            syncFunctionComponent6.setCanTakeOwner(true);
            propertyComponentBuilderWithThis6.setGetter(syncFunctionComponent6);
            classComponentBuilder.getProperties().put("redirected", propertyComponentBuilderWithThis6);
            TypeConverterProvider converters3 = classComponentBuilder.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(NativeResponse.class);
                    }
                }), converters3);
            }
            classComponentBuilder.getAsyncFunctions().put("arrayBuffer", new AsyncFunctionWithPromiseComponent("arrayBuffer", new AnyType[]{anyType6}, new Function2() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$2
                public final void invoke(Object[] objArr, final Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                    nativeResponse.waitForStates(AbstractC2800q.e(ResponseState.BODY_COMPLETED), new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$10$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((ResponseState) obj2);
                            return C2735B.f28704a;
                        }

                        public final void invoke(ResponseState it) {
                            AbstractC2855l.g(it, "it");
                            promise.resolve(new NativeArrayBuffer(nativeResponse.getSink().finalize(true)));
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Object[]) obj2, (Promise) obj3);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters4 = classComponentBuilder.getConverters();
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(NativeResponse.class);
                    }
                }), converters4);
            }
            classComponentBuilder.getAsyncFunctions().put(ReactTextInputShadowNode.PROP_TEXT, new AsyncFunctionWithPromiseComponent(ReactTextInputShadowNode.PROP_TEXT, new AnyType[]{anyType7}, new Function2() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$4
                public final void invoke(Object[] objArr, final Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                    nativeResponse.waitForStates(AbstractC2800q.e(ResponseState.BODY_COMPLETED), new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$11$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((ResponseState) obj2);
                            return C2735B.f28704a;
                        }

                        public final void invoke(ResponseState it) {
                            AbstractC2855l.g(it, "it");
                            byte[] bArrArray = nativeResponse.getSink().finalize(false).array();
                            AbstractC2855l.d(bArrArray);
                            promise.resolve(new String(bArrArray, C1385d.f8858b));
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Object[]) obj2, (Promise) obj3);
                    return C2735B.f28704a;
                }
            }));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
            C7.d dVarB3 = D.b(cls3);
            Module module2 = moduleDefinitionBuilder.getModule();
            if (module2 == null) {
                throw new IllegalArgumentException(str);
            }
            AppContext appContext2 = module2.getAppContext();
            String simpleName2 = AbstractC3430a.b(dVarB3).getSimpleName();
            AbstractC2855l.f(simpleName2, "getSimpleName(...)");
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            ClassComponentBuilder classComponentBuilder4 = new ClassComponentBuilder(appContext2, simpleName2, dVarB3, anyType8 == null ? new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$$inlined$Class$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(NativeRequest.class);
                }
            }), null) : anyType8, moduleDefinitionBuilder.getConverters());
            TypeConverterProvider converters5 = classComponentBuilder4.getConverters();
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$Constructor$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(NativeResponse.class);
                    }
                }), converters5);
            }
            AnyType[] anyTypeArr9 = {anyType9};
            ReturnType returnType8 = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType8 == null) {
                returnType8 = new ReturnType(D.b(cls2));
                returnTypeProvider.getTypes().put(D.b(cls2), returnType8);
            }
            classComponentBuilder4.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr9, returnType8, new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return new NativeRequest(this.this$0.getAppContext(), (NativeResponse) objArr[0]);
                }
            }));
            TypeConverterProvider converters6 = classComponentBuilder4.getConverters();
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(NativeRequest.class);
                    }
                }), converters6);
            }
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(URL.class), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(D.b(URL.class), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(URL.class);
                    }
                }), converters6);
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(NativeRequestInit.class), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(D.b(NativeRequestInit.class), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(NativeRequestInit.class);
                    }
                }), converters6);
            }
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(byte[].class), Boolean.TRUE));
            if (anyType13 == null) {
                classComponentBuilder2 = classComponentBuilder4;
                anyType13 = new AnyType(new LazyKType(D.b(byte[].class), true, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(byte[].class);
                    }
                }), converters6);
            } else {
                classComponentBuilder2 = classComponentBuilder4;
            }
            classComponentBuilder2.getAsyncFunctions().put(ViewProps.START, new AsyncFunctionWithPromiseComponent(ViewProps.START, new AnyType[]{anyType10, anyType11, anyType12, anyType13}, new Function2() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$5
                public final void invoke(Object[] objArr, final Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    byte[] bArr = (byte[]) objArr[3];
                    final NativeRequest nativeRequest = (NativeRequest) obj2;
                    z client = this.this$0.getClient();
                    nativeRequest.start(client, (URL) obj3, (NativeRequestInit) obj4, bArr);
                    nativeRequest.getResponse().waitForStates(AbstractC2800q.m(ResponseState.RESPONSE_RECEIVED, ResponseState.ERROR_RECEIVED), new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$4$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                            invoke((ResponseState) obj5);
                            return C2735B.f28704a;
                        }

                        public final void invoke(ResponseState state) {
                            CodedException fetchUnknownException;
                            CodedException unexpectedException;
                            AbstractC2855l.g(state, "state");
                            if (state == ResponseState.RESPONSE_RECEIVED) {
                                promise.resolve();
                                return;
                            }
                            if (state == ResponseState.ERROR_RECEIVED) {
                                Promise promise2 = promise;
                                Exception error = nativeRequest.getResponse().getError();
                                if (error == null) {
                                    fetchUnknownException = new FetchUnknownException();
                                } else if (error instanceof CodedException) {
                                    fetchUnknownException = (CodedException) error;
                                } else {
                                    if (error instanceof expo.modules.core.errors.CodedException) {
                                        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) error;
                                        String code = codedException.getCode();
                                        AbstractC2855l.f(code, "getCode(...)");
                                        unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
                                    } else {
                                        unexpectedException = new UnexpectedException(error);
                                    }
                                    fetchUnknownException = unexpectedException;
                                }
                                promise2.reject(fetchUnknownException);
                            }
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Object[]) obj2, (Promise) obj3);
                    return C2735B.f28704a;
                }
            }));
            Class cls9 = cls3;
            if (AbstractC2855l.b(cls9, obj)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("cancel", new AnyType[0], new Function2() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        ((NativeRequest) promise).cancel();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters7 = classComponentBuilder2.getConverters();
                AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
                if (anyType14 == null) {
                    anyType14 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(NativeRequest.class);
                        }
                    }), converters7);
                }
                AnyType[] anyTypeArr10 = {anyType14};
                Function1 function12 = new Function1() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        ((NativeRequest) objArr[0]).cancel();
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls5) ? new IntAsyncFunctionComponent("cancel", anyTypeArr10, function12) : AbstractC2855l.b(C2735B.class, cls8) ? new BoolAsyncFunctionComponent("cancel", anyTypeArr10, function12) : AbstractC2855l.b(C2735B.class, cls7) ? new DoubleAsyncFunctionComponent("cancel", anyTypeArr10, function12) : AbstractC2855l.b(C2735B.class, cls6) ? new FloatAsyncFunctionComponent("cancel", anyTypeArr10, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("cancel", anyTypeArr10, function12) : new UntypedAsyncFunctionComponent("cancel", anyTypeArr10, function12);
            }
            classComponentBuilder2.getAsyncFunctions().put("cancel", intAsyncFunctionComponent);
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder2.buildClass());
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
