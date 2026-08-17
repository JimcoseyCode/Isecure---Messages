package W8;

import a.C1587a;
import i7.AbstractC2753p;
import i7.C2752o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f12155a = new C1587a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12157c;

    static {
        Object objB;
        Object objB2;
        try {
            C2752o.a aVar = C2752o.f28721h;
            objB = C2752o.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        if (C2752o.d(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f12156b = (String) objB;
        try {
            objB2 = C2752o.b(D.class.getCanonicalName());
        } catch (Throwable th2) {
            C2752o.a aVar3 = C2752o.f28721h;
            objB2 = C2752o.b(AbstractC2753p.a(th2));
        }
        if (C2752o.d(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f12157c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
