package n7;

import i7.C2752o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;
import o7.EnumC3015a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements f, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f30069h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30070i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "result");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f30071g;
    private volatile Object result;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(f delegate, Object obj) {
        AbstractC2855l.g(delegate, "delegate");
        this.f30071g = delegate;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        EnumC3015a enumC3015a = EnumC3015a.f30500h;
        if (obj == enumC3015a) {
            if (androidx.concurrent.futures.b.a(f30070i, this, enumC3015a, AbstractC3016b.e())) {
                return AbstractC3016b.e();
            }
            obj = this.result;
        }
        if (obj == EnumC3015a.f30501i) {
            return AbstractC3016b.e();
        }
        if (obj instanceof C2752o.b) {
            throw ((C2752o.b) obj).f28723g;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        f fVar = this.f30071g;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // n7.f
    public j getContext() {
        return this.f30071g.getContext();
    }

    @Override // n7.f
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC3015a enumC3015a = EnumC3015a.f30500h;
            if (obj2 == enumC3015a) {
                if (androidx.concurrent.futures.b.a(f30070i, this, enumC3015a, obj)) {
                    return;
                }
            } else {
                if (obj2 != AbstractC3016b.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f30070i, this, AbstractC3016b.e(), EnumC3015a.f30501i)) {
                    this.f30071g.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f30071g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(f delegate) {
        this(delegate, EnumC3015a.f30500h);
        AbstractC2855l.g(delegate, "delegate");
    }
}
