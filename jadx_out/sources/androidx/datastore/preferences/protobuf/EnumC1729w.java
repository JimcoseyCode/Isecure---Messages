package androidx.datastore.preferences.protobuf;

import com.facebook.react.uimanager.events.PointerEventHelper;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1729w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC1729w f17047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC1729w f17048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC1729w f17049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC1729w f17050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC1729w f17051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1729w f17052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC1729w f17053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1729w f17054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1729w f17055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1729w f17056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ EnumC1729w[] f17057t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f17058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f17059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f17060i;

    static {
        EnumC1729w enumC1729w = new EnumC1729w("VOID", 0, Void.class, Void.class, null);
        f17047j = enumC1729w;
        Class cls = Integer.TYPE;
        EnumC1729w enumC1729w2 = new EnumC1729w("INT", 1, cls, Integer.class, 0);
        f17048k = enumC1729w2;
        EnumC1729w enumC1729w3 = new EnumC1729w("LONG", 2, Long.TYPE, Long.class, 0L);
        f17049l = enumC1729w3;
        EnumC1729w enumC1729w4 = new EnumC1729w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f17050m = enumC1729w4;
        EnumC1729w enumC1729w5 = new EnumC1729w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f17051n = enumC1729w5;
        EnumC1729w enumC1729w6 = new EnumC1729w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f17052o = enumC1729w6;
        EnumC1729w enumC1729w7 = new EnumC1729w("STRING", 6, String.class, String.class, PointerEventHelper.POINTER_TYPE_UNKNOWN);
        f17053p = enumC1729w7;
        EnumC1729w enumC1729w8 = new EnumC1729w("BYTE_STRING", 7, AbstractC1713f.class, AbstractC1713f.class, AbstractC1713f.f16826h);
        f17054q = enumC1729w8;
        EnumC1729w enumC1729w9 = new EnumC1729w("ENUM", 8, cls, Integer.class, null);
        f17055r = enumC1729w9;
        EnumC1729w enumC1729w10 = new EnumC1729w("MESSAGE", 9, Object.class, Object.class, null);
        f17056s = enumC1729w10;
        f17057t = new EnumC1729w[]{enumC1729w, enumC1729w2, enumC1729w3, enumC1729w4, enumC1729w5, enumC1729w6, enumC1729w7, enumC1729w8, enumC1729w9, enumC1729w10};
    }

    private EnumC1729w(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f17058g = cls;
        this.f17059h = cls2;
        this.f17060i = obj;
    }

    public static EnumC1729w valueOf(String str) {
        return (EnumC1729w) Enum.valueOf(EnumC1729w.class, str);
    }

    public static EnumC1729w[] values() {
        return (EnumC1729w[]) f17057t.clone();
    }

    public Class h() {
        return this.f17059h;
    }
}
