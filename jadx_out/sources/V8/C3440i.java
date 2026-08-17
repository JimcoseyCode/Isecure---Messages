package v8;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: v8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3440i extends AbstractC3432a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.i f32991b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3440i(InterfaceC3487a getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        AbstractC2855l.g(getScope, "getScope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3442k k(InterfaceC3487a interfaceC3487a) {
        InterfaceC3442k interfaceC3442k = (InterfaceC3442k) interfaceC3487a.invoke();
        return interfaceC3442k instanceof AbstractC3432a ? ((AbstractC3432a) interfaceC3442k).h() : interfaceC3442k;
    }

    @Override // v8.AbstractC3432a
    protected InterfaceC3442k i() {
        return (InterfaceC3442k) this.f32991b.invoke();
    }

    public /* synthetic */ C3440i(B8.n nVar, InterfaceC3487a interfaceC3487a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? B8.f.f411e : nVar, interfaceC3487a);
    }

    public C3440i(B8.n storageManager, InterfaceC3487a getScope) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(getScope, "getScope");
        this.f32991b = storageManager.e(new C3439h(getScope));
    }
}
