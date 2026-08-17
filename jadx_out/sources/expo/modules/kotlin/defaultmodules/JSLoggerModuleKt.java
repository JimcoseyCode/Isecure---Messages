package expo.modules.kotlin.defaultmodules;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.logging.LogType;
import i7.C2750m;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0018\u0010\u000b\u001a\u00020\u0000*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n*\f\b\u0007\u0010\r\"\u00020\f2\u00020\f¨\u0006\u000e"}, d2 = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "JSLoggerModuleName", "Ljava/lang/String;", "onNewError", "onNewWarning", "onNewDebug", "onNewInfo", "onNewTrace", "Lexpo/modules/core/logging/LogType;", "getEventName", "(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;", "eventName", "Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;", "ErrorManagerModule", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JSLoggerModuleKt {
    public static final String JSLoggerModuleName = "ExpoModulesCoreJSLogger";
    private static final String onNewDebug = "ExpoModulesCoreJSLogger.onNewDebug";
    private static final String onNewError = "ExpoModulesCoreJSLogger.onNewError";
    private static final String onNewInfo = "ExpoModulesCoreJSLogger.onNewInfo";
    private static final String onNewTrace = "ExpoModulesCoreJSLogger.onNewTrace";
    private static final String onNewWarning = "ExpoModulesCoreJSLogger.onNewWarning";

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogType.values().length];
            try {
                iArr[LogType.Trace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogType.Timer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogType.Stacktrace.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogType.Debug.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogType.Info.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LogType.Warn.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LogType.Error.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LogType.Fatal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getEventName(LogType logType) {
        switch (WhenMappings.$EnumSwitchMapping$0[logType.ordinal()]) {
            case 1:
                return onNewTrace;
            case 2:
                return onNewDebug;
            case 3:
                return onNewTrace;
            case 4:
                return onNewDebug;
            case 5:
                return onNewInfo;
            case 6:
                return onNewWarning;
            case 7:
            case 8:
                return onNewError;
            default:
                throw new C2750m();
        }
    }

    public static /* synthetic */ void ErrorManagerModule$annotations() {
    }
}
