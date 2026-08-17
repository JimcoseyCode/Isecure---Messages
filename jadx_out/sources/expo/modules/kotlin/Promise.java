package expo.modules.kotlin;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.notifications.service.NotificationsService;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0004\u0010\tJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0004\u0010\rJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0004\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0004\u0010\u0011J\u001f\u0010\u0004\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0016¢\u0006\u0004\b\u0004\u0010\u0013J%\u0010\u0004\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0016¢\u0006\u0004\b\u0004\u0010\u0015J+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/Promise;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "resolve", "(Ljava/lang/Object;)V", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "result", "(I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(D)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(F)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/util/Collection;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/util/Map;)V", "code", "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lexpo/modules/kotlin/exception/CodedException;", NotificationsService.EXCEPTION_KEY, "(Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Promise {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void reject(Promise promise, CodedException exception) {
            AbstractC2855l.g(exception, "exception");
            promise.reject(exception.getCode(), exception.getLocalizedMessage(), exception.getCause());
        }

        public static void resolve(Promise promise) {
            promise.resolve((Object) null);
        }

        public static void resolve(Promise promise, int i10) {
            promise.resolve(Integer.valueOf(i10));
        }

        public static void resolve(Promise promise, boolean z10) {
            promise.resolve(Boolean.valueOf(z10));
        }

        public static void resolve(Promise promise, double d10) {
            promise.resolve(Double.valueOf(d10));
        }

        public static void resolve(Promise promise, float f10) {
            promise.resolve(Float.valueOf(f10));
        }

        public static void resolve(Promise promise, String result) {
            AbstractC2855l.g(result, "result");
            promise.resolve((Object) result);
        }

        public static void resolve(Promise promise, Collection<? extends Object> result) {
            AbstractC2855l.g(result, "result");
            promise.resolve((Object) result);
        }

        public static void resolve(Promise promise, Map<String, ? extends Object> result) {
            AbstractC2855l.g(result, "result");
            promise.resolve((Object) result);
        }
    }

    void reject(CodedException exception);

    void reject(String code, String message, Throwable cause);

    void resolve();

    void resolve(double result);

    void resolve(float result);

    void resolve(int result);

    void resolve(Object value);

    void resolve(String result);

    void resolve(Collection<? extends Object> result);

    void resolve(Map<String, ? extends Object> result);

    void resolve(boolean result);
}
