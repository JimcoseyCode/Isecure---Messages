package expo.modules.kotlin.sharedobjects;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.runtime.Runtime;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRef;", "RefType", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "ref", "runtime", "Lexpo/modules/kotlin/runtime/Runtime;", "<init>", "(Ljava/lang/Object;Lexpo/modules/kotlin/runtime/Runtime;)V", "appContext", "Lexpo/modules/kotlin/AppContext;", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)V", "getRef", "()Ljava/lang/Object;", "Ljava/lang/Object;", "nativeRefType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeRefType", "()Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public class SharedRef<RefType> extends SharedObject {
    private final String nativeRefType;
    private final RefType ref;

    public /* synthetic */ SharedRef(Object obj, Runtime runtime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : runtime);
    }

    public String getNativeRefType() {
        return this.nativeRefType;
    }

    public final RefType getRef() {
        return this.ref;
    }

    public SharedRef(RefType reftype, Runtime runtime) {
        super(runtime);
        this.ref = reftype;
        this.nativeRefType = "unknown";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedRef(RefType reftype, AppContext appContext) {
        this(reftype, appContext.getRuntime());
        AbstractC2855l.g(appContext, "appContext");
    }
}
