package expo.modules.kotlin.defaultmodules;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.logging.LogHandler;
import expo.modules.core.logging.LogType;
import expo.modules.core.logging.Logger;
import expo.modules.kotlin.defaultmodules.JSLoggerModule;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import j7.AbstractC2800q;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", "Landroid/os/Bundle;", "createMessageBundle", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lexpo/modules/core/logging/LogType;", NotificationsService.EVENT_TYPE_KEY, "Li7/B;", "reportToLogBox", "(Lexpo/modules/core/logging/LogType;Ljava/lang/String;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "warning", "reportWarningToLogBox", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/exception/CodedException;", "codedException", "reportExceptionToLogBox", "(Lexpo/modules/kotlin/exception/CodedException;)V", "Lexpo/modules/core/logging/Logger;", "value", "logger", "Lexpo/modules/core/logging/Logger;", "getLogger", "()Lexpo/modules/core/logging/Logger;", "JSLogHandler", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSLoggerModule extends Module {
    private Logger logger;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0010¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/defaultmodules/JSLoggerModule$JSLogHandler;", "Lexpo/modules/core/logging/LogHandler;", "Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;", "module", "<init>", "(Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;)V", "Lexpo/modules/core/logging/LogType;", NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "Li7/B;", "log$expo_modules_core_release", "(Lexpo/modules/core/logging/LogType;Ljava/lang/String;Ljava/lang/Throwable;)V", "log", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "moduleReference", "Ljava/lang/ref/WeakReference;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class JSLogHandler extends LogHandler {
        private final WeakReference<JSLoggerModule> moduleReference;

        public JSLogHandler(JSLoggerModule module) {
            AbstractC2855l.g(module, "module");
            this.moduleReference = new WeakReference<>(module);
        }

        @Override // expo.modules.core.logging.LogHandler
        public void log$expo_modules_core_release(LogType type, String message, Throwable cause) {
            AbstractC2855l.g(type, "type");
            AbstractC2855l.g(message, "message");
            if (cause != null) {
                message = message + ". " + cause.getMessage();
            }
            JSLoggerModule jSLoggerModule = this.moduleReference.get();
            if (jSLoggerModule != null) {
                jSLoggerModule.reportToLogBox(type, message);
            }
        }
    }

    private final Bundle createMessageBundle(String message) {
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportToLogBox(LogType type, String message) {
        String eventName = JSLoggerModuleKt.getEventName(type);
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        C2735B c2735b = C2735B.f28704a;
        sendEvent(eventName, bundle);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name(JSLoggerModuleKt.JSLoggerModuleName);
            moduleDefinitionBuilder.Events("ExpoModulesCoreJSLogger.onNewError", "ExpoModulesCoreJSLogger.onNewWarning", "ExpoModulesCoreJSLogger.onNewDebug", "ExpoModulesCoreJSLogger.onNewInfo", "ExpoModulesCoreJSLogger.onNewTrace");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.kotlin.defaultmodules.JSLoggerModule$definition$lambda$1$$inlined$OnCreate$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m225invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m225invoke() {
                    JSLoggerModule.JSLogHandler jSLogHandler = new JSLoggerModule.JSLogHandler(this.this$0);
                    this.this$0.logger = new Logger(AbstractC2800q.e(jSLogHandler));
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            AbstractC2861a.f();
        }
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final void reportExceptionToLogBox(CodedException codedException) {
        AbstractC2855l.g(codedException, "codedException");
        String message = codedException.getMessage();
        if (message == null) {
            message = codedException.toString();
        }
        sendEvent("ExpoModulesCoreJSLogger.onNewError", createMessageBundle(message));
    }

    public final void reportWarningToLogBox(String warning) {
        AbstractC2855l.g(warning, "warning");
        sendEvent("ExpoModulesCoreJSLogger.onNewWarning", createMessageBundle(warning));
    }
}
