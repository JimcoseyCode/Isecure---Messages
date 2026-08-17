package com.facebook.react.util;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\bJ+\u0010\u0012\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/util/RNLog;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", "Li7/B;", "l", "(Ljava/lang/String;)V", "t", "a", "Lcom/facebook/react/bridge/ReactContext;", "context", "w", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;)V", "e", PointerEventHelper.POINTER_TYPE_UNKNOWN, "level", "logInternal", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;I)V", "levelToString", "(I)Ljava/lang/String;", "MINIMUM_LEVEL_FOR_UI", "I", "LOG", "TRACE", "ADVICE", "WARN", "ERROR", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNLog {
    public static final int ADVICE = 4;
    public static final int ERROR = 6;
    public static final RNLog INSTANCE = new RNLog();
    public static final int LOG = 2;
    public static final int MINIMUM_LEVEL_FOR_UI = 5;
    public static final int TRACE = 3;
    public static final int WARN = 5;

    private RNLog() {
    }

    public static final void a(String message) {
        AbstractC2855l.g(message, "message");
        AbstractC2325a.I(ReactConstants.TAG, "(ADVICE)" + message);
    }

    public static final void e(ReactContext context, String message) {
        AbstractC2855l.g(message, "message");
        INSTANCE.logInternal(context, message, 6);
        AbstractC2325a.m(ReactConstants.TAG, message);
    }

    public static final void l(String message) {
        AbstractC2855l.g(message, "message");
        AbstractC2325a.s(ReactConstants.TAG, message);
    }

    private final String levelToString(int level) {
        return (level == 2 || level == 3) ? "log" : (level == 4 || level == 5) ? "warn" : level != 6 ? "none" : "error";
    }

    private final void logInternal(ReactContext context, String message, int level) {
        if (level < 5 || context == null || !context.hasActiveReactInstance() || message == null) {
            return;
        }
        ((RCTLog) context.getJSModule(RCTLog.class)).logIfNoNativeHook(levelToString(level), message);
    }

    public static final void t(String message) {
        AbstractC2855l.g(message, "message");
        AbstractC2325a.s(ReactConstants.TAG, message);
    }

    public static final void w(ReactContext context, String message) {
        AbstractC2855l.g(message, "message");
        INSTANCE.logInternal(context, message, 5);
        AbstractC2325a.I(ReactConstants.TAG, message);
    }

    public static final void e(String message) {
        AbstractC2855l.g(message, "message");
        AbstractC2325a.m(ReactConstants.TAG, message);
    }
}
