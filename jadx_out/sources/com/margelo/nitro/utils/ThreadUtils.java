package com.margelo.nitro.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q3.InterfaceC3112a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/margelo/nitro/utils/ThreadUtils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Companion", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC3112a
public final class ThreadUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/utils/ThreadUtils$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCurrentThreadName", "()Ljava/lang/String;", "name", "Li7/B;", "setCurrentThreadName", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isOnUIThread", "()Z", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Keep
        @InterfaceC3112a
        public final String getCurrentThreadName() {
            String name = Thread.currentThread().getName();
            AbstractC2855l.f(name, "getName(...)");
            return name;
        }

        @Keep
        @InterfaceC3112a
        public final boolean isOnUIThread() {
            return AbstractC2855l.b(Looper.myLooper(), Looper.getMainLooper());
        }

        @Keep
        @InterfaceC3112a
        public final void runOnUIThread(Runnable runnable) {
            AbstractC2855l.g(runnable, "runnable");
            ThreadUtils.handler.post(runnable);
        }

        @Keep
        @InterfaceC3112a
        public final void setCurrentThreadName(String name) {
            AbstractC2855l.g(name, "name");
            Thread.currentThread().setName(name);
        }

        private Companion() {
        }
    }

    @Keep
    @InterfaceC3112a
    public static final String getCurrentThreadName() {
        return INSTANCE.getCurrentThreadName();
    }

    @Keep
    @InterfaceC3112a
    public static final boolean isOnUIThread() {
        return INSTANCE.isOnUIThread();
    }

    @Keep
    @InterfaceC3112a
    public static final void runOnUIThread(Runnable runnable) {
        INSTANCE.runOnUIThread(runnable);
    }

    @Keep
    @InterfaceC3112a
    public static final void setCurrentThreadName(String str) {
        INSTANCE.setCurrentThreadName(str);
    }
}
