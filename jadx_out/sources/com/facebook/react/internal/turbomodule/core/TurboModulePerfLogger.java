package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.reactperflogger.NativeModulePerfLogger;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ!\u0010\r\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\nJ!\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\nJ!\u0010\u000f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\nJ!\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0011\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\nJ\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0083 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "Li7/B;", "moduleCreateStart", "(Ljava/lang/String;I)V", "moduleCreateCacheHit", "moduleCreateConstructStart", "moduleCreateConstructEnd", "moduleCreateSetUpStart", "moduleCreateSetUpEnd", "moduleCreateEnd", "moduleCreateFail", "Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;", "perfLogger", "jniEnableCppLogging", "(Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;)V", "enableLogging", "nativeModulePerfLogger", "Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurboModulePerfLogger {
    public static final TurboModulePerfLogger INSTANCE = new TurboModulePerfLogger();
    private static NativeModulePerfLogger nativeModulePerfLogger;

    static {
        SoLoader.t("turbomodulejsijni");
    }

    private TurboModulePerfLogger() {
    }

    private final native void jniEnableCppLogging(NativeModulePerfLogger perfLogger);

    public static final void moduleCreateCacheHit(String moduleName, int id) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (moduleName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.moduleCreateCacheHit(moduleName, id);
        }
    }

    public static final void moduleCreateConstructEnd(String moduleName, int id) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (moduleName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.moduleCreateConstructEnd(moduleName, id);
        }
    }

    public static final void moduleCreateConstructStart(String moduleName, int id) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (moduleName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.moduleCreateConstructStart(moduleName, id);
        }
    }

    public static final void moduleCreateEnd(String moduleName, int id) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (moduleName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.moduleCreateEnd(moduleName, id);
        }
    }

    public static final void moduleCreateFail(String moduleName, int id) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (moduleName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.moduleCreateFail(moduleName, id);
        }
    }

    public static final void moduleCreateSetUpEnd(String moduleName, int id) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (moduleName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.moduleCreateSetUpEnd(moduleName, id);
        }
    }

    public static final void moduleCreateSetUpStart(String moduleName, int id) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (moduleName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.moduleCreateSetUpStart(moduleName, id);
        }
    }

    public static final void moduleCreateStart(String moduleName, int id) {
        NativeModulePerfLogger nativeModulePerfLogger2 = nativeModulePerfLogger;
        if (nativeModulePerfLogger2 != null) {
            if (moduleName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            nativeModulePerfLogger2.moduleCreateStart(moduleName, id);
        }
    }

    public final void enableLogging(NativeModulePerfLogger perfLogger) {
        if (perfLogger != null) {
            nativeModulePerfLogger = perfLogger;
            jniEnableCppLogging(perfLogger);
        }
    }
}
