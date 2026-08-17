package l9;

import e9.t;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0310a f29463c = new C0310a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f29465b;

    /* JADX INFO: renamed from: l9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0310a {
        private C0310a() {
        }

        public /* synthetic */ C0310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(j source) {
        AbstractC2855l.g(source, "source");
        this.f29465b = source;
        this.f29464a = 262144;
    }

    public final t a() {
        t.a aVar = new t.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.e();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String strP = this.f29465b.P(this.f29464a);
        this.f29464a -= (long) strP.length();
        return strP;
    }
}
