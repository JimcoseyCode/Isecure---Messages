package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2102a1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC2102a1 f22327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC2102a1 f22328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC2102a1 f22329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC2102a1 f22330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC2102a1 f22331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC2102a1 f22332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC2102a1 f22333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2102a1 f22334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC2102a1 f22335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC2102a1 f22336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumC2102a1[] f22337r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f22338g;

    static {
        EnumC2102a1 enumC2102a1 = new EnumC2102a1("VOID", 0, Void.class, Void.class, null);
        f22327h = enumC2102a1;
        Class cls = Integer.TYPE;
        EnumC2102a1 enumC2102a12 = new EnumC2102a1("INT", 1, cls, Integer.class, 0);
        f22328i = enumC2102a12;
        EnumC2102a1 enumC2102a13 = new EnumC2102a1("LONG", 2, Long.TYPE, Long.class, 0L);
        f22329j = enumC2102a13;
        EnumC2102a1 enumC2102a14 = new EnumC2102a1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f22330k = enumC2102a14;
        EnumC2102a1 enumC2102a15 = new EnumC2102a1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f22331l = enumC2102a15;
        EnumC2102a1 enumC2102a16 = new EnumC2102a1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f22332m = enumC2102a16;
        EnumC2102a1 enumC2102a17 = new EnumC2102a1("STRING", 6, String.class, String.class, PointerEventHelper.POINTER_TYPE_UNKNOWN);
        f22333n = enumC2102a17;
        EnumC2102a1 enumC2102a18 = new EnumC2102a1("BYTE_STRING", 7, AbstractC2171o0.class, AbstractC2171o0.class, AbstractC2171o0.f22405h);
        f22334o = enumC2102a18;
        EnumC2102a1 enumC2102a19 = new EnumC2102a1("ENUM", 8, cls, Integer.class, null);
        f22335p = enumC2102a19;
        EnumC2102a1 enumC2102a110 = new EnumC2102a1("MESSAGE", 9, Object.class, Object.class, null);
        f22336q = enumC2102a110;
        f22337r = new EnumC2102a1[]{enumC2102a1, enumC2102a12, enumC2102a13, enumC2102a14, enumC2102a15, enumC2102a16, enumC2102a17, enumC2102a18, enumC2102a19, enumC2102a110};
    }

    private EnumC2102a1(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f22338g = cls2;
    }

    public static EnumC2102a1[] values() {
        return (EnumC2102a1[]) f22337r.clone();
    }

    public final Class h() {
        return this.f22338g;
    }
}
