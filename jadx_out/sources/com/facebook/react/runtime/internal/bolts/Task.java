package com.facebook.react.runtime.internal.bolts;

import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 ;*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001;B\t\b\u0010¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0011\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J?\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u001f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b&\u0010%J7\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010%J=\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u001f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000 2\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b(\u0010%J\u000f\u0010*\u001a\u00020\u0007H\u0000¢\u0006\u0004\b)\u0010\rJ\u0019\u0010-\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020\u00072\u000e\u0010.\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0000¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00106R\u0018\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00104R\u001e\u0010.\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00107R&\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0 088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/facebook/react/runtime/internal/bolts/Task;", "TResult", "Lcom/facebook/react/interfaces/TaskInterface;", "<init>", "()V", "result", "(Ljava/lang/Object;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cancelled", "(Z)V", "Li7/B;", "runContinuations", "isCompleted", "()Z", "isCancelled", "isFaulted", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "()Ljava/lang/Exception;", "waitForCompletion", PointerEventHelper.POINTER_TYPE_UNKNOWN, "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(JLjava/util/concurrent/TimeUnit;)Z", "Ljava/lang/Void;", "makeVoid", "()Lcom/facebook/react/runtime/internal/bolts/Task;", "TContinuationResult", "Lcom/facebook/react/runtime/internal/bolts/Continuation;", "continuation", "Ljava/util/concurrent/Executor;", "executor", "continueWith", "(Lcom/facebook/react/runtime/internal/bolts/Continuation;Ljava/util/concurrent/Executor;)Lcom/facebook/react/runtime/internal/bolts/Task;", "continueWithTask", "onSuccess", "onSuccessTask", "trySetCancelled$ReactAndroid_release", "trySetCancelled", "trySetResult$ReactAndroid_release", "(Ljava/lang/Object;)Z", "trySetResult", "error", "trySetError$ReactAndroid_release", "(Ljava/lang/Exception;)Z", "trySetError", "Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "complete", "Z", "Ljava/lang/Exception;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "continuations", "Ljava/util/List;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Task<TResult> implements TaskInterface<TResult> {
    private boolean cancelled;
    private boolean complete;
    private Exception error;
    private TResult result;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Executor IMMEDIATE_EXECUTOR = Executors.IMMEDIATE;
    public static final Executor UI_THREAD_EXECUTOR = Executors.UI_THREAD;
    private static final Task<Void> TASK_NULL = new Task<>((Object) null);
    private static final Task<Boolean> TASK_TRUE = new Task<>(Boolean.TRUE);
    private static final Task<Boolean> TASK_FALSE = new Task<>(Boolean.FALSE);
    private static final Task<Object> TASK_CANCELLED = new Task<>(true);
    private final Object lock = new Object();
    private final List<Continuation<TResult, C2735B>> continuations = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JY\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0005H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u0005H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\u001f2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(¨\u0006-"}, d2 = {"Lcom/facebook/react/runtime/internal/bolts/Task$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TContinuationResult", "TResult", "Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;", "tcs", "Lcom/facebook/react/runtime/internal/bolts/Continuation;", "continuation", "Lcom/facebook/react/runtime/internal/bolts/Task;", "task", "Ljava/util/concurrent/Executor;", "executor", "Li7/B;", "completeImmediately", "(Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;Lcom/facebook/react/runtime/internal/bolts/Continuation;Lcom/facebook/react/runtime/internal/bolts/Task;Ljava/util/concurrent/Executor;)V", "completeAfterTask", "create$ReactAndroid_release", "()Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;", "create", "value", "forResult", "(Ljava/lang/Object;)Lcom/facebook/react/runtime/internal/bolts/Task;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "forError", "(Ljava/lang/Exception;)Lcom/facebook/react/runtime/internal/bolts/Task;", "cancelled", "()Lcom/facebook/react/runtime/internal/bolts/Task;", "Ljava/util/concurrent/Callable;", "callable", "call", "(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/facebook/react/runtime/internal/bolts/Task;", "IMMEDIATE_EXECUTOR", "Ljava/util/concurrent/Executor;", "UI_THREAD_EXECUTOR", "Ljava/lang/Void;", "TASK_NULL", "Lcom/facebook/react/runtime/internal/bolts/Task;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "TASK_TRUE", "TASK_FALSE", "TASK_CANCELLED", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$2(Callable callable, final TaskCompletionSource taskCompletionSource) {
            Continuation continuation = new Continuation() { // from class: com.facebook.react.runtime.internal.bolts.h
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return Task.Companion.call$lambda$2$lambda$0(taskCompletionSource, task);
                }
            };
            try {
                Task task = (Task) callable.call();
                synchronized (task.lock) {
                    try {
                        if (task.isCompleted()) {
                            AbstractC2855l.d(task);
                            continuation.then(task);
                        } else {
                            task.continuations.add(continuation);
                        }
                    } finally {
                    }
                }
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e10) {
                taskCompletionSource.setError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final C2735B call$lambda$2$lambda$0(TaskCompletionSource taskCompletionSource, Task task) {
            AbstractC2855l.g(task, "task");
            if (task.isCancelled()) {
                taskCompletionSource.setCancelled();
            } else if (task.isFaulted()) {
                taskCompletionSource.setError(task.getError());
            } else {
                taskCompletionSource.setResult(task.getResult());
            }
            return C2735B.f28704a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeAfterTask(final TaskCompletionSource<TContinuationResult> tcs, final Continuation<TResult, Task<TContinuationResult>> continuation, final Task<TResult> task, Executor executor) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.react.runtime.internal.bolts.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.completeAfterTask$lambda$5(continuation, task, tcs);
                    }
                });
            } catch (Exception e10) {
                tcs.setError(new ExecutorException(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void completeAfterTask$lambda$5(Continuation continuation, Task task, final TaskCompletionSource taskCompletionSource) {
            try {
                Task task2 = (Task) continuation.then(task);
                if (task2 == null) {
                    taskCompletionSource.setResult(null);
                } else {
                    Task.continueWith$default(task2, new Continuation() { // from class: com.facebook.react.runtime.internal.bolts.f
                        @Override // com.facebook.react.runtime.internal.bolts.Continuation
                        public final Object then(Task task3) {
                            return Task.Companion.completeAfterTask$lambda$5$lambda$4(taskCompletionSource, task3);
                        }
                    }, null, 2, null);
                }
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e10) {
                taskCompletionSource.setError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final C2735B completeAfterTask$lambda$5$lambda$4(TaskCompletionSource taskCompletionSource, Task task) {
            AbstractC2855l.g(task, "task");
            if (task.isCancelled()) {
                taskCompletionSource.setCancelled();
            } else if (task.isFaulted()) {
                taskCompletionSource.setError(task.getError());
            } else {
                taskCompletionSource.setResult(task.getResult());
            }
            return C2735B.f28704a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeImmediately(final TaskCompletionSource<TContinuationResult> tcs, final Continuation<TResult, TContinuationResult> continuation, final Task<TResult> task, Executor executor) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.react.runtime.internal.bolts.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.completeImmediately$lambda$3(continuation, task, tcs);
                    }
                });
            } catch (Exception e10) {
                tcs.setError(new ExecutorException(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void completeImmediately$lambda$3(Continuation continuation, Task task, TaskCompletionSource taskCompletionSource) {
            try {
                taskCompletionSource.setResult(continuation.then(task));
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e10) {
                taskCompletionSource.setError(e10);
            }
        }

        public final <TResult> Task<TResult> call(final Callable<Task<TResult>> callable, Executor executor) {
            AbstractC2855l.g(callable, "callable");
            AbstractC2855l.g(executor, "executor");
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                executor.execute(new Runnable() { // from class: com.facebook.react.runtime.internal.bolts.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.call$lambda$2(callable, taskCompletionSource);
                    }
                });
            } catch (Exception e10) {
                taskCompletionSource.setError(new ExecutorException(e10));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> cancelled() {
            Task<TResult> task = Task.TASK_CANCELLED;
            AbstractC2855l.e(task, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.cancelled>");
            return task;
        }

        public final <TResult> TaskCompletionSource<TResult> create$ReactAndroid_release() {
            return new TaskCompletionSource<>();
        }

        public final <TResult> Task<TResult> forError(Exception error) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setError(error);
            return taskCompletionSource.getTask();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <TResult> Task<TResult> forResult(TResult value) {
            if (value == 0) {
                Task<TResult> task = Task.TASK_NULL;
                AbstractC2855l.e(task, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return task;
            }
            if (value instanceof Boolean) {
                Task<TResult> task2 = ((Boolean) value).booleanValue() ? Task.TASK_TRUE : Task.TASK_FALSE;
                AbstractC2855l.e(task2, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return task2;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(value);
            return taskCompletionSource.getTask();
        }

        private Companion() {
        }
    }

    public Task() {
    }

    public static final <TResult> Task<TResult> call(Callable<Task<TResult>> callable, Executor executor) {
        return INSTANCE.call(callable, executor);
    }

    public static final <TResult> Task<TResult> cancelled() {
        return INSTANCE.cancelled();
    }

    public static /* synthetic */ Task continueWith$default(Task task, Continuation continuation, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        return task.continueWith(continuation, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B continueWith$lambda$9$lambda$8(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, Task task) {
        AbstractC2855l.g(task, "task");
        INSTANCE.completeImmediately(taskCompletionSource, continuation, task, executor);
        return C2735B.f28704a;
    }

    public static /* synthetic */ Task continueWithTask$default(Task task, Continuation continuation, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        return task.continueWithTask(continuation, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B continueWithTask$lambda$11$lambda$10(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, Task task) {
        AbstractC2855l.g(task, "task");
        INSTANCE.completeAfterTask(taskCompletionSource, continuation, task, executor);
        return C2735B.f28704a;
    }

    public static final <TResult> Task<TResult> forError(Exception exc) {
        return INSTANCE.forError(exc);
    }

    public static final <TResult> Task<TResult> forResult(TResult tresult) {
        return INSTANCE.forResult(tresult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task makeVoid$lambda$7(Task task) {
        AbstractC2855l.g(task, "task");
        return task.isCancelled() ? INSTANCE.cancelled() : task.isFaulted() ? INSTANCE.forError(task.getError()) : TASK_NULL;
    }

    public static /* synthetic */ Task onSuccess$default(Task task, Continuation continuation, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        return task.onSuccess(continuation, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task onSuccess$lambda$12(Continuation continuation, Task task) {
        AbstractC2855l.g(task, "task");
        return task.isCancelled() ? INSTANCE.cancelled() : task.isFaulted() ? INSTANCE.forError(task.getError()) : continueWith$default(task, continuation, null, 2, null);
    }

    public static /* synthetic */ Task onSuccessTask$default(Task task, Continuation continuation, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        return task.onSuccessTask(continuation, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task onSuccessTask$lambda$13(Continuation continuation, Task task) {
        AbstractC2855l.g(task, "task");
        return task.isCancelled() ? INSTANCE.cancelled() : task.isFaulted() ? INSTANCE.forError(task.getError()) : continueWithTask$default(task, continuation, null, 2, null);
    }

    private final void runContinuations() {
        synchronized (this.lock) {
            Iterator<Continuation<TResult, C2735B>> it = this.continuations.iterator();
            while (it.hasNext()) {
                try {
                    it.next().then(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.continuations.clear();
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        AbstractC2855l.g(continuation, "continuation");
        return continueWith$default(this, continuation, null, 2, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        AbstractC2855l.g(continuation, "continuation");
        return continueWithTask$default(this, continuation, null, 2, null);
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            exc = this.error;
        }
        return exc;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isCancelled() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.cancelled;
        }
        return z10;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isCompleted() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.complete;
        }
        return z10;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isFaulted() {
        boolean z10;
        synchronized (this.lock) {
            z10 = getError() != null;
        }
        return z10;
    }

    public final Task<Void> makeVoid() {
        return continueWithTask$default(this, new Continuation() { // from class: com.facebook.react.runtime.internal.bolts.a
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return Task.makeVoid$lambda$7(task);
            }
        }, null, 2, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(final Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        AbstractC2855l.g(continuation, "continuation");
        AbstractC2855l.g(executor, "executor");
        return continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.internal.bolts.c
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return Task.onSuccess$lambda$12(continuation, task);
            }
        }, executor);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(final Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        AbstractC2855l.g(continuation, "continuation");
        AbstractC2855l.g(executor, "executor");
        return continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.internal.bolts.e
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return Task.onSuccessTask$lambda$13(continuation, task);
            }
        }, executor);
    }

    public final boolean trySetCancelled$ReactAndroid_release() {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.cancelled = true;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    public final boolean trySetError$ReactAndroid_release(Exception error) {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.error = error;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    public final boolean trySetResult$ReactAndroid_release(TResult result) {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.result = result;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public void waitForCompletion() throws InterruptedException {
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(final Continuation<TResult, TContinuationResult> continuation, final Executor executor) {
        boolean zIsCompleted;
        AbstractC2855l.g(continuation, "continuation");
        AbstractC2855l.g(executor, "executor");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new Continuation() { // from class: com.facebook.react.runtime.internal.bolts.d
                        @Override // com.facebook.react.runtime.internal.bolts.Continuation
                        public final Object then(Task task) {
                            return Task.continueWith$lambda$9$lambda$8(taskCompletionSource, continuation, executor, task);
                        }
                    });
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            INSTANCE.completeImmediately(taskCompletionSource, continuation, this, executor);
        }
        return taskCompletionSource.getTask();
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(final Continuation<TResult, Task<TContinuationResult>> continuation, final Executor executor) {
        boolean zIsCompleted;
        AbstractC2855l.g(continuation, "continuation");
        AbstractC2855l.g(executor, "executor");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new Continuation() { // from class: com.facebook.react.runtime.internal.bolts.b
                        @Override // com.facebook.react.runtime.internal.bolts.Continuation
                        public final Object then(Task task) {
                            return Task.continueWithTask$lambda$11$lambda$10(taskCompletionSource, continuation, executor, task);
                        }
                    });
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            INSTANCE.completeAfterTask(taskCompletionSource, continuation, this, executor);
        }
        return taskCompletionSource.getTask();
    }

    private Task(TResult tresult) {
        trySetResult$ReactAndroid_release(tresult);
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean waitForCompletion(long duration, TimeUnit timeUnit) throws InterruptedException {
        boolean zIsCompleted;
        AbstractC2855l.g(timeUnit, "timeUnit");
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait(timeUnit.toMillis(duration));
                }
                zIsCompleted = isCompleted();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCompleted;
    }

    private Task(boolean z10) {
        if (z10) {
            trySetCancelled$ReactAndroid_release();
        } else {
            trySetResult$ReactAndroid_release(null);
        }
    }
}
