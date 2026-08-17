package com.facebook.react.bridge.queue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadHandler;", "Landroid/os/Handler;", "Landroid/os/Looper;", "looper", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "exceptionHandler", "<init>", "(Landroid/os/Looper;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)V", "Landroid/os/Message;", "msg", "Li7/B;", "dispatchMessage", "(Landroid/os/Message;)V", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageQueueThreadHandler extends Handler {
    private final QueueThreadExceptionHandler exceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageQueueThreadHandler(Looper looper, QueueThreadExceptionHandler exceptionHandler) {
        super(looper);
        AbstractC2855l.g(looper, "looper");
        AbstractC2855l.g(exceptionHandler, "exceptionHandler");
        this.exceptionHandler = exceptionHandler;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message msg) {
        AbstractC2855l.g(msg, "msg");
        try {
            super.dispatchMessage(msg);
        } catch (Exception e10) {
            this.exceptionHandler.handleException(e10);
        }
    }
}
