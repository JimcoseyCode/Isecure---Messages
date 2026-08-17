package R8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10114b = AtomicIntegerFieldUpdater.newUpdater(B.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f10115a;

    public B(Throwable th, boolean z10) {
        this.f10115a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f10114b.get(this) == 1;
    }

    public final boolean c() {
        return f10114b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return S.a(this) + '[' + this.f10115a + ']';
    }

    public /* synthetic */ B(Throwable th, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
