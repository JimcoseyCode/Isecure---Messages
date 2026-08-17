package expo.modules.kotlin;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/KPromiseWrapper;", "Lexpo/modules/kotlin/Promise;", "Lcom/facebook/react/bridge/Promise;", "bridgePromise", "<init>", "(Lcom/facebook/react/bridge/Promise;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "resolve", "(Ljava/lang/Object;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "code", "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/facebook/react/bridge/Promise;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KPromiseWrapper implements Promise {
    private final com.facebook.react.bridge.Promise bridgePromise;

    public KPromiseWrapper(com.facebook.react.bridge.Promise bridgePromise) {
        AbstractC2855l.g(bridgePromise, "bridgePromise");
        this.bridgePromise = bridgePromise;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(CodedException codedException) {
        Promise.DefaultImpls.reject(this, codedException);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve() {
        Promise.DefaultImpls.resolve(this);
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(String code, String message, Throwable cause) {
        AbstractC2855l.g(code, "code");
        this.bridgePromise.reject(code, message, cause);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(double d10) {
        Promise.DefaultImpls.resolve(this, d10);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(float f10) {
        Promise.DefaultImpls.resolve((Promise) this, f10);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(int i10) {
        Promise.DefaultImpls.resolve((Promise) this, i10);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(String str) {
        Promise.DefaultImpls.resolve(this, str);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Collection<? extends Object> collection) {
        Promise.DefaultImpls.resolve(this, collection);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Map<String, ? extends Object> map) {
        Promise.DefaultImpls.resolve(this, map);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(boolean z10) {
        Promise.DefaultImpls.resolve(this, z10);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Object value) {
        this.bridgePromise.resolve(JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, value, null, false, 6, null));
    }
}
