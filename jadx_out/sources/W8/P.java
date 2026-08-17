package W8;

import R8.U0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n7.j f12166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f12167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U0[] f12168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12169d;

    public P(n7.j jVar, int i10) {
        this.f12166a = jVar;
        this.f12167b = new Object[i10];
        this.f12168c = new U0[i10];
    }

    public final void a(U0 u02, Object obj) {
        Object[] objArr = this.f12167b;
        int i10 = this.f12169d;
        objArr[i10] = obj;
        U0[] u0Arr = this.f12168c;
        this.f12169d = i10 + 1;
        AbstractC2855l.e(u02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        u0Arr[i10] = u02;
    }

    public final void b(n7.j jVar) {
        int length = this.f12168c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            U0 u02 = this.f12168c[length];
            AbstractC2855l.d(u02);
            u02.s(jVar, this.f12167b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
