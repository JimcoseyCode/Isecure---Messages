package I5;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f4998p = new C0054a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f5002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f5003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f5005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f5006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f5007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f5008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f5009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f5010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f5011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f5012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f5013o;

    /* JADX INFO: renamed from: I5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0054a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f5014a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5015b = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5016c = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f5017d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f5018e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f5019f = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f5020g = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f5021h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f5022i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f5023j = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f5024k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f5025l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f5026m = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f5027n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f5028o = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        C0054a() {
        }

        public a a() {
            return new a(this.f5014a, this.f5015b, this.f5016c, this.f5017d, this.f5018e, this.f5019f, this.f5020g, this.f5021h, this.f5022i, this.f5023j, this.f5024k, this.f5025l, this.f5026m, this.f5027n, this.f5028o);
        }

        public C0054a b(String str) {
            this.f5026m = str;
            return this;
        }

        public C0054a c(String str) {
            this.f5020g = str;
            return this;
        }

        public C0054a d(String str) {
            this.f5028o = str;
            return this;
        }

        public C0054a e(b bVar) {
            this.f5025l = bVar;
            return this;
        }

        public C0054a f(String str) {
            this.f5016c = str;
            return this;
        }

        public C0054a g(String str) {
            this.f5015b = str;
            return this;
        }

        public C0054a h(c cVar) {
            this.f5017d = cVar;
            return this;
        }

        public C0054a i(String str) {
            this.f5019f = str;
            return this;
        }

        public C0054a j(int i10) {
            this.f5021h = i10;
            return this;
        }

        public C0054a k(long j10) {
            this.f5014a = j10;
            return this;
        }

        public C0054a l(d dVar) {
            this.f5018e = dVar;
            return this;
        }

        public C0054a m(String str) {
            this.f5023j = str;
            return this;
        }

        public C0054a n(int i10) {
            this.f5022i = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum b implements y5.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f5033g;

        b(int i10) {
            this.f5033g = i10;
        }

        @Override // y5.c
        public int a() {
            return this.f5033g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c implements y5.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f5039g;

        c(int i10) {
            this.f5039g = i10;
        }

        @Override // y5.c
        public int a() {
            return this.f5039g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum d implements y5.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f5045g;

        d(int i10) {
            this.f5045g = i10;
        }

        @Override // y5.c
        public int a() {
            return this.f5045g;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f4999a = j10;
        this.f5000b = str;
        this.f5001c = str2;
        this.f5002d = cVar;
        this.f5003e = dVar;
        this.f5004f = str3;
        this.f5005g = str4;
        this.f5006h = i10;
        this.f5007i = i11;
        this.f5008j = str5;
        this.f5009k = j11;
        this.f5010l = bVar;
        this.f5011m = str6;
        this.f5012n = j12;
        this.f5013o = str7;
    }

    public static C0054a p() {
        return new C0054a();
    }

    public String a() {
        return this.f5011m;
    }

    public long b() {
        return this.f5009k;
    }

    public long c() {
        return this.f5012n;
    }

    public String d() {
        return this.f5005g;
    }

    public String e() {
        return this.f5013o;
    }

    public b f() {
        return this.f5010l;
    }

    public String g() {
        return this.f5001c;
    }

    public String h() {
        return this.f5000b;
    }

    public c i() {
        return this.f5002d;
    }

    public String j() {
        return this.f5004f;
    }

    public int k() {
        return this.f5006h;
    }

    public long l() {
        return this.f4999a;
    }

    public d m() {
        return this.f5003e;
    }

    public String n() {
        return this.f5008j;
    }

    public int o() {
        return this.f5007i;
    }
}
