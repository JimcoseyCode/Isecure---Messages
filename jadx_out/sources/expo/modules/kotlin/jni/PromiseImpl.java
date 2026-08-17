package expo.modules.kotlin.jni;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.PromiseAlreadySettledException;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\r\u0010\u0012J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\r\u0010\u0016J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\r\u0010\u0018J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\r\u0010\u001aJ\u001f\u0010\r\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001bH\u0016¢\u0006\u0004\b\r\u0010\u001cJ%\u0010\r\u001a\u00020\u00072\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001dH\u0016¢\u0006\u0004\b\r\u0010\u001eJ+\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J+\u0010*\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R$\u0010/\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lexpo/modules/kotlin/jni/PromiseImpl;", "Lexpo/modules/kotlin/Promise;", "Lexpo/modules/kotlin/jni/JavaCallback;", "callback", "<init>", "(Lexpo/modules/kotlin/jni/JavaCallback;)V", "Lkotlin/Function0;", "Li7/B;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "checkIfWasSettled", "(Lw7/a;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "resolve", "(Ljava/lang/Object;)V", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "result", "(I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(D)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(F)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/util/Collection;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/util/Map;)V", "code", "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/AppContext;", "appContextHolder", "moduleName", "functionName", "decorateWithDebugInformation", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/JavaCallback;", "getCallback$expo_modules_core_release", "()Lexpo/modules/kotlin/jni/JavaCallback;", "wasSettled", "Z", "getWasSettled$expo_modules_core_release", "()Z", "Ljava/lang/ref/WeakReference;", "fullFunctionName", "Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class PromiseImpl implements Promise {
    private WeakReference<AppContext> appContextHolder;

    @DoNotStrip
    private final JavaCallback callback;
    private String fullFunctionName;
    private boolean wasSettled;

    @DoNotStrip
    public PromiseImpl(JavaCallback callback) {
        AbstractC2855l.g(callback, "callback");
        this.callback = callback;
    }

    private final void checkIfWasSettled(InterfaceC3487a body) throws PromiseAlreadySettledException {
        AppContext appContext;
        if (!this.wasSettled) {
            body.invoke();
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
        WeakReference<AppContext> weakReference = this.appContextHolder;
        if (weakReference == null || (appContext = weakReference.get()) == null) {
            throw promiseAlreadySettledException;
        }
        appContext.getJsLogger();
        throw promiseAlreadySettledException;
    }

    public final void decorateWithDebugInformation(WeakReference<AppContext> appContextHolder, String moduleName, String functionName) {
        AbstractC2855l.g(appContextHolder, "appContextHolder");
        AbstractC2855l.g(moduleName, "moduleName");
        AbstractC2855l.g(functionName, "functionName");
        this.appContextHolder = appContextHolder;
        this.fullFunctionName = moduleName + "." + functionName;
    }

    /* JADX INFO: renamed from: getCallback$expo_modules_core_release, reason: from getter */
    public final JavaCallback getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: getWasSettled$expo_modules_core_release, reason: from getter */
    public final boolean getWasSettled() {
        return this.wasSettled;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(CodedException codedException) {
        Promise.DefaultImpls.reject(this, codedException);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Object value) throws PromiseAlreadySettledException {
        AppContext appContext;
        if (!this.wasSettled) {
            this.callback.invoke(value);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
        WeakReference<AppContext> weakReference = this.appContextHolder;
        if (weakReference == null || (appContext = weakReference.get()) == null) {
            throw promiseAlreadySettledException;
        }
        appContext.getJsLogger();
        throw promiseAlreadySettledException;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(String code, String message, Throwable cause) throws PromiseAlreadySettledException {
        AppContext appContext;
        AbstractC2855l.g(code, "code");
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str != null ? str : "unknown");
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        JavaCallback javaCallback = this.callback;
        if (message == null) {
            message = cause != null ? cause.getMessage() : null;
            if (message == null) {
                message = "unknown";
            }
        }
        javaCallback.invoke(code, message);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve() throws PromiseAlreadySettledException {
        AppContext appContext;
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        this.callback.invoke();
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(int result) throws PromiseAlreadySettledException {
        AppContext appContext;
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(boolean result) throws PromiseAlreadySettledException {
        AppContext appContext;
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(double result) throws PromiseAlreadySettledException {
        AppContext appContext;
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(float result) throws PromiseAlreadySettledException {
        AppContext appContext;
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(String result) throws PromiseAlreadySettledException {
        AppContext appContext;
        AbstractC2855l.g(result, "result");
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Collection<? extends Object> result) throws PromiseAlreadySettledException {
        AppContext appContext;
        AbstractC2855l.g(result, "result");
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Map<String, ? extends Object> result) throws PromiseAlreadySettledException {
        AppContext appContext;
        AbstractC2855l.g(result, "result");
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null || (appContext = weakReference.get()) == null) {
                throw promiseAlreadySettledException;
            }
            appContext.getJsLogger();
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }
}
