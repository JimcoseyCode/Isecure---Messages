package i7;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: i7.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2736C implements Lazy, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC3487a f28705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f28706h;

    public C2736C(InterfaceC3487a initializer) {
        AbstractC2855l.g(initializer, "initializer");
        this.f28705g = initializer;
        this.f28706h = y.f28741a;
    }

    private final Object writeReplace() {
        return new C2741d(getValue());
    }

    @Override // kotlin.Lazy
    public boolean e() {
        return this.f28706h != y.f28741a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        if (this.f28706h == y.f28741a) {
            InterfaceC3487a interfaceC3487a = this.f28705g;
            AbstractC2855l.d(interfaceC3487a);
            this.f28706h = interfaceC3487a.invoke();
            this.f28705g = null;
        }
        return this.f28706h;
    }

    public String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
