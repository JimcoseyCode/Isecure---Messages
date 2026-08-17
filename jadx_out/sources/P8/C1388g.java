package P8;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: P8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1388g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f8880d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C1388g f8881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1388g f8882f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f8884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f8885c;

    /* JADX INFO: renamed from: P8.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C0096a f8886j = new C0096a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f8887k = new a(ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, "  ", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f8891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f8892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f8893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f8894g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f8895h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f8896i;

        /* JADX INFO: renamed from: P8.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0096a {
            public /* synthetic */ C0096a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f8887k;
            }

            private C0096a() {
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            AbstractC2855l.g(groupSeparator, "groupSeparator");
            AbstractC2855l.g(byteSeparator, "byteSeparator");
            AbstractC2855l.g(bytePrefix, "bytePrefix");
            AbstractC2855l.g(byteSuffix, "byteSuffix");
            this.f8888a = i10;
            this.f8889b = i11;
            this.f8890c = groupSeparator;
            this.f8891d = byteSeparator;
            this.f8892e = bytePrefix;
            this.f8893f = byteSuffix;
            this.f8894g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f8895h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f8896i = h.b(groupSeparator) || h.b(byteSeparator) || h.b(bytePrefix) || h.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb, String indent) {
            AbstractC2855l.g(sb, "sb");
            AbstractC2855l.g(indent, "indent");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.f8888a);
            sb.append(",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.f8889b);
            sb.append(",");
            sb.append('\n');
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.f8890c);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.f8891d);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.f8892e);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.f8893f);
            sb.append("\"");
            return sb;
        }

        public final String c() {
            return this.f8892e;
        }

        public final String d() {
            return this.f8891d;
        }

        public final String e() {
            return this.f8893f;
        }

        public final int f() {
            return this.f8889b;
        }

        public final int g() {
            return this.f8888a;
        }

        public final String h() {
            return this.f8890c;
        }

        public final boolean i() {
            return this.f8896i;
        }

        public final boolean j() {
            return this.f8894g;
        }

        public final boolean k() {
            return this.f8895h;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append('\n');
            b(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: P8.g$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1388g a() {
            return C1388g.f8881e;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: P8.g$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f8897h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f8898i = new c(PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f8901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f8902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f8903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f8904f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f8905g;

        /* JADX INFO: renamed from: P8.g$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f8898i;
            }

            private a() {
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            AbstractC2855l.g(prefix, "prefix");
            AbstractC2855l.g(suffix, "suffix");
            this.f8899a = prefix;
            this.f8900b = suffix;
            this.f8901c = z10;
            this.f8902d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f8903e = z11;
            this.f8904f = z11 && i10 == 1;
            this.f8905g = h.b(prefix) || h.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb, String indent) {
            AbstractC2855l.g(sb, "sb");
            AbstractC2855l.g(indent, "indent");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.f8899a);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.f8900b);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f8901c);
            sb.append(',');
            sb.append('\n');
            sb.append(indent);
            sb.append("minLength = ");
            sb.append(this.f8902d);
            return sb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append('\n');
            b(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        a.C0096a c0096a = a.f8886j;
        a aVarA = c0096a.a();
        c.a aVar = c.f8897h;
        f8881e = new C1388g(false, aVarA, aVar.a());
        f8882f = new C1388g(true, c0096a.a(), aVar.a());
    }

    public C1388g(boolean z10, a bytes, c number) {
        AbstractC2855l.g(bytes, "bytes");
        AbstractC2855l.g(number, "number");
        this.f8883a = z10;
        this.f8884b = bytes;
        this.f8885c = number;
    }

    public final a b() {
        return this.f8884b;
    }

    public final boolean c() {
        return this.f8883a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        sb.append('\n');
        sb.append("    upperCase = ");
        sb.append(this.f8883a);
        sb.append(",");
        sb.append('\n');
        sb.append("    bytes = BytesHexFormat(");
        sb.append('\n');
        this.f8884b.b(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f8885c.b(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
