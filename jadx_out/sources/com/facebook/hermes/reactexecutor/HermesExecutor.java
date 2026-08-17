package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/facebook/hermes/reactexecutor/HermesExecutor;", "Lcom/facebook/react/bridge/JavaScriptExecutor;", "enableDebugger", PointerEventHelper.POINTER_TYPE_UNKNOWN, "debuggerName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(ZLjava/lang/String;)V", "getName", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HermesExecutor extends JavaScriptExecutor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static String mode;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/hermes/reactexecutor/HermesExecutor$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enableDebugger", PointerEventHelper.POINTER_TYPE_UNKNOWN, "debuggerName", "Lcom/facebook/jni/HybridData;", "initHybridDefaultConfig", "(ZLjava/lang/String;)Lcom/facebook/jni/HybridData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "heapSizeMB", "initHybrid", "(ZLjava/lang/String;J)Lcom/facebook/jni/HybridData;", "Li7/B;", "loadLibrary", "mode", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HybridData initHybrid(boolean enableDebugger, String debuggerName, long heapSizeMB) {
            return HermesExecutor.initHybrid(enableDebugger, debuggerName, heapSizeMB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData initHybridDefaultConfig(boolean enableDebugger, String debuggerName) {
            return HermesExecutor.initHybridDefaultConfig(enableDebugger, debuggerName);
        }

        public final void loadLibrary() throws UnsatisfiedLinkError {
            if (HermesExecutor.mode == null) {
                SoLoader.t("hermesvm");
                SoLoader.t("hermes_executor");
                HermesExecutor.mode = ReactBuildConfig.DEBUG ? "Debug" : "Release";
            }
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        companion.loadLibrary();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HermesExecutor(boolean z10, String debuggerName) {
        super(INSTANCE.initHybridDefaultConfig(z10, debuggerName));
        AbstractC2855l.g(debuggerName, "debuggerName");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid(boolean z10, String str, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybridDefaultConfig(boolean z10, String str);

    public static final void loadLibrary() throws UnsatisfiedLinkError {
        INSTANCE.loadLibrary();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + mode;
    }
}
