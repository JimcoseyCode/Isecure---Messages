package expo.modules.kotlin;

import expo.modules.core.logging.LogHandlers;
import expo.modules.core.logging.Logger;
import j7.AbstractC2800q;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"logger", "Lexpo/modules/core/logging/Logger;", "getLogger", "()Lexpo/modules/core/logging/Logger;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CoreLoggerKt {
    private static final Logger logger = new Logger(AbstractC2800q.e(LogHandlers.INSTANCE.createOSLogHandler("ExpoModulesCore")));

    public static final Logger getLogger() {
        return logger;
    }
}
