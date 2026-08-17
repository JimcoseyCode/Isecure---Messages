package expo.modules.kotlin;

import R8.AbstractC1417k;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithPayload;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.MethodNotFoundException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.runtime.Runtime;
import i7.AbstractC2746i;
import i7.C2735B;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001c\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010 J1\u0010\u001c\u001a\u00020\u000e\"\u0004\b\u0001\u0010!\"\u0004\b\u0002\u0010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00028\u0002¢\u0006\u0004\b\u001c\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0011\u0010:\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010<\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b;\u00106¨\u0006="}, d2 = {"Lexpo/modules/kotlin/ModuleHolder;", "Lexpo/modules/kotlin/modules/Module;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "module", PointerEventHelper.POINTER_TYPE_UNKNOWN, "_name", "<init>", "(Lexpo/modules/kotlin/modules/Module;Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/runtime/Runtime;", "runtime", "Li7/B;", "export", "(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/runtime/Runtime;)V", "methodName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "call", "(Ljava/lang/String;[Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V", "callSync", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "post", "(Lexpo/modules/kotlin/events/EventName;)V", "Payload", "payload", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;)V", "Sender", "sender", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)V", "registerContracts", "()V", "Lexpo/modules/kotlin/modules/Module;", "getModule", "()Lexpo/modules/kotlin/modules/Module;", "Ljava/lang/String;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getDefinition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "wasInitialized", "Z", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "jsObject$delegate", "Lkotlin/Lazy;", "getJsObject", "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "jsObject", "getName", "()Ljava/lang/String;", "name", "getSafeJSObject", "safeJSObject", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModuleHolder<T extends Module> {
    private final String _name;
    private final ModuleDefinitionData definition;

    /* JADX INFO: renamed from: jsObject$delegate, reason: from kotlin metadata */
    private final Lazy jsObject;
    private final T module;
    private boolean wasInitialized;

    public ModuleHolder(T module, String str) {
        AbstractC2855l.g(module, "module");
        this.module = module;
        this._name = str;
        this.definition = module.definition();
        this.jsObject = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.i
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ModuleHolder.jsObject_delegate$lambda$3(this.f26609g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void export(JSDecoratorsBridgingObject jSDecoratorsBridgingObject, AppContext appContext, Runtime runtime) {
        jSDecoratorsBridgingObject.registerModuleName(getName());
        ModuleDefinitionData moduleDefinitionData = this.definition;
        ObjectDefinitionData objectDefinition = moduleDefinitionData.getObjectDefinition();
        jSDecoratorsBridgingObject.exportConstants(objectDefinition);
        jSDecoratorsBridgingObject.exportFunctions(objectDefinition, moduleDefinitionData.getName(), appContext);
        jSDecoratorsBridgingObject.exportProperties(objectDefinition, appContext);
        jSDecoratorsBridgingObject.exportViewPrototypes(moduleDefinitionData.getViewManagerDefinitions(), moduleDefinitionData.getName(), appContext, runtime);
        jSDecoratorsBridgingObject.exportClasses(moduleDefinitionData.getClassData(), appContext, runtime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaScriptModuleObject_ jsObject_delegate$lambda$3(ModuleHolder moduleHolder) {
        moduleHolder.wasInitialized = true;
        AbstractC2861a.c("[ExpoModulesCore] " + (moduleHolder.getName() + ".jsObject"));
        try {
            AppContext appContext = moduleHolder.getModule().getAppContext();
            Runtime runtime = moduleHolder.getModule().getRuntime();
            JNIDeallocator deallocator = runtime.getDeallocator();
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(deallocator);
            moduleHolder.export(jSDecoratorsBridgingObject, appContext, runtime);
            JavaScriptModuleObject_ javaScriptModuleObject = new JavaScriptModuleObject_(deallocator, moduleHolder.getName());
            javaScriptModuleObject.decorate(jSDecoratorsBridgingObject);
            return javaScriptModuleObject;
        } finally {
            AbstractC2861a.f();
        }
    }

    public final void call(String methodName, Object[] args, Promise promise) throws FunctionCallException {
        CodedException unexpectedException;
        AbstractC2855l.g(methodName, "methodName");
        AbstractC2855l.g(args, "args");
        AbstractC2855l.g(promise, "promise");
        try {
            BaseAsyncFunctionComponent baseAsyncFunctionComponent = getDefinition().getAsyncFunctions().get(methodName);
            if (baseAsyncFunctionComponent == null) {
                throw new MethodNotFoundException();
            }
            if (baseAsyncFunctionComponent instanceof AsyncFunctionComponent) {
                ((AsyncFunctionComponent) baseAsyncFunctionComponent).callUserImplementation$expo_modules_core_release(args, promise, getModule().getAppContext());
                C2735B c2735b = C2735B.f28704a;
            } else {
                throw new IllegalStateException("Cannot call a " + baseAsyncFunctionComponent + " method in test context");
            }
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                String code = codedException.getCode();
                AbstractC2855l.f(code, "getCode(...)");
                unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw new FunctionCallException(methodName, getName(), unexpectedException);
        }
    }

    public final Object callSync(String methodName, Object[] args) throws MethodNotFoundException {
        AbstractC2855l.g(methodName, "methodName");
        AbstractC2855l.g(args, "args");
        SyncFunctionComponent syncFunctionComponent = this.definition.getSyncFunctions().get(methodName);
        if (syncFunctionComponent != null) {
            return SyncFunctionComponent.callUserImplementation$default(syncFunctionComponent, args, null, 2, null);
        }
        throw new MethodNotFoundException();
    }

    public final ModuleDefinitionData getDefinition() {
        return this.definition;
    }

    public final JavaScriptModuleObject_ getJsObject() {
        return (JavaScriptModuleObject_) this.jsObject.getValue();
    }

    public final T getModule() {
        return this.module;
    }

    public final String getName() {
        String str = this._name;
        return str == null ? this.definition.getName() : str;
    }

    public final JavaScriptModuleObject_ getSafeJSObject() {
        if (this.wasInitialized) {
            return getJsObject();
        }
        return null;
    }

    public final void post(EventName eventName) {
        AbstractC2855l.g(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        BasicEventListener basicEventListener = eventListener instanceof BasicEventListener ? (BasicEventListener) eventListener : null;
        if (basicEventListener != null) {
            basicEventListener.call();
        }
    }

    public final void registerContracts() {
        Function2 registerContracts = this.definition.getRegisterContracts();
        if (registerContracts != null) {
            AbstractC1417k.d(this.module.getAppContext().getMainQueue(), null, null, new ModuleHolder$registerContracts$1$1(registerContracts, this, null), 3, null);
        }
    }

    public final <Payload> void post(EventName eventName, Payload payload) {
        AbstractC2855l.g(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        EventListenerWithPayload eventListenerWithPayload = eventListener instanceof EventListenerWithPayload ? (EventListenerWithPayload) eventListener : null;
        if (eventListenerWithPayload != null) {
            eventListenerWithPayload.call(payload);
        }
    }

    public final <Sender, Payload> void post(EventName eventName, Sender sender, Payload payload) {
        AbstractC2855l.g(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        EventListenerWithSenderAndPayload eventListenerWithSenderAndPayload = eventListener instanceof EventListenerWithSenderAndPayload ? (EventListenerWithSenderAndPayload) eventListener : null;
        if (eventListenerWithSenderAndPayload != null) {
            eventListenerWithSenderAndPayload.call(sender, payload);
        }
    }
}
