package com.facebook.react.common.annotations.internal;

import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogger;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;", "logLevel", "Li7/B;", "assertLegacyArchitecture", "(Ljava/lang/String;Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;)V", "executeAssert", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LegacyArchitectureLogger {
    public static final LegacyArchitectureLogger INSTANCE = new LegacyArchitectureLogger();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyArchitectureLogLevel.values().length];
            try {
                iArr[LegacyArchitectureLogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyArchitectureLogLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private LegacyArchitectureLogger() {
    }

    public static final void assertLegacyArchitecture(String name, LegacyArchitectureLogLevel logLevel) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(logLevel, "logLevel");
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            INSTANCE.executeAssert(name, logLevel);
        }
    }

    public static /* synthetic */ void assertLegacyArchitecture$default(String str, LegacyArchitectureLogLevel legacyArchitectureLogLevel, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            legacyArchitectureLogLevel = LegacyArchitectureLogLevel.WARNING;
        }
        assertLegacyArchitecture(str, legacyArchitectureLogLevel);
    }

    private final void executeAssert(String name, LegacyArchitectureLogLevel logLevel) {
        if (ReactBuildConfig.DEBUG) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
            if (i10 == 1) {
                throw new AssertionException(name + " is being executed when app is fully running on the NEW Architecture.");
            }
            if (i10 != 2) {
                throw new C2750m();
            }
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new ReactNoCrashSoftException(name + " is being executed when app is fully running on the NEW Architecture."));
        }
    }

    static /* synthetic */ void executeAssert$default(LegacyArchitectureLogger legacyArchitectureLogger, String str, LegacyArchitectureLogLevel legacyArchitectureLogLevel, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            legacyArchitectureLogLevel = LegacyArchitectureLogLevel.WARNING;
        }
        legacyArchitectureLogger.executeAssert(str, legacyArchitectureLogLevel);
    }
}
