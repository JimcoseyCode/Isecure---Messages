package com.facebook.react.interfaces;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0004\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/facebook/react/interfaces/TaskInterface;", "TResult", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "waitForCompletion", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(JLjava/util/concurrent/TimeUnit;)Z", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "()Ljava/lang/Exception;", "isCompleted", "()Z", "isCancelled", "isFaulted", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TaskInterface<TResult> {
    Exception getError();

    TResult getResult();

    boolean isCancelled();

    boolean isCompleted();

    boolean isFaulted();

    void waitForCompletion() throws InterruptedException;

    boolean waitForCompletion(long duration, TimeUnit timeUnit) throws InterruptedException;
}
