package m8;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f29741a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f29742b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f29743c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f29744d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'k' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private static final /* synthetic */ b[] f29745A;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f29746i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f29747j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f29748k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f29749l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f29750m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f29751n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f29752o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f29753p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f29754q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f29755r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f29756s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f29757t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f29758u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f29759v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f29760w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f29761x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f29762y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f29763z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c f29764g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f29765h;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // m8.y.b
            public boolean k() {
                return false;
            }
        }

        /* JADX INFO: renamed from: m8.y$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        enum C0321b extends b {
            C0321b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // m8.y.b
            public boolean k() {
                return false;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // m8.y.b
            public boolean k() {
                return false;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // m8.y.b
            public boolean k() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f29746i = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f29747j = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f29748k = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f29749l = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f29750m = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f29751n = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f29752o = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f29753p = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f29754q = aVar;
            c cVar3 = c.MESSAGE;
            C0321b c0321b = new C0321b("GROUP", 9, cVar3, 3);
            f29755r = c0321b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f29756s = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f29757t = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f29758u = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f29759v = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f29760w = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f29761x = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f29762y = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f29763z = bVar14;
            f29745A = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0321b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f29745A.clone();
        }

        public c h() {
            return this.f29764g;
        }

        public int j() {
            return this.f29765h;
        }

        public boolean k() {
            return true;
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f29764g = cVar;
            this.f29765h = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(PointerEventHelper.POINTER_TYPE_UNKNOWN),
        BYTE_STRING(AbstractC2945d.f29639g),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f29776g;

        c(Object obj) {
            this.f29776g = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
