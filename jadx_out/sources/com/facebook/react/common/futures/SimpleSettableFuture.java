package com.facebook.react.common.futures;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\u00052\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010\u0017J\u001f\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u001e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006#"}, d2 = {"Lcom/facebook/react/common/futures/SimpleSettableFuture;", "T", "Ljava/util/concurrent/Future;", "<init>", "()V", "Li7/B;", "checkNotSet", "result", "set", "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", NotificationsService.EXCEPTION_KEY, "setException", "(Ljava/lang/Exception;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mayInterruptIfRunning", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "get", "()Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "getOrThrow", "Ljava/util/concurrent/CountDownLatch;", "readyLatch", "Ljava/util/concurrent/CountDownLatch;", "Ljava/lang/Object;", "Ljava/lang/Exception;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimpleSettableFuture<T> implements Future<T> {
    private Exception exception;
    private final CountDownLatch readyLatch = new CountDownLatch(1);
    private T result;

    private final void checkNotSet() {
        if (this.readyLatch.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        this.readyLatch.await();
        if (this.exception == null) {
            return this.result;
        }
        throw new ExecutionException(this.exception);
    }

    public final T getOrThrow() {
        try {
            return get();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.readyLatch.getCount() == 0;
    }

    public final void set(T result) {
        checkNotSet();
        this.result = result;
        this.readyLatch.countDown();
    }

    public final void setException(Exception exception) {
        AbstractC2855l.g(exception, "exception");
        checkNotSet();
        this.exception = exception;
        this.readyLatch.countDown();
    }

    public final T getOrThrow(long timeout, TimeUnit unit) {
        AbstractC2855l.g(unit, "unit");
        try {
            return get(timeout, unit);
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        AbstractC2855l.g(unit, "unit");
        if (this.readyLatch.await(timeout, unit)) {
            if (this.exception == null) {
                return this.result;
            }
            throw new ExecutionException(this.exception);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
