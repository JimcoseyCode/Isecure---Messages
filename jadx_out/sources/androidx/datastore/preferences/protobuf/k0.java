package androidx.datastore.preferences.protobuf;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f16907a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f16908b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f16909c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f16910d = c(3, 2);

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
        private static final /* synthetic */ b[] f16911A;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f16912i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f16913j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f16914k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f16915l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f16916m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f16917n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f16918o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f16919p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f16920q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f16921r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f16922s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f16923t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f16924u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f16925v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f16926w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f16927x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f16928y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f16929z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c f16930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f16931h;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        enum C0173b extends b {
            C0173b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f16912i = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f16913j = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f16914k = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f16915l = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f16916m = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f16917n = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f16918o = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f16919p = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f16920q = aVar;
            c cVar3 = c.MESSAGE;
            C0173b c0173b = new C0173b("GROUP", 9, cVar3, 3);
            f16921r = c0173b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f16922s = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f16923t = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f16924u = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f16925v = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f16926w = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f16927x = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f16928y = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f16929z = bVar14;
            f16911A = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0173b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f16911A.clone();
        }

        public c h() {
            return this.f16930g;
        }

        public int j() {
            return this.f16931h;
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f16930g = cVar;
            this.f16931h = i11;
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
        BYTE_STRING(AbstractC1713f.f16826h),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f16942g;

        c(Object obj) {
            this.f16942g = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
