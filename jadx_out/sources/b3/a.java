package B3;

import com.facebook.systrace.TraceListener;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f348a = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: B3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class EnumC0014a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final EnumC0014a f349h = new EnumC0014a("THREAD", 0, 't');

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final EnumC0014a f350i = new EnumC0014a("PROCESS", 1, 'p');

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final EnumC0014a f351j = new EnumC0014a("GLOBAL", 2, 'g');

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumC0014a[] f352k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f353l;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final char f354g;

        static {
            EnumC0014a[] enumC0014aArrH = h();
            f352k = enumC0014aArrH;
            f353l = AbstractC3083a.a(enumC0014aArrH);
        }

        private EnumC0014a(String str, int i10, char c10) {
            this.f354g = c10;
        }

        private static final /* synthetic */ EnumC0014a[] h() {
            return new EnumC0014a[]{f349h, f350i, f351j};
        }

        public static EnumC0014a valueOf(String str) {
            return (EnumC0014a) Enum.valueOf(EnumC0014a.class, str);
        }

        public static EnumC0014a[] values() {
            return (EnumC0014a[]) f352k.clone();
        }
    }

    private a() {
    }

    public static final void a(long j10, String sectionName, int i10) {
        AbstractC2855l.g(sectionName, "sectionName");
        AbstractC2861a.a(sectionName, i10);
    }

    public static final void b(long j10, String sectionName, int i10, long j11) {
        AbstractC2855l.g(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void c(long j10, String sectionName) {
        AbstractC2855l.g(sectionName, "sectionName");
        AbstractC2861a.c(sectionName);
    }

    public static final void d(long j10, String sectionName, String[] args, int i10) {
        AbstractC2855l.g(sectionName, "sectionName");
        AbstractC2855l.g(args, "args");
        AbstractC2861a.c(sectionName + "|" + f348a.e(args, i10));
    }

    private final String e(String[] strArr, int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 1; i11 < i10; i11 += 2) {
            String str = strArr[i11 - 1];
            String str2 = strArr[i11];
            sb.append(str);
            sb.append('=');
            sb.append(str2);
            if (i11 < i10 - 1) {
                sb.append(';');
            }
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public static final void f(long j10, String sectionName, int i10) {
        AbstractC2855l.g(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void g(long j10, String sectionName, int i10) {
        AbstractC2855l.g(sectionName, "sectionName");
        AbstractC2861a.d(sectionName, i10);
    }

    public static final void h(long j10, String sectionName, int i10, long j11) {
        AbstractC2855l.g(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void i(long j10) {
        AbstractC2861a.f();
    }

    public static final boolean j(long j10) {
        return false;
    }

    public static final void l(long j10, String sectionName, int i10) {
        AbstractC2855l.g(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void m(long j10, String counterName, int i10) {
        AbstractC2855l.g(counterName, "counterName");
        AbstractC2861a.j(counterName, i10);
    }

    public static final void o(long j10, String sectionName, Runnable block) {
        AbstractC2855l.g(sectionName, "sectionName");
        AbstractC2855l.g(block, "block");
        c(j10, sectionName);
        try {
            block.run();
        } finally {
            i(j10);
        }
    }

    public static final void k(TraceListener traceListener) {
    }

    public static final void p(TraceListener traceListener) {
    }

    public static final void n(long j10, String str, EnumC0014a enumC0014a) {
    }
}
