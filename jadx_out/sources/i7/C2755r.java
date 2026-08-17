package i7;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: i7.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2755r implements Lazy, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC3487a f28729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Object f28730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f28731i;

    public C2755r(InterfaceC3487a initializer, Object obj) {
        AbstractC2855l.g(initializer, "initializer");
        this.f28729g = initializer;
        this.f28730h = y.f28741a;
        this.f28731i = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C2741d(getValue());
    }

    @Override // kotlin.Lazy
    public boolean e() {
        return this.f28730h != y.f28741a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f28730h;
        y yVar = y.f28741a;
        if (obj != yVar) {
            return obj;
        }
        synchronized (this.f28731i) {
            objInvoke = this.f28730h;
            if (objInvoke == yVar) {
                InterfaceC3487a interfaceC3487a = this.f28729g;
                AbstractC2855l.d(interfaceC3487a);
                objInvoke = interfaceC3487a.invoke();
                this.f28730h = objInvoke;
                this.f28729g = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C2755r(InterfaceC3487a interfaceC3487a, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3487a, (i10 & 2) != 0 ? null : obj);
    }
}
