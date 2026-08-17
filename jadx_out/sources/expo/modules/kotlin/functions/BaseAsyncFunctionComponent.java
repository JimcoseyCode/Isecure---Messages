package expo.modules.kotlin.functions;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.types.AnyType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR\"\u0010\n\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AnyFunction;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V", "Lexpo/modules/kotlin/functions/Queues;", "queue", "runOnQueue", "(Lexpo/modules/kotlin/functions/Queues;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "LR8/N;", PermissionsResponse.SCOPE_KEY, "(LR8/N;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/FunctionQueue;", "Lexpo/modules/kotlin/functions/FunctionQueue;", "getQueue", "()Lexpo/modules/kotlin/functions/FunctionQueue;", "setQueue", "(Lexpo/modules/kotlin/functions/FunctionQueue;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseAsyncFunctionComponent extends AnyFunction {
    private FunctionQueue queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAsyncFunctionComponent(String name, AnyType[] desiredArgsTypes) {
        super(name, desiredArgsTypes);
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(desiredArgsTypes, "desiredArgsTypes");
        this.queue = Queues.DEFAULT;
    }

    protected final FunctionQueue getQueue() {
        return this.queue;
    }

    public final BaseAsyncFunctionComponent runOnQueue(Queues queue) {
        AbstractC2855l.g(queue, "queue");
        this.queue = queue;
        return this;
    }

    protected final void setQueue(FunctionQueue functionQueue) {
        AbstractC2855l.g(functionQueue, "<set-?>");
        this.queue = functionQueue;
    }

    public final BaseAsyncFunctionComponent runOnQueue(N scope) {
        AbstractC2855l.g(scope, "scope");
        this.queue = new CustomQueue(scope);
        return this;
    }
}
