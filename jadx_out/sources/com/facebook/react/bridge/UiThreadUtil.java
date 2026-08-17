package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/bridge/UiThreadUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/os/Handler;", "getUiThreadHandler", "()Landroid/os/Handler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isOnUiThread", "()Z", "Li7/B;", "assertOnUiThread", "assertNotOnUiThread", "Ljava/lang/Runnable;", "runnable", "runOnUiThread", "(Ljava/lang/Runnable;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "delayInMs", "(Ljava/lang/Runnable;J)Z", "removeOnUiThread", "(Ljava/lang/Runnable;)V", "mainHandler$delegate", "Lkotlin/Lazy;", "getMainHandler", "mainHandler", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UiThreadUtil {
    public static final UiThreadUtil INSTANCE = new UiThreadUtil();

    /* JADX INFO: renamed from: mainHandler$delegate, reason: from kotlin metadata */
    private static final Lazy mainHandler = AbstractC2746i.a(EnumC2749l.f28718i, new InterfaceC3487a() { // from class: com.facebook.react.bridge.w
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return UiThreadUtil.mainHandler_delegate$lambda$0();
        }
    });

    private UiThreadUtil() {
    }

    public static final void assertNotOnUiThread() {
        if (ReactBuildConfig.DEBUG) {
            SoftAssertions.assertCondition(!isOnUiThread(), "Expected not to run on UI thread!");
        }
    }

    public static final void assertOnUiThread() {
        if (ReactBuildConfig.DEBUG) {
            SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
        }
    }

    private final Handler getMainHandler() {
        return (Handler) mainHandler.getValue();
    }

    public static final Handler getUiThreadHandler() {
        return INSTANCE.getMainHandler();
    }

    public static final boolean isOnUiThread() {
        return AbstractC2855l.b(Looper.getMainLooper().getThread(), Thread.currentThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mainHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    public static final void removeOnUiThread(Runnable runnable) {
        AbstractC2855l.g(runnable, "runnable");
        INSTANCE.getMainHandler().removeCallbacks(runnable);
    }

    public static final boolean runOnUiThread(Runnable runnable) {
        AbstractC2855l.g(runnable, "runnable");
        return INSTANCE.getMainHandler().postDelayed(runnable, 0L);
    }

    public static final boolean runOnUiThread(Runnable runnable, long delayInMs) {
        AbstractC2855l.g(runnable, "runnable");
        return INSTANCE.getMainHandler().postDelayed(runnable, delayInMs);
    }
}
