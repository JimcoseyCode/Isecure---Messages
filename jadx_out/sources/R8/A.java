package R8;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1419l f10108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w7.o f10109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f10111e;

    public A(Object obj, InterfaceC1419l interfaceC1419l, w7.o oVar, Object obj2, Throwable th) {
        this.f10107a = obj;
        this.f10108b = interfaceC1419l;
        this.f10109c = oVar;
        this.f10110d = obj2;
        this.f10111e = th;
    }

    public static /* synthetic */ A b(A a10, Object obj, InterfaceC1419l interfaceC1419l, w7.o oVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = a10.f10107a;
        }
        if ((i10 & 2) != 0) {
            interfaceC1419l = a10.f10108b;
        }
        if ((i10 & 4) != 0) {
            oVar = a10.f10109c;
        }
        if ((i10 & 8) != 0) {
            obj2 = a10.f10110d;
        }
        if ((i10 & 16) != 0) {
            th = a10.f10111e;
        }
        Throwable th2 = th;
        w7.o oVar2 = oVar;
        return a10.a(obj, interfaceC1419l, oVar2, obj2, th2);
    }

    public final A a(Object obj, InterfaceC1419l interfaceC1419l, w7.o oVar, Object obj2, Throwable th) {
        return new A(obj, interfaceC1419l, oVar, obj2, th);
    }

    public final boolean c() {
        return this.f10111e != null;
    }

    public final void d(C1425o c1425o, Throwable th) {
        InterfaceC1419l interfaceC1419l = this.f10108b;
        if (interfaceC1419l != null) {
            c1425o.p(interfaceC1419l, th);
        }
        w7.o oVar = this.f10109c;
        if (oVar != null) {
            c1425o.r(oVar, th, this.f10107a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return AbstractC2855l.b(this.f10107a, a10.f10107a) && AbstractC2855l.b(this.f10108b, a10.f10108b) && AbstractC2855l.b(this.f10109c, a10.f10109c) && AbstractC2855l.b(this.f10110d, a10.f10110d) && AbstractC2855l.b(this.f10111e, a10.f10111e);
    }

    public int hashCode() {
        Object obj = this.f10107a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1419l interfaceC1419l = this.f10108b;
        int iHashCode2 = (iHashCode + (interfaceC1419l == null ? 0 : interfaceC1419l.hashCode())) * 31;
        w7.o oVar = this.f10109c;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Object obj2 = this.f10110d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f10111e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f10107a + ", cancelHandler=" + this.f10108b + ", onCancellation=" + this.f10109c + ", idempotentResume=" + this.f10110d + ", cancelCause=" + this.f10111e + ')';
    }

    public /* synthetic */ A(Object obj, InterfaceC1419l interfaceC1419l, w7.o oVar, Object obj2, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC1419l, (i10 & 4) != 0 ? null : oVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
