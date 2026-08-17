package i7;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: i7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2754q implements Lazy, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f28724j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f28725k = AtomicReferenceFieldUpdater.newUpdater(C2754q.class, Object.class, "h");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile InterfaceC3487a f28726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Object f28727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f28728i;

    /* JADX INFO: renamed from: i7.q$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2754q(InterfaceC3487a initializer) {
        AbstractC2855l.g(initializer, "initializer");
        this.f28726g = initializer;
        y yVar = y.f28741a;
        this.f28727h = yVar;
        this.f28728i = yVar;
    }

    private final Object writeReplace() {
        return new C2741d(getValue());
    }

    @Override // kotlin.Lazy
    public boolean e() {
        return this.f28727h != y.f28741a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this.f28727h;
        y yVar = y.f28741a;
        if (obj != yVar) {
            return obj;
        }
        InterfaceC3487a interfaceC3487a = this.f28726g;
        if (interfaceC3487a != null) {
            Object objInvoke = interfaceC3487a.invoke();
            if (androidx.concurrent.futures.b.a(f28725k, this, yVar, objInvoke)) {
                this.f28726g = null;
                return objInvoke;
            }
        }
        return this.f28727h;
    }

    public String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
