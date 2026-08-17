package expo.modules.kotlin.functions;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/functions/CustomQueue;", "Lexpo/modules/kotlin/functions/FunctionQueue;", "LR8/N;", PermissionsResponse.SCOPE_KEY, "<init>", "(LR8/N;)V", "component1", "()LR8/N;", "copy", "(LR8/N;)Lexpo/modules/kotlin/functions/CustomQueue;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "LR8/N;", "getScope", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CustomQueue implements FunctionQueue {
    private final N scope;

    public CustomQueue(N scope) {
        AbstractC2855l.g(scope, "scope");
        this.scope = scope;
    }

    public static /* synthetic */ CustomQueue copy$default(CustomQueue customQueue, N n10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = customQueue.scope;
        }
        return customQueue.copy(n10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final N getScope() {
        return this.scope;
    }

    public final CustomQueue copy(N scope) {
        AbstractC2855l.g(scope, "scope");
        return new CustomQueue(scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomQueue) && AbstractC2855l.b(this.scope, ((CustomQueue) other).scope);
    }

    public final N getScope() {
        return this.scope;
    }

    public int hashCode() {
        return this.scope.hashCode();
    }

    public String toString() {
        return "CustomQueue(scope=" + this.scope + ")";
    }
}
